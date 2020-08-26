package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableStateSnapshot extends js.Object {
  // a combine target is being dragged over by
  var combineTargetFor: js.UndefOr[DraggableId] = js.native
  // the id of a draggable that you are combining with
  var combineWith: js.UndefOr[DraggableId] = js.native
  var draggingOver: js.UndefOr[DroppableId] = js.native
  var dropAnimation: js.UndefOr[DropAnimation] = js.native
  var isDragging: Boolean = js.native
  var isDropAnimating: Boolean = js.native
  // What type of movement is being done: 'FLUID' or 'SNAP'
  var mode: js.UndefOr[MovementMode] = js.native
}

object DraggableStateSnapshot {
  @scala.inline
  def apply(isDragging: Boolean, isDropAnimating: Boolean): DraggableStateSnapshot = {
    val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any], isDropAnimating = isDropAnimating.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableStateSnapshot]
  }
  @scala.inline
  implicit class DraggableStateSnapshotOps[Self <: DraggableStateSnapshot] (val x: Self) extends AnyVal {
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
    def setIsDragging(value: Boolean): Self = this.set("isDragging", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDropAnimating(value: Boolean): Self = this.set("isDropAnimating", value.asInstanceOf[js.Any])
    @scala.inline
    def setCombineTargetFor(value: DraggableId): Self = this.set("combineTargetFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCombineTargetFor: Self = this.set("combineTargetFor", js.undefined)
    @scala.inline
    def setCombineWith(value: DraggableId): Self = this.set("combineWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCombineWith: Self = this.set("combineWith", js.undefined)
    @scala.inline
    def setDraggingOver(value: DroppableId): Self = this.set("draggingOver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggingOver: Self = this.set("draggingOver", js.undefined)
    @scala.inline
    def setDropAnimation(value: DropAnimation): Self = this.set("dropAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropAnimation: Self = this.set("dropAnimation", js.undefined)
    @scala.inline
    def setMode(value: MovementMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

