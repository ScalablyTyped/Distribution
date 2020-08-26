package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableControlProps extends BaseControlProps {
  var draggable: js.UndefOr[Boolean] = js.native
  var onDrag: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragEnd: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragStart: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
}

object DraggableControlProps {
  @scala.inline
  def apply(): DraggableControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableControlProps]
  }
  @scala.inline
  implicit class DraggableControlPropsOps[Self <: DraggableControlProps] (val x: Self) extends AnyVal {
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
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setOnDrag(value: /* event */ DragEvent => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    @scala.inline
    def setOnDragEnd(value: /* event */ DragEvent => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnDragStart(value: /* event */ DragEvent => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
  }
  
}

