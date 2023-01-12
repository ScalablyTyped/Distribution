package typings.reactNativeDraggableFlatlist.anon

import typings.reactNativeReanimated.mod.Animated.Adaptable
import typings.reactNativeReanimated.mod.Animated.AnimatedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-reanimated.react-native-reanimated.default.SpringConfig> */
trait PartialSpringConfig extends StObject {
  
  var damping: js.UndefOr[Adaptable[Double]] = js.undefined
  
  var mass: js.UndefOr[Adaptable[Double]] = js.undefined
  
  var overshootClamping: js.UndefOr[Adaptable[Double] | Boolean] = js.undefined
  
  var restDisplacementThreshold: js.UndefOr[Adaptable[Double]] = js.undefined
  
  var restSpeedThreshold: js.UndefOr[Adaptable[Double]] = js.undefined
  
  var stiffness: js.UndefOr[Adaptable[Double]] = js.undefined
  
  var toValue: js.UndefOr[Adaptable[Double]] = js.undefined
}
object PartialSpringConfig {
  
  inline def apply(): PartialSpringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSpringConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSpringConfig] (val x: Self) extends AnyVal {
    
    inline def setDamping(value: Adaptable[Double]): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
    
    inline def setDampingVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "damping", js.Array(value*))
    
    inline def setMass(value: Adaptable[Double]): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    inline def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
    
    inline def setMassVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "mass", js.Array(value*))
    
    inline def setOvershootClamping(value: Adaptable[Double] | Boolean): Self = StObject.set(x, "overshootClamping", value.asInstanceOf[js.Any])
    
    inline def setOvershootClampingUndefined: Self = StObject.set(x, "overshootClamping", js.undefined)
    
    inline def setOvershootClampingVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "overshootClamping", js.Array(value*))
    
    inline def setRestDisplacementThreshold(value: Adaptable[Double]): Self = StObject.set(x, "restDisplacementThreshold", value.asInstanceOf[js.Any])
    
    inline def setRestDisplacementThresholdUndefined: Self = StObject.set(x, "restDisplacementThreshold", js.undefined)
    
    inline def setRestDisplacementThresholdVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "restDisplacementThreshold", js.Array(value*))
    
    inline def setRestSpeedThreshold(value: Adaptable[Double]): Self = StObject.set(x, "restSpeedThreshold", value.asInstanceOf[js.Any])
    
    inline def setRestSpeedThresholdUndefined: Self = StObject.set(x, "restSpeedThreshold", js.undefined)
    
    inline def setRestSpeedThresholdVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "restSpeedThreshold", js.Array(value*))
    
    inline def setStiffness(value: Adaptable[Double]): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    
    inline def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
    
    inline def setStiffnessVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "stiffness", js.Array(value*))
    
    inline def setToValue(value: Adaptable[Double]): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
    
    inline def setToValueUndefined: Self = StObject.set(x, "toValue", js.undefined)
    
    inline def setToValueVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "toValue", js.Array(value*))
  }
}
