package typings.sawtoothSdk

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("sawtooth-sdk/signing/core", "Context")
  @js.native
  abstract class Context () extends StObject {
    
    /**
      * Returns the algorithm name used for this context.
      */
    def getAlgorithmName(): String = js.native
    
    /**
      * Produce a public key for the given private key.
      *
      * @param privateKey - a private key
      */
    def getPublicKey(privateKey: PrivateKey): PublicKey = js.native
    
    /**
      * Generate a new random private key, based on the underlying algorithm.
      *
      */
    def newRandomPrivateKey(): PrivateKey = js.native
    
    /**
      * Sign a message.
      *
      * Given a private key for this algorithm, sign the given message bytes
      * and return a hex-encoded string of the resulting signature.
      *
      * @param message - the message bytes
      * @param privateKey - the private key
      * @returns - The signature in a hex-encoded string
      * @throws {SigningError} - if any error occurs during the signing process
      */
    def sign(message: Buffer, privateKey: PrivateKey): String = js.native
    
    /**
      * Verifies that a signature of a message was produced with the associated
      * public key.
      *
      * @param signature - the hex-encoded signature
      * @param message - the message bytes
      * @param publicKey - the public key to use for verification
      * @returns - true if the public key is associated with the
      * signature for that method, false otherwise
      */
    def verify(signature: String, message: Buffer, publicKey: PublicKey): Boolean = js.native
  }
  
  @JSImport("sawtooth-sdk/signing/core", "NoSuchAlgorithmError")
  @js.native
  class NoSuchAlgorithmError () extends StObject {
    def this(message: String) = this()
    
    /**
      * Name of the rror
      */
    var name: String = js.native
  }
  
  @JSImport("sawtooth-sdk/signing/core", "ParseError")
  @js.native
  class ParseError () extends StObject {
    def this(message: String) = this()
    
    /**
      * Name of the error
      */
    var name: String = js.native
  }
  
  @JSImport("sawtooth-sdk/signing/core", "PrivateKey")
  @js.native
  abstract class PrivateKey () extends StObject {
    
    /**
      * Returns the public key bytes in a Buffer.
      */
    def asBytes(): Buffer = js.native
    
    /**
      * Return the public key encoded as a hex string
      */
    def asHex(): String = js.native
    
    /**
      * Returns the algorithm name used for this public key.
      */
    def getAlgorithmName(): String = js.native
  }
  
  @JSImport("sawtooth-sdk/signing/core", "PublicKey")
  @js.native
  abstract class PublicKey () extends StObject {
    
    /**
      * Returns the public key bytes in a Buffer.
      */
    def asBytes(): Buffer = js.native
    
    /**
      * Return the public key encoded as a hex string
      */
    def asHex(): String = js.native
    
    /**
      * Returns the algorithm name used for this public key.
      */
    def getAlgorithmName(): String = js.native
  }
  
  @JSImport("sawtooth-sdk/signing/core", "SigningError")
  @js.native
  class SigningError () extends StObject {
    def this(message: String) = this()
    
    /**
      * Name of the error
      */
    var name: String = js.native
  }
}
