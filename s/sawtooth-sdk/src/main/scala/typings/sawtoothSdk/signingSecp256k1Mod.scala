package typings.sawtoothSdk

import typings.node.bufferMod.global.Buffer
import typings.sawtoothSdk.signingCoreMod.Context
import typings.sawtoothSdk.signingCoreMod.PrivateKey
import typings.sawtoothSdk.signingCoreMod.PublicKey
import typings.sawtoothSdk.signingMod.message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signingSecp256k1Mod {
  
  @JSImport("sawtooth-sdk/signing/secp256k1", "Secp256k1Context")
  @js.native
  open class Secp256k1Context () extends Context {
    
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
  
  @JSImport("sawtooth-sdk/signing/secp256k1", "Secp256k1PrivateKey")
  @js.native
  open class Secp256k1PrivateKey protected () extends PrivateKey {
    def this(privateKeyBytes: Buffer) = this()
    
    /** The bytes of the public key */
    var privateKeyBytes: Buffer = js.native
  }
  /* static members */
  object Secp256k1PrivateKey {
    
    @JSImport("sawtooth-sdk/signing/secp256k1", "Secp256k1PrivateKey")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a private key from a hex encode set of bytes.
      *
      * @param privateKeyHex - the key in hex
      * @return a private key instance
      * @throws if the private key is not valid
      */
    inline def fromHex(privateKeyHex: String): Secp256k1PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(privateKeyHex.asInstanceOf[js.Any]).asInstanceOf[Secp256k1PrivateKey]
    
    /**
      * @return generates a random PrivateKey
      *
      */
    inline def newRandom(): Secp256k1PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("newRandom")().asInstanceOf[Secp256k1PrivateKey]
  }
  
  @JSImport("sawtooth-sdk/signing/secp256k1", "Secp256k1PublicKey")
  @js.native
  open class Secp256k1PublicKey protected () extends PublicKey {
    def this(publicKeyBytes: Buffer) = this()
    
    /** The bytes of the public key */
    var publicKeyBytes: Buffer = js.native
  }
  /* static members */
  object Secp256k1PublicKey {
    
    @JSImport("sawtooth-sdk/signing/secp256k1", "Secp256k1PublicKey")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a public key from a hex encode set of bytes.
      *
      * @param publicKeyHex - the key in hex
      * @return a public key instance
      * @throws if the public key is not valid
      */
    inline def fromHex(publicKeyHex: String): Secp256k1PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(publicKeyHex.asInstanceOf[js.Any]).asInstanceOf[Secp256k1PublicKey]
  }
}
