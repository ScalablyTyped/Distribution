package typings.rbx.navbarContainerMod

import typings.rbx.rbxStrings.black
import typings.rbx.rbxStrings.bottom
import typings.rbx.rbxStrings.danger
import typings.rbx.rbxStrings.dark
import typings.rbx.rbxStrings.info
import typings.rbx.rbxStrings.light
import typings.rbx.rbxStrings.link
import typings.rbx.rbxStrings.primary
import typings.rbx.rbxStrings.success
import typings.rbx.rbxStrings.top
import typings.rbx.rbxStrings.warning
import typings.rbx.rbxStrings.white
import typings.react.mod.ComponentType
import typings.react.mod.ReactType
import typings.react.mod.Ref
import typings.std.Document_
import typings.std.HTMLElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarContainerModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var as: js.UndefOr[ReactType[_]] = js.undefined
  var color: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.undefined
  var document: js.UndefOr[Document_] = js.undefined
  var fixed: js.UndefOr[top | bottom] = js.undefined
  var innerRef: js.UndefOr[Ref[HTMLElement | SVGElement | ComponentType[js.Object]]] = js.undefined
  var managed: js.UndefOr[Boolean] = js.undefined
  var transparent: js.UndefOr[Boolean] = js.undefined
}

object NavbarContainerModifierProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    as: ReactType[_] = null,
    color: primary | success | info | warning | danger | light | dark | white | black | link = null,
    document: Document_ = null,
    fixed: top | bottom = null,
    innerRef: Ref[HTMLElement | SVGElement | ComponentType[js.Object]] = null,
    managed: js.UndefOr[Boolean] = js.undefined,
    transparent: js.UndefOr[Boolean] = js.undefined
  ): NavbarContainerModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(managed)) __obj.updateDynamic("managed")(managed.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarContainerModifierProps]
  }
}

