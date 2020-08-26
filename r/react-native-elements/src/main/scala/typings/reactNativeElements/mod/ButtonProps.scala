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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactNative.mod.AccessibilityPropsIOS because Already inherited
- typings.reactNative.mod.AccessibilityPropsAndroid because Already inherited
- typings.reactNative.mod.TouchableWithoutFeedbackPropsAndroid because Already inherited
- typings.reactNative.mod.TouchableWithoutFeedbackPropsIOS because Already inherited
- typings.reactNative.mod.AccessibilityProps because Already inherited
- typings.reactNative.mod.TouchableWithoutFeedbackProps because Already inherited
- typings.reactNative.mod.TouchableNativeFeedbackProps because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, delayLongPress, delayPressIn, delayPressOut, disabled, hasTVPreferredFocus, hitSlop, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onBlur, onFocus, onLayout, onLongPress, onMagicTap, onPress, onPressIn, onPressOut, pressRetentionOffset, style, testID, touchSoundDisabled, tvParallaxProperties. Inlined background, useForeground */ @js.native
trait ButtonProps extends TouchableOpacityProps {
  /**
    * Specify other touchable such as TouchableOpacity/TouchableNativeFeedback
    *
    * Default is TouchableOpacity on IOS and TouchableNativeFeedback on Android
    */
  var TouchableComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.native
  /**
    * Specify a different component as the background for the button.
    * Useful for if you want to make a button with a gradient background.
    *
    * @default View
    */
  var ViewComponent: js.UndefOr[ComponentClass[_, ComponentState]] = js.native
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
  var background: js.UndefOr[BackgroundPropType] = js.native
  /**
    * Additional styling for button (background) view component
    *
    * @default null
    */
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Styling for Component container
    *
    * @default null
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Style of the button when disabled
    */
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Style of the title when the button is disabled
    */
  var disabledTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * If the user is allowed to interact with the button
    *
    * @default false
    */
  @JSName("disabled")
  var disabled_ButtonProps: js.UndefOr[Boolean] = js.native
  /**
    * Icon to show in the button
    */
  var icon: js.UndefOr[IconNode] = js.native
  /**
    * Style for the container around the icon
    */
  var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * If to show the icon on the right
    *
    * @default false
    */
  var iconRight: js.UndefOr[Boolean] = js.native
  /**
    * Object of props to be applied to the linearGradient view(ViewComponent)
    */
  var linearGradientProps: js.UndefOr[js.Object] = js.native
  /**
    * Display a loading spinner
    *
    * @default false
    */
  var loading: js.UndefOr[Boolean] = js.native
  /**
    * Additional props to applied to the ActivityIndicator
    */
  var loadingProps: js.UndefOr[ActivityIndicatorProperties] = js.native
  /**
    * Additional style to applied to the ActivityIndicator
    */
  var loadingStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * If the button has raised styling
    *
    * @default false
    */
  var raised: js.UndefOr[Boolean] = js.native
  /**
    * Button title
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Optional props for the title inside the button
    */
  var titleProps: js.UndefOr[TextProperties] = js.native
  /**
    * Title styling
    */
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Type of button
    *
    * @default solid
    */
  var `type`: js.UndefOr[solid | clear | outline] = js.native
  var useForeground: js.UndefOr[Boolean] = js.native
}

object ButtonProps {
  @scala.inline
  def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  @scala.inline
  implicit class ButtonPropsOps[Self <: ButtonProps] (val x: Self) extends AnyVal {
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
    def setTouchableComponent(value: ComponentClass[js.Object, ComponentState]): Self = this.set("TouchableComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchableComponent: Self = this.set("TouchableComponent", js.undefined)
    @scala.inline
    def setViewComponent(value: ComponentClass[_, ComponentState]): Self = this.set("ViewComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewComponent: Self = this.set("ViewComponent", js.undefined)
    @scala.inline
    def setBackground(value: BackgroundPropType): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setButtonStyle(value: StyleProp[ViewStyle]): Self = this.set("buttonStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonStyle: Self = this.set("buttonStyle", js.undefined)
    @scala.inline
    def setButtonStyleNull: Self = this.set("buttonStyle", null)
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisabledStyle(value: StyleProp[ViewStyle]): Self = this.set("disabledStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledStyle: Self = this.set("disabledStyle", js.undefined)
    @scala.inline
    def setDisabledStyleNull: Self = this.set("disabledStyle", null)
    @scala.inline
    def setDisabledTitleStyle(value: StyleProp[TextStyle]): Self = this.set("disabledTitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledTitleStyle: Self = this.set("disabledTitleStyle", js.undefined)
    @scala.inline
    def setDisabledTitleStyleNull: Self = this.set("disabledTitleStyle", null)
    @scala.inline
    def setIcon(value: IconNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("iconContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconContainerStyle: Self = this.set("iconContainerStyle", js.undefined)
    @scala.inline
    def setIconContainerStyleNull: Self = this.set("iconContainerStyle", null)
    @scala.inline
    def setIconRight(value: Boolean): Self = this.set("iconRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconRight: Self = this.set("iconRight", js.undefined)
    @scala.inline
    def setLinearGradientProps(value: js.Object): Self = this.set("linearGradientProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinearGradientProps: Self = this.set("linearGradientProps", js.undefined)
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setLoadingProps(value: ActivityIndicatorProperties): Self = this.set("loadingProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingProps: Self = this.set("loadingProps", js.undefined)
    @scala.inline
    def setLoadingStyle(value: StyleProp[ViewStyle]): Self = this.set("loadingStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingStyle: Self = this.set("loadingStyle", js.undefined)
    @scala.inline
    def setLoadingStyleNull: Self = this.set("loadingStyle", null)
    @scala.inline
    def setRaised(value: Boolean): Self = this.set("raised", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaised: Self = this.set("raised", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleProps(value: TextProperties): Self = this.set("titleProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleProps: Self = this.set("titleProps", js.undefined)
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
    @scala.inline
    def setTitleStyleNull: Self = this.set("titleStyle", null)
    @scala.inline
    def setType(value: solid | clear | outline): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUseForeground(value: Boolean): Self = this.set("useForeground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseForeground: Self = this.set("useForeground", js.undefined)
  }
  
}

