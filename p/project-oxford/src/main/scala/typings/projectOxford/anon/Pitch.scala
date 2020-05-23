package typings.projectOxford.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pitch extends js.Object {
  var pitch: Double
  var roll: Double
  var yaw: Double
}

object Pitch {
  @scala.inline
  def apply(pitch: Double, roll: Double, yaw: Double): Pitch = {
    val __obj = js.Dynamic.literal(pitch = pitch.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any], yaw = yaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pitch]
  }
}

