package typings.scureBip32

import typings.scureBip32.anon.Xpriv
import typings.scureBip32.anon.Xpub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@scure/bip32", "HARDENED_OFFSET")
  @js.native
  val HARDENED_OFFSET: Double = js.native
  
  @JSImport("@scure/bip32", "HDKey")
  @js.native
  open class HDKey protected () extends StObject {
    def this(opt: HDKeyOpt) = this()
    
    val chainCode: js.typedarray.Uint8Array | Null = js.native
    
    val depth: Double = js.native
    
    def derive(path: String): HDKey = js.native
    
    def deriveChild(index: Double): HDKey = js.native
    
    def fingerprint: Double = js.native
    
    def identifier: js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    val index: Double = js.native
    
    val parentFingerprint: Double = js.native
    
    /* private */ var privKey: Any = js.native
    
    /* private */ var privKeyBytes: Any = js.native
    
    def privateExtendedKey: String = js.native
    
    def privateKey: js.typedarray.Uint8Array | Null = js.native
    
    /* private */ var pubHash: Any = js.native
    
    /* private */ var pubKey: Any = js.native
    
    def pubKeyHash: js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    def publicExtendedKey: String = js.native
    
    def publicKey: js.typedarray.Uint8Array | Null = js.native
    
    /* private */ var serialize: Any = js.native
    
    def sign(hash: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def toJSON(): Xpub = js.native
    
    def verify(hash: js.typedarray.Uint8Array, signature: js.typedarray.Uint8Array): Boolean = js.native
    
    val versions: Versions = js.native
    
    def wipePrivateData(): this.type = js.native
  }
  /* static members */
  object HDKey {
    
    @JSImport("@scure/bip32", "HDKey")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromExtendedKey(base58key: String): HDKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedKey")(base58key.asInstanceOf[js.Any]).asInstanceOf[HDKey]
    inline def fromExtendedKey(base58key: String, versions: Versions): HDKey = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedKey")(base58key.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[HDKey]
    
    inline def fromJSON(json: Xpriv): HDKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[HDKey]
    
    inline def fromMasterSeed(seed: js.typedarray.Uint8Array): HDKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMasterSeed")(seed.asInstanceOf[js.Any]).asInstanceOf[HDKey]
    inline def fromMasterSeed(seed: js.typedarray.Uint8Array, versions: Versions): HDKey = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMasterSeed")(seed.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[HDKey]
  }
  
  trait HDKeyOpt extends StObject {
    
    var chainCode: js.typedarray.Uint8Array
    
    var depth: js.UndefOr[Double] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var parentFingerprint: js.UndefOr[Double] = js.undefined
    
    var privateKey: js.UndefOr[js.typedarray.Uint8Array | js.BigInt] = js.undefined
    
    var publicKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var versions: Versions
  }
  object HDKeyOpt {
    
    inline def apply(chainCode: js.typedarray.Uint8Array, versions: Versions): HDKeyOpt = {
      val __obj = js.Dynamic.literal(chainCode = chainCode.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.asInstanceOf[HDKeyOpt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HDKeyOpt] (val x: Self) extends AnyVal {
      
      inline def setChainCode(value: js.typedarray.Uint8Array): Self = StObject.set(x, "chainCode", value.asInstanceOf[js.Any])
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setParentFingerprint(value: Double): Self = StObject.set(x, "parentFingerprint", value.asInstanceOf[js.Any])
      
      inline def setParentFingerprintUndefined: Self = StObject.set(x, "parentFingerprint", js.undefined)
      
      inline def setPrivateKey(value: js.typedarray.Uint8Array | js.BigInt): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      inline def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
      
      inline def setVersions(value: Versions): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    }
  }
  
  trait Versions extends StObject {
    
    var `private`: Double
    
    var public: Double
  }
  object Versions {
    
    inline def apply(`private`: Double, public: Double): Versions = {
      val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Versions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Versions] (val x: Self) extends AnyVal {
      
      inline def setPrivate(value: Double): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPublic(value: Double): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
}
