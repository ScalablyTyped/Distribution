package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.add
import typings.sparqljs.sparqljsStrings.copy
import typings.sparqljs.sparqljsStrings.move
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyMoveAddOperation extends ManagementOperation {
  
  var destination: GraphOrDefault = js.native
  
  var silent: Boolean = js.native
  
  var source: GraphOrDefault = js.native
  
  var `type`: copy | move | add = js.native
}
object CopyMoveAddOperation {
  
  @scala.inline
  def apply(destination: GraphOrDefault, silent: Boolean, source: GraphOrDefault, `type`: copy | move | add): CopyMoveAddOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyMoveAddOperation]
  }
  
  @scala.inline
  implicit class CopyMoveAddOperationMutableBuilder[Self <: CopyMoveAddOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: GraphOrDefault): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: GraphOrDefault): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: copy | move | add): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
