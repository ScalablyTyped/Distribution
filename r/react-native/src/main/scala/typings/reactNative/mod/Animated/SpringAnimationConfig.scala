package typings.reactNative.mod.Animated

import typings.reactNative.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpringAnimationConfig
  extends StObject
     with AnimationConfig {
  
  var bounciness: js.UndefOr[Double] = js.undefined
  
  var damping: js.UndefOr[Double] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var friction: js.UndefOr[Double] = js.undefined
  
  var mass: js.UndefOr[Double] = js.undefined
  
  var overshootClamping: js.UndefOr[Boolean] = js.undefined
  
  var restDisplacementThreshold: js.UndefOr[Double] = js.undefined
  
  var restSpeedThreshold: js.UndefOr[Double] = js.undefined
  
  var speed: js.UndefOr[Double] = js.undefined
  
  var stiffness: js.UndefOr[Double] = js.undefined
  
  var tension: js.UndefOr[Double] = js.undefined
  
  var toValue: Double | AnimatedValue | X | AnimatedValueXY
  
  var velocity: js.UndefOr[Double | X] = js.undefined
}
object SpringAnimationConfig {
  
  @scala.inline
  def apply(toValue: Double | AnimatedValue | X | AnimatedValueXY, useNativeDriver: Boolean): SpringAnimationConfig = {
    val __obj = js.Dynamic.literal(toValue = toValue.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringAnimationConfig]
  }
  
  @scala.inline
  implicit class SpringAnimationConfigMutableBuilder[Self <: SpringAnimationConfig] (val x: Self) extends AnyVal {
    
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
    def setToValue(value: Double | AnimatedValue | X | AnimatedValueXY): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocity(value: Double | X): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}
