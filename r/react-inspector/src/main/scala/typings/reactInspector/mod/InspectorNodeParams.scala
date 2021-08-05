package typings.reactInspector.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectorNodeParams extends StObject {
  
  var data: js.Any
  
  var depth: Double
  
  var expanded: Boolean
  
  var isNonenumerable: Boolean
  
  var name: String
}
object InspectorNodeParams {
  
  inline def apply(data: js.Any, depth: Double, expanded: Boolean, isNonenumerable: Boolean, name: String): InspectorNodeParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], isNonenumerable = isNonenumerable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorNodeParams]
  }
  
  extension [Self <: InspectorNodeParams](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setIsNonenumerable(value: Boolean): Self = StObject.set(x, "isNonenumerable", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
