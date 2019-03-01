package typings
package reactDashDatesLib.reactDashDatesMod.ReactDatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// defaultPhrases.js
trait DateRangePickerInputPhrases extends js.Object {
  var clearDates: js.UndefOr[java.lang.String] = js.undefined
  var focusStartDate: js.UndefOr[java.lang.String] = js.undefined
  var keyboardNavigationInstructions: js.UndefOr[java.lang.String] = js.undefined
}

object DateRangePickerInputPhrases {
  @scala.inline
  def apply(
    clearDates: java.lang.String = null,
    focusStartDate: java.lang.String = null,
    keyboardNavigationInstructions: java.lang.String = null
  ): DateRangePickerInputPhrases = {
    val __obj = js.Dynamic.literal()
    if (clearDates != null) __obj.updateDynamic("clearDates")(clearDates)
    if (focusStartDate != null) __obj.updateDynamic("focusStartDate")(focusStartDate)
    if (keyboardNavigationInstructions != null) __obj.updateDynamic("keyboardNavigationInstructions")(keyboardNavigationInstructions)
    __obj.asInstanceOf[DateRangePickerInputPhrases]
  }
}

