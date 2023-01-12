package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuesRequestAttributes extends StObject {
  
  var component_details: IssuesRequestComponentDetails
  
  var dep_graph: IssuesRequestDepGraphDataOpenAPI
  
  var start_time: Double
}
object IssuesRequestAttributes {
  
  inline def apply(
    component_details: IssuesRequestComponentDetails,
    dep_graph: IssuesRequestDepGraphDataOpenAPI,
    start_time: Double
  ): IssuesRequestAttributes = {
    val __obj = js.Dynamic.literal(component_details = component_details.asInstanceOf[js.Any], dep_graph = dep_graph.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesRequestAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IssuesRequestAttributes] (val x: Self) extends AnyVal {
    
    inline def setComponent_details(value: IssuesRequestComponentDetails): Self = StObject.set(x, "component_details", value.asInstanceOf[js.Any])
    
    inline def setDep_graph(value: IssuesRequestDepGraphDataOpenAPI): Self = StObject.set(x, "dep_graph", value.asInstanceOf[js.Any])
    
    inline def setStart_time(value: Double): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
  }
}
