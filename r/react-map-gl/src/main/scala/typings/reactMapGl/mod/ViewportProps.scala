package typings.reactMapGl.mod

import typings.reactMapGl.reactMapGlStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewportProps extends StObject {
  
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
  
  var transitionDuration: js.UndefOr[Double | auto] = js.undefined
  
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
    zoom: Double
  ): ViewportProps = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], bearing = bearing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], maxPitch = maxPitch.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minPitch = minPitch.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportProps]
  }
  
  @scala.inline
  implicit class ViewportPropsMutableBuilder[Self <: ViewportProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPitch(value: Double): Self = StObject.set(x, "maxPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPitch(value: Double): Self = StObject.set(x, "minPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
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
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
