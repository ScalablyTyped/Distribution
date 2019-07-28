package typings.reactDashDates.reactDashDatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// defaultPhrases.js
trait DateRangePickerInputPhrases extends js.Object {
  var clearDates: js.UndefOr[String] = js.undefined
  var focusStartDate: js.UndefOr[String] = js.undefined
  var keyboardNavigationInstructions: js.UndefOr[String] = js.undefined
}

object DateRangePickerInputPhrases {
  @scala.inline
  def apply(
    clearDates: String = null,
    focusStartDate: String = null,
    keyboardNavigationInstructions: String = null
  ): DateRangePickerInputPhrases = {
    val __obj = js.Dynamic.literal()
    if (clearDates != null) __obj.updateDynamic("clearDates")(clearDates)
    if (focusStartDate != null) __obj.updateDynamic("focusStartDate")(focusStartDate)
    if (keyboardNavigationInstructions != null) __obj.updateDynamic("keyboardNavigationInstructions")(keyboardNavigationInstructions)
    __obj.asInstanceOf[DateRangePickerInputPhrases]
  }
}

