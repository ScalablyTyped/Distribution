package typings.smpteTimecode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimecodeObject extends js.Object {
  var frames: Double = js.native
  var hours: Double = js.native
  var minutes: Double = js.native
  var seconds: Double = js.native
}

object TimecodeObject {
  @scala.inline
  def apply(frames: Double, hours: Double, minutes: Double, seconds: Double): TimecodeObject = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimecodeObject]
  }
  @scala.inline
  implicit class TimecodeObjectOps[Self <: TimecodeObject] (val x: Self) extends AnyVal {
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
    def setFrames(value: Double): Self = this.set("frames", value.asInstanceOf[js.Any])
    @scala.inline
    def setHours(value: Double): Self = this.set("hours", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinutes(value: Double): Self = this.set("minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeconds(value: Double): Self = this.set("seconds", value.asInstanceOf[js.Any])
  }
  
}

