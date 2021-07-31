package typings.reactNativeReanimated.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpringConfig extends StObject {
  
  var damping: Adaptable[Double]
  
  var mass: Adaptable[Double]
  
  var overshootClamping: Adaptable[Double] | Boolean
  
  var restDisplacementThreshold: Adaptable[Double]
  
  var restSpeedThreshold: Adaptable[Double]
  
  var stiffness: Adaptable[Double]
  
  var toValue: Adaptable[Double]
}
object SpringConfig {
  
  @scala.inline
  def apply(
    damping: Adaptable[Double],
    mass: Adaptable[Double],
    overshootClamping: Adaptable[Double] | Boolean,
    restDisplacementThreshold: Adaptable[Double],
    restSpeedThreshold: Adaptable[Double],
    stiffness: Adaptable[Double],
    toValue: Adaptable[Double]
  ): SpringConfig = {
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], mass = mass.asInstanceOf[js.Any], overshootClamping = overshootClamping.asInstanceOf[js.Any], restDisplacementThreshold = restDisplacementThreshold.asInstanceOf[js.Any], restSpeedThreshold = restSpeedThreshold.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any], toValue = toValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringConfig]
  }
  
  @scala.inline
  implicit class SpringConfigMutableBuilder[Self <: SpringConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDamping(value: Adaptable[Double]): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDampingVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "damping", js.Array(value :_*))
    
    @scala.inline
    def setMass(value: Adaptable[Double]): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMassVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "mass", js.Array(value :_*))
    
    @scala.inline
    def setOvershootClamping(value: Adaptable[Double] | Boolean): Self = StObject.set(x, "overshootClamping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOvershootClampingVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "overshootClamping", js.Array(value :_*))
    
    @scala.inline
    def setRestDisplacementThreshold(value: Adaptable[Double]): Self = StObject.set(x, "restDisplacementThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestDisplacementThresholdVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "restDisplacementThreshold", js.Array(value :_*))
    
    @scala.inline
    def setRestSpeedThreshold(value: Adaptable[Double]): Self = StObject.set(x, "restSpeedThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestSpeedThresholdVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "restSpeedThreshold", js.Array(value :_*))
    
    @scala.inline
    def setStiffness(value: Adaptable[Double]): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStiffnessVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "stiffness", js.Array(value :_*))
    
    @scala.inline
    def setToValue(value: Adaptable[Double]): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToValueVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "toValue", js.Array(value :_*))
  }
}
