package typings.reactNavigationStack

import typings.reactNavigationStack.reactNavigationStackStrings.timing
import typings.reactNavigationStack.vendorTypesMod.TransitionSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfig extends TransitionSpec {
  var animation: timing
  var config: OmitTimingAnimationConfig
}

object AnonConfig {
  @scala.inline
  def apply(animation: timing, config: OmitTimingAnimationConfig): AnonConfig = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConfig]
  }
}

