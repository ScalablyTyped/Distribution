package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The position and altitude of the device on Earth, as well as the accuracy with which these properties are calculated. */
trait Coordinates extends js.Object {
  val accuracy: Double
  val altitude: Double | Null
  val altitudeAccuracy: Double | Null
  val heading: Double | Null
  val latitude: Double
  val longitude: Double
  val speed: Double | Null
}

object Coordinates {
  @scala.inline
  def apply(
    accuracy: Double,
    latitude: Double,
    longitude: Double,
    altitude: Int | Double = null,
    altitudeAccuracy: Int | Double = null,
    heading: Int | Double = null,
    speed: Int | Double = null
  ): Coordinates = {
    val __obj = js.Dynamic.literal(accuracy = accuracy, latitude = latitude, longitude = longitude)
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (altitudeAccuracy != null) __obj.updateDynamic("altitudeAccuracy")(altitudeAccuracy.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinates]
  }
}

