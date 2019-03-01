package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractiveState extends js.Object {
  var startBearing: js.UndefOr[scala.Double] = js.undefined
  var startPanLngLat: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var startPitch: js.UndefOr[scala.Double] = js.undefined
  var startZoom: js.UndefOr[scala.Double] = js.undefined
  var startZoomLngLat: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
}

object InteractiveState {
  @scala.inline
  def apply(
    startBearing: scala.Int | scala.Double = null,
    startPanLngLat: js.Tuple2[scala.Double, scala.Double] = null,
    startPitch: scala.Int | scala.Double = null,
    startZoom: scala.Int | scala.Double = null,
    startZoomLngLat: js.Tuple2[scala.Double, scala.Double] = null
  ): InteractiveState = {
    val __obj = js.Dynamic.literal()
    if (startBearing != null) __obj.updateDynamic("startBearing")(startBearing.asInstanceOf[js.Any])
    if (startPanLngLat != null) __obj.updateDynamic("startPanLngLat")(startPanLngLat)
    if (startPitch != null) __obj.updateDynamic("startPitch")(startPitch.asInstanceOf[js.Any])
    if (startZoom != null) __obj.updateDynamic("startZoom")(startZoom.asInstanceOf[js.Any])
    if (startZoomLngLat != null) __obj.updateDynamic("startZoomLngLat")(startZoomLngLat)
    __obj.asInstanceOf[InteractiveState]
  }
}

