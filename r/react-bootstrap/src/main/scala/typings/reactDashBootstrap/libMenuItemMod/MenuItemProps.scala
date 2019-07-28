package typings.reactDashBootstrap.libMenuItemMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.MouseEventHandler
import typings.reactDashBootstrap.reactDashBootstrapMod.SelectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemProps extends HTMLProps[MenuItem] {
  var active: js.UndefOr[Boolean] = js.undefined
  var bsClass: js.UndefOr[String] = js.undefined
  var divider: js.UndefOr[Boolean] = js.undefined
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var header: js.UndefOr[Boolean] = js.undefined
  @JSName("onClick")
  var onClick_MenuItemProps: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  @JSName("onSelect")
  var onSelect_MenuItemProps: js.UndefOr[SelectCallback] = js.undefined
}

object MenuItemProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[MenuItem] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    bsClass: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    divider: js.UndefOr[Boolean] = js.undefined,
    eventKey: js.Any = null,
    header: js.UndefOr[Boolean] = js.undefined,
    onClick: MouseEventHandler[js.Object] = null,
    onSelect: SelectCallback = null,
    target: String = null,
    title: String = null
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

