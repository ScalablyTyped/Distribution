package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Graph extends StObject {
  
  /**
    * A description of the graph.
    */
  var description: js.UndefOr[Message] = js.undefined
  
  /**
    * An array of edge objects representing the edges of the graph.
    */
  var edges: js.UndefOr[js.Array[Edge]] = js.undefined
  
  /**
    * An array of node objects representing the nodes of the graph.
    */
  var nodes: js.UndefOr[js.Array[Node]] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the graph.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}
object Graph {
  
  @scala.inline
  def apply(): Graph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Graph]
  }
  
  @scala.inline
  implicit class GraphMutableBuilder[Self <: Graph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEdges(value: js.Array[Edge]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    @scala.inline
    def setEdgesVarargs(value: Edge*): Self = StObject.set(x, "edges", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
