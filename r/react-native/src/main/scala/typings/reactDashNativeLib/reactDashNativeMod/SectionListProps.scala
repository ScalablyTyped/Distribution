package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionListProps[ItemT] extends VirtualizedListWithoutRenderItemProps[ItemT] {
  /**
    * Rendered in between adjacent Items within each section.
    */
  var ItemSeparatorComponent: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[_] | scala.Null] = js.undefined
  /**
    * Rendered in between each section.
    */
  var SectionSeparatorComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[_] | reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null
  ] = js.undefined
  /**
    * `getItemLayout` is an optional optimization that lets us skip measurement of dynamic
    * content if you know the height of items a priori. getItemLayout is the most efficient,
    * and is easy to use if you have fixed height items, for example:
    * ```
    * getItemLayout={(data, index) => (
    *   {length: ITEM_HEIGHT, offset: ITEM_HEIGHT * index, index}
    * )}
    * ```
    */
  @JSName("getItemLayout")
  var getItemLayout_SectionListProps: js.UndefOr[
    js.Function2[
      /* data */ js.Array[SectionListData[ItemT]] | scala.Null, 
      /* index */ scala.Double, 
      reactDashNativeLib.Anon_Index
    ]
  ] = js.undefined
  /**
    * Uses legacy MetroListView instead of default VirtualizedSectionList
    */
  var legacyImplementation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default renderer for every item in every section. Can be over-ridden on a per-section basis.
    */
  var renderItem: js.UndefOr[SectionListRenderItem[ItemT]] = js.undefined
  /**
    * Rendered at the bottom of each section.
    */
  var renderSectionFooter: js.UndefOr[
    js.Function1[
      /* info */ reactDashNativeLib.Anon_Section[ItemT], 
      reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null
    ]
  ] = js.undefined
  /**
    * Rendered at the top of each section. Sticky headers are not yet supported.
    */
  var renderSectionHeader: js.UndefOr[
    js.Function1[
      /* info */ reactDashNativeLib.Anon_Section[ItemT], 
      reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null
    ]
  ] = js.undefined
  /**
    * An array of objects with data for each section.
    */
  var sections: js.Array[SectionListData[ItemT]]
  /**
    * Makes section headers stick to the top of the screen until the next one pushes it off.
    * Only enabled by default on iOS because that is the platform standard there.
    */
  var stickySectionHeadersEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object SectionListProps {
  @scala.inline
  def apply[ItemT](
    sections: js.Array[SectionListData[ItemT]],
    ItemSeparatorComponent: reactLib.reactMod.ReactNs.ComponentType[_] = null,
    ListEmptyComponent: reactLib.reactMod.ReactNs.ComponentType[_] | reactLib.reactMod.ReactNs.ReactElement[_] = null,
    ListFooterComponent: reactLib.reactMod.ReactNs.ComponentType[_] | reactLib.reactMod.ReactNs.ReactElement[_] = null,
    ListHeaderComponent: reactLib.reactMod.ReactNs.ComponentType[_] | reactLib.reactMod.ReactNs.ReactElement[_] = null,
    SectionSeparatorComponent: reactLib.reactMod.ReactNs.ComponentType[_] | reactLib.reactMod.ReactNs.ReactElement[_] = null,
    accessibilityActions: js.Array[java.lang.String] = null,
    accessibilityComponentType: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.button | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_checked | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityHint: java.lang.String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityLabel: java.lang.String = null,
    accessibilityLiveRegion: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.polite | reactDashNativeLib.reactDashNativeLibStrings.assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityStates: js.Array[AccessibilityState] = null,
    accessibilityTraits: reactDashNativeLib.AccessibilityTrait | js.Array[reactDashNativeLib.AccessibilityTrait] = null,
    accessibilityViewIsModal: js.UndefOr[scala.Boolean] = js.undefined,
    accessible: js.UndefOr[scala.Boolean] = js.undefined,
    alwaysBounceHorizontal: js.UndefOr[scala.Boolean] = js.undefined,
    alwaysBounceVertical: js.UndefOr[scala.Boolean] = js.undefined,
    automaticallyAdjustContentInsets: js.UndefOr[scala.Boolean] = js.undefined,
    bounces: js.UndefOr[scala.Boolean] = js.undefined,
    bouncesZoom: js.UndefOr[scala.Boolean] = js.undefined,
    canCancelContentTouches: js.UndefOr[scala.Boolean] = js.undefined,
    centerContent: js.UndefOr[scala.Boolean] = js.undefined,
    collapsable: js.UndefOr[scala.Boolean] = js.undefined,
    contentContainerStyle: StyleProp[ViewStyle] = null,
    contentInset: Insets = null,
    contentInsetAdjustmentBehavior: reactDashNativeLib.reactDashNativeLibStrings.automatic | reactDashNativeLib.reactDashNativeLibStrings.scrollableAxes | reactDashNativeLib.reactDashNativeLibStrings.never | reactDashNativeLib.reactDashNativeLibStrings.always = null,
    contentOffset: PointPropType = null,
    data: js.Any = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    decelerationRate: reactDashNativeLib.reactDashNativeLibStrings.fast | reactDashNativeLib.reactDashNativeLibStrings.normal | scala.Double = null,
    directionalLockEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    disableVirtualization: js.UndefOr[scala.Boolean] = js.undefined,
    endFillColor: java.lang.String = null,
    extraData: js.Any = null,
    getItem: js.Function2[/* data */ js.Any, /* index */ scala.Double, ItemT] = null,
    getItemCount: js.Function1[/* data */ js.Any, scala.Double] = null,
    getItemLayout: js.Function2[
      /* data */ js.Array[SectionListData[ItemT]] | scala.Null, 
      /* index */ scala.Double, 
      reactDashNativeLib.Anon_Index
    ] = null,
    hitSlop: Insets = null,
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    importantForAccessibility: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.yes | reactDashNativeLib.reactDashNativeLibStrings.no | reactDashNativeLib.reactDashNativeLibStrings.`no-hide-descendants` = null,
    indicatorStyle: reactDashNativeLib.reactDashNativeLibStrings.default | reactDashNativeLib.reactDashNativeLibStrings.black | reactDashNativeLib.reactDashNativeLibStrings.white = null,
    initialNumToRender: scala.Int | scala.Double = null,
    initialScrollIndex: scala.Int | scala.Double = null,
    invertStickyHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    keyExtractor: js.Function2[/* item */ ItemT, /* index */ scala.Double, java.lang.String] = null,
    keyboardDismissMode: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.interactive | reactDashNativeLib.reactDashNativeLibStrings.`on-drag` = null,
    keyboardShouldPersistTaps: scala.Boolean | reactDashNativeLib.reactDashNativeLibStrings.always | reactDashNativeLib.reactDashNativeLibStrings.never | reactDashNativeLib.reactDashNativeLibStrings.handled = null,
    legacyImplementation: js.UndefOr[scala.Boolean] = js.undefined,
    listKey: java.lang.String = null,
    maxToRenderPerBatch: scala.Int | scala.Double = null,
    maximumZoomScale: scala.Int | scala.Double = null,
    minimumZoomScale: scala.Int | scala.Double = null,
    nativeID: java.lang.String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[scala.Boolean] = js.undefined,
    nestedScrollEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    onAccessibilityAction: js.Function0[scala.Unit] = null,
    onAccessibilityTap: js.Function0[scala.Unit] = null,
    onContentSizeChange: js.Function2[/* w */ scala.Double, /* h */ scala.Double, scala.Unit] = null,
    onEndReached: js.Function1[/* info */ reactDashNativeLib.Anon_DistanceFromEnd, scala.Unit] = null,
    onEndReachedThreshold: scala.Int | scala.Double = null,
    onLayout: js.Function1[/* event */ LayoutChangeEvent, scala.Unit] = null,
    onMagicTap: js.Function0[scala.Unit] = null,
    onMomentumScrollBegin: js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], scala.Unit] = null,
    onMomentumScrollEnd: js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], scala.Unit] = null,
    onMoveShouldSetResponder: js.Function1[/* event */ GestureResponderEvent, scala.Boolean] = null,
    onMoveShouldSetResponderCapture: js.Function1[/* event */ GestureResponderEvent, scala.Boolean] = null,
    onRefresh: js.Function0[scala.Unit] = null,
    onResponderEnd: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderGrant: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderMove: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderReject: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderRelease: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderStart: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderTerminate: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderTerminationRequest: js.Function1[/* event */ GestureResponderEvent, scala.Boolean] = null,
    onScroll: js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], scala.Unit] = null,
    onScrollAnimationEnd: js.Function0[scala.Unit] = null,
    onScrollBeginDrag: js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], scala.Unit] = null,
    onScrollEndDrag: js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], scala.Unit] = null,
    onScrollToIndexFailed: js.Function1[/* info */ reactDashNativeLib.Anon_AverageItemLength, scala.Unit] = null,
    onStartShouldSetResponder: js.Function1[/* event */ GestureResponderEvent, scala.Boolean] = null,
    onStartShouldSetResponderCapture: js.Function1[/* event */ GestureResponderEvent, scala.Boolean] = null,
    onTouchCancel: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onTouchEnd: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onTouchEndCapture: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onTouchMove: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onTouchStart: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onViewableItemsChanged: js.Function1[/* info */ reactDashNativeLib.Anon_Changed, scala.Unit] = null,
    overScrollMode: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.always | reactDashNativeLib.reactDashNativeLibStrings.never = null,
    pagingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    pinchGestureEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    pointerEvents: reactDashNativeLib.reactDashNativeLibStrings.`box-none` | reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.`box-only` | reactDashNativeLib.reactDashNativeLibStrings.auto = null,
    progressViewOffset: scala.Int | scala.Double = null,
    refreshControl: reactLib.reactMod.ReactNs.ReactElement[RefreshControlProps] = null,
    refreshing: js.UndefOr[scala.Boolean] = js.undefined,
    removeClippedSubviews: js.UndefOr[scala.Boolean] = js.undefined,
    renderItem: SectionListRenderItem[ItemT] = null,
    renderScrollComponent: js.Function1[
      /* props */ ScrollViewProps, 
      reactLib.reactMod.ReactNs.ReactElement[ScrollViewProps]
    ] = null,
    renderSectionFooter: js.Function1[
      /* info */ reactDashNativeLib.Anon_Section[ItemT], 
      reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null
    ] = null,
    renderSectionHeader: js.Function1[
      /* info */ reactDashNativeLib.Anon_Section[ItemT], 
      reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null
    ] = null,
    renderToHardwareTextureAndroid: js.UndefOr[scala.Boolean] = js.undefined,
    scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    scrollEventThrottle: scala.Int | scala.Double = null,
    scrollIndicatorInsets: Insets = null,
    scrollPerfTag: java.lang.String = null,
    scrollsToTop: js.UndefOr[scala.Boolean] = js.undefined,
    shouldRasterizeIOS: js.UndefOr[scala.Boolean] = js.undefined,
    showsHorizontalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    showsVerticalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    snapToAlignment: reactDashNativeLib.reactDashNativeLibStrings.start | reactDashNativeLib.reactDashNativeLibStrings.center | reactDashNativeLib.reactDashNativeLibStrings.end = null,
    snapToEnd: js.UndefOr[scala.Boolean] = js.undefined,
    snapToInterval: scala.Int | scala.Double = null,
    snapToOffsets: js.Array[scala.Double] = null,
    snapToStart: js.UndefOr[scala.Boolean] = js.undefined,
    stickyHeaderIndices: js.Array[scala.Double] = null,
    stickySectionHeadersEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    testID: java.lang.String = null,
    updateCellsBatchingPeriod: scala.Int | scala.Double = null,
    viewabilityConfig: ViewabilityConfig = null,
    viewabilityConfigCallbackPairs: ViewabilityConfigCallbackPairs = null,
    windowSize: scala.Int | scala.Double = null,
    zoomScale: scala.Int | scala.Double = null
  ): SectionListProps[ItemT] = {
    val __obj = js.Dynamic.literal(sections = sections)
    if (ItemSeparatorComponent != null) __obj.updateDynamic("ItemSeparatorComponent")(ItemSeparatorComponent.asInstanceOf[js.Any])
    if (ListEmptyComponent != null) __obj.updateDynamic("ListEmptyComponent")(ListEmptyComponent.asInstanceOf[js.Any])
    if (ListFooterComponent != null) __obj.updateDynamic("ListFooterComponent")(ListFooterComponent.asInstanceOf[js.Any])
    if (ListHeaderComponent != null) __obj.updateDynamic("ListHeaderComponent")(ListHeaderComponent.asInstanceOf[js.Any])
    if (SectionSeparatorComponent != null) __obj.updateDynamic("SectionSeparatorComponent")(SectionSeparatorComponent.asInstanceOf[js.Any])
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions)
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden)
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint)
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole)
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates)
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal)
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible)
    if (!js.isUndefined(alwaysBounceHorizontal)) __obj.updateDynamic("alwaysBounceHorizontal")(alwaysBounceHorizontal)
    if (!js.isUndefined(alwaysBounceVertical)) __obj.updateDynamic("alwaysBounceVertical")(alwaysBounceVertical)
    if (!js.isUndefined(automaticallyAdjustContentInsets)) __obj.updateDynamic("automaticallyAdjustContentInsets")(automaticallyAdjustContentInsets)
    if (!js.isUndefined(bounces)) __obj.updateDynamic("bounces")(bounces)
    if (!js.isUndefined(bouncesZoom)) __obj.updateDynamic("bouncesZoom")(bouncesZoom)
    if (!js.isUndefined(canCancelContentTouches)) __obj.updateDynamic("canCancelContentTouches")(canCancelContentTouches)
    if (!js.isUndefined(centerContent)) __obj.updateDynamic("centerContent")(centerContent)
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable)
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset)
    if (contentInsetAdjustmentBehavior != null) __obj.updateDynamic("contentInsetAdjustmentBehavior")(contentInsetAdjustmentBehavior.asInstanceOf[js.Any])
    if (contentOffset != null) __obj.updateDynamic("contentOffset")(contentOffset)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (decelerationRate != null) __obj.updateDynamic("decelerationRate")(decelerationRate.asInstanceOf[js.Any])
    if (!js.isUndefined(directionalLockEnabled)) __obj.updateDynamic("directionalLockEnabled")(directionalLockEnabled)
    if (!js.isUndefined(disableVirtualization)) __obj.updateDynamic("disableVirtualization")(disableVirtualization)
    if (endFillColor != null) __obj.updateDynamic("endFillColor")(endFillColor)
    if (extraData != null) __obj.updateDynamic("extraData")(extraData)
    if (getItem != null) __obj.updateDynamic("getItem")(getItem)
    if (getItemCount != null) __obj.updateDynamic("getItemCount")(getItemCount)
    if (getItemLayout != null) __obj.updateDynamic("getItemLayout")(getItemLayout)
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop)
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (initialNumToRender != null) __obj.updateDynamic("initialNumToRender")(initialNumToRender.asInstanceOf[js.Any])
    if (initialScrollIndex != null) __obj.updateDynamic("initialScrollIndex")(initialScrollIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(invertStickyHeaders)) __obj.updateDynamic("invertStickyHeaders")(invertStickyHeaders)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (keyExtractor != null) __obj.updateDynamic("keyExtractor")(keyExtractor)
    if (keyboardDismissMode != null) __obj.updateDynamic("keyboardDismissMode")(keyboardDismissMode.asInstanceOf[js.Any])
    if (keyboardShouldPersistTaps != null) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps.asInstanceOf[js.Any])
    if (!js.isUndefined(legacyImplementation)) __obj.updateDynamic("legacyImplementation")(legacyImplementation)
    if (listKey != null) __obj.updateDynamic("listKey")(listKey)
    if (maxToRenderPerBatch != null) __obj.updateDynamic("maxToRenderPerBatch")(maxToRenderPerBatch.asInstanceOf[js.Any])
    if (maximumZoomScale != null) __obj.updateDynamic("maximumZoomScale")(maximumZoomScale.asInstanceOf[js.Any])
    if (minimumZoomScale != null) __obj.updateDynamic("minimumZoomScale")(minimumZoomScale.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID)
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing)
    if (!js.isUndefined(nestedScrollEnabled)) __obj.updateDynamic("nestedScrollEnabled")(nestedScrollEnabled)
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(onAccessibilityAction)
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(onAccessibilityTap)
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(onContentSizeChange)
    if (onEndReached != null) __obj.updateDynamic("onEndReached")(onEndReached)
    if (onEndReachedThreshold != null) __obj.updateDynamic("onEndReachedThreshold")(onEndReachedThreshold.asInstanceOf[js.Any])
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout)
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(onMagicTap)
    if (onMomentumScrollBegin != null) __obj.updateDynamic("onMomentumScrollBegin")(onMomentumScrollBegin)
    if (onMomentumScrollEnd != null) __obj.updateDynamic("onMomentumScrollEnd")(onMomentumScrollEnd)
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(onMoveShouldSetResponder)
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(onMoveShouldSetResponderCapture)
    if (onRefresh != null) __obj.updateDynamic("onRefresh")(onRefresh)
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(onResponderEnd)
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(onResponderGrant)
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(onResponderMove)
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(onResponderReject)
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(onResponderRelease)
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(onResponderStart)
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(onResponderTerminate)
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(onResponderTerminationRequest)
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll)
    if (onScrollAnimationEnd != null) __obj.updateDynamic("onScrollAnimationEnd")(onScrollAnimationEnd)
    if (onScrollBeginDrag != null) __obj.updateDynamic("onScrollBeginDrag")(onScrollBeginDrag)
    if (onScrollEndDrag != null) __obj.updateDynamic("onScrollEndDrag")(onScrollEndDrag)
    if (onScrollToIndexFailed != null) __obj.updateDynamic("onScrollToIndexFailed")(onScrollToIndexFailed)
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(onStartShouldSetResponder)
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(onStartShouldSetResponderCapture)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(onTouchEndCapture)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (onViewableItemsChanged != null) __obj.updateDynamic("onViewableItemsChanged")(onViewableItemsChanged)
    if (overScrollMode != null) __obj.updateDynamic("overScrollMode")(overScrollMode.asInstanceOf[js.Any])
    if (!js.isUndefined(pagingEnabled)) __obj.updateDynamic("pagingEnabled")(pagingEnabled)
    if (!js.isUndefined(pinchGestureEnabled)) __obj.updateDynamic("pinchGestureEnabled")(pinchGestureEnabled)
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (progressViewOffset != null) __obj.updateDynamic("progressViewOffset")(progressViewOffset.asInstanceOf[js.Any])
    if (refreshControl != null) __obj.updateDynamic("refreshControl")(refreshControl)
    if (!js.isUndefined(refreshing)) __obj.updateDynamic("refreshing")(refreshing)
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews)
    if (renderItem != null) __obj.updateDynamic("renderItem")(renderItem)
    if (renderScrollComponent != null) __obj.updateDynamic("renderScrollComponent")(renderScrollComponent)
    if (renderSectionFooter != null) __obj.updateDynamic("renderSectionFooter")(renderSectionFooter)
    if (renderSectionHeader != null) __obj.updateDynamic("renderSectionHeader")(renderSectionHeader)
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid)
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled)
    if (scrollEventThrottle != null) __obj.updateDynamic("scrollEventThrottle")(scrollEventThrottle.asInstanceOf[js.Any])
    if (scrollIndicatorInsets != null) __obj.updateDynamic("scrollIndicatorInsets")(scrollIndicatorInsets)
    if (scrollPerfTag != null) __obj.updateDynamic("scrollPerfTag")(scrollPerfTag)
    if (!js.isUndefined(scrollsToTop)) __obj.updateDynamic("scrollsToTop")(scrollsToTop)
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS)
    if (!js.isUndefined(showsHorizontalScrollIndicator)) __obj.updateDynamic("showsHorizontalScrollIndicator")(showsHorizontalScrollIndicator)
    if (!js.isUndefined(showsVerticalScrollIndicator)) __obj.updateDynamic("showsVerticalScrollIndicator")(showsVerticalScrollIndicator)
    if (snapToAlignment != null) __obj.updateDynamic("snapToAlignment")(snapToAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToEnd)) __obj.updateDynamic("snapToEnd")(snapToEnd)
    if (snapToInterval != null) __obj.updateDynamic("snapToInterval")(snapToInterval.asInstanceOf[js.Any])
    if (snapToOffsets != null) __obj.updateDynamic("snapToOffsets")(snapToOffsets)
    if (!js.isUndefined(snapToStart)) __obj.updateDynamic("snapToStart")(snapToStart)
    if (stickyHeaderIndices != null) __obj.updateDynamic("stickyHeaderIndices")(stickyHeaderIndices)
    if (!js.isUndefined(stickySectionHeadersEnabled)) __obj.updateDynamic("stickySectionHeadersEnabled")(stickySectionHeadersEnabled)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (updateCellsBatchingPeriod != null) __obj.updateDynamic("updateCellsBatchingPeriod")(updateCellsBatchingPeriod.asInstanceOf[js.Any])
    if (viewabilityConfig != null) __obj.updateDynamic("viewabilityConfig")(viewabilityConfig)
    if (viewabilityConfigCallbackPairs != null) __obj.updateDynamic("viewabilityConfigCallbackPairs")(viewabilityConfigCallbackPairs)
    if (windowSize != null) __obj.updateDynamic("windowSize")(windowSize.asInstanceOf[js.Any])
    if (zoomScale != null) __obj.updateDynamic("zoomScale")(zoomScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionListProps[ItemT]]
  }
}

