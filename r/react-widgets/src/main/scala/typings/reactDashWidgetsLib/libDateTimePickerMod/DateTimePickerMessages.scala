package typings
package reactDashWidgetsLib.libDateTimePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimePickerMessages extends js.Object {
  /**
    * Title and screen reader text for the left arrow button.
    * @default "Select Date"
    */
  var dateButton: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Title and screen reader text for the right arrow button.
    * @default "Select Time"
    */
  var timeButton: js.UndefOr[java.lang.String] = js.undefined
}

object DateTimePickerMessages {
  @scala.inline
  def apply(dateButton: java.lang.String = null, timeButton: java.lang.String = null): DateTimePickerMessages = {
    val __obj = js.Dynamic.literal()
    if (dateButton != null) __obj.updateDynamic("dateButton")(dateButton)
    if (timeButton != null) __obj.updateDynamic("timeButton")(timeButton)
    __obj.asInstanceOf[DateTimePickerMessages]
  }
}

