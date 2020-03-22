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
    altitude: Int | Double = null,
    bearing: Int | Double = null,
    height: Int | Double = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    maxPitch: Int | Double = null,
    maxZoom: Int | Double = null,
    minPitch: Int | Double = null,
    minZoom: Int | Double = null,
    pitch: Int | Double = null,
    startBearing: Int | Double = null,
    startPanLngLat: js.Tuple2[Double, Double] = null,
    startPitch: Int | Double = null,
    startZoom: Int | Double = null,
    startZoomLngLat: js.Tuple2[Double, Double] = null,
    transitionDuration: Double | auto = null,
    transitionEasing: /* t */ Double => Double = null,
    transitionInterpolator: TransitionInterpolator = null,
    transitionInterruption: TRANSITION_EVENTS = null,
    width: Int | Double = null,
    zoom: Int | Double = null
  ): MapStateProps = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (maxPitch != null) __obj.updateDynamic("maxPitch")(maxPitch.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minPitch != null) __obj.updateDynamic("minPitch")(minPitch.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (startBearing != null) __obj.updateDynamic("startBearing")(startBearing.asInstanceOf[js.Any])
    if (startPanLngLat != null) __obj.updateDynamic("startPanLngLat")(startPanLngLat.asInstanceOf[js.Any])
    if (startPitch != null) __obj.updateDynamic("startPitch")(startPitch.asInstanceOf[js.Any])
    if (startZoom != null) __obj.updateDynamic("startZoom")(startZoom.asInstanceOf[js.Any])
    if (startZoomLngLat != null) __obj.updateDynamic("startZoomLngLat")(startZoomLngLat.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionEasing != null) __obj.updateDynamic("transitionEasing")(js.Any.fromFunction1(transitionEasing))
    if (transitionInterpolator != null) __obj.updateDynamic("transitionInterpolator")(transitionInterpolator.asInstanceOf[js.Any])
    if (transitionInterruption != null) __obj.updateDynamic("transitionInterruption")(transitionInterruption.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStateProps]
  }
}

