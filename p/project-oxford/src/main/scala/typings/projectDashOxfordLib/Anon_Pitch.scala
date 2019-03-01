package typings
package projectDashOxfordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pitch extends js.Object {
  var pitch: scala.Double
  var roll: scala.Double
  var yaw: scala.Double
}

object Anon_Pitch {
  @scala.inline
  def apply(pitch: scala.Double, roll: scala.Double, yaw: scala.Double): Anon_Pitch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pitch")(pitch)
    __obj.updateDynamic("roll")(roll)
    __obj.updateDynamic("yaw")(yaw)
    __obj.asInstanceOf[Anon_Pitch]
  }
}

