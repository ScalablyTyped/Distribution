package typings.reactMapGl.mod

import typings.reactMapGl.reactMapGlStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewportProps extends js.Object {
  var altitude: Double = js.native
  var bearing: Double = js.native
  var height: Double = js.native
  var latitude: Double = js.native
  var longitude: Double = js.native
  var maxPitch: Double = js.native
  var maxZoom: Double = js.native
  var minPitch: Double = js.native
  var minZoom: Double = js.native
  var pitch: Double = js.native
  var transitionDuration: js.UndefOr[Double | auto] = js.native
  var transitionEasing: js.UndefOr[EasingFunction] = js.native
  var transitionInterpolator: js.UndefOr[TransitionInterpolator] = js.native
  var transitionInterruption: js.UndefOr[TRANSITION_EVENTS] = js.native
  var width: Double = js.native
  var zoom: Double = js.native
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
    zoom: Double
  ): ViewportProps = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], bearing = bearing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], maxPitch = maxPitch.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minPitch = minPitch.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportProps]
  }
  @scala.inline
  implicit class ViewportPropsOps[Self <: ViewportProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setBearing(value: Double): Self = this.set("bearing", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxPitch(value: Double): Self = this.set("maxPitch", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinPitch(value: Double): Self = this.set("minPitch", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionDuration(value: Double | auto): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    @scala.inline
    def setTransitionEasing(value: /* t */ Double => Double): Self = this.set("transitionEasing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransitionEasing: Self = this.set("transitionEasing", js.undefined)
    @scala.inline
    def setTransitionInterpolator(value: TransitionInterpolator): Self = this.set("transitionInterpolator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionInterpolator: Self = this.set("transitionInterpolator", js.undefined)
    @scala.inline
    def setTransitionInterruption(value: TRANSITION_EVENTS): Self = this.set("transitionInterruption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionInterruption: Self = this.set("transitionInterruption", js.undefined)
  }
  
}

