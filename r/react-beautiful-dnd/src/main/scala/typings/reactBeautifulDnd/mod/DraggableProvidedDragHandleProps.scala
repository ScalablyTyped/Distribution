package typings.reactBeautifulDnd.mod

import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableProvidedDragHandleProps extends js.Object {
  var `aria-describedby`: ElementId = js.native
  var `data-rbd-drag-handle-context-id`: ContextId = js.native
  var `data-rbd-drag-handle-draggable-id`: DraggableId = js.native
  var draggable: Boolean = js.native
  var onDragStart: DragEventHandler[_] = js.native
  var role: String = js.native
  var tabIndex: Double = js.native
}

object DraggableProvidedDragHandleProps {
  @scala.inline
  def apply(
    `aria-describedby`: ElementId,
    `data-rbd-drag-handle-context-id`: ContextId,
    `data-rbd-drag-handle-draggable-id`: DraggableId,
    draggable: Boolean,
    onDragStart: DragEvent[_] => Unit,
    role: String,
    tabIndex: Double
  ): DraggableProvidedDragHandleProps = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], onDragStart = js.Any.fromFunction1(onDragStart), role = role.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-rbd-drag-handle-context-id")(`data-rbd-drag-handle-context-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-rbd-drag-handle-draggable-id")(`data-rbd-drag-handle-draggable-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProvidedDragHandleProps]
  }
  @scala.inline
  implicit class DraggableProvidedDragHandlePropsOps[Self <: DraggableProvidedDragHandleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setAria-describedby`(value: ElementId): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    @scala.inline
    def `setData-rbd-drag-handle-context-id`(value: ContextId): Self = this.set("data-rbd-drag-handle-context-id", value.asInstanceOf[js.Any])
    @scala.inline
    def `setData-rbd-drag-handle-draggable-id`(value: DraggableId): Self = this.set("data-rbd-drag-handle-draggable-id", value.asInstanceOf[js.Any])
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDragStart(value: DragEvent[_] => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
  }
  
}

