package typings.reactPaymentInputs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseCardNumber extends StObject {
  
  var base: String | js.Object
  
  var cardNumber: String | js.Object
  
  var cvc: String | js.Object
  
  var errored: String | js.Object
  
  var expiryDate: String | js.Object
}
object BaseCardNumber {
  
  inline def apply(
    base: String | js.Object,
    cardNumber: String | js.Object,
    cvc: String | js.Object,
    errored: String | js.Object,
    expiryDate: String | js.Object
  ): BaseCardNumber = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], cardNumber = cardNumber.asInstanceOf[js.Any], cvc = cvc.asInstanceOf[js.Any], errored = errored.asInstanceOf[js.Any], expiryDate = expiryDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseCardNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseCardNumber] (val x: Self) extends AnyVal {
    
    inline def setBase(value: String | js.Object): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setCardNumber(value: String | js.Object): Self = StObject.set(x, "cardNumber", value.asInstanceOf[js.Any])
    
    inline def setCvc(value: String | js.Object): Self = StObject.set(x, "cvc", value.asInstanceOf[js.Any])
    
    inline def setErrored(value: String | js.Object): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
    
    inline def setExpiryDate(value: String | js.Object): Self = StObject.set(x, "expiryDate", value.asInstanceOf[js.Any])
  }
}
