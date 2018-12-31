package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualizedListWithoutRenderItemProps[ItemT] extends ScrollViewProps {
  /**
    * Rendered when the list is empty. Can be a React Component Class, a render function, or
    * a rendered element.
    */
  var ListEmptyComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[_] | reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null
  ] = js.undefined
  /**
    * Rendered at the bottom of all the items. Can be a React Component Class, a render function, or
    * a rendered element.
    */
  var ListFooterComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[_] | reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null
  ] = js.undefined
  /**
    * Rendered at the top of all the items. Can be a React Component Class, a render function, or
    * a rendered element.
    */
  var ListHeaderComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[_] | reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null
  ] = js.undefined
  /**
    * The default accessor functions assume this is an Array<{key: string}> but you can override
    * getItem, getItemCount, and keyExtractor to handle any type of index-based data.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * `debug` will turn on extra logging and visual overlays to aid with debugging both usage and
    * implementation, but with a significant perf hit.
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * DEPRECATED: Virtualization provides significant performance and memory optimizations, but fully
    * unmounts react instances that are outside of the render window. You should only need to disable
    * this for debugging purposes.
    */
  var disableVirtualization: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A marker property for telling the list to re-render (since it implements `PureComponent`). If
    * any of your `renderItem`, Header, Footer, etc. functions depend on anything outside of the
    * `data` prop, stick it here and treat it immutably.
    */
  var extraData: js.UndefOr[js.Any] = js.undefined
  /**
    * A generic accessor for extracting an item from any sort of data blob.
    */
  var getItem: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ scala.Double, ItemT]] = js.undefined
  /**
    * Determines how many items are in the data blob.
    */
  var getItemCount: js.UndefOr[js.Function1[/* data */ js.Any, scala.Double]] = js.undefined
  var getItemLayout: js.UndefOr[
    js.Function2[/* data */ js.Any, /* index */ scala.Double, reactDashNativeLib.Anon_Length]
  ] = js.undefined
  /**
    * How many items to render in the initial batch. This should be enough to fill the screen but not
    * much more. Note these items will never be unmounted as part of the windowed rendering in order
    * to improve perceived performance of scroll-to-top actions.
    */
  var initialNumToRender: js.UndefOr[scala.Double] = js.undefined
  /**
    * Instead of starting at the top with the first item, start at `initialScrollIndex`. This
    * disables the "scroll to top" optimization that keeps the first `initialNumToRender` items
    * always rendered and immediately renders the items starting at this initial index. Requires
    * `getItemLayout` to be implemented.
    */
  var initialScrollIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Reverses the direction of scroll. Uses scale transforms of -1.
    */
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  var keyExtractor: js.UndefOr[js.Function2[/* item */ ItemT, /* index */ scala.Double, java.lang.String]] = js.undefined
  var listKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of items to render in each incremental render batch. The more rendered at
    * once, the better the fill rate, but responsiveness my suffer because rendering content may
    * interfere with responding to button taps or other interactions.
    */
  var maxToRenderPerBatch: js.UndefOr[scala.Double] = js.undefined
  var onEndReached: js.UndefOr[
    (js.Function1[/* info */ reactDashNativeLib.Anon_DistanceFromEnd, scala.Unit]) | scala.Null
  ] = js.undefined
  var onEndReachedThreshold: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * If provided, a standard RefreshControl will be added for "Pull to Refresh" functionality. Make
    * sure to also set the `refreshing` prop correctly.
    */
  var onRefresh: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  /**
    * Used to handle failures when scrolling to an index that has not been measured yet.
    * Recommended action is to either compute your own offset and `scrollTo` it, or scroll as far
    * as possible and then try again after more items have been rendered.
    */
  var onScrollToIndexFailed: js.UndefOr[
    js.Function1[/* info */ reactDashNativeLib.Anon_HighestMeasuredFrameIndex, scala.Unit]
  ] = js.undefined
  /**
    * Called when the viewability of rows changes, as defined by the
    * `viewabilityConfig` prop.
    */
  var onViewableItemsChanged: js.UndefOr[
    (js.Function1[/* info */ reactDashNativeLib.Anon_ViewableItems, scala.Unit]) | scala.Null
  ] = js.undefined
  /**
    * Set this when offset is needed for the loading indicator to show correctly.
    * @platform android
    */
  var progressViewOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set this true while waiting for new data from a refresh.
    */
  var refreshing: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * Render a custom scroll component, e.g. with a differently styled `RefreshControl`.
    */
  var renderScrollComponent: js.UndefOr[
    js.Function1[
      /* props */ ScrollViewProps, 
      reactLib.reactMod.ReactNs.ReactElement[ScrollViewProps]
    ]
  ] = js.undefined
  /**
    * Amount of time between low-pri item render batches, e.g. for rendering items quite a ways off
    * screen. Similar fill rate/responsiveness tradeoff as `maxToRenderPerBatch`.
    */
  var updateCellsBatchingPeriod: js.UndefOr[scala.Double] = js.undefined
  var viewabilityConfig: js.UndefOr[ViewabilityConfig] = js.undefined
  var viewabilityConfigCallbackPairs: js.UndefOr[ViewabilityConfigCallbackPairs] = js.undefined
  /**
    * Determines the maximum number of items rendered outside of the visible area, in units of
    * visible lengths. So if your list fills the screen, then `windowSize={21}` (the default) will
    * render the visible screen area plus up to 10 screens above and 10 below the viewport. Reducing
    * this number will reduce memory consumption and may improve performance, but will increase the
    * chance that fast scrolling may reveal momentary blank areas of unrendered content.
    */
  var windowSize: js.UndefOr[scala.Double] = js.undefined
}

