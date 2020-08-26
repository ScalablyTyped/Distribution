package typings.rbx.inputMod

import typings.rbx.rbxStrings.black
import typings.rbx.rbxStrings.color
import typings.rbx.rbxStrings.danger
import typings.rbx.rbxStrings.dark
import typings.rbx.rbxStrings.date
import typings.rbx.rbxStrings.email
import typings.rbx.rbxStrings.focused
import typings.rbx.rbxStrings.hovered
import typings.rbx.rbxStrings.info
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.light
import typings.rbx.rbxStrings.link
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.number
import typings.rbx.rbxStrings.password
import typings.rbx.rbxStrings.primary
import typings.rbx.rbxStrings.search
import typings.rbx.rbxStrings.small
import typings.rbx.rbxStrings.success
import typings.rbx.rbxStrings.tel
import typings.rbx.rbxStrings.text
import typings.rbx.rbxStrings.time
import typings.rbx.rbxStrings.warning
import typings.rbx.rbxStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputModifierProps extends js.Object {
  var color: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var rounded: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[small | medium | large] = js.native
  var state: js.UndefOr[focused | hovered] = js.native
  var static: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[text | email | tel | password | number | search | color | date | time] = js.native
}

object InputModifierProps {
  @scala.inline
  def apply(): InputModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputModifierProps]
  }
  @scala.inline
  implicit class InputModifierPropsOps[Self <: InputModifierProps] (val x: Self) extends AnyVal {
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
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRounded(value: Boolean): Self = this.set("rounded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRounded: Self = this.set("rounded", js.undefined)
    @scala.inline
    def setSize(value: small | medium | large): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setState(value: focused | hovered): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
    @scala.inline
    def setType(value: text | email | tel | password | number | search | color | date | time): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

