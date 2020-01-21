package typings.smpteTimecode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimecodeObject extends js.Object {
  var frames: Double
  var hours: Double
  var minutes: Double
  var seconds: Double
}

object TimecodeObject {
  @scala.inline
  def apply(frames: Double, hours: Double, minutes: Double, seconds: Double): TimecodeObject = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimecodeObject]
  }
}

