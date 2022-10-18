package typings.remixRunRouter.distUtilsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgnosticDataNonIndexRouteObject
  extends StObject
     with AgnosticNonIndexRouteObject
     with AgnosticDataRouteObject {
  
  @JSName("children")
  var children_AgnosticDataNonIndexRouteObject: js.UndefOr[js.Array[AgnosticDataRouteObject]] = js.undefined
  
  @JSName("id")
  var id_AgnosticDataNonIndexRouteObject: String
}
object AgnosticDataNonIndexRouteObject {
  
  inline def apply(id: String): AgnosticDataNonIndexRouteObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgnosticDataNonIndexRouteObject]
  }
  
  extension [Self <: AgnosticDataNonIndexRouteObject](x: Self) {
    
    inline def setChildren(value: js.Array[AgnosticDataRouteObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: AgnosticDataRouteObject*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
