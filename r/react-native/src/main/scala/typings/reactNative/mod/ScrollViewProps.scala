package typings.reactNative.mod

import typings.react.mod.ReactElement
import typings.reactNative.reactNativeStrings.`on-drag`
import typings.reactNative.reactNativeStrings.always
import typings.reactNative.reactNativeStrings.fast
import typings.reactNative.reactNativeStrings.handled
import typings.reactNative.reactNativeStrings.interactive
import typings.reactNative.reactNativeStrings.never
import typings.reactNative.reactNativeStrings.none
import typings.reactNative.reactNativeStrings.normal_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * A floating-point number that determines how quickly the scroll view
    * decelerates after the user lifts their finger. You may also use string
    * shortcuts `"normal"` and `"fast"` which match the underlying iOS settings
    * for `UIScrollViewDecelerationRateNormal` and
    * `UIScrollViewDecelerationRateFast` respectively.
    *
    *  - `'normal'`: 0.998 on iOS, 0.985 on Android (the default)
    *  - `'fast'`: 0.99 on iOS, 0.9 on Android
    */
  var decelerationRate: js.UndefOr[fast | normal_ | Double] = js.native
  
  /**
    * When true, the scroll view stops on the next index (in relation to scroll position at release)
    * regardless of how fast the gesture is. This can be used for horizontal pagination when the page
    * is less than the width of the ScrollView. The default value is false.
    */
  var disableIntervalMomentum: js.UndefOr[Boolean] = js.native
  
  /**
    * When true, the default JS pan responder on the ScrollView is disabled, and full control over
    * touches inside the ScrollView is left to its child components. This is particularly useful
    * if `snapToInterval` is enabled, since it does not follow typical touch patterns. Do not use
    * this on regular ScrollView use cases without `snapToInterval` as it may cause unexpected
    * touches to occur while scrolling. The default value is false.
    */
  var disableScrollViewPanResponder: js.UndefOr[Boolean] = js.native
  
  /**
    * When true the scroll view's children are arranged horizontally in a row
    * instead of vertically in a column. The default value is false.
    */
  var horizontal: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * If sticky headers should stick at the bottom instead of the top of the
    * ScrollView. This is usually used with inverted ScrollViews.
    */
  var invertStickyHeaders: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines whether the keyboard gets dismissed in response to a drag.
    *   - 'none' (the default) drags do not dismiss the keyboard.
    *   - 'onDrag' the keyboard is dismissed when a drag begins.
    *   - 'interactive' the keyboard is dismissed interactively with the drag
    *     and moves in synchrony with the touch; dragging upwards cancels the
    *     dismissal.
    */
  var keyboardDismissMode: js.UndefOr[none | interactive | `on-drag`] = js.native
  
  /**
    * Determines when the keyboard should stay visible after a tap.
    * - 'never' (the default), tapping outside of the focused text input when the keyboard is up dismisses the keyboard. When this happens, children won't receive the tap.
    * - 'always', the keyboard will not dismiss automatically, and the scroll view will not catch taps, but children of the scroll view can catch taps.
    * - 'handled', the keyboard will not dismiss automatically when the tap was handled by a children, (or captured by an ancestor).
    * - false, deprecated, use 'never' instead
    * - true, deprecated, use 'always' instead
    */
  var keyboardShouldPersistTaps: js.UndefOr[Boolean | always | never | handled] = js.native
  
  /**
    * Called when scrollable content view of the ScrollView changes.
    * Handler function is passed the content width and content height as parameters: (contentWidth, contentHeight)
    * It's implemented using onLayout handler attached to the content container which this ScrollView renders.
    *
    */
  var onContentSizeChange: js.UndefOr[js.Function2[/* w */ Double, /* h */ Double, Unit]] = js.native
  
  /**
    * Fires when scroll view has begun moving
    */
  var onMomentumScrollBegin: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.native
  
  /**
    * Fires when scroll view has finished moving
    */
  var onMomentumScrollEnd: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.native
  
  /**
    * Fires at most once per frame during scrolling.
    * The frequency of the events can be contolled using the scrollEventThrottle prop.
    */
  var onScroll: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.native
  
  /**
    * Fires if a user initiates a scroll gesture.
    */
  var onScrollBeginDrag: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.native
  
  /**
    * Fires when a user has finished scrolling.
    */
  var onScrollEndDrag: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.native
  
  /**
    * When true the scroll view stops on multiples of the scroll view's size
    * when scrolling. This can be used for horizontal pagination. The default
    * value is false.
    */
  var pagingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A RefreshControl component, used to provide pull-to-refresh
    * functionality for the ScrollView.
    */
  var refreshControl: js.UndefOr[ReactElement] = js.native
  
  /**
    * When false, the content does not scroll. The default value is true
    */
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * When true, shows a horizontal scroll indicator.
    */
  var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.native
  
  /**
    * When true, shows a vertical scroll indicator.
    */
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.native
  
  /**
    * Use in conjunction with `snapToOffsets`. By default, the end of the list counts as a snap
    * offset. Set `snapToEnd` to false to disable this behavior and allow the list to scroll freely
    * between its end and the last `snapToOffsets` offset. The default value is true.
    */
  var snapToEnd: js.UndefOr[Boolean] = js.native
  
  /**
    * When set, causes the scroll view to stop at multiples of the value of `snapToInterval`.
    * This can be used for paginating through children that have lengths smaller than the scroll view.
    * Used in combination with `snapToAlignment` and `decelerationRate="fast"`. Overrides less
    * configurable `pagingEnabled` prop.
    */
  var snapToInterval: js.UndefOr[Double] = js.native
  
  /**
    * When set, causes the scroll view to stop at the defined offsets. This can be used for
    * paginating through variously sized children that have lengths smaller than the scroll view.
    * Typically used in combination with `decelerationRate="fast"`. Overrides less configurable
    * `pagingEnabled` and `snapToInterval` props.
    */
  var snapToOffsets: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Use in conjunction with `snapToOffsets`. By default, the beginning of the list counts as a
    * snap offset. Set `snapToStart` to false to disable this behavior and allow the list to scroll
    * freely between its start and the first `snapToOffsets` offset. The default value is true.
    */
  var snapToStart: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of child indices determining which children get docked to the
    * top of the screen when scrolling. For example passing
    * `stickyHeaderIndices={[0]}` will cause the first child to be fixed to the
    * top of the scroll view. This property is not supported in conjunction
    * with `horizontal={true}`.
    */
  var stickyHeaderIndices: js.UndefOr[js.Array[Double]] = js.native
}
object ScrollViewProps {
  
  @scala.inline
  def apply(): ScrollViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollViewProps]
  }
  
  @scala.inline
  implicit class ScrollViewPropsOps[Self <: ScrollViewProps] (val x: Self) extends AnyVal {
    
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
    def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("contentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentContainerStyle: Self = this.set("contentContainerStyle", js.undefined)
    
    @scala.inline
    def setContentContainerStyleNull: Self = this.set("contentContainerStyle", null)
    
    @scala.inline
    def setDecelerationRate(value: fast | normal_ | Double): Self = this.set("decelerationRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecelerationRate: Self = this.set("decelerationRate", js.undefined)
    
    @scala.inline
    def setDisableIntervalMomentum(value: Boolean): Self = this.set("disableIntervalMomentum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableIntervalMomentum: Self = this.set("disableIntervalMomentum", js.undefined)
    
    @scala.inline
    def setDisableScrollViewPanResponder(value: Boolean): Self = this.set("disableScrollViewPanResponder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableScrollViewPanResponder: Self = this.set("disableScrollViewPanResponder", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setHorizontalNull: Self = this.set("horizontal", null)
    
    @scala.inline
    def setInvertStickyHeaders(value: Boolean): Self = this.set("invertStickyHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvertStickyHeaders: Self = this.set("invertStickyHeaders", js.undefined)
    
    @scala.inline
    def setKeyboardDismissMode(value: none | interactive | `on-drag`): Self = this.set("keyboardDismissMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardDismissMode: Self = this.set("keyboardDismissMode", js.undefined)
    
    @scala.inline
    def setKeyboardShouldPersistTaps(value: Boolean | always | never | handled): Self = this.set("keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardShouldPersistTaps: Self = this.set("keyboardShouldPersistTaps", js.undefined)
    
    @scala.inline
    def setOnContentSizeChange(value: (/* w */ Double, /* h */ Double) => Unit): Self = this.set("onContentSizeChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnContentSizeChange: Self = this.set("onContentSizeChange", js.undefined)
    
    @scala.inline
    def setOnMomentumScrollBegin(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = this.set("onMomentumScrollBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMomentumScrollBegin: Self = this.set("onMomentumScrollBegin", js.undefined)
    
    @scala.inline
    def setOnMomentumScrollEnd(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = this.set("onMomentumScrollEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMomentumScrollEnd: Self = this.set("onMomentumScrollEnd", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnScrollBeginDrag(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = this.set("onScrollBeginDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScrollBeginDrag: Self = this.set("onScrollBeginDrag", js.undefined)
    
    @scala.inline
    def setOnScrollEndDrag(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = this.set("onScrollEndDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScrollEndDrag: Self = this.set("onScrollEndDrag", js.undefined)
    
    @scala.inline
    def setPagingEnabled(value: Boolean): Self = this.set("pagingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagingEnabled: Self = this.set("pagingEnabled", js.undefined)
    
    @scala.inline
    def setRefreshControl(value: ReactElement): Self = this.set("refreshControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshControl: Self = this.set("refreshControl", js.undefined)
    
    @scala.inline
    def setScrollEnabled(value: Boolean): Self = this.set("scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollEnabled: Self = this.set("scrollEnabled", js.undefined)
    
    @scala.inline
    def setShowsHorizontalScrollIndicator(value: Boolean): Self = this.set("showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsHorizontalScrollIndicator: Self = this.set("showsHorizontalScrollIndicator", js.undefined)
    
    @scala.inline
    def setShowsVerticalScrollIndicator(value: Boolean): Self = this.set("showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsVerticalScrollIndicator: Self = this.set("showsVerticalScrollIndicator", js.undefined)
    
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
  }
}
