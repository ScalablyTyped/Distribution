package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var allDay: js.UndefOr[scala.Boolean] = js.undefined
  var end: js.UndefOr[stdLib.Date] = js.undefined
  var resource: js.UndefOr[js.Any] = js.undefined
  var start: js.UndefOr[stdLib.Date] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    allDay: js.UndefOr[scala.Boolean] = js.undefined,
    end: stdLib.Date = null,
    resource: js.Any = null,
    start: stdLib.Date = null,
    title: java.lang.String = null
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

