package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.reactBeautifulDnd.mod.DraggableRubric because var conflicts: draggableId, mode. Inlined  */ trait DragStart extends BeforeCapture {
  var source: DraggableLocation
  var `type`: TypeId
}

object DragStart {
  @scala.inline
  def apply(draggableId: DraggableId, mode: MovementMode, source: DraggableLocation, `type`: TypeId): DragStart = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragStart]
  }
}

