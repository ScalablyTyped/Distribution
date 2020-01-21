package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeCapture extends js.Object {
  var draggableId: DraggableId
  var mode: MovementMode
}

object BeforeCapture {
  @scala.inline
  def apply(draggableId: DraggableId, mode: MovementMode): BeforeCapture = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BeforeCapture]
  }
}

