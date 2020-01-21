package typings.reactBeautifulDnd.mod

import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
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
    onDragStart: DragEvent[_] => Unit,
    onKeyDown: KeyboardEvent[_] => Unit,
    onMouseDown: MouseEvent[_, NativeMouseEvent] => Unit,
    onTouchMove: TouchEvent[_] => Unit,
    onTouchStart: TouchEvent[_] => Unit,
    tabIndex: Double
  ): DraggableProvidedDragHandleProps = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], onDragStart = js.Any.fromFunction1(onDragStart), onKeyDown = js.Any.fromFunction1(onKeyDown), onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchMove = js.Any.fromFunction1(onTouchMove), onTouchStart = js.Any.fromFunction1(onTouchStart), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-react-beautiful-dnd-drag-handle")(`data-react-beautiful-dnd-drag-handle`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProvidedDragHandleProps]
  }
}

