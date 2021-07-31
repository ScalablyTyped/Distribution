package typings.reactNativeMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// =======================================================================
//  AnimatedRegion
// =======================================================================
/* Inlined parent react-native.react-native.Animated.AnimationConfig */
/* Inlined parent std.Partial<react-native-maps.react-native-maps.Region> */
trait AnimatedRegionTimingConfig extends StObject {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
  
  var isInteraction: js.UndefOr[Boolean] = js.undefined
  
  var latitude: js.UndefOr[Double] = js.undefined
  
  var latitudeDelta: js.UndefOr[Double] = js.undefined
  
  var longitude: js.UndefOr[Double] = js.undefined
  
  var longitudeDelta: js.UndefOr[Double] = js.undefined
  
  var useNativeDriver: Boolean
}
object AnimatedRegionTimingConfig {
  
  @scala.inline
  def apply(useNativeDriver: Boolean): AnimatedRegionTimingConfig = {
    val __obj = js.Dynamic.literal(useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedRegionTimingConfig]
  }
  
  @scala.inline
  implicit class AnimatedRegionTimingConfigMutableBuilder[Self <: AnimatedRegionTimingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: /* value */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeDelta(value: Double): Self = StObject.set(x, "latitudeDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeDeltaUndefined: Self = StObject.set(x, "latitudeDelta", js.undefined)
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeDelta(value: Double): Self = StObject.set(x, "longitudeDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeDeltaUndefined: Self = StObject.set(x, "longitudeDelta", js.undefined)
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
  }
}
