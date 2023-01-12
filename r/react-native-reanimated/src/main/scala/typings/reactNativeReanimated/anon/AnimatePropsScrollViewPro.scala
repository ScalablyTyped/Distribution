package typings.reactNativeReanimated.anon

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactNative.anon.AutoscrollToTopThreshold
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeScrollEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.PointProp
import typings.reactNative.mod.PointerEvent
import typings.reactNative.mod.ScrollViewProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.ViewStyle
import typings.reactNativeReanimated.mod.Animated.AnimateStyle
import typings.reactNativeReanimated.mod.Animated.AnimatedNode
import typings.reactNativeReanimated.mod.Animated.StylesOrDefault
import typings.reactNativeReanimated.mod.BaseAnimationBuilder
import typings.reactNativeReanimated.mod.EntryAnimationsValues
import typings.reactNativeReanimated.mod.EntryExitAnimationFunction
import typings.reactNativeReanimated.mod.ExitAnimationsValues
import typings.reactNativeReanimated.mod.Keyframe
import typings.reactNativeReanimated.mod.LayoutAnimation
import typings.reactNativeReanimated.mod.LayoutAnimationFunction
import typings.reactNativeReanimated.mod.LayoutAnimationsValues
import typings.reactNativeReanimated.reactNativeReanimatedStrings.`box-none`
import typings.reactNativeReanimated.reactNativeReanimatedStrings.`box-only`
import typings.reactNativeReanimated.reactNativeReanimatedStrings.`no-hide-descendants`
import typings.reactNativeReanimated.reactNativeReanimatedStrings.`on-drag`
import typings.reactNativeReanimated.reactNativeReanimatedStrings.always
import typings.reactNativeReanimated.reactNativeReanimatedStrings.assertive
import typings.reactNativeReanimated.reactNativeReanimatedStrings.auto
import typings.reactNativeReanimated.reactNativeReanimatedStrings.automatic
import typings.reactNativeReanimated.reactNativeReanimatedStrings.black
import typings.reactNativeReanimated.reactNativeReanimatedStrings.center
import typings.reactNativeReanimated.reactNativeReanimatedStrings.default
import typings.reactNativeReanimated.reactNativeReanimatedStrings.end
import typings.reactNativeReanimated.reactNativeReanimatedStrings.fast
import typings.reactNativeReanimated.reactNativeReanimatedStrings.handled
import typings.reactNativeReanimated.reactNativeReanimatedStrings.interactive
import typings.reactNativeReanimated.reactNativeReanimatedStrings.never
import typings.reactNativeReanimated.reactNativeReanimatedStrings.no
import typings.reactNativeReanimated.reactNativeReanimatedStrings.none
import typings.reactNativeReanimated.reactNativeReanimatedStrings.normal
import typings.reactNativeReanimated.reactNativeReanimatedStrings.polite
import typings.reactNativeReanimated.reactNativeReanimatedStrings.scrollableAxes
import typings.reactNativeReanimated.reactNativeReanimatedStrings.start
import typings.reactNativeReanimated.reactNativeReanimatedStrings.white
import typings.reactNativeReanimated.reactNativeReanimatedStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-reanimated.react-native-reanimated.Animated.AnimateProps<react-native.react-native.ScrollViewProps> */
trait AnimatePropsScrollViewPro extends StObject {
  
  var StickyHeaderComponent: js.UndefOr[ComponentType[Any] | AnimatedNode[js.UndefOr[ComponentType[Any]]]] = js.undefined
  
  var accessibilityActions: js.UndefOr[
    js.Array[AccessibilityActionInfo] | AnimatedNode[js.UndefOr[js.Array[AccessibilityActionInfo]]]
  ] = js.undefined
  
  var accessibilityElementsHidden: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var accessibilityHint: js.UndefOr[String | AnimatedNode[js.UndefOr[String]]] = js.undefined
  
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var accessibilityLabel: js.UndefOr[String | AnimatedNode[js.UndefOr[String]]] = js.undefined
  
  var accessibilityLabelledBy: js.UndefOr[
    String | js.Array[String] | (AnimatedNode[js.UndefOr[String | js.Array[String]]])
  ] = js.undefined
  
  var accessibilityLanguage: js.UndefOr[String | AnimatedNode[js.UndefOr[String]]] = js.undefined
  
  var accessibilityLiveRegion: js.UndefOr[
    none | polite | assertive | (AnimatedNode[js.UndefOr[none | polite | assertive]])
  ] = js.undefined
  
  var accessibilityRole: js.UndefOr[AccessibilityRole | AnimatedNode[js.UndefOr[AccessibilityRole]]] = js.undefined
  
  var accessibilityState: js.UndefOr[AccessibilityState | AnimatedNode[js.UndefOr[AccessibilityState]]] = js.undefined
  
  var accessibilityValue: js.UndefOr[AccessibilityValue | AnimatedNode[js.UndefOr[AccessibilityValue]]] = js.undefined
  
  var accessibilityViewIsModal: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var accessible: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var alwaysBounceHorizontal: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var alwaysBounceVertical: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var animatedProps: js.UndefOr[PartialAnimatePropsScroll] = js.undefined
  
  var automaticallyAdjustContentInsets: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var automaticallyAdjustKeyboardInsets: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var automaticallyAdjustsScrollIndicatorInsets: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var bounces: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var bouncesZoom: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var canCancelContentTouches: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var centerContent: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var children: js.UndefOr[ReactNode | AnimatedNode[js.UndefOr[ReactNode]]] = js.undefined
  
  var collapsable: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle] | AnimatedNode[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  
  var contentInset: js.UndefOr[Insets | AnimatedNode[js.UndefOr[Insets]]] = js.undefined
  
  var contentInsetAdjustmentBehavior: js.UndefOr[
    automatic | scrollableAxes | never | always | (AnimatedNode[js.UndefOr[automatic | scrollableAxes | never | always]])
  ] = js.undefined
  
  var contentOffset: js.UndefOr[PointProp | AnimatedNode[js.UndefOr[PointProp]]] = js.undefined
  
  var decelerationRate: js.UndefOr[fast | normal | Double | (AnimatedNode[js.UndefOr[fast | normal | Double]])] = js.undefined
  
  var directionalLockEnabled: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var disableIntervalMomentum: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var disableScrollViewPanResponder: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var endFillColor: js.UndefOr[ColorValue | AnimatedNode[js.UndefOr[ColorValue]]] = js.undefined
  
  var entering: js.UndefOr[
    BaseAnimationBuilder | TypeofBaseAnimationBuildeDelay | EntryExitAnimationFunction | Keyframe
  ] = js.undefined
  
  var exiting: js.UndefOr[
    BaseAnimationBuilder | TypeofBaseAnimationBuildeDelay | EntryExitAnimationFunction | Keyframe
  ] = js.undefined
  
  var fadingEdgeLength: js.UndefOr[Double | AnimatedNode[js.UndefOr[Double]]] = js.undefined
  
  var focusable: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var hasTVPreferredFocus: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var hitSlop: js.UndefOr[Insets | AnimatedNode[js.UndefOr[Insets]]] = js.undefined
  
  var horizontal: js.UndefOr[Boolean | Null | (AnimatedNode[js.UndefOr[Boolean | Null]])] = js.undefined
  
  var importantForAccessibility: js.UndefOr[
    auto | yes | no | `no-hide-descendants` | (AnimatedNode[js.UndefOr[auto | yes | no | `no-hide-descendants`]])
  ] = js.undefined
  
  var indicatorStyle: js.UndefOr[default | black | white | (AnimatedNode[js.UndefOr[default | black | white]])] = js.undefined
  
  var invertStickyHeaders: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var isTVSelectable: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var keyboardDismissMode: js.UndefOr[
    none | interactive | `on-drag` | (AnimatedNode[js.UndefOr[none | interactive | `on-drag`]])
  ] = js.undefined
  
  var keyboardShouldPersistTaps: js.UndefOr[
    Boolean | always | never | handled | (AnimatedNode[js.UndefOr[Boolean | always | never | handled]])
  ] = js.undefined
  
  var layout: js.UndefOr[BaseAnimationBuilder | LayoutAnimationFunction | TypeofBaseAnimationBuildeDelay] = js.undefined
  
  var maintainVisibleContentPosition: js.UndefOr[
    Null | AutoscrollToTopThreshold | (AnimatedNode[js.UndefOr[Null | AutoscrollToTopThreshold]])
  ] = js.undefined
  
  var maximumZoomScale: js.UndefOr[Double | AnimatedNode[js.UndefOr[Double]]] = js.undefined
  
  var minimumZoomScale: js.UndefOr[Double | AnimatedNode[js.UndefOr[Double]]] = js.undefined
  
  var nativeID: js.UndefOr[String | AnimatedNode[js.UndefOr[String]]] = js.undefined
  
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var nestedScrollEnabled: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var onAccessibilityAction: js.UndefOr[
    (js.Function1[/* event */ AccessibilityActionEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]])
  ] = js.undefined
  
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit] | AnimatedNode[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit] | AnimatedNode[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onContentSizeChange: js.UndefOr[
    (js.Function2[/* w */ Double, /* h */ Double, Unit]) | (AnimatedNode[js.UndefOr[js.Function2[/* w */ Double, /* h */ Double, Unit]]])
  ] = js.undefined
  
  var onLayout: js.UndefOr[
    (js.Function1[/* event */ LayoutChangeEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]])
  ] = js.undefined
  
  var onMagicTap: js.UndefOr[js.Function0[Unit] | AnimatedNode[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onMomentumScrollBegin: js.UndefOr[
    (js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]) | (AnimatedNode[
      js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]]
    ])
  ] = js.undefined
  
  var onMomentumScrollEnd: js.UndefOr[
    (js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]) | (AnimatedNode[
      js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]]
    ])
  ] = js.undefined
  
  var onMoveShouldSetResponder: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
  ] = js.undefined
  
  var onMoveShouldSetResponderCapture: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
  ] = js.undefined
  
  var onPointerCancel: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerCancelCapture: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerDown: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerDownCapture: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerEnter: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerEnterCapture: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerLeave: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerLeaveCapture: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerMove: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerMoveCapture: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerUp: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onPointerUpCapture: js.UndefOr[
    (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
  ] = js.undefined
  
  var onResponderEnd: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onResponderGrant: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onResponderMove: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onResponderReject: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onResponderRelease: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onResponderStart: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onResponderTerminate: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onResponderTerminationRequest: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
  ] = js.undefined
  
  var onScroll: js.UndefOr[
    (js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]) | (AnimatedNode[
      js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]]
    ])
  ] = js.undefined
  
  var onScrollAnimationEnd: js.UndefOr[js.Function0[Unit] | AnimatedNode[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onScrollBeginDrag: js.UndefOr[
    (js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]) | (AnimatedNode[
      js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]]
    ])
  ] = js.undefined
  
  var onScrollEndDrag: js.UndefOr[
    (js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]) | (AnimatedNode[
      js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]]
    ])
  ] = js.undefined
  
  var onScrollToTop: js.UndefOr[
    (js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]) | (AnimatedNode[
      js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]]
    ])
  ] = js.undefined
  
  var onStartShouldSetResponder: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
  ] = js.undefined
  
  var onStartShouldSetResponderCapture: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
  ] = js.undefined
  
  var onTouchCancel: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onTouchEnd: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onTouchEndCapture: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onTouchMove: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onTouchStart: js.UndefOr[
    (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var overScrollMode: js.UndefOr[auto | always | never | (AnimatedNode[js.UndefOr[auto | always | never]])] = js.undefined
  
  var pagingEnabled: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var persistentScrollbar: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var pinchGestureEnabled: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var pointerEvents: js.UndefOr[
    `box-none` | none | `box-only` | auto | (AnimatedNode[js.UndefOr[`box-none` | none | `box-only` | auto]])
  ] = js.undefined
  
  var refreshControl: js.UndefOr[ReactElement | AnimatedNode[js.UndefOr[ReactElement]]] = js.undefined
  
  var removeClippedSubviews: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var scrollEnabled: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var scrollEventThrottle: js.UndefOr[Double | AnimatedNode[js.UndefOr[Double]]] = js.undefined
  
  var scrollIndicatorInsets: js.UndefOr[Insets | AnimatedNode[js.UndefOr[Insets]]] = js.undefined
  
  var scrollPerfTag: js.UndefOr[String | AnimatedNode[js.UndefOr[String]]] = js.undefined
  
  var scrollToOverflowEnabled: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var scrollsToTop: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var shouldRasterizeIOS: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var showsHorizontalScrollIndicator: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var showsVerticalScrollIndicator: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var snapToAlignment: js.UndefOr[start | center | end | (AnimatedNode[js.UndefOr[start | center | end]])] = js.undefined
  
  var snapToEnd: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var snapToInterval: js.UndefOr[Double | AnimatedNode[js.UndefOr[Double]]] = js.undefined
  
  var snapToOffsets: js.UndefOr[js.Array[Double] | AnimatedNode[js.UndefOr[js.Array[Double]]]] = js.undefined
  
  var snapToStart: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var stickyHeaderHiddenOnScroll: js.UndefOr[Boolean | AnimatedNode[js.UndefOr[Boolean]]] = js.undefined
  
  var stickyHeaderIndices: js.UndefOr[js.Array[Double] | AnimatedNode[js.UndefOr[js.Array[Double]]]] = js.undefined
  
  var style: js.UndefOr[StyleProp[AnimateStyle[StylesOrDefault[ScrollViewProps]]]] = js.undefined
  
  var testID: js.UndefOr[String | AnimatedNode[js.UndefOr[String]]] = js.undefined
  
  var tvParallaxMagnification: js.UndefOr[Double | AnimatedNode[js.UndefOr[Double]]] = js.undefined
  
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties | AnimatedNode[js.UndefOr[TVParallaxProperties]]] = js.undefined
  
  var tvParallaxShiftDistanceX: js.UndefOr[Double | AnimatedNode[js.UndefOr[Double]]] = js.undefined
  
  var tvParallaxShiftDistanceY: js.UndefOr[Double | AnimatedNode[js.UndefOr[Double]]] = js.undefined
  
  var tvParallaxTiltAngle: js.UndefOr[Double | AnimatedNode[js.UndefOr[Double]]] = js.undefined
  
  var zoomScale: js.UndefOr[Double | AnimatedNode[js.UndefOr[Double]]] = js.undefined
}
object AnimatePropsScrollViewPro {
  
  inline def apply(): AnimatePropsScrollViewPro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatePropsScrollViewPro]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimatePropsScrollViewPro] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityActions(
      value: js.Array[AccessibilityActionInfo] | AnimatedNode[js.UndefOr[js.Array[AccessibilityActionInfo]]]
    ): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value*))
    
    inline def setAccessibilityElementsHidden(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    inline def setAccessibilityHint(value: String | AnimatedNode[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    inline def setAccessibilityIgnoresInvertColors(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    inline def setAccessibilityLabel(value: String | AnimatedNode[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAccessibilityLabelledBy(value: String | js.Array[String] | (AnimatedNode[js.UndefOr[String | js.Array[String]]])): Self = StObject.set(x, "accessibilityLabelledBy", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelledByUndefined: Self = StObject.set(x, "accessibilityLabelledBy", js.undefined)
    
    inline def setAccessibilityLabelledByVarargs(value: String*): Self = StObject.set(x, "accessibilityLabelledBy", js.Array(value*))
    
    inline def setAccessibilityLanguage(value: String | AnimatedNode[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityLanguage", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLanguageUndefined: Self = StObject.set(x, "accessibilityLanguage", js.undefined)
    
    inline def setAccessibilityLiveRegion(value: none | polite | assertive | (AnimatedNode[js.UndefOr[none | polite | assertive]])): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    inline def setAccessibilityRole(value: AccessibilityRole | AnimatedNode[js.UndefOr[AccessibilityRole]]): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    inline def setAccessibilityState(value: AccessibilityState | AnimatedNode[js.UndefOr[AccessibilityState]]): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    inline def setAccessibilityValue(value: AccessibilityValue | AnimatedNode[js.UndefOr[AccessibilityValue]]): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    inline def setAccessibilityViewIsModal(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    inline def setAccessible(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    inline def setAlwaysBounceHorizontal(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "alwaysBounceHorizontal", value.asInstanceOf[js.Any])
    
    inline def setAlwaysBounceHorizontalUndefined: Self = StObject.set(x, "alwaysBounceHorizontal", js.undefined)
    
    inline def setAlwaysBounceVertical(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "alwaysBounceVertical", value.asInstanceOf[js.Any])
    
    inline def setAlwaysBounceVerticalUndefined: Self = StObject.set(x, "alwaysBounceVertical", js.undefined)
    
    inline def setAnimatedProps(value: PartialAnimatePropsScroll): Self = StObject.set(x, "animatedProps", value.asInstanceOf[js.Any])
    
    inline def setAnimatedPropsUndefined: Self = StObject.set(x, "animatedProps", js.undefined)
    
    inline def setAutomaticallyAdjustContentInsets(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "automaticallyAdjustContentInsets", value.asInstanceOf[js.Any])
    
    inline def setAutomaticallyAdjustContentInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustContentInsets", js.undefined)
    
    inline def setAutomaticallyAdjustKeyboardInsets(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "automaticallyAdjustKeyboardInsets", value.asInstanceOf[js.Any])
    
    inline def setAutomaticallyAdjustKeyboardInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustKeyboardInsets", js.undefined)
    
    inline def setAutomaticallyAdjustsScrollIndicatorInsets(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "automaticallyAdjustsScrollIndicatorInsets", value.asInstanceOf[js.Any])
    
    inline def setAutomaticallyAdjustsScrollIndicatorInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustsScrollIndicatorInsets", js.undefined)
    
    inline def setBounces(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
    
    inline def setBouncesUndefined: Self = StObject.set(x, "bounces", js.undefined)
    
    inline def setBouncesZoom(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "bouncesZoom", value.asInstanceOf[js.Any])
    
    inline def setBouncesZoomUndefined: Self = StObject.set(x, "bouncesZoom", js.undefined)
    
    inline def setCanCancelContentTouches(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "canCancelContentTouches", value.asInstanceOf[js.Any])
    
    inline def setCanCancelContentTouchesUndefined: Self = StObject.set(x, "canCancelContentTouches", js.undefined)
    
    inline def setCenterContent(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "centerContent", value.asInstanceOf[js.Any])
    
    inline def setCenterContentUndefined: Self = StObject.set(x, "centerContent", js.undefined)
    
    inline def setChildren(value: ReactNode | AnimatedNode[js.UndefOr[ReactNode]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCollapsable(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
    
    inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
    
    inline def setContentContainerStyle(value: StyleProp[ViewStyle] | AnimatedNode[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
    
    inline def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
    
    inline def setContentInset(value: Insets | AnimatedNode[js.UndefOr[Insets]]): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
    
    inline def setContentInsetAdjustmentBehavior(
      value: automatic | scrollableAxes | never | always | (AnimatedNode[js.UndefOr[automatic | scrollableAxes | never | always]])
    ): Self = StObject.set(x, "contentInsetAdjustmentBehavior", value.asInstanceOf[js.Any])
    
    inline def setContentInsetAdjustmentBehaviorUndefined: Self = StObject.set(x, "contentInsetAdjustmentBehavior", js.undefined)
    
    inline def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
    
    inline def setContentOffset(value: PointProp | AnimatedNode[js.UndefOr[PointProp]]): Self = StObject.set(x, "contentOffset", value.asInstanceOf[js.Any])
    
    inline def setContentOffsetUndefined: Self = StObject.set(x, "contentOffset", js.undefined)
    
    inline def setDecelerationRate(value: fast | normal | Double | (AnimatedNode[js.UndefOr[fast | normal | Double]])): Self = StObject.set(x, "decelerationRate", value.asInstanceOf[js.Any])
    
    inline def setDecelerationRateUndefined: Self = StObject.set(x, "decelerationRate", js.undefined)
    
    inline def setDirectionalLockEnabled(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "directionalLockEnabled", value.asInstanceOf[js.Any])
    
    inline def setDirectionalLockEnabledUndefined: Self = StObject.set(x, "directionalLockEnabled", js.undefined)
    
    inline def setDisableIntervalMomentum(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "disableIntervalMomentum", value.asInstanceOf[js.Any])
    
    inline def setDisableIntervalMomentumUndefined: Self = StObject.set(x, "disableIntervalMomentum", js.undefined)
    
    inline def setDisableScrollViewPanResponder(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "disableScrollViewPanResponder", value.asInstanceOf[js.Any])
    
    inline def setDisableScrollViewPanResponderUndefined: Self = StObject.set(x, "disableScrollViewPanResponder", js.undefined)
    
    inline def setEndFillColor(value: ColorValue | AnimatedNode[js.UndefOr[ColorValue]]): Self = StObject.set(x, "endFillColor", value.asInstanceOf[js.Any])
    
    inline def setEndFillColorUndefined: Self = StObject.set(x, "endFillColor", js.undefined)
    
    inline def setEntering(
      value: BaseAnimationBuilder | TypeofBaseAnimationBuildeDelay | EntryExitAnimationFunction | Keyframe
    ): Self = StObject.set(x, "entering", value.asInstanceOf[js.Any])
    
    inline def setEnteringFunction1(
      value: (/* targetValues */ EntryAnimationsValues) | (/* targetValues */ ExitAnimationsValues) => LayoutAnimation
    ): Self = StObject.set(x, "entering", js.Any.fromFunction1(value))
    
    inline def setEnteringUndefined: Self = StObject.set(x, "entering", js.undefined)
    
    inline def setExiting(
      value: BaseAnimationBuilder | TypeofBaseAnimationBuildeDelay | EntryExitAnimationFunction | Keyframe
    ): Self = StObject.set(x, "exiting", value.asInstanceOf[js.Any])
    
    inline def setExitingFunction1(
      value: (/* targetValues */ EntryAnimationsValues) | (/* targetValues */ ExitAnimationsValues) => LayoutAnimation
    ): Self = StObject.set(x, "exiting", js.Any.fromFunction1(value))
    
    inline def setExitingUndefined: Self = StObject.set(x, "exiting", js.undefined)
    
    inline def setFadingEdgeLength(value: Double | AnimatedNode[js.UndefOr[Double]]): Self = StObject.set(x, "fadingEdgeLength", value.asInstanceOf[js.Any])
    
    inline def setFadingEdgeLengthUndefined: Self = StObject.set(x, "fadingEdgeLength", js.undefined)
    
    inline def setFocusable(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setHasTVPreferredFocus(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    inline def setHitSlop(value: Insets | AnimatedNode[js.UndefOr[Insets]]): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setHorizontal(value: Boolean | (AnimatedNode[js.UndefOr[Boolean | Null]])): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalNull: Self = StObject.set(x, "horizontal", null)
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setImportantForAccessibility(
      value: auto | yes | no | `no-hide-descendants` | (AnimatedNode[js.UndefOr[auto | yes | no | `no-hide-descendants`]])
    ): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    inline def setIndicatorStyle(value: default | black | white | (AnimatedNode[js.UndefOr[default | black | white]])): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
    
    inline def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
    
    inline def setInvertStickyHeaders(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "invertStickyHeaders", value.asInstanceOf[js.Any])
    
    inline def setInvertStickyHeadersUndefined: Self = StObject.set(x, "invertStickyHeaders", js.undefined)
    
    inline def setIsTVSelectable(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
    
    inline def setKeyboardDismissMode(value: none | interactive | `on-drag` | (AnimatedNode[js.UndefOr[none | interactive | `on-drag`]])): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
    
    inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
    
    inline def setKeyboardShouldPersistTaps(
      value: Boolean | always | never | handled | (AnimatedNode[js.UndefOr[Boolean | always | never | handled]])
    ): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    
    inline def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
    
    inline def setLayout(value: BaseAnimationBuilder | LayoutAnimationFunction | TypeofBaseAnimationBuildeDelay): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutFunction1(value: /* targetValues */ LayoutAnimationsValues => LayoutAnimation): Self = StObject.set(x, "layout", js.Any.fromFunction1(value))
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMaintainVisibleContentPosition(value: AutoscrollToTopThreshold | (AnimatedNode[js.UndefOr[Null | AutoscrollToTopThreshold]])): Self = StObject.set(x, "maintainVisibleContentPosition", value.asInstanceOf[js.Any])
    
    inline def setMaintainVisibleContentPositionNull: Self = StObject.set(x, "maintainVisibleContentPosition", null)
    
    inline def setMaintainVisibleContentPositionUndefined: Self = StObject.set(x, "maintainVisibleContentPosition", js.undefined)
    
    inline def setMaximumZoomScale(value: Double | AnimatedNode[js.UndefOr[Double]]): Self = StObject.set(x, "maximumZoomScale", value.asInstanceOf[js.Any])
    
    inline def setMaximumZoomScaleUndefined: Self = StObject.set(x, "maximumZoomScale", js.undefined)
    
    inline def setMinimumZoomScale(value: Double | AnimatedNode[js.UndefOr[Double]]): Self = StObject.set(x, "minimumZoomScale", value.asInstanceOf[js.Any])
    
    inline def setMinimumZoomScaleUndefined: Self = StObject.set(x, "minimumZoomScale", js.undefined)
    
    inline def setNativeID(value: String | AnimatedNode[js.UndefOr[String]]): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    inline def setNeedsOffscreenAlphaCompositing(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
    
    inline def setNestedScrollEnabled(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "nestedScrollEnabled", value.asInstanceOf[js.Any])
    
    inline def setNestedScrollEnabledUndefined: Self = StObject.set(x, "nestedScrollEnabled", js.undefined)
    
    inline def setOnAccessibilityAction(
      value: (js.Function1[/* event */ AccessibilityActionEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]])
    ): Self = StObject.set(x, "onAccessibilityAction", value.asInstanceOf[js.Any])
    
    inline def setOnAccessibilityActionFunction1(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
    
    inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    inline def setOnAccessibilityEscape(value: js.Function0[Unit] | AnimatedNode[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onAccessibilityEscape", value.asInstanceOf[js.Any])
    
    inline def setOnAccessibilityEscapeFunction0(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
    
    inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    inline def setOnAccessibilityTap(value: js.Function0[Unit] | AnimatedNode[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onAccessibilityTap", value.asInstanceOf[js.Any])
    
    inline def setOnAccessibilityTapFunction0(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
    
    inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    inline def setOnContentSizeChange(
      value: (js.Function2[/* w */ Double, /* h */ Double, Unit]) | (AnimatedNode[js.UndefOr[js.Function2[/* w */ Double, /* h */ Double, Unit]]])
    ): Self = StObject.set(x, "onContentSizeChange", value.asInstanceOf[js.Any])
    
    inline def setOnContentSizeChangeFunction2(value: (/* w */ Double, /* h */ Double) => Unit): Self = StObject.set(x, "onContentSizeChange", js.Any.fromFunction2(value))
    
    inline def setOnContentSizeChangeUndefined: Self = StObject.set(x, "onContentSizeChange", js.undefined)
    
    inline def setOnLayout(
      value: (js.Function1[/* event */ LayoutChangeEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]])
    ): Self = StObject.set(x, "onLayout", value.asInstanceOf[js.Any])
    
    inline def setOnLayoutFunction1(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnMagicTap(value: js.Function0[Unit] | AnimatedNode[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onMagicTap", value.asInstanceOf[js.Any])
    
    inline def setOnMagicTapFunction0(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
    
    inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    inline def setOnMomentumScrollBegin(
      value: (js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]) | (AnimatedNode[
          js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]]
        ])
    ): Self = StObject.set(x, "onMomentumScrollBegin", value.asInstanceOf[js.Any])
    
    inline def setOnMomentumScrollBeginFunction1(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onMomentumScrollBegin", js.Any.fromFunction1(value))
    
    inline def setOnMomentumScrollBeginUndefined: Self = StObject.set(x, "onMomentumScrollBegin", js.undefined)
    
    inline def setOnMomentumScrollEnd(
      value: (js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]) | (AnimatedNode[
          js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]]
        ])
    ): Self = StObject.set(x, "onMomentumScrollEnd", value.asInstanceOf[js.Any])
    
    inline def setOnMomentumScrollEndFunction1(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onMomentumScrollEnd", js.Any.fromFunction1(value))
    
    inline def setOnMomentumScrollEndUndefined: Self = StObject.set(x, "onMomentumScrollEnd", js.undefined)
    
    inline def setOnMoveShouldSetResponder(
      value: (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
    ): Self = StObject.set(x, "onMoveShouldSetResponder", value.asInstanceOf[js.Any])
    
    inline def setOnMoveShouldSetResponderCapture(
      value: (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
    ): Self = StObject.set(x, "onMoveShouldSetResponderCapture", value.asInstanceOf[js.Any])
    
    inline def setOnMoveShouldSetResponderCaptureFunction1(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
    
    inline def setOnMoveShouldSetResponderFunction1(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
    
    inline def setOnPointerCancel(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerCancel", value.asInstanceOf[js.Any])
    
    inline def setOnPointerCancelCapture(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerCancelCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerCancelCaptureFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
    
    inline def setOnPointerCancelFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerDown", value.asInstanceOf[js.Any])
    
    inline def setOnPointerDownCapture(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerDownCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerDownCaptureFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
    
    inline def setOnPointerDownFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerEnter", value.asInstanceOf[js.Any])
    
    inline def setOnPointerEnterCapture(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerEnterCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerEnterCaptureFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
    
    inline def setOnPointerEnterFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerLeave", value.asInstanceOf[js.Any])
    
    inline def setOnPointerLeaveCapture(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerLeaveCaptureFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
    
    inline def setOnPointerLeaveFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMove(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerMove", value.asInstanceOf[js.Any])
    
    inline def setOnPointerMoveCapture(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerMoveCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerMoveCaptureFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
    
    inline def setOnPointerMoveFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerUp(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerUp", value.asInstanceOf[js.Any])
    
    inline def setOnPointerUpCapture(
      value: (js.Function1[/* event */ PointerEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]]])
    ): Self = StObject.set(x, "onPointerUpCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerUpCaptureFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
    
    inline def setOnPointerUpFunction1(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnResponderEnd(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onResponderEnd", value.asInstanceOf[js.Any])
    
    inline def setOnResponderEndFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
    
    inline def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
    
    inline def setOnResponderGrant(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onResponderGrant", value.asInstanceOf[js.Any])
    
    inline def setOnResponderGrantFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
    
    inline def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
    
    inline def setOnResponderMove(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onResponderMove", value.asInstanceOf[js.Any])
    
    inline def setOnResponderMoveFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
    
    inline def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
    
    inline def setOnResponderReject(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onResponderReject", value.asInstanceOf[js.Any])
    
    inline def setOnResponderRejectFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
    
    inline def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
    
    inline def setOnResponderRelease(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onResponderRelease", value.asInstanceOf[js.Any])
    
    inline def setOnResponderReleaseFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
    
    inline def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
    
    inline def setOnResponderStart(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onResponderStart", value.asInstanceOf[js.Any])
    
    inline def setOnResponderStartFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
    
    inline def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
    
    inline def setOnResponderTerminate(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onResponderTerminate", value.asInstanceOf[js.Any])
    
    inline def setOnResponderTerminateFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
    
    inline def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
    
    inline def setOnResponderTerminationRequest(
      value: (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
    ): Self = StObject.set(x, "onResponderTerminationRequest", value.asInstanceOf[js.Any])
    
    inline def setOnResponderTerminationRequestFunction1(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    inline def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
    
    inline def setOnScroll(
      value: (js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]) | (AnimatedNode[
          js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]]
        ])
    ): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
    
    inline def setOnScrollAnimationEnd(value: js.Function0[Unit] | AnimatedNode[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onScrollAnimationEnd", value.asInstanceOf[js.Any])
    
    inline def setOnScrollAnimationEndFunction0(value: () => Unit): Self = StObject.set(x, "onScrollAnimationEnd", js.Any.fromFunction0(value))
    
    inline def setOnScrollAnimationEndUndefined: Self = StObject.set(x, "onScrollAnimationEnd", js.undefined)
    
    inline def setOnScrollBeginDrag(
      value: (js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]) | (AnimatedNode[
          js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]]
        ])
    ): Self = StObject.set(x, "onScrollBeginDrag", value.asInstanceOf[js.Any])
    
    inline def setOnScrollBeginDragFunction1(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollBeginDrag", js.Any.fromFunction1(value))
    
    inline def setOnScrollBeginDragUndefined: Self = StObject.set(x, "onScrollBeginDrag", js.undefined)
    
    inline def setOnScrollEndDrag(
      value: (js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]) | (AnimatedNode[
          js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]]
        ])
    ): Self = StObject.set(x, "onScrollEndDrag", value.asInstanceOf[js.Any])
    
    inline def setOnScrollEndDragFunction1(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollEndDrag", js.Any.fromFunction1(value))
    
    inline def setOnScrollEndDragUndefined: Self = StObject.set(x, "onScrollEndDrag", js.undefined)
    
    inline def setOnScrollFunction1(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollToTop(
      value: (js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]) | (AnimatedNode[
          js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]]
        ])
    ): Self = StObject.set(x, "onScrollToTop", value.asInstanceOf[js.Any])
    
    inline def setOnScrollToTopFunction1(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollToTop", js.Any.fromFunction1(value))
    
    inline def setOnScrollToTopUndefined: Self = StObject.set(x, "onScrollToTop", js.undefined)
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnStartShouldSetResponder(
      value: (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
    ): Self = StObject.set(x, "onStartShouldSetResponder", value.asInstanceOf[js.Any])
    
    inline def setOnStartShouldSetResponderCapture(
      value: (js.Function1[/* event */ GestureResponderEvent, Boolean]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]])
    ): Self = StObject.set(x, "onStartShouldSetResponderCapture", value.asInstanceOf[js.Any])
    
    inline def setOnStartShouldSetResponderCaptureFunction1(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
    
    inline def setOnStartShouldSetResponderFunction1(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
    
    inline def setOnTouchCancel(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def setOnTouchCancelFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEndCapture(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onTouchEndCapture", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEndCaptureFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
    
    inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    inline def setOnTouchEndFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    inline def setOnTouchMoveFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(
      value: (js.Function1[/* event */ GestureResponderEvent, Unit]) | (AnimatedNode[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    inline def setOnTouchStartFunction1(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOverScrollMode(value: auto | always | never | (AnimatedNode[js.UndefOr[auto | always | never]])): Self = StObject.set(x, "overScrollMode", value.asInstanceOf[js.Any])
    
    inline def setOverScrollModeUndefined: Self = StObject.set(x, "overScrollMode", js.undefined)
    
    inline def setPagingEnabled(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "pagingEnabled", value.asInstanceOf[js.Any])
    
    inline def setPagingEnabledUndefined: Self = StObject.set(x, "pagingEnabled", js.undefined)
    
    inline def setPersistentScrollbar(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "persistentScrollbar", value.asInstanceOf[js.Any])
    
    inline def setPersistentScrollbarUndefined: Self = StObject.set(x, "persistentScrollbar", js.undefined)
    
    inline def setPinchGestureEnabled(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "pinchGestureEnabled", value.asInstanceOf[js.Any])
    
    inline def setPinchGestureEnabledUndefined: Self = StObject.set(x, "pinchGestureEnabled", js.undefined)
    
    inline def setPointerEvents(
      value: `box-none` | none | `box-only` | auto | (AnimatedNode[js.UndefOr[`box-none` | none | `box-only` | auto]])
    ): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    inline def setRefreshControl(value: ReactElement | AnimatedNode[js.UndefOr[ReactElement]]): Self = StObject.set(x, "refreshControl", value.asInstanceOf[js.Any])
    
    inline def setRefreshControlUndefined: Self = StObject.set(x, "refreshControl", js.undefined)
    
    inline def setRemoveClippedSubviews(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    
    inline def setRenderToHardwareTextureAndroid(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
    
    inline def setScrollEnabled(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
    
    inline def setScrollEventThrottle(value: Double | AnimatedNode[js.UndefOr[Double]]): Self = StObject.set(x, "scrollEventThrottle", value.asInstanceOf[js.Any])
    
    inline def setScrollEventThrottleUndefined: Self = StObject.set(x, "scrollEventThrottle", js.undefined)
    
    inline def setScrollIndicatorInsets(value: Insets | AnimatedNode[js.UndefOr[Insets]]): Self = StObject.set(x, "scrollIndicatorInsets", value.asInstanceOf[js.Any])
    
    inline def setScrollIndicatorInsetsUndefined: Self = StObject.set(x, "scrollIndicatorInsets", js.undefined)
    
    inline def setScrollPerfTag(value: String | AnimatedNode[js.UndefOr[String]]): Self = StObject.set(x, "scrollPerfTag", value.asInstanceOf[js.Any])
    
    inline def setScrollPerfTagUndefined: Self = StObject.set(x, "scrollPerfTag", js.undefined)
    
    inline def setScrollToOverflowEnabled(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "scrollToOverflowEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollToOverflowEnabledUndefined: Self = StObject.set(x, "scrollToOverflowEnabled", js.undefined)
    
    inline def setScrollsToTop(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "scrollsToTop", value.asInstanceOf[js.Any])
    
    inline def setScrollsToTopUndefined: Self = StObject.set(x, "scrollsToTop", js.undefined)
    
    inline def setShouldRasterizeIOS(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
    
    inline def setShowsHorizontalScrollIndicator(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
    
    inline def setShowsHorizontalScrollIndicatorUndefined: Self = StObject.set(x, "showsHorizontalScrollIndicator", js.undefined)
    
    inline def setShowsVerticalScrollIndicator(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
    
    inline def setShowsVerticalScrollIndicatorUndefined: Self = StObject.set(x, "showsVerticalScrollIndicator", js.undefined)
    
    inline def setSnapToAlignment(value: start | center | end | (AnimatedNode[js.UndefOr[start | center | end]])): Self = StObject.set(x, "snapToAlignment", value.asInstanceOf[js.Any])
    
    inline def setSnapToAlignmentUndefined: Self = StObject.set(x, "snapToAlignment", js.undefined)
    
    inline def setSnapToEnd(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "snapToEnd", value.asInstanceOf[js.Any])
    
    inline def setSnapToEndUndefined: Self = StObject.set(x, "snapToEnd", js.undefined)
    
    inline def setSnapToInterval(value: Double | AnimatedNode[js.UndefOr[Double]]): Self = StObject.set(x, "snapToInterval", value.asInstanceOf[js.Any])
    
    inline def setSnapToIntervalUndefined: Self = StObject.set(x, "snapToInterval", js.undefined)
    
    inline def setSnapToOffsets(value: js.Array[Double] | AnimatedNode[js.UndefOr[js.Array[Double]]]): Self = StObject.set(x, "snapToOffsets", value.asInstanceOf[js.Any])
    
    inline def setSnapToOffsetsUndefined: Self = StObject.set(x, "snapToOffsets", js.undefined)
    
    inline def setSnapToOffsetsVarargs(value: Double*): Self = StObject.set(x, "snapToOffsets", js.Array(value*))
    
    inline def setSnapToStart(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "snapToStart", value.asInstanceOf[js.Any])
    
    inline def setSnapToStartUndefined: Self = StObject.set(x, "snapToStart", js.undefined)
    
    inline def setStickyHeaderComponent(value: ComponentType[Any] | AnimatedNode[js.UndefOr[ComponentType[Any]]]): Self = StObject.set(x, "StickyHeaderComponent", value.asInstanceOf[js.Any])
    
    inline def setStickyHeaderComponentUndefined: Self = StObject.set(x, "StickyHeaderComponent", js.undefined)
    
    inline def setStickyHeaderHiddenOnScroll(value: Boolean | AnimatedNode[js.UndefOr[Boolean]]): Self = StObject.set(x, "stickyHeaderHiddenOnScroll", value.asInstanceOf[js.Any])
    
    inline def setStickyHeaderHiddenOnScrollUndefined: Self = StObject.set(x, "stickyHeaderHiddenOnScroll", js.undefined)
    
    inline def setStickyHeaderIndices(value: js.Array[Double] | AnimatedNode[js.UndefOr[js.Array[Double]]]): Self = StObject.set(x, "stickyHeaderIndices", value.asInstanceOf[js.Any])
    
    inline def setStickyHeaderIndicesUndefined: Self = StObject.set(x, "stickyHeaderIndices", js.undefined)
    
    inline def setStickyHeaderIndicesVarargs(value: Double*): Self = StObject.set(x, "stickyHeaderIndices", js.Array(value*))
    
    inline def setStyle(value: StyleProp[AnimateStyle[StylesOrDefault[ScrollViewProps]]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTestID(value: String | AnimatedNode[js.UndefOr[String]]): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTvParallaxMagnification(value: Double | AnimatedNode[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
    
    inline def setTvParallaxProperties(value: TVParallaxProperties | AnimatedNode[js.UndefOr[TVParallaxProperties]]): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
    
    inline def setTvParallaxShiftDistanceX(value: Double | AnimatedNode[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
    
    inline def setTvParallaxShiftDistanceY(value: Double | AnimatedNode[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
    
    inline def setTvParallaxTiltAngle(value: Double | AnimatedNode[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
    
    inline def setZoomScale(value: Double | AnimatedNode[js.UndefOr[Double]]): Self = StObject.set(x, "zoomScale", value.asInstanceOf[js.Any])
    
    inline def setZoomScaleUndefined: Self = StObject.set(x, "zoomScale", js.undefined)
  }
}
