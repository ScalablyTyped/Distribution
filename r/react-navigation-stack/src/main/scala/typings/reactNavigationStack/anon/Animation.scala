package typings.reactNavigationStack.anon

import typings.reactNavigationStack.reactNavigationStackStrings.spring
import typings.reactNavigationStack.vendorTypesMod.TransitionSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation extends TransitionSpec {
  
  var animation: spring = js.native
  
  var config: OmitSpringAnimationConfig = js.native
}
object Animation {
  
  @scala.inline
  def apply(animation: spring, config: OmitSpringAnimationConfig): Animation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit class AnimationMutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: spring): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: OmitSpringAnimationConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
  }
}
