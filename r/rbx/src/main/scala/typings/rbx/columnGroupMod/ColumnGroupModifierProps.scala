package typings.rbx.columnGroupMod

import typings.rbx.rbxNumbers.`0`
import typings.rbx.rbxNumbers.`1`
import typings.rbx.rbxNumbers.`2`
import typings.rbx.rbxNumbers.`3`
import typings.rbx.rbxNumbers.`4`
import typings.rbx.rbxNumbers.`5`
import typings.rbx.rbxNumbers.`6`
import typings.rbx.rbxNumbers.`7`
import typings.rbx.rbxNumbers.`8`
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
trait ColumnGroupModifierProps extends js.Object {
  var breakpoint: js.UndefOr[mobile | tablet | desktop | widescreen | fullhd | touch] = js.native
  var centered: js.UndefOr[Boolean] = js.native
  var desktop: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
  var fullhd: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
  var gapSize: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.native
  var gapless: js.UndefOr[Boolean] = js.native
  var mobile: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
  var multiline: js.UndefOr[Boolean] = js.native
  var tablet: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
  var touch: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
  var vcentered: js.UndefOr[Boolean] = js.native
  var widescreen: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
}

object ColumnGroupModifierProps {
  @scala.inline
  def apply(): ColumnGroupModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnGroupModifierProps]
  }
  @scala.inline
  implicit class ColumnGroupModifierPropsOps[Self <: ColumnGroupModifierProps] (val x: Self) extends AnyVal {
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
    def setCentered(value: Boolean): Self = this.set("centered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
    @scala.inline
    def setDesktop(value: ColumnGroupBreakpointOptions): Self = this.set("desktop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktop: Self = this.set("desktop", js.undefined)
    @scala.inline
    def setFullhd(value: ColumnGroupBreakpointOptions): Self = this.set("fullhd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullhd: Self = this.set("fullhd", js.undefined)
    @scala.inline
    def setGapSize(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = this.set("gapSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGapSize: Self = this.set("gapSize", js.undefined)
    @scala.inline
    def setGapless(value: Boolean): Self = this.set("gapless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGapless: Self = this.set("gapless", js.undefined)
    @scala.inline
    def setMobile(value: ColumnGroupBreakpointOptions): Self = this.set("mobile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobile: Self = this.set("mobile", js.undefined)
    @scala.inline
    def setMultiline(value: Boolean): Self = this.set("multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    @scala.inline
    def setTablet(value: ColumnGroupBreakpointOptions): Self = this.set("tablet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTablet: Self = this.set("tablet", js.undefined)
    @scala.inline
    def setTouch(value: ColumnGroupBreakpointOptions): Self = this.set("touch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouch: Self = this.set("touch", js.undefined)
    @scala.inline
    def setVcentered(value: Boolean): Self = this.set("vcentered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVcentered: Self = this.set("vcentered", js.undefined)
    @scala.inline
    def setWidescreen(value: ColumnGroupBreakpointOptions): Self = this.set("widescreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidescreen: Self = this.set("widescreen", js.undefined)
  }
  
}

