package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewRegion extends js.Object {
  var latitude: scala.Double
  var latitudeDelta: js.UndefOr[scala.Double] = js.undefined
  var longitude: scala.Double
  var longitudeDelta: js.UndefOr[scala.Double] = js.undefined
}

object MapViewRegion {
  @scala.inline
  def apply(
    latitude: scala.Double,
    longitude: scala.Double,
    latitudeDelta: scala.Int | scala.Double = null,
    longitudeDelta: scala.Int | scala.Double = null
  ): MapViewRegion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    if (latitudeDelta != null) __obj.updateDynamic("latitudeDelta")(latitudeDelta.asInstanceOf[js.Any])
    if (longitudeDelta != null) __obj.updateDynamic("longitudeDelta")(longitudeDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapViewRegion]
  }
}

