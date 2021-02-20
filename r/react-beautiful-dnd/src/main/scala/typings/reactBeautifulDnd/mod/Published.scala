package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Published extends StObject {
  
  var additions: js.Array[DraggableDimension] = js.native
  
  var modified: js.Array[DroppablePublish] = js.native
  
  var removals: js.Array[DraggableId] = js.native
}
object Published {
  
  @scala.inline
  def apply(
    additions: js.Array[DraggableDimension],
    modified: js.Array[DroppablePublish],
    removals: js.Array[DraggableId]
  ): Published = {
    val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], removals = removals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Published]
  }
  
  @scala.inline
  implicit class PublishedMutableBuilder[Self <: Published] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditions(value: js.Array[DraggableDimension]): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionsVarargs(value: DraggableDimension*): Self = StObject.set(x, "additions", js.Array(value :_*))
    
    @scala.inline
    def setModified(value: js.Array[DroppablePublish]): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedVarargs(value: DroppablePublish*): Self = StObject.set(x, "modified", js.Array(value :_*))
    
    @scala.inline
    def setRemovals(value: js.Array[DraggableId]): Self = StObject.set(x, "removals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovalsVarargs(value: DraggableId*): Self = StObject.set(x, "removals", js.Array(value :_*))
  }
}
