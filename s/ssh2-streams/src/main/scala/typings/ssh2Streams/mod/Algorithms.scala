package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Algorithms extends StObject {
  
  var cipher: js.UndefOr[js.Array[String]] = js.undefined
  
  var compress: js.UndefOr[js.Array[String]] = js.undefined
  
  var hmac: js.UndefOr[js.Array[String]] = js.undefined
  
  var kex: js.UndefOr[js.Array[String]] = js.undefined
  
  var serverHostKey: js.UndefOr[js.Array[String]] = js.undefined
}
object Algorithms {
  
  inline def apply(): Algorithms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Algorithms]
  }
  
  extension [Self <: Algorithms](x: Self) {
    
    inline def setCipher(value: js.Array[String]): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
    
    inline def setCipherUndefined: Self = StObject.set(x, "cipher", js.undefined)
    
    inline def setCipherVarargs(value: String*): Self = StObject.set(x, "cipher", js.Array(value :_*))
    
    inline def setCompress(value: js.Array[String]): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setCompressVarargs(value: String*): Self = StObject.set(x, "compress", js.Array(value :_*))
    
    inline def setHmac(value: js.Array[String]): Self = StObject.set(x, "hmac", value.asInstanceOf[js.Any])
    
    inline def setHmacUndefined: Self = StObject.set(x, "hmac", js.undefined)
    
    inline def setHmacVarargs(value: String*): Self = StObject.set(x, "hmac", js.Array(value :_*))
    
    inline def setKex(value: js.Array[String]): Self = StObject.set(x, "kex", value.asInstanceOf[js.Any])
    
    inline def setKexUndefined: Self = StObject.set(x, "kex", js.undefined)
    
    inline def setKexVarargs(value: String*): Self = StObject.set(x, "kex", js.Array(value :_*))
    
    inline def setServerHostKey(value: js.Array[String]): Self = StObject.set(x, "serverHostKey", value.asInstanceOf[js.Any])
    
    inline def setServerHostKeyUndefined: Self = StObject.set(x, "serverHostKey", js.undefined)
    
    inline def setServerHostKeyVarargs(value: String*): Self = StObject.set(x, "serverHostKey", js.Array(value :_*))
  }
}
