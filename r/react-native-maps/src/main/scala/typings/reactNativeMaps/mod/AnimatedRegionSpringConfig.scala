package typings.reactNativeMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent react-native.react-native.Animated.AnimationConfig */
/* Inlined parent std.Partial<react-native-maps.react-native-maps.Region> */
@js.native
trait AnimatedRegionSpringConfig extends StObject {
  
  var bounciness: js.UndefOr[Double] = js.native
  
  var damping: js.UndefOr[Double] = js.native
  
  var friction: js.UndefOr[Double] = js.native
  
  var isInteraction: js.UndefOr[Boolean] = js.native
  
  var latitude: js.UndefOr[Double] = js.native
  
  var latitudeDelta: js.UndefOr[Double] = js.native
  
  var longitude: js.UndefOr[Double] = js.native
  
  var longitudeDelta: js.UndefOr[Double] = js.native
  
  var mass: js.UndefOr[Double] = js.native
  
  var overshootClamping: js.UndefOr[Boolean] = js.native
  
  var restDisplacementThreshold: js.UndefOr[Double] = js.native
  
  var restSpeedThreshold: js.UndefOr[Double] = js.native
  
  var speed: js.UndefOr[Double] = js.native
  
  var stiffness: js.UndefOr[Double] = js.native
  
  var tension: js.UndefOr[Double] = js.native
  
  var useNativeDriver: Boolean = js.native
  
  var velocity: js.UndefOr[Double | Point] = js.native
}
object AnimatedRegionSpringConfig {
  
  @scala.inline
  def apply(useNativeDriver: Boolean): AnimatedRegionSpringConfig = {
    val __obj = js.Dynamic.literal(useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedRegionSpringConfig]
  }
  
  @scala.inline
  implicit class AnimatedRegionSpringConfigMutableBuilder[Self <: AnimatedRegionSpringConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounciness(value: Double): Self = StObject.set(x, "bounciness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBouncinessUndefined: Self = StObject.set(x, "bounciness", js.undefined)
    
    @scala.inline
    def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
    
    @scala.inline
    def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
    
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
    def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
    
    @scala.inline
    def setOvershootClamping(value: Boolean): Self = StObject.set(x, "overshootClamping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOvershootClampingUndefined: Self = StObject.set(x, "overshootClamping", js.undefined)
    
    @scala.inline
    def setRestDisplacementThreshold(value: Double): Self = StObject.set(x, "restDisplacementThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestDisplacementThresholdUndefined: Self = StObject.set(x, "restDisplacementThreshold", js.undefined)
    
    @scala.inline
    def setRestSpeedThreshold(value: Double): Self = StObject.set(x, "restSpeedThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestSpeedThresholdUndefined: Self = StObject.set(x, "restSpeedThreshold", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    @scala.inline
    def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
    
    @scala.inline
    def setTension(value: Double): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
    
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocity(value: Double | Point): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}
