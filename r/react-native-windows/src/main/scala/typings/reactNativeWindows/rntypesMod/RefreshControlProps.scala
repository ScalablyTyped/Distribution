package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactNativeWindows.rntypesMod.AccessibilityPropsIOS because Already inherited
- typings.reactNativeWindows.rntypesMod.AccessibilityPropsAndroid because Already inherited
- typings.reactNativeWindows.rntypesMod.TVViewPropsIOS because Already inherited
- typings.reactNativeWindows.rntypesMod.AccessibilityProps because Already inherited
- typings.reactNativeWindows.rntypesMod.Touchable because Already inherited
- typings.reactNativeWindows.rntypesMod.GestureResponderHandlers because Already inherited
- typings.reactNativeWindows.rntypesMod.ViewPropsIOS because Already inherited
- typings.reactNativeWindows.rntypesMod.ViewPropsAndroid because Already inherited
- typings.reactNativeWindows.rntypesMod.ViewProps because Already inherited
- typings.reactNativeWindows.rntypesMod.RefreshControlPropsAndroid because var conflicts: accessibilityActions, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityValue, accessibilityViewIsModal, accessible, children, collapsable, focusable, hasTVPreferredFocus, hitSlop, importantForAccessibility, isTVSelectable, nativeID, needsOffscreenAlphaCompositing, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, onMoveShouldSetResponder, onMoveShouldSetResponderCapture, onResponderEnd, onResponderGrant, onResponderMove, onResponderReject, onResponderRelease, onResponderStart, onResponderTerminate, onResponderTerminationRequest, onStartShouldSetResponder, onStartShouldSetResponderCapture, onTouchCancel, onTouchEnd, onTouchEndCapture, onTouchMove, onTouchStart, pointerEvents, removeClippedSubviews, renderToHardwareTextureAndroid, shouldRasterizeIOS, style, testID, tvParallaxMagnification, tvParallaxProperties, tvParallaxShiftDistanceX, tvParallaxShiftDistanceY, tvParallaxTiltAngle. Inlined colors, enabled, progressBackgroundColor, size */ trait RefreshControlProps
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
  
  inline def apply(refreshing: Boolean): RefreshControlProps = {
    val __obj = js.Dynamic.literal(refreshing = refreshing.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshControlProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefreshControlProps] (val x: Self) extends AnyVal {
    
    inline def setColors(value: js.Array[ColorValue]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: ColorValue*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setOnRefresh(value: () => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
    
    inline def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
    
    inline def setProgressBackgroundColor(value: ColorValue): Self = StObject.set(x, "progressBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setProgressBackgroundColorUndefined: Self = StObject.set(x, "progressBackgroundColor", js.undefined)
    
    inline def setProgressViewOffset(value: Double): Self = StObject.set(x, "progressViewOffset", value.asInstanceOf[js.Any])
    
    inline def setProgressViewOffsetUndefined: Self = StObject.set(x, "progressViewOffset", js.undefined)
    
    inline def setRefreshing(value: Boolean): Self = StObject.set(x, "refreshing", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
