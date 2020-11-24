package typings.rbx.anon

import typings.rbx.responsiveMod.LimitedResponsiveBreakpointProps
import typings.rbx.responsiveMod.ResponsiveBreakpointProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ B in 'mobile' | 'fullhd' | 'touch' ]:? rbx.rbx/base/helpers/responsive.LimitedResponsiveBreakpointProps} & {[ B in std.Exclude<'mobile' | 'tablet' | 'desktop' | 'widescreen' | 'fullhd' | 'touch', 'mobile' | 'fullhd' | 'touch'> ]:? rbx.rbx/base/helpers/responsive.ResponsiveBreakpointProps} */
@js.native
trait BinmobilefullhdtouchLimit extends js.Object {
  
  var desktop: js.UndefOr[ResponsiveBreakpointProps] = js.native
  
  var fullhd: js.UndefOr[LimitedResponsiveBreakpointProps] = js.native
  
  var mobile: js.UndefOr[LimitedResponsiveBreakpointProps] = js.native
  
  var tablet: js.UndefOr[ResponsiveBreakpointProps] = js.native
  
  var touch: js.UndefOr[LimitedResponsiveBreakpointProps] = js.native
  
  var widescreen: js.UndefOr[ResponsiveBreakpointProps] = js.native
}
object BinmobilefullhdtouchLimit {
  
  @scala.inline
  def apply(): BinmobilefullhdtouchLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinmobilefullhdtouchLimit]
  }
  
  @scala.inline
  implicit class BinmobilefullhdtouchLimitOps[Self <: BinmobilefullhdtouchLimit] (val x: Self) extends AnyVal {
    
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
    def setDesktop(value: ResponsiveBreakpointProps): Self = this.set("desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesktop: Self = this.set("desktop", js.undefined)
    
    @scala.inline
    def setFullhd(value: LimitedResponsiveBreakpointProps): Self = this.set("fullhd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullhd: Self = this.set("fullhd", js.undefined)
    
    @scala.inline
    def setMobile(value: LimitedResponsiveBreakpointProps): Self = this.set("mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobile: Self = this.set("mobile", js.undefined)
    
    @scala.inline
    def setTablet(value: ResponsiveBreakpointProps): Self = this.set("tablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTablet: Self = this.set("tablet", js.undefined)
    
    @scala.inline
    def setTouch(value: LimitedResponsiveBreakpointProps): Self = this.set("touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouch: Self = this.set("touch", js.undefined)
    
    @scala.inline
    def setWidescreen(value: ResponsiveBreakpointProps): Self = this.set("widescreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidescreen: Self = this.set("widescreen", js.undefined)
  }
}
