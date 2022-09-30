package typings.reactNativeReanimated.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpringConfigWithOrigamiTensionAndFriction extends StObject {
  
  var friction: Adaptable[Double]
  
  var mass: Adaptable[Double]
  
  var overshootClamping: Adaptable[Double] | Boolean
  
  var restDisplacementThreshold: Adaptable[Double]
  
  var restSpeedThreshold: Adaptable[Double]
  
  var tension: Adaptable[Double]
  
  var toValue: Adaptable[Double]
}
object SpringConfigWithOrigamiTensionAndFriction {
  
  inline def apply(
    friction: Adaptable[Double],
    mass: Adaptable[Double],
    overshootClamping: Adaptable[Double] | Boolean,
    restDisplacementThreshold: Adaptable[Double],
    restSpeedThreshold: Adaptable[Double],
    tension: Adaptable[Double],
    toValue: Adaptable[Double]
  ): SpringConfigWithOrigamiTensionAndFriction = {
    val __obj = js.Dynamic.literal(friction = friction.asInstanceOf[js.Any], mass = mass.asInstanceOf[js.Any], overshootClamping = overshootClamping.asInstanceOf[js.Any], restDisplacementThreshold = restDisplacementThreshold.asInstanceOf[js.Any], restSpeedThreshold = restSpeedThreshold.asInstanceOf[js.Any], tension = tension.asInstanceOf[js.Any], toValue = toValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringConfigWithOrigamiTensionAndFriction]
  }
  
  extension [Self <: SpringConfigWithOrigamiTensionAndFriction](x: Self) {
    
    inline def setFriction(value: Adaptable[Double]): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    inline def setFrictionVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "friction", js.Array(value*))
    
    inline def setMass(value: Adaptable[Double]): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    inline def setMassVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "mass", js.Array(value*))
    
    inline def setOvershootClamping(value: Adaptable[Double] | Boolean): Self = StObject.set(x, "overshootClamping", value.asInstanceOf[js.Any])
    
    inline def setOvershootClampingVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "overshootClamping", js.Array(value*))
    
    inline def setRestDisplacementThreshold(value: Adaptable[Double]): Self = StObject.set(x, "restDisplacementThreshold", value.asInstanceOf[js.Any])
    
    inline def setRestDisplacementThresholdVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "restDisplacementThreshold", js.Array(value*))
    
    inline def setRestSpeedThreshold(value: Adaptable[Double]): Self = StObject.set(x, "restSpeedThreshold", value.asInstanceOf[js.Any])
    
    inline def setRestSpeedThresholdVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "restSpeedThreshold", js.Array(value*))
    
    inline def setTension(value: Adaptable[Double]): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
    
    inline def setTensionVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "tension", js.Array(value*))
    
    inline def setToValue(value: Adaptable[Double]): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
    
    inline def setToValueVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "toValue", js.Array(value*))
  }
}
