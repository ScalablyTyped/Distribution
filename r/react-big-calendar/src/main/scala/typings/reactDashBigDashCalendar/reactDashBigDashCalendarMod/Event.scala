package typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var allDay: js.UndefOr[Boolean] = js.undefined
  var end: js.UndefOr[Date] = js.undefined
  var resource: js.UndefOr[js.Any] = js.undefined
  var start: js.UndefOr[Date] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    allDay: js.UndefOr[Boolean] = js.undefined,
    end: Date = null,
    resource: js.Any = null,
    start: Date = null,
    title: String = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allDay)) __obj.updateDynamic("allDay")(allDay)
    if (end != null) __obj.updateDynamic("end")(end)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (start != null) __obj.updateDynamic("start")(start)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Event]
  }
}

