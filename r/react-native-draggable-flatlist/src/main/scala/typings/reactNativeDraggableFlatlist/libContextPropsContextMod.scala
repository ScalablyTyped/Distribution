package typings.reactNativeDraggableFlatlist

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.reactNative.anon.AutoscrollToTopThreshold
import typings.reactNative.anon.AverageItemLength
import typings.reactNative.anon.Changed
import typings.reactNative.anon.DistanceFromEnd
import typings.reactNative.anon.Index
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
import typings.reactNative.mod.ViewabilityConfigCallbackPair
import typings.reactNative.mod.ViewabilityConfigCallbackPairs
import typings.reactNativeDraggableFlatlist.anon.ActivationDistance
import typings.reactNativeDraggableFlatlist.anon.PartialSpringConfig
import typings.reactNativeDraggableFlatlist.libTypesMod.DragEndParams
import typings.reactNativeDraggableFlatlist.libTypesMod.DraggableFlatListProps
import typings.reactNativeDraggableFlatlist.libTypesMod.RenderItem
import typings.reactNativeDraggableFlatlist.libTypesMod.RenderItemParams
import typings.reactNativeDraggableFlatlist.libTypesMod.RenderPlaceholder
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.`box-none`
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.`box-only`
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.`no-hide-descendants`
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.`on-drag`
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.always
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.assertive
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.auto
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.automatic
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.black
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.center
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.default
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.end
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.fast
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.handled
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.interactive
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.never
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.no
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.none
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.normal
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.polite
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.scrollableAxes
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.start
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.white
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.yes
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HitSlop
import typings.std.Node
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextPropsContextMod {
  
  @JSImport("react-native-draggable-flatlist/lib/context/propsContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](param0: Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useProps[T](): DraggableFlatListProps[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useProps")().asInstanceOf[DraggableFlatListProps[T]]
  
  /* Inlined react-native-draggable-flatlist.react-native-draggable-flatlist/lib/types.DraggableFlatListProps<T> & {  children :react.react.ReactNode} */
  trait Props[T] extends StObject {
    
    var CellRendererComponent: js.UndefOr[ComponentType[Any]] = js.undefined
    
    var ItemSeparatorComponent: js.UndefOr[ComponentType[Any] | Null] = js.undefined
    
    var ListEmptyComponent: js.UndefOr[ComponentType[Any] | ReactElement | Null] = js.undefined
    
    var ListFooterComponent: js.UndefOr[ComponentType[Any] | ReactElement | Null] = js.undefined
    
    var ListFooterComponentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var ListHeaderComponent: js.UndefOr[ComponentType[Any] | ReactElement | Null] = js.undefined
    
    var ListHeaderComponentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
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
    
    var activationDistance: js.UndefOr[Double] = js.undefined
    
    var alwaysBounceHorizontal: js.UndefOr[Boolean] = js.undefined
    
    var alwaysBounceVertical: js.UndefOr[Boolean] = js.undefined
    
    var animationConfig: js.UndefOr[PartialSpringConfig] = js.undefined
    
    var automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined
    
    var automaticallyAdjustKeyboardInsets: js.UndefOr[Boolean] = js.undefined
    
    var automaticallyAdjustsScrollIndicatorInsets: js.UndefOr[Boolean] = js.undefined
    
    var autoscrollSpeed: js.UndefOr[Double] = js.undefined
    
    var autoscrollThreshold: js.UndefOr[Double] = js.undefined
    
    var bounces: js.UndefOr[Boolean] = js.undefined
    
    var bouncesZoom: js.UndefOr[Boolean] = js.undefined
    
    var canCancelContentTouches: js.UndefOr[Boolean] = js.undefined
    
    var centerContent: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var collapsable: js.UndefOr[Boolean] = js.undefined
    
    var columnWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var contentInset: js.UndefOr[Insets] = js.undefined
    
    var contentInsetAdjustmentBehavior: js.UndefOr[automatic | scrollableAxes | never | always] = js.undefined
    
    var contentOffset: js.UndefOr[PointProp] = js.undefined
    
    var data: js.Array[T]
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var decelerationRate: js.UndefOr[fast | normal | Double] = js.undefined
    
    var directionalLockEnabled: js.UndefOr[Boolean] = js.undefined
    
    var disableIntervalMomentum: js.UndefOr[Boolean] = js.undefined
    
    var disableScrollViewPanResponder: js.UndefOr[Boolean] = js.undefined
    
    var disableVirtualization: js.UndefOr[Boolean] = js.undefined
    
    var dragHitSlop: js.UndefOr[HitSlop] = js.undefined
    
    var dragItemOverflow: js.UndefOr[Boolean] = js.undefined
    
    var endFillColor: js.UndefOr[ColorValue] = js.undefined
    
    var extraData: js.UndefOr[Any] = js.undefined
    
    var fadingEdgeLength: js.UndefOr[Double] = js.undefined
    
    var focusable: js.UndefOr[Boolean] = js.undefined
    
    var getItem: js.UndefOr[js.Function2[/* data */ Any, /* index */ Double, T]] = js.undefined
    
    var getItemCount: js.UndefOr[js.Function1[/* data */ Any, Double]] = js.undefined
    
    var getItemLayout: js.UndefOr[
        js.Function2[/* data */ js.UndefOr[js.Array[T] | Null], /* index */ Double, Index]
      ] = js.undefined
    
    var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
    
    var hitSlop: js.UndefOr[Insets] = js.undefined
    
    var horizontal: js.UndefOr[Boolean | Null] = js.undefined
    
    var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
    
    var indicatorStyle: js.UndefOr[default | black | white] = js.undefined
    
    var initialNumToRender: js.UndefOr[Double] = js.undefined
    
    var initialScrollIndex: js.UndefOr[Double | Null] = js.undefined
    
    var invertStickyHeaders: js.UndefOr[Boolean] = js.undefined
    
    var inverted: js.UndefOr[Boolean | Null] = js.undefined
    
    var isTVSelectable: js.UndefOr[Boolean] = js.undefined
    
    def keyExtractor(item: T, index: Double): String
    
    var keyboardDismissMode: js.UndefOr[none | interactive | `on-drag`] = js.undefined
    
    var keyboardShouldPersistTaps: js.UndefOr[Boolean | always | never | handled] = js.undefined
    
    var legacyImplementation: js.UndefOr[Boolean] = js.undefined
    
    var listKey: js.UndefOr[String] = js.undefined
    
    var maintainVisibleContentPosition: js.UndefOr[Null | AutoscrollToTopThreshold] = js.undefined
    
    var maxToRenderPerBatch: js.UndefOr[Double] = js.undefined
    
    var maximumZoomScale: js.UndefOr[Double] = js.undefined
    
    var minimumZoomScale: js.UndefOr[Double] = js.undefined
    
    var nativeID: js.UndefOr[String] = js.undefined
    
    var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
    
    var nestedScrollEnabled: js.UndefOr[Boolean] = js.undefined
    
    var numColumns: js.UndefOr[Double] = js.undefined
    
    var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
    
    var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onAnimValInit: js.UndefOr[js.Function1[/* animVals */ ReturnType[js.Function0[ActivationDistance]], Unit]] = js.undefined
    
    var onContentSizeChange: js.UndefOr[js.Function2[/* w */ Double, /* h */ Double, Unit]] = js.undefined
    
    var onDragBegin: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var onDragEnd: js.UndefOr[js.Function1[/* params */ DragEndParams[T], Unit]] = js.undefined
    
    var onEndReached: js.UndefOr[(js.Function1[/* info */ DistanceFromEnd, Unit]) | Null] = js.undefined
    
    var onEndReachedThreshold: js.UndefOr[Double | Null] = js.undefined
    
    var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
    
    var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMomentumScrollBegin: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
    
    var onMomentumScrollEnd: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
    
    var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onPlaceholderIndexChange: js.UndefOr[js.Function1[/* placeholderIndex */ Double, Unit]] = js.undefined
    
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
    
    var onRefresh: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var onRelease: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onScroll: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
    
    var onScrollAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onScrollBeginDrag: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
    
    var onScrollEndDrag: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
    
    var onScrollOffsetChange: js.UndefOr[js.Function1[/* scrollOffset */ Double, Unit]] = js.undefined
    
    var onScrollToIndexFailed: js.UndefOr[js.Function1[/* info */ AverageItemLength, Unit]] = js.undefined
    
    var onScrollToTop: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
    
    var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onViewableItemsChanged: js.UndefOr[(js.Function1[/* info */ Changed, Unit]) | Null] = js.undefined
    
    var outerScrollOffset: js.UndefOr[Node] = js.undefined
    
    var overScrollMode: js.UndefOr[auto | always | never] = js.undefined
    
    var pagingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var persistentScrollbar: js.UndefOr[Boolean] = js.undefined
    
    var pinchGestureEnabled: js.UndefOr[Boolean] = js.undefined
    
    var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
    
    var progressViewOffset: js.UndefOr[Double] = js.undefined
    
    var refreshControl: js.UndefOr[ReactElement] = js.undefined
    
    var refreshing: js.UndefOr[Boolean | Null] = js.undefined
    
    var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
    
    var renderItem: RenderItem[T]
    
    var renderPlaceholder: js.UndefOr[RenderPlaceholder[T]] = js.undefined
    
    var renderScrollComponent: js.UndefOr[js.Function1[/* props */ ScrollViewProps, ReactElement]] = js.undefined
    
    var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
    
    var scrollEnabled: js.UndefOr[Boolean] = js.undefined
    
    var scrollEventThrottle: js.UndefOr[Double] = js.undefined
    
    var scrollIndicatorInsets: js.UndefOr[Insets] = js.undefined
    
    var scrollPerfTag: js.UndefOr[String] = js.undefined
    
    var scrollToOverflowEnabled: js.UndefOr[Boolean] = js.undefined
    
    var scrollsToTop: js.UndefOr[Boolean] = js.undefined
    
    var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
    
    var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined
    
    var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
    
    var simultaneousHandlers: js.UndefOr[Ref[Any] | js.Array[Ref[Any]]] = js.undefined
    
    var snapToAlignment: js.UndefOr[start | center | end] = js.undefined
    
    var snapToEnd: js.UndefOr[Boolean] = js.undefined
    
    var snapToInterval: js.UndefOr[Double] = js.undefined
    
    var snapToOffsets: js.UndefOr[js.Array[Double]] = js.undefined
    
    var snapToStart: js.UndefOr[Boolean] = js.undefined
    
    var stickyHeaderHiddenOnScroll: js.UndefOr[Boolean] = js.undefined
    
    var stickyHeaderIndices: js.UndefOr[js.Array[Double]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var testID: js.UndefOr[String] = js.undefined
    
    var tvParallaxMagnification: js.UndefOr[Double] = js.undefined
    
    var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
    
    var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
    
    var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
    
    var tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
    
    var updateCellsBatchingPeriod: js.UndefOr[Double] = js.undefined
    
    var viewabilityConfig: js.UndefOr[Any] = js.undefined
    
    var viewabilityConfigCallbackPairs: js.UndefOr[ViewabilityConfigCallbackPairs] = js.undefined
    
    var windowSize: js.UndefOr[Double] = js.undefined
    
    var zoomScale: js.UndefOr[Double] = js.undefined
  }
  object Props {
    
    inline def apply[T](
      data: js.Array[T],
      keyExtractor: (T, Double) => String,
      renderItem: /* params */ RenderItemParams[T] => ReactNode
    ): Props[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], keyExtractor = js.Any.fromFunction2(keyExtractor), renderItem = js.Any.fromFunction1(renderItem))
      __obj.asInstanceOf[Props[T]]
    }
    
    extension [Self <: Props[?], T](x: Self & Props[T]) {
      
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
      
      inline def setActivationDistance(value: Double): Self = StObject.set(x, "activationDistance", value.asInstanceOf[js.Any])
      
      inline def setActivationDistanceUndefined: Self = StObject.set(x, "activationDistance", js.undefined)
      
      inline def setAlwaysBounceHorizontal(value: Boolean): Self = StObject.set(x, "alwaysBounceHorizontal", value.asInstanceOf[js.Any])
      
      inline def setAlwaysBounceHorizontalUndefined: Self = StObject.set(x, "alwaysBounceHorizontal", js.undefined)
      
      inline def setAlwaysBounceVertical(value: Boolean): Self = StObject.set(x, "alwaysBounceVertical", value.asInstanceOf[js.Any])
      
      inline def setAlwaysBounceVerticalUndefined: Self = StObject.set(x, "alwaysBounceVertical", js.undefined)
      
      inline def setAnimationConfig(value: PartialSpringConfig): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
      
      inline def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
      
      inline def setAutomaticallyAdjustContentInsets(value: Boolean): Self = StObject.set(x, "automaticallyAdjustContentInsets", value.asInstanceOf[js.Any])
      
      inline def setAutomaticallyAdjustContentInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustContentInsets", js.undefined)
      
      inline def setAutomaticallyAdjustKeyboardInsets(value: Boolean): Self = StObject.set(x, "automaticallyAdjustKeyboardInsets", value.asInstanceOf[js.Any])
      
      inline def setAutomaticallyAdjustKeyboardInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustKeyboardInsets", js.undefined)
      
      inline def setAutomaticallyAdjustsScrollIndicatorInsets(value: Boolean): Self = StObject.set(x, "automaticallyAdjustsScrollIndicatorInsets", value.asInstanceOf[js.Any])
      
      inline def setAutomaticallyAdjustsScrollIndicatorInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustsScrollIndicatorInsets", js.undefined)
      
      inline def setAutoscrollSpeed(value: Double): Self = StObject.set(x, "autoscrollSpeed", value.asInstanceOf[js.Any])
      
      inline def setAutoscrollSpeedUndefined: Self = StObject.set(x, "autoscrollSpeed", js.undefined)
      
      inline def setAutoscrollThreshold(value: Double): Self = StObject.set(x, "autoscrollThreshold", value.asInstanceOf[js.Any])
      
      inline def setAutoscrollThresholdUndefined: Self = StObject.set(x, "autoscrollThreshold", js.undefined)
      
      inline def setBounces(value: Boolean): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
      
      inline def setBouncesUndefined: Self = StObject.set(x, "bounces", js.undefined)
      
      inline def setBouncesZoom(value: Boolean): Self = StObject.set(x, "bouncesZoom", value.asInstanceOf[js.Any])
      
      inline def setBouncesZoomUndefined: Self = StObject.set(x, "bouncesZoom", js.undefined)
      
      inline def setCanCancelContentTouches(value: Boolean): Self = StObject.set(x, "canCancelContentTouches", value.asInstanceOf[js.Any])
      
      inline def setCanCancelContentTouchesUndefined: Self = StObject.set(x, "canCancelContentTouches", js.undefined)
      
      inline def setCellRendererComponent(value: ComponentType[Any]): Self = StObject.set(x, "CellRendererComponent", value.asInstanceOf[js.Any])
      
      inline def setCellRendererComponentUndefined: Self = StObject.set(x, "CellRendererComponent", js.undefined)
      
      inline def setCenterContent(value: Boolean): Self = StObject.set(x, "centerContent", value.asInstanceOf[js.Any])
      
      inline def setCenterContentUndefined: Self = StObject.set(x, "centerContent", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
      
      inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
      
      inline def setColumnWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "columnWrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setColumnWrapperStyleNull: Self = StObject.set(x, "columnWrapperStyle", null)
      
      inline def setColumnWrapperStyleUndefined: Self = StObject.set(x, "columnWrapperStyle", js.undefined)
      
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
      
      inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDecelerationRate(value: fast | normal | Double): Self = StObject.set(x, "decelerationRate", value.asInstanceOf[js.Any])
      
      inline def setDecelerationRateUndefined: Self = StObject.set(x, "decelerationRate", js.undefined)
      
      inline def setDirectionalLockEnabled(value: Boolean): Self = StObject.set(x, "directionalLockEnabled", value.asInstanceOf[js.Any])
      
      inline def setDirectionalLockEnabledUndefined: Self = StObject.set(x, "directionalLockEnabled", js.undefined)
      
      inline def setDisableIntervalMomentum(value: Boolean): Self = StObject.set(x, "disableIntervalMomentum", value.asInstanceOf[js.Any])
      
      inline def setDisableIntervalMomentumUndefined: Self = StObject.set(x, "disableIntervalMomentum", js.undefined)
      
      inline def setDisableScrollViewPanResponder(value: Boolean): Self = StObject.set(x, "disableScrollViewPanResponder", value.asInstanceOf[js.Any])
      
      inline def setDisableScrollViewPanResponderUndefined: Self = StObject.set(x, "disableScrollViewPanResponder", js.undefined)
      
      inline def setDisableVirtualization(value: Boolean): Self = StObject.set(x, "disableVirtualization", value.asInstanceOf[js.Any])
      
      inline def setDisableVirtualizationUndefined: Self = StObject.set(x, "disableVirtualization", js.undefined)
      
      inline def setDragHitSlop(value: HitSlop): Self = StObject.set(x, "dragHitSlop", value.asInstanceOf[js.Any])
      
      inline def setDragHitSlopUndefined: Self = StObject.set(x, "dragHitSlop", js.undefined)
      
      inline def setDragItemOverflow(value: Boolean): Self = StObject.set(x, "dragItemOverflow", value.asInstanceOf[js.Any])
      
      inline def setDragItemOverflowUndefined: Self = StObject.set(x, "dragItemOverflow", js.undefined)
      
      inline def setEndFillColor(value: ColorValue): Self = StObject.set(x, "endFillColor", value.asInstanceOf[js.Any])
      
      inline def setEndFillColorUndefined: Self = StObject.set(x, "endFillColor", js.undefined)
      
      inline def setExtraData(value: Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      inline def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
      
      inline def setFadingEdgeLength(value: Double): Self = StObject.set(x, "fadingEdgeLength", value.asInstanceOf[js.Any])
      
      inline def setFadingEdgeLengthUndefined: Self = StObject.set(x, "fadingEdgeLength", js.undefined)
      
      inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setGetItem(value: (/* data */ Any, /* index */ Double) => T): Self = StObject.set(x, "getItem", js.Any.fromFunction2(value))
      
      inline def setGetItemCount(value: /* data */ Any => Double): Self = StObject.set(x, "getItemCount", js.Any.fromFunction1(value))
      
      inline def setGetItemCountUndefined: Self = StObject.set(x, "getItemCount", js.undefined)
      
      inline def setGetItemLayout(value: (/* data */ js.UndefOr[js.Array[T] | Null], /* index */ Double) => Index): Self = StObject.set(x, "getItemLayout", js.Any.fromFunction2(value))
      
      inline def setGetItemLayoutUndefined: Self = StObject.set(x, "getItemLayout", js.undefined)
      
      inline def setGetItemUndefined: Self = StObject.set(x, "getItem", js.undefined)
      
      inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalNull: Self = StObject.set(x, "horizontal", null)
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      inline def setIndicatorStyle(value: default | black | white): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      inline def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      inline def setInitialNumToRender(value: Double): Self = StObject.set(x, "initialNumToRender", value.asInstanceOf[js.Any])
      
      inline def setInitialNumToRenderUndefined: Self = StObject.set(x, "initialNumToRender", js.undefined)
      
      inline def setInitialScrollIndex(value: Double): Self = StObject.set(x, "initialScrollIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialScrollIndexNull: Self = StObject.set(x, "initialScrollIndex", null)
      
      inline def setInitialScrollIndexUndefined: Self = StObject.set(x, "initialScrollIndex", js.undefined)
      
      inline def setInvertStickyHeaders(value: Boolean): Self = StObject.set(x, "invertStickyHeaders", value.asInstanceOf[js.Any])
      
      inline def setInvertStickyHeadersUndefined: Self = StObject.set(x, "invertStickyHeaders", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedNull: Self = StObject.set(x, "inverted", null)
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
      
      inline def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
      
      inline def setItemSeparatorComponent(value: ComponentType[Any]): Self = StObject.set(x, "ItemSeparatorComponent", value.asInstanceOf[js.Any])
      
      inline def setItemSeparatorComponentNull: Self = StObject.set(x, "ItemSeparatorComponent", null)
      
      inline def setItemSeparatorComponentUndefined: Self = StObject.set(x, "ItemSeparatorComponent", js.undefined)
      
      inline def setKeyExtractor(value: (T, Double) => String): Self = StObject.set(x, "keyExtractor", js.Any.fromFunction2(value))
      
      inline def setKeyboardDismissMode(value: none | interactive | `on-drag`): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
      
      inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
      
      inline def setKeyboardShouldPersistTaps(value: Boolean | always | never | handled): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
      
      inline def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
      
      inline def setLegacyImplementation(value: Boolean): Self = StObject.set(x, "legacyImplementation", value.asInstanceOf[js.Any])
      
      inline def setLegacyImplementationUndefined: Self = StObject.set(x, "legacyImplementation", js.undefined)
      
      inline def setListEmptyComponent(value: ComponentType[Any] | ReactElement): Self = StObject.set(x, "ListEmptyComponent", value.asInstanceOf[js.Any])
      
      inline def setListEmptyComponentNull: Self = StObject.set(x, "ListEmptyComponent", null)
      
      inline def setListEmptyComponentUndefined: Self = StObject.set(x, "ListEmptyComponent", js.undefined)
      
      inline def setListFooterComponent(value: ComponentType[Any] | ReactElement): Self = StObject.set(x, "ListFooterComponent", value.asInstanceOf[js.Any])
      
      inline def setListFooterComponentNull: Self = StObject.set(x, "ListFooterComponent", null)
      
      inline def setListFooterComponentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "ListFooterComponentStyle", value.asInstanceOf[js.Any])
      
      inline def setListFooterComponentStyleNull: Self = StObject.set(x, "ListFooterComponentStyle", null)
      
      inline def setListFooterComponentStyleUndefined: Self = StObject.set(x, "ListFooterComponentStyle", js.undefined)
      
      inline def setListFooterComponentUndefined: Self = StObject.set(x, "ListFooterComponent", js.undefined)
      
      inline def setListHeaderComponent(value: ComponentType[Any] | ReactElement): Self = StObject.set(x, "ListHeaderComponent", value.asInstanceOf[js.Any])
      
      inline def setListHeaderComponentNull: Self = StObject.set(x, "ListHeaderComponent", null)
      
      inline def setListHeaderComponentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "ListHeaderComponentStyle", value.asInstanceOf[js.Any])
      
      inline def setListHeaderComponentStyleNull: Self = StObject.set(x, "ListHeaderComponentStyle", null)
      
      inline def setListHeaderComponentStyleUndefined: Self = StObject.set(x, "ListHeaderComponentStyle", js.undefined)
      
      inline def setListHeaderComponentUndefined: Self = StObject.set(x, "ListHeaderComponent", js.undefined)
      
      inline def setListKey(value: String): Self = StObject.set(x, "listKey", value.asInstanceOf[js.Any])
      
      inline def setListKeyUndefined: Self = StObject.set(x, "listKey", js.undefined)
      
      inline def setMaintainVisibleContentPosition(value: AutoscrollToTopThreshold): Self = StObject.set(x, "maintainVisibleContentPosition", value.asInstanceOf[js.Any])
      
      inline def setMaintainVisibleContentPositionNull: Self = StObject.set(x, "maintainVisibleContentPosition", null)
      
      inline def setMaintainVisibleContentPositionUndefined: Self = StObject.set(x, "maintainVisibleContentPosition", js.undefined)
      
      inline def setMaxToRenderPerBatch(value: Double): Self = StObject.set(x, "maxToRenderPerBatch", value.asInstanceOf[js.Any])
      
      inline def setMaxToRenderPerBatchUndefined: Self = StObject.set(x, "maxToRenderPerBatch", js.undefined)
      
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
      
      inline def setNumColumns(value: Double): Self = StObject.set(x, "numColumns", value.asInstanceOf[js.Any])
      
      inline def setNumColumnsUndefined: Self = StObject.set(x, "numColumns", js.undefined)
      
      inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
      
      inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
      
      inline def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
      
      inline def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
      
      inline def setOnAnimValInit(value: /* animVals */ ReturnType[js.Function0[ActivationDistance]] => Unit): Self = StObject.set(x, "onAnimValInit", js.Any.fromFunction1(value))
      
      inline def setOnAnimValInitUndefined: Self = StObject.set(x, "onAnimValInit", js.undefined)
      
      inline def setOnContentSizeChange(value: (/* w */ Double, /* h */ Double) => Unit): Self = StObject.set(x, "onContentSizeChange", js.Any.fromFunction2(value))
      
      inline def setOnContentSizeChangeUndefined: Self = StObject.set(x, "onContentSizeChange", js.undefined)
      
      inline def setOnDragBegin(value: /* index */ Double => Unit): Self = StObject.set(x, "onDragBegin", js.Any.fromFunction1(value))
      
      inline def setOnDragBeginUndefined: Self = StObject.set(x, "onDragBegin", js.undefined)
      
      inline def setOnDragEnd(value: /* params */ DragEndParams[T] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnEndReached(value: /* info */ DistanceFromEnd => Unit): Self = StObject.set(x, "onEndReached", js.Any.fromFunction1(value))
      
      inline def setOnEndReachedNull: Self = StObject.set(x, "onEndReached", null)
      
      inline def setOnEndReachedThreshold(value: Double): Self = StObject.set(x, "onEndReachedThreshold", value.asInstanceOf[js.Any])
      
      inline def setOnEndReachedThresholdNull: Self = StObject.set(x, "onEndReachedThreshold", null)
      
      inline def setOnEndReachedThresholdUndefined: Self = StObject.set(x, "onEndReachedThreshold", js.undefined)
      
      inline def setOnEndReachedUndefined: Self = StObject.set(x, "onEndReached", js.undefined)
      
      inline def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      inline def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
      
      inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      inline def setOnMomentumScrollBegin(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onMomentumScrollBegin", js.Any.fromFunction1(value))
      
      inline def setOnMomentumScrollBeginUndefined: Self = StObject.set(x, "onMomentumScrollBegin", js.undefined)
      
      inline def setOnMomentumScrollEnd(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onMomentumScrollEnd", js.Any.fromFunction1(value))
      
      inline def setOnMomentumScrollEndUndefined: Self = StObject.set(x, "onMomentumScrollEnd", js.undefined)
      
      inline def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      inline def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
      
      inline def setOnPlaceholderIndexChange(value: /* placeholderIndex */ Double => Unit): Self = StObject.set(x, "onPlaceholderIndexChange", js.Any.fromFunction1(value))
      
      inline def setOnPlaceholderIndexChangeUndefined: Self = StObject.set(x, "onPlaceholderIndexChange", js.undefined)
      
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
      
      inline def setOnRefresh(value: () => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
      
      inline def setOnRefreshNull: Self = StObject.set(x, "onRefresh", null)
      
      inline def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
      
      inline def setOnRelease(value: /* index */ Double => Unit): Self = StObject.set(x, "onRelease", js.Any.fromFunction1(value))
      
      inline def setOnReleaseUndefined: Self = StObject.set(x, "onRelease", js.undefined)
      
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
      
      inline def setOnScroll(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollAnimationEnd(value: () => Unit): Self = StObject.set(x, "onScrollAnimationEnd", js.Any.fromFunction0(value))
      
      inline def setOnScrollAnimationEndUndefined: Self = StObject.set(x, "onScrollAnimationEnd", js.undefined)
      
      inline def setOnScrollBeginDrag(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollBeginDrag", js.Any.fromFunction1(value))
      
      inline def setOnScrollBeginDragUndefined: Self = StObject.set(x, "onScrollBeginDrag", js.undefined)
      
      inline def setOnScrollEndDrag(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollEndDrag", js.Any.fromFunction1(value))
      
      inline def setOnScrollEndDragUndefined: Self = StObject.set(x, "onScrollEndDrag", js.undefined)
      
      inline def setOnScrollOffsetChange(value: /* scrollOffset */ Double => Unit): Self = StObject.set(x, "onScrollOffsetChange", js.Any.fromFunction1(value))
      
      inline def setOnScrollOffsetChangeUndefined: Self = StObject.set(x, "onScrollOffsetChange", js.undefined)
      
      inline def setOnScrollToIndexFailed(value: /* info */ AverageItemLength => Unit): Self = StObject.set(x, "onScrollToIndexFailed", js.Any.fromFunction1(value))
      
      inline def setOnScrollToIndexFailedUndefined: Self = StObject.set(x, "onScrollToIndexFailed", js.undefined)
      
      inline def setOnScrollToTop(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollToTop", js.Any.fromFunction1(value))
      
      inline def setOnScrollToTopUndefined: Self = StObject.set(x, "onScrollToTop", js.undefined)
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
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
      
      inline def setOnViewableItemsChanged(value: /* info */ Changed => Unit): Self = StObject.set(x, "onViewableItemsChanged", js.Any.fromFunction1(value))
      
      inline def setOnViewableItemsChangedNull: Self = StObject.set(x, "onViewableItemsChanged", null)
      
      inline def setOnViewableItemsChangedUndefined: Self = StObject.set(x, "onViewableItemsChanged", js.undefined)
      
      inline def setOuterScrollOffset(value: Node): Self = StObject.set(x, "outerScrollOffset", value.asInstanceOf[js.Any])
      
      inline def setOuterScrollOffsetUndefined: Self = StObject.set(x, "outerScrollOffset", js.undefined)
      
      inline def setOverScrollMode(value: auto | always | never): Self = StObject.set(x, "overScrollMode", value.asInstanceOf[js.Any])
      
      inline def setOverScrollModeUndefined: Self = StObject.set(x, "overScrollMode", js.undefined)
      
      inline def setPagingEnabled(value: Boolean): Self = StObject.set(x, "pagingEnabled", value.asInstanceOf[js.Any])
      
      inline def setPagingEnabledUndefined: Self = StObject.set(x, "pagingEnabled", js.undefined)
      
      inline def setPersistentScrollbar(value: Boolean): Self = StObject.set(x, "persistentScrollbar", value.asInstanceOf[js.Any])
      
      inline def setPersistentScrollbarUndefined: Self = StObject.set(x, "persistentScrollbar", js.undefined)
      
      inline def setPinchGestureEnabled(value: Boolean): Self = StObject.set(x, "pinchGestureEnabled", value.asInstanceOf[js.Any])
      
      inline def setPinchGestureEnabledUndefined: Self = StObject.set(x, "pinchGestureEnabled", js.undefined)
      
      inline def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setProgressViewOffset(value: Double): Self = StObject.set(x, "progressViewOffset", value.asInstanceOf[js.Any])
      
      inline def setProgressViewOffsetUndefined: Self = StObject.set(x, "progressViewOffset", js.undefined)
      
      inline def setRefreshControl(value: ReactElement): Self = StObject.set(x, "refreshControl", value.asInstanceOf[js.Any])
      
      inline def setRefreshControlUndefined: Self = StObject.set(x, "refreshControl", js.undefined)
      
      inline def setRefreshing(value: Boolean): Self = StObject.set(x, "refreshing", value.asInstanceOf[js.Any])
      
      inline def setRefreshingNull: Self = StObject.set(x, "refreshing", null)
      
      inline def setRefreshingUndefined: Self = StObject.set(x, "refreshing", js.undefined)
      
      inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
      
      inline def setRenderItem(value: /* params */ RenderItemParams[T] => ReactNode): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      
      inline def setRenderPlaceholder(value: /* params */ typings.reactNativeDraggableFlatlist.anon.Index[T] => Element): Self = StObject.set(x, "renderPlaceholder", js.Any.fromFunction1(value))
      
      inline def setRenderPlaceholderUndefined: Self = StObject.set(x, "renderPlaceholder", js.undefined)
      
      inline def setRenderScrollComponent(value: /* props */ ScrollViewProps => ReactElement): Self = StObject.set(x, "renderScrollComponent", js.Any.fromFunction1(value))
      
      inline def setRenderScrollComponentUndefined: Self = StObject.set(x, "renderScrollComponent", js.undefined)
      
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
      
      inline def setShowsHorizontalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
      
      inline def setShowsHorizontalScrollIndicatorUndefined: Self = StObject.set(x, "showsHorizontalScrollIndicator", js.undefined)
      
      inline def setShowsVerticalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
      
      inline def setShowsVerticalScrollIndicatorUndefined: Self = StObject.set(x, "showsVerticalScrollIndicator", js.undefined)
      
      inline def setSimultaneousHandlers(value: Ref[Any] | js.Array[Ref[Any]]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
      
      inline def setSimultaneousHandlersFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "simultaneousHandlers", js.Any.fromFunction1(value))
      
      inline def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
      
      inline def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
      
      inline def setSimultaneousHandlersVarargs(value: Ref[Any]*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value*))
      
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
      
      inline def setUpdateCellsBatchingPeriod(value: Double): Self = StObject.set(x, "updateCellsBatchingPeriod", value.asInstanceOf[js.Any])
      
      inline def setUpdateCellsBatchingPeriodUndefined: Self = StObject.set(x, "updateCellsBatchingPeriod", js.undefined)
      
      inline def setViewabilityConfig(value: Any): Self = StObject.set(x, "viewabilityConfig", value.asInstanceOf[js.Any])
      
      inline def setViewabilityConfigCallbackPairs(value: ViewabilityConfigCallbackPairs): Self = StObject.set(x, "viewabilityConfigCallbackPairs", value.asInstanceOf[js.Any])
      
      inline def setViewabilityConfigCallbackPairsUndefined: Self = StObject.set(x, "viewabilityConfigCallbackPairs", js.undefined)
      
      inline def setViewabilityConfigCallbackPairsVarargs(value: ViewabilityConfigCallbackPair*): Self = StObject.set(x, "viewabilityConfigCallbackPairs", js.Array(value*))
      
      inline def setViewabilityConfigUndefined: Self = StObject.set(x, "viewabilityConfig", js.undefined)
      
      inline def setWindowSize(value: Double): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
      
      inline def setWindowSizeUndefined: Self = StObject.set(x, "windowSize", js.undefined)
      
      inline def setZoomScale(value: Double): Self = StObject.set(x, "zoomScale", value.asInstanceOf[js.Any])
      
      inline def setZoomScaleUndefined: Self = StObject.set(x, "zoomScale", js.undefined)
    }
  }
}
