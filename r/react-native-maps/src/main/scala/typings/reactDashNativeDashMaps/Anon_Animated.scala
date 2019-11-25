package typings.reactDashNativeDashMaps

import typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod.EdgePadding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animated extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var edgePadding: js.UndefOr[EdgePadding] = js.undefined
}

object Anon_Animated {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined, edgePadding: EdgePadding = null): Anon_Animated = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (edgePadding != null) __obj.updateDynamic("edgePadding")(edgePadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Animated]
  }
}

