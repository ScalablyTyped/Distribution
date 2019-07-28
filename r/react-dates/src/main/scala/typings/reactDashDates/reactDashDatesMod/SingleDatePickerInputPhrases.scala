package typings.reactDashDates.reactDashDatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// defaultPhrases.js
trait SingleDatePickerInputPhrases extends js.Object {
  var clearDate: js.UndefOr[String] = js.undefined
  var keyboardNavigationInstructions: js.UndefOr[String] = js.undefined
}

object SingleDatePickerInputPhrases {
  @scala.inline
  def apply(clearDate: String = null, keyboardNavigationInstructions: String = null): SingleDatePickerInputPhrases = {
    val __obj = js.Dynamic.literal()
    if (clearDate != null) __obj.updateDynamic("clearDate")(clearDate)
    if (keyboardNavigationInstructions != null) __obj.updateDynamic("keyboardNavigationInstructions")(keyboardNavigationInstructions)
    __obj.asInstanceOf[SingleDatePickerInputPhrases]
  }
}

