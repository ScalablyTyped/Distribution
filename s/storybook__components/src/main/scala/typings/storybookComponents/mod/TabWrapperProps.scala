package typings.storybookComponents.mod

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabWrapperProps extends StObject {
  
  var active: Boolean
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var render: js.UndefOr[js.Function0[Element]] = js.undefined
}
object TabWrapperProps {
  
  inline def apply(active: Boolean): TabWrapperProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabWrapperProps]
  }
  
  extension [Self <: TabWrapperProps](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setRender(value: () => Element): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
  }
}
