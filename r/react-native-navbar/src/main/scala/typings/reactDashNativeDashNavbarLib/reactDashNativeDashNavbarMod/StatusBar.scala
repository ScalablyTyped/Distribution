package typings
package reactDashNativeDashNavbarLib.reactDashNativeDashNavbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBar extends js.Object {
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var hideAnimation: js.UndefOr[
    reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.fade | reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.slide | reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.none
  ] = js.undefined
  var showAnimation: js.UndefOr[
    reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.fade | reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.slide | reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.none
  ] = js.undefined
  var style: js.UndefOr[
    reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.`light-content` | reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.default
  ] = js.undefined
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
}

object StatusBar {
  @scala.inline
  def apply(
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    hideAnimation: reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.fade | reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.slide | reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.none = null,
    showAnimation: reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.fade | reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.slide | reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.none = null,
    style: reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.`light-content` | reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.default = null,
    tintColor: java.lang.String = null
  ): StatusBar = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hideAnimation != null) __obj.updateDynamic("hideAnimation")(hideAnimation.asInstanceOf[js.Any])
    if (showAnimation != null) __obj.updateDynamic("showAnimation")(showAnimation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    __obj.asInstanceOf[StatusBar]
  }
}

