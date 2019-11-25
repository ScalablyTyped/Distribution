package typings.projectDashOxford

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pitch extends js.Object {
  var pitch: Double
  var roll: Double
  var yaw: Double
}

object Anon_Pitch {
  @scala.inline
  def apply(pitch: Double, roll: Double, yaw: Double): Anon_Pitch = {
    val __obj = js.Dynamic.literal(pitch = pitch.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any], yaw = yaw.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Pitch]
  }
}

