package typings.reactSortablePane.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var delta: Double
  var isPressed: Boolean
  var isResizing: Boolean
  var lastPressed: Double
  var mouse: Double
  var panes: js.Array[PaneProperty]
}

object State {
  @scala.inline
  def apply(
    delta: Double,
    isPressed: Boolean,
    isResizing: Boolean,
    lastPressed: Double,
    mouse: Double,
    panes: js.Array[PaneProperty]
  ): State = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], isPressed = isPressed.asInstanceOf[js.Any], isResizing = isResizing.asInstanceOf[js.Any], lastPressed = lastPressed.asInstanceOf[js.Any], mouse = mouse.asInstanceOf[js.Any], panes = panes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

