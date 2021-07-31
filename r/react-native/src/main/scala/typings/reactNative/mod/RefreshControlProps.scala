package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
- typings.reactNative.mod.RefreshControlPropsAndroid because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, collapsable, focusable, hasTVPreferredFocus, hitSlop, importantForAccessibility, isTVSelectable, nativeID, needsOffscreenAlphaCompositing, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, onMoveShouldSetResponder, onMoveShouldSetResponderCapture, onResponderEnd, onResponderGrant, onResponderMove, onResponderReject, onResponderRelease, onResponderStart, onResponderTerminate, onResponderTerminationRequest, onStartShouldSetResponder, onStartShouldSetResponderCapture, onTouchCancel, onTouchEnd, onTouchEndCapture, onTouchMove, onTouchStart, pointerEvents, removeClippedSubviews, renderToHardwareTextureAndroid, shouldRasterizeIOS, style, testID, tvParallaxMagnification, tvParallaxProperties, tvParallaxShiftDistanceX, tvParallaxShiftDistanceY, tvParallaxTiltAngle. Inlined colors, enabled, progressBackgroundColor, size, progressViewOffset */ trait RefreshControlProps
  extends StObject
     with RefreshControlPropsIOS {
  
  /**
    * The colors (at least one) that will be used to draw the refresh indicator.
    */
  var colors: js.UndefOr[js.Array[ColorValue]] = js.undefined
  
  /**
    * Whether the pull to refresh functionality is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Called when the view starts refreshing.
    */
  var onRefresh: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * The background color of the refresh indicator.
    */
  var progressBackgroundColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * Progress view top offset
    * @platform android
    */
  var progressViewOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the view should be indicating an active refresh.
    */
  var refreshing: Boolean
  
  /**
    * Size of the refresh indicator, see RefreshControl.SIZE.
    */
  var size: js.UndefOr[Double] = js.undefined
}
object RefreshControlProps {
  
  @scala.inline
  def apply(refreshing: Boolean): RefreshControlProps = {
    val __obj = js.Dynamic.literal(refreshing = refreshing.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshControlProps]
  }
  
  @scala.inline
  implicit class RefreshControlPropsMutableBuilder[Self <: RefreshControlProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[ColorValue]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: ColorValue*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setOnRefresh(value: () => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
    
    @scala.inline
    def setProgressBackgroundColor(value: ColorValue): Self = StObject.set(x, "progressBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressBackgroundColorUndefined: Self = StObject.set(x, "progressBackgroundColor", js.undefined)
    
    @scala.inline
    def setProgressViewOffset(value: Double): Self = StObject.set(x, "progressViewOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressViewOffsetUndefined: Self = StObject.set(x, "progressViewOffset", js.undefined)
    
    @scala.inline
    def setRefreshing(value: Boolean): Self = StObject.set(x, "refreshing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
