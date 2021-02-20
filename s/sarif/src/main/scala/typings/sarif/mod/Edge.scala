package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edge extends StObject {
  
  /**
    * A string that uniquely identifies the edge within its graph.
    */
  var id: String = js.native
  
  /**
    * A short description of the edge.
    */
  var label: js.UndefOr[Message] = js.native
  
  /**
    * Key/value pairs that provide additional information about the edge.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * Identifies the source node (the node at which the edge starts).
    */
  var sourceNodeId: String = js.native
  
  /**
    * Identifies the target node (the node at which the edge ends).
    */
  var targetNodeId: String = js.native
}
object Edge {
  
  @scala.inline
  def apply(id: String, sourceNodeId: String, targetNodeId: String): Edge = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceNodeId = sourceNodeId.asInstanceOf[js.Any], targetNodeId = targetNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
  
  @scala.inline
  implicit class EdgeMutableBuilder[Self <: Edge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Message): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setSourceNodeId(value: String): Self = StObject.set(x, "sourceNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNodeId(value: String): Self = StObject.set(x, "targetNodeId", value.asInstanceOf[js.Any])
  }
}
