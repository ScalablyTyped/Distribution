package typings.reactNativeElements.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.ActivityIndicatorProperties
import typings.reactNative.mod.BackgroundPropType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextProperties
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.TouchableOpacityProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.reactNativeElementsStrings.clear
import typings.reactNativeElements.reactNativeElementsStrings.outline
import typings.reactNativeElements.reactNativeElementsStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactNative.mod.AccessibilityPropsIOS because Already inherited
- typings.reactNative.mod.AccessibilityPropsAndroid because Already inherited
- typings.reactNative.mod.AccessibilityProps because Already inherited
- typings.reactNative.mod.TouchableWithoutFeedbackPropsAndroid because Already inherited
- typings.reactNative.mod.TouchableWithoutFeedbackPropsIOS because Already inherited
- typings.reactNative.mod.TouchableWithoutFeedbackProps because Already inherited
- typings.reactNative.mod.TouchableNativeFeedbackProps because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, delayLongPress, delayPressIn, delayPressOut, disabled, hasTVPreferredFocus, hitSlop, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onBlur, onFocus, onLayout, onLongPress, onMagicTap, onPress, onPressIn, onPressOut, pressRetentionOffset, style, testID, touchSoundDisabled, tvParallaxProperties. Inlined useForeground, background */ trait ButtonProps
  extends StObject
     with TouchableOpacityProps {
  
  /**
    * Specify other touchable such as TouchableOpacity/TouchableNativeFeedback
    *
    * Default is TouchableOpacity on IOS and TouchableNativeFeedback on Android
    */
  var TouchableComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  
  /**
    * Specify a different component as the background for the button.
    * Useful for if you want to make a button with a gradient background.
    *
    * @default View
    */
  var ViewComponent: js.UndefOr[ComponentClass[js.Any, ComponentState]] = js.undefined
  
  /**
    * Determines the type of background drawable that's going to be used to display feedback.
    * It takes an object with type property and extra data depending on the type.
    * It's recommended to use one of the following static methods to generate that dictionary:
    *      1) TouchableNativeFeedback.SelectableBackground() - will create object that represents android theme's
    *         default background for selectable elements (?android:attr/selectableItemBackground)
    *      2) TouchableNativeFeedback.SelectableBackgroundBorderless() - will create object that represent android
    *         theme's default background for borderless selectable elements
    *         (?android:attr/selectableItemBackgroundBorderless). Available on android API level 21+
    *      3) TouchableNativeFeedback.Ripple(color, borderless) - will create object that represents ripple drawable
    *         with specified color (as a string). If property borderless evaluates to true the ripple will render
    *         outside of the view bounds (see native actionbar buttons as an example of that behavior). This background
    *         type is available on Android API level 21+
    */
  var background: js.UndefOr[BackgroundPropType] = js.undefined
  
  /**
    * Additional styling for button (background) view component
    *
    * @default null
    */
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Styling for Component container
    *
    * @default null
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Style of the button when disabled
    */
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Style of the title when the button is disabled
    */
  var disabledTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * If the user is allowed to interact with the button
    *
    * @default false
    */
  @JSName("disabled")
  var disabled_ButtonProps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Icon to show in the button
    */
  var icon: js.UndefOr[IconNode] = js.undefined
  
  /**
    * Style for the container around the icon
    */
  var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * If to show the icon on the right
    *
    * @default false
    */
  var iconRight: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Object of props to be applied to the linearGradient view(ViewComponent)
    */
  var linearGradientProps: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Display a loading spinner
    *
    * @default false
    */
  var loading: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Additional props to applied to the ActivityIndicator
    */
  var loadingProps: js.UndefOr[ActivityIndicatorProperties] = js.undefined
  
  /**
    * Additional style to applied to the ActivityIndicator
    */
  var loadingStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * If the button has raised styling
    *
    * @default false
    */
  var raised: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Button title
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Optional props for the title inside the button
    */
  var titleProps: js.UndefOr[TextProperties] = js.undefined
  
  /**
    * Title styling
    */
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * Type of button
    *
    * @default solid
    */
  var `type`: js.UndefOr[solid | clear | outline] = js.undefined
  
  var useForeground: js.UndefOr[Boolean] = js.undefined
}
object ButtonProps {
  
  inline def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  
  extension [Self <: ButtonProps](x: Self) {
    
    inline def setBackground(value: BackgroundPropType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setButtonStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
    
    inline def setButtonStyleNull: Self = StObject.set(x, "buttonStyle", null)
    
    inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
    
    inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
    
    inline def setDisabledStyleNull: Self = StObject.set(x, "disabledStyle", null)
    
    inline def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
    
    inline def setDisabledTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "disabledTitleStyle", value.asInstanceOf[js.Any])
    
    inline def setDisabledTitleStyleNull: Self = StObject.set(x, "disabledTitleStyle", null)
    
    inline def setDisabledTitleStyleUndefined: Self = StObject.set(x, "disabledTitleStyle", js.undefined)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcon(value: IconNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "iconContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setIconContainerStyleNull: Self = StObject.set(x, "iconContainerStyle", null)
    
    inline def setIconContainerStyleUndefined: Self = StObject.set(x, "iconContainerStyle", js.undefined)
    
    inline def setIconRight(value: Boolean): Self = StObject.set(x, "iconRight", value.asInstanceOf[js.Any])
    
    inline def setIconRightUndefined: Self = StObject.set(x, "iconRight", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLinearGradientProps(value: js.Object): Self = StObject.set(x, "linearGradientProps", value.asInstanceOf[js.Any])
    
    inline def setLinearGradientPropsUndefined: Self = StObject.set(x, "linearGradientProps", js.undefined)
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingProps(value: ActivityIndicatorProperties): Self = StObject.set(x, "loadingProps", value.asInstanceOf[js.Any])
    
    inline def setLoadingPropsUndefined: Self = StObject.set(x, "loadingProps", js.undefined)
    
    inline def setLoadingStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "loadingStyle", value.asInstanceOf[js.Any])
    
    inline def setLoadingStyleNull: Self = StObject.set(x, "loadingStyle", null)
    
    inline def setLoadingStyleUndefined: Self = StObject.set(x, "loadingStyle", js.undefined)
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
    
    inline def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleProps(value: TextProperties): Self = StObject.set(x, "titleProps", value.asInstanceOf[js.Any])
    
    inline def setTitlePropsUndefined: Self = StObject.set(x, "titleProps", js.undefined)
    
    inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTouchableComponent(value: ComponentClass[js.Object, ComponentState]): Self = StObject.set(x, "TouchableComponent", value.asInstanceOf[js.Any])
    
    inline def setTouchableComponentUndefined: Self = StObject.set(x, "TouchableComponent", js.undefined)
    
    inline def setType(value: solid | clear | outline): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseForeground(value: Boolean): Self = StObject.set(x, "useForeground", value.asInstanceOf[js.Any])
    
    inline def setUseForegroundUndefined: Self = StObject.set(x, "useForeground", js.undefined)
    
    inline def setViewComponent(value: ComponentClass[js.Any, ComponentState]): Self = StObject.set(x, "ViewComponent", value.asInstanceOf[js.Any])
    
    inline def setViewComponentUndefined: Self = StObject.set(x, "ViewComponent", js.undefined)
  }
}
