package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(reactDashNativeLib.reactDashNativeMod.SliderPropsAndroid because Would inherit conflicting mutable fields List(needsOffscreenAlphaCompositing, collapsable, renderToHardwareTextureAndroid, accessibilityViewIsModal, accessibilityActions, shouldRasterizeIOS, onAccessibilityAction, onResponderReject, onStartShouldSetResponder, onResponderRelease, onResponderEnd, onResponderMove, onMoveShouldSetResponder, onResponderTerminationRequest, onResponderStart, onResponderTerminate, onStartShouldSetResponderCapture, onMoveShouldSetResponderCapture, onResponderGrant, onTouchEndCapture, onTouchStart, onTouchEnd, onTouchCancel, onTouchMove, accessibilityComponentType, accessibilityLiveRegion, importantForAccessibility, accessibilityElementsHidden, onMagicTap, accessibilityTraits, onAccessibilityTap, accessibilityIgnoresInvertColors, accessibilityHint, accessibilityLabel, accessibilityStates, accessibilityRole, accessible, style, onLayout, removeClippedSubviews, testID, pointerEvents, hitSlop, nativeID))*/

trait SliderProps extends SliderPropsIOS {
  /**
       * If true the user won't be able to move the slider.
       * Default value is false.
       */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The color used for the track to the right of the button.
       * Overrides the default blue gradient image.
       */
  var maximumTrackTintColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Initial maximum value of the slider. Default value is 1.
       */
  var maximumValue: js.UndefOr[scala.Double] = js.undefined
  /**
       * The color used for the track to the left of the button.
       * Overrides the default blue gradient image.
       */
  var minimumTrackTintColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Initial minimum value of the slider. Default value is 0.
       */
  var minimumValue: js.UndefOr[scala.Double] = js.undefined
  /**
       * Callback called when the user finishes changing the value (e.g. when the slider is released).
       */
  var onSlidingComplete: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
       * Callback continuously called while the user is dragging the slider.
       */
  var onValueChange: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
       * Step value of the slider. The value should be between 0 and (maximumValue - minimumValue). Default value is 0.
       */
  var step: js.UndefOr[scala.Double] = js.undefined
  /**
       * Initial value of the slider. The value should be between minimumValue
       * and maximumValue, which default to 0 and 1 respectively.
       * Default value is 0.
       * This is not a controlled component, you don't need to update
       * the value during dragging.
       */
  var value: js.UndefOr[scala.Double] = js.undefined
}

