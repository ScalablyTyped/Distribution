package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.always
import typings.reactNative.reactNativeStrings.automatic
import typings.reactNative.reactNativeStrings.black
import typings.reactNative.reactNativeStrings.default
import typings.reactNative.reactNativeStrings.fast
import typings.reactNative.reactNativeStrings.never
import typings.reactNative.reactNativeStrings.normal_
import typings.reactNative.reactNativeStrings.scrollableAxes
import typings.reactNative.reactNativeStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollViewPropsIOS extends js.Object {
  /**
    * When true the scroll view bounces horizontally when it reaches the end
    * even if the content is smaller than the scroll view itself. The default
    * value is true when `horizontal={true}` and false otherwise.
    */
  var alwaysBounceHorizontal: js.UndefOr[Boolean] = js.undefined
  /**
    * When true the scroll view bounces vertically when it reaches the end
    * even if the content is smaller than the scroll view itself. The default
    * value is false when `horizontal={true}` and true otherwise.
    */
  var alwaysBounceVertical: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls whether iOS should automatically adjust the content inset for scroll views that are placed behind a navigation bar or tab bar/ toolbar.
    * The default value is true.
    */
  var automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined
   // true
  /**
    * When true the scroll view bounces when it reaches the end of the
    * content if the content is larger then the scroll view along the axis of
    * the scroll direction. When false it disables all bouncing even if
    * the `alwaysBounce*` props are true. The default value is true.
    */
  var bounces: js.UndefOr[Boolean] = js.undefined
  /**
    * When true gestures can drive zoom past min/max and the zoom will animate
    * to the min/max value at gesture end otherwise the zoom will not exceed
    * the limits.
    */
  var bouncesZoom: js.UndefOr[Boolean] = js.undefined
  /**
    * When false once tracking starts won't try to drag if the touch moves.
    * The default value is true.
    */
  var canCancelContentTouches: js.UndefOr[Boolean] = js.undefined
  /**
    * When true the scroll view automatically centers the content when the
    * content is smaller than the scroll view bounds; when the content is
    * larger than the scroll view this property has no effect. The default
    * value is false.
    */
  var centerContent: js.UndefOr[Boolean] = js.undefined
  /**
    * The amount by which the scroll view content is inset from the edges of the scroll view.
    * Defaults to {0, 0, 0, 0}.
    */
  var contentInset: js.UndefOr[Insets] = js.undefined
   // zeros
  /**
    * This property specifies how the safe area insets are used to modify the content area of the scroll view.
    * The default value of this property must be 'automatic'. But the default value is 'never' until RN@0.51.
    */
  var contentInsetAdjustmentBehavior: js.UndefOr[automatic | scrollableAxes | never | always] = js.undefined
   // zeros
  /**
    * Used to manually set the starting scroll offset.
    * The default value is {x: 0, y: 0}
    */
  var contentOffset: js.UndefOr[PointPropType] = js.undefined
  /**
    * A floating-point number that determines how quickly the scroll view
    * decelerates after the user lifts their finger. Reasonable choices include
    *   - Normal: 0.998 (the default)
    *   - Fast: 0.9
    */
  var decelerationRate: js.UndefOr[fast | normal_ | Double] = js.undefined
  /**
    * When true the ScrollView will try to lock to only vertical or horizontal
    * scrolling while dragging.  The default value is false.
    */
  var directionalLockEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The style of the scroll indicators.
    * - default (the default), same as black.
    * - black, scroll indicator is black. This style is good against
    *   a white content background.
    * - white, scroll indicator is white. This style is good against
    *   a black content background.
    */
  var indicatorStyle: js.UndefOr[default | black | white] = js.undefined
  /**
    * The maximum allowed zoom scale. The default value is 1.0.
    */
  var maximumZoomScale: js.UndefOr[Double] = js.undefined
  /**
    * The minimum allowed zoom scale. The default value is 1.0.
    */
  var minimumZoomScale: js.UndefOr[Double] = js.undefined
  /**
    * Called when a scrolling animation ends.
    */
  var onScrollAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Fires when the scroll view scrolls to top after the status bar has been tapped
    * @platform ios
    */
  var onScrollToTop: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
  /**
    * When true, ScrollView allows use of pinch gestures to zoom in and out.
    * The default value is true.
    */
  var pinchGestureEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * This controls how often the scroll event will be fired while scrolling (in events per seconds).
    * A higher number yields better accuracy for code that is tracking the scroll position,
    * but can lead to scroll performance problems due to the volume of information being send over the bridge.
    * The default value is zero, which means the scroll event will be sent only once each time the view is scrolled.
    */
  var scrollEventThrottle: js.UndefOr[Double] = js.undefined
   // null
  /**
    * The amount by which the scroll view indicators are inset from the edges of the scroll view.
    * This should normally be set to the same value as the contentInset.
    * Defaults to {0, 0, 0, 0}.
    */
  var scrollIndicatorInsets: js.UndefOr[Insets] = js.undefined
   //zeroes
  /**
    * When true, the scroll view can be programmatically scrolled beyond its
    * content size. The default value is false.
    * @platform ios
    */
  var scrollToOverflowEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * When true the scroll view scrolls to top when the status bar is tapped.
    * The default value is true.
    */
  var scrollsToTop: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of child indices determining which children get docked to the
    * top of the screen when scrolling. For example passing
    * `stickyHeaderIndices={[0]}` will cause the first child to be fixed to the
    * top of the scroll view. This property is not supported in conjunction
    * with `horizontal={true}`.
    */
  var stickyHeaderIndices: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * The current scale of the scroll view content. The default value is 1.0.
    */
  var zoomScale: js.UndefOr[Double] = js.undefined
}

object ScrollViewPropsIOS {
  @scala.inline
  def apply(
    alwaysBounceHorizontal: js.UndefOr[Boolean] = js.undefined,
    alwaysBounceVertical: js.UndefOr[Boolean] = js.undefined,
    automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined,
    bounces: js.UndefOr[Boolean] = js.undefined,
    bouncesZoom: js.UndefOr[Boolean] = js.undefined,
    canCancelContentTouches: js.UndefOr[Boolean] = js.undefined,
    centerContent: js.UndefOr[Boolean] = js.undefined,
    contentInset: Insets = null,
    contentInsetAdjustmentBehavior: automatic | scrollableAxes | never | always = null,
    contentOffset: PointPropType = null,
    decelerationRate: fast | normal_ | Double = null,
    directionalLockEnabled: js.UndefOr[Boolean] = js.undefined,
    indicatorStyle: default | black | white = null,
    maximumZoomScale: js.UndefOr[Double] = js.undefined,
    minimumZoomScale: js.UndefOr[Double] = js.undefined,
    onScrollAnimationEnd: () => Unit = null,
    onScrollToTop: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit = null,
    pinchGestureEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollEventThrottle: js.UndefOr[Double] = js.undefined,
    scrollIndicatorInsets: Insets = null,
    scrollToOverflowEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollsToTop: js.UndefOr[Boolean] = js.undefined,
    stickyHeaderIndices: js.Array[Double] = null,
    zoomScale: js.UndefOr[Double] = js.undefined
  ): ScrollViewPropsIOS = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysBounceHorizontal)) __obj.updateDynamic("alwaysBounceHorizontal")(alwaysBounceHorizontal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysBounceVertical)) __obj.updateDynamic("alwaysBounceVertical")(alwaysBounceVertical.get.asInstanceOf[js.Any])
    if (!js.isUndefined(automaticallyAdjustContentInsets)) __obj.updateDynamic("automaticallyAdjustContentInsets")(automaticallyAdjustContentInsets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bounces)) __obj.updateDynamic("bounces")(bounces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bouncesZoom)) __obj.updateDynamic("bouncesZoom")(bouncesZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canCancelContentTouches)) __obj.updateDynamic("canCancelContentTouches")(canCancelContentTouches.get.asInstanceOf[js.Any])
    if (!js.isUndefined(centerContent)) __obj.updateDynamic("centerContent")(centerContent.get.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (contentInsetAdjustmentBehavior != null) __obj.updateDynamic("contentInsetAdjustmentBehavior")(contentInsetAdjustmentBehavior.asInstanceOf[js.Any])
    if (contentOffset != null) __obj.updateDynamic("contentOffset")(contentOffset.asInstanceOf[js.Any])
    if (decelerationRate != null) __obj.updateDynamic("decelerationRate")(decelerationRate.asInstanceOf[js.Any])
    if (!js.isUndefined(directionalLockEnabled)) __obj.updateDynamic("directionalLockEnabled")(directionalLockEnabled.get.asInstanceOf[js.Any])
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumZoomScale)) __obj.updateDynamic("maximumZoomScale")(maximumZoomScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumZoomScale)) __obj.updateDynamic("minimumZoomScale")(minimumZoomScale.get.asInstanceOf[js.Any])
    if (onScrollAnimationEnd != null) __obj.updateDynamic("onScrollAnimationEnd")(js.Any.fromFunction0(onScrollAnimationEnd))
    if (onScrollToTop != null) __obj.updateDynamic("onScrollToTop")(js.Any.fromFunction1(onScrollToTop))
    if (!js.isUndefined(pinchGestureEnabled)) __obj.updateDynamic("pinchGestureEnabled")(pinchGestureEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollEventThrottle)) __obj.updateDynamic("scrollEventThrottle")(scrollEventThrottle.get.asInstanceOf[js.Any])
    if (scrollIndicatorInsets != null) __obj.updateDynamic("scrollIndicatorInsets")(scrollIndicatorInsets.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToOverflowEnabled)) __obj.updateDynamic("scrollToOverflowEnabled")(scrollToOverflowEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollsToTop)) __obj.updateDynamic("scrollsToTop")(scrollsToTop.get.asInstanceOf[js.Any])
    if (stickyHeaderIndices != null) __obj.updateDynamic("stickyHeaderIndices")(stickyHeaderIndices.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomScale)) __obj.updateDynamic("zoomScale")(zoomScale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewPropsIOS]
  }
}

