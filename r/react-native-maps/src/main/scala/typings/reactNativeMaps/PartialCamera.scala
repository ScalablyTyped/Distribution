package typings.reactNativeMaps

import typings.reactNativeMaps.mod.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-maps.react-native-maps.Camera> */
trait PartialCamera extends js.Object {
  var altitude: js.UndefOr[Double] = js.undefined
  var center: js.UndefOr[LatLng] = js.undefined
  var heading: js.UndefOr[Double] = js.undefined
  var pitch: js.UndefOr[Double] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object PartialCamera {
  @scala.inline
  def apply(
    altitude: Int | Double = null,
    center: LatLng = null,
    heading: Int | Double = null,
    pitch: Int | Double = null,
    zoom: Int | Double = null
  ): PartialCamera = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCamera]
  }
}

