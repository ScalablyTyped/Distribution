package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAltitude extends js.Object {
  var altitude: Double
  var heading: Double
  var latitude: Double
  var longitude: Double
  var speed: Double
}

object AnonAltitude {
  @scala.inline
  def apply(altitude: Double, heading: Double, latitude: Double, longitude: Double, speed: Double): AnonAltitude = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAltitude]
  }
}

