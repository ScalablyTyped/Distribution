package typings.reactNativeReanimated.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpringConfigWithBouncinessAndSpeed extends StObject {
  
  var bounciness: Adaptable[Double]
  
  var mass: Adaptable[Double]
  
  var overshootClamping: Adaptable[Double] | Boolean
  
  var restDisplacementThreshold: Adaptable[Double]
  
  var restSpeedThreshold: Adaptable[Double]
  
  var speed: Adaptable[Double]
  
  var toValue: Adaptable[Double]
}
object SpringConfigWithBouncinessAndSpeed {
  
  inline def apply(
    bounciness: Adaptable[Double],
    mass: Adaptable[Double],
    overshootClamping: Adaptable[Double] | Boolean,
    restDisplacementThreshold: Adaptable[Double],
    restSpeedThreshold: Adaptable[Double],
    speed: Adaptable[Double],
    toValue: Adaptable[Double]
  ): SpringConfigWithBouncinessAndSpeed = {
    val __obj = js.Dynamic.literal(bounciness = bounciness.asInstanceOf[js.Any], mass = mass.asInstanceOf[js.Any], overshootClamping = overshootClamping.asInstanceOf[js.Any], restDisplacementThreshold = restDisplacementThreshold.asInstanceOf[js.Any], restSpeedThreshold = restSpeedThreshold.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], toValue = toValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringConfigWithBouncinessAndSpeed]
  }
  
  extension [Self <: SpringConfigWithBouncinessAndSpeed](x: Self) {
    
    inline def setBounciness(value: Adaptable[Double]): Self = StObject.set(x, "bounciness", value.asInstanceOf[js.Any])
    
    inline def setBouncinessVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "bounciness", js.Array(value*))
    
    inline def setMass(value: Adaptable[Double]): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    inline def setMassVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "mass", js.Array(value*))
    
    inline def setOvershootClamping(value: Adaptable[Double] | Boolean): Self = StObject.set(x, "overshootClamping", value.asInstanceOf[js.Any])
    
    inline def setOvershootClampingVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "overshootClamping", js.Array(value*))
    
    inline def setRestDisplacementThreshold(value: Adaptable[Double]): Self = StObject.set(x, "restDisplacementThreshold", value.asInstanceOf[js.Any])
    
    inline def setRestDisplacementThresholdVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "restDisplacementThreshold", js.Array(value*))
    
    inline def setRestSpeedThreshold(value: Adaptable[Double]): Self = StObject.set(x, "restSpeedThreshold", value.asInstanceOf[js.Any])
    
    inline def setRestSpeedThresholdVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "restSpeedThreshold", js.Array(value*))
    
    inline def setSpeed(value: Adaptable[Double]): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "speed", js.Array(value*))
    
    inline def setToValue(value: Adaptable[Double]): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
    
    inline def setToValueVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "toValue", js.Array(value*))
  }
}
