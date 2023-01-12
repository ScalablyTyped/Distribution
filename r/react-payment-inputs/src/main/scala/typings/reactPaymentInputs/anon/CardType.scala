package typings.reactPaymentInputs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardType extends StObject {
  
  var cardType: typings.reactPaymentInputs.mod.CardType
  
  var cvc: String
  
  var errorMessages: typings.reactPaymentInputs.mod.ErrorMessages
}
object CardType {
  
  inline def apply(
    cardType: typings.reactPaymentInputs.mod.CardType,
    cvc: String,
    errorMessages: typings.reactPaymentInputs.mod.ErrorMessages
  ): CardType = {
    val __obj = js.Dynamic.literal(cardType = cardType.asInstanceOf[js.Any], cvc = cvc.asInstanceOf[js.Any], errorMessages = errorMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardType] (val x: Self) extends AnyVal {
    
    inline def setCardType(value: typings.reactPaymentInputs.mod.CardType): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    inline def setCvc(value: String): Self = StObject.set(x, "cvc", value.asInstanceOf[js.Any])
    
    inline def setErrorMessages(value: typings.reactPaymentInputs.mod.ErrorMessages): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
  }
}
