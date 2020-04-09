package typings.reactNativeElements.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityStates
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.ActivityIndicatorProperties
import typings.reactNative.mod.BackgroundPropType
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.TargetedEvent
import typings.reactNative.mod.TextProperties
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.TouchableOpacityProps
import typings.reactNative.mod.ViewStyle
import typings.reactNative.reactNativeStrings.`no-hide-descendants`
import typings.reactNative.reactNativeStrings.assertive
import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.button
import typings.reactNative.reactNativeStrings.no
import typings.reactNative.reactNativeStrings.none
import typings.reactNative.reactNativeStrings.polite
import typings.reactNative.reactNativeStrings.radiobutton_checked
import typings.reactNative.reactNativeStrings.radiobutton_unchecked
import typings.reactNative.reactNativeStrings.yes
import typings.reactNativeElements.reactNativeElementsStrings.clear
import typings.reactNativeElements.reactNativeElementsStrings.outline
import typings.reactNativeElements.reactNativeElementsStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.reactNative.mod.AccessibilityPropsIOS because Already inherited
- typings.reactNative.mod.AccessibilityPropsAndroid because Already inherited
- typings.reactNative.mod.TouchableWithoutFeedbackPropsIOS because Already inherited
- typings.reactNative.mod.AccessibilityProps because Already inherited
- typings.reactNative.mod.TouchableWithoutFeedbackProps because Already inherited
- typings.reactNative.mod.TouchableNativeFeedbackProps because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityStates, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, delayLongPress, delayPressIn, delayPressOut, disabled, hasTVPreferredFocus, hitSlop, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onBlur, onFocus, onLayout, onLongPress, onMagicTap, onPress, onPressIn, onPressOut, pressRetentionOffset, style, testID, tvParallaxProperties. Inlined background, useForeground */ trait ButtonProps extends TouchableOpacityProps {
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
  var ViewComponent: js.UndefOr[ComponentClass[_, ComponentState]] = js.undefined
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
  @scala.inline
  def apply(
    TouchableComponent: ComponentClass[js.Object, ComponentState] = null,
    ViewComponent: ComponentClass[_, ComponentState] = null,
    accessibilityActions: js.Array[AccessibilityActionInfo] = null,
    accessibilityComponentType: none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityStates: js.Array[AccessibilityStates] = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessibilityValue: AccessibilityValue = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    activeOpacity: Int | Double = null,
    background: BackgroundPropType = null,
    buttonStyle: StyleProp[ViewStyle] = null,
    containerStyle: StyleProp[ViewStyle] = null,
    delayLongPress: Int | Double = null,
    delayPressIn: Int | Double = null,
    delayPressOut: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledStyle: StyleProp[ViewStyle] = null,
    disabledTitleStyle: StyleProp[TextStyle] = null,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    icon: IconNode = null,
    iconContainerStyle: StyleProp[ViewStyle] = null,
    iconRight: js.UndefOr[Boolean] = js.undefined,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    linearGradientProps: js.Object = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    loadingProps: ActivityIndicatorProperties = null,
    loadingStyle: StyleProp[ViewStyle] = null,
    onAccessibilityAction: /* event */ AccessibilityActionEvent => Unit = null,
    onAccessibilityEscape: () => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onBlur: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit = null,
    onFocus: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onLongPress: /* event */ GestureResponderEvent => Unit = null,
    onMagicTap: () => Unit = null,
    onPress: /* event */ GestureResponderEvent => Unit = null,
    onPressIn: /* event */ GestureResponderEvent => Unit = null,
    onPressOut: /* event */ GestureResponderEvent => Unit = null,
    pressRetentionOffset: Insets = null,
    raised: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    testID: String = null,
    title: String = null,
    titleProps: TextProperties = null,
    titleStyle: StyleProp[TextStyle] = null,
    tvParallaxProperties: TVParallaxProperties = null,
    `type`: solid | clear | outline = null,
    useForeground: js.UndefOr[Boolean] = js.undefined
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if (TouchableComponent != null) __obj.updateDynamic("TouchableComponent")(TouchableComponent.asInstanceOf[js.Any])
    if (ViewComponent != null) __obj.updateDynamic("ViewComponent")(ViewComponent.asInstanceOf[js.Any])
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (accessibilityValue != null) __obj.updateDynamic("accessibilityValue")(accessibilityValue.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (delayPressOut != null) __obj.updateDynamic("delayPressOut")(delayPressOut.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledStyle != null) __obj.updateDynamic("disabledStyle")(disabledStyle.asInstanceOf[js.Any])
    if (disabledTitleStyle != null) __obj.updateDynamic("disabledTitleStyle")(disabledTitleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconContainerStyle != null) __obj.updateDynamic("iconContainerStyle")(iconContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(iconRight)) __obj.updateDynamic("iconRight")(iconRight.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (linearGradientProps != null) __obj.updateDynamic("linearGradientProps")(linearGradientProps.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (loadingProps != null) __obj.updateDynamic("loadingProps")(loadingProps.asInstanceOf[js.Any])
    if (loadingStyle != null) __obj.updateDynamic("loadingStyle")(loadingStyle.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityEscape != null) __obj.updateDynamic("onAccessibilityEscape")(js.Any.fromFunction0(onAccessibilityEscape))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1(onLongPress))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1(onPressIn))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction1(onPressOut))
    if (pressRetentionOffset != null) __obj.updateDynamic("pressRetentionOffset")(pressRetentionOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useForeground)) __obj.updateDynamic("useForeground")(useForeground.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

