package typings.reactDashBigDashScheduler.reactDashBigDashSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var bgColor: js.UndefOr[String] = js.undefined
  var end: String
  var id: Double
  var resourceId: String
  var rrule: js.UndefOr[String] = js.undefined
  var start: String
  var title: String
}

object Event {
  @scala.inline
  def apply(
    end: String,
    id: Double,
    resourceId: String,
    start: String,
    title: String,
    bgColor: String = null,
    rrule: String = null
  ): Event = {
    val __obj = js.Dynamic.literal(end = end, id = id, resourceId = resourceId, start = start, title = title)
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor)
    if (rrule != null) __obj.updateDynamic("rrule")(rrule)
    __obj.asInstanceOf[Event]
  }
}

