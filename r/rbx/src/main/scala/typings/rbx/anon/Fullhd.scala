package typings.rbx.anon

import typings.rbx.columnMod.ColumnBreakpointOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fullhd extends js.Object {
  var desktop: js.UndefOr[ColumnBreakpointOptions] = js.native
  var fullhd: js.UndefOr[ColumnBreakpointOptions] = js.native
  var mobile: js.UndefOr[ColumnBreakpointOptions] = js.native
  var tablet: js.UndefOr[ColumnBreakpointOptions] = js.native
  var touch: js.UndefOr[ColumnBreakpointOptions] = js.native
  var widescreen: js.UndefOr[ColumnBreakpointOptions] = js.native
}

object Fullhd {
  @scala.inline
  def apply(): Fullhd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fullhd]
  }
  @scala.inline
  implicit class FullhdOps[Self <: Fullhd] (val x: Self) extends AnyVal {
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
    def setDesktop(value: ColumnBreakpointOptions): Self = this.set("desktop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktop: Self = this.set("desktop", js.undefined)
    @scala.inline
    def setFullhd(value: ColumnBreakpointOptions): Self = this.set("fullhd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullhd: Self = this.set("fullhd", js.undefined)
    @scala.inline
    def setMobile(value: ColumnBreakpointOptions): Self = this.set("mobile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobile: Self = this.set("mobile", js.undefined)
    @scala.inline
    def setTablet(value: ColumnBreakpointOptions): Self = this.set("tablet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTablet: Self = this.set("tablet", js.undefined)
    @scala.inline
    def setTouch(value: ColumnBreakpointOptions): Self = this.set("touch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouch: Self = this.set("touch", js.undefined)
    @scala.inline
    def setWidescreen(value: ColumnBreakpointOptions): Self = this.set("widescreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidescreen: Self = this.set("widescreen", js.undefined)
  }
  
}

