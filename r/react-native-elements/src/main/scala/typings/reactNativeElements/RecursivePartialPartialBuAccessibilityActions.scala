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
import typings.reactNativeElements.mod.RecursivePartial
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

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.ButtonProps>> */
trait RecursivePartialPartialBuAccessibilityActions extends js.Object {
  var TouchableComponent: js.UndefOr[RecursivePartial[js.UndefOr[ComponentClass[js.Object, ComponentState]]]] = js.undefined
  var ViewComponent: js.UndefOr[RecursivePartial[js.UndefOr[ComponentClass[_, ComponentState]]]] = js.undefined
  var accessibilityActions: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]] = js.undefined
  var accessibilityComponentType: js.UndefOr[
    RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]
  ] = js.undefined
  var accessibilityElementsHidden: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var accessibilityHint: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var accessibilityIgnoresInvertColors: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var accessibilityLabel: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var accessibilityLiveRegion: js.UndefOr[RecursivePartial[js.UndefOr[none | polite | assertive]]] = js.undefined
  var accessibilityRole: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityRole]]] = js.undefined
  var accessibilityState: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityState]]] = js.undefined
  var accessibilityStates: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[AccessibilityStates]]]] = js.undefined
  var accessibilityTraits: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]] = js.undefined
  var accessibilityViewIsModal: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var accessible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var activeOpacity: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var background: js.UndefOr[RecursivePartial[js.UndefOr[BackgroundPropType]]] = js.undefined
  var buttonStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var delayLongPress: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var delayPressIn: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var delayPressOut: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var disabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var disabledStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var disabledTitleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  var hasTVPreferredFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var hitSlop: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.undefined
  var icon: js.UndefOr[RecursivePartial[js.UndefOr[IconNode]]] = js.undefined
  var iconContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var iconRight: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var importantForAccessibility: js.UndefOr[RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.undefined
  var linearGradientProps: js.UndefOr[RecursivePartial[js.UndefOr[js.Object]]] = js.undefined
  var loading: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var loadingProps: js.UndefOr[RecursivePartial[js.UndefOr[ActivityIndicatorProperties]]] = js.undefined
  var loadingStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var onAccessibilityAction: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]
  ] = js.undefined
  var onAccessibilityTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onBlur: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]]]
  ] = js.undefined
  var onFocus: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]]]
  ] = js.undefined
  var onLayout: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.undefined
  var onLongPress: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  var onMagicTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onPress: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  var onPressIn: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  var onPressOut: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  var pressRetentionOffset: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.undefined
  var raised: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var style: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var testID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var title: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var titleProps: js.UndefOr[RecursivePartial[js.UndefOr[TextProperties]]] = js.undefined
  var titleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  var tvParallaxProperties: js.UndefOr[RecursivePartial[js.UndefOr[TVParallaxProperties]]] = js.undefined
  var `type`: js.UndefOr[RecursivePartial[js.UndefOr[solid | clear | outline]]] = js.undefined
  var useForeground: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
}

object RecursivePartialPartialBuAccessibilityActions {
  @scala.inline
  def apply(
    TouchableComponent: RecursivePartial[js.UndefOr[ComponentClass[js.Object, ComponentState]]] = null,
    ViewComponent: RecursivePartial[js.UndefOr[ComponentClass[_, ComponentState]]] = null,
    accessibilityActions: RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]] = null,
    accessibilityComponentType: RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]] = null,
    accessibilityElementsHidden: RecursivePartial[js.UndefOr[Boolean]] = null,
    accessibilityHint: RecursivePartial[js.UndefOr[String]] = null,
    accessibilityIgnoresInvertColors: RecursivePartial[js.UndefOr[Boolean]] = null,
    accessibilityLabel: RecursivePartial[js.UndefOr[String]] = null,
    accessibilityLiveRegion: RecursivePartial[js.UndefOr[none | polite | assertive]] = null,
    accessibilityRole: RecursivePartial[js.UndefOr[AccessibilityRole]] = null,
    accessibilityState: RecursivePartial[js.UndefOr[AccessibilityState]] = null,
    accessibilityStates: RecursivePartial[js.UndefOr[js.Array[AccessibilityStates]]] = null,
    accessibilityTraits: RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]] = null,
    accessibilityViewIsModal: RecursivePartial[js.UndefOr[Boolean]] = null,
    accessible: RecursivePartial[js.UndefOr[Boolean]] = null,
    activeOpacity: RecursivePartial[js.UndefOr[Double]] = null,
    background: RecursivePartial[js.UndefOr[BackgroundPropType]] = null,
    buttonStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    containerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    delayLongPress: RecursivePartial[js.UndefOr[Double]] = null,
    delayPressIn: RecursivePartial[js.UndefOr[Double]] = null,
    delayPressOut: RecursivePartial[js.UndefOr[Double]] = null,
    disabled: RecursivePartial[js.UndefOr[Boolean]] = null,
    disabledStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    disabledTitleStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    hasTVPreferredFocus: RecursivePartial[js.UndefOr[Boolean]] = null,
    hitSlop: RecursivePartial[js.UndefOr[Insets]] = null,
    icon: RecursivePartial[js.UndefOr[IconNode]] = null,
    iconContainerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    iconRight: RecursivePartial[js.UndefOr[Boolean]] = null,
    importantForAccessibility: RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]] = null,
    linearGradientProps: RecursivePartial[js.UndefOr[js.Object]] = null,
    loading: RecursivePartial[js.UndefOr[Boolean]] = null,
    loadingProps: RecursivePartial[js.UndefOr[ActivityIndicatorProperties]] = null,
    loadingStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    onAccessibilityAction: RecursivePartial[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]] = null,
    onAccessibilityTap: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onBlur: RecursivePartial[js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]]] = null,
    onFocus: RecursivePartial[js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]]] = null,
    onLayout: RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]] = null,
    onLongPress: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onMagicTap: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onPress: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onPressIn: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onPressOut: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    pressRetentionOffset: RecursivePartial[js.UndefOr[Insets]] = null,
    raised: RecursivePartial[js.UndefOr[Boolean]] = null,
    style: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    testID: RecursivePartial[js.UndefOr[String]] = null,
    title: RecursivePartial[js.UndefOr[String]] = null,
    titleProps: RecursivePartial[js.UndefOr[TextProperties]] = null,
    titleStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    tvParallaxProperties: RecursivePartial[js.UndefOr[TVParallaxProperties]] = null,
    `type`: RecursivePartial[js.UndefOr[solid | clear | outline]] = null,
    useForeground: RecursivePartial[js.UndefOr[Boolean]] = null
  ): RecursivePartialPartialBuAccessibilityActions = {
    val __obj = js.Dynamic.literal()
    if (TouchableComponent != null) __obj.updateDynamic("TouchableComponent")(TouchableComponent.asInstanceOf[js.Any])
    if (ViewComponent != null) __obj.updateDynamic("ViewComponent")(ViewComponent.asInstanceOf[js.Any])
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (accessibilityElementsHidden != null) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (accessibilityIgnoresInvertColors != null) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (accessibilityViewIsModal != null) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.asInstanceOf[js.Any])
    if (accessible != null) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (delayPressOut != null) __obj.updateDynamic("delayPressOut")(delayPressOut.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledStyle != null) __obj.updateDynamic("disabledStyle")(disabledStyle.asInstanceOf[js.Any])
    if (disabledTitleStyle != null) __obj.updateDynamic("disabledTitleStyle")(disabledTitleStyle.asInstanceOf[js.Any])
    if (hasTVPreferredFocus != null) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconContainerStyle != null) __obj.updateDynamic("iconContainerStyle")(iconContainerStyle.asInstanceOf[js.Any])
    if (iconRight != null) __obj.updateDynamic("iconRight")(iconRight.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (linearGradientProps != null) __obj.updateDynamic("linearGradientProps")(linearGradientProps.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (loadingProps != null) __obj.updateDynamic("loadingProps")(loadingProps.asInstanceOf[js.Any])
    if (loadingStyle != null) __obj.updateDynamic("loadingStyle")(loadingStyle.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(onAccessibilityAction.asInstanceOf[js.Any])
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(onAccessibilityTap.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus.asInstanceOf[js.Any])
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(onLongPress.asInstanceOf[js.Any])
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(onMagicTap.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(onPress.asInstanceOf[js.Any])
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(onPressIn.asInstanceOf[js.Any])
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(onPressOut.asInstanceOf[js.Any])
    if (pressRetentionOffset != null) __obj.updateDynamic("pressRetentionOffset")(pressRetentionOffset.asInstanceOf[js.Any])
    if (raised != null) __obj.updateDynamic("raised")(raised.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (useForeground != null) __obj.updateDynamic("useForeground")(useForeground.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecursivePartialPartialBuAccessibilityActions]
  }
}

