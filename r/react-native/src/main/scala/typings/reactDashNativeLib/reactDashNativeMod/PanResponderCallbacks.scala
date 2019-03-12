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
    onMoveShouldSetPanResponder: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => scala.Boolean = null,
    onMoveShouldSetPanResponderCapture: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => scala.Boolean = null,
    onPanResponderEnd: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => scala.Unit = null,
    onPanResponderGrant: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => scala.Unit = null,
    onPanResponderMove: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => scala.Unit = null,
    onPanResponderReject: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => scala.Unit = null,
    onPanResponderRelease: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => scala.Unit = null,
    onPanResponderStart: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => scala.Unit = null,
    onPanResponderTerminate: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => scala.Unit = null,
    onPanResponderTerminationRequest: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => scala.Boolean = null,
    onShouldBlockNativeResponder: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => scala.Boolean = null,
    onStartShouldSetPanResponder: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => scala.Boolean = null,
    onStartShouldSetPanResponderCapture: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => scala.Boolean = null
  ): PanResponderCallbacks = {
    val __obj = js.Dynamic.literal()
    if (onMoveShouldSetPanResponder != null) __obj.updateDynamic("onMoveShouldSetPanResponder")(js.Any.fromFunction2(onMoveShouldSetPanResponder))
    if (onMoveShouldSetPanResponderCapture != null) __obj.updateDynamic("onMoveShouldSetPanResponderCapture")(js.Any.fromFunction2(onMoveShouldSetPanResponderCapture))
    if (onPanResponderEnd != null) __obj.updateDynamic("onPanResponderEnd")(js.Any.fromFunction2(onPanResponderEnd))
    if (onPanResponderGrant != null) __obj.updateDynamic("onPanResponderGrant")(js.Any.fromFunction2(onPanResponderGrant))
    if (onPanResponderMove != null) __obj.updateDynamic("onPanResponderMove")(js.Any.fromFunction2(onPanResponderMove))
    if (onPanResponderReject != null) __obj.updateDynamic("onPanResponderReject")(js.Any.fromFunction2(onPanResponderReject))
    if (onPanResponderRelease != null) __obj.updateDynamic("onPanResponderRelease")(js.Any.fromFunction2(onPanResponderRelease))
    if (onPanResponderStart != null) __obj.updateDynamic("onPanResponderStart")(js.Any.fromFunction2(onPanResponderStart))
    if (onPanResponderTerminate != null) __obj.updateDynamic("onPanResponderTerminate")(js.Any.fromFunction2(onPanResponderTerminate))
    if (onPanResponderTerminationRequest != null) __obj.updateDynamic("onPanResponderTerminationRequest")(js.Any.fromFunction2(onPanResponderTerminationRequest))
    if (onShouldBlockNativeResponder != null) __obj.updateDynamic("onShouldBlockNativeResponder")(js.Any.fromFunction2(onShouldBlockNativeResponder))
    if (onStartShouldSetPanResponder != null) __obj.updateDynamic("onStartShouldSetPanResponder")(js.Any.fromFunction2(onStartShouldSetPanResponder))
    if (onStartShouldSetPanResponderCapture != null) __obj.updateDynamic("onStartShouldSetPanResponderCapture")(js.Any.fromFunction2(onStartShouldSetPanResponderCapture))
    __obj.asInstanceOf[PanResponderCallbacks]
  }
}

