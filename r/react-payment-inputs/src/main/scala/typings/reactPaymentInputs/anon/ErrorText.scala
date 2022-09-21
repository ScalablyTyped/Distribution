package typings.reactPaymentInputs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorText extends StObject {
  
  var errorText: `0`
  
  var fieldWrapper: Base
  
  var input: BaseCardNumber
  
  var inputWrapper: Errored
}
object ErrorText {
  
  inline def apply(errorText: `0`, fieldWrapper: Base, input: BaseCardNumber, inputWrapper: Errored): ErrorText = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], fieldWrapper = fieldWrapper.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputWrapper = inputWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorText]
  }
  
  extension [Self <: ErrorText](x: Self) {
    
    inline def setErrorText(value: `0`): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    inline def setFieldWrapper(value: Base): Self = StObject.set(x, "fieldWrapper", value.asInstanceOf[js.Any])
    
    inline def setInput(value: BaseCardNumber): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputWrapper(value: Errored): Self = StObject.set(x, "inputWrapper", value.asInstanceOf[js.Any])
  }
}
