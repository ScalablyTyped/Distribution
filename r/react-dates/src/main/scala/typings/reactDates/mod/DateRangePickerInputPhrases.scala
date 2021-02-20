package typings.reactDates.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateRangePickerInputPhrases extends StObject {
  
  var clearDates: js.UndefOr[String] = js.native
  
  var focusStartDate: js.UndefOr[String] = js.native
  
  var keyboardBackwardNavigationInstructions: js.UndefOr[String] = js.native
  
  var keyboardForwardNavigationInstructions: js.UndefOr[String] = js.native
}
object DateRangePickerInputPhrases {
  
  @scala.inline
  def apply(): DateRangePickerInputPhrases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangePickerInputPhrases]
  }
  
  @scala.inline
  implicit class DateRangePickerInputPhrasesMutableBuilder[Self <: DateRangePickerInputPhrases] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearDates(value: String): Self = StObject.set(x, "clearDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearDatesUndefined: Self = StObject.set(x, "clearDates", js.undefined)
    
    @scala.inline
    def setFocusStartDate(value: String): Self = StObject.set(x, "focusStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusStartDateUndefined: Self = StObject.set(x, "focusStartDate", js.undefined)
    
    @scala.inline
    def setKeyboardBackwardNavigationInstructions(value: String): Self = StObject.set(x, "keyboardBackwardNavigationInstructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardBackwardNavigationInstructionsUndefined: Self = StObject.set(x, "keyboardBackwardNavigationInstructions", js.undefined)
    
    @scala.inline
    def setKeyboardForwardNavigationInstructions(value: String): Self = StObject.set(x, "keyboardForwardNavigationInstructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardForwardNavigationInstructionsUndefined: Self = StObject.set(x, "keyboardForwardNavigationInstructions", js.undefined)
  }
}
