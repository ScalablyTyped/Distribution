package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimatedBoolean extends js.Object {
  var animated: js.UndefOr[Boolean | Null] = js.undefined
}

object AnonAnimatedBoolean {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined): AnonAnimatedBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimatedBoolean]
  }
}

