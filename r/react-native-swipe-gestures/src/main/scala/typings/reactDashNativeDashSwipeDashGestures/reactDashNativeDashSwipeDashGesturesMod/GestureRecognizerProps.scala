package typings.reactDashNativeDashSwipeDashGestures.reactDashNativeDashSwipeDashGesturesMod

import typings.reactDashNative.reactDashNativeMod.PanResponderGestureState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewProperties * / any */ trait GestureRecognizerProps extends js.Object {
  var config: js.UndefOr[GestureRecognizerConfig] = js.undefined
  var onSwipe: js.UndefOr[
    js.Function2[/* gestureName */ String, /* gestureState */ PanResponderGestureState, Unit]
  ] = js.undefined
  var onSwipeDown: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.undefined
  var onSwipeLeft: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.undefined
  var onSwipeRight: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.undefined
  var onSwipeUp: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.undefined
}

object GestureRecognizerProps {
  @scala.inline
  def apply(
    config: GestureRecognizerConfig = null,
    onSwipe: (/* gestureName */ String, /* gestureState */ PanResponderGestureState) => Unit = null,
    onSwipeDown: /* gestureState */ PanResponderGestureState => Unit = null,
    onSwipeLeft: /* gestureState */ PanResponderGestureState => Unit = null,
    onSwipeRight: /* gestureState */ PanResponderGestureState => Unit = null,
    onSwipeUp: /* gestureState */ PanResponderGestureState => Unit = null
  ): GestureRecognizerProps = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    if (onSwipe != null) __obj.updateDynamic("onSwipe")(js.Any.fromFunction2(onSwipe))
    if (onSwipeDown != null) __obj.updateDynamic("onSwipeDown")(js.Any.fromFunction1(onSwipeDown))
    if (onSwipeLeft != null) __obj.updateDynamic("onSwipeLeft")(js.Any.fromFunction1(onSwipeLeft))
    if (onSwipeRight != null) __obj.updateDynamic("onSwipeRight")(js.Any.fromFunction1(onSwipeRight))
    if (onSwipeUp != null) __obj.updateDynamic("onSwipeUp")(js.Any.fromFunction1(onSwipeUp))
    __obj.asInstanceOf[GestureRecognizerProps]
  }
}

