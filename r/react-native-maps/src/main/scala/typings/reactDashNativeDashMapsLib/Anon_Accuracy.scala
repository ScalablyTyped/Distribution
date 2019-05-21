package typings
package reactDashNativeDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accuracy extends js.Object {
  var accuracy: scala.Double
  var altitude: scala.Double
  var isFromMockProvider: scala.Boolean
  var latitude: scala.Double
  var longitude: scala.Double
  var speed: scala.Double
  var timestamp: scala.Double
}

object Anon_Accuracy {
  @scala.inline
  def apply(
    accuracy: scala.Double,
    altitude: scala.Double,
    isFromMockProvider: scala.Boolean,
    latitude: scala.Double,
    longitude: scala.Double,
    speed: scala.Double,
    timestamp: scala.Double
  ): Anon_Accuracy = {
    val __obj = js.Dynamic.literal(accuracy = accuracy, altitude = altitude, isFromMockProvider = isFromMockProvider, latitude = latitude, longitude = longitude, speed = speed, timestamp = timestamp)
  
    __obj.asInstanceOf[Anon_Accuracy]
  }
}

