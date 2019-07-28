package typings.reactDashMapDashGl.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractiveState extends js.Object {
  var startBearing: js.UndefOr[Double] = js.undefined
  var startPanLngLat: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var startPitch: js.UndefOr[Double] = js.undefined
  var startZoom: js.UndefOr[Double] = js.undefined
  var startZoomLngLat: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object InteractiveState {
  @scala.inline
  def apply(
    startBearing: Int | Double = null,
    startPanLngLat: js.Tuple2[Double, Double] = null,
    startPitch: Int | Double = null,
    startZoom: Int | Double = null,
    startZoomLngLat: js.Tuple2[Double, Double] = null
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

