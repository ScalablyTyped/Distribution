package typings.projectOxford

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPitch extends js.Object {
  var pitch: Double
  var roll: Double
  var yaw: Double
}

object AnonPitch {
  @scala.inline
  def apply(pitch: Double, roll: Double, yaw: Double): AnonPitch = {
    val __obj = js.Dynamic.literal(pitch = pitch.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any], yaw = yaw.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPitch]
  }
}

