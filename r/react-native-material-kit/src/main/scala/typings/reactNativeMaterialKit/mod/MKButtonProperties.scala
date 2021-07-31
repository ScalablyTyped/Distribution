package typings.reactNativeMaterialKit.mod

import typings.reactNative.mod.GestureResponderHandlers
import typings.reactNative.mod.Touchable
import typings.reactNative.mod.TouchableWithoutFeedbackProps
import typings.reactNative.mod.ViewPropsAndroid
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
- typings.reactNative.mod.TVViewPropsIOS because var conflicts: hasTVPreferredFocus, tvParallaxProperties. Inlined tvParallaxTiltAngle, tvParallaxMagnification, tvParallaxShiftDistanceY, isTVSelectable, tvParallaxShiftDistanceX
- typings.reactNative.mod.AccessibilityProps because Already inherited
- typings.reactNative.mod.ViewPropsIOS because var conflicts: hasTVPreferredFocus, tvParallaxProperties. Inlined shouldRasterizeIOS
- typings.reactNative.mod.ViewProps because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, hasTVPreferredFocus, hitSlop, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, style, testID, tvParallaxProperties. Inlined pointerEvents, removeClippedSubviews, nativeID
- typings.reactNativeMaterialKit.mod.MKRippleProperties because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, hasTVPreferredFocus, hitSlop, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, style, testID, tvParallaxProperties. Inlined rippleColor, rippleDuration, rippleLocation, maskEnabled, maskColor, maskBorderRadius, maskBorderRadiusInPercent, maskDuration, shadowAniEnabled */ trait MKButtonProperties
  extends StObject
     with TouchableWithoutFeedbackProps
     with ViewPropsAndroid
     with GestureResponderHandlers
     with Touchable {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var fab: js.UndefOr[Boolean] = js.undefined
  
  /**
    * *(Apple TV only)* When set to true, this view will be focusable
    * and navigable using the Apple TV remote.
    *
    * @platform ios
    */
  var isTVSelectable: js.UndefOr[Boolean] = js.undefined
  
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
  
  /**
    * Whether this view should be rendered as a bitmap before compositing.
    *
    * On iOS, this is useful for animations and interactions that do not modify this component's dimensions nor its children;
    * for example, when translating the position of a static view, rasterization allows the renderer to reuse a cached bitmap of a static view
    * and quickly composite it during each frame.
    *
    * Rasterization incurs an off-screen drawing pass and the bitmap consumes memory.
    * Test and measure when using this property.
    */
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
  
  /**
    * *(Apple TV only)* May be used to change the appearance of the Apple TV parallax effect when this view goes in or out of focus.  Defaults to 1.0.
    *
    * @platform ios
    */
  var tvParallaxMagnification: js.UndefOr[Double] = js.undefined
  
  /**
    * *(Apple TV only)* May be used to change the appearance of the Apple TV parallax effect when this view goes in or out of focus.  Defaults to 2.0.
    *
    * @platform ios
    */
  var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
  
  /**
    * *(Apple TV only)* May be used to change the appearance of the Apple TV parallax effect when this view goes in or out of focus.  Defaults to 2.0.
    *
    * @platform ios
    */
  var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
  
  /**
    * *(Apple TV only)* May be used to change the appearance of the Apple TV parallax effect when this view goes in or out of focus.  Defaults to 0.05.
    *
    * @platform ios
    */
  var tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
}
object MKButtonProperties {
  
  @scala.inline
  def apply(): MKButtonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKButtonProperties]
  }
  
  @scala.inline
  implicit class MKButtonPropertiesMutableBuilder[Self <: MKButtonProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFab(value: Boolean): Self = StObject.set(x, "fab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFabUndefined: Self = StObject.set(x, "fab", js.undefined)
    
    @scala.inline
    def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
    
    @scala.inline
    def setMaskBorderRadius(value: Double): Self = StObject.set(x, "maskBorderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskBorderRadiusInPercent(value: Double): Self = StObject.set(x, "maskBorderRadiusInPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskBorderRadiusInPercentUndefined: Self = StObject.set(x, "maskBorderRadiusInPercent", js.undefined)
    
    @scala.inline
    def setMaskBorderRadiusUndefined: Self = StObject.set(x, "maskBorderRadius", js.undefined)
    
    @scala.inline
    def setMaskColor(value: String): Self = StObject.set(x, "maskColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskColorUndefined: Self = StObject.set(x, "maskColor", js.undefined)
    
    @scala.inline
    def setMaskDuration(value: Double): Self = StObject.set(x, "maskDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskDurationUndefined: Self = StObject.set(x, "maskDuration", js.undefined)
    
    @scala.inline
    def setMaskEnabled(value: Boolean): Self = StObject.set(x, "maskEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskEnabledUndefined: Self = StObject.set(x, "maskEnabled", js.undefined)
    
    @scala.inline
    def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    @scala.inline
    def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    
    @scala.inline
    def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
    
    @scala.inline
    def setRippleDuration(value: Double): Self = StObject.set(x, "rippleDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleDurationUndefined: Self = StObject.set(x, "rippleDuration", js.undefined)
    
    @scala.inline
    def setRippleLocation(value: rippleLocation): Self = StObject.set(x, "rippleLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleLocationUndefined: Self = StObject.set(x, "rippleLocation", js.undefined)
    
    @scala.inline
    def setShadowAniEnabled(value: Boolean): Self = StObject.set(x, "shadowAniEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowAniEnabledUndefined: Self = StObject.set(x, "shadowAniEnabled", js.undefined)
    
    @scala.inline
    def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
    
    @scala.inline
    def setTvParallaxMagnification(value: Double): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
    
    @scala.inline
    def setTvParallaxShiftDistanceX(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
    
    @scala.inline
    def setTvParallaxShiftDistanceY(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
    
    @scala.inline
    def setTvParallaxTiltAngle(value: Double): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
  }
}
