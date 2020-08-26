package typings.rbx.anon

import typings.rbx.rbxStrings.bottom
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in rbx.rbx/base/helpers/variables.Variables['breakpoints'] ]:? {  colors :['primary', 'success', 'info', 'warning', 'danger', 'light', 'dark', 'white', 'black', 'link'],   shades :['black-bis', 'black-ter', 'grey-darker', 'grey-dark', 'grey', 'grey-light', 'grey-lighter', 'white-ter', 'white-bis'],   badgeSizes :['small', 'medium', 'large'],   floatPulledAlignments :['left', 'right'],   breakpoints :['mobile', 'tablet', 'desktop', 'widescreen', 'fullhd', 'touch'],   breakpointsLimited :['mobile', 'fullhd', 'touch'],   tooltipPositions :['top', 'right', 'bottom', 'left'],   textAlignments :['centered', 'justified', 'left', 'right'],   textSizes :[1, 2, 3, 4, 5, 6, 7],   textTransforms :['capitalized', 'lowercase', 'uppercase'],   textWeights :['light', 'medium', 'normal', 'semibold', 'bold'],   displays :['block', 'flex', 'inline', 'inline-block', 'inline-flex']}['tooltipPositions'][number]} */
@js.native
trait KinVariablesbreakpointsco extends js.Object {
  var desktop: js.UndefOr[top | right | bottom | left] = js.native
  var fullhd: js.UndefOr[top | right | bottom | left] = js.native
  var mobile: js.UndefOr[top | right | bottom | left] = js.native
  var tablet: js.UndefOr[top | right | bottom | left] = js.native
  var touch: js.UndefOr[top | right | bottom | left] = js.native
  var widescreen: js.UndefOr[top | right | bottom | left] = js.native
}

object KinVariablesbreakpointsco {
  @scala.inline
  def apply(): KinVariablesbreakpointsco = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinVariablesbreakpointsco]
  }
  @scala.inline
  implicit class KinVariablesbreakpointscoOps[Self <: KinVariablesbreakpointsco] (val x: Self) extends AnyVal {
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

