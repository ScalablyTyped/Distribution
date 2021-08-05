package typings.reachRouter.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationProviderProps extends StObject {
  
  var children: js.UndefOr[ReactNode | LocationProviderRenderFn] = js.undefined
  
  var history: js.UndefOr[History] = js.undefined
}
object LocationProviderProps {
  
  inline def apply(): LocationProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationProviderProps]
  }
  
  extension [Self <: LocationProviderProps](x: Self) {
    
    inline def setChildren(value: ReactNode | LocationProviderRenderFn): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: /* context */ LocationContext => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
  }
}
