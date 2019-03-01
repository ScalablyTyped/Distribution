package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanResponderCallbacks extends js.Object {
  var onMoveShouldSetPanResponder: js.UndefOr[
    js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Boolean
    ]
  ] = js.undefined
  var onMoveShouldSetPanResponderCapture: js.UndefOr[
    js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Boolean
    ]
  ] = js.undefined
  var onPanResponderEnd: js.UndefOr[
    js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Unit
    ]
  ] = js.undefined
  var onPanResponderGrant: js.UndefOr[
    js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Unit
    ]
  ] = js.undefined
  var onPanResponderMove: js.UndefOr[
    js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Unit
    ]
  ] = js.undefined
  var onPanResponderReject: js.UndefOr[
    js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Unit
    ]
  ] = js.undefined
  var onPanResponderRelease: js.UndefOr[
    js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Unit
    ]
  ] = js.undefined
  var onPanResponderStart: js.UndefOr[
    js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Unit
    ]
  ] = js.undefined
  var onPanResponderTerminate: js.UndefOr[
    js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Unit
    ]
  ] = js.undefined
  var onPanResponderTerminationRequest: js.UndefOr[
    js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Boolean
    ]
  ] = js.undefined
  var onShouldBlockNativeResponder: js.UndefOr[
    js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Boolean
    ]
  ] = js.undefined
  var onStartShouldSetPanResponder: js.UndefOr[
    js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Boolean
    ]
  ] = js.undefined
  var onStartShouldSetPanResponderCapture: js.UndefOr[
    js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Boolean
    ]
  ] = js.undefined
}

object PanResponderCallbacks {
  @scala.inline
  def apply(
    onMoveShouldSetPanResponder: js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Boolean
    ] = null,
    onMoveShouldSetPanResponderCapture: js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Boolean
    ] = null,
    onPanResponderEnd: js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Unit
    ] = null,
    onPanResponderGrant: js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Unit
    ] = null,
    onPanResponderMove: js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Unit
    ] = null,
    onPanResponderReject: js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Unit
    ] = null,
    onPanResponderRelease: js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Unit
    ] = null,
    onPanResponderStart: js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Unit
    ] = null,
    onPanResponderTerminate: js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Unit
    ] = null,
    onPanResponderTerminationRequest: js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Boolean
    ] = null,
    onShouldBlockNativeResponder: js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Boolean
    ] = null,
    onStartShouldSetPanResponder: js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Boolean
    ] = null,
    onStartShouldSetPanResponderCapture: js.Function2[
      /* e */ GestureResponderEvent, 
      /* gestureState */ PanResponderGestureState, 
      scala.Boolean
    ] = null
  ): PanResponderCallbacks = {
    val __obj = js.Dynamic.literal()
    if (onMoveShouldSetPanResponder != null) __obj.updateDynamic("onMoveShouldSetPanResponder")(onMoveShouldSetPanResponder)
    if (onMoveShouldSetPanResponderCapture != null) __obj.updateDynamic("onMoveShouldSetPanResponderCapture")(onMoveShouldSetPanResponderCapture)
    if (onPanResponderEnd != null) __obj.updateDynamic("onPanResponderEnd")(onPanResponderEnd)
    if (onPanResponderGrant != null) __obj.updateDynamic("onPanResponderGrant")(onPanResponderGrant)
    if (onPanResponderMove != null) __obj.updateDynamic("onPanResponderMove")(onPanResponderMove)
    if (onPanResponderReject != null) __obj.updateDynamic("onPanResponderReject")(onPanResponderReject)
    if (onPanResponderRelease != null) __obj.updateDynamic("onPanResponderRelease")(onPanResponderRelease)
    if (onPanResponderStart != null) __obj.updateDynamic("onPanResponderStart")(onPanResponderStart)
    if (onPanResponderTerminate != null) __obj.updateDynamic("onPanResponderTerminate")(onPanResponderTerminate)
    if (onPanResponderTerminationRequest != null) __obj.updateDynamic("onPanResponderTerminationRequest")(onPanResponderTerminationRequest)
    if (onShouldBlockNativeResponder != null) __obj.updateDynamic("onShouldBlockNativeResponder")(onShouldBlockNativeResponder)
    if (onStartShouldSetPanResponder != null) __obj.updateDynamic("onStartShouldSetPanResponder")(onStartShouldSetPanResponder)
    if (onStartShouldSetPanResponderCapture != null) __obj.updateDynamic("onStartShouldSetPanResponderCapture")(onStartShouldSetPanResponderCapture)
    __obj.asInstanceOf[PanResponderCallbacks]
  }
}

