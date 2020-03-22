package typings.reactNavigationStack.vendorTypesMod

import typings.reactNavigationStack.OmitSpringAnimationConfig
import typings.reactNavigationStack.OmitTimingAnimationConfig
import typings.reactNavigationStack.reactNavigationStackStrings.spring
import typings.reactNavigationStack.reactNavigationStackStrings.timing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNavigationStack.AnonAnimation
  - typings.reactNavigationStack.AnonConfig
*/
trait TransitionSpec extends js.Object

object TransitionSpec {
  @scala.inline
  def AnonAnimation(animation: spring, config: OmitSpringAnimationConfig): TransitionSpec = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransitionSpec]
  }
  @scala.inline
  def AnonConfig(animation: timing, config: OmitTimingAnimationConfig): TransitionSpec = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransitionSpec]
  }
}

