package typings.reactNative.mod.Animated

import typings.reactNative.anon.X
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
  implicit class DecayAnimationConfigOps[Self <: DecayAnimationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVelocity(value: Double | X): Self = this.set("velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeceleration(value: Double): Self = this.set("deceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeceleration: Self = this.set("deceleration", js.undefined)
  }
}
