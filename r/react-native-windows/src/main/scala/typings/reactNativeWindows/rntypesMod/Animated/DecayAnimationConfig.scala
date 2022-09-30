package typings.reactNativeWindows.rntypesMod.Animated

import typings.reactNativeWindows.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecayAnimationConfig
  extends StObject
     with AnimationConfig {
  
  var deceleration: js.UndefOr[Double] = js.undefined
  
  var velocity: Double | X
}
object DecayAnimationConfig {
  
  inline def apply(useNativeDriver: Boolean, velocity: Double | X): DecayAnimationConfig = {
    val __obj = js.Dynamic.literal(useNativeDriver = useNativeDriver.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecayAnimationConfig]
  }
  
  extension [Self <: DecayAnimationConfig](x: Self) {
    
    inline def setDeceleration(value: Double): Self = StObject.set(x, "deceleration", value.asInstanceOf[js.Any])
    
    inline def setDecelerationUndefined: Self = StObject.set(x, "deceleration", js.undefined)
    
    inline def setVelocity(value: Double | X): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
