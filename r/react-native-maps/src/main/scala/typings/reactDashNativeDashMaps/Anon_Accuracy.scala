package typings.reactDashNativeDashMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accuracy extends js.Object {
  var accuracy: Double
  var altitude: Double
  var isFromMockProvider: Boolean
  var latitude: Double
  var longitude: Double
  var speed: Double
  var timestamp: Double
}

object Anon_Accuracy {
  @scala.inline
  def apply(
    accuracy: Double,
    altitude: Double,
    isFromMockProvider: Boolean,
    latitude: Double,
    longitude: Double,
    speed: Double,
    timestamp: Double
  ): Anon_Accuracy = {
    val __obj = js.Dynamic.literal(accuracy = accuracy, altitude = altitude, isFromMockProvider = isFromMockProvider, latitude = latitude, longitude = longitude, speed = speed, timestamp = timestamp)
  
    __obj.asInstanceOf[Anon_Accuracy]
  }
}

