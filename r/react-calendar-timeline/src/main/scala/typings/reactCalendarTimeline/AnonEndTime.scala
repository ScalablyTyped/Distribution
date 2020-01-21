package typings.reactCalendarTimeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndTime extends js.Object {
  var endTime: Double
  var labelWidth: Double
  var left: Double
  var startTime: Double
}

object AnonEndTime {
  @scala.inline
  def apply(endTime: Double, labelWidth: Double, left: Double, startTime: Double): AnonEndTime = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], labelWidth = labelWidth.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEndTime]
  }
}

