package typings.rbx.responsiveMod

import typings.rbx.anon.BinVariablesbreakpointsLi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsiveHelpersProps extends js.Object {
  var responsive: js.UndefOr[BinVariablesbreakpointsLi] = js.native
}

object ResponsiveHelpersProps {
  @scala.inline
  def apply(): ResponsiveHelpersProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveHelpersProps]
  }
  @scala.inline
  implicit class ResponsiveHelpersPropsOps[Self <: ResponsiveHelpersProps] (val x: Self) extends AnyVal {
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
    def setResponsive(value: BinVariablesbreakpointsLi): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
  }
  
}

