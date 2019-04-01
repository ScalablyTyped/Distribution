package typings
package primereactLib.componentsSlidemenuSlideMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideMenuProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.undefined
  var autoZIndex: js.UndefOr[scala.Boolean] = js.undefined
  var backLabel: js.UndefOr[java.lang.String] = js.undefined
  var baseZIndex: js.UndefOr[scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var effectDuration: js.UndefOr[scala.Double] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var menuWidth: js.UndefOr[scala.Double] = js.undefined
  var model: js.UndefOr[js.Array[primereactLib.componentsMenuitemMenuItemMod.MenuItem]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* e */ stdLib.Event, scala.Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* e */ stdLib.Event, scala.Unit]] = js.undefined
  var popup: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var viewportHeight: js.UndefOr[scala.Double] = js.undefined
}

object SlideMenuProps {
  @scala.inline
  def apply(
    appendTo: js.Any = null,
    autoZIndex: js.UndefOr[scala.Boolean] = js.undefined,
    backLabel: java.lang.String = null,
    baseZIndex: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    easing: java.lang.String = null,
    effectDuration: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    menuWidth: scala.Int | scala.Double = null,
    model: js.Array[primereactLib.componentsMenuitemMenuItemMod.MenuItem] = null,
    onHide: /* e */ stdLib.Event => scala.Unit = null,
    onShow: /* e */ stdLib.Event => scala.Unit = null,
    popup: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Object = null,
    viewportHeight: scala.Int | scala.Double = null
  ): SlideMenuProps = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (!js.isUndefined(autoZIndex)) __obj.updateDynamic("autoZIndex")(autoZIndex)
    if (backLabel != null) __obj.updateDynamic("backLabel")(backLabel)
    if (baseZIndex != null) __obj.updateDynamic("baseZIndex")(baseZIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (effectDuration != null) __obj.updateDynamic("effectDuration")(effectDuration.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (menuWidth != null) __obj.updateDynamic("menuWidth")(menuWidth.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup)
    if (style != null) __obj.updateDynamic("style")(style)
    if (viewportHeight != null) __obj.updateDynamic("viewportHeight")(viewportHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideMenuProps]
  }
}

