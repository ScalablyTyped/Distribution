package typings.scureBase

import typings.scureBase.mod.AsChain
import typings.scureBase.mod.BytesCoder
import typings.scureBase.mod.Chain
import typings.scureBase.mod.Coder
import typings.scureBase.mod.First
import typings.scureBase.mod.Input
import typings.scureBase.mod.Last
import typings.scureBase.mod.Output
import typings.scureBase.mod.Tail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Base16 extends StObject {
    
    var base16: BytesCoder
    
    var base32: BytesCoder
    
    var base58: BytesCoder
    
    var base58xmr: BytesCoder
    
    var base64: BytesCoder
    
    var base64url: BytesCoder
    
    var hex: BytesCoder
    
    var utf8: BytesCoder
  }
  object Base16 {
    
    inline def apply(
      base16: BytesCoder,
      base32: BytesCoder,
      base58: BytesCoder,
      base58xmr: BytesCoder,
      base64: BytesCoder,
      base64url: BytesCoder,
      hex: BytesCoder,
      utf8: BytesCoder
    ): Base16 = {
      val __obj = js.Dynamic.literal(base16 = base16.asInstanceOf[js.Any], base32 = base32.asInstanceOf[js.Any], base58 = base58.asInstanceOf[js.Any], base58xmr = base58xmr.asInstanceOf[js.Any], base64 = base64.asInstanceOf[js.Any], base64url = base64url.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], utf8 = utf8.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base16]
    }
    
    extension [Self <: Base16](x: Self) {
      
      inline def setBase16(value: BytesCoder): Self = StObject.set(x, "base16", value.asInstanceOf[js.Any])
      
      inline def setBase32(value: BytesCoder): Self = StObject.set(x, "base32", value.asInstanceOf[js.Any])
      
      inline def setBase58(value: BytesCoder): Self = StObject.set(x, "base58", value.asInstanceOf[js.Any])
      
      inline def setBase58xmr(value: BytesCoder): Self = StObject.set(x, "base58xmr", value.asInstanceOf[js.Any])
      
      inline def setBase64(value: BytesCoder): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBase64url(value: BytesCoder): Self = StObject.set(x, "base64url", value.asInstanceOf[js.Any])
      
      inline def setHex(value: BytesCoder): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setUtf8(value: BytesCoder): Self = StObject.set(x, "utf8", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T /* <: Chain & (AsChain[T, Tail[T]]) */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
    ): Coder[Input[First[T]], Output[Last[T]]] = js.native
  }
}
