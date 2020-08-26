package typings.rbx.containerContainerMod

import typings.rbx.rbxStrings.desktop
import typings.rbx.rbxStrings.fullhd
import typings.rbx.rbxStrings.mobile
import typings.rbx.rbxStrings.tablet
import typings.rbx.rbxStrings.touch
import typings.rbx.rbxStrings.widescreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerModifierProps extends js.Object {
  var breakpoint: js.UndefOr[mobile | tablet | desktop | widescreen | fullhd | touch] = js.native
  var fluid: js.UndefOr[Boolean] = js.native
}

object ContainerModifierProps {
  @scala.inline
  def apply(): ContainerModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerModifierProps]
  }
  @scala.inline
  implicit class ContainerModifierPropsOps[Self <: ContainerModifierProps] (val x: Self) extends AnyVal {
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
    def setBreakpoint(value: mobile | tablet | desktop | widescreen | fullhd | touch): Self = this.set("breakpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakpoint: Self = this.set("breakpoint", js.undefined)
    @scala.inline
    def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFluid: Self = this.set("fluid", js.undefined)
  }
  
}

