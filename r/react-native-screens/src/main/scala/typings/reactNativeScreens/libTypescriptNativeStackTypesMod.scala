package typings.reactNativeScreens

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeScreens.anon.BackgroundColor
import typings.reactNativeScreens.anon.BlurEffect
import typings.reactNativeScreens.anon.Color
import typings.reactNativeScreens.anon.Data
import typings.reactNativeScreens.anon.DataClosingBoolean
import typings.reactNativeScreens.anon.FontFamily
import typings.reactNativeScreens.anon.`0`
import typings.reactNativeScreens.libTypescriptTypesMod.GestureResponseDistanceType
import typings.reactNativeScreens.libTypescriptTypesMod.ScreenOrientationTypes
import typings.reactNativeScreens.libTypescriptTypesMod.ScreenReplaceTypes
import typings.reactNativeScreens.libTypescriptTypesMod.SearchBarProps
import typings.reactNativeScreens.libTypescriptTypesMod.StackAnimationTypes
import typings.reactNativeScreens.libTypescriptTypesMod.StackPresentationTypes
import typings.reactNativeScreens.libTypescriptTypesMod.SwipeDirectionTypes
import typings.reactNativeScreens.reactNativeScreensStrings.auto
import typings.reactNativeScreens.reactNativeScreensStrings.dark
import typings.reactNativeScreens.reactNativeScreensStrings.fade
import typings.reactNativeScreens.reactNativeScreensStrings.inverted
import typings.reactNativeScreens.reactNativeScreensStrings.light
import typings.reactNativeScreens.reactNativeScreensStrings.ltr
import typings.reactNativeScreens.reactNativeScreensStrings.none
import typings.reactNativeScreens.reactNativeScreensStrings.rtl
import typings.reactNativeScreens.reactNativeScreensStrings.slide
import typings.reactNavigationCore.libTypescriptSrcTypesMod.DefaultNavigatorOptions
import typings.reactNavigationCore.libTypescriptSrcTypesMod.Descriptor
import typings.reactNavigationCore.libTypescriptSrcTypesMod.EventMapBase
import typings.reactNavigationCore.libTypescriptSrcTypesMod.NavigationHelpers
import typings.reactNavigationCore.libTypescriptSrcTypesMod.NavigationProp
import typings.reactNavigationCore.libTypescriptSrcTypesMod.RouteProp
import typings.reactNavigationRouters.libTypescriptSrcStackRouterMod.StackActionHelpers
import typings.reactNavigationRouters.libTypescriptSrcStackRouterMod.StackNavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptNativeStackTypesMod {
  
  type NativeStackDescriptor = Descriptor[ParamListBase, String, StackNavigationState[ParamListBase]]
  
  type NativeStackDescriptorMap = StringDictionary[NativeStackDescriptor]
  
  type NativeStackNavigationConfig = js.Object
  
  trait NativeStackNavigationEventMap extends StObject {
    
    /**
      * Event which fires when the screen appears.
      *
      * @deprecated Use `transitionEnd` event with `data.closing: false` instead.
      */
    var appear: Data
    
    /**
      * Event which fires when the current screen is dismissed by hardware back (on Android) or dismiss gesture (swipe back or down).
      */
    var dismiss: Data
    
    /**
      * Event which fires when a transition animation ends.
      */
    var transitionEnd: DataClosingBoolean
    
    /**
      * Event which fires when a transition animation starts.
      */
    var transitionStart: DataClosingBoolean
  }
  object NativeStackNavigationEventMap {
    
    inline def apply(
      appear: Data,
      dismiss: Data,
      transitionEnd: DataClosingBoolean,
      transitionStart: DataClosingBoolean
    ): NativeStackNavigationEventMap = {
      val __obj = js.Dynamic.literal(appear = appear.asInstanceOf[js.Any], dismiss = dismiss.asInstanceOf[js.Any], transitionEnd = transitionEnd.asInstanceOf[js.Any], transitionStart = transitionStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeStackNavigationEventMap]
    }
    
    extension [Self <: NativeStackNavigationEventMap](x: Self) {
      
      inline def setAppear(value: Data): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      inline def setDismiss(value: Data): Self = StObject.set(x, "dismiss", value.asInstanceOf[js.Any])
      
      inline def setTransitionEnd(value: DataClosingBoolean): Self = StObject.set(x, "transitionEnd", value.asInstanceOf[js.Any])
      
      inline def setTransitionStart(value: DataClosingBoolean): Self = StObject.set(x, "transitionStart", value.asInstanceOf[js.Any])
    }
  }
  
  type NativeStackNavigationHelpers = NavigationHelpers[ParamListBase, NativeStackNavigationEventMap]
  
  trait NativeStackNavigationOptions extends StObject {
    
    /**
      * Image to display in the header as the back button.
      * Defaults to back icon image for the platform (a chevron on iOS and an arrow on Android).
      */
    var backButtonImage: js.UndefOr[ImageSourcePropType] = js.undefined
    
    /**
      * Whether to show the back button with custom left side of the header.
      */
    var backButtonInCustomView: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style object for the scene content.
      */
    var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Boolean indicating that swipe dismissal should trigger animation provided by `stackAnimation`. Defaults to `false`.
      *
      * @platform ios
      */
    var customAnimationOnSwipe: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the stack should be in rtl or ltr form.
      */
    var direction: js.UndefOr[rtl | ltr] = js.undefined
    
    /**
      * Boolean indicating whether to show the menu on longPress of iOS >= 14 back button.
      * @platform ios
      */
    var disableBackButtonMenu: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether inactive screens should be suspended from re-rendering. Defaults to `false`.
      * Defaults to `true` when `enableFreeze()` is run at the top of the application.
      */
    var freezeOnBlur: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean indicating whether the swipe gesture should work on whole screen. Swiping with this option results in the same transition animation as `simple_push` by default.
      * It can be changed to other custom animations with `customAnimationOnSwipe` prop, but default iOS swipe animation is not achievable due to usage of custom recognizer.
      * Defaults to `false`.
      *
      * @platform ios
      */
    var fullScreenSwipeEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether you can use gestures to dismiss this screen. Defaults to `true`.
      * Only supported on iOS.
      *
      * @platform ios
      */
    var gestureEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use it to restrict the distance from the edges of screen in which the gesture should be recognized. To be used alongside `fullScreenSwipeEnabled`.
      *
      * @platform ios
      */
    var gestureResponseDistance: js.UndefOr[GestureResponseDistanceType] = js.undefined
    
    /**
      * Title to display in the back button.
      * Only supported on iOS.
      *
      * @platform ios
      */
    var headerBackTitle: js.UndefOr[String] = js.undefined
    
    /**
      * Style object for header back title. Supported properties:
      * - fontFamily
      * - fontSize
      *
      * Only supported on iOS.
      *
      * @platform ios
      */
    var headerBackTitleStyle: js.UndefOr[FontFamily] = js.undefined
    
    /**
      * Whether the back button title should be visible or not. Defaults to `true`.
      * Only supported on iOS.
      *
      * @platform ios
      */
    var headerBackTitleVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function which returns a React Element to display in the center of the header.
      */
    var headerCenter: js.UndefOr[js.Function1[/* props */ `0`, ReactNode]] = js.undefined
    
    /**
      * Boolean indicating whether to hide the back button in header.
      */
    var headerHideBackButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean indicating whether to hide the elevation shadow or the bottom border on the header.
      */
    var headerHideShadow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls the style of the navigation header when the edge of any scrollable content reaches the matching edge of the navigation bar. Supported properties:
      * - backgroundColor
      *
      * @platform ios
      */
    var headerLargeStyle: js.UndefOr[BackgroundColor] = js.undefined
    
    /**
      * Boolean to set native property to prefer large title header (like in iOS setting).
      * For large title to collapse on scroll, the content of the screen should be wrapped in a scrollable view such as `ScrollView` or `FlatList`.
      * If the scrollable area doesn't fill the screen, the large title won't collapse on scroll.
      * Only supported on iOS.
      *
      * @platform ios
      */
    var headerLargeTitle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean that allows for disabling drop shadow under navigation header when the edge of any scrollable content reaches the matching edge of the navigation bar.
      */
    var headerLargeTitleHideShadow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style object for header large title. Supported properties:
      * - fontFamily
      * - fontSize
      * - color
      *
      * Only supported on iOS.
      *
      * @platform ios
      */
    var headerLargeTitleStyle: js.UndefOr[Color] = js.undefined
    
    /**
      * Function which returns a React Element to display on the left side of the header.
      */
    var headerLeft: js.UndefOr[js.Function1[/* props */ `0`, ReactNode]] = js.undefined
    
    /**
      * Function which returns a React Element to display on the right side of the header.
      */
    var headerRight: js.UndefOr[js.Function1[/* props */ `0`, ReactNode]] = js.undefined
    
    /**
      * Whether to show the header.
      */
    var headerShown: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style object for header title. Supported properties:
      * - backgroundColor
      * - blurEffect
      */
    var headerStyle: js.UndefOr[BlurEffect] = js.undefined
    
    /**
      * Tint color for the header. Changes the color of back button and title.
      */
    var headerTintColor: js.UndefOr[String] = js.undefined
    
    /**
      * String to display in the header as title. Defaults to scene `title`.
      */
    var headerTitle: js.UndefOr[String] = js.undefined
    
    /**
      * Style object for header title. Supported properties:
      * - fontFamily
      * - fontSize
      * - fontWeight
      * - color
      */
    var headerTitleStyle: js.UndefOr[Color] = js.undefined
    
    /**
      * A flag to that lets you opt out of insetting the header. You may want to
      * set this to `false` if you use an opaque status bar. Defaults to `true`.
      * Only supported on Android. Insets are always applied on iOS because the
      * header cannot be opaque.
      *
      * @platform android
      */
    var headerTopInsetEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean indicating whether the navigation bar is translucent.
      */
    var headerTranslucent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the keyboard should hide when swiping to the previous screen. Defaults to `false`.
      *
      * @platform ios
      */
    var hideKeyboardOnSwipe: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the home indicator should be hidden on this screen. Defaults to `false`.
      *
      * @platform ios
      */
    var homeIndicatorHidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean indicating whether, when the Android default back button is clicked, the `pop` action should be performed on the native side or on the JS side to be able to prevent it.
      * Unfortunately the same behavior is not available on iOS since the behavior of native back button cannot be changed there.
      * Defaults to `false`.
      *
      * @platform android
      */
    var nativeBackButtonDismissalEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets the navigation bar color. Defaults to initial status bar color.
      *
      * @platform android
      */
    var navigationBarColor: js.UndefOr[String] = js.undefined
    
    /**
      * Sets the visibility of the navigation bar. Defaults to `false`.
      *
      * @platform android
      */
    var navigationBarHidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * How should the screen replacing another screen animate. Defaults to `pop`.
      * The following values are currently supported:
      * - "push" – the new screen will perform push animation.
      * - "pop" – the new screen will perform pop animation.
      */
    var replaceAnimation: js.UndefOr[ScreenReplaceTypes] = js.undefined
    
    /**
      * In which orientation should the screen appear.
      * The following values are currently supported:
      * - "default" - resolves to "all" without "portrait_down" on iOS. On Android, this lets the system decide the best orientation.
      * - "all" – all orientations are permitted
      * - "portrait" – portrait orientations are permitted
      * - "portrait_up" – right-side portrait orientation is permitted
      * - "portrait_down" – upside-down portrait orientation is permitted
      * - "landscape" – landscape orientations are permitted
      * - "landscape_left" – landscape-left orientation is permitted
      * - "landscape_right" – landscape-right orientation is permitted
      */
    var screenOrientation: js.UndefOr[ScreenOrientationTypes] = js.undefined
    
    /**
      * Object in which you should pass props in order to render native iOS searchBar.
      */
    var searchBar: js.UndefOr[SearchBarProps] = js.undefined
    
    /**
      * How the screen should appear/disappear when pushed or popped at the top of the stack.
      * The following values are currently supported:
      * - "default" – uses a platform default animation
      * - "fade" – fades screen in or out
      * - "fade_from_bottom" – performs a fade from bottom animation
      * - "flip" – flips the screen, requires stackPresentation: "modal" (iOS only)
      * - "simple_push" – performs a default animation, but without shadow and native header transition (iOS only)
      * - "slide_from_bottom" – performs a slide from bottom animation
      * - "slide_from_right" - slide in the new screen from right to left (Android only, resolves to default transition on iOS)
      * - "slide_from_left" - slide in the new screen from left to right (Android only, resolves to default transition on iOS)
      * - "none" – the screen appears/dissapears without an animation
      */
    var stackAnimation: js.UndefOr[StackAnimationTypes] = js.undefined
    
    /**
      * How should the screen be presented.
      * The following values are currently supported:
      * - "push" – the new screen will be pushed onto a stack which on iOS means that the default animation will be slide from the side, the animation on Android may vary depending on the OS version and theme.
      * - "modal" – the new screen will be presented modally. In addition this allow for a nested stack to be rendered inside such screens.
      * - "transparentModal" – the new screen will be presented modally but in addition the second to last screen will remain attached to the stack container such that if the top screen is non opaque the content below can still be seen. If "modal" is used instead the below screen will get unmounted as soon as the transition ends.
      * - "containedModal" – will use "UIModalPresentationCurrentContext" modal style on iOS and will fallback to "modal" on Android.
      * - "containedTransparentModal" – will use "UIModalPresentationOverCurrentContext" modal style on iOS and will fallback to "transparentModal" on Android.
      * - "fullScreenModal" – will use "UIModalPresentationFullScreen" modal style on iOS and will fallback to "modal" on Android.
      * - "formSheet" – will use "UIModalPresentationFormSheet" modal style on iOS and will fallback to "modal" on Android.
      */
    var stackPresentation: js.UndefOr[StackPresentationTypes] = js.undefined
    
    /**
      * Sets the status bar animation (similar to the `StatusBar` component). Requires enabling (or deleting) `View controller-based status bar appearance` in your Info.plist file on iOS.
      */
    var statusBarAnimation: js.UndefOr[none | fade | slide] = js.undefined
    
    /**
      * Sets the status bar color (similar to the `StatusBar` component). Defaults to initial status bar color.
      *
      * @platform android
      */
    var statusBarColor: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the status bar should be hidden on this screen. Requires enabling (or deleting) `View controller-based status bar appearance` in your Info.plist file on iOS. Defaults to `false`.
      */
    var statusBarHidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets the status bar color (similar to the `StatusBar` component). Requires enabling (or deleting) `View controller-based status bar appearance` in your Info.plist file on iOS. Defaults to `auto`.
      */
    var statusBarStyle: js.UndefOr[inverted | auto | light | dark] = js.undefined
    
    /**
      * Sets the translucency of the status bar. Defaults to `false`.
      *
      * @platform android
      */
    var statusBarTranslucent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets the direction in which you should swipe to dismiss the screen.
      * When using `vertical` option, options `fullScreenSwipeEnabled: true`, `customAnimationOnSwipe: true` and `stackAnimation: 'slide_from_bottom'` are set by default.
      * The following values are supported:
      * - `vertical` – dismiss screen vertically
      * - `horizontal` – dismiss screen horizontally (default)
      * @platform ios
      */
    var swipeDirection: js.UndefOr[SwipeDirectionTypes] = js.undefined
    
    /**
      * String that can be displayed in the header as a fallback for `headerTitle`.
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * Changes the duration (in milliseconds) of `slide_from_bottom`, `fade_from_bottom`, `fade` and `simple_push` transitions on iOS. Defaults to `350`.
      * The duration of `default` and `flip` transitions isn't customizable.
      *
      * @platform ios
      */
    var transitionDuration: js.UndefOr[Double] = js.undefined
  }
  object NativeStackNavigationOptions {
    
    inline def apply(): NativeStackNavigationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeStackNavigationOptions]
    }
    
    extension [Self <: NativeStackNavigationOptions](x: Self) {
      
      inline def setBackButtonImage(value: ImageSourcePropType): Self = StObject.set(x, "backButtonImage", value.asInstanceOf[js.Any])
      
      inline def setBackButtonImageUndefined: Self = StObject.set(x, "backButtonImage", js.undefined)
      
      inline def setBackButtonImageVarargs(value: ImageURISource*): Self = StObject.set(x, "backButtonImage", js.Array(value*))
      
      inline def setBackButtonInCustomView(value: Boolean): Self = StObject.set(x, "backButtonInCustomView", value.asInstanceOf[js.Any])
      
      inline def setBackButtonInCustomViewUndefined: Self = StObject.set(x, "backButtonInCustomView", js.undefined)
      
      inline def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setCustomAnimationOnSwipe(value: Boolean): Self = StObject.set(x, "customAnimationOnSwipe", value.asInstanceOf[js.Any])
      
      inline def setCustomAnimationOnSwipeUndefined: Self = StObject.set(x, "customAnimationOnSwipe", js.undefined)
      
      inline def setDirection(value: rtl | ltr): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisableBackButtonMenu(value: Boolean): Self = StObject.set(x, "disableBackButtonMenu", value.asInstanceOf[js.Any])
      
      inline def setDisableBackButtonMenuUndefined: Self = StObject.set(x, "disableBackButtonMenu", js.undefined)
      
      inline def setFreezeOnBlur(value: Boolean): Self = StObject.set(x, "freezeOnBlur", value.asInstanceOf[js.Any])
      
      inline def setFreezeOnBlurUndefined: Self = StObject.set(x, "freezeOnBlur", js.undefined)
      
      inline def setFullScreenSwipeEnabled(value: Boolean): Self = StObject.set(x, "fullScreenSwipeEnabled", value.asInstanceOf[js.Any])
      
      inline def setFullScreenSwipeEnabledUndefined: Self = StObject.set(x, "fullScreenSwipeEnabled", js.undefined)
      
      inline def setGestureEnabled(value: Boolean): Self = StObject.set(x, "gestureEnabled", value.asInstanceOf[js.Any])
      
      inline def setGestureEnabledUndefined: Self = StObject.set(x, "gestureEnabled", js.undefined)
      
      inline def setGestureResponseDistance(value: GestureResponseDistanceType): Self = StObject.set(x, "gestureResponseDistance", value.asInstanceOf[js.Any])
      
      inline def setGestureResponseDistanceUndefined: Self = StObject.set(x, "gestureResponseDistance", js.undefined)
      
      inline def setHeaderBackTitle(value: String): Self = StObject.set(x, "headerBackTitle", value.asInstanceOf[js.Any])
      
      inline def setHeaderBackTitleStyle(value: FontFamily): Self = StObject.set(x, "headerBackTitleStyle", value.asInstanceOf[js.Any])
      
      inline def setHeaderBackTitleStyleUndefined: Self = StObject.set(x, "headerBackTitleStyle", js.undefined)
      
      inline def setHeaderBackTitleUndefined: Self = StObject.set(x, "headerBackTitle", js.undefined)
      
      inline def setHeaderBackTitleVisible(value: Boolean): Self = StObject.set(x, "headerBackTitleVisible", value.asInstanceOf[js.Any])
      
      inline def setHeaderBackTitleVisibleUndefined: Self = StObject.set(x, "headerBackTitleVisible", js.undefined)
      
      inline def setHeaderCenter(value: /* props */ `0` => ReactNode): Self = StObject.set(x, "headerCenter", js.Any.fromFunction1(value))
      
      inline def setHeaderCenterUndefined: Self = StObject.set(x, "headerCenter", js.undefined)
      
      inline def setHeaderHideBackButton(value: Boolean): Self = StObject.set(x, "headerHideBackButton", value.asInstanceOf[js.Any])
      
      inline def setHeaderHideBackButtonUndefined: Self = StObject.set(x, "headerHideBackButton", js.undefined)
      
      inline def setHeaderHideShadow(value: Boolean): Self = StObject.set(x, "headerHideShadow", value.asInstanceOf[js.Any])
      
      inline def setHeaderHideShadowUndefined: Self = StObject.set(x, "headerHideShadow", js.undefined)
      
      inline def setHeaderLargeStyle(value: BackgroundColor): Self = StObject.set(x, "headerLargeStyle", value.asInstanceOf[js.Any])
      
      inline def setHeaderLargeStyleUndefined: Self = StObject.set(x, "headerLargeStyle", js.undefined)
      
      inline def setHeaderLargeTitle(value: Boolean): Self = StObject.set(x, "headerLargeTitle", value.asInstanceOf[js.Any])
      
      inline def setHeaderLargeTitleHideShadow(value: Boolean): Self = StObject.set(x, "headerLargeTitleHideShadow", value.asInstanceOf[js.Any])
      
      inline def setHeaderLargeTitleHideShadowUndefined: Self = StObject.set(x, "headerLargeTitleHideShadow", js.undefined)
      
      inline def setHeaderLargeTitleStyle(value: Color): Self = StObject.set(x, "headerLargeTitleStyle", value.asInstanceOf[js.Any])
      
      inline def setHeaderLargeTitleStyleUndefined: Self = StObject.set(x, "headerLargeTitleStyle", js.undefined)
      
      inline def setHeaderLargeTitleUndefined: Self = StObject.set(x, "headerLargeTitle", js.undefined)
      
      inline def setHeaderLeft(value: /* props */ `0` => ReactNode): Self = StObject.set(x, "headerLeft", js.Any.fromFunction1(value))
      
      inline def setHeaderLeftUndefined: Self = StObject.set(x, "headerLeft", js.undefined)
      
      inline def setHeaderRight(value: /* props */ `0` => ReactNode): Self = StObject.set(x, "headerRight", js.Any.fromFunction1(value))
      
      inline def setHeaderRightUndefined: Self = StObject.set(x, "headerRight", js.undefined)
      
      inline def setHeaderShown(value: Boolean): Self = StObject.set(x, "headerShown", value.asInstanceOf[js.Any])
      
      inline def setHeaderShownUndefined: Self = StObject.set(x, "headerShown", js.undefined)
      
      inline def setHeaderStyle(value: BlurEffect): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      inline def setHeaderTintColor(value: String): Self = StObject.set(x, "headerTintColor", value.asInstanceOf[js.Any])
      
      inline def setHeaderTintColorUndefined: Self = StObject.set(x, "headerTintColor", js.undefined)
      
      inline def setHeaderTitle(value: String): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
      
      inline def setHeaderTitleStyle(value: Color): Self = StObject.set(x, "headerTitleStyle", value.asInstanceOf[js.Any])
      
      inline def setHeaderTitleStyleUndefined: Self = StObject.set(x, "headerTitleStyle", js.undefined)
      
      inline def setHeaderTitleUndefined: Self = StObject.set(x, "headerTitle", js.undefined)
      
      inline def setHeaderTopInsetEnabled(value: Boolean): Self = StObject.set(x, "headerTopInsetEnabled", value.asInstanceOf[js.Any])
      
      inline def setHeaderTopInsetEnabledUndefined: Self = StObject.set(x, "headerTopInsetEnabled", js.undefined)
      
      inline def setHeaderTranslucent(value: Boolean): Self = StObject.set(x, "headerTranslucent", value.asInstanceOf[js.Any])
      
      inline def setHeaderTranslucentUndefined: Self = StObject.set(x, "headerTranslucent", js.undefined)
      
      inline def setHideKeyboardOnSwipe(value: Boolean): Self = StObject.set(x, "hideKeyboardOnSwipe", value.asInstanceOf[js.Any])
      
      inline def setHideKeyboardOnSwipeUndefined: Self = StObject.set(x, "hideKeyboardOnSwipe", js.undefined)
      
      inline def setHomeIndicatorHidden(value: Boolean): Self = StObject.set(x, "homeIndicatorHidden", value.asInstanceOf[js.Any])
      
      inline def setHomeIndicatorHiddenUndefined: Self = StObject.set(x, "homeIndicatorHidden", js.undefined)
      
      inline def setNativeBackButtonDismissalEnabled(value: Boolean): Self = StObject.set(x, "nativeBackButtonDismissalEnabled", value.asInstanceOf[js.Any])
      
      inline def setNativeBackButtonDismissalEnabledUndefined: Self = StObject.set(x, "nativeBackButtonDismissalEnabled", js.undefined)
      
      inline def setNavigationBarColor(value: String): Self = StObject.set(x, "navigationBarColor", value.asInstanceOf[js.Any])
      
      inline def setNavigationBarColorUndefined: Self = StObject.set(x, "navigationBarColor", js.undefined)
      
      inline def setNavigationBarHidden(value: Boolean): Self = StObject.set(x, "navigationBarHidden", value.asInstanceOf[js.Any])
      
      inline def setNavigationBarHiddenUndefined: Self = StObject.set(x, "navigationBarHidden", js.undefined)
      
      inline def setReplaceAnimation(value: ScreenReplaceTypes): Self = StObject.set(x, "replaceAnimation", value.asInstanceOf[js.Any])
      
      inline def setReplaceAnimationUndefined: Self = StObject.set(x, "replaceAnimation", js.undefined)
      
      inline def setScreenOrientation(value: ScreenOrientationTypes): Self = StObject.set(x, "screenOrientation", value.asInstanceOf[js.Any])
      
      inline def setScreenOrientationUndefined: Self = StObject.set(x, "screenOrientation", js.undefined)
      
      inline def setSearchBar(value: SearchBarProps): Self = StObject.set(x, "searchBar", value.asInstanceOf[js.Any])
      
      inline def setSearchBarUndefined: Self = StObject.set(x, "searchBar", js.undefined)
      
      inline def setStackAnimation(value: StackAnimationTypes): Self = StObject.set(x, "stackAnimation", value.asInstanceOf[js.Any])
      
      inline def setStackAnimationUndefined: Self = StObject.set(x, "stackAnimation", js.undefined)
      
      inline def setStackPresentation(value: StackPresentationTypes): Self = StObject.set(x, "stackPresentation", value.asInstanceOf[js.Any])
      
      inline def setStackPresentationUndefined: Self = StObject.set(x, "stackPresentation", js.undefined)
      
      inline def setStatusBarAnimation(value: none | fade | slide): Self = StObject.set(x, "statusBarAnimation", value.asInstanceOf[js.Any])
      
      inline def setStatusBarAnimationUndefined: Self = StObject.set(x, "statusBarAnimation", js.undefined)
      
      inline def setStatusBarColor(value: String): Self = StObject.set(x, "statusBarColor", value.asInstanceOf[js.Any])
      
      inline def setStatusBarColorUndefined: Self = StObject.set(x, "statusBarColor", js.undefined)
      
      inline def setStatusBarHidden(value: Boolean): Self = StObject.set(x, "statusBarHidden", value.asInstanceOf[js.Any])
      
      inline def setStatusBarHiddenUndefined: Self = StObject.set(x, "statusBarHidden", js.undefined)
      
      inline def setStatusBarStyle(value: inverted | auto | light | dark): Self = StObject.set(x, "statusBarStyle", value.asInstanceOf[js.Any])
      
      inline def setStatusBarStyleUndefined: Self = StObject.set(x, "statusBarStyle", js.undefined)
      
      inline def setStatusBarTranslucent(value: Boolean): Self = StObject.set(x, "statusBarTranslucent", value.asInstanceOf[js.Any])
      
      inline def setStatusBarTranslucentUndefined: Self = StObject.set(x, "statusBarTranslucent", js.undefined)
      
      inline def setSwipeDirection(value: SwipeDirectionTypes): Self = StObject.set(x, "swipeDirection", value.asInstanceOf[js.Any])
      
      inline def setSwipeDirectionUndefined: Self = StObject.set(x, "swipeDirection", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    }
  }
  
  @js.native
  trait NativeStackNavigationProp[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */]
    extends StObject
       with NavigationProp[
          ParamList, 
          RouteName, 
          StackNavigationState[ParamList], 
          NativeStackNavigationOptions, 
          NativeStackNavigationEventMap, 
          js.Object
        ]
       with StackActionHelpers[ParamList]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Lifted 0 members from Set(react-native-screens.react-native-screens/lib/typescript/native-stack/types.NativeStackNavigationConfig) */ trait NativeStackNavigatorProps
    extends StObject
       with DefaultNavigatorOptions[NativeStackNavigationOptions, NavigationState[ParamListBase], js.Object, EventMapBase]
  object NativeStackNavigatorProps {
    
    inline def apply(): NativeStackNavigatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeStackNavigatorProps]
    }
  }
  
  trait NativeStackScreenProps[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] extends StObject {
    
    var navigation: NativeStackNavigationProp[ParamList, RouteName]
    
    var route: RouteProp[ParamList, RouteName]
  }
  object NativeStackScreenProps {
    
    inline def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](
      navigation: NativeStackNavigationProp[ParamList, RouteName],
      route: RouteProp[ParamList, RouteName]
    ): NativeStackScreenProps[ParamList, RouteName] = {
      val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeStackScreenProps[ParamList, RouteName]]
    }
    
    extension [Self <: NativeStackScreenProps[?, ?], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](x: Self & (NativeStackScreenProps[ParamList, RouteName])) {
      
      inline def setNavigation(value: NativeStackNavigationProp[ParamList, RouteName]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: RouteProp[ParamList, RouteName]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
}
