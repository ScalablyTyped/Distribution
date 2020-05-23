package typings.reactNativeMaps.anon

import typings.reactNativeMaps.mod.EdgePadding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animated extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var edgePadding: js.UndefOr[EdgePadding] = js.undefined
}

object Animated {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined, edgePadding: EdgePadding = null): Animated = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (edgePadding != null) __obj.updateDynamic("edgePadding")(edgePadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animated]
  }
}

