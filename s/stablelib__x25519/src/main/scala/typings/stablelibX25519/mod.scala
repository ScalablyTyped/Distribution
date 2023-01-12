package typings.stablelibX25519

import typings.stablelibRandom.libSourceMod.RandomSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stablelib/x25519", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stablelib/x25519", "PUBLIC_KEY_LENGTH")
  @js.native
  val PUBLIC_KEY_LENGTH: /* 32 */ Double = js.native
  
  @JSImport("@stablelib/x25519", "SECRET_KEY_LENGTH")
  @js.native
  val SECRET_KEY_LENGTH: /* 32 */ Double = js.native
  
  @JSImport("@stablelib/x25519", "SHARED_KEY_LENGTH")
  @js.native
  val SHARED_KEY_LENGTH: /* 32 */ Double = js.native
  
  inline def generateKeyPair(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")().asInstanceOf[KeyPair]
  inline def generateKeyPair(prng: RandomSource): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(prng.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
  inline def generateKeyPairFromSeed(seed: js.typedarray.Uint8Array): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairFromSeed")(seed.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
  inline def scalarMult(n: js.typedarray.Uint8Array, p: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarMult")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def scalarMultBase(n: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("scalarMultBase")(n.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def sharedKey(mySecretKey: js.typedarray.Uint8Array, theirPublicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sharedKey")(mySecretKey.asInstanceOf[js.Any], theirPublicKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def sharedKey(
    mySecretKey: js.typedarray.Uint8Array,
    theirPublicKey: js.typedarray.Uint8Array,
    rejectZero: Boolean
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sharedKey")(mySecretKey.asInstanceOf[js.Any], theirPublicKey.asInstanceOf[js.Any], rejectZero.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  trait KeyPair extends StObject {
    
    var publicKey: js.typedarray.Uint8Array
    
    var secretKey: js.typedarray.Uint8Array
  }
  object KeyPair {
    
    inline def apply(publicKey: js.typedarray.Uint8Array, secretKey: js.typedarray.Uint8Array): KeyPair = {
      val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPair]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyPair] (val x: Self) extends AnyVal {
      
      inline def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setSecretKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
}
