package typings.reactNativeScreens

import typings.react.mod.Ref
import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.TargetedEvent
import typings.reactNative.mod.TextInputFocusEventData
import typings.reactNative.mod.View
import typings.reactNative.mod.ViewProps
import typings.reactNativeScreens.anon.DismissCount
import typings.reactNativeScreens.reactNativeScreensInts.`0`
import typings.reactNativeScreens.reactNativeScreensInts.`1`
import typings.reactNativeScreens.reactNativeScreensInts.`2`
import typings.reactNativeScreens.reactNativeScreensStrings.auto
import typings.reactNativeScreens.reactNativeScreensStrings.characters
import typings.reactNativeScreens.reactNativeScreensStrings.dark
import typings.reactNativeScreens.reactNativeScreensStrings.email
import typings.reactNativeScreens.reactNativeScreensStrings.fade
import typings.reactNativeScreens.reactNativeScreensStrings.inverted
import typings.reactNativeScreens.reactNativeScreensStrings.light
import typings.reactNativeScreens.reactNativeScreensStrings.ltr
import typings.reactNativeScreens.reactNativeScreensStrings.none
import typings.reactNativeScreens.reactNativeScreensStrings.number
import typings.reactNativeScreens.reactNativeScreensStrings.phone
import typings.reactNativeScreens.reactNativeScreensStrings.rtl
import typings.reactNativeScreens.reactNativeScreensStrings.sentences
import typings.reactNativeScreens.reactNativeScreensStrings.slide
import typings.reactNativeScreens.reactNativeScreensStrings.text
import typings.reactNativeScreens.reactNativeScreensStrings.words
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeScreens.reactNativeScreensStrings.extraLight
    - typings.reactNativeScreens.reactNativeScreensStrings.light
    - typings.reactNativeScreens.reactNativeScreensStrings.dark
    - typings.reactNativeScreens.reactNativeScreensStrings.regular
    - typings.reactNativeScreens.reactNativeScreensStrings.prominent
    - typings.reactNativeScreens.reactNativeScreensStrings.systemUltraThinMaterial
    - typings.reactNativeScreens.reactNativeScreensStrings.systemThinMaterial
    - typings.reactNativeScreens.reactNativeScreensStrings.systemMaterial
    - typings.reactNativeScreens.reactNativeScreensStrings.systemThickMaterial
    - typings.reactNativeScreens.reactNativeScreensStrings.systemChromeMaterial
    - typings.reactNativeScreens.reactNativeScreensStrings.systemUltraThinMaterialLight
    - typings.reactNativeScreens.reactNativeScreensStrings.systemThinMaterialLight
    - typings.reactNativeScreens.reactNativeScreensStrings.systemMaterialLight
    - typings.reactNativeScreens.reactNativeScreensStrings.systemThickMaterialLight
    - typings.reactNativeScreens.reactNativeScreensStrings.systemChromeMaterialLight
    - typings.reactNativeScreens.reactNativeScreensStrings.systemUltraThinMaterialDark
    - typings.reactNativeScreens.reactNativeScreensStrings.systemThinMaterialDark
    - typings.reactNativeScreens.reactNativeScreensStrings.systemMaterialDark
    - typings.reactNativeScreens.reactNativeScreensStrings.systemThickMaterialDark
    - typings.reactNativeScreens.reactNativeScreensStrings.systemChromeMaterialDark
  */
  trait BlurEffectTypes extends StObject
  object BlurEffectTypes {
    
    inline def dark: typings.reactNativeScreens.reactNativeScreensStrings.dark = "dark".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.dark]
    
    inline def extraLight: typings.reactNativeScreens.reactNativeScreensStrings.extraLight = "extraLight".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.extraLight]
    
    inline def light: typings.reactNativeScreens.reactNativeScreensStrings.light = "light".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.light]
    
    inline def prominent: typings.reactNativeScreens.reactNativeScreensStrings.prominent = "prominent".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.prominent]
    
    inline def regular: typings.reactNativeScreens.reactNativeScreensStrings.regular = "regular".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.regular]
    
    inline def systemChromeMaterial: typings.reactNativeScreens.reactNativeScreensStrings.systemChromeMaterial = "systemChromeMaterial".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.systemChromeMaterial]
    
    inline def systemChromeMaterialDark: typings.reactNativeScreens.reactNativeScreensStrings.systemChromeMaterialDark = "systemChromeMaterialDark".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.systemChromeMaterialDark]
    
    inline def systemChromeMaterialLight: typings.reactNativeScreens.reactNativeScreensStrings.systemChromeMaterialLight = "systemChromeMaterialLight".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.systemChromeMaterialLight]
    
    inline def systemMaterial: typings.reactNativeScreens.reactNativeScreensStrings.systemMaterial = "systemMaterial".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.systemMaterial]
    
    inline def systemMaterialDark: typings.reactNativeScreens.reactNativeScreensStrings.systemMaterialDark = "systemMaterialDark".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.systemMaterialDark]
    
    inline def systemMaterialLight: typings.reactNativeScreens.reactNativeScreensStrings.systemMaterialLight = "systemMaterialLight".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.systemMaterialLight]
    
    inline def systemThickMaterial: typings.reactNativeScreens.reactNativeScreensStrings.systemThickMaterial = "systemThickMaterial".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.systemThickMaterial]
    
    inline def systemThickMaterialDark: typings.reactNativeScreens.reactNativeScreensStrings.systemThickMaterialDark = "systemThickMaterialDark".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.systemThickMaterialDark]
    
    inline def systemThickMaterialLight: typings.reactNativeScreens.reactNativeScreensStrings.systemThickMaterialLight = "systemThickMaterialLight".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.systemThickMaterialLight]
    
    inline def systemThinMaterial: typings.reactNativeScreens.reactNativeScreensStrings.systemThinMaterial = "systemThinMaterial".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.systemThinMaterial]
    
    inline def systemThinMaterialDark: typings.reactNativeScreens.reactNativeScreensStrings.systemThinMaterialDark = "systemThinMaterialDark".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.systemThinMaterialDark]
    
    inline def systemThinMaterialLight: typings.reactNativeScreens.reactNativeScreensStrings.systemThinMaterialLight = "systemThinMaterialLight".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.systemThinMaterialLight]
    
    inline def systemUltraThinMaterial: typings.reactNativeScreens.reactNativeScreensStrings.systemUltraThinMaterial = "systemUltraThinMaterial".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.systemUltraThinMaterial]
    
    inline def systemUltraThinMaterialDark: typings.reactNativeScreens.reactNativeScreensStrings.systemUltraThinMaterialDark = "systemUltraThinMaterialDark".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.systemUltraThinMaterialDark]
    
    inline def systemUltraThinMaterialLight: typings.reactNativeScreens.reactNativeScreensStrings.systemUltraThinMaterialLight = "systemUltraThinMaterialLight".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.systemUltraThinMaterialLight]
  }
  
  trait GestureResponseDistanceType extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var end: js.UndefOr[Double] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object GestureResponseDistanceType {
    
    inline def apply(): GestureResponseDistanceType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GestureResponseDistanceType]
    }
    
    extension [Self <: GestureResponseDistanceType](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeScreens.reactNativeScreensStrings.back
    - typings.reactNativeScreens.reactNativeScreensStrings.right
    - typings.reactNativeScreens.reactNativeScreensStrings.left
    - typings.reactNativeScreens.reactNativeScreensStrings.center
    - typings.reactNativeScreens.reactNativeScreensStrings.searchBar
  */
  trait HeaderSubviewTypes extends StObject
  object HeaderSubviewTypes {
    
    inline def back: typings.reactNativeScreens.reactNativeScreensStrings.back = "back".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.back]
    
    inline def center: typings.reactNativeScreens.reactNativeScreensStrings.center = "center".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.center]
    
    inline def left: typings.reactNativeScreens.reactNativeScreensStrings.left = "left".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.left]
    
    inline def right: typings.reactNativeScreens.reactNativeScreensStrings.right = "right".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.right]
    
    inline def searchBar: typings.reactNativeScreens.reactNativeScreensStrings.searchBar = "searchBar".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.searchBar]
  }
  
  trait ScreenContainerProps
    extends StObject
       with ViewProps {
    
    /**
      * A prop that gives users an option to switch between using Screens for the navigator (container). All children screens should have the same value of their "enabled" prop as their container.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A prop to be used in navigators always showing only one screen (providing only `0` or `2` `activityState` values) for better implementation of `ScreenContainer` on iOS.
      */
    var hasTwoStates: js.UndefOr[Boolean] = js.undefined
  }
  object ScreenContainerProps {
    
    inline def apply(): ScreenContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScreenContainerProps]
    }
    
    extension [Self <: ScreenContainerProps](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHasTwoStates(value: Boolean): Self = StObject.set(x, "hasTwoStates", value.asInstanceOf[js.Any])
      
      inline def setHasTwoStatesUndefined: Self = StObject.set(x, "hasTwoStates", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeScreens.reactNativeScreensStrings.default
    - typings.reactNativeScreens.reactNativeScreensStrings.all
    - typings.reactNativeScreens.reactNativeScreensStrings.portrait
    - typings.reactNativeScreens.reactNativeScreensStrings.portrait_up
    - typings.reactNativeScreens.reactNativeScreensStrings.portrait_down
    - typings.reactNativeScreens.reactNativeScreensStrings.landscape
    - typings.reactNativeScreens.reactNativeScreensStrings.landscape_left
    - typings.reactNativeScreens.reactNativeScreensStrings.landscape_right
  */
  trait ScreenOrientationTypes extends StObject
  object ScreenOrientationTypes {
    
    inline def default: typings.reactNativeScreens.reactNativeScreensStrings.default = "default".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.default]
    
    inline def all: typings.reactNativeScreens.reactNativeScreensStrings.all = "all".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.all]
    
    inline def landscape: typings.reactNativeScreens.reactNativeScreensStrings.landscape = "landscape".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.landscape]
    
    inline def landscape_left: typings.reactNativeScreens.reactNativeScreensStrings.landscape_left = "landscape_left".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.landscape_left]
    
    inline def landscape_right: typings.reactNativeScreens.reactNativeScreensStrings.landscape_right = "landscape_right".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.landscape_right]
    
    inline def portrait: typings.reactNativeScreens.reactNativeScreensStrings.portrait = "portrait".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.portrait]
    
    inline def portrait_down: typings.reactNativeScreens.reactNativeScreensStrings.portrait_down = "portrait_down".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.portrait_down]
    
    inline def portrait_up: typings.reactNativeScreens.reactNativeScreensStrings.portrait_up = "portrait_up".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.portrait_up]
  }
  
  trait ScreenProps
    extends StObject
       with ViewProps {
    
    var active: js.UndefOr[`0` | `1` | (AnimatedInterpolation[Double | String])] = js.undefined
    
    var activityState: js.UndefOr[`0` | `1` | `2` | (AnimatedInterpolation[Double | String])] = js.undefined
    
    /**
      * Boolean indicating that swipe dismissal should trigger animation provided by `stackAnimation`. Defaults to `false`.
      *
      * @platform ios
      */
    var customAnimationOnSwipe: js.UndefOr[Boolean] = js.undefined
    
    /**
      * All children screens should have the same value of their "enabled" prop as their container.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether inactive screens should be suspended from re-rendering. Defaults to `false`.
      * When `enableFreeze()` is run at the top of the application defaults to `true`.
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
      * Internal boolean used to not attach events used only by native-stack. It prevents non native-stack navigators from sending transition progress from their Screen components.
      */
    var isNativeStack: js.UndefOr[Boolean] = js.undefined
    
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
      * A callback that gets called when the current screen appears.
      */
    var onAppear: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
    
    var onComponentRef: js.UndefOr[js.Function1[/* view */ Any, Unit]] = js.undefined
    
    /**
      * A callback that gets called when the current screen disappears.
      */
    var onDisappear: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
    
    /**
      * A callback that gets called when the current screen is dismissed by hardware back (on Android) or dismiss gesture (swipe back or down).
      * The callback takes the number of dismissed screens as an argument since iOS 14 native header back button can pop more than 1 screen at a time.
      */
    var onDismissed: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[DismissCount], Unit]] = js.undefined
    
    /**
      * An internal callback that gets called when the native header back button is clicked on Android and `enableNativeBackButtonDismissal` is set to `false`. It dismises the screen using `navigation.pop()`.
      *
      * @platform android
      */
    var onHeaderBackButtonClicked: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * An internal callback called when screen is dismissed by gesture or by native header back button and `preventNativeDismiss` is set to `true`.
      *
      * @platform ios
      */
    var onNativeDismissCancelled: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[DismissCount], Unit]] = js.undefined
    
    /**
      * An internal callback called every frame during the transition of screens of `native-stack`, used to feed transition context.
      */
    var onTransitionProgress: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TransitionProgressEventType], Unit]] = js.undefined
    
    /**
      * A callback that gets called when the current screen will appear. This is called as soon as the transition begins.
      */
    var onWillAppear: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
    
    /**
      * A callback that gets called when the current screen will disappear. This is called as soon as the transition begins.
      */
    var onWillDisappear: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
    
    /**
      * Boolean indicating whether to prevent current screen from being dismissed.
      * Defaults to `false`.
      *
      * @platform ios
      */
    var preventNativeDismiss: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[View]] = js.undefined
    
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
      * How the screen should appear/disappear when pushed or popped at the top of the stack.
      * The following values are currently supported:
      * - "default" – uses a platform default animation
      * - "fade" – fades screen in or out
      * - "fade_from_bottom" – performs a fade from bottom animation
      * - "flip" – flips the screen, requires stackPresentation: "modal" (iOS only)
      * - "simple_push" – performs a default animation, but without shadow and native header transition (iOS only)
      * - `slide_from_bottom` – performs a slide from bottom animation
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
      *
      * @platform ios
      */
    var swipeDirection: js.UndefOr[SwipeDirectionTypes] = js.undefined
    
    /**
      * Changes the duration (in milliseconds) of `slide_from_bottom`, `fade_from_bottom`, `fade` and `simple_push` transitions on iOS. Defaults to `350`.
      * The duration of `default` and `flip` transitions isn't customizable.
      *
      * @platform ios
      */
    var transitionDuration: js.UndefOr[Double] = js.undefined
  }
  object ScreenProps {
    
    inline def apply(): ScreenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScreenProps]
    }
    
    extension [Self <: ScreenProps](x: Self) {
      
      inline def setActive(value: `0` | `1` | (AnimatedInterpolation[Double | String])): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setActivityState(value: `0` | `1` | `2` | (AnimatedInterpolation[Double | String])): Self = StObject.set(x, "activityState", value.asInstanceOf[js.Any])
      
      inline def setActivityStateUndefined: Self = StObject.set(x, "activityState", js.undefined)
      
      inline def setCustomAnimationOnSwipe(value: Boolean): Self = StObject.set(x, "customAnimationOnSwipe", value.asInstanceOf[js.Any])
      
      inline def setCustomAnimationOnSwipeUndefined: Self = StObject.set(x, "customAnimationOnSwipe", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFreezeOnBlur(value: Boolean): Self = StObject.set(x, "freezeOnBlur", value.asInstanceOf[js.Any])
      
      inline def setFreezeOnBlurUndefined: Self = StObject.set(x, "freezeOnBlur", js.undefined)
      
      inline def setFullScreenSwipeEnabled(value: Boolean): Self = StObject.set(x, "fullScreenSwipeEnabled", value.asInstanceOf[js.Any])
      
      inline def setFullScreenSwipeEnabledUndefined: Self = StObject.set(x, "fullScreenSwipeEnabled", js.undefined)
      
      inline def setGestureEnabled(value: Boolean): Self = StObject.set(x, "gestureEnabled", value.asInstanceOf[js.Any])
      
      inline def setGestureEnabledUndefined: Self = StObject.set(x, "gestureEnabled", js.undefined)
      
      inline def setGestureResponseDistance(value: GestureResponseDistanceType): Self = StObject.set(x, "gestureResponseDistance", value.asInstanceOf[js.Any])
      
      inline def setGestureResponseDistanceUndefined: Self = StObject.set(x, "gestureResponseDistance", js.undefined)
      
      inline def setHideKeyboardOnSwipe(value: Boolean): Self = StObject.set(x, "hideKeyboardOnSwipe", value.asInstanceOf[js.Any])
      
      inline def setHideKeyboardOnSwipeUndefined: Self = StObject.set(x, "hideKeyboardOnSwipe", js.undefined)
      
      inline def setHomeIndicatorHidden(value: Boolean): Self = StObject.set(x, "homeIndicatorHidden", value.asInstanceOf[js.Any])
      
      inline def setHomeIndicatorHiddenUndefined: Self = StObject.set(x, "homeIndicatorHidden", js.undefined)
      
      inline def setIsNativeStack(value: Boolean): Self = StObject.set(x, "isNativeStack", value.asInstanceOf[js.Any])
      
      inline def setIsNativeStackUndefined: Self = StObject.set(x, "isNativeStack", js.undefined)
      
      inline def setNativeBackButtonDismissalEnabled(value: Boolean): Self = StObject.set(x, "nativeBackButtonDismissalEnabled", value.asInstanceOf[js.Any])
      
      inline def setNativeBackButtonDismissalEnabledUndefined: Self = StObject.set(x, "nativeBackButtonDismissalEnabled", js.undefined)
      
      inline def setNavigationBarColor(value: String): Self = StObject.set(x, "navigationBarColor", value.asInstanceOf[js.Any])
      
      inline def setNavigationBarColorUndefined: Self = StObject.set(x, "navigationBarColor", js.undefined)
      
      inline def setNavigationBarHidden(value: Boolean): Self = StObject.set(x, "navigationBarHidden", value.asInstanceOf[js.Any])
      
      inline def setNavigationBarHiddenUndefined: Self = StObject.set(x, "navigationBarHidden", js.undefined)
      
      inline def setOnAppear(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onAppear", js.Any.fromFunction1(value))
      
      inline def setOnAppearUndefined: Self = StObject.set(x, "onAppear", js.undefined)
      
      inline def setOnComponentRef(value: /* view */ Any => Unit): Self = StObject.set(x, "onComponentRef", js.Any.fromFunction1(value))
      
      inline def setOnComponentRefUndefined: Self = StObject.set(x, "onComponentRef", js.undefined)
      
      inline def setOnDisappear(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onDisappear", js.Any.fromFunction1(value))
      
      inline def setOnDisappearUndefined: Self = StObject.set(x, "onDisappear", js.undefined)
      
      inline def setOnDismissed(value: /* e */ NativeSyntheticEvent[DismissCount] => Unit): Self = StObject.set(x, "onDismissed", js.Any.fromFunction1(value))
      
      inline def setOnDismissedUndefined: Self = StObject.set(x, "onDismissed", js.undefined)
      
      inline def setOnHeaderBackButtonClicked(value: () => Unit): Self = StObject.set(x, "onHeaderBackButtonClicked", js.Any.fromFunction0(value))
      
      inline def setOnHeaderBackButtonClickedUndefined: Self = StObject.set(x, "onHeaderBackButtonClicked", js.undefined)
      
      inline def setOnNativeDismissCancelled(value: /* e */ NativeSyntheticEvent[DismissCount] => Unit): Self = StObject.set(x, "onNativeDismissCancelled", js.Any.fromFunction1(value))
      
      inline def setOnNativeDismissCancelledUndefined: Self = StObject.set(x, "onNativeDismissCancelled", js.undefined)
      
      inline def setOnTransitionProgress(value: /* e */ NativeSyntheticEvent[TransitionProgressEventType] => Unit): Self = StObject.set(x, "onTransitionProgress", js.Any.fromFunction1(value))
      
      inline def setOnTransitionProgressUndefined: Self = StObject.set(x, "onTransitionProgress", js.undefined)
      
      inline def setOnWillAppear(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onWillAppear", js.Any.fromFunction1(value))
      
      inline def setOnWillAppearUndefined: Self = StObject.set(x, "onWillAppear", js.undefined)
      
      inline def setOnWillDisappear(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onWillDisappear", js.Any.fromFunction1(value))
      
      inline def setOnWillDisappearUndefined: Self = StObject.set(x, "onWillDisappear", js.undefined)
      
      inline def setPreventNativeDismiss(value: Boolean): Self = StObject.set(x, "preventNativeDismiss", value.asInstanceOf[js.Any])
      
      inline def setPreventNativeDismissUndefined: Self = StObject.set(x, "preventNativeDismiss", js.undefined)
      
      inline def setRef(value: Ref[View]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ View | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setReplaceAnimation(value: ScreenReplaceTypes): Self = StObject.set(x, "replaceAnimation", value.asInstanceOf[js.Any])
      
      inline def setReplaceAnimationUndefined: Self = StObject.set(x, "replaceAnimation", js.undefined)
      
      inline def setScreenOrientation(value: ScreenOrientationTypes): Self = StObject.set(x, "screenOrientation", value.asInstanceOf[js.Any])
      
      inline def setScreenOrientationUndefined: Self = StObject.set(x, "screenOrientation", js.undefined)
      
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
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeScreens.reactNativeScreensStrings.push
    - typings.reactNativeScreens.reactNativeScreensStrings.pop
  */
  trait ScreenReplaceTypes extends StObject
  object ScreenReplaceTypes {
    
    inline def pop: typings.reactNativeScreens.reactNativeScreensStrings.pop = "pop".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.pop]
    
    inline def push: typings.reactNativeScreens.reactNativeScreensStrings.push = "push".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.push]
  }
  
  trait ScreenStackHeaderConfigProps
    extends StObject
       with ViewProps {
    
    /**
      * Whether to show the back button with custom left side of the header.
      */
    var backButtonInCustomView: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Title to display in the back button.
      * @platform ios.
      */
    var backTitle: js.UndefOr[String] = js.undefined
    
    /**
      * Allows for customizing font family to be used for back button title on iOS.
      * @platform ios
      */
    var backTitleFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * Allows for customizing font size to be used for back button title on iOS.
      * @platform ios
      */
    var backTitleFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Controls the color of the navigation header.
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * Blur effect to be applied to the header. Works with backgroundColor's alpha < 1.
      * @platform ios
      */
    var blurEffect: js.UndefOr[BlurEffectTypes] = js.undefined
    
    /**
      * Controls the color of items rendered on the header. This includes back icon, back text (iOS only) and title text. If you want the title to have different color use titleColor property.
      */
    var color: js.UndefOr[String] = js.undefined
    
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
      * When set to true the header will be hidden while the parent Screen is on the top of the stack. The default value is false.
      */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean indicating whether to hide the back button in header.
      */
    var hideBackButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean indicating whether to hide the elevation shadow or the bottom border on the header.
      */
    var hideShadow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean to set native property to prefer large title header (like in iOS setting).
      * For large title to collapse on scroll, the content of the screen should be wrapped in a scrollable view such as `ScrollView` or `FlatList`.
      * If the scrollable area doesn't fill the screen, the large title won't collapse on scroll.
      * Only supported on iOS.
      *
      * @platform ios
      */
    var largeTitle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls the color of the navigation header when the edge of any scrollable content reaches the matching edge of the navigation bar.
      */
    var largeTitleBackgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * Customize the color to be used for the large title. By default uses the titleColor property.
      * @platform ios
      */
    var largeTitleColor: js.UndefOr[String] = js.undefined
    
    /**
      * Customize font family to be used for the large title.
      * @platform ios
      */
    var largeTitleFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * Customize the size of the font to be used for the large title.
      * @platform ios
      */
    var largeTitleFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Customize the weight of the font to be used for the large title.
      * @platform ios
      */
    var largeTitleFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * Boolean that allows for disabling drop shadow under navigation header when the edge of any scrollable content reaches the matching edge of the navigation bar.
      */
    var largeTitleHideShadow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback which is executed when screen header is attached
      */
    var onAttached: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback which is executed when screen header is detached
      */
    var onDetached: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * String that can be displayed in the header as a fallback for `headerTitle`.
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * Allows for setting text color of the title.
      */
    var titleColor: js.UndefOr[String] = js.undefined
    
    /**
      * Customize font family to be used for the title.
      */
    var titleFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * Customize the size of the font to be used for the title.
      */
    var titleFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Customize the weight of the font to be used for the title.
      */
    var titleFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * A flag to that lets you opt out of insetting the header. You may want to
      * set this to `false` if you use an opaque status bar. Defaults to `true`.
      * Only supported on Android. Insets are always applied on iOS because the
      * header cannot be opaque.
      *
      * @platform android
      */
    var topInsetEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean indicating whether the navigation bar is translucent.
      */
    var translucent: js.UndefOr[Boolean] = js.undefined
  }
  object ScreenStackHeaderConfigProps {
    
    inline def apply(): ScreenStackHeaderConfigProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScreenStackHeaderConfigProps]
    }
    
    extension [Self <: ScreenStackHeaderConfigProps](x: Self) {
      
      inline def setBackButtonInCustomView(value: Boolean): Self = StObject.set(x, "backButtonInCustomView", value.asInstanceOf[js.Any])
      
      inline def setBackButtonInCustomViewUndefined: Self = StObject.set(x, "backButtonInCustomView", js.undefined)
      
      inline def setBackTitle(value: String): Self = StObject.set(x, "backTitle", value.asInstanceOf[js.Any])
      
      inline def setBackTitleFontFamily(value: String): Self = StObject.set(x, "backTitleFontFamily", value.asInstanceOf[js.Any])
      
      inline def setBackTitleFontFamilyUndefined: Self = StObject.set(x, "backTitleFontFamily", js.undefined)
      
      inline def setBackTitleFontSize(value: Double): Self = StObject.set(x, "backTitleFontSize", value.asInstanceOf[js.Any])
      
      inline def setBackTitleFontSizeUndefined: Self = StObject.set(x, "backTitleFontSize", js.undefined)
      
      inline def setBackTitleUndefined: Self = StObject.set(x, "backTitle", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBlurEffect(value: BlurEffectTypes): Self = StObject.set(x, "blurEffect", value.asInstanceOf[js.Any])
      
      inline def setBlurEffectUndefined: Self = StObject.set(x, "blurEffect", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDirection(value: rtl | ltr): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisableBackButtonMenu(value: Boolean): Self = StObject.set(x, "disableBackButtonMenu", value.asInstanceOf[js.Any])
      
      inline def setDisableBackButtonMenuUndefined: Self = StObject.set(x, "disableBackButtonMenu", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHideBackButton(value: Boolean): Self = StObject.set(x, "hideBackButton", value.asInstanceOf[js.Any])
      
      inline def setHideBackButtonUndefined: Self = StObject.set(x, "hideBackButton", js.undefined)
      
      inline def setHideShadow(value: Boolean): Self = StObject.set(x, "hideShadow", value.asInstanceOf[js.Any])
      
      inline def setHideShadowUndefined: Self = StObject.set(x, "hideShadow", js.undefined)
      
      inline def setLargeTitle(value: Boolean): Self = StObject.set(x, "largeTitle", value.asInstanceOf[js.Any])
      
      inline def setLargeTitleBackgroundColor(value: String): Self = StObject.set(x, "largeTitleBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setLargeTitleBackgroundColorUndefined: Self = StObject.set(x, "largeTitleBackgroundColor", js.undefined)
      
      inline def setLargeTitleColor(value: String): Self = StObject.set(x, "largeTitleColor", value.asInstanceOf[js.Any])
      
      inline def setLargeTitleColorUndefined: Self = StObject.set(x, "largeTitleColor", js.undefined)
      
      inline def setLargeTitleFontFamily(value: String): Self = StObject.set(x, "largeTitleFontFamily", value.asInstanceOf[js.Any])
      
      inline def setLargeTitleFontFamilyUndefined: Self = StObject.set(x, "largeTitleFontFamily", js.undefined)
      
      inline def setLargeTitleFontSize(value: Double): Self = StObject.set(x, "largeTitleFontSize", value.asInstanceOf[js.Any])
      
      inline def setLargeTitleFontSizeUndefined: Self = StObject.set(x, "largeTitleFontSize", js.undefined)
      
      inline def setLargeTitleFontWeight(value: String): Self = StObject.set(x, "largeTitleFontWeight", value.asInstanceOf[js.Any])
      
      inline def setLargeTitleFontWeightUndefined: Self = StObject.set(x, "largeTitleFontWeight", js.undefined)
      
      inline def setLargeTitleHideShadow(value: Boolean): Self = StObject.set(x, "largeTitleHideShadow", value.asInstanceOf[js.Any])
      
      inline def setLargeTitleHideShadowUndefined: Self = StObject.set(x, "largeTitleHideShadow", js.undefined)
      
      inline def setLargeTitleUndefined: Self = StObject.set(x, "largeTitle", js.undefined)
      
      inline def setOnAttached(value: () => Unit): Self = StObject.set(x, "onAttached", js.Any.fromFunction0(value))
      
      inline def setOnAttachedUndefined: Self = StObject.set(x, "onAttached", js.undefined)
      
      inline def setOnDetached(value: () => Unit): Self = StObject.set(x, "onDetached", js.Any.fromFunction0(value))
      
      inline def setOnDetachedUndefined: Self = StObject.set(x, "onDetached", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleColor(value: String): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      inline def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      inline def setTitleFontFamily(value: String): Self = StObject.set(x, "titleFontFamily", value.asInstanceOf[js.Any])
      
      inline def setTitleFontFamilyUndefined: Self = StObject.set(x, "titleFontFamily", js.undefined)
      
      inline def setTitleFontSize(value: Double): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
      
      inline def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
      
      inline def setTitleFontWeight(value: String): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
      
      inline def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTopInsetEnabled(value: Boolean): Self = StObject.set(x, "topInsetEnabled", value.asInstanceOf[js.Any])
      
      inline def setTopInsetEnabledUndefined: Self = StObject.set(x, "topInsetEnabled", js.undefined)
      
      inline def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
      
      inline def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
    }
  }
  
  trait ScreenStackProps
    extends StObject
       with ViewProps {
    
    /**
      * A callback that gets called when the current screen finishes its transition.
      */
    var onFinishTransitioning: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
  }
  object ScreenStackProps {
    
    inline def apply(): ScreenStackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScreenStackProps]
    }
    
    extension [Self <: ScreenStackProps](x: Self) {
      
      inline def setOnFinishTransitioning(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onFinishTransitioning", js.Any.fromFunction1(value))
      
      inline def setOnFinishTransitioningUndefined: Self = StObject.set(x, "onFinishTransitioning", js.undefined)
    }
  }
  
  trait SearchBarProps extends StObject {
    
    /**
      * The auto-capitalization behavior
      */
    var autoCapitalize: js.UndefOr[none | words | sentences | characters] = js.undefined
    
    /**
      * Automatically focuses search bar on mount
      *
      * @platform android
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The search field background color
      */
    var barTintColor: js.UndefOr[String] = js.undefined
    
    /**
      * The text to be used instead of default `Cancel` button text
      *
      * @platform ios
      */
    var cancelButtonText: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies whether the back button should close search bar's text input or not.
      *
      * @platform android
      */
    var disableBackButtonOverride: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The search and close icon color shown in the header
      *
      * @plaform android
      */
    var headerIconColor: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates whether to hide the navigation bar
      *
      * @platform ios
      */
    var hideNavigationBar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether to hide the search bar when scrolling
      *
      * @platform ios
      */
    var hideWhenScrolling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The search hint text color
      *
      * @plaform android
      */
    var hintTextColor: js.UndefOr[String] = js.undefined
    
    /**
      * Sets type of the input. Defaults to `text`.
      *
      * @platform android
      */
    var inputType: js.UndefOr[text | phone | number | email] = js.undefined
    
    /**
      * Indicates whether to to obscure the underlying content
      */
    var obscureBackground: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A callback that gets called when search bar has lost focus
      */
    var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
    
    /**
      * A callback that gets called when the cancel button is pressed
      *
      * @platform ios
      */
    var onCancelButtonPress: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
    
    /**
      * A callback that gets called when the text changes. It receives the current text value of the search bar.
      */
    var onChangeText: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputFocusEventData], Unit]] = js.undefined
    
    /**
      * A callback that gets called when search bar is closed
      *
      * @platform android
      */
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A callback that gets called when search bar has received focus
      */
    var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
    
    /**
      * A callback that gets called when search bar is opened
      *
      * @platform android
      */
    var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A callback that gets called when the search button is pressed. It receives the current text value of the search bar.
      */
    var onSearchButtonPress: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputFocusEventData], Unit]] = js.undefined
    
    /**
      * Text displayed when search field is empty
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * Show the search hint icon when search bar is focused
      *
      * @plaform android
      * @default true
      */
    var shouldShowHintSearchIcon: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The search field text color
      */
    var textColor: js.UndefOr[String] = js.undefined
    
    /**
      * The color for the cursor caret and cancel button text.
      *
      * @platform ios
      */
    var tintColor: js.UndefOr[String] = js.undefined
  }
  object SearchBarProps {
    
    inline def apply(): SearchBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchBarProps]
    }
    
    extension [Self <: SearchBarProps](x: Self) {
      
      inline def setAutoCapitalize(value: none | words | sentences | characters): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setBarTintColor(value: String): Self = StObject.set(x, "barTintColor", value.asInstanceOf[js.Any])
      
      inline def setBarTintColorUndefined: Self = StObject.set(x, "barTintColor", js.undefined)
      
      inline def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
      
      inline def setDisableBackButtonOverride(value: Boolean): Self = StObject.set(x, "disableBackButtonOverride", value.asInstanceOf[js.Any])
      
      inline def setDisableBackButtonOverrideUndefined: Self = StObject.set(x, "disableBackButtonOverride", js.undefined)
      
      inline def setHeaderIconColor(value: String): Self = StObject.set(x, "headerIconColor", value.asInstanceOf[js.Any])
      
      inline def setHeaderIconColorUndefined: Self = StObject.set(x, "headerIconColor", js.undefined)
      
      inline def setHideNavigationBar(value: Boolean): Self = StObject.set(x, "hideNavigationBar", value.asInstanceOf[js.Any])
      
      inline def setHideNavigationBarUndefined: Self = StObject.set(x, "hideNavigationBar", js.undefined)
      
      inline def setHideWhenScrolling(value: Boolean): Self = StObject.set(x, "hideWhenScrolling", value.asInstanceOf[js.Any])
      
      inline def setHideWhenScrollingUndefined: Self = StObject.set(x, "hideWhenScrolling", js.undefined)
      
      inline def setHintTextColor(value: String): Self = StObject.set(x, "hintTextColor", value.asInstanceOf[js.Any])
      
      inline def setHintTextColorUndefined: Self = StObject.set(x, "hintTextColor", js.undefined)
      
      inline def setInputType(value: text | phone | number | email): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
      
      inline def setObscureBackground(value: Boolean): Self = StObject.set(x, "obscureBackground", value.asInstanceOf[js.Any])
      
      inline def setObscureBackgroundUndefined: Self = StObject.set(x, "obscureBackground", js.undefined)
      
      inline def setOnBlur(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCancelButtonPress(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onCancelButtonPress", js.Any.fromFunction1(value))
      
      inline def setOnCancelButtonPressUndefined: Self = StObject.set(x, "onCancelButtonPress", js.undefined)
      
      inline def setOnChangeText(value: /* e */ NativeSyntheticEvent[TextInputFocusEventData] => Unit): Self = StObject.set(x, "onChangeText", js.Any.fromFunction1(value))
      
      inline def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnFocus(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnSearchButtonPress(value: /* e */ NativeSyntheticEvent[TextInputFocusEventData] => Unit): Self = StObject.set(x, "onSearchButtonPress", js.Any.fromFunction1(value))
      
      inline def setOnSearchButtonPressUndefined: Self = StObject.set(x, "onSearchButtonPress", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setShouldShowHintSearchIcon(value: Boolean): Self = StObject.set(x, "shouldShowHintSearchIcon", value.asInstanceOf[js.Any])
      
      inline def setShouldShowHintSearchIconUndefined: Self = StObject.set(x, "shouldShowHintSearchIcon", js.undefined)
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeScreens.reactNativeScreensStrings.default
    - typings.reactNativeScreens.reactNativeScreensStrings.fade
    - typings.reactNativeScreens.reactNativeScreensStrings.fade_from_bottom
    - typings.reactNativeScreens.reactNativeScreensStrings.flip
    - typings.reactNativeScreens.reactNativeScreensStrings.none
    - typings.reactNativeScreens.reactNativeScreensStrings.simple_push
    - typings.reactNativeScreens.reactNativeScreensStrings.slide_from_bottom
    - typings.reactNativeScreens.reactNativeScreensStrings.slide_from_right
    - typings.reactNativeScreens.reactNativeScreensStrings.slide_from_left
  */
  trait StackAnimationTypes extends StObject
  object StackAnimationTypes {
    
    inline def default: typings.reactNativeScreens.reactNativeScreensStrings.default = "default".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.default]
    
    inline def fade: typings.reactNativeScreens.reactNativeScreensStrings.fade = "fade".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.fade]
    
    inline def fade_from_bottom: typings.reactNativeScreens.reactNativeScreensStrings.fade_from_bottom = "fade_from_bottom".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.fade_from_bottom]
    
    inline def flip: typings.reactNativeScreens.reactNativeScreensStrings.flip = "flip".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.flip]
    
    inline def none: typings.reactNativeScreens.reactNativeScreensStrings.none = "none".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.none]
    
    inline def simple_push: typings.reactNativeScreens.reactNativeScreensStrings.simple_push = "simple_push".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.simple_push]
    
    inline def slide_from_bottom: typings.reactNativeScreens.reactNativeScreensStrings.slide_from_bottom = "slide_from_bottom".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.slide_from_bottom]
    
    inline def slide_from_left: typings.reactNativeScreens.reactNativeScreensStrings.slide_from_left = "slide_from_left".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.slide_from_left]
    
    inline def slide_from_right: typings.reactNativeScreens.reactNativeScreensStrings.slide_from_right = "slide_from_right".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.slide_from_right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeScreens.reactNativeScreensStrings.push
    - typings.reactNativeScreens.reactNativeScreensStrings.modal
    - typings.reactNativeScreens.reactNativeScreensStrings.transparentModal
    - typings.reactNativeScreens.reactNativeScreensStrings.containedModal
    - typings.reactNativeScreens.reactNativeScreensStrings.containedTransparentModal
    - typings.reactNativeScreens.reactNativeScreensStrings.fullScreenModal
    - typings.reactNativeScreens.reactNativeScreensStrings.formSheet
  */
  trait StackPresentationTypes extends StObject
  object StackPresentationTypes {
    
    inline def containedModal: typings.reactNativeScreens.reactNativeScreensStrings.containedModal = "containedModal".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.containedModal]
    
    inline def containedTransparentModal: typings.reactNativeScreens.reactNativeScreensStrings.containedTransparentModal = "containedTransparentModal".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.containedTransparentModal]
    
    inline def formSheet: typings.reactNativeScreens.reactNativeScreensStrings.formSheet = "formSheet".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.formSheet]
    
    inline def fullScreenModal: typings.reactNativeScreens.reactNativeScreensStrings.fullScreenModal = "fullScreenModal".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.fullScreenModal]
    
    inline def modal: typings.reactNativeScreens.reactNativeScreensStrings.modal = "modal".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.modal]
    
    inline def push: typings.reactNativeScreens.reactNativeScreensStrings.push = "push".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.push]
    
    inline def transparentModal: typings.reactNativeScreens.reactNativeScreensStrings.transparentModal = "transparentModal".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.transparentModal]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeScreens.reactNativeScreensStrings.vertical
    - typings.reactNativeScreens.reactNativeScreensStrings.horizontal
  */
  trait SwipeDirectionTypes extends StObject
  object SwipeDirectionTypes {
    
    inline def horizontal: typings.reactNativeScreens.reactNativeScreensStrings.horizontal = "horizontal".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.horizontal]
    
    inline def vertical: typings.reactNativeScreens.reactNativeScreensStrings.vertical = "vertical".asInstanceOf[typings.reactNativeScreens.reactNativeScreensStrings.vertical]
  }
  
  trait TransitionProgressEventType extends StObject {
    
    var closing: Double
    
    var goingForward: Double
    
    var progress: Double
  }
  object TransitionProgressEventType {
    
    inline def apply(closing: Double, goingForward: Double, progress: Double): TransitionProgressEventType = {
      val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any], goingForward = goingForward.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionProgressEventType]
    }
    
    extension [Self <: TransitionProgressEventType](x: Self) {
      
      inline def setClosing(value: Double): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
      
      inline def setGoingForward(value: Double): Self = StObject.set(x, "goingForward", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
}
