package typings.reactDashAddDashToDashCalendar.reactDashAddDashToDashCalendarMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddToCalendarEvent extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var endTime: js.UndefOr[String | Date] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var startTime: js.UndefOr[String | Date] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object AddToCalendarEvent {
  @scala.inline
  def apply(
    description: String = null,
    endTime: String | Date = null,
    location: String = null,
    startTime: String | Date = null,
    title: String = null
  ): AddToCalendarEvent = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[AddToCalendarEvent]
  }
}

