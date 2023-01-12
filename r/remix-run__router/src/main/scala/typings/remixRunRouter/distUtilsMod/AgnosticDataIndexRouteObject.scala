package typings.remixRunRouter.distUtilsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgnosticDataIndexRouteObject
  extends StObject
     with AgnosticIndexRouteObject
     with AgnosticDataRouteObject {
  
  @JSName("id")
  var id_AgnosticDataIndexRouteObject: String
}
object AgnosticDataIndexRouteObject {
  
  inline def apply(children: Unit, id: String): AgnosticDataIndexRouteObject = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = true)
    __obj.asInstanceOf[AgnosticDataIndexRouteObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgnosticDataIndexRouteObject] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
