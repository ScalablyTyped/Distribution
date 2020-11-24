package typings.reactDates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleDatePickerInputPhrases extends js.Object {
  
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
  implicit class SingleDatePickerInputPhrasesOps[Self <: SingleDatePickerInputPhrases] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClearDate(value: String): Self = this.set("clearDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearDate: Self = this.set("clearDate", js.undefined)
    
    @scala.inline
    def setKeyboardBackwardNavigationInstructions(value: String): Self = this.set("keyboardBackwardNavigationInstructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardBackwardNavigationInstructions: Self = this.set("keyboardBackwardNavigationInstructions", js.undefined)
    
    @scala.inline
    def setKeyboardForwardNavigationInstructions(value: String): Self = this.set("keyboardForwardNavigationInstructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardForwardNavigationInstructions: Self = this.set("keyboardForwardNavigationInstructions", js.undefined)
  }
}
