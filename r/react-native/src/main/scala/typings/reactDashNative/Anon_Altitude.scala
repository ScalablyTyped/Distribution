package typings.reactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Altitude extends js.Object {
  var altitude: Double
  var heading: Double
  var latitude: Double
  var longitude: Double
  var speed: Double
}

object Anon_Altitude {
  @scala.inline
  def apply(altitude: Double, heading: Double, latitude: Double, longitude: Double, speed: Double): Anon_Altitude = {
    val __obj = js.Dynamic.literal(altitude = altitude, heading = heading, latitude = latitude, longitude = longitude, speed = speed)
  
    __obj.asInstanceOf[Anon_Altitude]
  }
}

