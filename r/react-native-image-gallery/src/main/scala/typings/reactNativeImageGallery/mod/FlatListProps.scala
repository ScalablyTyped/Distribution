package typings.reactNativeImageGallery.mod

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
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
import typings.reactNative.mod.Insets
import typings.reactNative.mod.NativeScrollEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.ScrollViewProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.ViewStyle
import typings.reactNative.mod.ViewabilityConfigCallbackPair
import typings.reactNative.mod.ViewabilityConfigCallbackPairs
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-image-gallery.react-native-image-gallery.Omit<react-native.react-native.FlatListProps<react-native-image-gallery.react-native-image-gallery.Image>, 'style' | 'ref' | 'keyExtractor' | 'scrollEnabled' | 'horizontal' | 'data' | 'renderItem' | 'onLayout' | 'contentOffset'> */
@js.native
trait FlatListProps extends js.Object {
  
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
  implicit class FlatListPropsOps[Self <: FlatListProps] (val x: Self) extends AnyVal {
    
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
    def setCellRendererComponent(value: ComponentType[_]): Self = this.set("CellRendererComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellRendererComponent: Self = this.set("CellRendererComponent", js.undefined)
    
    @scala.inline
    def setItemSeparatorComponent(value: ComponentType[_]): Self = this.set("ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemSeparatorComponent: Self = this.set("ItemSeparatorComponent", js.undefined)
    
    @scala.inline
    def setItemSeparatorComponentNull: Self = this.set("ItemSeparatorComponent", null)
    
    @scala.inline
    def setListEmptyComponent(value: ComponentType[_] | ReactElement): Self = this.set("ListEmptyComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListEmptyComponent: Self = this.set("ListEmptyComponent", js.undefined)
    
    @scala.inline
    def setListEmptyComponentNull: Self = this.set("ListEmptyComponent", null)
    
    @scala.inline
    def setListFooterComponent(value: ComponentType[_] | ReactElement): Self = this.set("ListFooterComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListFooterComponent: Self = this.set("ListFooterComponent", js.undefined)
    
    @scala.inline
    def setListFooterComponentNull: Self = this.set("ListFooterComponent", null)
    
    @scala.inline
    def setListFooterComponentStyle(value: ViewStyle): Self = this.set("ListFooterComponentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListFooterComponentStyle: Self = this.set("ListFooterComponentStyle", js.undefined)
    
    @scala.inline
    def setListFooterComponentStyleNull: Self = this.set("ListFooterComponentStyle", null)
    
    @scala.inline
    def setListHeaderComponent(value: ComponentType[_] | ReactElement): Self = this.set("ListHeaderComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListHeaderComponent: Self = this.set("ListHeaderComponent", js.undefined)
    
    @scala.inline
    def setListHeaderComponentNull: Self = this.set("ListHeaderComponent", null)
    
    @scala.inline
    def setListHeaderComponentStyle(value: ViewStyle): Self = this.set("ListHeaderComponentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListHeaderComponentStyle: Self = this.set("ListHeaderComponentStyle", js.undefined)
    
    @scala.inline
    def setListHeaderComponentStyleNull: Self = this.set("ListHeaderComponentStyle", null)
    
    @scala.inline
    def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = this.set("accessibilityActions", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = this.set("accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityActions: Self = this.set("accessibilityActions", js.undefined)
    
    @scala.inline
    def setAccessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): Self = this.set("accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityComponentType: Self = this.set("accessibilityComponentType", js.undefined)
    
    @scala.inline
    def setAccessibilityElementsHidden(value: Boolean): Self = this.set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityElementsHidden: Self = this.set("accessibilityElementsHidden", js.undefined)
    
    @scala.inline
    def setAccessibilityHint(value: String): Self = this.set("accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityHint: Self = this.set("accessibilityHint", js.undefined)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: Boolean): Self = this.set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityIgnoresInvertColors: Self = this.set("accessibilityIgnoresInvertColors", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityLiveRegion(value: none | polite | assertive): Self = this.set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLiveRegion: Self = this.set("accessibilityLiveRegion", js.undefined)
    
    @scala.inline
    def setAccessibilityRole(value: AccessibilityRole): Self = this.set("accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityRole: Self = this.set("accessibilityRole", js.undefined)
    
    @scala.inline
    def setAccessibilityState(value: AccessibilityState): Self = this.set("accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityState: Self = this.set("accessibilityState", js.undefined)
    
    @scala.inline
    def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = this.set("accessibilityTraits", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = this.set("accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityTraits: Self = this.set("accessibilityTraits", js.undefined)
    
    @scala.inline
    def setAccessibilityValue(value: AccessibilityValue): Self = this.set("accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityValue: Self = this.set("accessibilityValue", js.undefined)
    
    @scala.inline
    def setAccessibilityViewIsModal(value: Boolean): Self = this.set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityViewIsModal: Self = this.set("accessibilityViewIsModal", js.undefined)
    
    @scala.inline
    def setAccessible(value: Boolean): Self = this.set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessible: Self = this.set("accessible", js.undefined)
    
    @scala.inline
    def setAlwaysBounceHorizontal(value: Boolean): Self = this.set("alwaysBounceHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysBounceHorizontal: Self = this.set("alwaysBounceHorizontal", js.undefined)
    
    @scala.inline
    def setAlwaysBounceVertical(value: Boolean): Self = this.set("alwaysBounceVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysBounceVertical: Self = this.set("alwaysBounceVertical", js.undefined)
    
    @scala.inline
    def setAutomaticallyAdjustContentInsets(value: Boolean): Self = this.set("automaticallyAdjustContentInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticallyAdjustContentInsets: Self = this.set("automaticallyAdjustContentInsets", js.undefined)
    
    @scala.inline
    def setBounces(value: Boolean): Self = this.set("bounces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounces: Self = this.set("bounces", js.undefined)
    
    @scala.inline
    def setBouncesZoom(value: Boolean): Self = this.set("bouncesZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBouncesZoom: Self = this.set("bouncesZoom", js.undefined)
    
    @scala.inline
    def setCanCancelContentTouches(value: Boolean): Self = this.set("canCancelContentTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanCancelContentTouches: Self = this.set("canCancelContentTouches", js.undefined)
    
    @scala.inline
    def setCenterContent(value: Boolean): Self = this.set("centerContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterContent: Self = this.set("centerContent", js.undefined)
    
    @scala.inline
    def setCollapsable(value: Boolean): Self = this.set("collapsable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsable: Self = this.set("collapsable", js.undefined)
    
    @scala.inline
    def setColumnWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("columnWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnWrapperStyle: Self = this.set("columnWrapperStyle", js.undefined)
    
    @scala.inline
    def setColumnWrapperStyleNull: Self = this.set("columnWrapperStyle", null)
    
    @scala.inline
    def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("contentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentContainerStyle: Self = this.set("contentContainerStyle", js.undefined)
    
    @scala.inline
    def setContentContainerStyleNull: Self = this.set("contentContainerStyle", null)
    
    @scala.inline
    def setContentInset(value: Insets): Self = this.set("contentInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentInset: Self = this.set("contentInset", js.undefined)
    
    @scala.inline
    def setContentInsetAdjustmentBehavior(value: automatic | scrollableAxes | never | always): Self = this.set("contentInsetAdjustmentBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentInsetAdjustmentBehavior: Self = this.set("contentInsetAdjustmentBehavior", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDecelerationRate(value: fast | normal | Double): Self = this.set("decelerationRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecelerationRate: Self = this.set("decelerationRate", js.undefined)
    
    @scala.inline
    def setDirectionalLockEnabled(value: Boolean): Self = this.set("directionalLockEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionalLockEnabled: Self = this.set("directionalLockEnabled", js.undefined)
    
    @scala.inline
    def setDisableIntervalMomentum(value: Boolean): Self = this.set("disableIntervalMomentum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableIntervalMomentum: Self = this.set("disableIntervalMomentum", js.undefined)
    
    @scala.inline
    def setDisableScrollViewPanResponder(value: Boolean): Self = this.set("disableScrollViewPanResponder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableScrollViewPanResponder: Self = this.set("disableScrollViewPanResponder", js.undefined)
    
    @scala.inline
    def setDisableVirtualization(value: Boolean): Self = this.set("disableVirtualization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableVirtualization: Self = this.set("disableVirtualization", js.undefined)
    
    @scala.inline
    def setEndFillColor(value: ColorValue): Self = this.set("endFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndFillColor: Self = this.set("endFillColor", js.undefined)
    
    @scala.inline
    def setExtraData(value: js.Any): Self = this.set("extraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraData: Self = this.set("extraData", js.undefined)
    
    @scala.inline
    def setFadingEdgeLength(value: Double): Self = this.set("fadingEdgeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadingEdgeLength: Self = this.set("fadingEdgeLength", js.undefined)
    
    @scala.inline
    def setFocusable(value: Boolean): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    
    @scala.inline
    def setGetItem(value: (/* data */ js.Any, /* index */ Double) => Image): Self = this.set("getItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetItem: Self = this.set("getItem", js.undefined)
    
    @scala.inline
    def setGetItemCount(value: /* data */ js.Any => Double): Self = this.set("getItemCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetItemCount: Self = this.set("getItemCount", js.undefined)
    
    @scala.inline
    def setGetItemLayout(value: (/* data */ js.UndefOr[js.Array[Image] | Null], /* index */ Double) => Index): Self = this.set("getItemLayout", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetItemLayout: Self = this.set("getItemLayout", js.undefined)
    
    @scala.inline
    def setHasTVPreferredFocus(value: Boolean): Self = this.set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasTVPreferredFocus: Self = this.set("hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setHitSlop(value: Insets): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = this.set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportantForAccessibility: Self = this.set("importantForAccessibility", js.undefined)
    
    @scala.inline
    def setIndicatorStyle(value: typings.reactNativeImageGallery.reactNativeImageGalleryStrings.default | black | white): Self = this.set("indicatorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorStyle: Self = this.set("indicatorStyle", js.undefined)
    
    @scala.inline
    def setInitialNumToRender(value: Double): Self = this.set("initialNumToRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialNumToRender: Self = this.set("initialNumToRender", js.undefined)
    
    @scala.inline
    def setInitialScrollIndex(value: Double): Self = this.set("initialScrollIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialScrollIndex: Self = this.set("initialScrollIndex", js.undefined)
    
    @scala.inline
    def setInitialScrollIndexNull: Self = this.set("initialScrollIndex", null)
    
    @scala.inline
    def setInvertStickyHeaders(value: Boolean): Self = this.set("invertStickyHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvertStickyHeaders: Self = this.set("invertStickyHeaders", js.undefined)
    
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    
    @scala.inline
    def setInvertedNull: Self = this.set("inverted", null)
    
    @scala.inline
    def setIsTVSelectable(value: Boolean): Self = this.set("isTVSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTVSelectable: Self = this.set("isTVSelectable", js.undefined)
    
    @scala.inline
    def setKeyboardDismissMode(value: none | interactive | `on-drag`): Self = this.set("keyboardDismissMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardDismissMode: Self = this.set("keyboardDismissMode", js.undefined)
    
    @scala.inline
    def setKeyboardShouldPersistTaps(value: Boolean | always | never | handled): Self = this.set("keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardShouldPersistTaps: Self = this.set("keyboardShouldPersistTaps", js.undefined)
    
    @scala.inline
    def setLegacyImplementation(value: Boolean): Self = this.set("legacyImplementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegacyImplementation: Self = this.set("legacyImplementation", js.undefined)
    
    @scala.inline
    def setListKey(value: String): Self = this.set("listKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListKey: Self = this.set("listKey", js.undefined)
    
    @scala.inline
    def setMaintainVisibleContentPosition(value: AutoscrollToTopThreshold): Self = this.set("maintainVisibleContentPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintainVisibleContentPosition: Self = this.set("maintainVisibleContentPosition", js.undefined)
    
    @scala.inline
    def setMaintainVisibleContentPositionNull: Self = this.set("maintainVisibleContentPosition", null)
    
    @scala.inline
    def setMaxToRenderPerBatch(value: Double): Self = this.set("maxToRenderPerBatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxToRenderPerBatch: Self = this.set("maxToRenderPerBatch", js.undefined)
    
    @scala.inline
    def setMaximumZoomScale(value: Double): Self = this.set("maximumZoomScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumZoomScale: Self = this.set("maximumZoomScale", js.undefined)
    
    @scala.inline
    def setMinimumZoomScale(value: Double): Self = this.set("minimumZoomScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumZoomScale: Self = this.set("minimumZoomScale", js.undefined)
    
    @scala.inline
    def setNativeID(value: String): Self = this.set("nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeID: Self = this.set("nativeID", js.undefined)
    
    @scala.inline
    def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = this.set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedsOffscreenAlphaCompositing: Self = this.set("needsOffscreenAlphaCompositing", js.undefined)
    
    @scala.inline
    def setNestedScrollEnabled(value: Boolean): Self = this.set("nestedScrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestedScrollEnabled: Self = this.set("nestedScrollEnabled", js.undefined)
    
    @scala.inline
    def setNumColumns(value: Double): Self = this.set("numColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumColumns: Self = this.set("numColumns", js.undefined)
    
    @scala.inline
    def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = this.set("onAccessibilityAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAccessibilityAction: Self = this.set("onAccessibilityAction", js.undefined)
    
    @scala.inline
    def setOnAccessibilityEscape(value: () => Unit): Self = this.set("onAccessibilityEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAccessibilityEscape: Self = this.set("onAccessibilityEscape", js.undefined)
    
    @scala.inline
    def setOnAccessibilityTap(value: () => Unit): Self = this.set("onAccessibilityTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAccessibilityTap: Self = this.set("onAccessibilityTap", js.undefined)
    
    @scala.inline
    def setOnContentSizeChange(value: (/* w */ Double, /* h */ Double) => Unit): Self = this.set("onContentSizeChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnContentSizeChange: Self = this.set("onContentSizeChange", js.undefined)
    
    @scala.inline
    def setOnEndReached(value: /* info */ DistanceFromEnd => Unit): Self = this.set("onEndReached", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEndReached: Self = this.set("onEndReached", js.undefined)
    
    @scala.inline
    def setOnEndReachedNull: Self = this.set("onEndReached", null)
    
    @scala.inline
    def setOnEndReachedThreshold(value: Double): Self = this.set("onEndReachedThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEndReachedThreshold: Self = this.set("onEndReachedThreshold", js.undefined)
    
    @scala.inline
    def setOnEndReachedThresholdNull: Self = this.set("onEndReachedThreshold", null)
    
    @scala.inline
    def setOnMagicTap(value: () => Unit): Self = this.set("onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnMagicTap: Self = this.set("onMagicTap", js.undefined)
    
    @scala.inline
    def setOnMomentumScrollBegin(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = this.set("onMomentumScrollBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMomentumScrollBegin: Self = this.set("onMomentumScrollBegin", js.undefined)
    
    @scala.inline
    def setOnMomentumScrollEnd(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = this.set("onMomentumScrollEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMomentumScrollEnd: Self = this.set("onMomentumScrollEnd", js.undefined)
    
    @scala.inline
    def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMoveShouldSetResponder: Self = this.set("onMoveShouldSetResponder", js.undefined)
    
    @scala.inline
    def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMoveShouldSetResponderCapture: Self = this.set("onMoveShouldSetResponderCapture", js.undefined)
    
    @scala.inline
    def setOnRefresh(value: () => Unit): Self = this.set("onRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRefresh: Self = this.set("onRefresh", js.undefined)
    
    @scala.inline
    def setOnRefreshNull: Self = this.set("onRefresh", null)
    
    @scala.inline
    def setOnResponderEnd(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderEnd: Self = this.set("onResponderEnd", js.undefined)
    
    @scala.inline
    def setOnResponderGrant(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderGrant", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderGrant: Self = this.set("onResponderGrant", js.undefined)
    
    @scala.inline
    def setOnResponderMove(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderMove: Self = this.set("onResponderMove", js.undefined)
    
    @scala.inline
    def setOnResponderReject(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderReject", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderReject: Self = this.set("onResponderReject", js.undefined)
    
    @scala.inline
    def setOnResponderRelease(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderRelease: Self = this.set("onResponderRelease", js.undefined)
    
    @scala.inline
    def setOnResponderStart(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderStart: Self = this.set("onResponderStart", js.undefined)
    
    @scala.inline
    def setOnResponderTerminate(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderTerminate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderTerminate: Self = this.set("onResponderTerminate", js.undefined)
    
    @scala.inline
    def setOnResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderTerminationRequest: Self = this.set("onResponderTerminationRequest", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnScrollAnimationEnd(value: () => Unit): Self = this.set("onScrollAnimationEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnScrollAnimationEnd: Self = this.set("onScrollAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnScrollBeginDrag(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = this.set("onScrollBeginDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScrollBeginDrag: Self = this.set("onScrollBeginDrag", js.undefined)
    
    @scala.inline
    def setOnScrollEndDrag(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = this.set("onScrollEndDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScrollEndDrag: Self = this.set("onScrollEndDrag", js.undefined)
    
    @scala.inline
    def setOnScrollToIndexFailed(value: /* info */ AverageItemLength => Unit): Self = this.set("onScrollToIndexFailed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScrollToIndexFailed: Self = this.set("onScrollToIndexFailed", js.undefined)
    
    @scala.inline
    def setOnScrollToTop(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = this.set("onScrollToTop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScrollToTop: Self = this.set("onScrollToTop", js.undefined)
    
    @scala.inline
    def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStartShouldSetResponder: Self = this.set("onStartShouldSetResponder", js.undefined)
    
    @scala.inline
    def setOnStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStartShouldSetResponderCapture: Self = this.set("onStartShouldSetResponderCapture", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchEndCapture(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onTouchEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEndCapture: Self = this.set("onTouchEndCapture", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setOnViewableItemsChanged(value: /* info */ Changed => Unit): Self = this.set("onViewableItemsChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnViewableItemsChanged: Self = this.set("onViewableItemsChanged", js.undefined)
    
    @scala.inline
    def setOnViewableItemsChangedNull: Self = this.set("onViewableItemsChanged", null)
    
    @scala.inline
    def setOverScrollMode(value: auto | always | never): Self = this.set("overScrollMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverScrollMode: Self = this.set("overScrollMode", js.undefined)
    
    @scala.inline
    def setPagingEnabled(value: Boolean): Self = this.set("pagingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagingEnabled: Self = this.set("pagingEnabled", js.undefined)
    
    @scala.inline
    def setPersistentScrollbar(value: Boolean): Self = this.set("persistentScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistentScrollbar: Self = this.set("persistentScrollbar", js.undefined)
    
    @scala.inline
    def setPinchGestureEnabled(value: Boolean): Self = this.set("pinchGestureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinchGestureEnabled: Self = this.set("pinchGestureEnabled", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    
    @scala.inline
    def setProgressViewOffset(value: Double): Self = this.set("progressViewOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressViewOffset: Self = this.set("progressViewOffset", js.undefined)
    
    @scala.inline
    def setRefreshControl(value: ReactElement): Self = this.set("refreshControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshControl: Self = this.set("refreshControl", js.undefined)
    
    @scala.inline
    def setRefreshing(value: Boolean): Self = this.set("refreshing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshing: Self = this.set("refreshing", js.undefined)
    
    @scala.inline
    def setRefreshingNull: Self = this.set("refreshing", null)
    
    @scala.inline
    def setRemoveClippedSubviews(value: Boolean): Self = this.set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveClippedSubviews: Self = this.set("removeClippedSubviews", js.undefined)
    
    @scala.inline
    def setRenderScrollComponent(value: /* props */ ScrollViewProps => ReactElement): Self = this.set("renderScrollComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderScrollComponent: Self = this.set("renderScrollComponent", js.undefined)
    
    @scala.inline
    def setRenderToHardwareTextureAndroid(value: Boolean): Self = this.set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderToHardwareTextureAndroid: Self = this.set("renderToHardwareTextureAndroid", js.undefined)
    
    @scala.inline
    def setScrollEventThrottle(value: Double): Self = this.set("scrollEventThrottle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollEventThrottle: Self = this.set("scrollEventThrottle", js.undefined)
    
    @scala.inline
    def setScrollIndicatorInsets(value: Insets): Self = this.set("scrollIndicatorInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollIndicatorInsets: Self = this.set("scrollIndicatorInsets", js.undefined)
    
    @scala.inline
    def setScrollPerfTag(value: String): Self = this.set("scrollPerfTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPerfTag: Self = this.set("scrollPerfTag", js.undefined)
    
    @scala.inline
    def setScrollToOverflowEnabled(value: Boolean): Self = this.set("scrollToOverflowEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToOverflowEnabled: Self = this.set("scrollToOverflowEnabled", js.undefined)
    
    @scala.inline
    def setScrollsToTop(value: Boolean): Self = this.set("scrollsToTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollsToTop: Self = this.set("scrollsToTop", js.undefined)
    
    @scala.inline
    def setShouldRasterizeIOS(value: Boolean): Self = this.set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldRasterizeIOS: Self = this.set("shouldRasterizeIOS", js.undefined)
    
    @scala.inline
    def setShowsHorizontalScrollIndicator(value: Boolean): Self = this.set("showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsHorizontalScrollIndicator: Self = this.set("showsHorizontalScrollIndicator", js.undefined)
    
    @scala.inline
    def setShowsVerticalScrollIndicator(value: Boolean): Self = this.set("showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsVerticalScrollIndicator: Self = this.set("showsVerticalScrollIndicator", js.undefined)
    
    @scala.inline
    def setSnapToAlignment(value: start | center | end): Self = this.set("snapToAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapToAlignment: Self = this.set("snapToAlignment", js.undefined)
    
    @scala.inline
    def setSnapToEnd(value: Boolean): Self = this.set("snapToEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapToEnd: Self = this.set("snapToEnd", js.undefined)
    
    @scala.inline
    def setSnapToInterval(value: Double): Self = this.set("snapToInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapToInterval: Self = this.set("snapToInterval", js.undefined)
    
    @scala.inline
    def setSnapToOffsetsVarargs(value: Double*): Self = this.set("snapToOffsets", js.Array(value :_*))
    
    @scala.inline
    def setSnapToOffsets(value: js.Array[Double]): Self = this.set("snapToOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapToOffsets: Self = this.set("snapToOffsets", js.undefined)
    
    @scala.inline
    def setSnapToStart(value: Boolean): Self = this.set("snapToStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapToStart: Self = this.set("snapToStart", js.undefined)
    
    @scala.inline
    def setStickyHeaderIndicesVarargs(value: Double*): Self = this.set("stickyHeaderIndices", js.Array(value :_*))
    
    @scala.inline
    def setStickyHeaderIndices(value: js.Array[Double]): Self = this.set("stickyHeaderIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickyHeaderIndices: Self = this.set("stickyHeaderIndices", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    
    @scala.inline
    def setTvParallaxMagnification(value: Double): Self = this.set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxMagnification: Self = this.set("tvParallaxMagnification", js.undefined)
    
    @scala.inline
    def setTvParallaxProperties(value: TVParallaxProperties): Self = this.set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxProperties: Self = this.set("tvParallaxProperties", js.undefined)
    
    @scala.inline
    def setTvParallaxShiftDistanceX(value: Double): Self = this.set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxShiftDistanceX: Self = this.set("tvParallaxShiftDistanceX", js.undefined)
    
    @scala.inline
    def setTvParallaxShiftDistanceY(value: Double): Self = this.set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxShiftDistanceY: Self = this.set("tvParallaxShiftDistanceY", js.undefined)
    
    @scala.inline
    def setTvParallaxTiltAngle(value: Double): Self = this.set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxTiltAngle: Self = this.set("tvParallaxTiltAngle", js.undefined)
    
    @scala.inline
    def setUpdateCellsBatchingPeriod(value: Double): Self = this.set("updateCellsBatchingPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateCellsBatchingPeriod: Self = this.set("updateCellsBatchingPeriod", js.undefined)
    
    @scala.inline
    def setViewabilityConfig(value: js.Any): Self = this.set("viewabilityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewabilityConfig: Self = this.set("viewabilityConfig", js.undefined)
    
    @scala.inline
    def setViewabilityConfigCallbackPairsVarargs(value: ViewabilityConfigCallbackPair*): Self = this.set("viewabilityConfigCallbackPairs", js.Array(value :_*))
    
    @scala.inline
    def setViewabilityConfigCallbackPairs(value: ViewabilityConfigCallbackPairs): Self = this.set("viewabilityConfigCallbackPairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewabilityConfigCallbackPairs: Self = this.set("viewabilityConfigCallbackPairs", js.undefined)
    
    @scala.inline
    def setWindowSize(value: Double): Self = this.set("windowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowSize: Self = this.set("windowSize", js.undefined)
    
    @scala.inline
    def setZoomScale(value: Double): Self = this.set("zoomScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomScale: Self = this.set("zoomScale", js.undefined)
  }
}
