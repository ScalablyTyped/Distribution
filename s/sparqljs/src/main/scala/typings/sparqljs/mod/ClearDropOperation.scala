package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.clear
import typings.sparqljs.sparqljsStrings.drop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearDropOperation extends ManagementOperation {
  
  var graph: GraphReference = js.native
  
  var silent: Boolean = js.native
  
  var `type`: clear | drop = js.native
}
object ClearDropOperation {
  
  @scala.inline
  def apply(graph: GraphReference, silent: Boolean, `type`: clear | drop): ClearDropOperation = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearDropOperation]
  }
  
  @scala.inline
  implicit class ClearDropOperationOps[Self <: ClearDropOperation] (val x: Self) extends AnyVal {
    
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
    def setGraph(value: GraphReference): Self = this.set("graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: clear | drop): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
