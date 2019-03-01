package typings
package reactDashNativeDashSensorDashManagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Azimuth extends js.Object {
  var azimuth: scala.Double
  var pitch: scala.Double
  var roll: scala.Double
}

object Anon_Azimuth {
  @scala.inline
  def apply(azimuth: scala.Double, pitch: scala.Double, roll: scala.Double): Anon_Azimuth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("azimuth")(azimuth)
    __obj.updateDynamic("pitch")(pitch)
    __obj.updateDynamic("roll")(roll)
    __obj.asInstanceOf[Anon_Azimuth]
  }
}

