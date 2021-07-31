package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionMap extends StObject {
  
  var draggables: DraggableDimensionMap
  
  var droppables: DroppableDimensionMap
}
object DimensionMap {
  
  @scala.inline
  def apply(draggables: DraggableDimensionMap, droppables: DroppableDimensionMap): DimensionMap = {
    val __obj = js.Dynamic.literal(draggables = draggables.asInstanceOf[js.Any], droppables = droppables.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionMap]
  }
  
  @scala.inline
  implicit class DimensionMapMutableBuilder[Self <: DimensionMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggables(value: DraggableDimensionMap): Self = StObject.set(x, "draggables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDroppables(value: DroppableDimensionMap): Self = StObject.set(x, "droppables", value.asInstanceOf[js.Any])
  }
}
