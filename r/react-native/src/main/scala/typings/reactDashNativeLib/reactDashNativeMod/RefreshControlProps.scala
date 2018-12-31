package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(reactDashNativeLib.reactDashNativeMod.RefreshControlPropsAndroid because Would inherit conflicting mutable fields List(accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityStates, accessibilityTraits, accessibilityViewIsModal, accessible, collapsable, hitSlop, importantForAccessibility, nativeID, needsOffscreenAlphaCompositing, onAccessibilityAction, onAccessibilityTap, onLayout, onMagicTap, onMoveShouldSetResponder, onMoveShouldSetResponderCapture, onResponderEnd, onResponderGrant, onResponderMove, onResponderReject, onResponderRelease, onResponderStart, onResponderTerminate, onResponderTerminationRequest, onStartShouldSetResponder, onStartShouldSetResponderCapture, onTouchCancel, onTouchEnd, onTouchEndCapture, onTouchMove, onTouchStart, pointerEvents, removeClippedSubviews, renderToHardwareTextureAndroid, shouldRasterizeIOS, style, testID))*/
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

