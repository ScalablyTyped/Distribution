package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashNativeLib.reactDashNativeMod.RefreshControlPropsAndroid because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityStates, accessibilityTraits, accessibilityViewIsModal, accessible, collapsable, hitSlop, importantForAccessibility, nativeID, needsOffscreenAlphaCompositing, onAccessibilityAction, onAccessibilityTap, onLayout, onMagicTap, onMoveShouldSetResponder, onMoveShouldSetResponderCapture, onResponderEnd, onResponderGrant, onResponderMove, onResponderReject, onResponderRelease, onResponderStart, onResponderTerminate, onResponderTerminationRequest, onStartShouldSetResponder, onStartShouldSetResponderCapture, onTouchCancel, onTouchEnd, onTouchEndCapture, onTouchMove, onTouchStart, pointerEvents, removeClippedSubviews, renderToHardwareTextureAndroid, shouldRasterizeIOS, style, testID. Inlined colors, enabled, progressBackgroundColor, size, progressViewOffset */ trait RefreshControlProps extends RefreshControlPropsIOS {
  /**
    * The colors (at least one) that will be used to draw the refresh indicator.
    */
  var colors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Whether the pull to refresh functionality is enabled.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Called when the view starts refreshing.
    */
  var onRefresh: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * The background color of the refresh indicator.
    */
  var progressBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Progress view top offset
    * @platform android
    */
  var progressViewOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether the view should be indicating an active refresh.
    */
  var refreshing: scala.Boolean
  /**
    * Size of the refresh indicator, see RefreshControl.SIZE.
    */
  var size: js.UndefOr[scala.Double] = js.undefined
}

