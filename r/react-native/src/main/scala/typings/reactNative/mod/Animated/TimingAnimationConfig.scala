package typings.reactNative.mod.Animated

import typings.reactNative.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimingAnimationConfig
  extends StObject
     with AnimationConfig {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
  
  var toValue: Double | AnimatedValue | X | AnimatedValueXY | AnimatedInterpolation
}
object TimingAnimationConfig {
  
  @scala.inline
  def apply(
    toValue: Double | AnimatedValue | X | AnimatedValueXY | AnimatedInterpolation,
    useNativeDriver: Boolean
  ): TimingAnimationConfig = {
    val __obj = js.Dynamic.literal(toValue = toValue.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimingAnimationConfig]
  }
  
  @scala.inline
  implicit class TimingAnimationConfigMutableBuilder[Self <: TimingAnimationConfig] (val x: Self) extends AnyVal {
    
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
    def setToValue(value: Double | AnimatedValue | X | AnimatedValueXY | AnimatedInterpolation): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
  }
}
