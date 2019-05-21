package typings
package reactDashBeautifulDashDndLib.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableProvidedDragHandleProps extends js.Object {
  var `aria-grabbed`: scala.Boolean
  var `aria-roledescription`: java.lang.String
  var `data-react-beautiful-dnd-drag-handle`: java.lang.String
  var draggable: scala.Boolean
  var onDragStart: reactLib.reactMod.DragEventHandler[_]
  var onKeyDown: reactLib.reactMod.KeyboardEventHandler[_]
  var onMouseDown: reactLib.reactMod.MouseEventHandler[_]
  var onTouchMove: reactLib.reactMod.TouchEventHandler[_]
  var onTouchStart: reactLib.reactMod.TouchEventHandler[_]
  var tabIndex: scala.Double
}

object DraggableProvidedDragHandleProps {
  @scala.inline
  def apply(
    `aria-grabbed`: scala.Boolean,
    `aria-roledescription`: java.lang.String,
    `data-react-beautiful-dnd-drag-handle`: java.lang.String,
    draggable: scala.Boolean,
    onDragStart: reactLib.reactMod.DragEventHandler[_],
    onKeyDown: reactLib.reactMod.KeyboardEventHandler[_],
    onMouseDown: reactLib.reactMod.MouseEventHandler[_],
    onTouchMove: reactLib.reactMod.TouchEventHandler[_],
    onTouchStart: reactLib.reactMod.TouchEventHandler[_],
    tabIndex: scala.Double
  ): DraggableProvidedDragHandleProps = {
    val __obj = js.Dynamic.literal(draggable = draggable, onDragStart = onDragStart, onKeyDown = onKeyDown, onMouseDown = onMouseDown, onTouchMove = onTouchMove, onTouchStart = onTouchStart, tabIndex = tabIndex)
    __obj.updateDynamic("aria-grabbed")(`aria-grabbed`)
    __obj.updateDynamic("aria-roledescription")(`aria-roledescription`)
    __obj.updateDynamic("data-react-beautiful-dnd-drag-handle")(`data-react-beautiful-dnd-drag-handle`)
    __obj.asInstanceOf[DraggableProvidedDragHandleProps]
  }
}

