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
import scala.scalajs.js.`|`
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
    def apply(value: String): js.UndefOr[ScrollState with String] = js.native
    
    @js.native
    sealed trait DRAGGING extends ScrollState
    /* "dragging" */ val DRAGGING: typings.reactNativeImageGallery.mod.ScrollState.DRAGGING with String = js.native
    
    @js.native
    sealed trait IDLE extends ScrollState
    /* "idle" */ val IDLE: typings.reactNativeImageGallery.mod.ScrollState.IDLE with String = js.native
    
    @js.native
    sealed trait SETTLING extends ScrollState
    /* "settling" */ val SETTLING: typings.reactNativeImageGallery.mod.ScrollState.SETTLING with String = js.native
  }
  
  /* Inlined react-native-image-gallery.react-native-image-gallery.Omit<react-native.react-native.FlatListProps<react-native-image-gallery.react-native-image-gallery.Image>, 'style' | 'ref' | 'keyExtractor' | 'scrollEnabled' | 'horizontal' | 'data' | 'renderItem' | 'onLayout' | 'contentOffset'> */
  @js.native
  trait FlatListProps extends StObject {
    
    var CellRendererComponent: js.UndefOr[ComponentType[_]] = js.native
    
    var ItemSeparatorComponent: js.UndefOr[ComponentType[_] | Null] = js.native
    
    var ListEmptyComponent: js.UndefOr[ComponentType[_] | ReactElement | Null] = js.native
    
    var ListFooterComponent: js.UndefOr[ComponentType[_] | ReactElement | Null] = js.native
    
    var ListFooterComponentStyle: js.UndefOr[ViewStyle | Null] = js.native
    
    var ListHeaderComponent: js.UndefOr[ComponentType[_] | ReactElement | Null] = js.native
    
    var ListHeaderComponentStyle: js.UndefOr[ViewStyle | Null] = js.native
    
    var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.native
    
    var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.native
    
    var accessibilityElementsHidden: js.UndefOr[Boolean] = js.native
    
    var accessibilityHint: js.UndefOr[String] = js.native
    
    var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.native
    
    var accessibilityLabel: js.UndefOr[String] = js.native
    
    var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.native
    
    var accessibilityRole: js.UndefOr[AccessibilityRole] = js.native
    
    var accessibilityState: js.UndefOr[AccessibilityState] = js.native
    
    var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.native
    
    var accessibilityValue: js.UndefOr[AccessibilityValue] = js.native
    
    var accessibilityViewIsModal: js.UndefOr[Boolean] = js.native
    
    var accessible: js.UndefOr[Boolean] = js.native
    
    var alwaysBounceHorizontal: js.UndefOr[Boolean] = js.native
    
    var alwaysBounceVertical: js.UndefOr[Boolean] = js.native
    
    var automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.native
    
    var bounces: js.UndefOr[Boolean] = js.native
    
    var bouncesZoom: js.UndefOr[Boolean] = js.native
    
    var canCancelContentTouches: js.UndefOr[Boolean] = js.native
    
    var centerContent: js.UndefOr[Boolean] = js.native
    
    var collapsable: js.UndefOr[Boolean] = js.native
    
    var columnWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var contentInset: js.UndefOr[Insets] = js.native
    
    var contentInsetAdjustmentBehavior: js.UndefOr[automatic | scrollableAxes | never | always] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var decelerationRate: js.UndefOr[fast | normal | Double] = js.native
    
    var directionalLockEnabled: js.UndefOr[Boolean] = js.native
    
    var disableIntervalMomentum: js.UndefOr[Boolean] = js.native
    
    var disableScrollViewPanResponder: js.UndefOr[Boolean] = js.native
    
    var disableVirtualization: js.UndefOr[Boolean] = js.native
    
    var endFillColor: js.UndefOr[ColorValue] = js.native
    
    var extraData: js.UndefOr[js.Any] = js.native
    
    var fadingEdgeLength: js.UndefOr[Double] = js.native
    
    var focusable: js.UndefOr[Boolean] = js.native
    
    var getItem: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, Image]] = js.native
    
    var getItemCount: js.UndefOr[js.Function1[/* data */ js.Any, Double]] = js.native
    
    var getItemLayout: js.UndefOr[
        js.Function2[/* data */ js.UndefOr[js.Array[Image] | Null], /* index */ Double, Index]
      ] = js.native
    
    var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
    
    var hitSlop: js.UndefOr[Insets] = js.native
    
    var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
    
    var indicatorStyle: js.UndefOr[
        typings.reactNativeImageGallery.reactNativeImageGalleryStrings.default | black | white
      ] = js.native
    
    var initialNumToRender: js.UndefOr[Double] = js.native
    
    var initialScrollIndex: js.UndefOr[Double | Null] = js.native
    
    var invertStickyHeaders: js.UndefOr[Boolean] = js.native
    
    var inverted: js.UndefOr[Boolean | Null] = js.native
    
    var isTVSelectable: js.UndefOr[Boolean] = js.native
    
    var keyboardDismissMode: js.UndefOr[none | interactive | `on-drag`] = js.native
    
    var keyboardShouldPersistTaps: js.UndefOr[Boolean | always | never | handled] = js.native
    
    var legacyImplementation: js.UndefOr[Boolean] = js.native
    
    var listKey: js.UndefOr[String] = js.native
    
    var maintainVisibleContentPosition: js.UndefOr[Null | AutoscrollToTopThreshold] = js.native
    
    var maxToRenderPerBatch: js.UndefOr[Double] = js.native
    
    var maximumZoomScale: js.UndefOr[Double] = js.native
    
    var minimumZoomScale: js.UndefOr[Double] = js.native
    
    var nativeID: js.UndefOr[String] = js.native
    
    var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.native
    
    var nestedScrollEnabled: js.UndefOr[Boolean] = js.native
    
    var numColumns: js.UndefOr[Double] = js.native
    
    var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.native
    
    var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onContentSizeChange: js.UndefOr[js.Function2[/* w */ Double, /* h */ Double, Unit]] = js.native
    
    var onEndReached: js.UndefOr[(js.Function1[/* info */ DistanceFromEnd, Unit]) | Null] = js.native
    
    var onEndReachedThreshold: js.UndefOr[Double | Null] = js.native
    
    var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onMomentumScrollBegin: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.native
    
    var onMomentumScrollEnd: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.native
    
    var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
    
    var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
    
    var onRefresh: js.UndefOr[js.Function0[Unit] | Null] = js.native
    
    var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
    
    var onScroll: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.native
    
    var onScrollAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onScrollBeginDrag: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.native
    
    var onScrollEndDrag: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.native
    
    var onScrollToIndexFailed: js.UndefOr[js.Function1[/* info */ AverageItemLength, Unit]] = js.native
    
    var onScrollToTop: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.native
    
    var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
    
    var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
    
    var onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    var onTouchEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    var onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    var onTouchStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    var onViewableItemsChanged: js.UndefOr[(js.Function1[/* info */ Changed, Unit]) | Null] = js.native
    
    var overScrollMode: js.UndefOr[auto | always | never] = js.native
    
    var pagingEnabled: js.UndefOr[Boolean] = js.native
    
    var persistentScrollbar: js.UndefOr[Boolean] = js.native
    
    var pinchGestureEnabled: js.UndefOr[Boolean] = js.native
    
    var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.native
    
    var progressViewOffset: js.UndefOr[Double] = js.native
    
    var refreshControl: js.UndefOr[ReactElement] = js.native
    
    var refreshing: js.UndefOr[Boolean | Null] = js.native
    
    var removeClippedSubviews: js.UndefOr[Boolean] = js.native
    
    var renderScrollComponent: js.UndefOr[js.Function1[/* props */ ScrollViewProps, ReactElement]] = js.native
    
    var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.native
    
    var scrollEventThrottle: js.UndefOr[Double] = js.native
    
    var scrollIndicatorInsets: js.UndefOr[Insets] = js.native
    
    var scrollPerfTag: js.UndefOr[String] = js.native
    
    var scrollToOverflowEnabled: js.UndefOr[Boolean] = js.native
    
    var scrollsToTop: js.UndefOr[Boolean] = js.native
    
    var shouldRasterizeIOS: js.UndefOr[Boolean] = js.native
    
    var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.native
    
    var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.native
    
    var snapToAlignment: js.UndefOr[start | center | end] = js.native
    
    var snapToEnd: js.UndefOr[Boolean] = js.native
    
    var snapToInterval: js.UndefOr[Double] = js.native
    
    var snapToOffsets: js.UndefOr[js.Array[Double]] = js.native
    
    var snapToStart: js.UndefOr[Boolean] = js.native
    
    var stickyHeaderIndices: js.UndefOr[js.Array[Double]] = js.native
    
    var testID: js.UndefOr[String] = js.native
    
    var tvParallaxMagnification: js.UndefOr[Double] = js.native
    
    var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
    
    var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.native
    
    var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.native
    
    var tvParallaxTiltAngle: js.UndefOr[Double] = js.native
    
    var updateCellsBatchingPeriod: js.UndefOr[Double] = js.native
    
    var viewabilityConfig: js.UndefOr[js.Any] = js.native
    
    var viewabilityConfigCallbackPairs: js.UndefOr[ViewabilityConfigCallbackPairs] = js.native
    
    var windowSize: js.UndefOr[Double] = js.native
    
    var zoomScale: js.UndefOr[Double] = js.native
  }
  object FlatListProps {
    
    @scala.inline
    def apply(): FlatListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlatListProps]
    }
    
    @scala.inline
    implicit class FlatListPropsMutableBuilder[Self <: FlatListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
      
      @scala.inline
      def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value :_*))
      
      @scala.inline
      def setAccessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
      
      @scala.inline
      def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
      
      @scala.inline
      def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
      
      @scala.inline
      def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
      
      @scala.inline
      def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      @scala.inline
      def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
      
      @scala.inline
      def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
      
      @scala.inline
      def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
      
      @scala.inline
      def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
      
      @scala.inline
      def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = StObject.set(x, "accessibilityTraits", js.Array(value :_*))
      
      @scala.inline
      def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
      
      @scala.inline
      def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
      
      @scala.inline
      def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      @scala.inline
      def setAlwaysBounceHorizontal(value: Boolean): Self = StObject.set(x, "alwaysBounceHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysBounceHorizontalUndefined: Self = StObject.set(x, "alwaysBounceHorizontal", js.undefined)
      
      @scala.inline
      def setAlwaysBounceVertical(value: Boolean): Self = StObject.set(x, "alwaysBounceVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysBounceVerticalUndefined: Self = StObject.set(x, "alwaysBounceVertical", js.undefined)
      
      @scala.inline
      def setAutomaticallyAdjustContentInsets(value: Boolean): Self = StObject.set(x, "automaticallyAdjustContentInsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomaticallyAdjustContentInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustContentInsets", js.undefined)
      
      @scala.inline
      def setBounces(value: Boolean): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBouncesUndefined: Self = StObject.set(x, "bounces", js.undefined)
      
      @scala.inline
      def setBouncesZoom(value: Boolean): Self = StObject.set(x, "bouncesZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBouncesZoomUndefined: Self = StObject.set(x, "bouncesZoom", js.undefined)
      
      @scala.inline
      def setCanCancelContentTouches(value: Boolean): Self = StObject.set(x, "canCancelContentTouches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanCancelContentTouchesUndefined: Self = StObject.set(x, "canCancelContentTouches", js.undefined)
      
      @scala.inline
      def setCellRendererComponent(value: ComponentType[_]): Self = StObject.set(x, "CellRendererComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellRendererComponentUndefined: Self = StObject.set(x, "CellRendererComponent", js.undefined)
      
      @scala.inline
      def setCenterContent(value: Boolean): Self = StObject.set(x, "centerContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterContentUndefined: Self = StObject.set(x, "centerContent", js.undefined)
      
      @scala.inline
      def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
      
      @scala.inline
      def setColumnWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "columnWrapperStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnWrapperStyleNull: Self = StObject.set(x, "columnWrapperStyle", null)
      
      @scala.inline
      def setColumnWrapperStyleUndefined: Self = StObject.set(x, "columnWrapperStyle", js.undefined)
      
      @scala.inline
      def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
      
      @scala.inline
      def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
      
      @scala.inline
      def setContentInset(value: Insets): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentInsetAdjustmentBehavior(value: automatic | scrollableAxes | never | always): Self = StObject.set(x, "contentInsetAdjustmentBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentInsetAdjustmentBehaviorUndefined: Self = StObject.set(x, "contentInsetAdjustmentBehavior", js.undefined)
      
      @scala.inline
      def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDecelerationRate(value: fast | normal | Double): Self = StObject.set(x, "decelerationRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecelerationRateUndefined: Self = StObject.set(x, "decelerationRate", js.undefined)
      
      @scala.inline
      def setDirectionalLockEnabled(value: Boolean): Self = StObject.set(x, "directionalLockEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalLockEnabledUndefined: Self = StObject.set(x, "directionalLockEnabled", js.undefined)
      
      @scala.inline
      def setDisableIntervalMomentum(value: Boolean): Self = StObject.set(x, "disableIntervalMomentum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableIntervalMomentumUndefined: Self = StObject.set(x, "disableIntervalMomentum", js.undefined)
      
      @scala.inline
      def setDisableScrollViewPanResponder(value: Boolean): Self = StObject.set(x, "disableScrollViewPanResponder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableScrollViewPanResponderUndefined: Self = StObject.set(x, "disableScrollViewPanResponder", js.undefined)
      
      @scala.inline
      def setDisableVirtualization(value: Boolean): Self = StObject.set(x, "disableVirtualization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableVirtualizationUndefined: Self = StObject.set(x, "disableVirtualization", js.undefined)
      
      @scala.inline
      def setEndFillColor(value: ColorValue): Self = StObject.set(x, "endFillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndFillColorUndefined: Self = StObject.set(x, "endFillColor", js.undefined)
      
      @scala.inline
      def setExtraData(value: js.Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
      
      @scala.inline
      def setFadingEdgeLength(value: Double): Self = StObject.set(x, "fadingEdgeLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadingEdgeLengthUndefined: Self = StObject.set(x, "fadingEdgeLength", js.undefined)
      
      @scala.inline
      def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setGetItem(value: (/* data */ js.Any, /* index */ Double) => Image): Self = StObject.set(x, "getItem", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetItemCount(value: /* data */ js.Any => Double): Self = StObject.set(x, "getItemCount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetItemCountUndefined: Self = StObject.set(x, "getItemCount", js.undefined)
      
      @scala.inline
      def setGetItemLayout(value: (/* data */ js.UndefOr[js.Array[Image] | Null], /* index */ Double) => Index): Self = StObject.set(x, "getItemLayout", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetItemLayoutUndefined: Self = StObject.set(x, "getItemLayout", js.undefined)
      
      @scala.inline
      def setGetItemUndefined: Self = StObject.set(x, "getItem", js.undefined)
      
      @scala.inline
      def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      @scala.inline
      def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      @scala.inline
      def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      @scala.inline
      def setIndicatorStyle(value: typings.reactNativeImageGallery.reactNativeImageGalleryStrings.default | black | white): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      @scala.inline
      def setInitialNumToRender(value: Double): Self = StObject.set(x, "initialNumToRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialNumToRenderUndefined: Self = StObject.set(x, "initialNumToRender", js.undefined)
      
      @scala.inline
      def setInitialScrollIndex(value: Double): Self = StObject.set(x, "initialScrollIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialScrollIndexNull: Self = StObject.set(x, "initialScrollIndex", null)
      
      @scala.inline
      def setInitialScrollIndexUndefined: Self = StObject.set(x, "initialScrollIndex", js.undefined)
      
      @scala.inline
      def setInvertStickyHeaders(value: Boolean): Self = StObject.set(x, "invertStickyHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertStickyHeadersUndefined: Self = StObject.set(x, "invertStickyHeaders", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedNull: Self = StObject.set(x, "inverted", null)
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
      
      @scala.inline
      def setItemSeparatorComponent(value: ComponentType[_]): Self = StObject.set(x, "ItemSeparatorComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemSeparatorComponentNull: Self = StObject.set(x, "ItemSeparatorComponent", null)
      
      @scala.inline
      def setItemSeparatorComponentUndefined: Self = StObject.set(x, "ItemSeparatorComponent", js.undefined)
      
      @scala.inline
      def setKeyboardDismissMode(value: none | interactive | `on-drag`): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
      
      @scala.inline
      def setKeyboardShouldPersistTaps(value: Boolean | always | never | handled): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
      
      @scala.inline
      def setLegacyImplementation(value: Boolean): Self = StObject.set(x, "legacyImplementation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegacyImplementationUndefined: Self = StObject.set(x, "legacyImplementation", js.undefined)
      
      @scala.inline
      def setListEmptyComponent(value: ComponentType[_] | ReactElement): Self = StObject.set(x, "ListEmptyComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListEmptyComponentNull: Self = StObject.set(x, "ListEmptyComponent", null)
      
      @scala.inline
      def setListEmptyComponentUndefined: Self = StObject.set(x, "ListEmptyComponent", js.undefined)
      
      @scala.inline
      def setListFooterComponent(value: ComponentType[_] | ReactElement): Self = StObject.set(x, "ListFooterComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListFooterComponentNull: Self = StObject.set(x, "ListFooterComponent", null)
      
      @scala.inline
      def setListFooterComponentStyle(value: ViewStyle): Self = StObject.set(x, "ListFooterComponentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListFooterComponentStyleNull: Self = StObject.set(x, "ListFooterComponentStyle", null)
      
      @scala.inline
      def setListFooterComponentStyleUndefined: Self = StObject.set(x, "ListFooterComponentStyle", js.undefined)
      
      @scala.inline
      def setListFooterComponentUndefined: Self = StObject.set(x, "ListFooterComponent", js.undefined)
      
      @scala.inline
      def setListHeaderComponent(value: ComponentType[_] | ReactElement): Self = StObject.set(x, "ListHeaderComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListHeaderComponentNull: Self = StObject.set(x, "ListHeaderComponent", null)
      
      @scala.inline
      def setListHeaderComponentStyle(value: ViewStyle): Self = StObject.set(x, "ListHeaderComponentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListHeaderComponentStyleNull: Self = StObject.set(x, "ListHeaderComponentStyle", null)
      
      @scala.inline
      def setListHeaderComponentStyleUndefined: Self = StObject.set(x, "ListHeaderComponentStyle", js.undefined)
      
      @scala.inline
      def setListHeaderComponentUndefined: Self = StObject.set(x, "ListHeaderComponent", js.undefined)
      
      @scala.inline
      def setListKey(value: String): Self = StObject.set(x, "listKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListKeyUndefined: Self = StObject.set(x, "listKey", js.undefined)
      
      @scala.inline
      def setMaintainVisibleContentPosition(value: AutoscrollToTopThreshold): Self = StObject.set(x, "maintainVisibleContentPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintainVisibleContentPositionNull: Self = StObject.set(x, "maintainVisibleContentPosition", null)
      
      @scala.inline
      def setMaintainVisibleContentPositionUndefined: Self = StObject.set(x, "maintainVisibleContentPosition", js.undefined)
      
      @scala.inline
      def setMaxToRenderPerBatch(value: Double): Self = StObject.set(x, "maxToRenderPerBatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxToRenderPerBatchUndefined: Self = StObject.set(x, "maxToRenderPerBatch", js.undefined)
      
      @scala.inline
      def setMaximumZoomScale(value: Double): Self = StObject.set(x, "maximumZoomScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumZoomScaleUndefined: Self = StObject.set(x, "maximumZoomScale", js.undefined)
      
      @scala.inline
      def setMinimumZoomScale(value: Double): Self = StObject.set(x, "minimumZoomScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumZoomScaleUndefined: Self = StObject.set(x, "minimumZoomScale", js.undefined)
      
      @scala.inline
      def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
      
      @scala.inline
      def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
      
      @scala.inline
      def setNestedScrollEnabled(value: Boolean): Self = StObject.set(x, "nestedScrollEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestedScrollEnabledUndefined: Self = StObject.set(x, "nestedScrollEnabled", js.undefined)
      
      @scala.inline
      def setNumColumns(value: Double): Self = StObject.set(x, "numColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumColumnsUndefined: Self = StObject.set(x, "numColumns", js.undefined)
      
      @scala.inline
      def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
      
      @scala.inline
      def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
      
      @scala.inline
      def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
      
      @scala.inline
      def setOnContentSizeChange(value: (/* w */ Double, /* h */ Double) => Unit): Self = StObject.set(x, "onContentSizeChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnContentSizeChangeUndefined: Self = StObject.set(x, "onContentSizeChange", js.undefined)
      
      @scala.inline
      def setOnEndReached(value: /* info */ DistanceFromEnd => Unit): Self = StObject.set(x, "onEndReached", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndReachedNull: Self = StObject.set(x, "onEndReached", null)
      
      @scala.inline
      def setOnEndReachedThreshold(value: Double): Self = StObject.set(x, "onEndReachedThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEndReachedThresholdNull: Self = StObject.set(x, "onEndReachedThreshold", null)
      
      @scala.inline
      def setOnEndReachedThresholdUndefined: Self = StObject.set(x, "onEndReachedThreshold", js.undefined)
      
      @scala.inline
      def setOnEndReachedUndefined: Self = StObject.set(x, "onEndReached", js.undefined)
      
      @scala.inline
      def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      @scala.inline
      def setOnMomentumScrollBegin(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onMomentumScrollBegin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMomentumScrollBeginUndefined: Self = StObject.set(x, "onMomentumScrollBegin", js.undefined)
      
      @scala.inline
      def setOnMomentumScrollEnd(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onMomentumScrollEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMomentumScrollEndUndefined: Self = StObject.set(x, "onMomentumScrollEnd", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
      
      @scala.inline
      def setOnRefresh(value: () => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRefreshNull: Self = StObject.set(x, "onRefresh", null)
      
      @scala.inline
      def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
      
      @scala.inline
      def setOnResponderEnd(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
      
      @scala.inline
      def setOnResponderGrant(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
      
      @scala.inline
      def setOnResponderMove(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
      
      @scala.inline
      def setOnResponderReject(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
      
      @scala.inline
      def setOnResponderRelease(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
      
      @scala.inline
      def setOnResponderStart(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
      
      @scala.inline
      def setOnResponderTerminate(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
      
      @scala.inline
      def setOnResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
      
      @scala.inline
      def setOnScroll(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollAnimationEnd(value: () => Unit): Self = StObject.set(x, "onScrollAnimationEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnScrollAnimationEndUndefined: Self = StObject.set(x, "onScrollAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnScrollBeginDrag(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollBeginDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollBeginDragUndefined: Self = StObject.set(x, "onScrollBeginDrag", js.undefined)
      
      @scala.inline
      def setOnScrollEndDrag(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollEndDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollEndDragUndefined: Self = StObject.set(x, "onScrollEndDrag", js.undefined)
      
      @scala.inline
      def setOnScrollToIndexFailed(value: /* info */ AverageItemLength => Unit): Self = StObject.set(x, "onScrollToIndexFailed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollToIndexFailedUndefined: Self = StObject.set(x, "onScrollToIndexFailed", js.undefined)
      
      @scala.inline
      def setOnScrollToTop(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollToTop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollToTopUndefined: Self = StObject.set(x, "onScrollToTop", js.undefined)
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndCapture(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnViewableItemsChanged(value: /* info */ Changed => Unit): Self = StObject.set(x, "onViewableItemsChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnViewableItemsChangedNull: Self = StObject.set(x, "onViewableItemsChanged", null)
      
      @scala.inline
      def setOnViewableItemsChangedUndefined: Self = StObject.set(x, "onViewableItemsChanged", js.undefined)
      
      @scala.inline
      def setOverScrollMode(value: auto | always | never): Self = StObject.set(x, "overScrollMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverScrollModeUndefined: Self = StObject.set(x, "overScrollMode", js.undefined)
      
      @scala.inline
      def setPagingEnabled(value: Boolean): Self = StObject.set(x, "pagingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagingEnabledUndefined: Self = StObject.set(x, "pagingEnabled", js.undefined)
      
      @scala.inline
      def setPersistentScrollbar(value: Boolean): Self = StObject.set(x, "persistentScrollbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentScrollbarUndefined: Self = StObject.set(x, "persistentScrollbar", js.undefined)
      
      @scala.inline
      def setPinchGestureEnabled(value: Boolean): Self = StObject.set(x, "pinchGestureEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinchGestureEnabledUndefined: Self = StObject.set(x, "pinchGestureEnabled", js.undefined)
      
      @scala.inline
      def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      @scala.inline
      def setProgressViewOffset(value: Double): Self = StObject.set(x, "progressViewOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressViewOffsetUndefined: Self = StObject.set(x, "progressViewOffset", js.undefined)
      
      @scala.inline
      def setRefreshControl(value: ReactElement): Self = StObject.set(x, "refreshControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshControlUndefined: Self = StObject.set(x, "refreshControl", js.undefined)
      
      @scala.inline
      def setRefreshing(value: Boolean): Self = StObject.set(x, "refreshing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshingNull: Self = StObject.set(x, "refreshing", null)
      
      @scala.inline
      def setRefreshingUndefined: Self = StObject.set(x, "refreshing", js.undefined)
      
      @scala.inline
      def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
      
      @scala.inline
      def setRenderScrollComponent(value: /* props */ ScrollViewProps => ReactElement): Self = StObject.set(x, "renderScrollComponent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderScrollComponentUndefined: Self = StObject.set(x, "renderScrollComponent", js.undefined)
      
      @scala.inline
      def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
      
      @scala.inline
      def setScrollEventThrottle(value: Double): Self = StObject.set(x, "scrollEventThrottle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollEventThrottleUndefined: Self = StObject.set(x, "scrollEventThrottle", js.undefined)
      
      @scala.inline
      def setScrollIndicatorInsets(value: Insets): Self = StObject.set(x, "scrollIndicatorInsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollIndicatorInsetsUndefined: Self = StObject.set(x, "scrollIndicatorInsets", js.undefined)
      
      @scala.inline
      def setScrollPerfTag(value: String): Self = StObject.set(x, "scrollPerfTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPerfTagUndefined: Self = StObject.set(x, "scrollPerfTag", js.undefined)
      
      @scala.inline
      def setScrollToOverflowEnabled(value: Boolean): Self = StObject.set(x, "scrollToOverflowEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToOverflowEnabledUndefined: Self = StObject.set(x, "scrollToOverflowEnabled", js.undefined)
      
      @scala.inline
      def setScrollsToTop(value: Boolean): Self = StObject.set(x, "scrollsToTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollsToTopUndefined: Self = StObject.set(x, "scrollsToTop", js.undefined)
      
      @scala.inline
      def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
      
      @scala.inline
      def setShowsHorizontalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowsHorizontalScrollIndicatorUndefined: Self = StObject.set(x, "showsHorizontalScrollIndicator", js.undefined)
      
      @scala.inline
      def setShowsVerticalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowsVerticalScrollIndicatorUndefined: Self = StObject.set(x, "showsVerticalScrollIndicator", js.undefined)
      
      @scala.inline
      def setSnapToAlignment(value: start | center | end): Self = StObject.set(x, "snapToAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapToAlignmentUndefined: Self = StObject.set(x, "snapToAlignment", js.undefined)
      
      @scala.inline
      def setSnapToEnd(value: Boolean): Self = StObject.set(x, "snapToEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapToEndUndefined: Self = StObject.set(x, "snapToEnd", js.undefined)
      
      @scala.inline
      def setSnapToInterval(value: Double): Self = StObject.set(x, "snapToInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapToIntervalUndefined: Self = StObject.set(x, "snapToInterval", js.undefined)
      
      @scala.inline
      def setSnapToOffsets(value: js.Array[Double]): Self = StObject.set(x, "snapToOffsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapToOffsetsUndefined: Self = StObject.set(x, "snapToOffsets", js.undefined)
      
      @scala.inline
      def setSnapToOffsetsVarargs(value: Double*): Self = StObject.set(x, "snapToOffsets", js.Array(value :_*))
      
      @scala.inline
      def setSnapToStart(value: Boolean): Self = StObject.set(x, "snapToStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapToStartUndefined: Self = StObject.set(x, "snapToStart", js.undefined)
      
      @scala.inline
      def setStickyHeaderIndices(value: js.Array[Double]): Self = StObject.set(x, "stickyHeaderIndices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyHeaderIndicesUndefined: Self = StObject.set(x, "stickyHeaderIndices", js.undefined)
      
      @scala.inline
      def setStickyHeaderIndicesVarargs(value: Double*): Self = StObject.set(x, "stickyHeaderIndices", js.Array(value :_*))
      
      @scala.inline
      def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      @scala.inline
      def setTvParallaxMagnification(value: Double): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
      
      @scala.inline
      def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
      
      @scala.inline
      def setTvParallaxShiftDistanceX(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
      
      @scala.inline
      def setTvParallaxShiftDistanceY(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
      
      @scala.inline
      def setTvParallaxTiltAngle(value: Double): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
      
      @scala.inline
      def setUpdateCellsBatchingPeriod(value: Double): Self = StObject.set(x, "updateCellsBatchingPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateCellsBatchingPeriodUndefined: Self = StObject.set(x, "updateCellsBatchingPeriod", js.undefined)
      
      @scala.inline
      def setViewabilityConfig(value: js.Any): Self = StObject.set(x, "viewabilityConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewabilityConfigCallbackPairs(value: ViewabilityConfigCallbackPairs): Self = StObject.set(x, "viewabilityConfigCallbackPairs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewabilityConfigCallbackPairsUndefined: Self = StObject.set(x, "viewabilityConfigCallbackPairs", js.undefined)
      
      @scala.inline
      def setViewabilityConfigCallbackPairsVarargs(value: ViewabilityConfigCallbackPair*): Self = StObject.set(x, "viewabilityConfigCallbackPairs", js.Array(value :_*))
      
      @scala.inline
      def setViewabilityConfigUndefined: Self = StObject.set(x, "viewabilityConfig", js.undefined)
      
      @scala.inline
      def setWindowSize(value: Double): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowSizeUndefined: Self = StObject.set(x, "windowSize", js.undefined)
      
      @scala.inline
      def setZoomScale(value: Double): Self = StObject.set(x, "zoomScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomScaleUndefined: Self = StObject.set(x, "zoomScale", js.undefined)
    }
  }
  
  type Gallery = PureComponent[Props, js.Object, js.Any]
  
  @js.native
  trait GestureState extends StObject {
    
    var _accountsForMovesUpTo: Double = js.native
    
    var _singleTabFailed: js.UndefOr[Boolean] = js.native
    
    var doubleTapUp: Boolean = js.native
    
    var dx: Double = js.native
    
    var dy: Double = js.native
    
    var moveX: Double = js.native
    
    var moveY: Double = js.native
    
    var numberActiveTouches: Double = js.native
    
    var pinch: js.UndefOr[Double] = js.native
    
    var previousMoveX: Double = js.native
    
    var previousMoveY: Double = js.native
    
    var previousPinch: js.UndefOr[Double] = js.native
    
    var singleTapUp: Boolean = js.native
    
    var vx: Double = js.native
    
    var vy: Double = js.native
    
    var x0: Double = js.native
    
    var y0: Double = js.native
  }
  object GestureState {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GestureStateMutableBuilder[Self <: GestureState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDoubleTapUp(value: Boolean): Self = StObject.set(x, "doubleTapUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveX(value: Double): Self = StObject.set(x, "moveX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveY(value: Double): Self = StObject.set(x, "moveY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberActiveTouches(value: Double): Self = StObject.set(x, "numberActiveTouches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinch(value: Double): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinchUndefined: Self = StObject.set(x, "pinch", js.undefined)
      
      @scala.inline
      def setPreviousMoveX(value: Double): Self = StObject.set(x, "previousMoveX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousMoveY(value: Double): Self = StObject.set(x, "previousMoveY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousPinch(value: Double): Self = StObject.set(x, "previousPinch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousPinchUndefined: Self = StObject.set(x, "previousPinch", js.undefined)
      
      @scala.inline
      def setSingleTapUp(value: Boolean): Self = StObject.set(x, "singleTapUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVx(value: Double): Self = StObject.set(x, "vx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVy(value: Double): Self = StObject.set(x, "vy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_accountsForMovesUpTo(value: Double): Self = StObject.set(x, "_accountsForMovesUpTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_singleTabFailed(value: Boolean): Self = StObject.set(x, "_singleTabFailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_singleTabFailedUndefined: Self = StObject.set(x, "_singleTabFailed", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeImageGallery.mod.LocalImage
    - typings.reactNativeImageGallery.mod.RemoteImage
  */
  trait Image extends StObject
  object Image {
    
    @scala.inline
    def LocalImage(dimensions: ImageDimensions, source: Double): typings.reactNativeImageGallery.mod.LocalImage = {
      val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNativeImageGallery.mod.LocalImage]
    }
    
    @scala.inline
    def RemoteImage(source: Uri): typings.reactNativeImageGallery.mod.RemoteImage = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNativeImageGallery.mod.RemoteImage]
    }
  }
  
  @js.native
  trait ImageDimensions extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object ImageDimensions {
    
    @scala.inline
    def apply(height: Double, width: Double): ImageDimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageDimensions]
    }
    
    @scala.inline
    implicit class ImageDimensionsMutableBuilder[Self <: ImageDimensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LocalImage extends Image {
    
    var dimensions: ImageDimensions = js.native
    
    var source: Double = js.native
  }
  object LocalImage {
    
    @scala.inline
    def apply(dimensions: ImageDimensions, source: Double): LocalImage = {
      val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalImage]
    }
    
    @scala.inline
    implicit class LocalImageMutableBuilder[Self <: LocalImage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(value: ImageDimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  @js.native
  trait Props extends ViewProps {
    
    /**
      * Custom function to render the page of an image that couldn't be displayed
      */
    var errorComponent: js.UndefOr[js.Function0[ReactNode]] = js.native
    
    /**
      * Props to be passed to the underlying FlatList
      * @default { windowSize: 3 }
      */
    var flatListProps: js.UndefOr[FlatListProps] = js.native
    
    /**
      * Custom function to render your images, 1st param is the image props, 2nd is its dimensions
      */
    var imageComponent: js.UndefOr[
        js.Function2[/* imageProps */ ImageProps, /* imageDimensions */ ImageDimensions, ReactNode]
      ] = js.native
    
    /**
      * Your array of images
      */
    var images: js.Array[Image] = js.native
    
    /**
      * Image displayed first
      * @default 0
      */
    var initialPage: js.UndefOr[Double] = js.native
    
    /**
      * Fired after a long press
      */
    var onLongPress: js.UndefOr[js.Function1[/* state */ GestureState, Unit]] = js.native
    
    /**
      * Scroll event, see scroll state and events
      */
    var onPageScroll: js.UndefOr[js.Function1[/* event */ ScrollEvent, Unit]] = js.native
    
    /**
      * Called when page scrolling state has changed, see scroll state and events
      */
    var onPageScrollStateChanged: js.UndefOr[js.Function1[/* state */ ScrollState, Unit]] = js.native
    
    /**
      * Fired with the index of page that has been selected
      */
    var onPageSelected: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.native
    
    /**
      * Fired after a single tap
      */
    var onSingleTapConfirmed: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.native
    
    /**
      * Blank space to show between images
      */
    var pageMargin: js.UndefOr[Double] = js.native
    
    /**
      * Custom style for the FlatList component
      */
    var scrollViewStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(images: js.Array[Image]): Props = {
      val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorComponent(value: () => ReactNode): Self = StObject.set(x, "errorComponent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setErrorComponentUndefined: Self = StObject.set(x, "errorComponent", js.undefined)
      
      @scala.inline
      def setFlatListProps(value: FlatListProps): Self = StObject.set(x, "flatListProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlatListPropsUndefined: Self = StObject.set(x, "flatListProps", js.undefined)
      
      @scala.inline
      def setImageComponent(value: (/* imageProps */ ImageProps, /* imageDimensions */ ImageDimensions) => ReactNode): Self = StObject.set(x, "imageComponent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setImageComponentUndefined: Self = StObject.set(x, "imageComponent", js.undefined)
      
      @scala.inline
      def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value :_*))
      
      @scala.inline
      def setInitialPage(value: Double): Self = StObject.set(x, "initialPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPageUndefined: Self = StObject.set(x, "initialPage", js.undefined)
      
      @scala.inline
      def setOnLongPress(value: /* state */ GestureState => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      @scala.inline
      def setOnPageScroll(value: /* event */ ScrollEvent => Unit): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageScrollStateChanged(value: /* state */ ScrollState => Unit): Self = StObject.set(x, "onPageScrollStateChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageScrollStateChangedUndefined: Self = StObject.set(x, "onPageScrollStateChanged", js.undefined)
      
      @scala.inline
      def setOnPageScrollUndefined: Self = StObject.set(x, "onPageScroll", js.undefined)
      
      @scala.inline
      def setOnPageSelected(value: /* page */ Double => Unit): Self = StObject.set(x, "onPageSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageSelectedUndefined: Self = StObject.set(x, "onPageSelected", js.undefined)
      
      @scala.inline
      def setOnSingleTapConfirmed(value: /* page */ Double => Unit): Self = StObject.set(x, "onSingleTapConfirmed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSingleTapConfirmedUndefined: Self = StObject.set(x, "onSingleTapConfirmed", js.undefined)
      
      @scala.inline
      def setPageMargin(value: Double): Self = StObject.set(x, "pageMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageMarginUndefined: Self = StObject.set(x, "pageMargin", js.undefined)
      
      @scala.inline
      def setScrollViewStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "scrollViewStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollViewStyleNull: Self = StObject.set(x, "scrollViewStyle", null)
      
      @scala.inline
      def setScrollViewStyleUndefined: Self = StObject.set(x, "scrollViewStyle", js.undefined)
    }
  }
  
  @js.native
  trait RemoteImage extends Image {
    
    var dimensions: js.UndefOr[ImageDimensions] = js.native
    
    var source: Uri = js.native
  }
  object RemoteImage {
    
    @scala.inline
    def apply(source: Uri): RemoteImage = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteImage]
    }
    
    @scala.inline
    implicit class RemoteImageMutableBuilder[Self <: RemoteImage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(value: ImageDimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      @scala.inline
      def setSource(value: Uri): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScrollEvent extends StObject {
    
    var fraction: Double = js.native
    
    var offset: Double = js.native
    
    var position: Double = js.native
  }
  object ScrollEvent {
    
    @scala.inline
    def apply(fraction: Double, offset: Double, position: Double): ScrollEvent = {
      val __obj = js.Dynamic.literal(fraction = fraction.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollEvent]
    }
    
    @scala.inline
    implicit class ScrollEventMutableBuilder[Self <: ScrollEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFraction(value: Double): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
