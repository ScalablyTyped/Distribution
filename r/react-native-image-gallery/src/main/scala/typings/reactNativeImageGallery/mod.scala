package typings.reactNativeImageGallery

import typings.react.mod.ComponentType
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactNative.anon.AutoscrollToTopThreshold
import typings.reactNative.anon.AverageItemLength
import typings.reactNative.anon.Changed
import typings.reactNative.anon.DistanceFromEnd
import typings.reactNative.anon.Index
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.ImageProps
import typings.reactNative.mod.Insets
import typings.reactNative.mod.NativeScrollEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.ScrollViewProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import typings.reactNative.mod.ViewabilityConfigCallbackPair
import typings.reactNative.mod.ViewabilityConfigCallbackPairs
import typings.reactNativeImageGallery.anon.Uri
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.`box-none`
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.`box-only`
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.`no-hide-descendants`
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.`on-drag`
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.always
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.assertive
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.auto
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.automatic
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.black
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.button
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.center
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.end
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.fast
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.handled
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.interactive
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.never
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.no
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.none
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.normal
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.polite
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.radiobutton_checked
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.radiobutton_unchecked
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.scrollableAxes
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.start
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.white
import typings.reactNativeImageGallery.reactNativeImageGalleryStrings.yes
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-image-gallery", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[Props, js.Object, js.Any]
  
  @js.native
  sealed trait ScrollState extends StObject
  @JSImport("react-native-image-gallery", "ScrollState")
  @js.native
  object ScrollState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ScrollState & String] = js.native
    
    @js.native
    sealed trait DRAGGING
      extends StObject
         with ScrollState
    /* "dragging" */ val DRAGGING: typings.reactNativeImageGallery.mod.ScrollState.DRAGGING & String = js.native
    
    @js.native
    sealed trait IDLE
      extends StObject
         with ScrollState
    /* "idle" */ val IDLE: typings.reactNativeImageGallery.mod.ScrollState.IDLE & String = js.native
    
    @js.native
    sealed trait SETTLING
      extends StObject
         with ScrollState
    /* "settling" */ val SETTLING: typings.reactNativeImageGallery.mod.ScrollState.SETTLING & String = js.native
  }
  
  /* Inlined react-native-image-gallery.react-native-image-gallery.Omit<react-native.react-native.FlatListProps<react-native-image-gallery.react-native-image-gallery.Image>, 'style' | 'ref' | 'keyExtractor' | 'scrollEnabled' | 'horizontal' | 'data' | 'renderItem' | 'onLayout' | 'contentOffset'> */
  trait FlatListProps extends StObject {
    
    var CellRendererComponent: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    var ItemSeparatorComponent: js.UndefOr[ComponentType[js.Any] | Null] = js.undefined
    
    var ListEmptyComponent: js.UndefOr[ComponentType[js.Any] | ReactElement | Null] = js.undefined
    
    var ListFooterComponent: js.UndefOr[ComponentType[js.Any] | ReactElement | Null] = js.undefined
    
    var ListFooterComponentStyle: js.UndefOr[ViewStyle | Null] = js.undefined
    
    var ListHeaderComponent: js.UndefOr[ComponentType[js.Any] | ReactElement | Null] = js.undefined
    
    var ListHeaderComponentStyle: js.UndefOr[ViewStyle | Null] = js.undefined
    
    var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
    
    var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.undefined
    
    var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
    
    var accessibilityHint: js.UndefOr[String] = js.undefined
    
    var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
    
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
    
    var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
    
    var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
    
    var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.undefined
    
    var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
    
    var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
    
    var accessible: js.UndefOr[Boolean] = js.undefined
    
    var alwaysBounceHorizontal: js.UndefOr[Boolean] = js.undefined
    
    var alwaysBounceVertical: js.UndefOr[Boolean] = js.undefined
    
    var automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined
    
    var bounces: js.UndefOr[Boolean] = js.undefined
    
    var bouncesZoom: js.UndefOr[Boolean] = js.undefined
    
    var canCancelContentTouches: js.UndefOr[Boolean] = js.undefined
    
    var centerContent: js.UndefOr[Boolean] = js.undefined
    
    var collapsable: js.UndefOr[Boolean] = js.undefined
    
    var columnWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var contentInset: js.UndefOr[Insets] = js.undefined
    
    var contentInsetAdjustmentBehavior: js.UndefOr[automatic | scrollableAxes | never | always] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var decelerationRate: js.UndefOr[fast | normal | Double] = js.undefined
    
    var directionalLockEnabled: js.UndefOr[Boolean] = js.undefined
    
    var disableIntervalMomentum: js.UndefOr[Boolean] = js.undefined
    
    var disableScrollViewPanResponder: js.UndefOr[Boolean] = js.undefined
    
    var disableVirtualization: js.UndefOr[Boolean] = js.undefined
    
    var endFillColor: js.UndefOr[ColorValue] = js.undefined
    
    var extraData: js.UndefOr[js.Any] = js.undefined
    
    var fadingEdgeLength: js.UndefOr[Double] = js.undefined
    
    var focusable: js.UndefOr[Boolean] = js.undefined
    
    var getItem: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, Image]] = js.undefined
    
    var getItemCount: js.UndefOr[js.Function1[/* data */ js.Any, Double]] = js.undefined
    
    var getItemLayout: js.UndefOr[
        js.Function2[/* data */ js.UndefOr[js.Array[Image] | Null], /* index */ Double, Index]
      ] = js.undefined
    
    var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
    
    var hitSlop: js.UndefOr[Insets] = js.undefined
    
    var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
    
    var indicatorStyle: js.UndefOr[
        typings.reactNativeImageGallery.reactNativeImageGalleryStrings.default | black | white
      ] = js.undefined
    
    var initialNumToRender: js.UndefOr[Double] = js.undefined
    
    var initialScrollIndex: js.UndefOr[Double | Null] = js.undefined
    
    var invertStickyHeaders: js.UndefOr[Boolean] = js.undefined
    
    var inverted: js.UndefOr[Boolean | Null] = js.undefined
    
    var isTVSelectable: js.UndefOr[Boolean] = js.undefined
    
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
    
    var onContentSizeChange: js.UndefOr[js.Function2[/* w */ Double, /* h */ Double, Unit]] = js.undefined
    
    var onEndReached: js.UndefOr[(js.Function1[/* info */ DistanceFromEnd, Unit]) | Null] = js.undefined
    
    var onEndReachedThreshold: js.UndefOr[Double | Null] = js.undefined
    
    var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMomentumScrollBegin: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
    
    var onMomentumScrollEnd: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
    
    var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onRefresh: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
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
    
    var overScrollMode: js.UndefOr[auto | always | never] = js.undefined
    
    var pagingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var persistentScrollbar: js.UndefOr[Boolean] = js.undefined
    
    var pinchGestureEnabled: js.UndefOr[Boolean] = js.undefined
    
    var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
    
    var progressViewOffset: js.UndefOr[Double] = js.undefined
    
    var refreshControl: js.UndefOr[ReactElement] = js.undefined
    
    var refreshing: js.UndefOr[Boolean | Null] = js.undefined
    
    var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
    
    var renderScrollComponent: js.UndefOr[js.Function1[/* props */ ScrollViewProps, ReactElement]] = js.undefined
    
    var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
    
    var scrollEventThrottle: js.UndefOr[Double] = js.undefined
    
    var scrollIndicatorInsets: js.UndefOr[Insets] = js.undefined
    
    var scrollPerfTag: js.UndefOr[String] = js.undefined
    
    var scrollToOverflowEnabled: js.UndefOr[Boolean] = js.undefined
    
    var scrollsToTop: js.UndefOr[Boolean] = js.undefined
    
    var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
    
    var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined
    
    var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
    
    var snapToAlignment: js.UndefOr[start | center | end] = js.undefined
    
    var snapToEnd: js.UndefOr[Boolean] = js.undefined
    
    var snapToInterval: js.UndefOr[Double] = js.undefined
    
    var snapToOffsets: js.UndefOr[js.Array[Double]] = js.undefined
    
    var snapToStart: js.UndefOr[Boolean] = js.undefined
    
    var stickyHeaderIndices: js.UndefOr[js.Array[Double]] = js.undefined
    
    var testID: js.UndefOr[String] = js.undefined
    
    var tvParallaxMagnification: js.UndefOr[Double] = js.undefined
    
    var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
    
    var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
    
    var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
    
    var tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
    
    var updateCellsBatchingPeriod: js.UndefOr[Double] = js.undefined
    
    var viewabilityConfig: js.UndefOr[js.Any] = js.undefined
    
    var viewabilityConfigCallbackPairs: js.UndefOr[ViewabilityConfigCallbackPairs] = js.undefined
    
    var windowSize: js.UndefOr[Double] = js.undefined
    
    var zoomScale: js.UndefOr[Double] = js.undefined
  }
  object FlatListProps {
    
    inline def apply(): FlatListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlatListProps]
    }
    
    extension [Self <: FlatListProps](x: Self) {
      
      inline def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
      
      inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value :_*))
      
      inline def setAccessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
      
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
      
      inline def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
      
      inline def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = StObject.set(x, "accessibilityTraits", js.Array(value :_*))
      
      inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
      
      inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
      
      inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      inline def setAlwaysBounceHorizontal(value: Boolean): Self = StObject.set(x, "alwaysBounceHorizontal", value.asInstanceOf[js.Any])
      
      inline def setAlwaysBounceHorizontalUndefined: Self = StObject.set(x, "alwaysBounceHorizontal", js.undefined)
      
      inline def setAlwaysBounceVertical(value: Boolean): Self = StObject.set(x, "alwaysBounceVertical", value.asInstanceOf[js.Any])
      
      inline def setAlwaysBounceVerticalUndefined: Self = StObject.set(x, "alwaysBounceVertical", js.undefined)
      
      inline def setAutomaticallyAdjustContentInsets(value: Boolean): Self = StObject.set(x, "automaticallyAdjustContentInsets", value.asInstanceOf[js.Any])
      
      inline def setAutomaticallyAdjustContentInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustContentInsets", js.undefined)
      
      inline def setBounces(value: Boolean): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
      
      inline def setBouncesUndefined: Self = StObject.set(x, "bounces", js.undefined)
      
      inline def setBouncesZoom(value: Boolean): Self = StObject.set(x, "bouncesZoom", value.asInstanceOf[js.Any])
      
      inline def setBouncesZoomUndefined: Self = StObject.set(x, "bouncesZoom", js.undefined)
      
      inline def setCanCancelContentTouches(value: Boolean): Self = StObject.set(x, "canCancelContentTouches", value.asInstanceOf[js.Any])
      
      inline def setCanCancelContentTouchesUndefined: Self = StObject.set(x, "canCancelContentTouches", js.undefined)
      
      inline def setCellRendererComponent(value: ComponentType[js.Any]): Self = StObject.set(x, "CellRendererComponent", value.asInstanceOf[js.Any])
      
      inline def setCellRendererComponentUndefined: Self = StObject.set(x, "CellRendererComponent", js.undefined)
      
      inline def setCenterContent(value: Boolean): Self = StObject.set(x, "centerContent", value.asInstanceOf[js.Any])
      
      inline def setCenterContentUndefined: Self = StObject.set(x, "centerContent", js.undefined)
      
      inline def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
      
      inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
      
      inline def setColumnWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "columnWrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setColumnWrapperStyleNull: Self = StObject.set(x, "columnWrapperStyle", null)
      
      inline def setColumnWrapperStyleUndefined: Self = StObject.set(x, "columnWrapperStyle", js.undefined)
      
      inline def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
      
      inline def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
      
      inline def setContentInset(value: Insets): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
      
      inline def setContentInsetAdjustmentBehavior(value: automatic | scrollableAxes | never | always): Self = StObject.set(x, "contentInsetAdjustmentBehavior", value.asInstanceOf[js.Any])
      
      inline def setContentInsetAdjustmentBehaviorUndefined: Self = StObject.set(x, "contentInsetAdjustmentBehavior", js.undefined)
      
      inline def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
      
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
      
      inline def setEndFillColor(value: ColorValue): Self = StObject.set(x, "endFillColor", value.asInstanceOf[js.Any])
      
      inline def setEndFillColorUndefined: Self = StObject.set(x, "endFillColor", js.undefined)
      
      inline def setExtraData(value: js.Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      inline def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
      
      inline def setFadingEdgeLength(value: Double): Self = StObject.set(x, "fadingEdgeLength", value.asInstanceOf[js.Any])
      
      inline def setFadingEdgeLengthUndefined: Self = StObject.set(x, "fadingEdgeLength", js.undefined)
      
      inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setGetItem(value: (/* data */ js.Any, /* index */ Double) => Image): Self = StObject.set(x, "getItem", js.Any.fromFunction2(value))
      
      inline def setGetItemCount(value: /* data */ js.Any => Double): Self = StObject.set(x, "getItemCount", js.Any.fromFunction1(value))
      
      inline def setGetItemCountUndefined: Self = StObject.set(x, "getItemCount", js.undefined)
      
      inline def setGetItemLayout(value: (/* data */ js.UndefOr[js.Array[Image] | Null], /* index */ Double) => Index): Self = StObject.set(x, "getItemLayout", js.Any.fromFunction2(value))
      
      inline def setGetItemLayoutUndefined: Self = StObject.set(x, "getItemLayout", js.undefined)
      
      inline def setGetItemUndefined: Self = StObject.set(x, "getItem", js.undefined)
      
      inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      inline def setIndicatorStyle(value: typings.reactNativeImageGallery.reactNativeImageGalleryStrings.default | black | white): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
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
      
      inline def setItemSeparatorComponent(value: ComponentType[js.Any]): Self = StObject.set(x, "ItemSeparatorComponent", value.asInstanceOf[js.Any])
      
      inline def setItemSeparatorComponentNull: Self = StObject.set(x, "ItemSeparatorComponent", null)
      
      inline def setItemSeparatorComponentUndefined: Self = StObject.set(x, "ItemSeparatorComponent", js.undefined)
      
      inline def setKeyboardDismissMode(value: none | interactive | `on-drag`): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
      
      inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
      
      inline def setKeyboardShouldPersistTaps(value: Boolean | always | never | handled): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
      
      inline def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
      
      inline def setLegacyImplementation(value: Boolean): Self = StObject.set(x, "legacyImplementation", value.asInstanceOf[js.Any])
      
      inline def setLegacyImplementationUndefined: Self = StObject.set(x, "legacyImplementation", js.undefined)
      
      inline def setListEmptyComponent(value: ComponentType[js.Any] | ReactElement): Self = StObject.set(x, "ListEmptyComponent", value.asInstanceOf[js.Any])
      
      inline def setListEmptyComponentNull: Self = StObject.set(x, "ListEmptyComponent", null)
      
      inline def setListEmptyComponentUndefined: Self = StObject.set(x, "ListEmptyComponent", js.undefined)
      
      inline def setListFooterComponent(value: ComponentType[js.Any] | ReactElement): Self = StObject.set(x, "ListFooterComponent", value.asInstanceOf[js.Any])
      
      inline def setListFooterComponentNull: Self = StObject.set(x, "ListFooterComponent", null)
      
      inline def setListFooterComponentStyle(value: ViewStyle): Self = StObject.set(x, "ListFooterComponentStyle", value.asInstanceOf[js.Any])
      
      inline def setListFooterComponentStyleNull: Self = StObject.set(x, "ListFooterComponentStyle", null)
      
      inline def setListFooterComponentStyleUndefined: Self = StObject.set(x, "ListFooterComponentStyle", js.undefined)
      
      inline def setListFooterComponentUndefined: Self = StObject.set(x, "ListFooterComponent", js.undefined)
      
      inline def setListHeaderComponent(value: ComponentType[js.Any] | ReactElement): Self = StObject.set(x, "ListHeaderComponent", value.asInstanceOf[js.Any])
      
      inline def setListHeaderComponentNull: Self = StObject.set(x, "ListHeaderComponent", null)
      
      inline def setListHeaderComponentStyle(value: ViewStyle): Self = StObject.set(x, "ListHeaderComponentStyle", value.asInstanceOf[js.Any])
      
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
      
      inline def setOnContentSizeChange(value: (/* w */ Double, /* h */ Double) => Unit): Self = StObject.set(x, "onContentSizeChange", js.Any.fromFunction2(value))
      
      inline def setOnContentSizeChangeUndefined: Self = StObject.set(x, "onContentSizeChange", js.undefined)
      
      inline def setOnEndReached(value: /* info */ DistanceFromEnd => Unit): Self = StObject.set(x, "onEndReached", js.Any.fromFunction1(value))
      
      inline def setOnEndReachedNull: Self = StObject.set(x, "onEndReached", null)
      
      inline def setOnEndReachedThreshold(value: Double): Self = StObject.set(x, "onEndReachedThreshold", value.asInstanceOf[js.Any])
      
      inline def setOnEndReachedThresholdNull: Self = StObject.set(x, "onEndReachedThreshold", null)
      
      inline def setOnEndReachedThresholdUndefined: Self = StObject.set(x, "onEndReachedThreshold", js.undefined)
      
      inline def setOnEndReachedUndefined: Self = StObject.set(x, "onEndReached", js.undefined)
      
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
      
      inline def setOnRefresh(value: () => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
      
      inline def setOnRefreshNull: Self = StObject.set(x, "onRefresh", null)
      
      inline def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
      
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
      
      inline def setRenderScrollComponent(value: /* props */ ScrollViewProps => ReactElement): Self = StObject.set(x, "renderScrollComponent", js.Any.fromFunction1(value))
      
      inline def setRenderScrollComponentUndefined: Self = StObject.set(x, "renderScrollComponent", js.undefined)
      
      inline def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
      
      inline def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
      
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
      
      inline def setSnapToAlignment(value: start | center | end): Self = StObject.set(x, "snapToAlignment", value.asInstanceOf[js.Any])
      
      inline def setSnapToAlignmentUndefined: Self = StObject.set(x, "snapToAlignment", js.undefined)
      
      inline def setSnapToEnd(value: Boolean): Self = StObject.set(x, "snapToEnd", value.asInstanceOf[js.Any])
      
      inline def setSnapToEndUndefined: Self = StObject.set(x, "snapToEnd", js.undefined)
      
      inline def setSnapToInterval(value: Double): Self = StObject.set(x, "snapToInterval", value.asInstanceOf[js.Any])
      
      inline def setSnapToIntervalUndefined: Self = StObject.set(x, "snapToInterval", js.undefined)
      
      inline def setSnapToOffsets(value: js.Array[Double]): Self = StObject.set(x, "snapToOffsets", value.asInstanceOf[js.Any])
      
      inline def setSnapToOffsetsUndefined: Self = StObject.set(x, "snapToOffsets", js.undefined)
      
      inline def setSnapToOffsetsVarargs(value: Double*): Self = StObject.set(x, "snapToOffsets", js.Array(value :_*))
      
      inline def setSnapToStart(value: Boolean): Self = StObject.set(x, "snapToStart", value.asInstanceOf[js.Any])
      
      inline def setSnapToStartUndefined: Self = StObject.set(x, "snapToStart", js.undefined)
      
      inline def setStickyHeaderIndices(value: js.Array[Double]): Self = StObject.set(x, "stickyHeaderIndices", value.asInstanceOf[js.Any])
      
      inline def setStickyHeaderIndicesUndefined: Self = StObject.set(x, "stickyHeaderIndices", js.undefined)
      
      inline def setStickyHeaderIndicesVarargs(value: Double*): Self = StObject.set(x, "stickyHeaderIndices", js.Array(value :_*))
      
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
      
      inline def setViewabilityConfig(value: js.Any): Self = StObject.set(x, "viewabilityConfig", value.asInstanceOf[js.Any])
      
      inline def setViewabilityConfigCallbackPairs(value: ViewabilityConfigCallbackPairs): Self = StObject.set(x, "viewabilityConfigCallbackPairs", value.asInstanceOf[js.Any])
      
      inline def setViewabilityConfigCallbackPairsUndefined: Self = StObject.set(x, "viewabilityConfigCallbackPairs", js.undefined)
      
      inline def setViewabilityConfigCallbackPairsVarargs(value: ViewabilityConfigCallbackPair*): Self = StObject.set(x, "viewabilityConfigCallbackPairs", js.Array(value :_*))
      
      inline def setViewabilityConfigUndefined: Self = StObject.set(x, "viewabilityConfig", js.undefined)
      
      inline def setWindowSize(value: Double): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
      
      inline def setWindowSizeUndefined: Self = StObject.set(x, "windowSize", js.undefined)
      
      inline def setZoomScale(value: Double): Self = StObject.set(x, "zoomScale", value.asInstanceOf[js.Any])
      
      inline def setZoomScaleUndefined: Self = StObject.set(x, "zoomScale", js.undefined)
    }
  }
  
  type Gallery = PureComponent[Props, js.Object, js.Any]
  
  trait GestureState extends StObject {
    
    var _accountsForMovesUpTo: Double
    
    var _singleTabFailed: js.UndefOr[Boolean] = js.undefined
    
    var doubleTapUp: Boolean
    
    var dx: Double
    
    var dy: Double
    
    var moveX: Double
    
    var moveY: Double
    
    var numberActiveTouches: Double
    
    var pinch: js.UndefOr[Double] = js.undefined
    
    var previousMoveX: Double
    
    var previousMoveY: Double
    
    var previousPinch: js.UndefOr[Double] = js.undefined
    
    var singleTapUp: Boolean
    
    var vx: Double
    
    var vy: Double
    
    var x0: Double
    
    var y0: Double
  }
  object GestureState {
    
    inline def apply(
      _accountsForMovesUpTo: Double,
      doubleTapUp: Boolean,
      dx: Double,
      dy: Double,
      moveX: Double,
      moveY: Double,
      numberActiveTouches: Double,
      previousMoveX: Double,
      previousMoveY: Double,
      singleTapUp: Boolean,
      vx: Double,
      vy: Double,
      x0: Double,
      y0: Double
    ): GestureState = {
      val __obj = js.Dynamic.literal(_accountsForMovesUpTo = _accountsForMovesUpTo.asInstanceOf[js.Any], doubleTapUp = doubleTapUp.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], moveX = moveX.asInstanceOf[js.Any], moveY = moveY.asInstanceOf[js.Any], numberActiveTouches = numberActiveTouches.asInstanceOf[js.Any], previousMoveX = previousMoveX.asInstanceOf[js.Any], previousMoveY = previousMoveY.asInstanceOf[js.Any], singleTapUp = singleTapUp.asInstanceOf[js.Any], vx = vx.asInstanceOf[js.Any], vy = vy.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
      __obj.asInstanceOf[GestureState]
    }
    
    extension [Self <: GestureState](x: Self) {
      
      inline def setDoubleTapUp(value: Boolean): Self = StObject.set(x, "doubleTapUp", value.asInstanceOf[js.Any])
      
      inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setMoveX(value: Double): Self = StObject.set(x, "moveX", value.asInstanceOf[js.Any])
      
      inline def setMoveY(value: Double): Self = StObject.set(x, "moveY", value.asInstanceOf[js.Any])
      
      inline def setNumberActiveTouches(value: Double): Self = StObject.set(x, "numberActiveTouches", value.asInstanceOf[js.Any])
      
      inline def setPinch(value: Double): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
      
      inline def setPinchUndefined: Self = StObject.set(x, "pinch", js.undefined)
      
      inline def setPreviousMoveX(value: Double): Self = StObject.set(x, "previousMoveX", value.asInstanceOf[js.Any])
      
      inline def setPreviousMoveY(value: Double): Self = StObject.set(x, "previousMoveY", value.asInstanceOf[js.Any])
      
      inline def setPreviousPinch(value: Double): Self = StObject.set(x, "previousPinch", value.asInstanceOf[js.Any])
      
      inline def setPreviousPinchUndefined: Self = StObject.set(x, "previousPinch", js.undefined)
      
      inline def setSingleTapUp(value: Boolean): Self = StObject.set(x, "singleTapUp", value.asInstanceOf[js.Any])
      
      inline def setVx(value: Double): Self = StObject.set(x, "vx", value.asInstanceOf[js.Any])
      
      inline def setVy(value: Double): Self = StObject.set(x, "vy", value.asInstanceOf[js.Any])
      
      inline def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
      
      inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      inline def set_accountsForMovesUpTo(value: Double): Self = StObject.set(x, "_accountsForMovesUpTo", value.asInstanceOf[js.Any])
      
      inline def set_singleTabFailed(value: Boolean): Self = StObject.set(x, "_singleTabFailed", value.asInstanceOf[js.Any])
      
      inline def set_singleTabFailedUndefined: Self = StObject.set(x, "_singleTabFailed", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeImageGallery.mod.LocalImage
    - typings.reactNativeImageGallery.mod.RemoteImage
  */
  trait Image extends StObject
  object Image {
    
    inline def LocalImage(dimensions: ImageDimensions, source: Double): typings.reactNativeImageGallery.mod.LocalImage = {
      val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNativeImageGallery.mod.LocalImage]
    }
    
    inline def RemoteImage(source: Uri): typings.reactNativeImageGallery.mod.RemoteImage = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNativeImageGallery.mod.RemoteImage]
    }
  }
  
  trait ImageDimensions extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object ImageDimensions {
    
    inline def apply(height: Double, width: Double): ImageDimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageDimensions]
    }
    
    extension [Self <: ImageDimensions](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocalImage
    extends StObject
       with Image {
    
    var dimensions: ImageDimensions
    
    var source: Double
  }
  object LocalImage {
    
    inline def apply(dimensions: ImageDimensions, source: Double): LocalImage = {
      val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalImage]
    }
    
    extension [Self <: LocalImage](x: Self) {
      
      inline def setDimensions(value: ImageDimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  trait Props
    extends StObject
       with ViewProps {
    
    /**
      * Custom function to render the page of an image that couldn't be displayed
      */
    var errorComponent: js.UndefOr[js.Function0[ReactNode]] = js.undefined
    
    /**
      * Props to be passed to the underlying FlatList
      * @default { windowSize: 3 }
      */
    var flatListProps: js.UndefOr[FlatListProps] = js.undefined
    
    /**
      * Custom function to render your images, 1st param is the image props, 2nd is its dimensions
      */
    var imageComponent: js.UndefOr[
        js.Function2[/* imageProps */ ImageProps, /* imageDimensions */ ImageDimensions, ReactNode]
      ] = js.undefined
    
    /**
      * Your array of images
      */
    var images: js.Array[Image]
    
    /**
      * Image displayed first
      * @default 0
      */
    var initialPage: js.UndefOr[Double] = js.undefined
    
    /**
      * Fired after a long press
      */
    var onLongPress: js.UndefOr[js.Function1[/* state */ GestureState, Unit]] = js.undefined
    
    /**
      * Scroll event, see scroll state and events
      */
    var onPageScroll: js.UndefOr[js.Function1[/* event */ ScrollEvent, Unit]] = js.undefined
    
    /**
      * Called when page scrolling state has changed, see scroll state and events
      */
    var onPageScrollStateChanged: js.UndefOr[js.Function1[/* state */ ScrollState, Unit]] = js.undefined
    
    /**
      * Fired with the index of page that has been selected
      */
    var onPageSelected: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.undefined
    
    /**
      * Fired after a single tap
      */
    var onSingleTapConfirmed: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.undefined
    
    /**
      * Blank space to show between images
      */
    var pageMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * Custom style for the FlatList component
      */
    var scrollViewStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object Props {
    
    inline def apply(images: js.Array[Image]): Props = {
      val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setErrorComponent(value: () => ReactNode): Self = StObject.set(x, "errorComponent", js.Any.fromFunction0(value))
      
      inline def setErrorComponentUndefined: Self = StObject.set(x, "errorComponent", js.undefined)
      
      inline def setFlatListProps(value: FlatListProps): Self = StObject.set(x, "flatListProps", value.asInstanceOf[js.Any])
      
      inline def setFlatListPropsUndefined: Self = StObject.set(x, "flatListProps", js.undefined)
      
      inline def setImageComponent(value: (/* imageProps */ ImageProps, /* imageDimensions */ ImageDimensions) => ReactNode): Self = StObject.set(x, "imageComponent", js.Any.fromFunction2(value))
      
      inline def setImageComponentUndefined: Self = StObject.set(x, "imageComponent", js.undefined)
      
      inline def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value :_*))
      
      inline def setInitialPage(value: Double): Self = StObject.set(x, "initialPage", value.asInstanceOf[js.Any])
      
      inline def setInitialPageUndefined: Self = StObject.set(x, "initialPage", js.undefined)
      
      inline def setOnLongPress(value: /* state */ GestureState => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnPageScroll(value: /* event */ ScrollEvent => Unit): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
      
      inline def setOnPageScrollStateChanged(value: /* state */ ScrollState => Unit): Self = StObject.set(x, "onPageScrollStateChanged", js.Any.fromFunction1(value))
      
      inline def setOnPageScrollStateChangedUndefined: Self = StObject.set(x, "onPageScrollStateChanged", js.undefined)
      
      inline def setOnPageScrollUndefined: Self = StObject.set(x, "onPageScroll", js.undefined)
      
      inline def setOnPageSelected(value: /* page */ Double => Unit): Self = StObject.set(x, "onPageSelected", js.Any.fromFunction1(value))
      
      inline def setOnPageSelectedUndefined: Self = StObject.set(x, "onPageSelected", js.undefined)
      
      inline def setOnSingleTapConfirmed(value: /* page */ Double => Unit): Self = StObject.set(x, "onSingleTapConfirmed", js.Any.fromFunction1(value))
      
      inline def setOnSingleTapConfirmedUndefined: Self = StObject.set(x, "onSingleTapConfirmed", js.undefined)
      
      inline def setPageMargin(value: Double): Self = StObject.set(x, "pageMargin", value.asInstanceOf[js.Any])
      
      inline def setPageMarginUndefined: Self = StObject.set(x, "pageMargin", js.undefined)
      
      inline def setScrollViewStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "scrollViewStyle", value.asInstanceOf[js.Any])
      
      inline def setScrollViewStyleNull: Self = StObject.set(x, "scrollViewStyle", null)
      
      inline def setScrollViewStyleUndefined: Self = StObject.set(x, "scrollViewStyle", js.undefined)
    }
  }
  
  trait RemoteImage
    extends StObject
       with Image {
    
    var dimensions: js.UndefOr[ImageDimensions] = js.undefined
    
    var source: Uri
  }
  object RemoteImage {
    
    inline def apply(source: Uri): RemoteImage = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteImage]
    }
    
    extension [Self <: RemoteImage](x: Self) {
      
      inline def setDimensions(value: ImageDimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      inline def setSource(value: Uri): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollEvent extends StObject {
    
    var fraction: Double
    
    var offset: Double
    
    var position: Double
  }
  object ScrollEvent {
    
    inline def apply(fraction: Double, offset: Double, position: Double): ScrollEvent = {
      val __obj = js.Dynamic.literal(fraction = fraction.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollEvent]
    }
    
    extension [Self <: ScrollEvent](x: Self) {
      
      inline def setFraction(value: Double): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
