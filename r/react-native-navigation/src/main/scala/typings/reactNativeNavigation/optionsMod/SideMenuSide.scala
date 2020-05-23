package typings.reactNativeNavigation.optionsMod

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
    * Stretch sideMenu contents when opened past the width
    * #### (iOS specific)
    * @default true
    */
  var shouldStretchDrawer: js.UndefOr[Boolean] = js.undefined
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
    height: js.UndefOr[Double] = js.undefined,
    shouldStretchDrawer: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): SideMenuSide = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldStretchDrawer)) __obj.updateDynamic("shouldStretchDrawer")(shouldStretchDrawer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideMenuSide]
  }
}

