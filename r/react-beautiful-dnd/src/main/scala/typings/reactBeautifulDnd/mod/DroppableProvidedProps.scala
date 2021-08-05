package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableProvidedProps extends StObject {
  
  // used for shared global styles
  var `data-rbd-droppable-context-id`: String
  
  // Used to lookup. Currently not used for drag and drop lifecycle
  var `data-rbd-droppable-id`: DroppableId
}
object DroppableProvidedProps {
  
  inline def apply(`data-rbd-droppable-context-id`: String, `data-rbd-droppable-id`: DroppableId): DroppableProvidedProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data-rbd-droppable-context-id")(`data-rbd-droppable-context-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-rbd-droppable-id")(`data-rbd-droppable-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableProvidedProps]
  }
  
  extension [Self <: DroppableProvidedProps](x: Self) {
    
    inline def `setData-rbd-droppable-context-id`(value: String): Self = StObject.set(x, "data-rbd-droppable-context-id", value.asInstanceOf[js.Any])
    
    inline def `setData-rbd-droppable-id`(value: DroppableId): Self = StObject.set(x, "data-rbd-droppable-id", value.asInstanceOf[js.Any])
  }
}
