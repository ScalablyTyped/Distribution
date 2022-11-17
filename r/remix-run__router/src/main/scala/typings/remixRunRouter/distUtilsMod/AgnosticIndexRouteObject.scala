package typings.remixRunRouter.distUtilsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgnosticIndexRouteObject
  extends StObject
     with AgnosticBaseRouteObject {
  
  var children: Unit
  
  var index: true
}
object AgnosticIndexRouteObject {
  
  inline def apply(children: Unit): AgnosticIndexRouteObject = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], index = true)
    __obj.asInstanceOf[AgnosticIndexRouteObject]
  }
  
  extension [Self <: AgnosticIndexRouteObject](x: Self) {
    
    inline def setChildren(value: Unit): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: true): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
