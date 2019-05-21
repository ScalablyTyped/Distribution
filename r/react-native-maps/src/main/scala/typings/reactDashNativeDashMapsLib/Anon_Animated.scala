package typings
package reactDashNativeDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animated extends js.Object {
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var edgePadding: js.UndefOr[reactDashNativeDashMapsLib.reactDashNativeDashMapsMod.EdgePadding] = js.undefined
}

object Anon_Animated {
  @scala.inline
  def apply(
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    edgePadding: reactDashNativeDashMapsLib.reactDashNativeDashMapsMod.EdgePadding = null
  ): Anon_Animated = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (edgePadding != null) __obj.updateDynamic("edgePadding")(edgePadding)
    __obj.asInstanceOf[Anon_Animated]
  }
}

