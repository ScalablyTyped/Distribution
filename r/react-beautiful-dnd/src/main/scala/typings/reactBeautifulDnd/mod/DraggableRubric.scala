package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableRubric extends js.Object {
  var draggableId: DraggableId
  var mode: MovementMode
}

object DraggableRubric {
  @scala.inline
  def apply(draggableId: DraggableId, mode: MovementMode): DraggableRubric = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DraggableRubric]
  }
}

