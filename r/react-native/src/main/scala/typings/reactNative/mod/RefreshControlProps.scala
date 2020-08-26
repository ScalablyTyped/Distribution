package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactNative.mod.AccessibilityPropsIOS because Already inherited
- typings.reactNative.mod.AccessibilityPropsAndroid because Already inherited
- typings.reactNative.mod.TVViewPropsIOS because Already inherited
- typings.reactNative.mod.AccessibilityProps because Already inherited
- typings.reactNative.mod.Touchable because Already inherited
- typings.reactNative.mod.GestureResponderHandlers because Already inherited
- typings.reactNative.mod.ViewPropsIOS because Already inherited
- typings.reactNative.mod.ViewPropsAndroid because Already inherited
- typings.reactNative.mod.ViewProps because Already inherited
- typings.reactNative.mod.RefreshControlPropsAndroid because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, collapsable, focusable, hasTVPreferredFocus, hitSlop, importantForAccessibility, isTVSelectable, nativeID, needsOffscreenAlphaCompositing, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, onMoveShouldSetResponder, onMoveShouldSetResponderCapture, onResponderEnd, onResponderGrant, onResponderMove, onResponderReject, onResponderRelease, onResponderStart, onResponderTerminate, onResponderTerminationRequest, onStartShouldSetResponder, onStartShouldSetResponderCapture, onTouchCancel, onTouchEnd, onTouchEndCapture, onTouchMove, onTouchStart, pointerEvents, removeClippedSubviews, renderToHardwareTextureAndroid, shouldRasterizeIOS, style, testID, tvParallaxMagnification, tvParallaxProperties, tvParallaxShiftDistanceX, tvParallaxShiftDistanceY, tvParallaxTiltAngle. Inlined colors, enabled, progressBackgroundColor, size, progressViewOffset */ @js.native
trait RefreshControlProps extends RefreshControlPropsIOS {
  /**
    * The colors (at least one) that will be used to draw the refresh indicator.
    */
  var colors: js.UndefOr[js.Array[ColorValue]] = js.native
  /**
    * Whether the pull to refresh functionality is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Called when the view starts refreshing.
    */
  var onRefresh: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * The background color of the refresh indicator.
    */
  var progressBackgroundColor: js.UndefOr[ColorValue] = js.native
  /**
    * Progress view top offset
    * @platform android
    */
  var progressViewOffset: js.UndefOr[Double] = js.native
  /**
    * Whether the view should be indicating an active refresh.
    */
  var refreshing: Boolean = js.native
  /**
    * Size of the refresh indicator, see RefreshControl.SIZE.
    */
  var size: js.UndefOr[Double] = js.native
}

object RefreshControlProps {
  @scala.inline
  def apply(refreshing: Boolean): RefreshControlProps = {
    val __obj = js.Dynamic.literal(refreshing = refreshing.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshControlProps]
  }
  @scala.inline
  implicit class RefreshControlPropsOps[Self <: RefreshControlProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRefreshing(value: Boolean): Self = this.set("refreshing", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorsVarargs(value: ColorValue*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[ColorValue]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setOnRefresh(value: () => Unit): Self = this.set("onRefresh", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRefresh: Self = this.set("onRefresh", js.undefined)
    @scala.inline
    def setProgressBackgroundColor(value: ColorValue): Self = this.set("progressBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressBackgroundColor: Self = this.set("progressBackgroundColor", js.undefined)
    @scala.inline
    def setProgressViewOffset(value: Double): Self = this.set("progressViewOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressViewOffset: Self = this.set("progressViewOffset", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

