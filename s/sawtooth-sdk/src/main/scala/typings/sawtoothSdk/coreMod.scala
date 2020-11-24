package typings.sawtoothSdk

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/signing/core", JSImport.Namespace)
@js.native
object coreMod extends js.Object {
  
  @js.native
  abstract class Context () extends js.Object {
    
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
  
  @js.native
  class NoSuchAlgorithmError () extends js.Object {
    def this(message: String) = this()
    
    /**
      * Name of the rror
      */
    var name: String = js.native
  }
  
  @js.native
  class ParseError () extends js.Object {
    def this(message: String) = this()
    
    /**
      * Name of the error
      */
    var name: String = js.native
  }
  
  @js.native
  abstract class PrivateKey () extends js.Object {
    
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
  
  @js.native
  abstract class PublicKey () extends js.Object {
    
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
  
  @js.native
  class SigningError () extends js.Object {
    def this(message: String) = this()
    
    /**
      * Name of the error
      */
    var name: String = js.native
  }
}
