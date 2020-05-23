package typings.reactMapGl.mod

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
    startBearing: js.UndefOr[Double] = js.undefined,
    startPanLngLat: js.Tuple2[Double, Double] = null,
    startPitch: js.UndefOr[Double] = js.undefined,
    startZoom: js.UndefOr[Double] = js.undefined,
    startZoomLngLat: js.Tuple2[Double, Double] = null
  ): InteractiveState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(startBearing)) __obj.updateDynamic("startBearing")(startBearing.get.asInstanceOf[js.Any])
    if (startPanLngLat != null) __obj.updateDynamic("startPanLngLat")(startPanLngLat.asInstanceOf[js.Any])
    if (!js.isUndefined(startPitch)) __obj.updateDynamic("startPitch")(startPitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startZoom)) __obj.updateDynamic("startZoom")(startZoom.get.asInstanceOf[js.Any])
    if (startZoomLngLat != null) __obj.updateDynamic("startZoomLngLat")(startZoomLngLat.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveState]
  }
}

