package typings.reactNativeReanimated.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecayConfig extends StObject {
  
  var deceleration: Adaptable[Double]
}
object DecayConfig {
  
  inline def apply(deceleration: Adaptable[Double]): DecayConfig = {
    val __obj = js.Dynamic.literal(deceleration = deceleration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecayConfig]
  }
  
  extension [Self <: DecayConfig](x: Self) {
    
    inline def setDeceleration(value: Adaptable[Double]): Self = StObject.set(x, "deceleration", value.asInstanceOf[js.Any])
    
    inline def setDecelerationVarargs(value: (Double | AnimatedNode[Double] | (js.Array[Double | AnimatedNode[Double]]))*): Self = StObject.set(x, "deceleration", js.Array(value*))
  }
}
