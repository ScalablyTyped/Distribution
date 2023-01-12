package typings.reactPaymentInputs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardNumber extends StObject {
  
  var cardNumber: String
  
  var cardType: typings.reactPaymentInputs.mod.CardType
  
  var errorMessages: typings.reactPaymentInputs.mod.ErrorMessages
}
object CardNumber {
  
  inline def apply(
    cardNumber: String,
    cardType: typings.reactPaymentInputs.mod.CardType,
    errorMessages: typings.reactPaymentInputs.mod.ErrorMessages
  ): CardNumber = {
    val __obj = js.Dynamic.literal(cardNumber = cardNumber.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], errorMessages = errorMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardNumber] (val x: Self) extends AnyVal {
    
    inline def setCardNumber(value: String): Self = StObject.set(x, "cardNumber", value.asInstanceOf[js.Any])
    
    inline def setCardType(value: typings.reactPaymentInputs.mod.CardType): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    inline def setErrorMessages(value: typings.reactPaymentInputs.mod.ErrorMessages): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
  }
}
