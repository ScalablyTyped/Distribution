package typings.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dependencies extends StObject {
  
  var firstContext: ContextDependency[Any] | Null
  
  var lanes: Lanes
}
object Dependencies {
  
  inline def apply(lanes: Lanes): Dependencies = {
    val __obj = js.Dynamic.literal(lanes = lanes.asInstanceOf[js.Any], firstContext = null)
    __obj.asInstanceOf[Dependencies]
  }
  
  extension [Self <: Dependencies](x: Self) {
    
    inline def setFirstContext(value: ContextDependency[Any]): Self = StObject.set(x, "firstContext", value.asInstanceOf[js.Any])
    
    inline def setFirstContextNull: Self = StObject.set(x, "firstContext", null)
    
    inline def setLanes(value: Lanes): Self = StObject.set(x, "lanes", value.asInstanceOf[js.Any])
  }
}
