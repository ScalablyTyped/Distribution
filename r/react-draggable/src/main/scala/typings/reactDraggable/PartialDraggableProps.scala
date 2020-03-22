package typings.reactDraggable

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
trait PartialDraggableProps extends js.Object {
  var allowAnyClick: js.UndefOr[Boolean] = js.undefined
  var axis: js.UndefOr[both | x | y | none] = js.undefined
  var bounds: js.UndefOr[DraggableBounds | String | `false`] = js.undefined
  var cancel: js.UndefOr[String] = js.undefined
  var defaultClassName: js.UndefOr[String] = js.undefined
  var defaultClassNameDragged: js.UndefOr[String] = js.undefined
  var defaultClassNameDragging: js.UndefOr[String] = js.undefined
  var defaultPosition: js.UndefOr[ControlPosition] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var enableUserSelectHack: js.UndefOr[Boolean] = js.undefined
  var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var handle: js.UndefOr[String] = js.undefined
  var offsetParent: js.UndefOr[HTMLElement] = js.undefined
  var onDrag: js.UndefOr[DraggableEventHandler] = js.undefined
  var onMouseDown: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
  var onStart: js.UndefOr[DraggableEventHandler] = js.undefined
  var onStop: js.UndefOr[DraggableEventHandler] = js.undefined
  var position: js.UndefOr[ControlPosition] = js.undefined
  var positionOffset: js.UndefOr[PositionOffsetControlPosition] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
}

object PartialDraggableProps {
  @scala.inline
  def apply(
    allowAnyClick: js.UndefOr[Boolean] = js.undefined,
    axis: both | x | y | none = null,
    bounds: DraggableBounds | String | `false` = null,
    cancel: String = null,
    defaultClassName: String = null,
    defaultClassNameDragged: String = null,
    defaultClassNameDragging: String = null,
    defaultPosition: ControlPosition = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enableUserSelectHack: js.UndefOr[Boolean] = js.undefined,
    grid: js.Tuple2[Double, Double] = null,
    handle: String = null,
    offsetParent: HTMLElement = null,
    onDrag: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false` = null,
    onMouseDown: /* e */ MouseEvent => Unit = null,
    onStart: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false` = null,
    onStop: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false` = null,
    position: ControlPosition = null,
    positionOffset: PositionOffsetControlPosition = null,
    scale: Int | Double = null
  ): PartialDraggableProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAnyClick)) __obj.updateDynamic("allowAnyClick")(allowAnyClick.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (defaultClassName != null) __obj.updateDynamic("defaultClassName")(defaultClassName.asInstanceOf[js.Any])
    if (defaultClassNameDragged != null) __obj.updateDynamic("defaultClassNameDragged")(defaultClassNameDragged.asInstanceOf[js.Any])
    if (defaultClassNameDragging != null) __obj.updateDynamic("defaultClassNameDragging")(defaultClassNameDragging.asInstanceOf[js.Any])
    if (defaultPosition != null) __obj.updateDynamic("defaultPosition")(defaultPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUserSelectHack)) __obj.updateDynamic("enableUserSelectHack")(enableUserSelectHack.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (offsetParent != null) __obj.updateDynamic("offsetParent")(offsetParent.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction2(onDrag))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction2(onStop))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (positionOffset != null) __obj.updateDynamic("positionOffset")(positionOffset.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDraggableProps]
  }
}

