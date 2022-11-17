package typings.remixRunRouter.distUtilsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgnosticNonIndexRouteObject
  extends StObject
     with AgnosticBaseRouteObject {
  
  var children: js.UndefOr[js.Array[AgnosticRouteObject]] = js.undefined
  
  var index: js.UndefOr[false] = js.undefined
}
object AgnosticNonIndexRouteObject {
  
  inline def apply(): AgnosticNonIndexRouteObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgnosticNonIndexRouteObject]
  }
  
  extension [Self <: AgnosticNonIndexRouteObject](x: Self) {
    
    inline def setChildren(value: js.Array[AgnosticRouteObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: AgnosticRouteObject*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setIndex(value: false): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
