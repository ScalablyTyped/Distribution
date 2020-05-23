package typings.reactMapGl.mod

import typings.reactMapGl.reactMapGlStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-map-gl.react-map-gl.ViewportProps & react-map-gl.react-map-gl.InteractiveState> */
trait MapStateProps extends js.Object {
  var altitude: js.UndefOr[Double] = js.undefined
  var bearing: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var latitude: js.UndefOr[Double] = js.undefined
  var longitude: js.UndefOr[Double] = js.undefined
  var maxPitch: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minPitch: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var pitch: js.UndefOr[Double] = js.undefined
  var startBearing: js.UndefOr[Double] = js.undefined
  var startPanLngLat: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var startPitch: js.UndefOr[Double] = js.undefined
  var startZoom: js.UndefOr[Double] = js.undefined
  var startZoomLngLat: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var transitionDuration: js.UndefOr[Double | auto] = js.undefined
  var transitionEasing: js.UndefOr[EasingFunction] = js.undefined
  var transitionInterpolator: js.UndefOr[TransitionInterpolator] = js.undefined
  var transitionInterruption: js.UndefOr[TRANSITION_EVENTS] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object MapStateProps {
  @scala.inline
  def apply(
    altitude: js.UndefOr[Double] = js.undefined,
    bearing: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    latitude: js.UndefOr[Double] = js.undefined,
    longitude: js.UndefOr[Double] = js.undefined,
    maxPitch: js.UndefOr[Double] = js.undefined,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minPitch: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    pitch: js.UndefOr[Double] = js.undefined,
    startBearing: js.UndefOr[Double] = js.undefined,
    startPanLngLat: js.Tuple2[Double, Double] = null,
    startPitch: js.UndefOr[Double] = js.undefined,
    startZoom: js.UndefOr[Double] = js.undefined,
    startZoomLngLat: js.Tuple2[Double, Double] = null,
    transitionDuration: Double | auto = null,
    transitionEasing: /* t */ Double => Double = null,
    transitionInterpolator: TransitionInterpolator = null,
    transitionInterruption: TRANSITION_EVENTS = null,
    width: js.UndefOr[Double] = js.undefined,
    zoom: js.UndefOr[Double] = js.undefined
  ): MapStateProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bearing)) __obj.updateDynamic("bearing")(bearing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPitch)) __obj.updateDynamic("maxPitch")(maxPitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minPitch)) __obj.updateDynamic("minPitch")(minPitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startBearing)) __obj.updateDynamic("startBearing")(startBearing.get.asInstanceOf[js.Any])
    if (startPanLngLat != null) __obj.updateDynamic("startPanLngLat")(startPanLngLat.asInstanceOf[js.Any])
    if (!js.isUndefined(startPitch)) __obj.updateDynamic("startPitch")(startPitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startZoom)) __obj.updateDynamic("startZoom")(startZoom.get.asInstanceOf[js.Any])
    if (startZoomLngLat != null) __obj.updateDynamic("startZoomLngLat")(startZoomLngLat.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionEasing != null) __obj.updateDynamic("transitionEasing")(js.Any.fromFunction1(transitionEasing))
    if (transitionInterpolator != null) __obj.updateDynamic("transitionInterpolator")(transitionInterpolator.asInstanceOf[js.Any])
    if (transitionInterruption != null) __obj.updateDynamic("transitionInterruption")(transitionInterruption.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStateProps]
  }
}

