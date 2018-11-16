package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TouchableWithoutFeedbackProps extends AccessibilityProps {
  /**
       * Delay in ms, from onPressIn, before onLongPress is called.
       */
  var delayLongPress: js.UndefOr[scala.Double] = js.undefined
  /**
       * Delay in ms, from the start of the touch, before onPressIn is called.
       */
  var delayPressIn: js.UndefOr[scala.Double] = js.undefined
  /**
       * Delay in ms, from the release of the touch, before onPressOut is called.
       */
  var delayPressOut: js.UndefOr[scala.Double] = js.undefined
  /**
       * If true, disable all interactions for this component.
       */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * This defines how far your touch can start away from the button.
       * This is added to pressRetentionOffset when moving off of the button.
       * NOTE The touch area never extends past the parent view bounds and
       * the Z-index of sibling views always takes precedence if a touch hits
       * two overlapping views.
       */
  var hitSlop: js.UndefOr[Insets] = js.undefined
  /**
       * Invoked on mount and layout changes with
       * {nativeEvent: {layout: {x, y, width, height}}}
       */
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, scala.Unit]] = js.undefined
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  /**
       * Called when the touch is released,
       * but not if cancelled (e.g. by a scroll that steals the responder lock).
       */
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  /**
       * When the scroll view is disabled, this defines how far your
       * touch may move off of the button, before deactivating the button.
       * Once deactivated, try moving it back and you'll see that the button
       * is once again reactivated! Move it back and forth several times
       * while the scroll view is disabled. Ensure you pass in a constant
       * to reduce memory allocations.
       */
  var pressRetentionOffset: js.UndefOr[Insets] = js.undefined
  /**
       * //FIXME: not in doc but available in examples
       */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
       * Used to locate this view in end-to-end tests.
       */
  var testID: js.UndefOr[java.lang.String] = js.undefined
}

