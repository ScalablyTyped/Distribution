package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(reactDashNativeLib.reactDashNativeMod.RefreshControlPropsAndroid because Would inherit conflicting mutable fields List(needsOffscreenAlphaCompositing, collapsable, renderToHardwareTextureAndroid, accessibilityViewIsModal, accessibilityActions, shouldRasterizeIOS, onAccessibilityAction, onResponderReject, onStartShouldSetResponder, onResponderRelease, onResponderEnd, onResponderMove, onMoveShouldSetResponder, onResponderTerminationRequest, onResponderStart, onResponderTerminate, onStartShouldSetResponderCapture, onMoveShouldSetResponderCapture, onResponderGrant, onTouchEndCapture, onTouchStart, onTouchEnd, onTouchCancel, onTouchMove, accessibilityComponentType, accessibilityLiveRegion, importantForAccessibility, accessibilityElementsHidden, onMagicTap, accessibilityTraits, onAccessibilityTap, accessibilityIgnoresInvertColors, accessibilityHint, accessibilityLabel, accessibilityStates, accessibilityRole, accessible, style, onLayout, removeClippedSubviews, testID, pointerEvents, hitSlop, nativeID))*/

trait RefreshControlProps extends RefreshControlPropsIOS {
  /**
       * Called when the view starts refreshing.
       */
  var onRefresh: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Whether the view should be indicating an active refresh.
       */
  var refreshing: scala.Boolean
}

