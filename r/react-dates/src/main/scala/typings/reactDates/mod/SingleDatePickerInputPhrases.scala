package typings.reactDates.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleDatePickerInputPhrases extends StObject {
  
  var clearDate: js.UndefOr[String] = js.native
  
  var keyboardBackwardNavigationInstructions: js.UndefOr[String] = js.native
  
  var keyboardForwardNavigationInstructions: js.UndefOr[String] = js.native
}
object SingleDatePickerInputPhrases {
  
  @scala.inline
  def apply(): SingleDatePickerInputPhrases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleDatePickerInputPhrases]
  }
  
  @scala.inline
  implicit class SingleDatePickerInputPhrasesMutableBuilder[Self <: SingleDatePickerInputPhrases] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearDate(value: String): Self = StObject.set(x, "clearDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearDateUndefined: Self = StObject.set(x, "clearDate", js.undefined)
    
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
