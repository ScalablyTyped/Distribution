package typings.reactDraggable.anon

import typings.react.mod.RefObject
import typings.reactDraggable.mod.DraggableData
import typings.reactDraggable.mod.DraggableEvent
import typings.reactDraggable.mod.DraggableEventHandler
import typings.reactDraggable.reactDraggableBooleans.`false`
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-draggable.react-draggable.DraggableCoreProps> */
@js.native
trait PartialDraggableCoreProps extends js.Object {
  var allowAnyClick: js.UndefOr[Boolean] = js.native
  var cancel: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var enableUserSelectHack: js.UndefOr[Boolean] = js.native
  var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var handle: js.UndefOr[String] = js.native
  var nodeRef: js.UndefOr[RefObject[HTMLElement]] = js.native
  var offsetParent: js.UndefOr[HTMLElement] = js.native
  var onDrag: js.UndefOr[DraggableEventHandler] = js.native
  var onMouseDown: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.native
  var onStart: js.UndefOr[DraggableEventHandler] = js.native
  var onStop: js.UndefOr[DraggableEventHandler] = js.native
  var scale: js.UndefOr[Double] = js.native
}

object PartialDraggableCoreProps {
  @scala.inline
  def apply(): PartialDraggableCoreProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDraggableCoreProps]
  }
  @scala.inline
  implicit class PartialDraggableCorePropsOps[Self <: PartialDraggableCoreProps] (val x: Self) extends AnyVal {
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
    def deleteAllowAnyClick: Self = this.set("allowAnyClick", js.undefined)
    @scala.inline
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEnableUserSelectHack(value: Boolean): Self = this.set("enableUserSelectHack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableUserSelectHack: Self = this.set("enableUserSelectHack", js.undefined)
    @scala.inline
    def setGrid(value: js.Tuple2[Double, Double]): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    @scala.inline
    def setNodeRef(value: RefObject[HTMLElement]): Self = this.set("nodeRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeRef: Self = this.set("nodeRef", js.undefined)
    @scala.inline
    def setOffsetParent(value: HTMLElement): Self = this.set("offsetParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetParent: Self = this.set("offsetParent", js.undefined)
    @scala.inline
    def setOnDrag(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = this.set("onDrag", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    @scala.inline
    def setOnMouseDown(value: /* e */ MouseEvent => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnStart(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = this.set("onStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    @scala.inline
    def setOnStop(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = this.set("onStop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnStop: Self = this.set("onStop", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
  
}

