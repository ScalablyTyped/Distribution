package typings.storybookRouter.distTs3Dot9ModulesReactRouterIndexMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutRouteProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var element: js.UndefOr[ReactElement | Null] = js.undefined
}
object LayoutRouteProps {
  
  inline def apply(): LayoutRouteProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutRouteProps]
  }
  
  extension [Self <: LayoutRouteProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setElement(value: ReactElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementNull: Self = StObject.set(x, "element", null)
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
  }
}
