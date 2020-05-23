package typings.reactNavigationStack.anon

import typings.reactNavigationStack.reactNavigationStackStrings.timing
import typings.reactNavigationStack.vendorTypesMod.TransitionSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends TransitionSpec {
  var animation: timing
  var config: OmitTimingAnimationConfig
}

object Config {
  @scala.inline
  def apply(animation: timing, config: OmitTimingAnimationConfig): Config = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

