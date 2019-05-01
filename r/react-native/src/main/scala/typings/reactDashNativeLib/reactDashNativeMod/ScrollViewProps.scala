package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollViewProps
  extends ViewProps
     with ScrollViewPropsIOS
     with ScrollViewPropsAndroid {
  /**
    * These styles will be applied to the scroll view content container which
    * wraps all of the child views. Example:
    *
    *   return (
    *     <ScrollView contentContainerStyle={styles.contentContainer}>
    *     </ScrollView>
    *   );
    *   ...
    *   const styles = StyleSheet.create({
    *     contentContainer: {
    *       paddingVertical: 20
    *     }
    *   });
    */
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * When true the scroll view's children are arranged horizontally in a row
    * instead of vertically in a column. The default value is false.
    */
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If sticky headers should stick at the bottom instead of the top of the
    * ScrollView. This is usually used with inverted ScrollViews.
    */
  var invertStickyHeaders: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Determines whether the keyboard gets dismissed in response to a drag.
    *   - 'none' (the default) drags do not dismiss the keyboard.
    *   - 'onDrag' the keyboard is dismissed when a drag begins.
    *   - 'interactive' the keyboard is dismissed interactively with the drag
    *     and moves in synchrony with the touch; dragging upwards cancels the
    *     dismissal.
    */
  var keyboardDismissMode: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.interactive | reactDashNativeLib.reactDashNativeLibStrings.`on-drag`
  ] = js.undefined
  /**
    * Determines when the keyboard should stay visible after a tap.
    * - 'never' (the default), tapping outside of the focused text input when the keyboard is up dismisses the keyboard. When this happens, children won't receive the tap.
    * - 'always', the keyboard will not dismiss automatically, and the scroll view will not catch taps, but children of the scroll view can catch taps.
    * - 'handled', the keyboard will not dismiss automatically when the tap was handled by a children, (or captured by an ancestor).
    * - false, deprecated, use 'never' instead
    * - true, deprecated, use 'always' instead
    */
  var keyboardShouldPersistTaps: js.UndefOr[
    scala.Boolean | reactDashNativeLib.reactDashNativeLibStrings.always | reactDashNativeLib.reactDashNativeLibStrings.never | reactDashNativeLib.reactDashNativeLibStrings.handled
  ] = js.undefined
  /**
    * Called when scrollable content view of the ScrollView changes.
    * Handler function is passed the content width and content height as parameters: (contentWidth, contentHeight)
    * It's implemented using onLayout handler attached to the content container which this ScrollView renders.
    *
    */
  var onContentSizeChange: js.UndefOr[js.Function2[/* w */ scala.Double, /* h */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Fires when scroll view has begun moving
    */
  var onMomentumScrollBegin: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], scala.Unit]] = js.undefined
  /**
    * Fires when scroll view has finished moving
    */
  var onMomentumScrollEnd: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], scala.Unit]] = js.undefined
  /**
    * Fires at most once per frame during scrolling.
    * The frequency of the events can be contolled using the scrollEventThrottle prop.
    */
  var onScroll: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], scala.Unit]] = js.undefined
  /**
    * Fires if a user initiates a scroll gesture.
    */
  var onScrollBeginDrag: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], scala.Unit]] = js.undefined
  /**
    * Fires when a user has finished scrolling.
    */
  var onScrollEndDrag: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], scala.Unit]] = js.undefined
  /**
    * When true the scroll view stops on multiples of the scroll view's size
    * when scrolling. This can be used for horizontal pagination. The default
    * value is false.
    */
  var pagingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A RefreshControl component, used to provide pull-to-refresh
    * functionality for the ScrollView.
    */
  var refreshControl: js.UndefOr[reactLib.reactMod.ReactElement[RefreshControlProps]] = js.undefined
  /**
    * When false, the content does not scroll. The default value is true
    */
  var scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When true, shows a horizontal scroll indicator.
    */
  var showsHorizontalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When true, shows a vertical scroll indicator.
    */
  var showsVerticalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When `snapToInterval` is set, `snapToAlignment` will define the relationship of the the snapping to the scroll view.
    *      - `start` (the default) will align the snap at the left (horizontal) or top (vertical)
    *      - `center` will align the snap in the center
    *      - `end` will align the snap at the right (horizontal) or bottom (vertical)
    */
  var snapToAlignment: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.start | reactDashNativeLib.reactDashNativeLibStrings.center | reactDashNativeLib.reactDashNativeLibStrings.end
  ] = js.undefined
  /**
    * Use in conjuction with `snapToOffsets`. By default, the end of the list counts as a snap
    * offset. Set `snapToEnd` to false to disable this behavior and allow the list to scroll freely
    * between its end and the last `snapToOffsets` offset. The default value is true.
    */
  var snapToEnd: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When set, causes the scroll view to stop at multiples of the value of `snapToInterval`.
    * This can be used for paginating through children that have lengths smaller than the scroll view.
    * Used in combination with `snapToAlignment` and `decelerationRate="fast"`. Overrides less
    * configurable `pagingEnabled` prop.
    */
  var snapToInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * When set, causes the scroll view to stop at the defined offsets. This can be used for
    * paginating through variously sized children that have lengths smaller than the scroll view.
    * Typically used in combination with `decelerationRate="fast"`. Overrides less configurable
    * `pagingEnabled` and `snapToInterval` props.
    */
  var snapToOffsets: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * Use in conjuction with `snapToOffsets`. By default, the beginning of the list counts as a
    * snap offset. Set `snapToStart` to false to disable this behavior and allow the list to scroll
    * freely between its start and the first `snapToOffsets` offset. The default value is true.
    */
  var snapToStart: js.UndefOr[scala.Boolean] = js.undefined
}

object ScrollViewProps {
  @scala.inline
  def apply(
    accessibilityActions: js.Array[java.lang.String] = null,
    accessibilityComponentType: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.button | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_checked | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityHint: java.lang.String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityLabel: java.lang.String = null,
    accessibilityLiveRegion: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.polite | reactDashNativeLib.reactDashNativeLibStrings.assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityStates: js.Array[AccessibilityState] = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
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
    decelerationRate: reactDashNativeLib.reactDashNativeLibStrings.fast | reactDashNativeLib.reactDashNativeLibStrings.normal | scala.Double = null,
    directionalLockEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    endFillColor: java.lang.String = null,
    hasTVPreferredFocus: js.UndefOr[scala.Boolean] = js.undefined,
    hitSlop: Insets = null,
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    importantForAccessibility: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.yes | reactDashNativeLib.reactDashNativeLibStrings.no | reactDashNativeLib.reactDashNativeLibStrings.`no-hide-descendants` = null,
    indicatorStyle: reactDashNativeLib.reactDashNativeLibStrings.default | reactDashNativeLib.reactDashNativeLibStrings.black | reactDashNativeLib.reactDashNativeLibStrings.white = null,
    invertStickyHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    isTVSelectable: js.UndefOr[scala.Boolean] = js.undefined,
    keyboardDismissMode: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.interactive | reactDashNativeLib.reactDashNativeLibStrings.`on-drag` = null,
    keyboardShouldPersistTaps: scala.Boolean | reactDashNativeLib.reactDashNativeLibStrings.always | reactDashNativeLib.reactDashNativeLibStrings.never | reactDashNativeLib.reactDashNativeLibStrings.handled = null,
    maximumZoomScale: scala.Int | scala.Double = null,
    minimumZoomScale: scala.Int | scala.Double = null,
    nativeID: java.lang.String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[scala.Boolean] = js.undefined,
    nestedScrollEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    onAccessibilityAction: () => scala.Unit = null,
    onAccessibilityTap: () => scala.Unit = null,
    onContentSizeChange: (/* w */ scala.Double, /* h */ scala.Double) => scala.Unit = null,
    onLayout: /* event */ LayoutChangeEvent => scala.Unit = null,
    onMagicTap: () => scala.Unit = null,
    onMomentumScrollBegin: /* event */ NativeSyntheticEvent[NativeScrollEvent] => scala.Unit = null,
    onMomentumScrollEnd: /* event */ NativeSyntheticEvent[NativeScrollEvent] => scala.Unit = null,
    onMoveShouldSetResponder: /* event */ GestureResponderEvent => scala.Boolean = null,
    onMoveShouldSetResponderCapture: /* event */ GestureResponderEvent => scala.Boolean = null,
    onResponderEnd: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderGrant: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderMove: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderReject: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderRelease: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderStart: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderTerminate: /* event */ GestureResponderEvent => scala.Unit = null,
    onResponderTerminationRequest: /* event */ GestureResponderEvent => scala.Boolean = null,
    onScroll: /* event */ NativeSyntheticEvent[NativeScrollEvent] => scala.Unit = null,
    onScrollAnimationEnd: () => scala.Unit = null,
    onScrollBeginDrag: /* event */ NativeSyntheticEvent[NativeScrollEvent] => scala.Unit = null,
    onScrollEndDrag: /* event */ NativeSyntheticEvent[NativeScrollEvent] => scala.Unit = null,
    onStartShouldSetResponder: /* event */ GestureResponderEvent => scala.Boolean = null,
    onStartShouldSetResponderCapture: /* event */ GestureResponderEvent => scala.Boolean = null,
    onTouchCancel: /* event */ GestureResponderEvent => scala.Unit = null,
    onTouchEnd: /* event */ GestureResponderEvent => scala.Unit = null,
    onTouchEndCapture: /* event */ GestureResponderEvent => scala.Unit = null,
    onTouchMove: /* event */ GestureResponderEvent => scala.Unit = null,
    onTouchStart: /* event */ GestureResponderEvent => scala.Unit = null,
    overScrollMode: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.always | reactDashNativeLib.reactDashNativeLibStrings.never = null,
    pagingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    pinchGestureEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    pointerEvents: reactDashNativeLib.reactDashNativeLibStrings.`box-none` | reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.`box-only` | reactDashNativeLib.reactDashNativeLibStrings.auto = null,
    refreshControl: reactLib.reactMod.ReactElement[RefreshControlProps] = null,
    removeClippedSubviews: js.UndefOr[scala.Boolean] = js.undefined,
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
    style: StyleProp[ViewStyle] = null,
    testID: java.lang.String = null,
    tvParallaxMagnification: scala.Int | scala.Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: scala.Int | scala.Double = null,
    tvParallaxShiftDistanceY: scala.Int | scala.Double = null,
    tvParallaxTiltAngle: scala.Int | scala.Double = null,
    zoomScale: scala.Int | scala.Double = null
  ): ScrollViewProps = {
    val __obj = js.Dynamic.literal()
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
    if (decelerationRate != null) __obj.updateDynamic("decelerationRate")(decelerationRate.asInstanceOf[js.Any])
    if (!js.isUndefined(directionalLockEnabled)) __obj.updateDynamic("directionalLockEnabled")(directionalLockEnabled)
    if (endFillColor != null) __obj.updateDynamic("endFillColor")(endFillColor)
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus)
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop)
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(invertStickyHeaders)) __obj.updateDynamic("invertStickyHeaders")(invertStickyHeaders)
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable)
    if (keyboardDismissMode != null) __obj.updateDynamic("keyboardDismissMode")(keyboardDismissMode.asInstanceOf[js.Any])
    if (keyboardShouldPersistTaps != null) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps.asInstanceOf[js.Any])
    if (maximumZoomScale != null) __obj.updateDynamic("maximumZoomScale")(maximumZoomScale.asInstanceOf[js.Any])
    if (minimumZoomScale != null) __obj.updateDynamic("minimumZoomScale")(minimumZoomScale.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID)
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing)
    if (!js.isUndefined(nestedScrollEnabled)) __obj.updateDynamic("nestedScrollEnabled")(nestedScrollEnabled)
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction0(onAccessibilityAction))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(js.Any.fromFunction2(onContentSizeChange))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onMomentumScrollBegin != null) __obj.updateDynamic("onMomentumScrollBegin")(js.Any.fromFunction1(onMomentumScrollBegin))
    if (onMomentumScrollEnd != null) __obj.updateDynamic("onMomentumScrollEnd")(js.Any.fromFunction1(onMomentumScrollEnd))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1(onMoveShouldSetResponder))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1(onMoveShouldSetResponderCapture))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1(onResponderEnd))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1(onResponderGrant))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1(onResponderMove))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1(onResponderReject))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1(onResponderRelease))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1(onResponderStart))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1(onResponderTerminate))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1(onResponderTerminationRequest))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollAnimationEnd != null) __obj.updateDynamic("onScrollAnimationEnd")(js.Any.fromFunction0(onScrollAnimationEnd))
    if (onScrollBeginDrag != null) __obj.updateDynamic("onScrollBeginDrag")(js.Any.fromFunction1(onScrollBeginDrag))
    if (onScrollEndDrag != null) __obj.updateDynamic("onScrollEndDrag")(js.Any.fromFunction1(onScrollEndDrag))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1(onStartShouldSetResponder))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(onStartShouldSetResponderCapture))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(onTouchEndCapture))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (overScrollMode != null) __obj.updateDynamic("overScrollMode")(overScrollMode.asInstanceOf[js.Any])
    if (!js.isUndefined(pagingEnabled)) __obj.updateDynamic("pagingEnabled")(pagingEnabled)
    if (!js.isUndefined(pinchGestureEnabled)) __obj.updateDynamic("pinchGestureEnabled")(pinchGestureEnabled)
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (refreshControl != null) __obj.updateDynamic("refreshControl")(refreshControl)
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews)
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
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties)
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    if (zoomScale != null) __obj.updateDynamic("zoomScale")(zoomScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewProps]
  }
}

