package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Altitude extends js.Object {
  var altitude: scala.Double
  var heading: scala.Double
  var latitude: scala.Double
  var longitude: scala.Double
  var speed: scala.Double
}

object Anon_Altitude {
  @scala.inline
  def apply(
    altitude: scala.Double,
    heading: scala.Double,
    latitude: scala.Double,
    longitude: scala.Double,
    speed: scala.Double
  ): Anon_Altitude = {
    val __obj = js.Dynamic.literal(altitude = altitude, heading = heading, latitude = latitude, longitude = longitude, speed = speed)
  
    __obj.asInstanceOf[Anon_Altitude]
  }
}

