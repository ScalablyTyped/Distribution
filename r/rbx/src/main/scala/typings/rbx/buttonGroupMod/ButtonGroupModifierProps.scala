package typings.rbx.buttonGroupMod

import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonGroupModifierProps extends js.Object {
  var align: js.UndefOr[centered | right] = js.native
  var hasAddons: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[small | medium | large] = js.native
}

object ButtonGroupModifierProps {
  @scala.inline
  def apply(): ButtonGroupModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonGroupModifierProps]
  }
  @scala.inline
  implicit class ButtonGroupModifierPropsOps[Self <: ButtonGroupModifierProps] (val x: Self) extends AnyVal {
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
    def setAlign(value: centered | right): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setHasAddons(value: Boolean): Self = this.set("hasAddons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasAddons: Self = this.set("hasAddons", js.undefined)
    @scala.inline
    def setSize(value: small | medium | large): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

