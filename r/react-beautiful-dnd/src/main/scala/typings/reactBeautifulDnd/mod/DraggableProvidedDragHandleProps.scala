package typings.reactBeautifulDnd.mod

import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableProvidedDragHandleProps extends js.Object {
  var `aria-labelledby`: ElementId
  var `data-rbd-drag-handle-context-id`: ContextId
  var `data-rbd-drag-handle-draggable-id`: DraggableId
  var draggable: Boolean
  var onDragStart: DragEventHandler[_]
  var tabIndex: Double
}

object DraggableProvidedDragHandleProps {
  @scala.inline
  def apply(
    `aria-labelledby`: ElementId,
    `data-rbd-drag-handle-context-id`: ContextId,
    `data-rbd-drag-handle-draggable-id`: DraggableId,
    draggable: Boolean,
    onDragStart: DragEvent[_] => Unit,
    tabIndex: Double
  ): DraggableProvidedDragHandleProps = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], onDragStart = js.Any.fromFunction1(onDragStart), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-rbd-drag-handle-context-id")(`data-rbd-drag-handle-context-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-rbd-drag-handle-draggable-id")(`data-rbd-drag-handle-draggable-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProvidedDragHandleProps]
  }
}

