package typings.reactDashResizable.reactDashResizableMod

import typings.react.reactMod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizableProps extends js.Object {
  var axis: js.UndefOr[Axis] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var draggableOpts: js.UndefOr[js.Any] = js.undefined
  var handleSize: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var height: Double
  var lockAspectRatio: js.UndefOr[Boolean] = js.undefined
  var maxConstraints: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var minConstraints: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var onResize: js.UndefOr[
    js.Function2[/* e */ SyntheticEvent[Element, Event], /* data */ ResizeCallbackData, _]
  ] = js.undefined
  var onResizeStart: js.UndefOr[
    js.Function2[/* e */ SyntheticEvent[Element, Event], /* data */ ResizeCallbackData, _]
  ] = js.undefined
  var onResizeStop: js.UndefOr[
    js.Function2[/* e */ SyntheticEvent[Element, Event], /* data */ ResizeCallbackData, _]
  ] = js.undefined
  var resizeHandles: js.UndefOr[js.Array[String]] = js.undefined
  var width: Double
}

object ResizableProps {
  @scala.inline
  def apply(
    height: Double,
    width: Double,
    axis: Axis = null,
    className: String = null,
    draggableOpts: js.Any = null,
    handleSize: js.Tuple2[Double, Double] = null,
    lockAspectRatio: js.UndefOr[Boolean] = js.undefined,
    maxConstraints: js.Tuple2[Double, Double] = null,
    minConstraints: js.Tuple2[Double, Double] = null,
    onResize: (/* e */ SyntheticEvent[Element, Event], /* data */ ResizeCallbackData) => _ = null,
    onResizeStart: (/* e */ SyntheticEvent[Element, Event], /* data */ ResizeCallbackData) => _ = null,
    onResizeStop: (/* e */ SyntheticEvent[Element, Event], /* data */ ResizeCallbackData) => _ = null,
    resizeHandles: js.Array[String] = null
  ): ResizableProps = {
    val __obj = js.Dynamic.literal(height = height, width = width)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (className != null) __obj.updateDynamic("className")(className)
    if (draggableOpts != null) __obj.updateDynamic("draggableOpts")(draggableOpts)
    if (handleSize != null) __obj.updateDynamic("handleSize")(handleSize)
    if (!js.isUndefined(lockAspectRatio)) __obj.updateDynamic("lockAspectRatio")(lockAspectRatio)
    if (maxConstraints != null) __obj.updateDynamic("maxConstraints")(maxConstraints)
    if (minConstraints != null) __obj.updateDynamic("minConstraints")(minConstraints)
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction2(onResize))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction2(onResizeStart))
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(js.Any.fromFunction2(onResizeStop))
    if (resizeHandles != null) __obj.updateDynamic("resizeHandles")(resizeHandles)
    __obj.asInstanceOf[ResizableProps]
  }
}

