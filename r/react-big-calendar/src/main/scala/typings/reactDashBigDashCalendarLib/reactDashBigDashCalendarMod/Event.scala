package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var allDay: js.UndefOr[scala.Boolean] = js.undefined
  var end: stdLib.Date
  var resource: js.UndefOr[js.Any] = js.undefined
  var start: stdLib.Date
  var title: java.lang.String
}

object Event {
  @scala.inline
  def apply(
    end: stdLib.Date,
    start: stdLib.Date,
    title: java.lang.String,
    allDay: js.UndefOr[scala.Boolean] = js.undefined,
    resource: js.Any = null
  ): Event = {
    val __obj = js.Dynamic.literal(end = end, start = start, title = title)
    if (!js.isUndefined(allDay)) __obj.updateDynamic("allDay")(allDay)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[Event]
  }
}

