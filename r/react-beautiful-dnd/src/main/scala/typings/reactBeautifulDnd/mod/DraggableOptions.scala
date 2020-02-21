package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableOptions extends js.Object {
  var canDragInteractiveElements: Boolean
  var isEnabled: Boolean
  var shouldRespectForcePress: Boolean
}

object DraggableOptions {
  @scala.inline
  def apply(canDragInteractiveElements: Boolean, isEnabled: Boolean, shouldRespectForcePress: Boolean): DraggableOptions = {
    val __obj = js.Dynamic.literal(canDragInteractiveElements = canDragInteractiveElements.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], shouldRespectForcePress = shouldRespectForcePress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DraggableOptions]
  }
}

