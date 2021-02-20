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
import org.scalablytyped.runtime.StObject
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
  implicit class ScrollViewPropsMutableBuilder[Self <: ScrollViewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
    
    @scala.inline
    def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
    
    @scala.inline
    def setDecelerationRate(value: fast | normal_ | Double): Self = StObject.set(x, "decelerationRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecelerationRateUndefined: Self = StObject.set(x, "decelerationRate", js.undefined)
    
    @scala.inline
    def setDisableIntervalMomentum(value: Boolean): Self = StObject.set(x, "disableIntervalMomentum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableIntervalMomentumUndefined: Self = StObject.set(x, "disableIntervalMomentum", js.undefined)
    
    @scala.inline
    def setDisableScrollViewPanResponder(value: Boolean): Self = StObject.set(x, "disableScrollViewPanResponder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableScrollViewPanResponderUndefined: Self = StObject.set(x, "disableScrollViewPanResponder", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalNull: Self = StObject.set(x, "horizontal", null)
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setInvertStickyHeaders(value: Boolean): Self = StObject.set(x, "invertStickyHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertStickyHeadersUndefined: Self = StObject.set(x, "invertStickyHeaders", js.undefined)
    
    @scala.inline
    def setKeyboardDismissMode(value: none | interactive | `on-drag`): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
    
    @scala.inline
    def setKeyboardShouldPersistTaps(value: Boolean | always | never | handled): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
    
    @scala.inline
    def setOnContentSizeChange(value: (/* w */ Double, /* h */ Double) => Unit): Self = StObject.set(x, "onContentSizeChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnContentSizeChangeUndefined: Self = StObject.set(x, "onContentSizeChange", js.undefined)
    
    @scala.inline
    def setOnMomentumScrollBegin(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onMomentumScrollBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMomentumScrollBeginUndefined: Self = StObject.set(x, "onMomentumScrollBegin", js.undefined)
    
    @scala.inline
    def setOnMomentumScrollEnd(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onMomentumScrollEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMomentumScrollEndUndefined: Self = StObject.set(x, "onMomentumScrollEnd", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollBeginDrag(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollBeginDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollBeginDragUndefined: Self = StObject.set(x, "onScrollBeginDrag", js.undefined)
    
    @scala.inline
    def setOnScrollEndDrag(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollEndDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollEndDragUndefined: Self = StObject.set(x, "onScrollEndDrag", js.undefined)
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    @scala.inline
    def setPagingEnabled(value: Boolean): Self = StObject.set(x, "pagingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingEnabledUndefined: Self = StObject.set(x, "pagingEnabled", js.undefined)
    
    @scala.inline
    def setRefreshControl(value: ReactElement): Self = StObject.set(x, "refreshControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshControlUndefined: Self = StObject.set(x, "refreshControl", js.undefined)
    
    @scala.inline
    def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
    
    @scala.inline
    def setShowsHorizontalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsHorizontalScrollIndicatorUndefined: Self = StObject.set(x, "showsHorizontalScrollIndicator", js.undefined)
    
    @scala.inline
    def setShowsVerticalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsVerticalScrollIndicatorUndefined: Self = StObject.set(x, "showsVerticalScrollIndicator", js.undefined)
    
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
  }
}
