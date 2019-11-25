package typings.reactDashMapDashGl.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportProps extends js.Object {
  var altitude: Double
  var bearing: Double
  var height: Double
  var latitude: Double
  var longitude: Double
  var maxPitch: Double
  var maxZoom: Double
  var minPitch: Double
  var minZoom: Double
  var pitch: Double
  var transitionDuration: js.UndefOr[Double] = js.undefined
  var transitionEasing: js.UndefOr[EasingFunction] = js.undefined
  var transitionInterpolator: js.UndefOr[TransitionInterpolator] = js.undefined
  var transitionInterruption: js.UndefOr[TRANSITION_EVENTS] = js.undefined
  var width: Double
  var zoom: Double
}

object ViewportProps {
  @scala.inline
  def apply(
    altitude: Double,
    bearing: Double,
    height: Double,
    latitude: Double,
    longitude: Double,
    maxPitch: Double,
    maxZoom: Double,
    minPitch: Double,
    minZoom: Double,
    pitch: Double,
    width: Double,
    zoom: Double,
    transitionDuration: Int | Double = null,
    transitionEasing: /* t */ Double => Double = null,
    transitionInterpolator: TransitionInterpolator = null,
    transitionInterruption: TRANSITION_EVENTS = null
  ): ViewportProps = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], bearing = bearing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], maxPitch = maxPitch.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minPitch = minPitch.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionEasing != null) __obj.updateDynamic("transitionEasing")(js.Any.fromFunction1(transitionEasing))
    if (transitionInterpolator != null) __obj.updateDynamic("transitionInterpolator")(transitionInterpolator.asInstanceOf[js.Any])
    if (transitionInterruption != null) __obj.updateDynamic("transitionInterruption")(transitionInterruption.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportProps]
  }
}

