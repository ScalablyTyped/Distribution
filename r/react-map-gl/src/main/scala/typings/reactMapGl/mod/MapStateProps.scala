package typings.reactMapGl.mod

import typings.reactMapGl.reactMapGlStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-map-gl.react-map-gl.ViewportProps & react-map-gl.react-map-gl.InteractiveState> */
@js.native
trait MapStateProps extends js.Object {
  var altitude: js.UndefOr[Double] = js.native
  var bearing: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var latitude: js.UndefOr[Double] = js.native
  var longitude: js.UndefOr[Double] = js.native
  var maxPitch: js.UndefOr[Double] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minPitch: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var pitch: js.UndefOr[Double] = js.native
  var startBearing: js.UndefOr[Double] = js.native
  var startPanLngLat: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var startPitch: js.UndefOr[Double] = js.native
  var startZoom: js.UndefOr[Double] = js.native
  var startZoomLngLat: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var transitionDuration: js.UndefOr[Double | auto] = js.native
  var transitionEasing: js.UndefOr[EasingFunction] = js.native
  var transitionInterpolator: js.UndefOr[TransitionInterpolator] = js.native
  var transitionInterruption: js.UndefOr[TRANSITION_EVENTS] = js.native
  var width: js.UndefOr[Double] = js.native
  var zoom: js.UndefOr[Double] = js.native
}

object MapStateProps {
  @scala.inline
  def apply(): MapStateProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapStateProps]
  }
  @scala.inline
  implicit class MapStatePropsOps[Self <: MapStateProps] (val x: Self) extends AnyVal {
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
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    @scala.inline
    def setBearing(value: Double): Self = this.set("bearing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBearing: Self = this.set("bearing", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    @scala.inline
    def setMaxPitch(value: Double): Self = this.set("maxPitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPitch: Self = this.set("maxPitch", js.undefined)
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setMinPitch(value: Double): Self = this.set("minPitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinPitch: Self = this.set("minPitch", js.undefined)
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePitch: Self = this.set("pitch", js.undefined)
    @scala.inline
    def setStartBearing(value: Double): Self = this.set("startBearing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartBearing: Self = this.set("startBearing", js.undefined)
    @scala.inline
    def setStartPanLngLat(value: js.Tuple2[Double, Double]): Self = this.set("startPanLngLat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartPanLngLat: Self = this.set("startPanLngLat", js.undefined)
    @scala.inline
    def setStartPitch(value: Double): Self = this.set("startPitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartPitch: Self = this.set("startPitch", js.undefined)
    @scala.inline
    def setStartZoom(value: Double): Self = this.set("startZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartZoom: Self = this.set("startZoom", js.undefined)
    @scala.inline
    def setStartZoomLngLat(value: js.Tuple2[Double, Double]): Self = this.set("startZoomLngLat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartZoomLngLat: Self = this.set("startZoomLngLat", js.undefined)
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
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

