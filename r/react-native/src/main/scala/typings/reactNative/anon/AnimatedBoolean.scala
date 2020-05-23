package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimatedBoolean extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
}

object AnimatedBoolean {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined): AnimatedBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedBoolean]
  }
}

