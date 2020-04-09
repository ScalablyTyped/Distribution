package typings.reactNativeElements

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityStates
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StatusBarProperties
import typings.reactNative.mod.StatusBarStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.HeaderSubComponent
import typings.reactNativeElements.mod.RecursivePartial
import typings.reactNativeElements.reactNativeElementsStrings.`box-none`
import typings.reactNativeElements.reactNativeElementsStrings.`box-only`
import typings.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typings.reactNativeElements.reactNativeElementsStrings.assertive
import typings.reactNativeElements.reactNativeElementsStrings.auto
import typings.reactNativeElements.reactNativeElementsStrings.button
import typings.reactNativeElements.reactNativeElementsStrings.center
import typings.reactNativeElements.reactNativeElementsStrings.left
import typings.reactNativeElements.reactNativeElementsStrings.no
import typings.reactNativeElements.reactNativeElementsStrings.none
import typings.reactNativeElements.reactNativeElementsStrings.polite
import typings.reactNativeElements.reactNativeElementsStrings.radiobutton_checked
import typings.reactNativeElements.reactNativeElementsStrings.radiobutton_unchecked
import typings.reactNativeElements.reactNativeElementsStrings.right
import typings.reactNativeElements.reactNativeElementsStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.HeaderProps>> */
trait RecursivePartialPartialHe extends js.Object {
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
  var accessibilityValue: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityValue]]] = js.undefined
  var accessibilityViewIsModal: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var accessible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var backgroundColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var backgroundImage: js.UndefOr[RecursivePartial[js.UndefOr[ImageSourcePropType]]] = js.undefined
  var backgroundImageStyle: js.UndefOr[RecursivePartial[js.UndefOr[ImageStyle]]] = js.undefined
  var barStyle: js.UndefOr[RecursivePartial[js.UndefOr[StatusBarStyle]]] = js.undefined
  var centerComponent: js.UndefOr[RecursivePartial[js.UndefOr[HeaderSubComponent]]] = js.undefined
  var centerContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var collapsable: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var hasTVPreferredFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var hitSlop: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.undefined
  var importantForAccessibility: js.UndefOr[RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.undefined
  var isTVSelectable: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var leftComponent: js.UndefOr[RecursivePartial[js.UndefOr[HeaderSubComponent]]] = js.undefined
  var leftContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var linearGradientProps: js.UndefOr[RecursivePartial[js.UndefOr[js.Object]]] = js.undefined
  var nativeID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var needsOffscreenAlphaCompositing: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var onAccessibilityAction: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]
  ] = js.undefined
  var onAccessibilityEscape: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onAccessibilityTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onLayout: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.undefined
  var onMagicTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onMoveShouldSetResponder: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]
  ] = js.undefined
  var onMoveShouldSetResponderCapture: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]
  ] = js.undefined
  var onResponderEnd: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  var onResponderGrant: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  var onResponderMove: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  var onResponderReject: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  var onResponderRelease: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  var onResponderStart: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  var onResponderTerminate: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  var onResponderTerminationRequest: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]
  ] = js.undefined
  var onStartShouldSetResponder: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]
  ] = js.undefined
  var onStartShouldSetResponderCapture: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]
  ] = js.undefined
  var onTouchCancel: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  var onTouchEnd: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  var onTouchEndCapture: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  var onTouchMove: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  var onTouchStart: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  var placement: js.UndefOr[RecursivePartial[js.UndefOr[left | center | right]]] = js.undefined
  var pointerEvents: js.UndefOr[RecursivePartial[js.UndefOr[`box-none` | none | `box-only` | auto]]] = js.undefined
  var removeClippedSubviews: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var renderToHardwareTextureAndroid: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var rightComponent: js.UndefOr[RecursivePartial[js.UndefOr[HeaderSubComponent]]] = js.undefined
  var rightContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var shouldRasterizeIOS: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var statusBarProps: js.UndefOr[RecursivePartial[js.UndefOr[StatusBarProperties]]] = js.undefined
  var style: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var testID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var tvParallaxMagnification: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var tvParallaxProperties: js.UndefOr[RecursivePartial[js.UndefOr[TVParallaxProperties]]] = js.undefined
  var tvParallaxShiftDistanceX: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var tvParallaxShiftDistanceY: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var tvParallaxTiltAngle: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
}

object RecursivePartialPartialHe {
  @scala.inline
  def apply(
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
    accessibilityValue: RecursivePartial[js.UndefOr[AccessibilityValue]] = null,
    accessibilityViewIsModal: RecursivePartial[js.UndefOr[Boolean]] = null,
    accessible: RecursivePartial[js.UndefOr[Boolean]] = null,
    backgroundColor: RecursivePartial[js.UndefOr[String]] = null,
    backgroundImage: RecursivePartial[js.UndefOr[ImageSourcePropType]] = null,
    backgroundImageStyle: RecursivePartial[js.UndefOr[ImageStyle]] = null,
    barStyle: RecursivePartial[js.UndefOr[StatusBarStyle]] = null,
    centerComponent: RecursivePartial[js.UndefOr[HeaderSubComponent]] = null,
    centerContainerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    collapsable: RecursivePartial[js.UndefOr[Boolean]] = null,
    containerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    hasTVPreferredFocus: RecursivePartial[js.UndefOr[Boolean]] = null,
    hitSlop: RecursivePartial[js.UndefOr[Insets]] = null,
    importantForAccessibility: RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]] = null,
    isTVSelectable: RecursivePartial[js.UndefOr[Boolean]] = null,
    leftComponent: RecursivePartial[js.UndefOr[HeaderSubComponent]] = null,
    leftContainerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    linearGradientProps: RecursivePartial[js.UndefOr[js.Object]] = null,
    nativeID: RecursivePartial[js.UndefOr[String]] = null,
    needsOffscreenAlphaCompositing: RecursivePartial[js.UndefOr[Boolean]] = null,
    onAccessibilityAction: RecursivePartial[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]] = null,
    onAccessibilityEscape: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onAccessibilityTap: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onLayout: RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]] = null,
    onMagicTap: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onMoveShouldSetResponder: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]] = null,
    onMoveShouldSetResponderCapture: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]] = null,
    onResponderEnd: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onResponderGrant: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onResponderMove: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onResponderReject: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onResponderRelease: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onResponderStart: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onResponderTerminate: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onResponderTerminationRequest: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]] = null,
    onStartShouldSetResponder: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]] = null,
    onStartShouldSetResponderCapture: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]] = null,
    onTouchCancel: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onTouchEnd: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onTouchEndCapture: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onTouchMove: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onTouchStart: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    placement: RecursivePartial[js.UndefOr[left | center | right]] = null,
    pointerEvents: RecursivePartial[js.UndefOr[`box-none` | none | `box-only` | auto]] = null,
    removeClippedSubviews: RecursivePartial[js.UndefOr[Boolean]] = null,
    renderToHardwareTextureAndroid: RecursivePartial[js.UndefOr[Boolean]] = null,
    rightComponent: RecursivePartial[js.UndefOr[HeaderSubComponent]] = null,
    rightContainerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    shouldRasterizeIOS: RecursivePartial[js.UndefOr[Boolean]] = null,
    statusBarProps: RecursivePartial[js.UndefOr[StatusBarProperties]] = null,
    style: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    testID: RecursivePartial[js.UndefOr[String]] = null,
    tvParallaxMagnification: RecursivePartial[js.UndefOr[Double]] = null,
    tvParallaxProperties: RecursivePartial[js.UndefOr[TVParallaxProperties]] = null,
    tvParallaxShiftDistanceX: RecursivePartial[js.UndefOr[Double]] = null,
    tvParallaxShiftDistanceY: RecursivePartial[js.UndefOr[Double]] = null,
    tvParallaxTiltAngle: RecursivePartial[js.UndefOr[Double]] = null
  ): RecursivePartialPartialHe = {
    val __obj = js.Dynamic.literal()
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
    if (accessibilityValue != null) __obj.updateDynamic("accessibilityValue")(accessibilityValue.asInstanceOf[js.Any])
    if (accessibilityViewIsModal != null) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.asInstanceOf[js.Any])
    if (accessible != null) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundImage != null) __obj.updateDynamic("backgroundImage")(backgroundImage.asInstanceOf[js.Any])
    if (backgroundImageStyle != null) __obj.updateDynamic("backgroundImageStyle")(backgroundImageStyle.asInstanceOf[js.Any])
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (centerComponent != null) __obj.updateDynamic("centerComponent")(centerComponent.asInstanceOf[js.Any])
    if (centerContainerStyle != null) __obj.updateDynamic("centerContainerStyle")(centerContainerStyle.asInstanceOf[js.Any])
    if (collapsable != null) __obj.updateDynamic("collapsable")(collapsable.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (hasTVPreferredFocus != null) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (isTVSelectable != null) __obj.updateDynamic("isTVSelectable")(isTVSelectable.asInstanceOf[js.Any])
    if (leftComponent != null) __obj.updateDynamic("leftComponent")(leftComponent.asInstanceOf[js.Any])
    if (leftContainerStyle != null) __obj.updateDynamic("leftContainerStyle")(leftContainerStyle.asInstanceOf[js.Any])
    if (linearGradientProps != null) __obj.updateDynamic("linearGradientProps")(linearGradientProps.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (needsOffscreenAlphaCompositing != null) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(onAccessibilityAction.asInstanceOf[js.Any])
    if (onAccessibilityEscape != null) __obj.updateDynamic("onAccessibilityEscape")(onAccessibilityEscape.asInstanceOf[js.Any])
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(onAccessibilityTap.asInstanceOf[js.Any])
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout.asInstanceOf[js.Any])
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(onMagicTap.asInstanceOf[js.Any])
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(onMoveShouldSetResponder.asInstanceOf[js.Any])
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(onMoveShouldSetResponderCapture.asInstanceOf[js.Any])
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(onResponderEnd.asInstanceOf[js.Any])
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(onResponderGrant.asInstanceOf[js.Any])
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(onResponderMove.asInstanceOf[js.Any])
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(onResponderReject.asInstanceOf[js.Any])
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(onResponderRelease.asInstanceOf[js.Any])
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(onResponderStart.asInstanceOf[js.Any])
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(onResponderTerminate.asInstanceOf[js.Any])
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(onResponderTerminationRequest.asInstanceOf[js.Any])
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(onStartShouldSetResponder.asInstanceOf[js.Any])
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(onStartShouldSetResponderCapture.asInstanceOf[js.Any])
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel.asInstanceOf[js.Any])
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd.asInstanceOf[js.Any])
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(onTouchEndCapture.asInstanceOf[js.Any])
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove.asInstanceOf[js.Any])
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (removeClippedSubviews != null) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (renderToHardwareTextureAndroid != null) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.asInstanceOf[js.Any])
    if (rightComponent != null) __obj.updateDynamic("rightComponent")(rightComponent.asInstanceOf[js.Any])
    if (rightContainerStyle != null) __obj.updateDynamic("rightContainerStyle")(rightContainerStyle.asInstanceOf[js.Any])
    if (shouldRasterizeIOS != null) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.asInstanceOf[js.Any])
    if (statusBarProps != null) __obj.updateDynamic("statusBarProps")(statusBarProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecursivePartialPartialHe]
  }
}

