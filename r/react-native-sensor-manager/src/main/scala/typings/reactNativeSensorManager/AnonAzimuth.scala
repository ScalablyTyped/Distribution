package typings.reactNativeSensorManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAzimuth extends js.Object {
  var azimuth: Double
  var pitch: Double
  var roll: Double
}

object AnonAzimuth {
  @scala.inline
  def apply(azimuth: Double, pitch: Double, roll: Double): AnonAzimuth = {
    val __obj = js.Dynamic.literal(azimuth = azimuth.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAzimuth]
  }
}

