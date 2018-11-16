package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScrollViewPropsIOS extends js.Object {
  /**
       * When true the scroll view bounces horizontally when it reaches the end
       * even if the content is smaller than the scroll view itself. The default
       * value is true when `horizontal={true}` and false otherwise.
       */
  var alwaysBounceHorizontal: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * When true the scroll view bounces vertically when it reaches the end
       * even if the content is smaller than the scroll view itself. The default
       * value is false when `horizontal={true}` and true otherwise.
       */
  var alwaysBounceVertical: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Controls whether iOS should automatically adjust the content inset for scroll views that are placed behind a navigation bar or tab bar/ toolbar.
       * The default value is true.
       */
  var automaticallyAdjustContentInsets: js.UndefOr[scala.Boolean] = js.undefined
   // true
  /**
       * When true the scroll view bounces when it reaches the end of the
       * content if the content is larger then the scroll view along the axis of
       * the scroll direction. When false it disables all bouncing even if
       * the `alwaysBounce*` props are true. The default value is true.
       */
  var bounces: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * When true gestures can drive zoom past min/max and the zoom will animate
       * to the min/max value at gesture end otherwise the zoom will not exceed
       * the limits.
       */
  var bouncesZoom: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * When false once tracking starts won't try to drag if the touch moves.
       * The default value is true.
       */
  var canCancelContentTouches: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * When true the scroll view automatically centers the content when the
       * content is smaller than the scroll view bounds; when the content is
       * larger than the scroll view this property has no effect. The default
       * value is false.
       */
  var centerContent: js.UndefOr[scala.Boolean] = js.undefined
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
  var contentInsetAdjustmentBehavior: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.automatic | reactDashNativeLib.reactDashNativeLibStrings.scrollableAxes | reactDashNativeLib.reactDashNativeLibStrings.never | reactDashNativeLib.reactDashNativeLibStrings.always
  ] = js.undefined
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
  var decelerationRate: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.fast | reactDashNativeLib.reactDashNativeLibStrings.normal | scala.Double
  ] = js.undefined
  /**
       * When true the ScrollView will try to lock to only vertical or horizontal
       * scrolling while dragging.  The default value is false.
       */
  var directionalLockEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The style of the scroll indicators.
       * - default (the default), same as black.
       * - black, scroll indicator is black. This style is good against
       *   a white content background.
       * - white, scroll indicator is white. This style is good against
       *   a black content background.
       */
  var indicatorStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.default | reactDashNativeLib.reactDashNativeLibStrings.black | reactDashNativeLib.reactDashNativeLibStrings.white
  ] = js.undefined
  /**
       * The maximum allowed zoom scale. The default value is 1.0.
       */
  var maximumZoomScale: js.UndefOr[scala.Double] = js.undefined
  /**
       * The minimum allowed zoom scale. The default value is 1.0.
       */
  var minimumZoomScale: js.UndefOr[scala.Double] = js.undefined
  /**
       * Called when a scrolling animation ends.
       */
  var onScrollAnimationEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * When true, ScrollView allows use of pinch gestures to zoom in and out.
       * The default value is true.
       */
  var pinchGestureEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * This controls how often the scroll event will be fired while scrolling (in events per seconds).
       * A higher number yields better accuracy for code that is tracking the scroll position,
       * but can lead to scroll performance problems due to the volume of information being send over the bridge.
       * The default value is zero, which means the scroll event will be sent only once each time the view is scrolled.
       */
  var scrollEventThrottle: js.UndefOr[scala.Double] = js.undefined
   // null
  /**
       * The amount by which the scroll view indicators are inset from the edges of the scroll view.
       * This should normally be set to the same value as the contentInset.
       * Defaults to {0, 0, 0, 0}.
       */
  var scrollIndicatorInsets: js.UndefOr[Insets] = js.undefined
   //zeroes
  /**
       * When true the scroll view scrolls to top when the status bar is tapped.
       * The default value is true.
       */
  var scrollsToTop: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * When snapToInterval is set, snapToAlignment will define the relationship of the the snapping to the scroll view.
       *      - start (the default) will align the snap at the left (horizontal) or top (vertical)
       *      - center will align the snap in the center
       *      - end will align the snap at the right (horizontal) or bottom (vertical)
       */
  var snapToAlignment: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.start | reactDashNativeLib.reactDashNativeLibStrings.center | reactDashNativeLib.reactDashNativeLibStrings.end
  ] = js.undefined
  /**
       * When set, causes the scroll view to stop at multiples of the value of snapToInterval.
       * This can be used for paginating through children that have lengths smaller than the scroll view.
       * Used in combination with snapToAlignment.
       */
  var snapToInterval: js.UndefOr[scala.Double] = js.undefined
  /**
       * An array of child indices determining which children get docked to the
       * top of the screen when scrolling. For example passing
       * `stickyHeaderIndices={[0]}` will cause the first child to be fixed to the
       * top of the scroll view. This property is not supported in conjunction
       * with `horizontal={true}`.
       */
  var stickyHeaderIndices: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
       * The current scale of the scroll view content. The default value is 1.0.
       */
  var zoomScale: js.UndefOr[scala.Double] = js.undefined
}

