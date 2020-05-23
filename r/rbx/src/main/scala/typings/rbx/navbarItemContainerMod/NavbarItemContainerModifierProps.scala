package typings.rbx.navbarItemContainerMod

import typings.react.mod.ComponentType
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactType
import typings.react.mod.Ref
import typings.std.Element
import typings.std.HTMLElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarItemContainerModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var as: js.UndefOr[ReactType[_]] = js.undefined
  var dropdown: js.UndefOr[Boolean] = js.undefined
  var expanded: js.UndefOr[Boolean] = js.undefined
  var hoverable: js.UndefOr[Boolean] = js.undefined
  var innerRef: js.UndefOr[Ref[HTMLElement | SVGElement | ComponentType[js.Object]]] = js.undefined
  var managed: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var tab: js.UndefOr[Boolean] = js.undefined
  var up: js.UndefOr[Boolean] = js.undefined
}

object NavbarItemContainerModifierProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    as: ReactType[_] = null,
    dropdown: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    innerRef: js.UndefOr[Null | (Ref[HTMLElement | SVGElement | ComponentType[js.Object]])] = js.undefined,
    managed: js.UndefOr[Boolean] = js.undefined,
    onClick: MouseEvent[Element, NativeMouseEvent] => Unit = null,
    tab: js.UndefOr[Boolean] = js.undefined,
    up: js.UndefOr[Boolean] = js.undefined
  ): NavbarItemContainerModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdown)) __obj.updateDynamic("dropdown")(dropdown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRef)) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(managed)) __obj.updateDynamic("managed")(managed.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(tab)) __obj.updateDynamic("tab")(tab.get.asInstanceOf[js.Any])
    if (!js.isUndefined(up)) __obj.updateDynamic("up")(up.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarItemContainerModifierProps]
  }
}

