package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsFab extends js.Object {
  var actions: js.UndefOr[js.Array[OptionsFab]] = js.undefined
  var alignHorizontally: js.UndefOr[
    reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.left | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.right
  ] = js.undefined
  var alignVertically: js.UndefOr[
    reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.top | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.bottom
  ] = js.undefined
  var backgroundColor: js.UndefOr[Color] = js.undefined
  var clickColor: js.UndefOr[Color] = js.undefined
  var hideOnScroll: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageRequireSource] = js.undefined
  var iconColor: js.UndefOr[Color] = js.undefined
  var id: java.lang.String
  var rippleColor: js.UndefOr[Color] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object OptionsFab {
  @scala.inline
  def apply(
    id: java.lang.String,
    actions: js.Array[OptionsFab] = null,
    alignHorizontally: reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.left | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.right = null,
    alignVertically: reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.top | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.bottom = null,
    backgroundColor: Color = null,
    clickColor: Color = null,
    hideOnScroll: js.UndefOr[scala.Boolean] = js.undefined,
    icon: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageRequireSource] = js.undefined,
    iconColor: Color = null,
    rippleColor: Color = null,
    size: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): OptionsFab = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (alignHorizontally != null) __obj.updateDynamic("alignHorizontally")(alignHorizontally.asInstanceOf[js.Any])
    if (alignVertically != null) __obj.updateDynamic("alignVertically")(alignVertically.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (clickColor != null) __obj.updateDynamic("clickColor")(clickColor)
    if (!js.isUndefined(hideOnScroll)) __obj.updateDynamic("hideOnScroll")(hideOnScroll)
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon)
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor)
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[OptionsFab]
  }
}

