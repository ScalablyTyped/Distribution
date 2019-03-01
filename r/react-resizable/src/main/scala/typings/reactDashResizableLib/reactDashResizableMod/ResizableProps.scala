package typings
package reactDashResizableLib.reactDashResizableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizableProps extends js.Object {
  var axis: js.UndefOr[Axis] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var draggableOpts: js.UndefOr[js.Any] = js.undefined
  var handleSize: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var height: scala.Double
  var lockAspectRatio: js.UndefOr[scala.Boolean] = js.undefined
  var maxConstraints: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var minConstraints: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var onResize: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.Element, reactLib.Event], 
      /* data */ ResizeCallbackData, 
      _
    ]
  ] = js.undefined
  var onResizeStart: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.Element, reactLib.Event], 
      /* data */ ResizeCallbackData, 
      _
    ]
  ] = js.undefined
  var onResizeStop: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.Element, reactLib.Event], 
      /* data */ ResizeCallbackData, 
      _
    ]
  ] = js.undefined
  var width: scala.Double
}

object ResizableProps {
  @scala.inline
  def apply(
    height: scala.Double,
    width: scala.Double,
    axis: Axis = null,
    className: java.lang.String = null,
    draggableOpts: js.Any = null,
    handleSize: js.Tuple2[scala.Double, scala.Double] = null,
    lockAspectRatio: js.UndefOr[scala.Boolean] = js.undefined,
    maxConstraints: js.Tuple2[scala.Double, scala.Double] = null,
    minConstraints: js.Tuple2[scala.Double, scala.Double] = null,
    onResize: js.Function2[
      /* e */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.Element, reactLib.Event], 
      /* data */ ResizeCallbackData, 
      _
    ] = null,
    onResizeStart: js.Function2[
      /* e */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.Element, reactLib.Event], 
      /* data */ ResizeCallbackData, 
      _
    ] = null,
    onResizeStop: js.Function2[
      /* e */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.Element, reactLib.Event], 
      /* data */ ResizeCallbackData, 
      _
    ] = null
  ): ResizableProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (className != null) __obj.updateDynamic("className")(className)
    if (draggableOpts != null) __obj.updateDynamic("draggableOpts")(draggableOpts)
    if (handleSize != null) __obj.updateDynamic("handleSize")(handleSize)
    if (!js.isUndefined(lockAspectRatio)) __obj.updateDynamic("lockAspectRatio")(lockAspectRatio)
    if (maxConstraints != null) __obj.updateDynamic("maxConstraints")(maxConstraints)
    if (minConstraints != null) __obj.updateDynamic("minConstraints")(minConstraints)
    if (onResize != null) __obj.updateDynamic("onResize")(onResize)
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(onResizeStart)
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(onResizeStop)
    __obj.asInstanceOf[ResizableProps]
  }
}

