package typings.storybookRouter.distTs3Dot9ModulesReactRouterIndexMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteProps extends StObject {
  
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var element: js.UndefOr[ReactElement | Null] = js.undefined
  
  var index: js.UndefOr[Boolean] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
}
object RouteProps {
  
  inline def apply(): RouteProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteProps]
  }
  
  extension [Self <: RouteProps](x: Self) {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setElement(value: ReactElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementNull: Self = StObject.set(x, "element", null)
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
