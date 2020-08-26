package typings.rbx.buttonButtonMod

import typings.rbx.rbxStrings.active
import typings.rbx.rbxStrings.black
import typings.rbx.rbxStrings.danger
import typings.rbx.rbxStrings.dark
import typings.rbx.rbxStrings.focused
import typings.rbx.rbxStrings.hovered
import typings.rbx.rbxStrings.info
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.light
import typings.rbx.rbxStrings.link
import typings.rbx.rbxStrings.loading
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.normal
import typings.rbx.rbxStrings.primary
import typings.rbx.rbxStrings.small
import typings.rbx.rbxStrings.success
import typings.rbx.rbxStrings.warning
import typings.rbx.rbxStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonModifierProps extends js.Object {
  var color: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.native
  var fullwidth: js.UndefOr[Boolean] = js.native
  var inverted: js.UndefOr[Boolean] = js.native
  var outlined: js.UndefOr[Boolean] = js.native
  var rounded: js.UndefOr[Boolean] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[small | normal | medium | large] = js.native
  var state: js.UndefOr[hovered | focused | active | loading] = js.native
  var static: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[Boolean] = js.native
}

object ButtonModifierProps {
  @scala.inline
  def apply(): ButtonModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonModifierProps]
  }
  @scala.inline
  implicit class ButtonModifierPropsOps[Self <: ButtonModifierProps] (val x: Self) extends AnyVal {
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
    def setColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFullwidth(value: Boolean): Self = this.set("fullwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullwidth: Self = this.set("fullwidth", js.undefined)
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setOutlined(value: Boolean): Self = this.set("outlined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlined: Self = this.set("outlined", js.undefined)
    @scala.inline
    def setRounded(value: Boolean): Self = this.set("rounded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRounded: Self = this.set("rounded", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setSize(value: small | normal | medium | large): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setState(value: hovered | focused | active | loading): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
    @scala.inline
    def setText(value: Boolean): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

