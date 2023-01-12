package typings.reactPaymentInputs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorMessages extends StObject {
  
  var errorMessages: typings.reactPaymentInputs.mod.ErrorMessages
}
object ErrorMessages {
  
  inline def apply(errorMessages: typings.reactPaymentInputs.mod.ErrorMessages): ErrorMessages = {
    val __obj = js.Dynamic.literal(errorMessages = errorMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorMessages] (val x: Self) extends AnyVal {
    
    inline def setErrorMessages(value: typings.reactPaymentInputs.mod.ErrorMessages): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
  }
}
