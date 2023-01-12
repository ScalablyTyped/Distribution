package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphOpenApi extends StObject {
  
  var nodes: js.Array[NodeOpenApi]
  
  var root_node_id: String
}
object GraphOpenApi {
  
  inline def apply(nodes: js.Array[NodeOpenApi], root_node_id: String): GraphOpenApi = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], root_node_id = root_node_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphOpenApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphOpenApi] (val x: Self) extends AnyVal {
    
    inline def setNodes(value: js.Array[NodeOpenApi]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: NodeOpenApi*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setRoot_node_id(value: String): Self = StObject.set(x, "root_node_id", value.asInstanceOf[js.Any])
  }
}
