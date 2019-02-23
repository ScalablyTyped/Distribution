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

