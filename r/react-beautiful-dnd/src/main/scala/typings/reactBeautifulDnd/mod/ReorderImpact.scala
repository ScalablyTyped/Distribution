package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.REORDER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReorderImpact extends ImpactLocation {
  
  var destination: DraggableLocation = js.native
  
  var `type`: REORDER = js.native
}
object ReorderImpact {
  
  @scala.inline
  def apply(destination: DraggableLocation, `type`: REORDER): ReorderImpact = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReorderImpact]
  }
  
  @scala.inline
  implicit class ReorderImpactMutableBuilder[Self <: ReorderImpact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: DraggableLocation): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: REORDER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
