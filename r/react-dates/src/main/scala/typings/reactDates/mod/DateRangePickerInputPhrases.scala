package typings.reactDates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// defaultPhrases.js
@js.native
trait DateRangePickerInputPhrases extends js.Object {
  var clearDates: js.UndefOr[String] = js.native
  var focusStartDate: js.UndefOr[String] = js.native
  var keyboardNavigationInstructions: js.UndefOr[String] = js.native
}

object DateRangePickerInputPhrases {
  @scala.inline
  def apply(): DateRangePickerInputPhrases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangePickerInputPhrases]
  }
  @scala.inline
  implicit class DateRangePickerInputPhrasesOps[Self <: DateRangePickerInputPhrases] (val x: Self) extends AnyVal {
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
    def setClearDates(value: String): Self = this.set("clearDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearDates: Self = this.set("clearDates", js.undefined)
    @scala.inline
    def setFocusStartDate(value: String): Self = this.set("focusStartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusStartDate: Self = this.set("focusStartDate", js.undefined)
    @scala.inline
    def setKeyboardNavigationInstructions(value: String): Self = this.set("keyboardNavigationInstructions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardNavigationInstructions: Self = this.set("keyboardNavigationInstructions", js.undefined)
  }
  
}

