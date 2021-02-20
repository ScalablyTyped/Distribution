package typings.sparqljs.mod

import typings.sparqljs.sparqljsBooleans.`false`
import typings.sparqljs.sparqljsStrings.load
import org.scalablytyped.runtime.StObject
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
  implicit class LoadOperationMutableBuilder[Self <: LoadOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: IriTerm | `false`): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: IriTerm): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: load): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
