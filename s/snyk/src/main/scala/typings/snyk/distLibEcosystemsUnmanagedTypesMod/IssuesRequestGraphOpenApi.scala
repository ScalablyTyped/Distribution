package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuesRequestGraphOpenApi extends StObject {
  
  var component_details: ComponentDetailsOpenApi
  
  var nodes: js.Array[IssuesRequestNodeOpenApi]
  
  var root_node_id: String
}
object IssuesRequestGraphOpenApi {
  
  inline def apply(
    component_details: ComponentDetailsOpenApi,
    nodes: js.Array[IssuesRequestNodeOpenApi],
    root_node_id: String
  ): IssuesRequestGraphOpenApi = {
    val __obj = js.Dynamic.literal(component_details = component_details.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], root_node_id = root_node_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesRequestGraphOpenApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IssuesRequestGraphOpenApi] (val x: Self) extends AnyVal {
    
    inline def setComponent_details(value: ComponentDetailsOpenApi): Self = StObject.set(x, "component_details", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: js.Array[IssuesRequestNodeOpenApi]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: IssuesRequestNodeOpenApi*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setRoot_node_id(value: String): Self = StObject.set(x, "root_node_id", value.asInstanceOf[js.Any])
  }
}
