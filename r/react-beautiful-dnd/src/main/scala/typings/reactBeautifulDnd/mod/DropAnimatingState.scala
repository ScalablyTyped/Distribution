package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.DROP_ANIMATING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropAnimatingState
  extends StObject
     with State {
  
  var completed: CompletedDrag
  
  // We still need to render placeholders and fix the dimensions of the dragging item
  var dimensions: DimensionMap
  
  var dropDuration: Double
  
  var newHomeClientOffset: Position
  
  var phase: DROP_ANIMATING
}
object DropAnimatingState {
  
  inline def apply(
    completed: CompletedDrag,
    dimensions: DimensionMap,
    dropDuration: Double,
    newHomeClientOffset: Position
  ): DropAnimatingState = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], dropDuration = dropDuration.asInstanceOf[js.Any], newHomeClientOffset = newHomeClientOffset.asInstanceOf[js.Any], phase = "DROP_ANIMATING")
    __obj.asInstanceOf[DropAnimatingState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropAnimatingState] (val x: Self) extends AnyVal {
    
    inline def setCompleted(value: CompletedDrag): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setDimensions(value: DimensionMap): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDropDuration(value: Double): Self = StObject.set(x, "dropDuration", value.asInstanceOf[js.Any])
    
    inline def setNewHomeClientOffset(value: Position): Self = StObject.set(x, "newHomeClientOffset", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: DROP_ANIMATING): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
  }
}
