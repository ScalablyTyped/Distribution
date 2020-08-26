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

@js.native
trait ScrollViewPropsIOS extends js.Object {
  /**
    * When true the scroll view bounces horizontally when it reaches the end
    * even if the content is smaller than the scroll view itself. The default
    * value is true when `horizontal={true}` and false otherwise.
    */
  var alwaysBounceHorizontal: js.UndefOr[Boolean] = js.native
  /**
    * When true the scroll view bounces vertically when it reaches the end
    * even if the content is smaller than the scroll view itself. The default
    * value is false when `horizontal={true}` and true otherwise.
    */
  var alwaysBounceVertical: js.UndefOr[Boolean] = js.native
  /**
    * Controls whether iOS should automatically adjust the content inset for scroll views that are placed behind a navigation bar or tab bar/ toolbar.
    * The default value is true.
    */
  var automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.native
   // true
  /**
    * When true the scroll view bounces when it reaches the end of the
    * content if the content is larger then the scroll view along the axis of
    * the scroll direction. When false it disables all bouncing even if
    * the `alwaysBounce*` props are true. The default value is true.
    */
  var bounces: js.UndefOr[Boolean] = js.native
  /**
    * When true gestures can drive zoom past min/max and the zoom will animate
    * to the min/max value at gesture end otherwise the zoom will not exceed
    * the limits.
    */
  var bouncesZoom: js.UndefOr[Boolean] = js.native
  /**
    * When false once tracking starts won't try to drag if the touch moves.
    * The default value is true.
    */
  var canCancelContentTouches: js.UndefOr[Boolean] = js.native
  /**
    * When true the scroll view automatically centers the content when the
    * content is smaller than the scroll view bounds; when the content is
    * larger than the scroll view this property has no effect. The default
    * value is false.
    */
  var centerContent: js.UndefOr[Boolean] = js.native
  /**
    * The amount by which the scroll view content is inset from the edges of the scroll view.
    * Defaults to {0, 0, 0, 0}.
    */
  var contentInset: js.UndefOr[Insets] = js.native
   // zeros
  /**
    * This property specifies how the safe area insets are used to modify the content area of the scroll view.
    * The default value of this property must be 'automatic'. But the default value is 'never' until RN@0.51.
    */
  var contentInsetAdjustmentBehavior: js.UndefOr[automatic | scrollableAxes | never | always] = js.native
   // zeros
  /**
    * Used to manually set the starting scroll offset.
    * The default value is {x: 0, y: 0}
    */
  var contentOffset: js.UndefOr[PointPropType] = js.native
  /**
    * A floating-point number that determines how quickly the scroll view
    * decelerates after the user lifts their finger. Reasonable choices include
    *   - Normal: 0.998 (the default)
    *   - Fast: 0.9
    */
  var decelerationRate: js.UndefOr[fast | normal_ | Double] = js.native
  /**
    * When true the ScrollView will try to lock to only vertical or horizontal
    * scrolling while dragging.  The default value is false.
    */
  var directionalLockEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The style of the scroll indicators.
    * - default (the default), same as black.
    * - black, scroll indicator is black. This style is good against
    *   a white content background.
    * - white, scroll indicator is white. This style is good against
    *   a black content background.
    */
  var indicatorStyle: js.UndefOr[default | black | white] = js.native
  /**
    * The maximum allowed zoom scale. The default value is 1.0.
    */
  var maximumZoomScale: js.UndefOr[Double] = js.native
  /**
    * The minimum allowed zoom scale. The default value is 1.0.
    */
  var minimumZoomScale: js.UndefOr[Double] = js.native
  /**
    * Called when a scrolling animation ends.
    */
  var onScrollAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Fires when the scroll view scrolls to top after the status bar has been tapped
    * @platform ios
    */
  var onScrollToTop: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.native
  /**
    * When true, ScrollView allows use of pinch gestures to zoom in and out.
    * The default value is true.
    */
  var pinchGestureEnabled: js.UndefOr[Boolean] = js.native
  /**
    * This controls how often the scroll event will be fired while scrolling (in events per seconds).
    * A higher number yields better accuracy for code that is tracking the scroll position,
    * but can lead to scroll performance problems due to the volume of information being send over the bridge.
    * The default value is zero, which means the scroll event will be sent only once each time the view is scrolled.
    */
  var scrollEventThrottle: js.UndefOr[Double] = js.native
   // null
  /**
    * The amount by which the scroll view indicators are inset from the edges of the scroll view.
    * This should normally be set to the same value as the contentInset.
    * Defaults to {0, 0, 0, 0}.
    */
  var scrollIndicatorInsets: js.UndefOr[Insets] = js.native
   //zeroes
  /**
    * When true, the scroll view can be programmatically scrolled beyond its
    * content size. The default value is false.
    * @platform ios
    */
  var scrollToOverflowEnabled: js.UndefOr[Boolean] = js.native
  /**
    * When true the scroll view scrolls to top when the status bar is tapped.
    * The default value is true.
    */
  var scrollsToTop: js.UndefOr[Boolean] = js.native
  /**
    * An array of child indices determining which children get docked to the
    * top of the screen when scrolling. For example passing
    * `stickyHeaderIndices={[0]}` will cause the first child to be fixed to the
    * top of the scroll view. This property is not supported in conjunction
    * with `horizontal={true}`.
    */
  var stickyHeaderIndices: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The current scale of the scroll view content. The default value is 1.0.
    */
  var zoomScale: js.UndefOr[Double] = js.native
}

object ScrollViewPropsIOS {
  @scala.inline
  def apply(): ScrollViewPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollViewPropsIOS]
  }
  @scala.inline
  implicit class ScrollViewPropsIOSOps[Self <: ScrollViewPropsIOS] (val x: Self) extends AnyVal {
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
    def setContentInset(value: Insets): Self = this.set("contentInset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentInset: Self = this.set("contentInset", js.undefined)
    @scala.inline
    def setContentInsetAdjustmentBehavior(value: automatic | scrollableAxes | never | always): Self = this.set("contentInsetAdjustmentBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentInsetAdjustmentBehavior: Self = this.set("contentInsetAdjustmentBehavior", js.undefined)
    @scala.inline
    def setContentOffset(value: PointPropType): Self = this.set("contentOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentOffset: Self = this.set("contentOffset", js.undefined)
    @scala.inline
    def setDecelerationRate(value: fast | normal_ | Double): Self = this.set("decelerationRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecelerationRate: Self = this.set("decelerationRate", js.undefined)
    @scala.inline
    def setDirectionalLockEnabled(value: Boolean): Self = this.set("directionalLockEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectionalLockEnabled: Self = this.set("directionalLockEnabled", js.undefined)
    @scala.inline
    def setIndicatorStyle(value: default | black | white): Self = this.set("indicatorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicatorStyle: Self = this.set("indicatorStyle", js.undefined)
    @scala.inline
    def setMaximumZoomScale(value: Double): Self = this.set("maximumZoomScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumZoomScale: Self = this.set("maximumZoomScale", js.undefined)
    @scala.inline
    def setMinimumZoomScale(value: Double): Self = this.set("minimumZoomScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumZoomScale: Self = this.set("minimumZoomScale", js.undefined)
    @scala.inline
    def setOnScrollAnimationEnd(value: () => Unit): Self = this.set("onScrollAnimationEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnScrollAnimationEnd: Self = this.set("onScrollAnimationEnd", js.undefined)
    @scala.inline
    def setOnScrollToTop(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = this.set("onScrollToTop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnScrollToTop: Self = this.set("onScrollToTop", js.undefined)
    @scala.inline
    def setPinchGestureEnabled(value: Boolean): Self = this.set("pinchGestureEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinchGestureEnabled: Self = this.set("pinchGestureEnabled", js.undefined)
    @scala.inline
    def setScrollEventThrottle(value: Double): Self = this.set("scrollEventThrottle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollEventThrottle: Self = this.set("scrollEventThrottle", js.undefined)
    @scala.inline
    def setScrollIndicatorInsets(value: Insets): Self = this.set("scrollIndicatorInsets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollIndicatorInsets: Self = this.set("scrollIndicatorInsets", js.undefined)
    @scala.inline
    def setScrollToOverflowEnabled(value: Boolean): Self = this.set("scrollToOverflowEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollToOverflowEnabled: Self = this.set("scrollToOverflowEnabled", js.undefined)
    @scala.inline
    def setScrollsToTop(value: Boolean): Self = this.set("scrollsToTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollsToTop: Self = this.set("scrollsToTop", js.undefined)
    @scala.inline
    def setStickyHeaderIndicesVarargs(value: Double*): Self = this.set("stickyHeaderIndices", js.Array(value :_*))
    @scala.inline
    def setStickyHeaderIndices(value: js.Array[Double]): Self = this.set("stickyHeaderIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyHeaderIndices: Self = this.set("stickyHeaderIndices", js.undefined)
    @scala.inline
    def setZoomScale(value: Double): Self = this.set("zoomScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomScale: Self = this.set("zoomScale", js.undefined)
  }
  
}

