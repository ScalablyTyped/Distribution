package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.create
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOperation
  extends StObject
     with ManagementOperation {
  
  var graph: IriTerm
  
  var silent: Boolean
  
  var `type`: create
}
object CreateOperation {
  
  inline def apply(graph: IriTerm, silent: Boolean): CreateOperation = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("create")
    __obj.asInstanceOf[CreateOperation]
  }
  
  extension [Self <: CreateOperation](x: Self) {
    
    inline def setGraph(value: IriTerm): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setType(value: create): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
