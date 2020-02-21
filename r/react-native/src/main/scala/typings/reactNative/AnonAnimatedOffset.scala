package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimatedOffset extends js.Object {
  var animated: js.UndefOr[Boolean | Null] = js.undefined
  var offset: Double
}

object AnonAnimatedOffset {
  @scala.inline
  def apply(offset: Double, animated: js.UndefOr[Boolean] = js.undefined): AnonAnimatedOffset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimatedOffset]
  }
}

