package typings.reactNavigationStack.headerSegmentMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigationStack.anon.Style
import typings.reactNavigationStack.anon.TintColor
import typings.reactNavigationStack.anon.TintColorString
import typings.reactNavigationStack.reactNavigationStackStrings.center
import typings.reactNavigationStack.reactNavigationStackStrings.left
import typings.reactNavigationStack.vendorTypesMod.Layout
import typings.reactNavigationStack.vendorTypesMod.Scene
import typings.reactNavigationStack.vendorTypesMod.StackHeaderLeftButtonProps
import typings.reactNavigationStack.vendorTypesMod.StackHeaderStyleInterpolator
import typings.reactNavigationStack.vendorTypesMod.StackHeaderTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackHeaderOptions & {headerTitle (props : react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackHeaderTitleProps): react.react.ReactNode,   layout  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Layout,   insets  :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EdgeInsets * / any, onGoBack ? (): void,   title ? :string,   leftLabel ? :string,   scene  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Scene<react-navigation.react-navigation.NavigationRoute<react-navigation.react-navigation.NavigationParams>>,   styleInterpolator  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackHeaderStyleInterpolator} */
@js.native
trait Props extends js.Object {
  /**
    * Whether back button title font should scale to respect Text Size accessibility settings. Defaults to `false`.
    */
  var headerBackAllowFontScaling: js.UndefOr[Boolean] = js.native
  /**
    * Function which returns a React Element to display custom image in header's back button.
    * It receives the `tintColor` in in the options object as an argument. object.
    * Defaults to Image component with a the default back icon image for the platform (a chevron on iOS and an arrow on Android).
    */
  var headerBackImage: js.UndefOr[js.Function1[/* props */ TintColorString, ReactNode]] = js.native
  /**
    * Title string used by the back button on iOS, or `null` to disable label. Defaults to the previous scene's `headerTitle`.
    */
  var headerBackTitle: js.UndefOr[String] = js.native
  /**
    * Style object for the back title.
    */
  var headerBackTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * A reasonable default is supplied for whether the back button title should be visible or not.
    * But if you want to override that you can use `true` or `false` in this option.
    */
  var headerBackTitleVisible: js.UndefOr[Boolean] = js.native
  /**
    * Function which returns a React Element to render as the background of the header.
    * This is useful for using backgrounds such as an image or a gradient.
    * You can use this with `headerTransparent` to render a blur view, for example, to create a translucent header.
    */
  var headerBackground: js.UndefOr[js.Function1[/* props */ Style, ReactNode]] = js.native
  /**
    * Function which returns a React Element to display on the left side of the header.
    * It receives a number of arguments when rendered (`onPress`, `label`, `labelStyle` and more.
    */
  var headerLeft: js.UndefOr[js.Function1[/* props */ StackHeaderLeftButtonProps, ReactNode]] = js.native
  /**
    * Style object for the container of the `headerLeft` component, for example to add padding.
    */
  var headerLeftContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Color for material ripple (Android >= 5.0 only).
    */
  var headerPressColorAndroid: js.UndefOr[String] = js.native
  /**
    * Function which returns a React Element to display on the right side of the header.
    */
  var headerRight: js.UndefOr[js.Function1[/* props */ TintColor, ReactNode]] = js.native
  /**
    * Style object for the container of the `headerRight` component, for example to add padding.
    */
  var headerRightContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Extra padding to add at the top of header to account for translucent status bar.
    * By default, it uses the top value from the safe area insets of the device.
    * Pass 0 or a custom value to disable the default behaviour, and customize the height.
    */
  var headerStatusBarHeight: js.UndefOr[Double] = js.native
  /**
    * Style object for the header. You can specify a custom background color here, for example.
    */
  var headerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Tint color for the header.
    */
  var headerTintColor: js.UndefOr[String] = js.native
  /**
    * String or a function that returns a React Element to be used by the header.
    * Defaults to scene `title`.
    * It receives `allowFontScaling`, `onLayout`, `style` and `children` in the options object as an argument.
    * The title string is passed in `children`.
    */
  var headerTitle: js.UndefOr[String | (js.Function1[/* props */ StackHeaderTitleProps, ReactNode])] = js.native
  /**
    * How to align the the header title.
    * Defaults to `center` on iOS and `left` on Android.
    */
  var headerTitleAlign: js.UndefOr[left | center] = js.native
  /**
    * Whether header title font should scale to respect Text Size accessibility settings. Defaults to `false`.
    */
  var headerTitleAllowFontScaling: js.UndefOr[Boolean] = js.native
  /**
    * Style object for the container of the `headerTitle` component, for example to add padding.
    * By default, `headerTitleContainerStyle` is with an absolute position style and offsets both `left` and `right`.
    * This may lead to white space or overlap between `headerLeft` and `headerTitle` if a customized `headerLeft` is used.
    * It can be solved by adjusting `left` and `right` style in `headerTitleContainerStyle` and `marginHorizontal` in `headerTitleStyle`.
    */
  var headerTitleContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Style object for the title component.
    */
  var headerTitleStyle: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react-native.react-native.Animated.AnimatedComponent<new (): react-native.react-native.Text>>['style'] */ js.Any
  ] = js.native
  /**
    * Defaults to `false`. If `true`, the header will not have a background unless you explicitly provide it with `headerBackground`.
    * The header will also float over the screen so that it overlaps the content underneath.
    * This is useful if you want to render a semi-transparent header or a blurred background.
    */
  var headerTransparent: js.UndefOr[Boolean] = js.native
  /**
    * Title string used by the back button when `headerBackTitle` doesn't fit on the screen. `"Back"` by default.
    */
  var headerTruncatedBackTitle: js.UndefOr[String] = js.native
  var insets: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EdgeInsets */ js.Any = js.native
  var layout: Layout = js.native
  var leftLabel: js.UndefOr[String] = js.native
  var onGoBack: js.UndefOr[js.Function0[Unit]] = js.native
  var scene: Scene[NavigationRoute[NavigationParams]] = js.native
  var styleInterpolator: StackHeaderStyleInterpolator = js.native
  var title: js.UndefOr[String] = js.native
  def headerTitle(props: StackHeaderTitleProps): ReactNode = js.native
}

