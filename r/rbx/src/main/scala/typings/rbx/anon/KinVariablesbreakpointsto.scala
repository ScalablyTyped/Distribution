package typings.rbx.anon

import typings.rbx.rbxStrings.bottom
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in rbx.rbx/base/helpers/variables.Variables['breakpoints'] ]:? 'top' | 'right' | 'bottom' | 'left'} */
@js.native
trait KinVariablesbreakpointsto extends js.Object {
  var desktop: js.UndefOr[top | right | bottom | left] = js.native
  var fullhd: js.UndefOr[top | right | bottom | left] = js.native
  var mobile: js.UndefOr[top | right | bottom | left] = js.native
  var tablet: js.UndefOr[top | right | bottom | left] = js.native
  var touch: js.UndefOr[top | right | bottom | left] = js.native
  var widescreen: js.UndefOr[top | right | bottom | left] = js.native
}

object KinVariablesbreakpointsto {
  @scala.inline
  def apply(): KinVariablesbreakpointsto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinVariablesbreakpointsto]
  }
  @scala.inline
  implicit class KinVariablesbreakpointstoOps[Self <: KinVariablesbreakpointsto] (val x: Self) extends AnyVal {
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
    def setDesktop(value: top | right | bottom | left): Self = this.set("desktop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktop: Self = this.set("desktop", js.undefined)
    @scala.inline
    def setFullhd(value: top | right | bottom | left): Self = this.set("fullhd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullhd: Self = this.set("fullhd", js.undefined)
    @scala.inline
    def setMobile(value: top | right | bottom | left): Self = this.set("mobile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobile: Self = this.set("mobile", js.undefined)
    @scala.inline
    def setTablet(value: top | right | bottom | left): Self = this.set("tablet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTablet: Self = this.set("tablet", js.undefined)
    @scala.inline
    def setTouch(value: top | right | bottom | left): Self = this.set("touch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouch: Self = this.set("touch", js.undefined)
    @scala.inline
    def setWidescreen(value: top | right | bottom | left): Self = this.set("widescreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidescreen: Self = this.set("widescreen", js.undefined)
  }
  
}

