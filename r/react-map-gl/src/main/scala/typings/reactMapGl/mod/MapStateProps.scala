package typings.reactMapGl.mod

import typings.reactMapGl.reactMapGlStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-map-gl.react-map-gl.ViewportProps & react-map-gl.react-map-gl.InteractiveState> */
trait MapStateProps extends StObject {
  
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
  def apply(): MapStateProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapStateProps]
  }
  
  @scala.inline
  implicit class MapStatePropsMutableBuilder[Self <: MapStateProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    @scala.inline
    def setMaxPitch(value: Double): Self = StObject.set(x, "maxPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPitchUndefined: Self = StObject.set(x, "maxPitch", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMinPitch(value: Double): Self = StObject.set(x, "minPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPitchUndefined: Self = StObject.set(x, "minPitch", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    @scala.inline
    def setStartBearing(value: Double): Self = StObject.set(x, "startBearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartBearingUndefined: Self = StObject.set(x, "startBearing", js.undefined)
    
    @scala.inline
    def setStartPanLngLat(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "startPanLngLat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPanLngLatUndefined: Self = StObject.set(x, "startPanLngLat", js.undefined)
    
    @scala.inline
    def setStartPitch(value: Double): Self = StObject.set(x, "startPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPitchUndefined: Self = StObject.set(x, "startPitch", js.undefined)
    
    @scala.inline
    def setStartZoom(value: Double): Self = StObject.set(x, "startZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartZoomLngLat(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "startZoomLngLat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartZoomLngLatUndefined: Self = StObject.set(x, "startZoomLngLat", js.undefined)
    
    @scala.inline
    def setStartZoomUndefined: Self = StObject.set(x, "startZoom", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double | auto): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    @scala.inline
    def setTransitionEasing(value: /* t */ Double => Double): Self = StObject.set(x, "transitionEasing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransitionEasingUndefined: Self = StObject.set(x, "transitionEasing", js.undefined)
    
    @scala.inline
    def setTransitionInterpolator(value: TransitionInterpolator): Self = StObject.set(x, "transitionInterpolator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionInterpolatorUndefined: Self = StObject.set(x, "transitionInterpolator", js.undefined)
    
    @scala.inline
    def setTransitionInterruption(value: TRANSITION_EVENTS): Self = StObject.set(x, "transitionInterruption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionInterruptionUndefined: Self = StObject.set(x, "transitionInterruption", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
