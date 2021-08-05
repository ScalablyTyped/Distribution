package typings.rbx.anon

import typings.rbx.rbxStrings.bottom
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in rbx.rbx/base/helpers/variables.Variables['breakpoints'] ]:? 'top' | 'right' | 'bottom' | 'left'} */
trait KinVariablesbreakpointsto extends StObject {
  
  var desktop: js.UndefOr[top | right | bottom | left] = js.undefined
  
  var fullhd: js.UndefOr[top | right | bottom | left] = js.undefined
  
  var mobile: js.UndefOr[top | right | bottom | left] = js.undefined
  
  var tablet: js.UndefOr[top | right | bottom | left] = js.undefined
  
  var touch: js.UndefOr[top | right | bottom | left] = js.undefined
  
  var widescreen: js.UndefOr[top | right | bottom | left] = js.undefined
}
object KinVariablesbreakpointsto {
  
  inline def apply(): KinVariablesbreakpointsto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinVariablesbreakpointsto]
  }
  
  extension [Self <: KinVariablesbreakpointsto](x: Self) {
    
    inline def setDesktop(value: top | right | bottom | left): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
    
    inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
    
    inline def setFullhd(value: top | right | bottom | left): Self = StObject.set(x, "fullhd", value.asInstanceOf[js.Any])
    
    inline def setFullhdUndefined: Self = StObject.set(x, "fullhd", js.undefined)
    
    inline def setMobile(value: top | right | bottom | left): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    inline def setTablet(value: top | right | bottom | left): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
    
    inline def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
    
    inline def setTouch(value: top | right | bottom | left): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
    
    inline def setWidescreen(value: top | right | bottom | left): Self = StObject.set(x, "widescreen", value.asInstanceOf[js.Any])
    
    inline def setWidescreenUndefined: Self = StObject.set(x, "widescreen", js.undefined)
  }
}
