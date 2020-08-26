package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.anon.EndTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntervalContext extends js.Object {
  var interval: EndTime = js.native
  var intervalText: String = js.native
}

object IntervalContext {
  @scala.inline
  def apply(interval: EndTime, intervalText: String): IntervalContext = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], intervalText = intervalText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntervalContext]
  }
  @scala.inline
  implicit class IntervalContextOps[Self <: IntervalContext] (val x: Self) extends AnyVal {
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
    def setInterval(value: EndTime): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntervalText(value: String): Self = this.set("intervalText", value.asInstanceOf[js.Any])
  }
  
}

