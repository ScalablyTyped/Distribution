package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Published extends js.Object {
  
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
  implicit class PublishedOps[Self <: Published] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdditionsVarargs(value: DraggableDimension*): Self = this.set("additions", js.Array(value :_*))
    
    @scala.inline
    def setAdditions(value: js.Array[DraggableDimension]): Self = this.set("additions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedVarargs(value: DroppablePublish*): Self = this.set("modified", js.Array(value :_*))
    
    @scala.inline
    def setModified(value: js.Array[DroppablePublish]): Self = this.set("modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovalsVarargs(value: DraggableId*): Self = this.set("removals", js.Array(value :_*))
    
    @scala.inline
    def setRemovals(value: js.Array[DraggableId]): Self = this.set("removals", value.asInstanceOf[js.Any])
  }
}
