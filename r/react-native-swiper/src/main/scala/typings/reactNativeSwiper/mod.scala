package typings.reactNativeSwiper

import typings.react.mod.Component
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
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSwiper.anon.X
import typings.reactNativeSwiper.reactNativeSwiperBooleans.`false`
import typings.reactNativeSwiper.reactNativeSwiperStrings.`box-none`
import typings.reactNativeSwiper.reactNativeSwiperStrings.`box-only`
import typings.reactNativeSwiper.reactNativeSwiperStrings.`no-hide-descendants`
import typings.reactNativeSwiper.reactNativeSwiperStrings.`on-drag`
import typings.reactNativeSwiper.reactNativeSwiperStrings.always
import typings.reactNativeSwiper.reactNativeSwiperStrings.assertive
import typings.reactNativeSwiper.reactNativeSwiperStrings.auto
import typings.reactNativeSwiper.reactNativeSwiperStrings.automatic
import typings.reactNativeSwiper.reactNativeSwiperStrings.black
import typings.reactNativeSwiper.reactNativeSwiperStrings.center
import typings.reactNativeSwiper.reactNativeSwiperStrings.end
import typings.reactNativeSwiper.reactNativeSwiperStrings.fast
import typings.reactNativeSwiper.reactNativeSwiperStrings.handled
import typings.reactNativeSwiper.reactNativeSwiperStrings.interactive
import typings.reactNativeSwiper.reactNativeSwiperStrings.never
import typings.reactNativeSwiper.reactNativeSwiperStrings.no
import typings.reactNativeSwiper.reactNativeSwiperStrings.none
import typings.reactNativeSwiper.reactNativeSwiperStrings.normal
import typings.reactNativeSwiper.reactNativeSwiperStrings.polite
import typings.reactNativeSwiper.reactNativeSwiperStrings.scrollableAxes
import typings.reactNativeSwiper.reactNativeSwiperStrings.start
import typings.reactNativeSwiper.reactNativeSwiperStrings.white
import typings.reactNativeSwiper.reactNativeSwiperStrings.x
import typings.reactNativeSwiper.reactNativeSwiperStrings.y
import typings.reactNativeSwiper.reactNativeSwiperStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-swiper", JSImport.Default)
  @js.native
  open class default () extends Swiper
  
  @js.native
  trait Swiper
    extends Component[SwiperProps, js.Object, Any] {
    
    def scrollBy(): Unit = js.native
    def scrollBy(index: Double): Unit = js.native
    def scrollBy(index: Double, animated: Boolean): Unit = js.native
    def scrollBy(index: Unit, animated: Boolean): Unit = js.native
    
    def scrollTo(index: Double): Unit = js.native
    def scrollTo(index: Double, animated: Boolean): Unit = js.native
  }
  
  trait SwiperInternals
    extends StObject
       with SwiperStates {
    
    var isScrolling: Boolean
  }
  object SwiperInternals {
    
    inline def apply(
      dir: x | y,
      height: Double,
      index: Double,
      isScrolling: Boolean,
      offset: X,
      total: Double,
      width: Double
    ): SwiperInternals = {
      val __obj = js.Dynamic.literal(autoplayEnd = false, dir = dir.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], loopJump = false, offset = offset.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwiperInternals]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwiperInternals] (val x: Self) extends AnyVal {
      
      inline def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<react-native.react-native.ScrollViewProps, 'onScrollBeginDrag' | 'onMomentumScrollEnd'> */
  trait SwiperProps extends StObject {
    
    var StickyHeaderComponent: js.UndefOr[ComponentType[Any]] = js.undefined
    
    var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
    
    var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
    
    var accessibilityHint: js.UndefOr[String] = js.undefined
    
    var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
    
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    var accessibilityLabelledBy: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var accessibilityLanguage: js.UndefOr[String] = js.undefined
    
    var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
    
    var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
    
    var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
    
    var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
    
    var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
    
    var accessible: js.UndefOr[Boolean] = js.undefined
    
    // Allow custom the active-dot element.
    var activeDot: js.UndefOr[ReactNode] = js.undefined
    
    // Allow custom the active-dot element.
    var activeDotColor: js.UndefOr[String] = js.undefined
    
    // Allow custom the active-dot element.
    var activeDotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var alwaysBounceHorizontal: js.UndefOr[Boolean] = js.undefined
    
    var alwaysBounceVertical: js.UndefOr[Boolean] = js.undefined
    
    // Set to true if you need adjust content insets automation.
    var automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined
    
    var automaticallyAdjustKeyboardInsets: js.UndefOr[Boolean] = js.undefined
    
    var automaticallyAdjustsScrollIndicatorInsets: js.UndefOr[Boolean] = js.undefined
    
    // Set to false to disable continuous loop mode.
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    // Cycle direction control.
    var autoplayDirection: js.UndefOr[Boolean] = js.undefined
    
    // Autoplay
    // Delay between auto play transitions (in second).
    var autoplayTimeout: js.UndefOr[Double] = js.undefined
    
    // If true, the scroll view bounces when it reaches the end of the content if the content is larger then the
    // scroll view along the axis of the scroll direction. If false, it disables all bouncing even if the
    // alwaysBounce* props are true.
    var bounces: js.UndefOr[Boolean] = js.undefined
    
    var bouncesZoom: js.UndefOr[Boolean] = js.undefined
    
    // Control buttons
    // Set to true make control buttons visible.
    var buttonWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var canCancelContentTouches: js.UndefOr[Boolean] = js.undefined
    
    var centerContent: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var collapsable: js.UndefOr[Boolean] = js.undefined
    
    // Customize the View container.
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var contentInset: js.UndefOr[Insets] = js.undefined
    
    var contentInsetAdjustmentBehavior: js.UndefOr[automatic | scrollableAxes | never | always] = js.undefined
    
    var contentOffset: js.UndefOr[PointProp] = js.undefined
    
    var decelerationRate: js.UndefOr[fast | normal | Double] = js.undefined
    
    var directionalLockEnabled: js.UndefOr[Boolean] = js.undefined
    
    var disableIntervalMomentum: js.UndefOr[Boolean] = js.undefined
    
    var disableScrollViewPanResponder: js.UndefOr[Boolean] = js.undefined
    
    // Allow custom the dot element.
    var dot: js.UndefOr[ReactNode] = js.undefined
    
    // Allow custom the active-dot element.
    var dotColor: js.UndefOr[String] = js.undefined
    
    // Allow custom the active-dot element.
    var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var endFillColor: js.UndefOr[ColorValue] = js.undefined
    
    var fadingEdgeLength: js.UndefOr[Double] = js.undefined
    
    var focusable: js.UndefOr[Boolean] = js.undefined
    
    var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
    
    // If no specify default fullscreen mode by flex: 1.
    var height: js.UndefOr[Double] = js.undefined
    
    var hitSlop: js.UndefOr[Insets] = js.undefined
    
    // Basic
    // If true, the scroll view's children are arranged horizontally in a row instead of vertically in a column.
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
    
    // Index number of initial slide.
    var index: js.UndefOr[Double] = js.undefined
    
    var indicatorStyle: js.UndefOr[typings.reactNativeSwiper.reactNativeSwiperStrings.default | black | white] = js.undefined
    
    var invertStickyHeaders: js.UndefOr[Boolean] = js.undefined
    
    var isTVSelectable: js.UndefOr[Boolean] = js.undefined
    
    var keyboardDismissMode: js.UndefOr[none | interactive | `on-drag`] = js.undefined
    
    var keyboardShouldPersistTaps: js.UndefOr[Boolean | always | never | handled] = js.undefined
    
    // Only load current index slide , loadMinimalSize slides before and after.
    var loadMinimal: js.UndefOr[Boolean] = js.undefined
    
    // Custom loader to display when slides aren't loaded
    var loadMinimalLoader: js.UndefOr[ReactNode] = js.undefined
    
    // see loadMinimal
    var loadMinimalSize: js.UndefOr[Double] = js.undefined
    
    // If no specify default enable fullscreen mode by flex: 1.
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var maintainVisibleContentPosition: js.UndefOr[Null | AutoscrollToTopThreshold] = js.undefined
    
    var maximumZoomScale: js.UndefOr[Double] = js.undefined
    
    var minimumZoomScale: js.UndefOr[Double] = js.undefined
    
    var nativeID: js.UndefOr[String] = js.undefined
    
    var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
    
    var nestedScrollEnabled: js.UndefOr[Boolean] = js.undefined
    
    // Allow custom the next button.
    var nextButton: js.UndefOr[ReactNode] = js.undefined
    
    var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
    
    var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onContentSizeChange: js.UndefOr[js.Function2[/* w */ Double, /* h */ Double, Unit]] = js.undefined
    
    // Called with the new index when the user swiped
    var onIndexChanged: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
    
    var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMomentumScrollBegin: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
    
    // Makes no sense why this occurs first during bounce
    var onMomentumScrollEnd: js.UndefOr[
        js.Function3[
          /* e */ NativeSyntheticEvent[NativeScrollEvent], 
          /* state */ SwiperInternals, 
          /* swiper */ Swiper, 
          Unit
        ]
      ] = js.undefined
    
    var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onPointerCancel: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerCancelCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerDown: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerDownCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerEnter: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerEnterCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerLeave: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerLeaveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerMoveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerUp: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerUpCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    // When lifting up - you could pause forever before * lifting
    var onResponderRelease: js.UndefOr[Any] = js.undefined
    
    var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onScroll: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
    
    var onScrollAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    // Supported ScrollResponder
    // When animation begins after letting up
    var onScrollBeginDrag: js.UndefOr[
        js.Function3[
          /* e */ NativeSyntheticEvent[NativeScrollEvent], 
          /* state */ SwiperInternals, 
          /* swiper */ Swiper, 
          Unit
        ]
      ] = js.undefined
    
    var onScrollEndDrag: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
    
    var onScrollToTop: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
    
    var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    // You could hold the touch start for a long time
    var onTouchEnd: js.UndefOr[Any] = js.undefined
    
    var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    // Same, but bubble phase
    var onTouchStart: js.UndefOr[Any] = js.undefined
    
    // Immediately after onMomentumScrollEnd
    var onTouchStartCapture: js.UndefOr[Any] = js.undefined
    
    var overScrollMode: js.UndefOr[auto | always | never] = js.undefined
    
    // Custom styles will merge with the default styles.
    var paginationStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    // If true, the scroll view stops on multiples of the scroll view's size when scrolling. This can be used for
    // horizontal pagination.
    var pagingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var persistentScrollbar: js.UndefOr[Boolean] = js.undefined
    
    var pinchGestureEnabled: js.UndefOr[Boolean] = js.undefined
    
    var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
    
    // Allow custom the prev button.
    var prevButton: js.UndefOr[ReactNode] = js.undefined
    
    var refreshControl: js.UndefOr[ReactElement] = js.undefined
    
    // If true, offscreen child views (whose overflow value is hidden) are removed from their native backing
    // superview when offscreen. This canimprove scrolling performance on long lists.
    var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
    
    // Complete control how to render pagination with three params (index, total, context) ref to this.state.index / this.state.total / this, For example: show numbers instead of dots.
    var renderPagination: js.UndefOr[
        js.Function3[/* index */ Double, /* total */ Double, /* swiper */ Swiper, ReactNode]
      ] = js.undefined
    
    var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
    
    // Enables/Disables swiping
    var scrollEnabled: js.UndefOr[Boolean] = js.undefined
    
    var scrollEventThrottle: js.UndefOr[Double] = js.undefined
    
    var scrollIndicatorInsets: js.UndefOr[Insets] = js.undefined
    
    var scrollPerfTag: js.UndefOr[String] = js.undefined
    
    var scrollToOverflowEnabled: js.UndefOr[Boolean] = js.undefined
    
    // If true, the scroll view scrolls to top when the status bar is tapped.
    var scrollsToTop: js.UndefOr[Boolean] = js.undefined
    
    var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
    
    // Set to true make control buttons visible.
    var showsButtons: js.UndefOr[Boolean] = js.undefined
    
    // Set to true if you want to show horizontal scroll bar.
    var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined
    
    // Pagination
    // Set to true make pagination visible.
    var showsPagination: js.UndefOr[Boolean] = js.undefined
    
    // Set to true if you want to show vertical scroll bar.
    var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
    
    var snapToAlignment: js.UndefOr[start | center | end] = js.undefined
    
    var snapToEnd: js.UndefOr[Boolean] = js.undefined
    
    var snapToInterval: js.UndefOr[Double] = js.undefined
    
    var snapToOffsets: js.UndefOr[js.Array[Double]] = js.undefined
    
    var snapToStart: js.UndefOr[Boolean] = js.undefined
    
    var stickyHeaderHiddenOnScroll: js.UndefOr[Boolean] = js.undefined
    
    var stickyHeaderIndices: js.UndefOr[js.Array[Double]] = js.undefined
    
    // See default style in source.
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var testID: js.UndefOr[String] = js.undefined
    
    var tvParallaxMagnification: js.UndefOr[Double] = js.undefined
    
    var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
    
    var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
    
    var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
    
    var tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
    
    // Custom basic style & content
    // Set to true enable auto play mode.
    var width: js.UndefOr[Double] = js.undefined
    
    var zoomScale: js.UndefOr[Double] = js.undefined
  }
  object SwiperProps {
    
    inline def apply(): SwiperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwiperProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwiperProps] (val x: Self) extends AnyVal {
      
      inline def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
      
      inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value*))
      
      inline def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
      
      inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
      
      inline def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
      
      inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      inline def setAccessibilityLabelledBy(value: String | js.Array[String]): Self = StObject.set(x, "accessibilityLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelledByUndefined: Self = StObject.set(x, "accessibilityLabelledBy", js.undefined)
      
      inline def setAccessibilityLabelledByVarargs(value: String*): Self = StObject.set(x, "accessibilityLabelledBy", js.Array(value*))
      
      inline def setAccessibilityLanguage(value: String): Self = StObject.set(x, "accessibilityLanguage", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLanguageUndefined: Self = StObject.set(x, "accessibilityLanguage", js.undefined)
      
      inline def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
      
      inline def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
      
      inline def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
      
      inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
      
      inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
      
      inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      inline def setActiveDot(value: ReactNode): Self = StObject.set(x, "activeDot", value.asInstanceOf[js.Any])
      
      inline def setActiveDotColor(value: String): Self = StObject.set(x, "activeDotColor", value.asInstanceOf[js.Any])
      
      inline def setActiveDotColorUndefined: Self = StObject.set(x, "activeDotColor", js.undefined)
      
      inline def setActiveDotStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "activeDotStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveDotStyleNull: Self = StObject.set(x, "activeDotStyle", null)
      
      inline def setActiveDotStyleUndefined: Self = StObject.set(x, "activeDotStyle", js.undefined)
      
      inline def setActiveDotUndefined: Self = StObject.set(x, "activeDot", js.undefined)
      
      inline def setAlwaysBounceHorizontal(value: Boolean): Self = StObject.set(x, "alwaysBounceHorizontal", value.asInstanceOf[js.Any])
      
      inline def setAlwaysBounceHorizontalUndefined: Self = StObject.set(x, "alwaysBounceHorizontal", js.undefined)
      
      inline def setAlwaysBounceVertical(value: Boolean): Self = StObject.set(x, "alwaysBounceVertical", value.asInstanceOf[js.Any])
      
      inline def setAlwaysBounceVerticalUndefined: Self = StObject.set(x, "alwaysBounceVertical", js.undefined)
      
      inline def setAutomaticallyAdjustContentInsets(value: Boolean): Self = StObject.set(x, "automaticallyAdjustContentInsets", value.asInstanceOf[js.Any])
      
      inline def setAutomaticallyAdjustContentInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustContentInsets", js.undefined)
      
      inline def setAutomaticallyAdjustKeyboardInsets(value: Boolean): Self = StObject.set(x, "automaticallyAdjustKeyboardInsets", value.asInstanceOf[js.Any])
      
      inline def setAutomaticallyAdjustKeyboardInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustKeyboardInsets", js.undefined)
      
      inline def setAutomaticallyAdjustsScrollIndicatorInsets(value: Boolean): Self = StObject.set(x, "automaticallyAdjustsScrollIndicatorInsets", value.asInstanceOf[js.Any])
      
      inline def setAutomaticallyAdjustsScrollIndicatorInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustsScrollIndicatorInsets", js.undefined)
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayDirection(value: Boolean): Self = StObject.set(x, "autoplayDirection", value.asInstanceOf[js.Any])
      
      inline def setAutoplayDirectionUndefined: Self = StObject.set(x, "autoplayDirection", js.undefined)
      
      inline def setAutoplayTimeout(value: Double): Self = StObject.set(x, "autoplayTimeout", value.asInstanceOf[js.Any])
      
      inline def setAutoplayTimeoutUndefined: Self = StObject.set(x, "autoplayTimeout", js.undefined)
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setBounces(value: Boolean): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
      
      inline def setBouncesUndefined: Self = StObject.set(x, "bounces", js.undefined)
      
      inline def setBouncesZoom(value: Boolean): Self = StObject.set(x, "bouncesZoom", value.asInstanceOf[js.Any])
      
      inline def setBouncesZoomUndefined: Self = StObject.set(x, "bouncesZoom", js.undefined)
      
      inline def setButtonWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonWrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonWrapperStyleNull: Self = StObject.set(x, "buttonWrapperStyle", null)
      
      inline def setButtonWrapperStyleUndefined: Self = StObject.set(x, "buttonWrapperStyle", js.undefined)
      
      inline def setCanCancelContentTouches(value: Boolean): Self = StObject.set(x, "canCancelContentTouches", value.asInstanceOf[js.Any])
      
      inline def setCanCancelContentTouchesUndefined: Self = StObject.set(x, "canCancelContentTouches", js.undefined)
      
      inline def setCenterContent(value: Boolean): Self = StObject.set(x, "centerContent", value.asInstanceOf[js.Any])
      
      inline def setCenterContentUndefined: Self = StObject.set(x, "centerContent", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
      
      inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
      
      inline def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
      
      inline def setContentInset(value: Insets): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
      
      inline def setContentInsetAdjustmentBehavior(value: automatic | scrollableAxes | never | always): Self = StObject.set(x, "contentInsetAdjustmentBehavior", value.asInstanceOf[js.Any])
      
      inline def setContentInsetAdjustmentBehaviorUndefined: Self = StObject.set(x, "contentInsetAdjustmentBehavior", js.undefined)
      
      inline def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
      
      inline def setContentOffset(value: PointProp): Self = StObject.set(x, "contentOffset", value.asInstanceOf[js.Any])
      
      inline def setContentOffsetUndefined: Self = StObject.set(x, "contentOffset", js.undefined)
      
      inline def setDecelerationRate(value: fast | normal | Double): Self = StObject.set(x, "decelerationRate", value.asInstanceOf[js.Any])
      
      inline def setDecelerationRateUndefined: Self = StObject.set(x, "decelerationRate", js.undefined)
      
      inline def setDirectionalLockEnabled(value: Boolean): Self = StObject.set(x, "directionalLockEnabled", value.asInstanceOf[js.Any])
      
      inline def setDirectionalLockEnabledUndefined: Self = StObject.set(x, "directionalLockEnabled", js.undefined)
      
      inline def setDisableIntervalMomentum(value: Boolean): Self = StObject.set(x, "disableIntervalMomentum", value.asInstanceOf[js.Any])
      
      inline def setDisableIntervalMomentumUndefined: Self = StObject.set(x, "disableIntervalMomentum", js.undefined)
      
      inline def setDisableScrollViewPanResponder(value: Boolean): Self = StObject.set(x, "disableScrollViewPanResponder", value.asInstanceOf[js.Any])
      
      inline def setDisableScrollViewPanResponderUndefined: Self = StObject.set(x, "disableScrollViewPanResponder", js.undefined)
      
      inline def setDot(value: ReactNode): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotColor(value: String): Self = StObject.set(x, "dotColor", value.asInstanceOf[js.Any])
      
      inline def setDotColorUndefined: Self = StObject.set(x, "dotColor", js.undefined)
      
      inline def setDotStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
      
      inline def setDotStyleNull: Self = StObject.set(x, "dotStyle", null)
      
      inline def setDotStyleUndefined: Self = StObject.set(x, "dotStyle", js.undefined)
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setEndFillColor(value: ColorValue): Self = StObject.set(x, "endFillColor", value.asInstanceOf[js.Any])
      
      inline def setEndFillColorUndefined: Self = StObject.set(x, "endFillColor", js.undefined)
      
      inline def setFadingEdgeLength(value: Double): Self = StObject.set(x, "fadingEdgeLength", value.asInstanceOf[js.Any])
      
      inline def setFadingEdgeLengthUndefined: Self = StObject.set(x, "fadingEdgeLength", js.undefined)
      
      inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIndicatorStyle(value: typings.reactNativeSwiper.reactNativeSwiperStrings.default | black | white): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      inline def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      inline def setInvertStickyHeaders(value: Boolean): Self = StObject.set(x, "invertStickyHeaders", value.asInstanceOf[js.Any])
      
      inline def setInvertStickyHeadersUndefined: Self = StObject.set(x, "invertStickyHeaders", js.undefined)
      
      inline def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
      
      inline def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
      
      inline def setKeyboardDismissMode(value: none | interactive | `on-drag`): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
      
      inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
      
      inline def setKeyboardShouldPersistTaps(value: Boolean | always | never | handled): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
      
      inline def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
      
      inline def setLoadMinimal(value: Boolean): Self = StObject.set(x, "loadMinimal", value.asInstanceOf[js.Any])
      
      inline def setLoadMinimalLoader(value: ReactNode): Self = StObject.set(x, "loadMinimalLoader", value.asInstanceOf[js.Any])
      
      inline def setLoadMinimalLoaderUndefined: Self = StObject.set(x, "loadMinimalLoader", js.undefined)
      
      inline def setLoadMinimalSize(value: Double): Self = StObject.set(x, "loadMinimalSize", value.asInstanceOf[js.Any])
      
      inline def setLoadMinimalSizeUndefined: Self = StObject.set(x, "loadMinimalSize", js.undefined)
      
      inline def setLoadMinimalUndefined: Self = StObject.set(x, "loadMinimal", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMaintainVisibleContentPosition(value: AutoscrollToTopThreshold): Self = StObject.set(x, "maintainVisibleContentPosition", value.asInstanceOf[js.Any])
      
      inline def setMaintainVisibleContentPositionNull: Self = StObject.set(x, "maintainVisibleContentPosition", null)
      
      inline def setMaintainVisibleContentPositionUndefined: Self = StObject.set(x, "maintainVisibleContentPosition", js.undefined)
      
      inline def setMaximumZoomScale(value: Double): Self = StObject.set(x, "maximumZoomScale", value.asInstanceOf[js.Any])
      
      inline def setMaximumZoomScaleUndefined: Self = StObject.set(x, "maximumZoomScale", js.undefined)
      
      inline def setMinimumZoomScale(value: Double): Self = StObject.set(x, "minimumZoomScale", value.asInstanceOf[js.Any])
      
      inline def setMinimumZoomScaleUndefined: Self = StObject.set(x, "minimumZoomScale", js.undefined)
      
      inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
      
      inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
      
      inline def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
      
      inline def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
      
      inline def setNestedScrollEnabled(value: Boolean): Self = StObject.set(x, "nestedScrollEnabled", value.asInstanceOf[js.Any])
      
      inline def setNestedScrollEnabledUndefined: Self = StObject.set(x, "nestedScrollEnabled", js.undefined)
      
      inline def setNextButton(value: ReactNode): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
      
      inline def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
      
      inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
      
      inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
      
      inline def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
      
      inline def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
      
      inline def setOnContentSizeChange(value: (/* w */ Double, /* h */ Double) => Unit): Self = StObject.set(x, "onContentSizeChange", js.Any.fromFunction2(value))
      
      inline def setOnContentSizeChangeUndefined: Self = StObject.set(x, "onContentSizeChange", js.undefined)
      
      inline def setOnIndexChanged(value: /* index */ Double => Unit): Self = StObject.set(x, "onIndexChanged", js.Any.fromFunction1(value))
      
      inline def setOnIndexChangedUndefined: Self = StObject.set(x, "onIndexChanged", js.undefined)
      
      inline def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      inline def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
      
      inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      inline def setOnMomentumScrollBegin(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onMomentumScrollBegin", js.Any.fromFunction1(value))
      
      inline def setOnMomentumScrollBeginUndefined: Self = StObject.set(x, "onMomentumScrollBegin", js.undefined)
      
      inline def setOnMomentumScrollEnd(
        value: (/* e */ NativeSyntheticEvent[NativeScrollEvent], /* state */ SwiperInternals, /* swiper */ Swiper) => Unit
      ): Self = StObject.set(x, "onMomentumScrollEnd", js.Any.fromFunction3(value))
      
      inline def setOnMomentumScrollEndUndefined: Self = StObject.set(x, "onMomentumScrollEnd", js.undefined)
      
      inline def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      inline def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
      
      inline def setOnPointerCancel(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerUp(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnResponderEnd(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
      
      inline def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
      
      inline def setOnResponderGrant(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
      
      inline def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
      
      inline def setOnResponderMove(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
      
      inline def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
      
      inline def setOnResponderReject(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
      
      inline def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
      
      inline def setOnResponderRelease(value: Any): Self = StObject.set(x, "onResponderRelease", value.asInstanceOf[js.Any])
      
      inline def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
      
      inline def setOnResponderStart(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
      
      inline def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
      
      inline def setOnResponderTerminate(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
      
      inline def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
      
      inline def setOnResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
      
      inline def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
      
      inline def setOnScroll(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollAnimationEnd(value: () => Unit): Self = StObject.set(x, "onScrollAnimationEnd", js.Any.fromFunction0(value))
      
      inline def setOnScrollAnimationEndUndefined: Self = StObject.set(x, "onScrollAnimationEnd", js.undefined)
      
      inline def setOnScrollBeginDrag(
        value: (/* e */ NativeSyntheticEvent[NativeScrollEvent], /* state */ SwiperInternals, /* swiper */ Swiper) => Unit
      ): Self = StObject.set(x, "onScrollBeginDrag", js.Any.fromFunction3(value))
      
      inline def setOnScrollBeginDragUndefined: Self = StObject.set(x, "onScrollBeginDrag", js.undefined)
      
      inline def setOnScrollEndDrag(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollEndDrag", js.Any.fromFunction1(value))
      
      inline def setOnScrollEndDragUndefined: Self = StObject.set(x, "onScrollEndDrag", js.undefined)
      
      inline def setOnScrollToTop(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollToTop", js.Any.fromFunction1(value))
      
      inline def setOnScrollToTopUndefined: Self = StObject.set(x, "onScrollToTop", js.undefined)
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      inline def setOnStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      inline def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
      
      inline def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
      
      inline def setOnTouchCancel(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: Any): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
      
      inline def setOnTouchEndCapture(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: Any): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
      
      inline def setOnTouchStartCapture(value: Any): Self = StObject.set(x, "onTouchStartCapture", value.asInstanceOf[js.Any])
      
      inline def setOnTouchStartCaptureUndefined: Self = StObject.set(x, "onTouchStartCapture", js.undefined)
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOverScrollMode(value: auto | always | never): Self = StObject.set(x, "overScrollMode", value.asInstanceOf[js.Any])
      
      inline def setOverScrollModeUndefined: Self = StObject.set(x, "overScrollMode", js.undefined)
      
      inline def setPaginationStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "paginationStyle", value.asInstanceOf[js.Any])
      
      inline def setPaginationStyleNull: Self = StObject.set(x, "paginationStyle", null)
      
      inline def setPaginationStyleUndefined: Self = StObject.set(x, "paginationStyle", js.undefined)
      
      inline def setPagingEnabled(value: Boolean): Self = StObject.set(x, "pagingEnabled", value.asInstanceOf[js.Any])
      
      inline def setPagingEnabledUndefined: Self = StObject.set(x, "pagingEnabled", js.undefined)
      
      inline def setPersistentScrollbar(value: Boolean): Self = StObject.set(x, "persistentScrollbar", value.asInstanceOf[js.Any])
      
      inline def setPersistentScrollbarUndefined: Self = StObject.set(x, "persistentScrollbar", js.undefined)
      
      inline def setPinchGestureEnabled(value: Boolean): Self = StObject.set(x, "pinchGestureEnabled", value.asInstanceOf[js.Any])
      
      inline def setPinchGestureEnabledUndefined: Self = StObject.set(x, "pinchGestureEnabled", js.undefined)
      
      inline def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setPrevButton(value: ReactNode): Self = StObject.set(x, "prevButton", value.asInstanceOf[js.Any])
      
      inline def setPrevButtonUndefined: Self = StObject.set(x, "prevButton", js.undefined)
      
      inline def setRefreshControl(value: ReactElement): Self = StObject.set(x, "refreshControl", value.asInstanceOf[js.Any])
      
      inline def setRefreshControlUndefined: Self = StObject.set(x, "refreshControl", js.undefined)
      
      inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
      
      inline def setRenderPagination(value: (/* index */ Double, /* total */ Double, /* swiper */ Swiper) => ReactNode): Self = StObject.set(x, "renderPagination", js.Any.fromFunction3(value))
      
      inline def setRenderPaginationUndefined: Self = StObject.set(x, "renderPagination", js.undefined)
      
      inline def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
      
      inline def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
      
      inline def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
      
      inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
      
      inline def setScrollEventThrottle(value: Double): Self = StObject.set(x, "scrollEventThrottle", value.asInstanceOf[js.Any])
      
      inline def setScrollEventThrottleUndefined: Self = StObject.set(x, "scrollEventThrottle", js.undefined)
      
      inline def setScrollIndicatorInsets(value: Insets): Self = StObject.set(x, "scrollIndicatorInsets", value.asInstanceOf[js.Any])
      
      inline def setScrollIndicatorInsetsUndefined: Self = StObject.set(x, "scrollIndicatorInsets", js.undefined)
      
      inline def setScrollPerfTag(value: String): Self = StObject.set(x, "scrollPerfTag", value.asInstanceOf[js.Any])
      
      inline def setScrollPerfTagUndefined: Self = StObject.set(x, "scrollPerfTag", js.undefined)
      
      inline def setScrollToOverflowEnabled(value: Boolean): Self = StObject.set(x, "scrollToOverflowEnabled", value.asInstanceOf[js.Any])
      
      inline def setScrollToOverflowEnabledUndefined: Self = StObject.set(x, "scrollToOverflowEnabled", js.undefined)
      
      inline def setScrollsToTop(value: Boolean): Self = StObject.set(x, "scrollsToTop", value.asInstanceOf[js.Any])
      
      inline def setScrollsToTopUndefined: Self = StObject.set(x, "scrollsToTop", js.undefined)
      
      inline def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
      
      inline def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
      
      inline def setShowsButtons(value: Boolean): Self = StObject.set(x, "showsButtons", value.asInstanceOf[js.Any])
      
      inline def setShowsButtonsUndefined: Self = StObject.set(x, "showsButtons", js.undefined)
      
      inline def setShowsHorizontalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
      
      inline def setShowsHorizontalScrollIndicatorUndefined: Self = StObject.set(x, "showsHorizontalScrollIndicator", js.undefined)
      
      inline def setShowsPagination(value: Boolean): Self = StObject.set(x, "showsPagination", value.asInstanceOf[js.Any])
      
      inline def setShowsPaginationUndefined: Self = StObject.set(x, "showsPagination", js.undefined)
      
      inline def setShowsVerticalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
      
      inline def setShowsVerticalScrollIndicatorUndefined: Self = StObject.set(x, "showsVerticalScrollIndicator", js.undefined)
      
      inline def setSnapToAlignment(value: start | center | end): Self = StObject.set(x, "snapToAlignment", value.asInstanceOf[js.Any])
      
      inline def setSnapToAlignmentUndefined: Self = StObject.set(x, "snapToAlignment", js.undefined)
      
      inline def setSnapToEnd(value: Boolean): Self = StObject.set(x, "snapToEnd", value.asInstanceOf[js.Any])
      
      inline def setSnapToEndUndefined: Self = StObject.set(x, "snapToEnd", js.undefined)
      
      inline def setSnapToInterval(value: Double): Self = StObject.set(x, "snapToInterval", value.asInstanceOf[js.Any])
      
      inline def setSnapToIntervalUndefined: Self = StObject.set(x, "snapToInterval", js.undefined)
      
      inline def setSnapToOffsets(value: js.Array[Double]): Self = StObject.set(x, "snapToOffsets", value.asInstanceOf[js.Any])
      
      inline def setSnapToOffsetsUndefined: Self = StObject.set(x, "snapToOffsets", js.undefined)
      
      inline def setSnapToOffsetsVarargs(value: Double*): Self = StObject.set(x, "snapToOffsets", js.Array(value*))
      
      inline def setSnapToStart(value: Boolean): Self = StObject.set(x, "snapToStart", value.asInstanceOf[js.Any])
      
      inline def setSnapToStartUndefined: Self = StObject.set(x, "snapToStart", js.undefined)
      
      inline def setStickyHeaderComponent(value: ComponentType[Any]): Self = StObject.set(x, "StickyHeaderComponent", value.asInstanceOf[js.Any])
      
      inline def setStickyHeaderComponentUndefined: Self = StObject.set(x, "StickyHeaderComponent", js.undefined)
      
      inline def setStickyHeaderHiddenOnScroll(value: Boolean): Self = StObject.set(x, "stickyHeaderHiddenOnScroll", value.asInstanceOf[js.Any])
      
      inline def setStickyHeaderHiddenOnScrollUndefined: Self = StObject.set(x, "stickyHeaderHiddenOnScroll", js.undefined)
      
      inline def setStickyHeaderIndices(value: js.Array[Double]): Self = StObject.set(x, "stickyHeaderIndices", value.asInstanceOf[js.Any])
      
      inline def setStickyHeaderIndicesUndefined: Self = StObject.set(x, "stickyHeaderIndices", js.undefined)
      
      inline def setStickyHeaderIndicesVarargs(value: Double*): Self = StObject.set(x, "stickyHeaderIndices", js.Array(value*))
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
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
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZoomScale(value: Double): Self = StObject.set(x, "zoomScale", value.asInstanceOf[js.Any])
      
      inline def setZoomScaleUndefined: Self = StObject.set(x, "zoomScale", js.undefined)
    }
  }
  
  trait SwiperStates extends StObject {
    
    var autoplayEnd: `false`
    
    var dir: x | y
    
    var height: Double
    
    var index: Double
    
    var loopJump: `false`
    
    var offset: X
    
    var total: Double
    
    var width: Double
  }
  object SwiperStates {
    
    inline def apply(dir: x | y, height: Double, index: Double, offset: X, total: Double, width: Double): SwiperStates = {
      val __obj = js.Dynamic.literal(autoplayEnd = false, dir = dir.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], loopJump = false, offset = offset.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwiperStates]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwiperStates] (val x: Self) extends AnyVal {
      
      inline def setAutoplayEnd(value: `false`): Self = StObject.set(x, "autoplayEnd", value.asInstanceOf[js.Any])
      
      inline def setDir(value: typings.reactNativeSwiper.reactNativeSwiperStrings.x | y): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLoopJump(value: `false`): Self = StObject.set(x, "loopJump", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: X): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
