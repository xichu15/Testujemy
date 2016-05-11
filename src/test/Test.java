/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NP550P5C-SO4PL
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            String text = "admin";
            md.update(text.getBytes("UTF-8")); // Change this to "UTF-16" if needed
            byte[] digest = md.digest();
            BigInteger bigInt = new BigInteger(1, digest);
            String output = bigInt.toString(16);
            System.out.println("Eheheheh dla mnie masz stajnia!");

            System.out.println(output);
            System.out.println(output);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            
        }
        System.out.println("Krzysiu to fajny chlopak!");
        
    }
}
