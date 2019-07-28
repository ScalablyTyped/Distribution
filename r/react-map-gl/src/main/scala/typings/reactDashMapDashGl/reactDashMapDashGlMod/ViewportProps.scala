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
    transitionEasing: EasingFunction = null,
    transitionInterpolator: TransitionInterpolator = null,
    transitionInterruption: TRANSITION_EVENTS = null
  ): ViewportProps = {
    val __obj = js.Dynamic.literal(altitude = altitude, bearing = bearing, height = height, latitude = latitude, longitude = longitude, maxPitch = maxPitch, maxZoom = maxZoom, minPitch = minPitch, minZoom = minZoom, pitch = pitch, width = width, zoom = zoom)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionEasing != null) __obj.updateDynamic("transitionEasing")(transitionEasing)
    if (transitionInterpolator != null) __obj.updateDynamic("transitionInterpolator")(transitionInterpolator)
    if (transitionInterruption != null) __obj.updateDynamic("transitionInterruption")(transitionInterruption)
    __obj.asInstanceOf[ViewportProps]
  }
}

