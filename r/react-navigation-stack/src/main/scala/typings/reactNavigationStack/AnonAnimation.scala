package typings.reactNavigationStack

import typings.reactNavigationStack.reactNavigationStackStrings.spring
import typings.reactNavigationStack.vendorTypesMod.TransitionSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimation extends TransitionSpec {
  var animation: spring
  var config: OmitSpringAnimationConfig
}

object AnonAnimation {
  @scala.inline
  def apply(animation: spring, config: OmitSpringAnimationConfig): AnonAnimation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnimation]
  }
}

