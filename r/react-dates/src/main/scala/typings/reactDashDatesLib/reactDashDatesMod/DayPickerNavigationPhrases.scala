package typings
package reactDashDatesLib.reactDashDatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// defaultPhrases.js
trait DayPickerNavigationPhrases extends js.Object {
  var jumpToNextMonth: js.UndefOr[java.lang.String] = js.undefined
  var jumpToPrevMonth: js.UndefOr[java.lang.String] = js.undefined
}

object DayPickerNavigationPhrases {
  @scala.inline
  def apply(jumpToNextMonth: java.lang.String = null, jumpToPrevMonth: java.lang.String = null): DayPickerNavigationPhrases = {
    val __obj = js.Dynamic.literal()
    if (jumpToNextMonth != null) __obj.updateDynamic("jumpToNextMonth")(jumpToNextMonth)
    if (jumpToPrevMonth != null) __obj.updateDynamic("jumpToPrevMonth")(jumpToPrevMonth)
    __obj.asInstanceOf[DayPickerNavigationPhrases]
  }
}

