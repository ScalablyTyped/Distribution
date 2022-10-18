package typings.rbx.anon

import typings.rbx.gridColumnsColumnMod.ColumnBreakpointOptions
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Desktop[TAsComponent /* <: ElementType[Any] */] extends StObject {
  
  var as: js.UndefOr[TAsComponent] = js.undefined
  
  var desktop: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  
  var fullhd: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  
  var mobile: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  
  var tablet: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  
  var touch: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  
  var widescreen: js.UndefOr[ColumnBreakpointOptions] = js.undefined
}
object Desktop {
  
  inline def apply[TAsComponent /* <: ElementType[Any] */](): Desktop[TAsComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Desktop[TAsComponent]]
  }
  
  extension [Self <: Desktop[?], TAsComponent /* <: ElementType[Any] */](x: Self & Desktop[TAsComponent]) {
    
    inline def setAs(value: TAsComponent): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setDesktop(value: ColumnBreakpointOptions): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
    
    inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
    
    inline def setFullhd(value: ColumnBreakpointOptions): Self = StObject.set(x, "fullhd", value.asInstanceOf[js.Any])
    
    inline def setFullhdUndefined: Self = StObject.set(x, "fullhd", js.undefined)
    
    inline def setMobile(value: ColumnBreakpointOptions): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    inline def setTablet(value: ColumnBreakpointOptions): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
    
    inline def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
    
    inline def setTouch(value: ColumnBreakpointOptions): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
    
    inline def setWidescreen(value: ColumnBreakpointOptions): Self = StObject.set(x, "widescreen", value.asInstanceOf[js.Any])
    
    inline def setWidescreenUndefined: Self = StObject.set(x, "widescreen", js.undefined)
  }
}
