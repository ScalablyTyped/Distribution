package typings.reactNativeReanimated.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecayConfig extends StObject {
  
  var deceleration: Adaptable[Double]
}
object DecayConfig {
  
  @scala.inline
  def apply(deceleration: Adaptable[Double]): DecayConfig = {
    val __obj = js.Dynamic.literal(deceleration = deceleration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecayConfig]
  }
  
  @scala.inline
  implicit class DecayConfigMutableBuilder[Self <: DecayConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeceleration(value: Adaptable[Double]): Self = StObject.set(x, "deceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecelerationVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "deceleration", js.Array(value :_*))
  }
}
