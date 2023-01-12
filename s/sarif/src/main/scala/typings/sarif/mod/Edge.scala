package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Edge extends StObject {
  
  /**
    * A string that uniquely identifies the edge within its graph.
    */
  var id: String
  
  /**
    * A short description of the edge.
    */
  var label: js.UndefOr[Message] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the edge.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * Identifies the source node (the node at which the edge starts).
    */
  var sourceNodeId: String
  
  /**
    * Identifies the target node (the node at which the edge ends).
    */
  var targetNodeId: String
}
object Edge {
  
  inline def apply(id: String, sourceNodeId: String, targetNodeId: String): Edge = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceNodeId = sourceNodeId.asInstanceOf[js.Any], targetNodeId = targetNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Edge] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Message): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setSourceNodeId(value: String): Self = StObject.set(x, "sourceNodeId", value.asInstanceOf[js.Any])
    
    inline def setTargetNodeId(value: String): Self = StObject.set(x, "targetNodeId", value.asInstanceOf[js.Any])
  }
}
