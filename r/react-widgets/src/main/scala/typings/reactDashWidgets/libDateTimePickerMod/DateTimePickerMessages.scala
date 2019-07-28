package typings.reactDashWidgets.libDateTimePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimePickerMessages extends js.Object {
  /**
    * Title and screen reader text for the left arrow button.
    * @default "Select Date"
    */
  var dateButton: js.UndefOr[String] = js.undefined
  /**
    * Title and screen reader text for the right arrow button.
    * @default "Select Time"
    */
  var timeButton: js.UndefOr[String] = js.undefined
}

object DateTimePickerMessages {
  @scala.inline
  def apply(dateButton: String = null, timeButton: String = null): DateTimePickerMessages = {
    val __obj = js.Dynamic.literal()
    if (dateButton != null) __obj.updateDynamic("dateButton")(dateButton)
    if (timeButton != null) __obj.updateDynamic("timeButton")(timeButton)
    __obj.asInstanceOf[DateTimePickerMessages]
  }
}

