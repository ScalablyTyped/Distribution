package typings.reactPaymentInputs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpiryDate extends StObject {
  
  var errorMessages: typings.reactPaymentInputs.mod.ErrorMessages
  
  var expiryDate: Month
}
object ExpiryDate {
  
  inline def apply(errorMessages: typings.reactPaymentInputs.mod.ErrorMessages, expiryDate: Month): ExpiryDate = {
    val __obj = js.Dynamic.literal(errorMessages = errorMessages.asInstanceOf[js.Any], expiryDate = expiryDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiryDate]
  }
  
  extension [Self <: ExpiryDate](x: Self) {
    
    inline def setErrorMessages(value: typings.reactPaymentInputs.mod.ErrorMessages): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
    
    inline def setExpiryDate(value: Month): Self = StObject.set(x, "expiryDate", value.asInstanceOf[js.Any])
  }
}
