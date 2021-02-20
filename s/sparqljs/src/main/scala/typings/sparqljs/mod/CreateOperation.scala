package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.create
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOperation extends ManagementOperation {
  
  var graph: IriTerm = js.native
  
  var silent: Boolean = js.native
  
  var `type`: create = js.native
}
object CreateOperation {
  
  @scala.inline
  def apply(graph: IriTerm, silent: Boolean, `type`: create): CreateOperation = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
