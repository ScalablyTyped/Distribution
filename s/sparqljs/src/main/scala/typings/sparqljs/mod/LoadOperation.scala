package typings.sparqljs.mod

import typings.sparqljs.sparqljsBooleans.`false`
import typings.sparqljs.sparqljsStrings.load
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadOperation extends ManagementOperation {
  
  var destination: IriTerm | `false` = js.native
  
  var silent: Boolean = js.native
  
  var source: IriTerm = js.native
  
  var `type`: load = js.native
}
object LoadOperation {
  
  @scala.inline
  def apply(destination: IriTerm | `false`, silent: Boolean, source: IriTerm, `type`: load): LoadOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadOperation]
  }
  
  @scala.inline
  implicit class LoadOperationOps[Self <: LoadOperation] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: IriTerm | `false`): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: IriTerm): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: load): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
