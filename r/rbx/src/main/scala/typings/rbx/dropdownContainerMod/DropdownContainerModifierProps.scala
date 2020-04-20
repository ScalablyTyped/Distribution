package typings.rbx.dropdownContainerMod

import typings.rbx.rbxStrings.right
import typings.react.mod.ComponentType
import typings.react.mod.ReactType
import typings.react.mod.Ref
import typings.std.HTMLElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownContainerModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var align: js.UndefOr[right] = js.undefined
  var as: js.UndefOr[ReactType[_]] = js.undefined
  var hoverable: js.UndefOr[Boolean] = js.undefined
  var innerRef: js.UndefOr[Ref[HTMLElement | SVGElement | ComponentType[js.Object]]] = js.undefined
  var managed: js.UndefOr[Boolean] = js.undefined
  var up: js.UndefOr[Boolean] = js.undefined
}

object DropdownContainerModifierProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    align: right = null,
    as: ReactType[_] = null,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    innerRef: Ref[HTMLElement | SVGElement | ComponentType[js.Object]] = null,
    managed: js.UndefOr[Boolean] = js.undefined,
    up: js.UndefOr[Boolean] = js.undefined
  ): DropdownContainerModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(managed)) __obj.updateDynamic("managed")(managed.asInstanceOf[js.Any])
    if (!js.isUndefined(up)) __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownContainerModifierProps]
  }
}

