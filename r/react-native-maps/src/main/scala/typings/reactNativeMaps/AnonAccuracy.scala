package typings.reactNativeMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccuracy extends js.Object {
  var accuracy: Double
  var altitude: Double
  var isFromMockProvider: Boolean
  var latitude: Double
  var longitude: Double
  var speed: Double
  var timestamp: Double
}

object AnonAccuracy {
  @scala.inline
  def apply(
    accuracy: Double,
    altitude: Double,
    isFromMockProvider: Boolean,
    latitude: Double,
    longitude: Double,
    speed: Double,
    timestamp: Double
  ): AnonAccuracy = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], isFromMockProvider = isFromMockProvider.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccuracy]
  }
}

