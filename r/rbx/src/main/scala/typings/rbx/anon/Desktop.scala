package typings.rbx.anon

import typings.rbx.columnMod.ColumnBreakpointOptions
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Desktop[TAsComponent /* <: ElementType[js.Any] */] extends StObject {
  
  var as: js.UndefOr[TAsComponent] = js.undefined
  
  var desktop: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  
  var fullhd: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  
  var mobile: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  
  var tablet: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  
  var touch: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  
  var widescreen: js.UndefOr[ColumnBreakpointOptions] = js.undefined
}
object Desktop {
  
  @scala.inline
  def apply[TAsComponent /* <: ElementType[js.Any] */](): Desktop[TAsComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Desktop[TAsComponent]]
  }
  
  @scala.inline
  implicit class DesktopMutableBuilder[Self <: Desktop[?], TAsComponent /* <: ElementType[js.Any] */] (val x: Self & Desktop[TAsComponent]) extends AnyVal {
    
    @scala.inline
    def setAs(value: TAsComponent): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setDesktop(value: ColumnBreakpointOptions): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
    
    @scala.inline
    def setFullhd(value: ColumnBreakpointOptions): Self = StObject.set(x, "fullhd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullhdUndefined: Self = StObject.set(x, "fullhd", js.undefined)
    
    @scala.inline
    def setMobile(value: ColumnBreakpointOptions): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    @scala.inline
    def setTablet(value: ColumnBreakpointOptions): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
    
    @scala.inline
    def setTouch(value: ColumnBreakpointOptions): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
    
    @scala.inline
    def setWidescreen(value: ColumnBreakpointOptions): Self = StObject.set(x, "widescreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidescreenUndefined: Self = StObject.set(x, "widescreen", js.undefined)
  }
}
