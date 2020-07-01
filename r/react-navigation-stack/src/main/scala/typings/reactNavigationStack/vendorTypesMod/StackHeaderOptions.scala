package typings.reactNavigationStack.vendorTypesMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.WithAnimatedValue
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNavigationStack.anon.Style
import typings.reactNavigationStack.anon.TintColor
import typings.reactNavigationStack.anon.TintColorString
import typings.reactNavigationStack.reactNavigationStackStrings.center
import typings.reactNavigationStack.reactNavigationStackStrings.left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackHeaderOptions extends js.Object {
  /**
    * Whether back button title font should scale to respect Text Size accessibility settings. Defaults to `false`.
    */
  var headerBackAllowFontScaling: js.UndefOr[Boolean] = js.undefined
  /**
    * Function which returns a React Element to display custom image in header's back button.
    * It receives the `tintColor` in in the options object as an argument. object.
    * Defaults to Image component with a the default back icon image for the platform (a chevron on iOS and an arrow on Android).
    */
  var headerBackImage: js.UndefOr[js.Function1[/* props */ TintColorString, ReactNode]] = js.undefined
  /**
    * Title string used by the back button on iOS. Defaults to the previous scene's `headerTitle`.
    * Use `headerBackTitleVisible: false` to hide it.
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
  var headerBackground: js.UndefOr[js.Function1[/* props */ Style, ReactNode]] = js.undefined
  /**
    * Function which returns a React Element to display on the left side of the header.
    * It receives a number of arguments when rendered (`onPress`, `label`, `labelStyle` and more.
    */
  var headerLeft: js.UndefOr[js.Function1[/* props */ StackHeaderLeftButtonProps, ReactNode]] = js.undefined
  /**
    * Style object for the container of the `headerLeft` component, for example to add padding.
    */
  var headerLeftContainerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.undefined
  /**
    * Color for material ripple (Android >= 5.0 only).
    */
  var headerPressColorAndroid: js.UndefOr[String] = js.undefined
  /**
    * Function which returns a React Element to display on the right side of the header.
    */
  var headerRight: js.UndefOr[js.Function1[/* props */ TintColor, ReactNode]] = js.undefined
  /**
    * Style object for the container of the `headerRight` component, for example to add padding.
    */
  var headerRightContainerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.undefined
  /**
    * Extra padding to add at the top of header to account for translucent status bar.
    * By default, it uses the top value from the safe area insets of the device.
    * Pass 0 or a custom value to disable the default behaviour, and customize the height.
    */
  var headerStatusBarHeight: js.UndefOr[Double] = js.undefined
  /**
    * Style object for the header. You can specify a custom background color here, for example.
    */
  var headerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.undefined
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
  var headerTitleContainerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.undefined
  /**
    * Style object for the title component.
    */
  var headerTitleStyle: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react-native.react-native.Animated.AnimatedComponent<new (): react-native.react-native.Text>>['style'] */ js.Any
  ] = js.undefined
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
}

object StackHeaderOptions {
  @scala.inline
  def apply(
    headerBackAllowFontScaling: js.UndefOr[Boolean] = js.undefined,
    headerBackImage: /* props */ TintColorString => ReactNode = null,
    headerBackTitle: String = null,
    headerBackTitleStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    headerBackTitleVisible: js.UndefOr[Boolean] = js.undefined,
    headerBackground: /* props */ Style => ReactNode = null,
    headerLeft: /* props */ StackHeaderLeftButtonProps => ReactNode = null,
    headerLeftContainerStyle: WithAnimatedValue[StyleProp[ViewStyle]] = null,
    headerPressColorAndroid: String = null,
    headerRight: /* props */ TintColor => ReactNode = null,
    headerRightContainerStyle: WithAnimatedValue[StyleProp[ViewStyle]] = null,
    headerStatusBarHeight: js.UndefOr[Double] = js.undefined,
    headerStyle: WithAnimatedValue[StyleProp[ViewStyle]] = null,
    headerTintColor: String = null,
    headerTitle: String | (js.Function1[/* props */ StackHeaderTitleProps, ReactNode]) = null,
    headerTitleAlign: left | center = null,
    headerTitleAllowFontScaling: js.UndefOr[Boolean] = js.undefined,
    headerTitleContainerStyle: WithAnimatedValue[StyleProp[ViewStyle]] = null,
    headerTitleStyle: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react-native.react-native.Animated.AnimatedComponent<new (): react-native.react-native.Text>>['style'] */ js.Any = null,
    headerTransparent: js.UndefOr[Boolean] = js.undefined,
    headerTruncatedBackTitle: String = null
  ): StackHeaderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(headerBackAllowFontScaling)) __obj.updateDynamic("headerBackAllowFontScaling")(headerBackAllowFontScaling.get.asInstanceOf[js.Any])
    if (headerBackImage != null) __obj.updateDynamic("headerBackImage")(js.Any.fromFunction1(headerBackImage))
    if (headerBackTitle != null) __obj.updateDynamic("headerBackTitle")(headerBackTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerBackTitleStyle)) __obj.updateDynamic("headerBackTitleStyle")(headerBackTitleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerBackTitleVisible)) __obj.updateDynamic("headerBackTitleVisible")(headerBackTitleVisible.get.asInstanceOf[js.Any])
    if (headerBackground != null) __obj.updateDynamic("headerBackground")(js.Any.fromFunction1(headerBackground))
    if (headerLeft != null) __obj.updateDynamic("headerLeft")(js.Any.fromFunction1(headerLeft))
    if (headerLeftContainerStyle != null) __obj.updateDynamic("headerLeftContainerStyle")(headerLeftContainerStyle.asInstanceOf[js.Any])
    if (headerPressColorAndroid != null) __obj.updateDynamic("headerPressColorAndroid")(headerPressColorAndroid.asInstanceOf[js.Any])
    if (headerRight != null) __obj.updateDynamic("headerRight")(js.Any.fromFunction1(headerRight))
    if (headerRightContainerStyle != null) __obj.updateDynamic("headerRightContainerStyle")(headerRightContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerStatusBarHeight)) __obj.updateDynamic("headerStatusBarHeight")(headerStatusBarHeight.get.asInstanceOf[js.Any])
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (headerTintColor != null) __obj.updateDynamic("headerTintColor")(headerTintColor.asInstanceOf[js.Any])
    if (headerTitle != null) __obj.updateDynamic("headerTitle")(headerTitle.asInstanceOf[js.Any])
    if (headerTitleAlign != null) __obj.updateDynamic("headerTitleAlign")(headerTitleAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(headerTitleAllowFontScaling)) __obj.updateDynamic("headerTitleAllowFontScaling")(headerTitleAllowFontScaling.get.asInstanceOf[js.Any])
    if (headerTitleContainerStyle != null) __obj.updateDynamic("headerTitleContainerStyle")(headerTitleContainerStyle.asInstanceOf[js.Any])
    if (headerTitleStyle != null) __obj.updateDynamic("headerTitleStyle")(headerTitleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerTransparent)) __obj.updateDynamic("headerTransparent")(headerTransparent.get.asInstanceOf[js.Any])
    if (headerTruncatedBackTitle != null) __obj.updateDynamic("headerTruncatedBackTitle")(headerTruncatedBackTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackHeaderOptions]
  }
}

