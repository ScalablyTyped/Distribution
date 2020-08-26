package typings.rbx.helpMod

import typings.rbx.rbxStrings.black
import typings.rbx.rbxStrings.danger
import typings.rbx.rbxStrings.dark
import typings.rbx.rbxStrings.info
import typings.rbx.rbxStrings.light
import typings.rbx.rbxStrings.link
import typings.rbx.rbxStrings.primary
import typings.rbx.rbxStrings.success
import typings.rbx.rbxStrings.warning
import typings.rbx.rbxStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelpModifierProps extends js.Object {
  var color: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.native
}

object HelpModifierProps {
  @scala.inline
  def apply(): HelpModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HelpModifierProps]
  }
  @scala.inline
  implicit class HelpModifierPropsOps[Self <: HelpModifierProps] (val x: Self) extends AnyVal {
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
  }
  
}

