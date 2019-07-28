package typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragStart extends js.Object {
  var draggableId: DraggableId
  var mode: MovementMode
  var source: DraggableLocation
  var `type`: TypeId
}

object DragStart {
  @scala.inline
  def apply(draggableId: DraggableId, mode: MovementMode, source: DraggableLocation, `type`: TypeId): DragStart = {
    val __obj = js.Dynamic.literal(draggableId = draggableId, mode = mode, source = source)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DragStart]
  }
}

