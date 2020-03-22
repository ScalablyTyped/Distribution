package typings.reactNavigationStack.vendorTypesMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNavigationStack.AnonBottom
import typings.reactNavigationStack.AnonClose
import typings.reactNavigationStack.AnonHorizontal
import typings.reactNavigationStack.AnonStyle
import typings.reactNavigationStack.AnonTintColor
import typings.reactNavigationStack.AnonTintColorString
import typings.reactNavigationStack.reactNavigationStackStrings.center
import typings.reactNavigationStack.reactNavigationStackStrings.left
import typings.reactNavigationStack.reactNavigationStackStrings.pop
import typings.reactNavigationStack.reactNavigationStackStrings.push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackHeaderOptions & std.Partial<react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.TransitionPreset> & {  title ? :string, header ? (props : react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackHeaderProps): react.react.ReactNode,   headerShown ? :boolean,   cardShadowEnabled ? :boolean,   cardOverlayEnabled ? :boolean,   cardStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   animationEnabled ? :boolean,   animationTypeForReplace ? :'push' | 'pop',   gestureEnabled ? :boolean,   gestureResponseDistance ? :{  vertical ? :number,   horizontal ? :number},   gestureVelocityImpact ? :number,   safeAreaInsets ? :{  top ? :number,   right ? :number,   bottom ? :number,   left ? :number}, onTransitionStart ? (props : react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.TransitionCallbackProps): void, onTransitionEnd ? (props : react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.TransitionCallbackProps): void} */
trait StackNavigationOptions extends js.Object {
  /**
    * Whether transition animation should be enabled the screen.
    * If you set it to `false`, the screen won't animate when pushing or popping. Defaults to `true`.
    */
  var animationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The type of animation to use when this screen replaces another screen. Defaults to `push`.
    * When `pop` is used, the `pop` animation is applied to the screen being replaced.
    */
  var animationTypeForReplace: js.UndefOr[push | pop] = js.undefined
  /**
    * Whether to have a semi-transparent dark overlay visible under the card during transitions.
    * Defaults to `true` on Android and `false` on iOS.
    */
  var cardOverlayEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether a shadow is visible for the card during transitions. Defaults to `true`.
    */
  var cardShadowEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Style object for the card in stack.
    * You can provide a custom background color to use instead of the default background here.
    *
    * You can also specify `{ backgroundColor: 'transparent' }` to make the previous screen visible underneath.
    * This is useful to implement things like modal dialogs.
    * If you use [`react-native-screens`](https://github.com/kmagiera/react-native-screens), you should also specify `mode: 'modal'`
    * in the stack view config when using a transparent background so previous screens aren't detached.
    */
  var cardStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var cardStyleInterpolator: js.UndefOr[StackCardStyleInterpolator] = js.undefined
  var gestureDirection: js.UndefOr[GestureDirection] = js.undefined
  /**
    * Whether you can use gestures to dismiss this screen. Defaults to `true` on iOS, `false` on Android.
    */
  var gestureEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Object to override the distance of touch start from the edge of the screen to recognize gestures.
    */
  var gestureResponseDistance: js.UndefOr[AnonHorizontal] = js.undefined
  /**
    * Number which determines the relevance of velocity for the gesture.
    * Defaults to 0.3.
    */
  var gestureVelocityImpact: js.UndefOr[Double] = js.undefined
  /**
    * Function that given `HeaderProps` returns a React Element to display as a header.
    */
  var header: js.UndefOr[js.Function1[/* props */ StackHeaderProps, ReactNode]] = js.undefined
  /**
    * Whether back button title font should scale to respect Text Size accessibility settings. Defaults to `false`.
    */
  var headerBackAllowFontScaling: js.UndefOr[Boolean] = js.undefined
  /**
    * Function which returns a React Element to display custom image in header's back button.
    * It receives the `tintColor` in in the options object as an argument. object.
    * Defaults to Image component with a the default back icon image for the platform (a chevron on iOS and an arrow on Android).
    */
  var headerBackImage: js.UndefOr[js.Function1[/* props */ AnonTintColorString, ReactNode]] = js.undefined
  /**
    * Title string used by the back button on iOS, or `null` to disable label. Defaults to the previous scene's `headerTitle`.
    */
  var headerBackTitle: js.UndefOr[String] = js.undefined
  /**
    * Style object for the back title.
    */
  var headerBackTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * A reasonable default is supplied for whether the back button title should be visible or not.
    * But if you want to override that you can use `true` or `false` in this option.
    */
  var headerBackTitleVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Function which returns a React Element to render as the background of the header.
    * This is useful for using backgrounds such as an image or a gradient.
    * You can use this with `headerTransparent` to render a blur view, for example, to create a translucent header.
    */
  var headerBackground: js.UndefOr[js.Function1[/* props */ AnonStyle, ReactNode]] = js.undefined
  /**
    * Function which returns a React Element to display on the left side of the header.
    * It receives a number of arguments when rendered (`onPress`, `label`, `labelStyle` and more.
    */
  var headerLeft: js.UndefOr[js.Function1[/* props */ StackHeaderLeftButtonProps, ReactNode]] = js.undefined
  /**
    * Style object for the container of the `headerLeft` component, for example to add padding.
    */
  var headerLeftContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Color for material ripple (Android >= 5.0 only).
    */
  var headerPressColorAndroid: js.UndefOr[String] = js.undefined
  /**
    * Function which returns a React Element to display on the right side of the header.
    */
  var headerRight: js.UndefOr[js.Function1[/* props */ AnonTintColor, ReactNode]] = js.undefined
  /**
    * Style object for the container of the `headerRight` component, for example to add padding.
    */
  var headerRightContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Whether to show the header. The header is shown by default unless `headerMode` was set to `none`.
    * Setting this to `false` hides the header.
    */
  var headerShown: js.UndefOr[Boolean] = js.undefined
  /**
    * Extra padding to add at the top of header to account for translucent status bar.
    * By default, it uses the top value from the safe area insets of the device.
    * Pass 0 or a custom value to disable the default behaviour, and customize the height.
    */
  var headerStatusBarHeight: js.UndefOr[Double] = js.undefined
  /**
    * Style object for the header. You can specify a custom background color here, for example.
    */
  var headerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var headerStyleInterpolator: js.UndefOr[StackHeaderStyleInterpolator] = js.undefined
  /**
    * Tint color for the header.
    */
  var headerTintColor: js.UndefOr[String] = js.undefined
  /**
    * String or a function that returns a React Element to be used by the header.
    * Defaults to scene `title`.
    * It receives `allowFontScaling`, `onLayout`, `style` and `children` in the options object as an argument.
    * The title string is passed in `children`.
    */
  var headerTitle: js.UndefOr[String | (js.Function1[/* props */ StackHeaderTitleProps, ReactNode])] = js.undefined
  /**
    * How to align the the header title.
    * Defaults to `center` on iOS and `left` on Android.
    */
  var headerTitleAlign: js.UndefOr[left | center] = js.undefined
  /**
    * Whether header title font should scale to respect Text Size accessibility settings. Defaults to `false`.
    */
  var headerTitleAllowFontScaling: js.UndefOr[Boolean] = js.undefined
  /**
    * Style object for the container of the `headerTitle` component, for example to add padding.
    * By default, `headerTitleContainerStyle` is with an absolute position style and offsets both `left` and `right`.
    * This may lead to white space or overlap between `headerLeft` and `headerTitle` if a customized `headerLeft` is used.
    * It can be solved by adjusting `left` and `right` style in `headerTitleContainerStyle` and `marginHorizontal` in `headerTitleStyle`.
    */
  var headerTitleContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Style object for the title component.
    */
  var headerTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Defaults to `false`. If `true`, the header will not have a background unless you explicitly provide it with `headerBackground`.
    * The header will also float over the screen so that it overlaps the content underneath.
    * This is useful if you want to render a semi-transparent header or a blurred background.
    */
  var headerTransparent: js.UndefOr[Boolean] = js.undefined
  /**
    * Title string used by the back button when `headerBackTitle` doesn't fit on the screen. `"Back"` by default.
    */
  var headerTruncatedBackTitle: js.UndefOr[String] = js.undefined
  var onTransitionEnd: js.UndefOr[js.Function1[/* props */ TransitionCallbackProps, Unit]] = js.undefined
  var onTransitionStart: js.UndefOr[js.Function1[/* props */ TransitionCallbackProps, Unit]] = js.undefined
  /**
    * Safe area insets for the screen. This is used to avoid elements like notch and status bar.
    * By default, the device's safe area insets are automatically detected. You can override the behavior with this option.
    * For example, to remove the extra spacing for status bar, pass `safeAreaInsets: { top: 0 }`.
    */
  var safeAreaInsets: js.UndefOr[AnonBottom] = js.undefined
  /**
    * String that can be displayed in the header as a fallback for `headerTitle`.
    */
  var title: js.UndefOr[String] = js.undefined
  var transitionSpec: js.UndefOr[AnonClose] = js.undefined
}

object StackNavigationOptions {
  @scala.inline
  def apply(
    animationEnabled: js.UndefOr[Boolean] = js.undefined,
    animationTypeForReplace: push | pop = null,
    cardOverlayEnabled: js.UndefOr[Boolean] = js.undefined,
    cardShadowEnabled: js.UndefOr[Boolean] = js.undefined,
    cardStyle: StyleProp[ViewStyle] = null,
    cardStyleInterpolator: /* props */ StackCardInterpolationProps => StackCardInterpolatedStyle = null,
    gestureDirection: GestureDirection = null,
    gestureEnabled: js.UndefOr[Boolean] = js.undefined,
    gestureResponseDistance: AnonHorizontal = null,
    gestureVelocityImpact: Int | Double = null,
    header: /* props */ StackHeaderProps => ReactNode = null,
    headerBackAllowFontScaling: js.UndefOr[Boolean] = js.undefined,
    headerBackImage: /* props */ AnonTintColorString => ReactNode = null,
    headerBackTitle: String = null,
    headerBackTitleStyle: StyleProp[TextStyle] = null,
    headerBackTitleVisible: js.UndefOr[Boolean] = js.undefined,
    headerBackground: /* props */ AnonStyle => ReactNode = null,
    headerLeft: /* props */ StackHeaderLeftButtonProps => ReactNode = null,
    headerLeftContainerStyle: StyleProp[ViewStyle] = null,
    headerPressColorAndroid: String = null,
    headerRight: /* props */ AnonTintColor => ReactNode = null,
    headerRightContainerStyle: StyleProp[ViewStyle] = null,
    headerShown: js.UndefOr[Boolean] = js.undefined,
    headerStatusBarHeight: Int | Double = null,
    headerStyle: StyleProp[ViewStyle] = null,
    headerStyleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle = null,
    headerTintColor: String = null,
    headerTitle: String | (js.Function1[/* props */ StackHeaderTitleProps, ReactNode]) = null,
    headerTitleAlign: left | center = null,
    headerTitleAllowFontScaling: js.UndefOr[Boolean] = js.undefined,
    headerTitleContainerStyle: StyleProp[ViewStyle] = null,
    headerTitleStyle: StyleProp[TextStyle] = null,
    headerTransparent: js.UndefOr[Boolean] = js.undefined,
    headerTruncatedBackTitle: String = null,
    onTransitionEnd: /* props */ TransitionCallbackProps => Unit = null,
    onTransitionStart: /* props */ TransitionCallbackProps => Unit = null,
    safeAreaInsets: AnonBottom = null,
    title: String = null,
    transitionSpec: AnonClose = null
  ): StackNavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animationEnabled)) __obj.updateDynamic("animationEnabled")(animationEnabled.asInstanceOf[js.Any])
    if (animationTypeForReplace != null) __obj.updateDynamic("animationTypeForReplace")(animationTypeForReplace.asInstanceOf[js.Any])
    if (!js.isUndefined(cardOverlayEnabled)) __obj.updateDynamic("cardOverlayEnabled")(cardOverlayEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(cardShadowEnabled)) __obj.updateDynamic("cardShadowEnabled")(cardShadowEnabled.asInstanceOf[js.Any])
    if (cardStyle != null) __obj.updateDynamic("cardStyle")(cardStyle.asInstanceOf[js.Any])
    if (cardStyleInterpolator != null) __obj.updateDynamic("cardStyleInterpolator")(js.Any.fromFunction1(cardStyleInterpolator))
    if (gestureDirection != null) __obj.updateDynamic("gestureDirection")(gestureDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(gestureEnabled)) __obj.updateDynamic("gestureEnabled")(gestureEnabled.asInstanceOf[js.Any])
    if (gestureResponseDistance != null) __obj.updateDynamic("gestureResponseDistance")(gestureResponseDistance.asInstanceOf[js.Any])
    if (gestureVelocityImpact != null) __obj.updateDynamic("gestureVelocityImpact")(gestureVelocityImpact.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(js.Any.fromFunction1(header))
    if (!js.isUndefined(headerBackAllowFontScaling)) __obj.updateDynamic("headerBackAllowFontScaling")(headerBackAllowFontScaling.asInstanceOf[js.Any])
    if (headerBackImage != null) __obj.updateDynamic("headerBackImage")(js.Any.fromFunction1(headerBackImage))
    if (headerBackTitle != null) __obj.updateDynamic("headerBackTitle")(headerBackTitle.asInstanceOf[js.Any])
    if (headerBackTitleStyle != null) __obj.updateDynamic("headerBackTitleStyle")(headerBackTitleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerBackTitleVisible)) __obj.updateDynamic("headerBackTitleVisible")(headerBackTitleVisible.asInstanceOf[js.Any])
    if (headerBackground != null) __obj.updateDynamic("headerBackground")(js.Any.fromFunction1(headerBackground))
    if (headerLeft != null) __obj.updateDynamic("headerLeft")(js.Any.fromFunction1(headerLeft))
    if (headerLeftContainerStyle != null) __obj.updateDynamic("headerLeftContainerStyle")(headerLeftContainerStyle.asInstanceOf[js.Any])
    if (headerPressColorAndroid != null) __obj.updateDynamic("headerPressColorAndroid")(headerPressColorAndroid.asInstanceOf[js.Any])
    if (headerRight != null) __obj.updateDynamic("headerRight")(js.Any.fromFunction1(headerRight))
    if (headerRightContainerStyle != null) __obj.updateDynamic("headerRightContainerStyle")(headerRightContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerShown)) __obj.updateDynamic("headerShown")(headerShown.asInstanceOf[js.Any])
    if (headerStatusBarHeight != null) __obj.updateDynamic("headerStatusBarHeight")(headerStatusBarHeight.asInstanceOf[js.Any])
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (headerStyleInterpolator != null) __obj.updateDynamic("headerStyleInterpolator")(js.Any.fromFunction1(headerStyleInterpolator))
    if (headerTintColor != null) __obj.updateDynamic("headerTintColor")(headerTintColor.asInstanceOf[js.Any])
    if (headerTitle != null) __obj.updateDynamic("headerTitle")(headerTitle.asInstanceOf[js.Any])
    if (headerTitleAlign != null) __obj.updateDynamic("headerTitleAlign")(headerTitleAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(headerTitleAllowFontScaling)) __obj.updateDynamic("headerTitleAllowFontScaling")(headerTitleAllowFontScaling.asInstanceOf[js.Any])
    if (headerTitleContainerStyle != null) __obj.updateDynamic("headerTitleContainerStyle")(headerTitleContainerStyle.asInstanceOf[js.Any])
    if (headerTitleStyle != null) __obj.updateDynamic("headerTitleStyle")(headerTitleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerTransparent)) __obj.updateDynamic("headerTransparent")(headerTransparent.asInstanceOf[js.Any])
    if (headerTruncatedBackTitle != null) __obj.updateDynamic("headerTruncatedBackTitle")(headerTruncatedBackTitle.asInstanceOf[js.Any])
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction1(onTransitionStart))
    if (safeAreaInsets != null) __obj.updateDynamic("safeAreaInsets")(safeAreaInsets.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionSpec != null) __obj.updateDynamic("transitionSpec")(transitionSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackNavigationOptions]
  }
}

