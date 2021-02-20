package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Algorithms extends StObject {
  
  var cipher: js.UndefOr[js.Array[String]] = js.native
  
  var compress: js.UndefOr[js.Array[String]] = js.native
  
  var hmac: js.UndefOr[js.Array[String]] = js.native
  
  var kex: js.UndefOr[js.Array[String]] = js.native
  
  var serverHostKey: js.UndefOr[js.Array[String]] = js.native
}
object Algorithms {
  
  @scala.inline
  def apply(): Algorithms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Algorithms]
  }
  
  @scala.inline
  implicit class AlgorithmsMutableBuilder[Self <: Algorithms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCipher(value: js.Array[String]): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipherUndefined: Self = StObject.set(x, "cipher", js.undefined)
    
    @scala.inline
    def setCipherVarargs(value: String*): Self = StObject.set(x, "cipher", js.Array(value :_*))
    
    @scala.inline
    def setCompress(value: js.Array[String]): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    @scala.inline
    def setCompressVarargs(value: String*): Self = StObject.set(x, "compress", js.Array(value :_*))
    
    @scala.inline
    def setHmac(value: js.Array[String]): Self = StObject.set(x, "hmac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHmacUndefined: Self = StObject.set(x, "hmac", js.undefined)
    
    @scala.inline
    def setHmacVarargs(value: String*): Self = StObject.set(x, "hmac", js.Array(value :_*))
    
    @scala.inline
    def setKex(value: js.Array[String]): Self = StObject.set(x, "kex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKexUndefined: Self = StObject.set(x, "kex", js.undefined)
    
    @scala.inline
    def setKexVarargs(value: String*): Self = StObject.set(x, "kex", js.Array(value :_*))
    
    @scala.inline
    def setServerHostKey(value: js.Array[String]): Self = StObject.set(x, "serverHostKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerHostKeyUndefined: Self = StObject.set(x, "serverHostKey", js.undefined)
    
    @scala.inline
    def setServerHostKeyVarargs(value: String*): Self = StObject.set(x, "serverHostKey", js.Array(value :_*))
  }
}
