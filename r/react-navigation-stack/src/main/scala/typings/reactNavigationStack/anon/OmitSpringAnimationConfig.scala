package typings.reactNavigationStack.anon

import typings.reactNative.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<react-native.react-native.Animated.SpringAnimationConfig, 'toValue' | keyof react-native.react-native.Animated.AnimationConfig> */
@js.native
trait OmitSpringAnimationConfig extends StObject {
  
  var bounciness: js.UndefOr[Double] = js.native
  
  var damping: js.UndefOr[Double] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var friction: js.UndefOr[Double] = js.native
  
  var mass: js.UndefOr[Double] = js.native
  
  var overshootClamping: js.UndefOr[Boolean] = js.native
  
  var restDisplacementThreshold: js.UndefOr[Double] = js.native
  
  var restSpeedThreshold: js.UndefOr[Double] = js.native
  
  var speed: js.UndefOr[Double] = js.native
  
  var stiffness: js.UndefOr[Double] = js.native
  
  var tension: js.UndefOr[Double] = js.native
  
  var velocity: js.UndefOr[Double | X] = js.native
}
object OmitSpringAnimationConfig {
  
  @scala.inline
  def apply(): OmitSpringAnimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitSpringAnimationConfig]
  }
  
  @scala.inline
  implicit class OmitSpringAnimationConfigMutableBuilder[Self <: OmitSpringAnimationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounciness(value: Double): Self = StObject.set(x, "bounciness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBouncinessUndefined: Self = StObject.set(x, "bounciness", js.undefined)
    
    @scala.inline
    def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
    
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
    def setVelocity(value: Double | X): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}
