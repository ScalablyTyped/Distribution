package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclCipherDecryptParams
  extends StObject
     with SjclCipherParams {
  
  var iv: js.UndefOr[BitArray_] = js.undefined
  
  var salt: js.UndefOr[BitArray_] = js.undefined
}
object SjclCipherDecryptParams {
  
  inline def apply(): SjclCipherDecryptParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SjclCipherDecryptParams]
  }
  
  extension [Self <: SjclCipherDecryptParams](x: Self) {
    
    inline def setIv(value: BitArray_): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
    
    inline def setIvVarargs(value: Double*): Self = StObject.set(x, "iv", js.Array(value :_*))
    
    inline def setSalt(value: BitArray_): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    
    inline def setSaltVarargs(value: Double*): Self = StObject.set(x, "salt", js.Array(value :_*))
  }
}
