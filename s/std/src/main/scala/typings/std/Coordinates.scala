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
    altitude: Double = null.asInstanceOf[Double],
    altitudeAccuracy: Double = null.asInstanceOf[Double],
    heading: Double = null.asInstanceOf[Double],
    speed: Double = null.asInstanceOf[Double]
  ): Coordinates = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], altitudeAccuracy = altitudeAccuracy.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinates]
  }
}

