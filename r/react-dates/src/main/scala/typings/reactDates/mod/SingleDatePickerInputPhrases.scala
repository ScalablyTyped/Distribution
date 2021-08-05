package typings.reactDates.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleDatePickerInputPhrases extends StObject {
  
  var clearDate: js.UndefOr[String] = js.undefined
  
  var keyboardBackwardNavigationInstructions: js.UndefOr[String] = js.undefined
  
  var keyboardForwardNavigationInstructions: js.UndefOr[String] = js.undefined
}
object SingleDatePickerInputPhrases {
  
  inline def apply(): SingleDatePickerInputPhrases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleDatePickerInputPhrases]
  }
  
  extension [Self <: SingleDatePickerInputPhrases](x: Self) {
    
    inline def setClearDate(value: String): Self = StObject.set(x, "clearDate", value.asInstanceOf[js.Any])
    
    inline def setClearDateUndefined: Self = StObject.set(x, "clearDate", js.undefined)
    
    inline def setKeyboardBackwardNavigationInstructions(value: String): Self = StObject.set(x, "keyboardBackwardNavigationInstructions", value.asInstanceOf[js.Any])
    
    inline def setKeyboardBackwardNavigationInstructionsUndefined: Self = StObject.set(x, "keyboardBackwardNavigationInstructions", js.undefined)
    
    inline def setKeyboardForwardNavigationInstructions(value: String): Self = StObject.set(x, "keyboardForwardNavigationInstructions", value.asInstanceOf[js.Any])
    
    inline def setKeyboardForwardNavigationInstructionsUndefined: Self = StObject.set(x, "keyboardForwardNavigationInstructions", js.undefined)
  }
}
