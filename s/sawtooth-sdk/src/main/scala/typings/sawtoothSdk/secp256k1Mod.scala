package typings.sawtoothSdk

import typings.node.Buffer
import typings.sawtoothSdk.coreMod.Context
import typings.sawtoothSdk.coreMod.PrivateKey
import typings.sawtoothSdk.coreMod.PublicKey
import typings.sawtoothSdk.signingMod.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/signing/secp256k1", JSImport.Namespace)
@js.native
object secp256k1Mod extends js.Object {
  @js.native
  class Secp256k1Context () extends Context {
    /**
      * Return a computed Secp256k1PublicKey from a Secp256k1PrivateKey.
      * @param privateKey
      */
    def getPublicKey(privateKey: Secp256k1PrivateKey): Secp256k1PublicKey = js.native
    /**
      * Sign a given message with the provided PublicKey
      *
      * @param message
      * @param privateKey
      * @return string of the signed message
      */
    def sign(message: message, privateKey: Secp256k1PrivateKey): String = js.native
    /**
      * Verify that the signature of a given messages was signed by the proved Secp256k1PublicKey
      *
      * @param signature
      * @param message
      * @param publicKey
      * @return result of verifying if the signature matches the Secp256k1PublicKey
      */
    def verify(signature: String, message: message, publicKey: Secp256k1PublicKey): Boolean = js.native
  }
  
  @js.native
  class Secp256k1PrivateKey protected () extends PrivateKey {
    def this(privateKeyBytes: Buffer) = this()
    /** The bytes of the public key */
    var privateKeyBytes: Buffer = js.native
  }
  
  @js.native
  class Secp256k1PublicKey protected () extends PublicKey {
    def this(publicKeyBytes: Buffer) = this()
    /** The bytes of the public key */
    var publicKeyBytes: Buffer = js.native
  }
  
  /* static members */
  @js.native
  object Secp256k1PrivateKey extends js.Object {
    /**
      * Creates a private key from a hex encode set of bytes.
      *
      * @param privateKeyHex - the key in hex
      * @return a private key instance
      * @throws if the private key is not valid
      */
    def fromHex(privateKeyHex: String): Secp256k1PrivateKey = js.native
    /**
      * @return generates a random PrivateKey
      *
      */
    def newRandom(): Secp256k1PrivateKey = js.native
  }
  
  /* static members */
  @js.native
  object Secp256k1PublicKey extends js.Object {
    /**
      * Creates a public key from a hex encode set of bytes.
      *
      * @param publicKeyHex - the key in hex
      * @return a public key instance
      * @throws if the public key is not valid
      */
    def fromHex(publicKeyHex: String): Secp256k1PublicKey = js.native
  }
  
}

