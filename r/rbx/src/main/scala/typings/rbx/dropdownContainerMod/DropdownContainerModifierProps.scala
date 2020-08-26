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

@js.native
trait DropdownContainerModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var align: js.UndefOr[right] = js.native
  var as: js.UndefOr[ReactType[_]] = js.native
  var hoverable: js.UndefOr[Boolean] = js.native
  var innerRef: js.UndefOr[Ref[HTMLElement | SVGElement | ComponentType[js.Object]]] = js.native
  var managed: js.UndefOr[Boolean] = js.native
  var up: js.UndefOr[Boolean] = js.native
}

object DropdownContainerModifierProps {
  @scala.inline
  def apply(): DropdownContainerModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownContainerModifierProps]
  }
  @scala.inline
  implicit class DropdownContainerModifierPropsOps[Self <: DropdownContainerModifierProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAlign(value: right): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAs(value: ReactType[_]): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setHoverable(value: Boolean): Self = this.set("hoverable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverable: Self = this.set("hoverable", js.undefined)
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ (HTMLElement | SVGElement | ComponentType[js.Object]) | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInnerRef(value: Ref[HTMLElement | SVGElement | ComponentType[js.Object]]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    @scala.inline
    def setManaged(value: Boolean): Self = this.set("managed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManaged: Self = this.set("managed", js.undefined)
    @scala.inline
    def setUp(value: Boolean): Self = this.set("up", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
  }
  
}

