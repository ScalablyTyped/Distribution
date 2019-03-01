package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideMenuSide extends js.Object {
  /**
    * Enable or disable the side menu
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Show or hide the side menu
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object SideMenuSide {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): SideMenuSide = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[SideMenuSide]
  }
}

