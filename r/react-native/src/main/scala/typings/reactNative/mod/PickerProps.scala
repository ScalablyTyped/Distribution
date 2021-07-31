package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.dialog
import typings.reactNative.reactNativeStrings.dropdown
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
- typings.reactNative.mod.PickerPropsAndroid because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, collapsable, focusable, hasTVPreferredFocus, hitSlop, importantForAccessibility, isTVSelectable, nativeID, needsOffscreenAlphaCompositing, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, onMoveShouldSetResponder, onMoveShouldSetResponderCapture, onResponderEnd, onResponderGrant, onResponderMove, onResponderReject, onResponderRelease, onResponderStart, onResponderTerminate, onResponderTerminationRequest, onStartShouldSetResponder, onStartShouldSetResponderCapture, onTouchCancel, onTouchEnd, onTouchEndCapture, onTouchMove, onTouchStart, pointerEvents, removeClippedSubviews, renderToHardwareTextureAndroid, shouldRasterizeIOS, style, testID, tvParallaxMagnification, tvParallaxProperties, tvParallaxShiftDistanceX, tvParallaxShiftDistanceY, tvParallaxTiltAngle. Inlined enabled, mode, prompt */ trait PickerProps
  extends StObject
     with PickerPropsIOS {
  
  /**
    * If set to false, the picker will be disabled, i.e. the user will not be able to make a
    * selection.
    * @platform android
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * On Android, specifies how to display the selection items when the user taps on the picker:
    *
    *   - 'dialog': Show a modal dialog. This is the default.
    *   - 'dropdown': Shows a dropdown anchored to the picker view
    *
    * @platform android
    */
  var mode: js.UndefOr[dialog | dropdown] = js.undefined
  
  /**
    * Callback for when an item is selected. This is called with the
    * following parameters:
    * - itemValue: the value prop of the item that was selected
    * - itemPosition: the index of the selected item in this picker
    */
  var onValueChange: js.UndefOr[js.Function2[/* itemValue */ js.Any, /* itemPosition */ Double, Unit]] = js.undefined
  
  /**
    * Prompt string for this picker, used on Android in dialog mode as the title of the dialog.
    * @platform android
    */
  var prompt: js.UndefOr[String] = js.undefined
  
  /**
    * Value matching value of one of the items.
    * Can be a string or an integer.
    */
  var selectedValue: js.UndefOr[js.Any] = js.undefined
  
  @JSName("style")
  var style_PickerProps: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * Used to locate this view in end-to-end tests.
    */
  var testId: js.UndefOr[String] = js.undefined
}
object PickerProps {
  
  @scala.inline
  def apply(): PickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerProps]
  }
  
  @scala.inline
  implicit class PickerPropsMutableBuilder[Self <: PickerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMode(value: dialog | dropdown): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: (/* itemValue */ js.Any, /* itemPosition */ Double) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    @scala.inline
    def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    @scala.inline
    def setSelectedValue(value: js.Any): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIdUndefined: Self = StObject.set(x, "testId", js.undefined)
  }
}
