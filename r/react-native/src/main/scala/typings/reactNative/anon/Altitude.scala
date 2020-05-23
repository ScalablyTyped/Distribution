package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Altitude extends js.Object {
  var altitude: Double
  var heading: Double
  var latitude: Double
  var longitude: Double
  var speed: Double
}

object Altitude {
  @scala.inline
  def apply(altitude: Double, heading: Double, latitude: Double, longitude: Double, speed: Double): Altitude = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Altitude]
  }
}

