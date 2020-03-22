package typings.reactDraggable

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
trait PartialDraggableCoreProps extends js.Object {
  var allowAnyClick: js.UndefOr[Boolean] = js.undefined
  var cancel: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var enableUserSelectHack: js.UndefOr[Boolean] = js.undefined
  var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var handle: js.UndefOr[String] = js.undefined
  var offsetParent: js.UndefOr[HTMLElement] = js.undefined
  var onDrag: js.UndefOr[DraggableEventHandler] = js.undefined
  var onMouseDown: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
  var onStart: js.UndefOr[DraggableEventHandler] = js.undefined
  var onStop: js.UndefOr[DraggableEventHandler] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
}

object PartialDraggableCoreProps {
  @scala.inline
  def apply(
    allowAnyClick: js.UndefOr[Boolean] = js.undefined,
    cancel: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enableUserSelectHack: js.UndefOr[Boolean] = js.undefined,
    grid: js.Tuple2[Double, Double] = null,
    handle: String = null,
    offsetParent: HTMLElement = null,
    onDrag: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false` = null,
    onMouseDown: /* e */ MouseEvent => Unit = null,
    onStart: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false` = null,
    onStop: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false` = null,
    scale: Int | Double = null
  ): PartialDraggableCoreProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAnyClick)) __obj.updateDynamic("allowAnyClick")(allowAnyClick.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUserSelectHack)) __obj.updateDynamic("enableUserSelectHack")(enableUserSelectHack.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (offsetParent != null) __obj.updateDynamic("offsetParent")(offsetParent.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction2(onDrag))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction2(onStop))
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDraggableCoreProps]
  }
}

