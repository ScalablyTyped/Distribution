package typings.reactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accuracy extends js.Object {
  var accuracy: Double
  var altitude: Double | Null
  var altitudeAccuracy: Double | Null
  var heading: Double | Null
  var latitude: Double
  var longitude: Double
  var speed: Double | Null
}

object Anon_Accuracy {
  @scala.inline
  def apply(
    accuracy: Double,
    latitude: Double,
    longitude: Double,
    altitude: Int | Double = null,
    altitudeAccuracy: Int | Double = null,
    heading: Int | Double = null,
    speed: Int | Double = null
  ): Anon_Accuracy = {
    val __obj = js.Dynamic.literal(accuracy = accuracy, latitude = latitude, longitude = longitude)
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (altitudeAccuracy != null) __obj.updateDynamic("altitudeAccuracy")(altitudeAccuracy.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Accuracy]
  }
}

