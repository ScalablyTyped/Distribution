package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinates extends js.Object {
  val accuracy: scala.Double
  val altitude: scala.Double | scala.Null
  val altitudeAccuracy: scala.Double | scala.Null
  val heading: scala.Double | scala.Null
  val latitude: scala.Double
  val longitude: scala.Double
  val speed: scala.Double | scala.Null
}

object Coordinates {
  @scala.inline
  def apply(
    accuracy: scala.Double,
    latitude: scala.Double,
    longitude: scala.Double,
    altitude: scala.Int | scala.Double = null,
    altitudeAccuracy: scala.Int | scala.Double = null,
    heading: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null
  ): Coordinates = {
    val __obj = js.Dynamic.literal(accuracy = accuracy, latitude = latitude, longitude = longitude)
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (altitudeAccuracy != null) __obj.updateDynamic("altitudeAccuracy")(altitudeAccuracy.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinates]
  }
}

