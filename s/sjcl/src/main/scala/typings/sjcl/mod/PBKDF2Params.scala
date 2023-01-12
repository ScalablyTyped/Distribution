package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ________________________________________________________________________
trait PBKDF2Params extends StObject {
  
  var iter: js.UndefOr[Double] = js.undefined
  
  var salt: js.UndefOr[BitArray_] = js.undefined
}
object PBKDF2Params {
  
  inline def apply(): PBKDF2Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PBKDF2Params]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PBKDF2Params] (val x: Self) extends AnyVal {
    
    inline def setIter(value: Double): Self = StObject.set(x, "iter", value.asInstanceOf[js.Any])
    
    inline def setIterUndefined: Self = StObject.set(x, "iter", js.undefined)
    
    inline def setSalt(value: BitArray_): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    
    inline def setSaltVarargs(value: Double*): Self = StObject.set(x, "salt", js.Array(value*))
  }
}
