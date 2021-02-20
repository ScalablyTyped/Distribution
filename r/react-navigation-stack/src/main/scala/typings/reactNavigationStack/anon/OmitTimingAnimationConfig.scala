package typings.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<react-native.react-native.Animated.TimingAnimationConfig, 'toValue' | keyof react-native.react-native.Animated.AnimationConfig> */
@js.native
trait OmitTimingAnimationConfig extends StObject {
  
  var delay: js.UndefOr[Double] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easing: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.native
}
object OmitTimingAnimationConfig {
  
  @scala.inline
  def apply(): OmitTimingAnimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitTimingAnimationConfig]
  }
  
  @scala.inline
  implicit class OmitTimingAnimationConfigMutableBuilder[Self <: OmitTimingAnimationConfig] (val x: Self) extends AnyVal {
    
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
  }
}
