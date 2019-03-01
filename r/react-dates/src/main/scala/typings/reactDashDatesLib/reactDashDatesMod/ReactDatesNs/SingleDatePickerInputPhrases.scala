package typings
package reactDashDatesLib.reactDashDatesMod.ReactDatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// defaultPhrases.js
trait SingleDatePickerInputPhrases extends js.Object {
  var clearDate: js.UndefOr[java.lang.String] = js.undefined
  var keyboardNavigationInstructions: js.UndefOr[java.lang.String] = js.undefined
}

object SingleDatePickerInputPhrases {
  @scala.inline
  def apply(clearDate: java.lang.String = null, keyboardNavigationInstructions: java.lang.String = null): SingleDatePickerInputPhrases = {
    val __obj = js.Dynamic.literal()
    if (clearDate != null) __obj.updateDynamic("clearDate")(clearDate)
    if (keyboardNavigationInstructions != null) __obj.updateDynamic("keyboardNavigationInstructions")(keyboardNavigationInstructions)
    __obj.asInstanceOf[SingleDatePickerInputPhrases]
  }
}

