package typings.seen.mod

import typings.std.Event
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseEventOptions extends js.Object {
  var drag: js.UndefOr[EventListener] = js.native
  var dragEnd: js.UndefOr[EventListener] = js.native
  var dragStart: js.UndefOr[EventListener] = js.native
  var mouseDown: js.UndefOr[EventListener] = js.native
  var mouseMove: js.UndefOr[EventListener] = js.native
  var mouseUp: js.UndefOr[EventListener] = js.native
  var mouseWheel: js.UndefOr[EventListener] = js.native
}

object MouseEventOptions {
  @scala.inline
  def apply(): MouseEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseEventOptions]
  }
  @scala.inline
  implicit class MouseEventOptionsOps[Self <: MouseEventOptions] (val x: Self) extends AnyVal {
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
    def setDrag(value: /* evt */ Event => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    @scala.inline
    def setDragEnd(value: /* evt */ Event => Unit): Self = this.set("dragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragEnd: Self = this.set("dragEnd", js.undefined)
    @scala.inline
    def setDragStart(value: /* evt */ Event => Unit): Self = this.set("dragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragStart: Self = this.set("dragStart", js.undefined)
    @scala.inline
    def setMouseDown(value: /* evt */ Event => Unit): Self = this.set("mouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseDown: Self = this.set("mouseDown", js.undefined)
    @scala.inline
    def setMouseMove(value: /* evt */ Event => Unit): Self = this.set("mouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseMove: Self = this.set("mouseMove", js.undefined)
    @scala.inline
    def setMouseUp(value: /* evt */ Event => Unit): Self = this.set("mouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseUp: Self = this.set("mouseUp", js.undefined)
    @scala.inline
    def setMouseWheel(value: /* evt */ Event => Unit): Self = this.set("mouseWheel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseWheel: Self = this.set("mouseWheel", js.undefined)
  }
  
}

