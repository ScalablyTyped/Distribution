package typings
package reactDashBootstrapLib.libMenuItemMod.MenuItemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libMenuItemMod.MenuItem] {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var divider: js.UndefOr[scala.Boolean] = js.undefined
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var header: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("onClick")
  var onClick_MenuItemProps: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[js.Object]] = js.undefined
  @JSName("onSelect")
  var onSelect_MenuItemProps: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback] = js.undefined
}

object MenuItemProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libMenuItemMod.MenuItem] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    bsClass: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    divider: js.UndefOr[scala.Boolean] = js.undefined,
    eventKey: js.Any = null,
    header: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    onSelect: reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback = null,
    target: java.lang.String = null,
    title: java.lang.String = null
  ): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider)
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey)
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (target != null) __obj.updateDynamic("target")(target)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[MenuItemProps]
  }
}

