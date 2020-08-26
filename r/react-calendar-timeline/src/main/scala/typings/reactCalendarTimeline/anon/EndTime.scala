package typings.reactCalendarTimeline.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndTime extends js.Object {
  var endTime: Double = js.native
  var labelWidth: Double = js.native
  var left: Double = js.native
  var startTime: Double = js.native
}

object EndTime {
  @scala.inline
  def apply(endTime: Double, labelWidth: Double, left: Double, startTime: Double): EndTime = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], labelWidth = labelWidth.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndTime]
  }
  @scala.inline
  implicit class EndTimeOps[Self <: EndTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndTime(value: Double): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelWidth(value: Double): Self = this.set("labelWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
  }
  
}

