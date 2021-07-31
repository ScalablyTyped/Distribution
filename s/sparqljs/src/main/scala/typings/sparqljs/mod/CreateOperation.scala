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
  
  @scala.inline
  def apply(graph: IriTerm, silent: Boolean): CreateOperation = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("create")
    __obj.asInstanceOf[CreateOperation]
  }
  
  @scala.inline
  implicit class CreateOperationMutableBuilder[Self <: CreateOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraph(value: IriTerm): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: create): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
