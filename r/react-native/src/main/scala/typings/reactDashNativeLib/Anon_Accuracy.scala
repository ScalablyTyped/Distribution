package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accuracy extends js.Object {
  var accuracy: scala.Double
  var altitude: scala.Double | scala.Null
  var altitudeAccuracy: scala.Double | scala.Null
  var heading: scala.Double | scala.Null
  var latitude: scala.Double
  var longitude: scala.Double
  var speed: scala.Double | scala.Null
}

object Anon_Accuracy {
  @scala.inline
  def apply(
    accuracy: scala.Double,
    latitude: scala.Double,
    longitude: scala.Double,
    altitude: scala.Int | scala.Double = null,
    altitudeAccuracy: scala.Int | scala.Double = null,
    heading: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null
  ): Anon_Accuracy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accuracy")(accuracy)
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (altitudeAccuracy != null) __obj.updateDynamic("altitudeAccuracy")(altitudeAccuracy.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Accuracy]
  }
}

