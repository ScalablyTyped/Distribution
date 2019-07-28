package typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableStateSnapshot extends js.Object {
  var draggingFromThisWith: js.UndefOr[DraggableId] = js.undefined
  var draggingOverWith: js.UndefOr[DraggableId] = js.undefined
  var isDraggingOver: Boolean
}

object DroppableStateSnapshot {
  @scala.inline
  def apply(
    isDraggingOver: Boolean,
    draggingFromThisWith: DraggableId = null,
    draggingOverWith: DraggableId = null
  ): DroppableStateSnapshot = {
    val __obj = js.Dynamic.literal(isDraggingOver = isDraggingOver)
    if (draggingFromThisWith != null) __obj.updateDynamic("draggingFromThisWith")(draggingFromThisWith)
    if (draggingOverWith != null) __obj.updateDynamic("draggingOverWith")(draggingOverWith)
    __obj.asInstanceOf[DroppableStateSnapshot]
  }
}

