package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimatedOffset extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var offset: Double
}

object AnimatedOffset {
  @scala.inline
  def apply(offset: Double, animated: js.UndefOr[Boolean] = js.undefined): AnimatedOffset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedOffset]
  }
}

