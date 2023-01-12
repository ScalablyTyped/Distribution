package typings.reactNativeScreens.anon

import typings.react.mod.ComponentClass
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.TargetedEvent
import typings.reactNative.mod.ViewStyle
import typings.reactNativeReanimated.mod.Animated.AnimateProps
import typings.reactNativeScreens.libTypescriptTypesMod.GestureResponseDistanceType
import typings.reactNativeScreens.libTypescriptTypesMod.ScreenOrientationTypes
import typings.reactNativeScreens.libTypescriptTypesMod.ScreenReplaceTypes
import typings.reactNativeScreens.libTypescriptTypesMod.StackAnimationTypes
import typings.reactNativeScreens.libTypescriptTypesMod.StackPresentationTypes
import typings.reactNativeScreens.libTypescriptTypesMod.SwipeDirectionTypes
import typings.reactNativeScreens.libTypescriptTypesMod.TransitionProgressEventType
import typings.reactNativeScreens.reactNativeScreensInts.`1`
import typings.reactNativeScreens.reactNativeScreensInts.`2`
import typings.reactNativeScreens.reactNativeScreensStrings.`box-none`
import typings.reactNativeScreens.reactNativeScreensStrings.`box-only`
import typings.reactNativeScreens.reactNativeScreensStrings.`no-hide-descendants`
import typings.reactNativeScreens.reactNativeScreensStrings.assertive
import typings.reactNativeScreens.reactNativeScreensStrings.auto
import typings.reactNativeScreens.reactNativeScreensStrings.dark
import typings.reactNativeScreens.reactNativeScreensStrings.fade
import typings.reactNativeScreens.reactNativeScreensStrings.inverted
import typings.reactNativeScreens.reactNativeScreensStrings.light
import typings.reactNativeScreens.reactNativeScreensStrings.no
import typings.reactNativeScreens.reactNativeScreensStrings.none
import typings.reactNativeScreens.reactNativeScreensStrings.polite
import typings.reactNativeScreens.reactNativeScreensStrings.slide
import typings.reactNativeScreens.reactNativeScreensStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-native-screens.react-native-screens.ScreenProps, 'children' | 'active' | 'activityState' | 'customAnimationOnSwipe' | 'enabled' | 'isNativeStack' | 'freezeOnBlur' | 'fullScreenSwipeEnabled' | 'gestureEnabled' | 'gestureResponseDistance' | 'homeIndicatorHidden' | 'hideKeyboardOnSwipe' | 'nativeBackButtonDismissalEnabled' | 'navigationBarColor' | 'navigationBarHidden' | 'onAppear' | 'onComponentRef' | 'onDisappear' | 'onDismissed' | 'onHeaderBackButtonClicked' | 'onNativeDismissCancelled' | 'onTransitionProgress' | 'onWillAppear' | 'onWillDisappear' | 'preventNativeDismiss' | 'replaceAnimation' | 'screenOrientation' | 'stackAnimation' | 'stackPresentation' | 'statusBarAnimation' | 'statusBarColor' | 'statusBarHidden' | 'statusBarStyle' | 'statusBarTranslucent' | 'swipeDirection' | 'transitionDuration' | 'hitSlop' | 'onLayout' | 'pointerEvents' | 'removeClippedSubviews' | 'style' | 'testID' | 'nativeID' | 'collapsable' | 'needsOffscreenAlphaCompositing' | 'renderToHardwareTextureAndroid' | 'focusable' | 'shouldRasterizeIOS' | 'isTVSelectable' | 'hasTVPreferredFocus' | 'tvParallaxProperties' | 'tvParallaxShiftDistanceX' | 'tvParallaxShiftDistanceY' | 'tvParallaxTiltAngle' | 'tvParallaxMagnification' | 'onStartShouldSetResponder' | 'onMoveShouldSetResponder' | 'onResponderEnd' | 'onResponderGrant' | 'onResponderReject' | 'onResponderMove' | 'onResponderRelease' | 'onResponderStart' | 'onResponderTerminationRequest' | 'onResponderTerminate' | 'onStartShouldSetResponderCapture' | 'onMoveShouldSetResponderCapture' | 'onTouchStart' | 'onTouchMove' | 'onTouchEnd' | 'onTouchCancel' | 'onTouchEndCapture' | 'accessible' | 'accessibilityActions' | 'accessibilityLabel' | 'accessibilityRole' | 'accessibilityState' | 'accessibilityHint' | 'accessibilityValue' | 'onAccessibilityAction' | 'accessibilityComponentType' | 'accessibilityLiveRegion' | 'importantForAccessibility' | 'accessibilityElementsHidden' | 'accessibilityTraits' | 'accessibilityViewIsModal' | 'onAccessibilityEscape' | 'onAccessibilityTap' | 'onMagicTap' | 'accessibilityIgnoresInvertColors'> & react.react.RefAttributes<react.react.ComponentClass<react-native-reanimated.react-native-reanimated.default.AnimateProps<{}>, any>> */
trait PickScreenPropschildrenac extends StObject {
  
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
  
  var accessibilityComponentType: js.UndefOr[Any] = js.undefined
  
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityHint: js.UndefOr[String] = js.undefined
  
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
  
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  
  var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
  
  var accessibilityTraits: js.UndefOr[Any] = js.undefined
  
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
  
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  
  var accessible: js.UndefOr[Boolean] = js.undefined
  
  var active: js.UndefOr[
    typings.reactNativeScreens.reactNativeScreensInts.`0` | `1` | (AnimatedInterpolation[Double | String])
  ] = js.undefined
  
  var activityState: js.UndefOr[
    typings.reactNativeScreens.reactNativeScreensInts.`0` | `1` | `2` | (AnimatedInterpolation[Double | String])
  ] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var collapsable: js.UndefOr[Boolean] = js.undefined
  
  var customAnimationOnSwipe: js.UndefOr[Boolean] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var focusable: js.UndefOr[Boolean] = js.undefined
  
  var freezeOnBlur: js.UndefOr[Boolean] = js.undefined
  
  var fullScreenSwipeEnabled: js.UndefOr[Boolean] = js.undefined
  
  var gestureEnabled: js.UndefOr[Boolean] = js.undefined
  
  var gestureResponseDistance: js.UndefOr[GestureResponseDistanceType] = js.undefined
  
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  
  var hideKeyboardOnSwipe: js.UndefOr[Boolean] = js.undefined
  
  var hitSlop: js.UndefOr[Insets] = js.undefined
  
  var homeIndicatorHidden: js.UndefOr[Boolean] = js.undefined
  
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  
  var isNativeStack: js.UndefOr[Boolean] = js.undefined
  
  var isTVSelectable: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[Key | Null] = js.undefined
  
  var nativeBackButtonDismissalEnabled: js.UndefOr[Boolean] = js.undefined
  
  var nativeID: js.UndefOr[String] = js.undefined
  
  var navigationBarColor: js.UndefOr[String] = js.undefined
  
  var navigationBarHidden: js.UndefOr[Boolean] = js.undefined
  
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
  
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
  
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onAppear: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
  
  var onComponentRef: js.UndefOr[js.Function1[/* view */ Any, Unit]] = js.undefined
  
  var onDisappear: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
  
  var onDismissed: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[DismissCount], Unit]] = js.undefined
  
  var onHeaderBackButtonClicked: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onNativeDismissCancelled: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[DismissCount], Unit]] = js.undefined
  
  var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTransitionProgress: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TransitionProgressEventType], Unit]] = js.undefined
  
  var onWillAppear: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
  
  var onWillDisappear: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
  
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
  
  var preventNativeDismiss: js.UndefOr[Boolean] = js.undefined
  
  var ref: js.UndefOr[Ref[ComponentClass[AnimateProps[js.Object], Any]]] = js.undefined
  
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
  
  var replaceAnimation: js.UndefOr[ScreenReplaceTypes] = js.undefined
  
  var screenOrientation: js.UndefOr[ScreenOrientationTypes] = js.undefined
  
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
  
  var stackAnimation: js.UndefOr[StackAnimationTypes] = js.undefined
  
  var stackPresentation: js.UndefOr[StackPresentationTypes] = js.undefined
  
  var statusBarAnimation: js.UndefOr[none | fade | slide] = js.undefined
  
  var statusBarColor: js.UndefOr[String] = js.undefined
  
  var statusBarHidden: js.UndefOr[Boolean] = js.undefined
  
  var statusBarStyle: js.UndefOr[inverted | auto | light | dark] = js.undefined
  
  var statusBarTranslucent: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var swipeDirection: js.UndefOr[SwipeDirectionTypes] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
  
  var transitionDuration: js.UndefOr[Double] = js.undefined
  
  var tvParallaxMagnification: js.UndefOr[Double] = js.undefined
  
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
  
  var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
  
  var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
  
  var tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
}
object PickScreenPropschildrenac {
  
  inline def apply(): PickScreenPropschildrenac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickScreenPropschildrenac]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickScreenPropschildrenac] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value*))
    
    inline def setAccessibilityComponentType(value: Any): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
    
    inline def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    inline def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    inline def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    inline def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    inline def setAccessibilityTraits(value: Any): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
    
    inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    inline def setActive(
      value: typings.reactNativeScreens.reactNativeScreensInts.`0` | `1` | (AnimatedInterpolation[Double | String])
    ): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setActivityState(
      value: typings.reactNativeScreens.reactNativeScreensInts.`0` | `1` | `2` | (AnimatedInterpolation[Double | String])
    ): Self = StObject.set(x, "activityState", value.asInstanceOf[js.Any])
    
    inline def setActivityStateUndefined: Self = StObject.set(x, "activityState", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
    
    inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
    
    inline def setCustomAnimationOnSwipe(value: Boolean): Self = StObject.set(x, "customAnimationOnSwipe", value.asInstanceOf[js.Any])
    
    inline def setCustomAnimationOnSwipeUndefined: Self = StObject.set(x, "customAnimationOnSwipe", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setFreezeOnBlur(value: Boolean): Self = StObject.set(x, "freezeOnBlur", value.asInstanceOf[js.Any])
    
    inline def setFreezeOnBlurUndefined: Self = StObject.set(x, "freezeOnBlur", js.undefined)
    
    inline def setFullScreenSwipeEnabled(value: Boolean): Self = StObject.set(x, "fullScreenSwipeEnabled", value.asInstanceOf[js.Any])
    
    inline def setFullScreenSwipeEnabledUndefined: Self = StObject.set(x, "fullScreenSwipeEnabled", js.undefined)
    
    inline def setGestureEnabled(value: Boolean): Self = StObject.set(x, "gestureEnabled", value.asInstanceOf[js.Any])
    
    inline def setGestureEnabledUndefined: Self = StObject.set(x, "gestureEnabled", js.undefined)
    
    inline def setGestureResponseDistance(value: GestureResponseDistanceType): Self = StObject.set(x, "gestureResponseDistance", value.asInstanceOf[js.Any])
    
    inline def setGestureResponseDistanceUndefined: Self = StObject.set(x, "gestureResponseDistance", js.undefined)
    
    inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    inline def setHideKeyboardOnSwipe(value: Boolean): Self = StObject.set(x, "hideKeyboardOnSwipe", value.asInstanceOf[js.Any])
    
    inline def setHideKeyboardOnSwipeUndefined: Self = StObject.set(x, "hideKeyboardOnSwipe", js.undefined)
    
    inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setHomeIndicatorHidden(value: Boolean): Self = StObject.set(x, "homeIndicatorHidden", value.asInstanceOf[js.Any])
    
    inline def setHomeIndicatorHiddenUndefined: Self = StObject.set(x, "homeIndicatorHidden", js.undefined)
    
    inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    inline def setIsNativeStack(value: Boolean): Self = StObject.set(x, "isNativeStack", value.asInstanceOf[js.Any])
    
    inline def setIsNativeStackUndefined: Self = StObject.set(x, "isNativeStack", js.undefined)
    
    inline def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setNativeBackButtonDismissalEnabled(value: Boolean): Self = StObject.set(x, "nativeBackButtonDismissalEnabled", value.asInstanceOf[js.Any])
    
    inline def setNativeBackButtonDismissalEnabledUndefined: Self = StObject.set(x, "nativeBackButtonDismissalEnabled", js.undefined)
    
    inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    inline def setNavigationBarColor(value: String): Self = StObject.set(x, "navigationBarColor", value.asInstanceOf[js.Any])
    
    inline def setNavigationBarColorUndefined: Self = StObject.set(x, "navigationBarColor", js.undefined)
    
    inline def setNavigationBarHidden(value: Boolean): Self = StObject.set(x, "navigationBarHidden", value.asInstanceOf[js.Any])
    
    inline def setNavigationBarHiddenUndefined: Self = StObject.set(x, "navigationBarHidden", js.undefined)
    
    inline def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
    
    inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
    
    inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    inline def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
    
    inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    inline def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
    
    inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
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
    
    inline def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
    
    inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    inline def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
    
    inline def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
    
    inline def setOnNativeDismissCancelled(value: /* e */ NativeSyntheticEvent[DismissCount] => Unit): Self = StObject.set(x, "onNativeDismissCancelled", js.Any.fromFunction1(value))
    
    inline def setOnNativeDismissCancelledUndefined: Self = StObject.set(x, "onNativeDismissCancelled", js.undefined)
    
    inline def setOnResponderEnd(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
    
    inline def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
    
    inline def setOnResponderGrant(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
    
    inline def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
    
    inline def setOnResponderMove(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
    
    inline def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
    
    inline def setOnResponderReject(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
    
    inline def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
    
    inline def setOnResponderRelease(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
    
    inline def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
    
    inline def setOnResponderStart(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
    
    inline def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
    
    inline def setOnResponderTerminate(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
    
    inline def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
    
    inline def setOnResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    inline def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
    
    inline def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def setOnStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
    
    inline def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
    
    inline def setOnTouchCancel(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    inline def setOnTouchEndCapture(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
    
    inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOnTransitionProgress(value: /* e */ NativeSyntheticEvent[TransitionProgressEventType] => Unit): Self = StObject.set(x, "onTransitionProgress", js.Any.fromFunction1(value))
    
    inline def setOnTransitionProgressUndefined: Self = StObject.set(x, "onTransitionProgress", js.undefined)
    
    inline def setOnWillAppear(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onWillAppear", js.Any.fromFunction1(value))
    
    inline def setOnWillAppearUndefined: Self = StObject.set(x, "onWillAppear", js.undefined)
    
    inline def setOnWillDisappear(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onWillDisappear", js.Any.fromFunction1(value))
    
    inline def setOnWillDisappearUndefined: Self = StObject.set(x, "onWillDisappear", js.undefined)
    
    inline def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    inline def setPreventNativeDismiss(value: Boolean): Self = StObject.set(x, "preventNativeDismiss", value.asInstanceOf[js.Any])
    
    inline def setPreventNativeDismissUndefined: Self = StObject.set(x, "preventNativeDismiss", js.undefined)
    
    inline def setRef(value: Ref[ComponentClass[AnimateProps[js.Object], Any]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ (ComponentClass[AnimateProps[js.Object], Any]) | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    
    inline def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
    
    inline def setReplaceAnimation(value: ScreenReplaceTypes): Self = StObject.set(x, "replaceAnimation", value.asInstanceOf[js.Any])
    
    inline def setReplaceAnimationUndefined: Self = StObject.set(x, "replaceAnimation", js.undefined)
    
    inline def setScreenOrientation(value: ScreenOrientationTypes): Self = StObject.set(x, "screenOrientation", value.asInstanceOf[js.Any])
    
    inline def setScreenOrientationUndefined: Self = StObject.set(x, "screenOrientation", js.undefined)
    
    inline def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
    
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
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSwipeDirection(value: SwipeDirectionTypes): Self = StObject.set(x, "swipeDirection", value.asInstanceOf[js.Any])
    
    inline def setSwipeDirectionUndefined: Self = StObject.set(x, "swipeDirection", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    inline def setTvParallaxMagnification(value: Double): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
    
    inline def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
    
    inline def setTvParallaxShiftDistanceX(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
    
    inline def setTvParallaxShiftDistanceY(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
    
    inline def setTvParallaxTiltAngle(value: Double): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
  }
}
