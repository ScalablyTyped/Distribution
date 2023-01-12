package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.REORDER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReorderImpact
  extends StObject
     with ImpactLocation {
  
  var destination: DraggableLocation
  
  var `type`: REORDER
}
object ReorderImpact {
  
  inline def apply(destination: DraggableLocation): ReorderImpact = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("REORDER")
    __obj.asInstanceOf[ReorderImpact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReorderImpact] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: DraggableLocation): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setType(value: REORDER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
