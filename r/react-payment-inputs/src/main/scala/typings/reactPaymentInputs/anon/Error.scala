package typings.reactPaymentInputs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: String
  
  var focused: Boolean
  
  var isTouched: Boolean
}
object Error {
  
  inline def apply(error: String, focused: Boolean, isTouched: Boolean): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], isTouched = isTouched.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setIsTouched(value: Boolean): Self = StObject.set(x, "isTouched", value.asInstanceOf[js.Any])
  }
}
