package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithDecayConfig extends StObject {
  
  var clamp: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var deceleration: js.UndefOr[Double] = js.undefined
  
  var velocity: js.UndefOr[Double] = js.undefined
  
  var velocityFactor: js.UndefOr[Double] = js.undefined
}
object WithDecayConfig {
  
  inline def apply(): WithDecayConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithDecayConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WithDecayConfig] (val x: Self) extends AnyVal {
    
    inline def setClamp(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
    
    inline def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
    
    inline def setDeceleration(value: Double): Self = StObject.set(x, "deceleration", value.asInstanceOf[js.Any])
    
    inline def setDecelerationUndefined: Self = StObject.set(x, "deceleration", js.undefined)
    
    inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    inline def setVelocityFactor(value: Double): Self = StObject.set(x, "velocityFactor", value.asInstanceOf[js.Any])
    
    inline def setVelocityFactorUndefined: Self = StObject.set(x, "velocityFactor", js.undefined)
    
    inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}
