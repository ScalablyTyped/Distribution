package typings.reactDraggable.anon

import typings.react.mod.RefObject
import typings.reactDraggable.mod.ControlPosition
import typings.reactDraggable.mod.DraggableBounds
import typings.reactDraggable.mod.DraggableData
import typings.reactDraggable.mod.DraggableEvent
import typings.reactDraggable.mod.DraggableEventHandler
import typings.reactDraggable.mod.PositionOffsetControlPosition
import typings.reactDraggable.reactDraggableBooleans.`false`
import typings.reactDraggable.reactDraggableStrings.both
import typings.reactDraggable.reactDraggableStrings.none
import typings.reactDraggable.reactDraggableStrings.x
import typings.reactDraggable.reactDraggableStrings.y
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-draggable.react-draggable.DraggableProps> */
@js.native
trait PartialDraggableProps extends js.Object {
  var allowAnyClick: js.UndefOr[Boolean] = js.native
  var axis: js.UndefOr[both | x | y | none] = js.native
  var bounds: js.UndefOr[DraggableBounds | String | `false`] = js.native
  var cancel: js.UndefOr[String] = js.native
  var defaultClassName: js.UndefOr[String] = js.native
  var defaultClassNameDragged: js.UndefOr[String] = js.native
  var defaultClassNameDragging: js.UndefOr[String] = js.native
  var defaultPosition: js.UndefOr[ControlPosition] = js.native
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
  var position: js.UndefOr[ControlPosition] = js.native
  var positionOffset: js.UndefOr[PositionOffsetControlPosition] = js.native
  var scale: js.UndefOr[Double] = js.native
}

object PartialDraggableProps {
  @scala.inline
  def apply(): PartialDraggableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDraggableProps]
  }
  @scala.inline
  implicit class PartialDraggablePropsOps[Self <: PartialDraggableProps] (val x: Self) extends AnyVal {
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
    def setAxis(value: both | typings.reactDraggable.reactDraggableStrings.x | y | none): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setBounds(value: DraggableBounds | String | `false`): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setDefaultClassName(value: String): Self = this.set("defaultClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultClassName: Self = this.set("defaultClassName", js.undefined)
    @scala.inline
    def setDefaultClassNameDragged(value: String): Self = this.set("defaultClassNameDragged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultClassNameDragged: Self = this.set("defaultClassNameDragged", js.undefined)
    @scala.inline
    def setDefaultClassNameDragging(value: String): Self = this.set("defaultClassNameDragging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultClassNameDragging: Self = this.set("defaultClassNameDragging", js.undefined)
    @scala.inline
    def setDefaultPosition(value: ControlPosition): Self = this.set("defaultPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPosition: Self = this.set("defaultPosition", js.undefined)
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
    def setPosition(value: ControlPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setPositionOffset(value: PositionOffsetControlPosition): Self = this.set("positionOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionOffset: Self = this.set("positionOffset", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
  
}

