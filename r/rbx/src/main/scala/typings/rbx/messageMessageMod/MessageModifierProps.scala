package typings.rbx.messageMessageMod

import typings.rbx.rbxStrings.black
import typings.rbx.rbxStrings.danger
import typings.rbx.rbxStrings.dark
import typings.rbx.rbxStrings.info
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.light
import typings.rbx.rbxStrings.link
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.primary
import typings.rbx.rbxStrings.small
import typings.rbx.rbxStrings.success
import typings.rbx.rbxStrings.warning
import typings.rbx.rbxStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageModifierProps extends js.Object {
  var color: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.native
  var size: js.UndefOr[small | medium | large] = js.native
}

object MessageModifierProps {
  @scala.inline
  def apply(): MessageModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageModifierProps]
  }
  @scala.inline
  implicit class MessageModifierPropsOps[Self <: MessageModifierProps] (val x: Self) extends AnyVal {
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
    def setSize(value: small | medium | large): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

