package typings.reactCalendarTimeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroup extends js.Object {
  var group: AnonId
  var index: Double
}

object AnonGroup {
  @scala.inline
  def apply(group: AnonId, index: Double): AnonGroup = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroup]
  }
}

