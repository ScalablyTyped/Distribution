package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsStatusBar extends js.Object {
  /**
    * Set the background color of the status bar
    * #### (Android specific)
    */
  var backgroundColor: js.UndefOr[Color] = js.undefined
  /**
    * Draw screen behind the status bar
    * #### (Android specific)
    */
  var drawBehind: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the text color of the status bar
    * @default 'light'
    */
  var style: js.UndefOr[
    reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.light | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.dark
  ] = js.undefined
  /**
    * Set the status bar visibility
    * @default true
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object OptionsStatusBar {
  @scala.inline
  def apply(
    backgroundColor: Color = null,
    drawBehind: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.light | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.dark = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): OptionsStatusBar = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (!js.isUndefined(drawBehind)) __obj.updateDynamic("drawBehind")(drawBehind)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[OptionsStatusBar]
  }
}

