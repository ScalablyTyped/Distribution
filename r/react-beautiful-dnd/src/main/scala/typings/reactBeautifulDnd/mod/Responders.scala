package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Responders extends js.Object {
  var onBeforeCapture: js.UndefOr[OnBeforeCaptureResponder] = js.native
  var onBeforeDragStart: js.UndefOr[OnBeforeDragStartResponder] = js.native
  // always required
  var onDragEnd: OnDragEndResponder = js.native
  var onDragStart: js.UndefOr[OnDragStartResponder] = js.native
  var onDragUpdate: js.UndefOr[OnDragUpdateResponder] = js.native
}

object Responders {
  @scala.inline
  def apply(onDragEnd: (/* result */ DropResult, /* provided */ ResponderProvided) => Unit): Responders = {
    val __obj = js.Dynamic.literal(onDragEnd = js.Any.fromFunction2(onDragEnd))
    __obj.asInstanceOf[Responders]
  }
  @scala.inline
  implicit class RespondersOps[Self <: Responders] (val x: Self) extends AnyVal {
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
    def setOnDragEnd(value: (/* result */ DropResult, /* provided */ ResponderProvided) => Unit): Self = this.set("onDragEnd", js.Any.fromFunction2(value))
    @scala.inline
    def setOnBeforeCapture(value: /* before */ BeforeCapture => Unit): Self = this.set("onBeforeCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeCapture: Self = this.set("onBeforeCapture", js.undefined)
    @scala.inline
    def setOnBeforeDragStart(value: /* start */ DragStart => Unit): Self = this.set("onBeforeDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeDragStart: Self = this.set("onBeforeDragStart", js.undefined)
    @scala.inline
    def setOnDragStart(value: (/* start */ DragStart, /* provided */ ResponderProvided) => Unit): Self = this.set("onDragStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnDragUpdate(value: (/* update */ DragUpdate, /* provided */ ResponderProvided) => Unit): Self = this.set("onDragUpdate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDragUpdate: Self = this.set("onDragUpdate", js.undefined)
  }
  
}

