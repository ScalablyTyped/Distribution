package typings.reactDraggable.mod

import typings.react.mod.RefObject
import typings.reactDraggable.reactDraggableBooleans.`false`
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableCoreProps extends js.Object {
  var allowAnyClick: Boolean = js.native
  var cancel: String = js.native
  var disabled: Boolean = js.native
  var enableUserSelectHack: Boolean = js.native
  var grid: js.Tuple2[Double, Double] = js.native
  var handle: String = js.native
  var nodeRef: js.UndefOr[RefObject[HTMLElement]] = js.native
  var offsetParent: HTMLElement = js.native
  var onDrag: DraggableEventHandler = js.native
  var onStart: DraggableEventHandler = js.native
  var onStop: DraggableEventHandler = js.native
  var scale: Double = js.native
  def onMouseDown(e: MouseEvent): Unit = js.native
}

object DraggableCoreProps {
  @scala.inline
  def apply(
    allowAnyClick: Boolean,
    cancel: String,
    disabled: Boolean,
    enableUserSelectHack: Boolean,
    grid: js.Tuple2[Double, Double],
    handle: String,
    offsetParent: HTMLElement,
    onDrag: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
    onMouseDown: MouseEvent => Unit,
    onStart: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
    onStop: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
    scale: Double
  ): DraggableCoreProps = {
    val __obj = js.Dynamic.literal(allowAnyClick = allowAnyClick.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], enableUserSelectHack = enableUserSelectHack.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], offsetParent = offsetParent.asInstanceOf[js.Any], onDrag = js.Any.fromFunction2(onDrag), onMouseDown = js.Any.fromFunction1(onMouseDown), onStart = js.Any.fromFunction2(onStart), onStop = js.Any.fromFunction2(onStop), scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableCoreProps]
  }
  @scala.inline
  implicit class DraggableCorePropsOps[Self <: DraggableCoreProps] (val x: Self) extends AnyVal {
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
    def setAllowAnyClick(value: Boolean): Self = this.set("allowAnyClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableUserSelectHack(value: Boolean): Self = this.set("enableUserSelectHack", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrid(value: js.Tuple2[Double, Double]): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetParent(value: HTMLElement): Self = this.set("offsetParent", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDrag(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = this.set("onDrag", js.Any.fromFunction2(value))
    @scala.inline
    def setOnMouseDown(value: MouseEvent => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def setOnStart(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = this.set("onStart", js.Any.fromFunction2(value))
    @scala.inline
    def setOnStop(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = this.set("onStop", js.Any.fromFunction2(value))
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeRef(value: RefObject[HTMLElement]): Self = this.set("nodeRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeRef: Self = this.set("nodeRef", js.undefined)
  }
  
}

