package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppablePublish extends StObject {
  
  var droppableId: DroppableId
  
  var scroll: Position
}
object DroppablePublish {
  
  inline def apply(droppableId: DroppableId, scroll: Position): DroppablePublish = {
    val __obj = js.Dynamic.literal(droppableId = droppableId.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppablePublish]
  }
  
  extension [Self <: DroppablePublish](x: Self) {
    
    inline def setDroppableId(value: DroppableId): Self = StObject.set(x, "droppableId", value.asInstanceOf[js.Any])
    
    inline def setScroll(value: Position): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
  }
}
