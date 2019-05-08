package typings
package reactDashBigDashSchedulerLib.reactDashBigDashSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var bgColor: js.UndefOr[java.lang.String] = js.undefined
  var end: java.lang.String
  var id: scala.Double
  var resourceId: java.lang.String
  var rrule: js.UndefOr[java.lang.String] = js.undefined
  var start: java.lang.String
  var title: java.lang.String
}

object Event {
  @scala.inline
  def apply(
    end: java.lang.String,
    id: scala.Double,
    resourceId: java.lang.String,
    start: java.lang.String,
    title: java.lang.String,
    bgColor: java.lang.String = null,
    rrule: java.lang.String = null
  ): Event = {
    val __obj = js.Dynamic.literal(end = end, id = id, resourceId = resourceId, start = start, title = title)
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor)
    if (rrule != null) __obj.updateDynamic("rrule")(rrule)
    __obj.asInstanceOf[Event]
  }
}

