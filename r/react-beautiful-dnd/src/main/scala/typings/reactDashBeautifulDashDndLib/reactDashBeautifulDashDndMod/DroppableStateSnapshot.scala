package typings
package reactDashBeautifulDashDndLib.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableStateSnapshot extends js.Object {
  var draggingOverWith: js.UndefOr[DraggableId] = js.undefined
  var isDraggingOver: scala.Boolean
}

object DroppableStateSnapshot {
  @scala.inline
  def apply(isDraggingOver: scala.Boolean, draggingOverWith: DraggableId = null): DroppableStateSnapshot = {
    val __obj = js.Dynamic.literal(isDraggingOver = isDraggingOver)
    if (draggingOverWith != null) __obj.updateDynamic("draggingOverWith")(draggingOverWith)
    __obj.asInstanceOf[DroppableStateSnapshot]
  }
}

