package typings.reactTypesShared.srcDndMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragDropEvent extends StObject {
  
  /** The x coordinate of the event, relative to the target element. */
  var x: Double
  
  /** The y coordinate of the event, relative to the target element. */
  var y: Double
}
object DragDropEvent {
  
  inline def apply(x: Double, y: Double): DragDropEvent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDropEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragDropEvent] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
