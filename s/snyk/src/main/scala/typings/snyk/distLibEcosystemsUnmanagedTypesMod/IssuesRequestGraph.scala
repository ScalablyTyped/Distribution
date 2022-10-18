package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuesRequestGraph extends StObject {
  
  var component_details: ComponentDetails
  
  var nodes: js.Array[IssuesRequestNodeOpenApi]
  
  var rootNodeId: String
}
object IssuesRequestGraph {
  
  inline def apply(component_details: ComponentDetails, nodes: js.Array[IssuesRequestNodeOpenApi], rootNodeId: String): IssuesRequestGraph = {
    val __obj = js.Dynamic.literal(component_details = component_details.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], rootNodeId = rootNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesRequestGraph]
  }
  
  extension [Self <: IssuesRequestGraph](x: Self) {
    
    inline def setComponent_details(value: ComponentDetails): Self = StObject.set(x, "component_details", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: js.Array[IssuesRequestNodeOpenApi]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: IssuesRequestNodeOpenApi*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setRootNodeId(value: String): Self = StObject.set(x, "rootNodeId", value.asInstanceOf[js.Any])
  }
}
