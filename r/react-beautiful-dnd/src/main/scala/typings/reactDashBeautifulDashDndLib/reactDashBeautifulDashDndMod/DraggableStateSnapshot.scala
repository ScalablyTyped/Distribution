package typings
package reactDashBeautifulDashDndLib.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableStateSnapshot extends js.Object {
  // a combine target is being dragged over by
  var combineTargetFor: js.UndefOr[DraggableId] = js.undefined
  // the id of a draggable that you are combining with
  var combineWith: js.UndefOr[DraggableId] = js.undefined
  var draggingOver: js.UndefOr[DroppableId] = js.undefined
  var dropAnimation: js.UndefOr[DropAnimation] = js.undefined
  var isDragging: scala.Boolean
  var isDropAnimating: scala.Boolean
  // What type of movement is being done: 'FLUID' or 'SNAP'
  var mode: js.UndefOr[MovementMode] = js.undefined
}

object DraggableStateSnapshot {
  @scala.inline
  def apply(
    isDragging: scala.Boolean,
    isDropAnimating: scala.Boolean,
    combineTargetFor: DraggableId = null,
    combineWith: DraggableId = null,
    draggingOver: DroppableId = null,
    dropAnimation: DropAnimation = null,
    mode: MovementMode = null
  ): DraggableStateSnapshot = {
    val __obj = js.Dynamic.literal(isDragging = isDragging, isDropAnimating = isDropAnimating)
    if (combineTargetFor != null) __obj.updateDynamic("combineTargetFor")(combineTargetFor)
    if (combineWith != null) __obj.updateDynamic("combineWith")(combineWith)
    if (draggingOver != null) __obj.updateDynamic("draggingOver")(draggingOver)
    if (dropAnimation != null) __obj.updateDynamic("dropAnimation")(dropAnimation)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[DraggableStateSnapshot]
  }
}

