package typings.rbx.anon

import typings.rbx.responsiveMod.LimitedResponsiveBreakpointProps
import typings.rbx.responsiveMod.ResponsiveBreakpointProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ B in 'mobile' | 'fullhd' | 'touch' ]:? rbx.rbx/base/helpers/responsive.LimitedResponsiveBreakpointProps} & {[ B in std.Exclude<'mobile' | 'tablet' | 'desktop' | 'widescreen' | 'fullhd' | 'touch', 'mobile' | 'fullhd' | 'touch'> ]:? rbx.rbx/base/helpers/responsive.ResponsiveBreakpointProps} */
trait BinmobilefullhdtouchLimit extends StObject {
  
  var desktop: js.UndefOr[ResponsiveBreakpointProps] = js.undefined
  
  var fullhd: js.UndefOr[LimitedResponsiveBreakpointProps] = js.undefined
  
  var mobile: js.UndefOr[LimitedResponsiveBreakpointProps] = js.undefined
  
  var tablet: js.UndefOr[ResponsiveBreakpointProps] = js.undefined
  
  var touch: js.UndefOr[LimitedResponsiveBreakpointProps] = js.undefined
  
  var widescreen: js.UndefOr[ResponsiveBreakpointProps] = js.undefined
}
object BinmobilefullhdtouchLimit {
  
  @scala.inline
  def apply(): BinmobilefullhdtouchLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinmobilefullhdtouchLimit]
  }
  
  @scala.inline
  implicit class BinmobilefullhdtouchLimitMutableBuilder[Self <: BinmobilefullhdtouchLimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesktop(value: ResponsiveBreakpointProps): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
    
    @scala.inline
    def setFullhd(value: LimitedResponsiveBreakpointProps): Self = StObject.set(x, "fullhd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullhdUndefined: Self = StObject.set(x, "fullhd", js.undefined)
    
    @scala.inline
    def setMobile(value: LimitedResponsiveBreakpointProps): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    @scala.inline
    def setTablet(value: ResponsiveBreakpointProps): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
    
    @scala.inline
    def setTouch(value: LimitedResponsiveBreakpointProps): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
    
    @scala.inline
    def setWidescreen(value: ResponsiveBreakpointProps): Self = StObject.set(x, "widescreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidescreenUndefined: Self = StObject.set(x, "widescreen", js.undefined)
  }
}
