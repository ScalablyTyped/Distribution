package typings.storybookRouter.distTs3Dot9ModulesReactRouterIndexMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteObject extends StObject {
  
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[js.Array[RouteObject]] = js.undefined
  
  var element: js.UndefOr[ReactNode] = js.undefined
  
  var index: js.UndefOr[Boolean] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
}
object RouteObject {
  
  inline def apply(): RouteObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteObject]
  }
  
  extension [Self <: RouteObject](x: Self) {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setChildren(value: js.Array[RouteObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: RouteObject*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setElement(value: ReactNode): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
