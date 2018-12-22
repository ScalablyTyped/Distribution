package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(reactDashNativeLib.reactDashNativeMod.PickerPropsAndroid because Would inherit conflicting mutable fields List(needsOffscreenAlphaCompositing, collapsable, renderToHardwareTextureAndroid, accessibilityViewIsModal, accessibilityActions, shouldRasterizeIOS, onAccessibilityAction, onResponderReject, onStartShouldSetResponder, onResponderRelease, onResponderEnd, onResponderMove, onMoveShouldSetResponder, onResponderTerminationRequest, onResponderStart, onResponderTerminate, onStartShouldSetResponderCapture, onMoveShouldSetResponderCapture, onResponderGrant, onTouchEndCapture, onTouchStart, onTouchEnd, onTouchCancel, onTouchMove, accessibilityComponentType, accessibilityLiveRegion, importantForAccessibility, accessibilityElementsHidden, onMagicTap, accessibilityTraits, onAccessibilityTap, accessibilityIgnoresInvertColors, accessibilityHint, accessibilityLabel, accessibilityStates, accessibilityRole, accessible, style, onLayout, removeClippedSubviews, testID, pointerEvents, hitSlop, nativeID))*/

trait PickerProps extends PickerPropsIOS {
  /**
       * Callback for when an item is selected. This is called with the
       * following parameters:
       * - itemValue: the value prop of the item that was selected
       * - itemPosition: the index of the selected item in this picker
       */
  var onValueChange: js.UndefOr[
    js.Function2[/* itemValue */ js.Any, /* itemPosition */ scala.Double, scala.Unit]
  ] = js.undefined
  /**
       * Value matching value of one of the items.
       * Can be a string or an integer.
       */
  var selectedValue: js.UndefOr[js.Any] = js.undefined
  /**
       * Used to locate this view in end-to-end tests.
       */
  var testId: js.UndefOr[java.lang.String] = js.undefined
}

