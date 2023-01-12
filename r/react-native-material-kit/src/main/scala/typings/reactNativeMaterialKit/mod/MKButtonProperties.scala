package typings.reactNativeMaterialKit.mod

import typings.reactNative.mod.GestureResponderHandlers
import typings.reactNative.mod.PointerEvents
import typings.reactNative.mod.Touchable
import typings.reactNative.mod.TouchableWithoutFeedbackProps
import typings.reactNative.mod.ViewPropsAndroid
import typings.reactNative.mod.ViewPropsIOS
import typings.reactNative.reactNativeStrings.`box-none`
import typings.reactNative.reactNativeStrings.`box-only`
import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.none
import typings.reactNativeMaterialKit.mod.MKPropTypes.rippleLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactNative.mod.AccessibilityPropsIOS because Already inherited
- typings.reactNative.mod.AccessibilityPropsAndroid because Already inherited
- typings.reactNative.mod.AccessibilityProps because Already inherited
- typings.reactNative.mod.ViewProps because var conflicts: accessibilityActions, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLabelledBy, accessibilityLanguage, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityValue, accessibilityViewIsModal, accessible, children, hitSlop, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, style, testID. Inlined pointerEvents, removeClippedSubviews, nativeID
- typings.reactNativeMaterialKit.mod.MKRippleProperties because var conflicts: accessibilityActions, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLabelledBy, accessibilityLanguage, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityValue, accessibilityViewIsModal, accessible, children, hitSlop, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, style, testID. Inlined rippleColor, rippleDuration, rippleLocation, maskEnabled, maskColor, maskBorderRadius, maskBorderRadiusInPercent, maskDuration, shadowAniEnabled */ trait MKButtonProperties
  extends StObject
     with TouchableWithoutFeedbackProps
     with ViewPropsAndroid
     with ViewPropsIOS
     with GestureResponderHandlers
     with Touchable
     with PointerEvents {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var fab: js.UndefOr[Boolean] = js.undefined
  
  var maskBorderRadius: js.UndefOr[Double] = js.undefined
  
  var maskBorderRadiusInPercent: js.UndefOr[Double] = js.undefined
  
  var maskColor: js.UndefOr[String] = js.undefined
  
  var maskDuration: js.UndefOr[Double] = js.undefined
  
  var maskEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Used to reference react managed views from native code.
    */
  var nativeID: js.UndefOr[String] = js.undefined
  
  /**
    *
    * In the absence of auto property, none is much like CSS's none value. box-none is as if you had applied the CSS class:
    *
    * .box-none {
    *   pointer-events: none;
    * }
    * .box-none * {
    *   pointer-events: all;
    * }
    *
    * box-only is the equivalent of
    *
    * .box-only {
    *   pointer-events: all;
    * }
    * .box-only * {
    *   pointer-events: none;
    * }
    *
    * But since pointerEvents does not affect layout/appearance, and we are already deviating from the spec by adding additional modes,
    * we opt to not include pointerEvents on style. On some platforms, we would need to implement it as a className anyways. Using style or not is an implementation detail of the platform.
    */
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
  
  /**
    *
    * This is a special performance property exposed by RCTView and is useful for scrolling content when there are many subviews,
    * most of which are offscreen. For this property to be effective, it must be applied to a view that contains many subviews that extend outside its bound.
    * The subviews must also have overflow: hidden, as should the containing view (or one of its superviews).
    */
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  
  var rippleColor: js.UndefOr[String] = js.undefined
  
  var rippleDuration: js.UndefOr[Double] = js.undefined
  
  var rippleLocation: js.UndefOr[typings.reactNativeMaterialKit.mod.MKPropTypes.rippleLocation] = js.undefined
  
  var shadowAniEnabled: js.UndefOr[Boolean] = js.undefined
}
object MKButtonProperties {
  
  inline def apply(): MKButtonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKButtonProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MKButtonProperties] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFab(value: Boolean): Self = StObject.set(x, "fab", value.asInstanceOf[js.Any])
    
    inline def setFabUndefined: Self = StObject.set(x, "fab", js.undefined)
    
    inline def setMaskBorderRadius(value: Double): Self = StObject.set(x, "maskBorderRadius", value.asInstanceOf[js.Any])
    
    inline def setMaskBorderRadiusInPercent(value: Double): Self = StObject.set(x, "maskBorderRadiusInPercent", value.asInstanceOf[js.Any])
    
    inline def setMaskBorderRadiusInPercentUndefined: Self = StObject.set(x, "maskBorderRadiusInPercent", js.undefined)
    
    inline def setMaskBorderRadiusUndefined: Self = StObject.set(x, "maskBorderRadius", js.undefined)
    
    inline def setMaskColor(value: String): Self = StObject.set(x, "maskColor", value.asInstanceOf[js.Any])
    
    inline def setMaskColorUndefined: Self = StObject.set(x, "maskColor", js.undefined)
    
    inline def setMaskDuration(value: Double): Self = StObject.set(x, "maskDuration", value.asInstanceOf[js.Any])
    
    inline def setMaskDurationUndefined: Self = StObject.set(x, "maskDuration", js.undefined)
    
    inline def setMaskEnabled(value: Boolean): Self = StObject.set(x, "maskEnabled", value.asInstanceOf[js.Any])
    
    inline def setMaskEnabledUndefined: Self = StObject.set(x, "maskEnabled", js.undefined)
    
    inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    inline def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    
    inline def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
    
    inline def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
    
    inline def setRippleDuration(value: Double): Self = StObject.set(x, "rippleDuration", value.asInstanceOf[js.Any])
    
    inline def setRippleDurationUndefined: Self = StObject.set(x, "rippleDuration", js.undefined)
    
    inline def setRippleLocation(value: rippleLocation): Self = StObject.set(x, "rippleLocation", value.asInstanceOf[js.Any])
    
    inline def setRippleLocationUndefined: Self = StObject.set(x, "rippleLocation", js.undefined)
    
    inline def setShadowAniEnabled(value: Boolean): Self = StObject.set(x, "shadowAniEnabled", value.asInstanceOf[js.Any])
    
    inline def setShadowAniEnabledUndefined: Self = StObject.set(x, "shadowAniEnabled", js.undefined)
  }
}
