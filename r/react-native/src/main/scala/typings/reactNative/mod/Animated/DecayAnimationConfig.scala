package typings.reactNative.mod.Animated

import typings.reactNative.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecayAnimationConfig extends AnimationConfig {
  
  var deceleration: js.UndefOr[Double] = js.native
  
  var velocity: Double | X = js.native
}
object DecayAnimationConfig {
  
  @scala.inline
  def apply(useNativeDriver: Boolean, velocity: Double | X): DecayAnimationConfig = {
    val __obj = js.Dynamic.literal(useNativeDriver = useNativeDriver.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecayAnimationConfig]
  }
  
  @scala.inline
  implicit class DecayAnimationConfigMutableBuilder[Self <: DecayAnimationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeceleration(value: Double): Self = StObject.set(x, "deceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecelerationUndefined: Self = StObject.set(x, "deceleration", js.undefined)
    
    @scala.inline
    def setVelocity(value: Double | X): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
