package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  var component_details: ComponentDetailsOpenApi
  
  var dep_graph_data: DepGraphDataOpenAPI
  
  var start_time: Double
}
object Attributes {
  
  inline def apply(
    component_details: ComponentDetailsOpenApi,
    dep_graph_data: DepGraphDataOpenAPI,
    start_time: Double
  ): Attributes = {
    val __obj = js.Dynamic.literal(component_details = component_details.asInstanceOf[js.Any], dep_graph_data = dep_graph_data.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
    
    inline def setComponent_details(value: ComponentDetailsOpenApi): Self = StObject.set(x, "component_details", value.asInstanceOf[js.Any])
    
    inline def setDep_graph_data(value: DepGraphDataOpenAPI): Self = StObject.set(x, "dep_graph_data", value.asInstanceOf[js.Any])
    
    inline def setStart_time(value: Double): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
  }
}
