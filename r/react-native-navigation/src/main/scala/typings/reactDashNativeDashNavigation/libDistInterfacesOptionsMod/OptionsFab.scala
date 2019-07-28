package typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod

import typings.reactDashNative.reactDashNativeMod.ImageRequireSource
import typings.reactDashNativeDashNavigation.reactDashNativeDashNavigationStrings.bottom
import typings.reactDashNativeDashNavigation.reactDashNativeDashNavigationStrings.left
import typings.reactDashNativeDashNavigation.reactDashNativeDashNavigationStrings.right
import typings.reactDashNativeDashNavigation.reactDashNativeDashNavigationStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsFab extends js.Object {
  var actions: js.UndefOr[js.Array[OptionsFab]] = js.undefined
  var alignHorizontally: js.UndefOr[left | right] = js.undefined
  var alignVertically: js.UndefOr[top | bottom] = js.undefined
  var backgroundColor: js.UndefOr[Color] = js.undefined
  var clickColor: js.UndefOr[Color] = js.undefined
  var hideOnScroll: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[ImageRequireSource] = js.undefined
  var iconColor: js.UndefOr[Color] = js.undefined
  var id: String
  var rippleColor: js.UndefOr[Color] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object OptionsFab {
  @scala.inline
  def apply(
    id: String,
    actions: js.Array[OptionsFab] = null,
    alignHorizontally: left | right = null,
    alignVertically: top | bottom = null,
    backgroundColor: Color = null,
    clickColor: Color = null,
    hideOnScroll: js.UndefOr[Boolean] = js.undefined,
    icon: js.UndefOr[ImageRequireSource] = js.undefined,
    iconColor: Color = null,
    rippleColor: Color = null,
    size: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): OptionsFab = {
    val __obj = js.Dynamic.literal(id = id)
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

