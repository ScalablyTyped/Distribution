package typings.reactNativeReanimated.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimingConfig extends StObject {
  
  var duration: Adaptable[Double]
  
  var easing: EasingFunction
  
  var toValue: Adaptable[Double]
}
object TimingConfig {
  
  inline def apply(
    duration: Adaptable[Double],
    easing: /* value */ Adaptable[Double] => AnimatedNode[Double],
    toValue: Adaptable[Double]
  ): TimingConfig = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = js.Any.fromFunction1(easing), toValue = toValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimingConfig]
  }
  
  extension [Self <: TimingConfig](x: Self) {
    
    inline def setDuration(value: Adaptable[Double]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "duration", js.Array(value :_*))
    
    inline def setEasing(value: /* value */ Adaptable[Double] => AnimatedNode[Double]): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
    
    inline def setToValue(value: Adaptable[Double]): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
    
    inline def setToValueVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "toValue", js.Array(value :_*))
  }
}
