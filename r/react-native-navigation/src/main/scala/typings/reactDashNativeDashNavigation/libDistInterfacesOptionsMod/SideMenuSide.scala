package typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideMenuSide extends js.Object {
  /**
    * Enable or disable the side menu
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the height of the side menu
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Show or hide the side menu
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the width of the side menu
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SideMenuSide {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): SideMenuSide = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideMenuSide]
  }
}

