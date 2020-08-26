package typings.reactNavigationStack.vendorTypesMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.WithAnimatedValue
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNavigationStack.anon.Bottom
import typings.reactNavigationStack.anon.Close
import typings.reactNavigationStack.anon.Horizontal
import typings.reactNavigationStack.anon.Style
import typings.reactNavigationStack.anon.TintColor
import typings.reactNavigationStack.anon.TintColorString
import typings.reactNavigationStack.reactNavigationStackStrings.center
import typings.reactNavigationStack.reactNavigationStackStrings.left
import typings.reactNavigationStack.reactNavigationStackStrings.pop
import typings.reactNavigationStack.reactNavigationStackStrings.push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackHeaderOptions & std.Partial<react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.TransitionPreset> & {  title :string | undefined,   header :(props : react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackHeaderProps): react.react.ReactNode | undefined,   headerShown :boolean | undefined,   cardShadowEnabled :boolean | undefined,   cardOverlayEnabled :boolean | undefined,   cardOverlay :(props : {  style :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>}): react.react.ReactNode | undefined,   cardStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   animationEnabled :boolean | undefined,   animationTypeForReplace :'push' | 'pop' | undefined,   gestureEnabled :boolean | undefined,   gestureResponseDistance :{  vertical :number | undefined,   horizontal :number | undefined} | undefined,   gestureVelocityImpact :number | undefined,   safeAreaInsets :{  top :number | undefined,   right :number | undefined,   bottom :number | undefined,   left :number | undefined} | undefined,   onTransitionStart :(props : react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.TransitionCallbackProps): void | undefined,   onTransitionEnd :(props : react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.TransitionCallbackProps): void | undefined} */
@js.native
trait StackNavigationOptions extends js.Object {
  /**
    * Whether transition animation should be enabled the screen.
    * If you set it to `false`, the screen won't animate when pushing or popping.
    * Defaults to `true` on Android and iOS, `false` on Web.
    */
  var animationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The type of animation to use when this screen replaces another screen. Defaults to `push`.
    * When `pop` is used, the `pop` animation is applied to the screen being replaced.
    */
  var animationTypeForReplace: js.UndefOr[push | pop] = js.native
  /**
    * Function that returns a React Element to display as a overlay for the card.
    */
  var cardOverlay: js.UndefOr[js.Function1[/* props */ Style, ReactNode]] = js.native
  /**
    * Whether to have a semi-transparent dark overlay visible under the card during transitions.
    * Defaults to `true` on Android and `false` on iOS.
    */
  var cardOverlayEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether a shadow is visible for the card during transitions. Defaults to `true`.
    */
  var cardShadowEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Style object for the card in stack.
    * You can provide a custom background color to use instead of the default background here.
    *
    * You can also specify `{ backgroundColor: 'transparent' }` to make the previous screen visible underneath.
    * This is useful to implement things like modal dialogs.
    * If you use [`react-native-screens`](https://github.com/kmagiera/react-native-screens), you should also specify `mode: 'modal'`
    * in the stack view config when using a transparent background so previous screens aren't detached.
    */
  var cardStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var cardStyleInterpolator: js.UndefOr[StackCardStyleInterpolator] = js.native
  var gestureDirection: js.UndefOr[GestureDirection] = js.native
  /**
    * Whether you can use gestures to dismiss this screen. Defaults to `true` on iOS, `false` on Android.
    * Not supported on Web.
    */
  var gestureEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Object to override the distance of touch start from the edge of the screen to recognize gestures.
    * Not supported on Web.
    */
  var gestureResponseDistance: js.UndefOr[Horizontal] = js.native
  /**
    * Number which determines the relevance of velocity for the gesture. Defaults to 0.3.
    * Not supported on Web.
    */
  var gestureVelocityImpact: js.UndefOr[Double] = js.native
  /**
    * Function that given `HeaderProps` returns a React Element to display as a header.
    */
  var header: js.UndefOr[js.Function1[/* props */ StackHeaderProps, ReactNode]] = js.native
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
    * Title string used by the back button on iOS. Defaults to the previous scene's `headerTitle`.
    * Use `headerBackTitleVisible: false` to hide it.
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
  var headerLeftContainerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.native
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
  var headerRightContainerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.native
  /**
    * Whether to show the header. The header is shown by default unless `headerMode` was set to `none`.
    * Setting this to `false` hides the header.
    */
  var headerShown: js.UndefOr[Boolean] = js.native
  /**
    * Extra padding to add at the top of header to account for translucent status bar.
    * By default, it uses the top value from the safe area insets of the device.
    * Pass 0 or a custom value to disable the default behaviour, and customize the height.
    */
  var headerStatusBarHeight: js.UndefOr[Double] = js.native
  /**
    * Style object for the header. You can specify a custom background color here, for example.
    */
  var headerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.native
  var headerStyleInterpolator: js.UndefOr[StackHeaderStyleInterpolator] = js.native
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
  var headerTitleContainerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.native
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
  var onTransitionEnd: js.UndefOr[js.Function1[/* props */ TransitionCallbackProps, Unit]] = js.native
  var onTransitionStart: js.UndefOr[js.Function1[/* props */ TransitionCallbackProps, Unit]] = js.native
  /**
    * Safe area insets for the screen. This is used to avoid elements like notch and status bar.
    * By default, the device's safe area insets are automatically detected. You can override the behavior with this option.
    * For example, to remove the extra spacing for status bar, pass `safeAreaInsets: { top: 0 }`.
    */
  var safeAreaInsets: js.UndefOr[Bottom] = js.native
  /**
    * String that can be displayed in the header as a fallback for `headerTitle`.
    */
  var title: js.UndefOr[String] = js.native
  var transitionSpec: js.UndefOr[Close] = js.native
}

object StackNavigationOptions {
  @scala.inline
  def apply(): StackNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackNavigationOptions]
  }
  @scala.inline
  implicit class StackNavigationOptionsOps[Self <: StackNavigationOptions] (val x: Self) extends AnyVal {
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
    def setAnimationEnabled(value: Boolean): Self = this.set("animationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationEnabled: Self = this.set("animationEnabled", js.undefined)
    @scala.inline
    def setAnimationTypeForReplace(value: push | pop): Self = this.set("animationTypeForReplace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationTypeForReplace: Self = this.set("animationTypeForReplace", js.undefined)
    @scala.inline
    def setCardOverlay(value: /* props */ Style => ReactNode): Self = this.set("cardOverlay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCardOverlay: Self = this.set("cardOverlay", js.undefined)
    @scala.inline
    def setCardOverlayEnabled(value: Boolean): Self = this.set("cardOverlayEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardOverlayEnabled: Self = this.set("cardOverlayEnabled", js.undefined)
    @scala.inline
    def setCardShadowEnabled(value: Boolean): Self = this.set("cardShadowEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardShadowEnabled: Self = this.set("cardShadowEnabled", js.undefined)
    @scala.inline
    def setCardStyle(value: StyleProp[ViewStyle]): Self = this.set("cardStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardStyle: Self = this.set("cardStyle", js.undefined)
    @scala.inline
    def setCardStyleNull: Self = this.set("cardStyle", null)
    @scala.inline
    def setCardStyleInterpolator(value: /* props */ StackCardInterpolationProps => StackCardInterpolatedStyle): Self = this.set("cardStyleInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCardStyleInterpolator: Self = this.set("cardStyleInterpolator", js.undefined)
    @scala.inline
    def setGestureDirection(value: GestureDirection): Self = this.set("gestureDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGestureDirection: Self = this.set("gestureDirection", js.undefined)
    @scala.inline
    def setGestureEnabled(value: Boolean): Self = this.set("gestureEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGestureEnabled: Self = this.set("gestureEnabled", js.undefined)
    @scala.inline
    def setGestureResponseDistance(value: Horizontal): Self = this.set("gestureResponseDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGestureResponseDistance: Self = this.set("gestureResponseDistance", js.undefined)
    @scala.inline
    def setGestureVelocityImpact(value: Double): Self = this.set("gestureVelocityImpact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGestureVelocityImpact: Self = this.set("gestureVelocityImpact", js.undefined)
    @scala.inline
    def setHeader(value: /* props */ StackHeaderProps => ReactNode): Self = this.set("header", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeaderBackAllowFontScaling(value: Boolean): Self = this.set("headerBackAllowFontScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderBackAllowFontScaling: Self = this.set("headerBackAllowFontScaling", js.undefined)
    @scala.inline
    def setHeaderBackImage(value: /* props */ TintColorString => ReactNode): Self = this.set("headerBackImage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeaderBackImage: Self = this.set("headerBackImage", js.undefined)
    @scala.inline
    def setHeaderBackTitle(value: String): Self = this.set("headerBackTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderBackTitle: Self = this.set("headerBackTitle", js.undefined)
    @scala.inline
    def setHeaderBackTitleStyle(value: StyleProp[TextStyle]): Self = this.set("headerBackTitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderBackTitleStyle: Self = this.set("headerBackTitleStyle", js.undefined)
    @scala.inline
    def setHeaderBackTitleStyleNull: Self = this.set("headerBackTitleStyle", null)
    @scala.inline
    def setHeaderBackTitleVisible(value: Boolean): Self = this.set("headerBackTitleVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderBackTitleVisible: Self = this.set("headerBackTitleVisible", js.undefined)
    @scala.inline
    def setHeaderBackground(value: /* props */ Style => ReactNode): Self = this.set("headerBackground", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeaderBackground: Self = this.set("headerBackground", js.undefined)
    @scala.inline
    def setHeaderLeft(value: /* props */ StackHeaderLeftButtonProps => ReactNode): Self = this.set("headerLeft", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeaderLeft: Self = this.set("headerLeft", js.undefined)
    @scala.inline
    def setHeaderLeftContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = this.set("headerLeftContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderLeftContainerStyle: Self = this.set("headerLeftContainerStyle", js.undefined)
    @scala.inline
    def setHeaderPressColorAndroid(value: String): Self = this.set("headerPressColorAndroid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderPressColorAndroid: Self = this.set("headerPressColorAndroid", js.undefined)
    @scala.inline
    def setHeaderRight(value: /* props */ TintColor => ReactNode): Self = this.set("headerRight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeaderRight: Self = this.set("headerRight", js.undefined)
    @scala.inline
    def setHeaderRightContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = this.set("headerRightContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderRightContainerStyle: Self = this.set("headerRightContainerStyle", js.undefined)
    @scala.inline
    def setHeaderShown(value: Boolean): Self = this.set("headerShown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderShown: Self = this.set("headerShown", js.undefined)
    @scala.inline
    def setHeaderStatusBarHeight(value: Double): Self = this.set("headerStatusBarHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderStatusBarHeight: Self = this.set("headerStatusBarHeight", js.undefined)
    @scala.inline
    def setHeaderStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = this.set("headerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderStyle: Self = this.set("headerStyle", js.undefined)
    @scala.inline
    def setHeaderStyleInterpolator(value: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle): Self = this.set("headerStyleInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeaderStyleInterpolator: Self = this.set("headerStyleInterpolator", js.undefined)
    @scala.inline
    def setHeaderTintColor(value: String): Self = this.set("headerTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTintColor: Self = this.set("headerTintColor", js.undefined)
    @scala.inline
    def setHeaderTitleFunction1(value: /* props */ StackHeaderTitleProps => ReactNode): Self = this.set("headerTitle", js.Any.fromFunction1(value))
    @scala.inline
    def setHeaderTitle(value: String | (js.Function1[/* props */ StackHeaderTitleProps, ReactNode])): Self = this.set("headerTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTitle: Self = this.set("headerTitle", js.undefined)
    @scala.inline
    def setHeaderTitleAlign(value: left | center): Self = this.set("headerTitleAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTitleAlign: Self = this.set("headerTitleAlign", js.undefined)
    @scala.inline
    def setHeaderTitleAllowFontScaling(value: Boolean): Self = this.set("headerTitleAllowFontScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTitleAllowFontScaling: Self = this.set("headerTitleAllowFontScaling", js.undefined)
    @scala.inline
    def setHeaderTitleContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = this.set("headerTitleContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTitleContainerStyle: Self = this.set("headerTitleContainerStyle", js.undefined)
    @scala.inline
    def setHeaderTitleStyle(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react-native.react-native.Animated.AnimatedComponent<new (): react-native.react-native.Text>>['style'] */ js.Any
    ): Self = this.set("headerTitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTitleStyle: Self = this.set("headerTitleStyle", js.undefined)
    @scala.inline
    def setHeaderTransparent(value: Boolean): Self = this.set("headerTransparent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTransparent: Self = this.set("headerTransparent", js.undefined)
    @scala.inline
    def setHeaderTruncatedBackTitle(value: String): Self = this.set("headerTruncatedBackTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTruncatedBackTitle: Self = this.set("headerTruncatedBackTitle", js.undefined)
    @scala.inline
    def setOnTransitionEnd(value: /* props */ TransitionCallbackProps => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    @scala.inline
    def setOnTransitionStart(value: /* props */ TransitionCallbackProps => Unit): Self = this.set("onTransitionStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTransitionStart: Self = this.set("onTransitionStart", js.undefined)
    @scala.inline
    def setSafeAreaInsets(value: Bottom): Self = this.set("safeAreaInsets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafeAreaInsets: Self = this.set("safeAreaInsets", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTransitionSpec(value: Close): Self = this.set("transitionSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionSpec: Self = this.set("transitionSpec", js.undefined)
  }
  
}

