package typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod

import typings.react.reactMod.DragEventHandler
import typings.react.reactMod.KeyboardEventHandler
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableProvidedDragHandleProps extends js.Object {
  var `aria-grabbed`: Boolean
  var `aria-roledescription`: String
  var `data-react-beautiful-dnd-drag-handle`: String
  var draggable: Boolean
  var onDragStart: DragEventHandler[_]
  var onKeyDown: KeyboardEventHandler[_]
  var onMouseDown: MouseEventHandler[_]
  var onTouchMove: TouchEventHandler[_]
  var onTouchStart: TouchEventHandler[_]
  var tabIndex: Double
}

object DraggableProvidedDragHandleProps {
  @scala.inline
  def apply(
    `aria-grabbed`: Boolean,
    `aria-roledescription`: String,
    `data-react-beautiful-dnd-drag-handle`: String,
    draggable: Boolean,
    onDragStart: DragEventHandler[_],
    onKeyDown: KeyboardEventHandler[_],
    onMouseDown: MouseEventHandler[_],
    onTouchMove: TouchEventHandler[_],
    onTouchStart: TouchEventHandler[_],
    tabIndex: Double
  ): DraggableProvidedDragHandleProps = {
    val __obj = js.Dynamic.literal(draggable = draggable, onDragStart = onDragStart, onKeyDown = onKeyDown, onMouseDown = onMouseDown, onTouchMove = onTouchMove, onTouchStart = onTouchStart, tabIndex = tabIndex)
    __obj.updateDynamic("aria-grabbed")(`aria-grabbed`)
    __obj.updateDynamic("aria-roledescription")(`aria-roledescription`)
    __obj.updateDynamic("data-react-beautiful-dnd-drag-handle")(`data-react-beautiful-dnd-drag-handle`)
    __obj.asInstanceOf[DraggableProvidedDragHandleProps]
  }
}

