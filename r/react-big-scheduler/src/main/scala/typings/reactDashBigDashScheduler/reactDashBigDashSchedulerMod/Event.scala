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
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (rrule != null) __obj.updateDynamic("rrule")(rrule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

