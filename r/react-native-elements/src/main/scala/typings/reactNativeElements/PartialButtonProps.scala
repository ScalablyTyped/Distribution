package typings.reactNativeElements

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityStates
import typings.reactNative.mod.AccessibilityTrait
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
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.IconNode
import typings.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typings.reactNativeElements.reactNativeElementsStrings.assertive
import typings.reactNativeElements.reactNativeElementsStrings.auto
import typings.reactNativeElements.reactNativeElementsStrings.button
import typings.reactNativeElements.reactNativeElementsStrings.clear
import typings.reactNativeElements.reactNativeElementsStrings.no
import typings.reactNativeElements.reactNativeElementsStrings.none
import typings.reactNativeElements.reactNativeElementsStrings.outline
import typings.reactNativeElements.reactNativeElementsStrings.polite
import typings.reactNativeElements.reactNativeElementsStrings.radiobutton_checked
import typings.reactNativeElements.reactNativeElementsStrings.radiobutton_unchecked
import typings.reactNativeElements.reactNativeElementsStrings.solid
import typings.reactNativeElements.reactNativeElementsStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.ButtonProps> */
trait PartialButtonProps extends js.Object {
  var TouchableComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  var ViewComponent: js.UndefOr[ComponentClass[_, ComponentState]] = js.undefined
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
  var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.undefined
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  var accessibilityHint: js.UndefOr[String] = js.undefined
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
  var accessibilityStates: js.UndefOr[js.Array[AccessibilityStates]] = js.undefined
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.undefined
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  var accessible: js.UndefOr[Boolean] = js.undefined
  var activeOpacity: js.UndefOr[Double] = js.undefined
  var background: js.UndefOr[BackgroundPropType] = js.undefined
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var delayLongPress: js.UndefOr[Double] = js.undefined
  var delayPressIn: js.UndefOr[Double] = js.undefined
  var delayPressOut: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var disabledTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  var hitSlop: js.UndefOr[Insets] = js.undefined
  var icon: js.UndefOr[IconNode] = js.undefined
  var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var iconRight: js.UndefOr[Boolean] = js.undefined
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  var linearGradientProps: js.UndefOr[js.Object] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var loadingProps: js.UndefOr[ActivityIndicatorProperties] = js.undefined
  var loadingStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var pressRetentionOffset: js.UndefOr[Insets] = js.undefined
  var raised: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleProps: js.UndefOr[TextProperties] = js.undefined
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
  var `type`: js.UndefOr[solid | clear | outline] = js.undefined
  var useForeground: js.UndefOr[Boolean] = js.undefined
}

object PartialButtonProps {
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
  ): PartialButtonProps = {
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
    __obj.asInstanceOf[PartialButtonProps]
  }
}

