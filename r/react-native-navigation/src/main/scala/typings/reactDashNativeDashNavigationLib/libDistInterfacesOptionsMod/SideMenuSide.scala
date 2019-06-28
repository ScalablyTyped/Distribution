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
    * Set the height of the side menu
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Show or hide the side menu
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the width of the side menu
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SideMenuSide {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): SideMenuSide = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideMenuSide]
  }
}

