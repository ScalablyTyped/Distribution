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

