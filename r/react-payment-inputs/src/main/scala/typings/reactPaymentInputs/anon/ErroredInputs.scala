package typings.reactPaymentInputs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErroredInputs extends StObject {
  
  /**
    * Returns information about the current card type, including: name, lengths and formats.
    */
  var cardType: typings.reactPaymentInputs.mod.CardType
  
  /**
    * Returns the current global error between all rendered inputs.
    */
  var error: String
  
  /**
    * Returns the error message of each rendered input.
    */
  var erroredInputs: typings.reactPaymentInputs.mod.ErroredInputs
  
  /**
    * Returns the current focused input.
    */
  var focused: Boolean
  
  /**
    * Returns the current global touched state between all rendered inputs.
    */
  var isTouched: Boolean
  
  /**
    * Returns the touch state of each rendered input.
    */
  var touchedInputs: Cvc
}
object ErroredInputs {
  
  inline def apply(
    cardType: typings.reactPaymentInputs.mod.CardType,
    error: String,
    erroredInputs: typings.reactPaymentInputs.mod.ErroredInputs,
    focused: Boolean,
    isTouched: Boolean,
    touchedInputs: Cvc
  ): ErroredInputs = {
    val __obj = js.Dynamic.literal(cardType = cardType.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], erroredInputs = erroredInputs.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], isTouched = isTouched.asInstanceOf[js.Any], touchedInputs = touchedInputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErroredInputs]
  }
  
  extension [Self <: ErroredInputs](x: Self) {
    
    inline def setCardType(value: typings.reactPaymentInputs.mod.CardType): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErroredInputs(value: typings.reactPaymentInputs.mod.ErroredInputs): Self = StObject.set(x, "erroredInputs", value.asInstanceOf[js.Any])
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setIsTouched(value: Boolean): Self = StObject.set(x, "isTouched", value.asInstanceOf[js.Any])
    
    inline def setTouchedInputs(value: Cvc): Self = StObject.set(x, "touchedInputs", value.asInstanceOf[js.Any])
  }
}
