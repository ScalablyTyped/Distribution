package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edge extends js.Object {
  
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
  implicit class EdgeOps[Self <: Edge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNodeId(value: String): Self = this.set("sourceNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNodeId(value: String): Self = this.set("targetNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Message): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
