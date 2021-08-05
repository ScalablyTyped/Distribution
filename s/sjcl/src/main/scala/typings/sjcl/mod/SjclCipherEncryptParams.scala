package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclCipherEncryptParams
  extends StObject
     with SjclCipherParams {
  
  var iv: BitArray_
  
  var salt: BitArray_
}
object SjclCipherEncryptParams {
  
  inline def apply(iv: BitArray_, salt: BitArray_): SjclCipherEncryptParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCipherEncryptParams]
  }
  
  extension [Self <: SjclCipherEncryptParams](x: Self) {
    
    inline def setIv(value: BitArray_): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setIvVarargs(value: Double*): Self = StObject.set(x, "iv", js.Array(value :_*))
    
    inline def setSalt(value: BitArray_): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    inline def setSaltVarargs(value: Double*): Self = StObject.set(x, "salt", js.Array(value :_*))
  }
}
