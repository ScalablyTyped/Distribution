package typings.reactDates.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateRangePickerInputPhrases extends StObject {
  
  var clearDates: js.UndefOr[String] = js.undefined
  
  var focusStartDate: js.UndefOr[String] = js.undefined
  
  var keyboardBackwardNavigationInstructions: js.UndefOr[String] = js.undefined
  
  var keyboardForwardNavigationInstructions: js.UndefOr[String] = js.undefined
}
object DateRangePickerInputPhrases {
  
  inline def apply(): DateRangePickerInputPhrases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangePickerInputPhrases]
  }
  
  extension [Self <: DateRangePickerInputPhrases](x: Self) {
    
    inline def setClearDates(value: String): Self = StObject.set(x, "clearDates", value.asInstanceOf[js.Any])
    
    inline def setClearDatesUndefined: Self = StObject.set(x, "clearDates", js.undefined)
    
    inline def setFocusStartDate(value: String): Self = StObject.set(x, "focusStartDate", value.asInstanceOf[js.Any])
    
    inline def setFocusStartDateUndefined: Self = StObject.set(x, "focusStartDate", js.undefined)
    
    inline def setKeyboardBackwardNavigationInstructions(value: String): Self = StObject.set(x, "keyboardBackwardNavigationInstructions", value.asInstanceOf[js.Any])
    
    inline def setKeyboardBackwardNavigationInstructionsUndefined: Self = StObject.set(x, "keyboardBackwardNavigationInstructions", js.undefined)
    
    inline def setKeyboardForwardNavigationInstructions(value: String): Self = StObject.set(x, "keyboardForwardNavigationInstructions", value.asInstanceOf[js.Any])
    
    inline def setKeyboardForwardNavigationInstructionsUndefined: Self = StObject.set(x, "keyboardForwardNavigationInstructions", js.undefined)
  }
}
