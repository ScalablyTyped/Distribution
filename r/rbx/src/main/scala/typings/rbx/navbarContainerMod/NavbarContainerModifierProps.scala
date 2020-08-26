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
import typings.std.Document
import typings.std.HTMLElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavbarContainerModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var as: js.UndefOr[ReactType[_]] = js.native
  var color: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.native
  var document: js.UndefOr[Document] = js.native
  var fixed: js.UndefOr[top | bottom] = js.native
  var innerRef: js.UndefOr[Ref[HTMLElement | SVGElement | ComponentType[js.Object]]] = js.native
  var managed: js.UndefOr[Boolean] = js.native
  var transparent: js.UndefOr[Boolean] = js.native
}

object NavbarContainerModifierProps {
  @scala.inline
  def apply(): NavbarContainerModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavbarContainerModifierProps]
  }
  @scala.inline
  implicit class NavbarContainerModifierPropsOps[Self <: NavbarContainerModifierProps] (val x: Self) extends AnyVal {
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
    def setAs(value: ReactType[_]): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDocument(value: Document): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setFixed(value: top | bottom): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
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
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
  }
  
}

