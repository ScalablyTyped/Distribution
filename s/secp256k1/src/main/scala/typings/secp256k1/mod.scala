package typings.secp256k1

import typings.secp256k1.anon.Recid
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("secp256k1", "ecdh")
  @js.native
  def ecdh(publicKey: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("secp256k1", "ecdh")
  @js.native
  def ecdh(publicKey: Uint8Array, privateKey: Uint8Array, opt: ecdhOptions): Uint8Array = js.native
  
  @JSImport("secp256k1", "ecdsaRecover")
  @js.native
  def ecdsaRecover(signature: Uint8Array, recid: Double, message: Uint8Array): Uint8Array = js.native
  @JSImport("secp256k1", "ecdsaRecover")
  @js.native
  def ecdsaRecover(signature: Uint8Array, recid: Double, message: Uint8Array, compressed: Boolean): Uint8Array = js.native
  
  @JSImport("secp256k1", "ecdsaSign")
  @js.native
  def ecdsaSign(message: Uint8Array, privateKey: Uint8Array): Recid = js.native
  @JSImport("secp256k1", "ecdsaSign")
  @js.native
  def ecdsaSign(message: Uint8Array, privateKey: Uint8Array, options: SignOptions): Recid = js.native
  
  @JSImport("secp256k1", "ecdsaVerify")
  @js.native
  def ecdsaVerify(signature: Uint8Array, message: Uint8Array, publicKey: Uint8Array): Boolean = js.native
  
  @JSImport("secp256k1", "privateKeyExport")
  @js.native
  def privateKeyExport(privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("secp256k1", "privateKeyExport")
  @js.native
  def privateKeyExport(privateKey: Uint8Array, compressed: Boolean): Uint8Array = js.native
  
  @JSImport("secp256k1", "privateKeyImport")
  @js.native
  def privateKeyImport(privateKey: Uint8Array): Uint8Array = js.native
  
  @JSImport("secp256k1", "privateKeyModInverse")
  @js.native
  def privateKeyModInverse(privateKey: Uint8Array): Uint8Array = js.native
  
  @JSImport("secp256k1", "privateKeyNegate")
  @js.native
  def privateKeyNegate(privateKey: Uint8Array): Uint8Array = js.native
  
  @JSImport("secp256k1", "privateKeyTweakAdd")
  @js.native
  def privateKeyTweakAdd(privateKey: Uint8Array, tweak: Uint8Array): Uint8Array = js.native
  
  @JSImport("secp256k1", "privateKeyTweakMul")
  @js.native
  def privateKeyTweakMul(privateKey: Uint8Array, tweak: Uint8Array): Uint8Array = js.native
  
  @JSImport("secp256k1", "privateKeyVerify")
  @js.native
  def privateKeyVerify(privateKey: Uint8Array): Boolean = js.native
  
  @JSImport("secp256k1", "publicKeyCombine")
  @js.native
  def publicKeyCombine(publicKeys: js.Array[Uint8Array]): Uint8Array = js.native
  @JSImport("secp256k1", "publicKeyCombine")
  @js.native
  def publicKeyCombine(publicKeys: js.Array[Uint8Array], compressed: Boolean): Uint8Array = js.native
  
  @JSImport("secp256k1", "publicKeyConvert")
  @js.native
  def publicKeyConvert(publicKey: Uint8Array): Uint8Array = js.native
  @JSImport("secp256k1", "publicKeyConvert")
  @js.native
  def publicKeyConvert(publicKey: Uint8Array, compressed: Boolean): Uint8Array = js.native
  
  @JSImport("secp256k1", "publicKeyCreate")
  @js.native
  def publicKeyCreate(privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("secp256k1", "publicKeyCreate")
  @js.native
  def publicKeyCreate(privateKey: Uint8Array, compressed: Boolean): Uint8Array = js.native
  
  @JSImport("secp256k1", "publicKeyTweakAdd")
  @js.native
  def publicKeyTweakAdd(publicKey: Uint8Array, tweak: Uint8Array): Uint8Array = js.native
  @JSImport("secp256k1", "publicKeyTweakAdd")
  @js.native
  def publicKeyTweakAdd(publicKey: Uint8Array, tweak: Uint8Array, compressed: Boolean): Uint8Array = js.native
  
  @JSImport("secp256k1", "publicKeyTweakMul")
  @js.native
  def publicKeyTweakMul(publicKey: Uint8Array, tweak: Uint8Array): Uint8Array = js.native
  @JSImport("secp256k1", "publicKeyTweakMul")
  @js.native
  def publicKeyTweakMul(publicKey: Uint8Array, tweak: Uint8Array, compressed: Boolean): Uint8Array = js.native
  
  @JSImport("secp256k1", "publicKeyVerify")
  @js.native
  def publicKeyVerify(publicKey: Uint8Array): Boolean = js.native
  
  @JSImport("secp256k1", "signatureExport")
  @js.native
  def signatureExport(signature: Uint8Array): Uint8Array = js.native
  
  @JSImport("secp256k1", "signatureImport")
  @js.native
  def signatureImport(signature: Uint8Array): Uint8Array = js.native
  
  @JSImport("secp256k1", "signatureNormalize")
  @js.native
  def signatureNormalize(signature: Uint8Array): Uint8Array = js.native
  
  @js.native
  trait SignOptions extends StObject {
    
    /**
      * Additional data for noncefn (RFC 6979 3.6) (32 bytes).
      *
      * By default is `null`.
      */
    var data: js.UndefOr[Uint8Array] = js.native
    
    /** Nonce generator. By default it is rfc6979 */
    var noncefn: js.UndefOr[
        js.Function5[
          /* message */ Uint8Array, 
          /* privateKey */ Uint8Array, 
          /* algo */ Uint8Array | Null, 
          /* data */ Uint8Array | Null, 
          /* attempt */ Double, 
          Uint8Array
        ]
      ] = js.native
  }
  object SignOptions {
    
    @scala.inline
    def apply(): SignOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignOptions]
    }
    
    @scala.inline
    implicit class SignOptionsMutableBuilder[Self <: SignOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setNoncefn(
        value: (/* message */ Uint8Array, /* privateKey */ Uint8Array, /* algo */ Uint8Array | Null, /* data */ Uint8Array | Null, /* attempt */ Double) => Uint8Array
      ): Self = StObject.set(x, "noncefn", js.Any.fromFunction5(value))
      
      @scala.inline
      def setNoncefnUndefined: Self = StObject.set(x, "noncefn", js.undefined)
    }
  }
  
  @js.native
  trait ecdhOptions extends StObject {
    
    var data: js.UndefOr[Uint8Array] = js.native
    
    var hashfn: js.UndefOr[
        js.Function3[/* x */ Uint8Array, /* y */ Uint8Array, /* data */ Uint8Array, Uint8Array]
      ] = js.native
    
    var xbuf: js.UndefOr[Uint8Array] = js.native
    
    var ybuf: js.UndefOr[Uint8Array] = js.native
  }
  object ecdhOptions {
    
    @scala.inline
    def apply(): ecdhOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ecdhOptions]
    }
    
    @scala.inline
    implicit class ecdhOptionsMutableBuilder[Self <: ecdhOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setHashfn(value: (/* x */ Uint8Array, /* y */ Uint8Array, /* data */ Uint8Array) => Uint8Array): Self = StObject.set(x, "hashfn", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHashfnUndefined: Self = StObject.set(x, "hashfn", js.undefined)
      
      @scala.inline
      def setXbuf(value: Uint8Array): Self = StObject.set(x, "xbuf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXbufUndefined: Self = StObject.set(x, "xbuf", js.undefined)
      
      @scala.inline
      def setYbuf(value: Uint8Array): Self = StObject.set(x, "ybuf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYbufUndefined: Self = StObject.set(x, "ybuf", js.undefined)
    }
  }
}
