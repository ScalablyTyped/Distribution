package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Published extends StObject {
  
  var additions: js.Array[DraggableDimension]
  
  var modified: js.Array[DroppablePublish]
  
  var removals: js.Array[DraggableId]
}
object Published {
  
  inline def apply(
    additions: js.Array[DraggableDimension],
    modified: js.Array[DroppablePublish],
    removals: js.Array[DraggableId]
  ): Published = {
    val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], removals = removals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Published]
  }
  
  extension [Self <: Published](x: Self) {
    
    inline def setAdditions(value: js.Array[DraggableDimension]): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
    
    inline def setAdditionsVarargs(value: DraggableDimension*): Self = StObject.set(x, "additions", js.Array(value :_*))
    
    inline def setModified(value: js.Array[DroppablePublish]): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setModifiedVarargs(value: DroppablePublish*): Self = StObject.set(x, "modified", js.Array(value :_*))
    
    inline def setRemovals(value: js.Array[DraggableId]): Self = StObject.set(x, "removals", value.asInstanceOf[js.Any])
    
    inline def setRemovalsVarargs(value: DraggableId*): Self = StObject.set(x, "removals", js.Array(value :_*))
  }
}
