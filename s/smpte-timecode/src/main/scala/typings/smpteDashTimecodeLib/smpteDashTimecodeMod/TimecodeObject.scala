package typings
package smpteDashTimecodeLib.smpteDashTimecodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimecodeObject extends js.Object {
  var frames: scala.Double
  var hours: scala.Double
  var minutes: scala.Double
  var seconds: scala.Double
}

object TimecodeObject {
  @scala.inline
  def apply(frames: scala.Double, hours: scala.Double, minutes: scala.Double, seconds: scala.Double): TimecodeObject = {
    val __obj = js.Dynamic.literal(frames = frames, hours = hours, minutes = minutes, seconds = seconds)
  
    __obj.asInstanceOf[TimecodeObject]
  }
}

