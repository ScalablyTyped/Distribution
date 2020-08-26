package typings.reactNative.mod

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactNative.anon.AverageItemLength
import typings.reactNative.anon.Changed
import typings.reactNative.anon.DistanceFromEnd
import typings.reactNative.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualizedListWithoutRenderItemProps[ItemT] extends ScrollViewProps {
  var CellRendererComponent: js.UndefOr[ComponentType[_]] = js.native
  /**
    * Rendered when the list is empty. Can be a React Component Class, a render function, or
    * a rendered element.
    */
  var ListEmptyComponent: js.UndefOr[ComponentType[_] | ReactElement | Null] = js.native
  /**
    * Rendered at the bottom of all the items. Can be a React Component Class, a render function, or
    * a rendered element.
    */
  var ListFooterComponent: js.UndefOr[ComponentType[_] | ReactElement | Null] = js.native
  /**
    * Rendered at the top of all the items. Can be a React Component Class, a render function, or
    * a rendered element.
    */
  var ListHeaderComponent: js.UndefOr[ComponentType[_] | ReactElement | Null] = js.native
  /**
    * The default accessor functions assume this is an Array<{key: string}> but you can override
    * getItem, getItemCount, and keyExtractor to handle any type of index-based data.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * `debug` will turn on extra logging and visual overlays to aid with debugging both usage and
    * implementation, but with a significant perf hit.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * DEPRECATED: Virtualization provides significant performance and memory optimizations, but fully
    * unmounts react instances that are outside of the render window. You should only need to disable
    * this for debugging purposes.
    */
  var disableVirtualization: js.UndefOr[Boolean] = js.native
  /**
    * A marker property for telling the list to re-render (since it implements `PureComponent`). If
    * any of your `renderItem`, Header, Footer, etc. functions depend on anything outside of the
    * `data` prop, stick it here and treat it immutably.
    */
  var extraData: js.UndefOr[js.Any] = js.native
  /**
    * A generic accessor for extracting an item from any sort of data blob.
    */
  var getItem: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, ItemT]] = js.native
  /**
    * Determines how many items are in the data blob.
    */
  var getItemCount: js.UndefOr[js.Function1[/* data */ js.Any, Double]] = js.native
  var getItemLayout: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, Index]] = js.native
  /**
    * How many items to render in the initial batch. This should be enough to fill the screen but not
    * much more. Note these items will never be unmounted as part of the windowed rendering in order
    * to improve perceived performance of scroll-to-top actions.
    */
  var initialNumToRender: js.UndefOr[Double] = js.native
  /**
    * Instead of starting at the top with the first item, start at `initialScrollIndex`. This
    * disables the "scroll to top" optimization that keeps the first `initialNumToRender` items
    * always rendered and immediately renders the items starting at this initial index. Requires
    * `getItemLayout` to be implemented.
    */
  var initialScrollIndex: js.UndefOr[Double | Null] = js.native
  /**
    * Reverses the direction of scroll. Uses scale transforms of -1.
    */
  var inverted: js.UndefOr[Boolean | Null] = js.native
  var keyExtractor: js.UndefOr[js.Function2[/* item */ ItemT, /* index */ Double, String]] = js.native
  var listKey: js.UndefOr[String] = js.native
  /**
    * The maximum number of items to render in each incremental render batch. The more rendered at
    * once, the better the fill rate, but responsiveness my suffer because rendering content may
    * interfere with responding to button taps or other interactions.
    */
  var maxToRenderPerBatch: js.UndefOr[Double] = js.native
  var onEndReached: js.UndefOr[(js.Function1[/* info */ DistanceFromEnd, Unit]) | Null] = js.native
  var onEndReachedThreshold: js.UndefOr[Double | Null] = js.native
  /**
    * If provided, a standard RefreshControl will be added for "Pull to Refresh" functionality. Make
    * sure to also set the `refreshing` prop correctly.
    */
  var onRefresh: js.UndefOr[js.Function0[Unit] | Null] = js.native
  /**
    * Used to handle failures when scrolling to an index that has not been measured yet.
    * Recommended action is to either compute your own offset and `scrollTo` it, or scroll as far
    * as possible and then try again after more items have been rendered.
    */
  var onScrollToIndexFailed: js.UndefOr[js.Function1[/* info */ AverageItemLength, Unit]] = js.native
  /**
    * Called when the viewability of rows changes, as defined by the
    * `viewabilityConfig` prop.
    */
  var onViewableItemsChanged: js.UndefOr[(js.Function1[/* info */ Changed, Unit]) | Null] = js.native
  /**
    * Set this when offset is needed for the loading indicator to show correctly.
    * @platform android
    */
  var progressViewOffset: js.UndefOr[Double] = js.native
  /**
    * Set this true while waiting for new data from a refresh.
    */
  var refreshing: js.UndefOr[Boolean | Null] = js.native
  /**
    * Render a custom scroll component, e.g. with a differently styled `RefreshControl`.
    */
  var renderScrollComponent: js.UndefOr[js.Function1[/* props */ ScrollViewProps, ReactElement]] = js.native
  /**
    * Amount of time between low-pri item render batches, e.g. for rendering items quite a ways off
    * screen. Similar fill rate/responsiveness tradeoff as `maxToRenderPerBatch`.
    */
  var updateCellsBatchingPeriod: js.UndefOr[Double] = js.native
  var viewabilityConfig: js.UndefOr[ViewabilityConfig] = js.native
  var viewabilityConfigCallbackPairs: js.UndefOr[ViewabilityConfigCallbackPairs] = js.native
  /**
    * Determines the maximum number of items rendered outside of the visible area, in units of
    * visible lengths. So if your list fills the screen, then `windowSize={21}` (the default) will
    * render the visible screen area plus up to 10 screens above and 10 below the viewport. Reducing
    * this number will reduce memory consumption and may improve performance, but will increase the
    * chance that fast scrolling may reveal momentary blank areas of unrendered content.
    */
  var windowSize: js.UndefOr[Double] = js.native
}

object VirtualizedListWithoutRenderItemProps {
  @scala.inline
  def apply[ItemT](): VirtualizedListWithoutRenderItemProps[ItemT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualizedListWithoutRenderItemProps[ItemT]]
  }
  @scala.inline
  implicit class VirtualizedListWithoutRenderItemPropsOps[Self <: VirtualizedListWithoutRenderItemProps[_], ItemT] (val x: Self with VirtualizedListWithoutRenderItemProps[ItemT]) extends AnyVal {
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
    def setListHeaderComponent(value: ComponentType[_] | ReactElement): Self = this.set("ListHeaderComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListHeaderComponent: Self = this.set("ListHeaderComponent", js.undefined)
    @scala.inline
    def setListHeaderComponentNull: Self = this.set("ListHeaderComponent", null)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDisableVirtualization(value: Boolean): Self = this.set("disableVirtualization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableVirtualization: Self = this.set("disableVirtualization", js.undefined)
    @scala.inline
    def setExtraData(value: js.Any): Self = this.set("extraData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraData: Self = this.set("extraData", js.undefined)
    @scala.inline
    def setGetItem(value: (/* data */ js.Any, /* index */ Double) => ItemT): Self = this.set("getItem", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetItem: Self = this.set("getItem", js.undefined)
    @scala.inline
    def setGetItemCount(value: /* data */ js.Any => Double): Self = this.set("getItemCount", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetItemCount: Self = this.set("getItemCount", js.undefined)
    @scala.inline
    def setGetItemLayout(value: (/* data */ js.Any, /* index */ Double) => Index): Self = this.set("getItemLayout", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetItemLayout: Self = this.set("getItemLayout", js.undefined)
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
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setInvertedNull: Self = this.set("inverted", null)
    @scala.inline
    def setKeyExtractor(value: (/* item */ ItemT, /* index */ Double) => String): Self = this.set("keyExtractor", js.Any.fromFunction2(value))
    @scala.inline
    def deleteKeyExtractor: Self = this.set("keyExtractor", js.undefined)
    @scala.inline
    def setListKey(value: String): Self = this.set("listKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListKey: Self = this.set("listKey", js.undefined)
    @scala.inline
    def setMaxToRenderPerBatch(value: Double): Self = this.set("maxToRenderPerBatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxToRenderPerBatch: Self = this.set("maxToRenderPerBatch", js.undefined)
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
    def setOnRefresh(value: () => Unit): Self = this.set("onRefresh", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRefresh: Self = this.set("onRefresh", js.undefined)
    @scala.inline
    def setOnRefreshNull: Self = this.set("onRefresh", null)
    @scala.inline
    def setOnScrollToIndexFailed(value: /* info */ AverageItemLength => Unit): Self = this.set("onScrollToIndexFailed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnScrollToIndexFailed: Self = this.set("onScrollToIndexFailed", js.undefined)
    @scala.inline
    def setOnViewableItemsChanged(value: /* info */ Changed => Unit): Self = this.set("onViewableItemsChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnViewableItemsChanged: Self = this.set("onViewableItemsChanged", js.undefined)
    @scala.inline
    def setOnViewableItemsChangedNull: Self = this.set("onViewableItemsChanged", null)
    @scala.inline
    def setProgressViewOffset(value: Double): Self = this.set("progressViewOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressViewOffset: Self = this.set("progressViewOffset", js.undefined)
    @scala.inline
    def setRefreshing(value: Boolean): Self = this.set("refreshing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshing: Self = this.set("refreshing", js.undefined)
    @scala.inline
    def setRefreshingNull: Self = this.set("refreshing", null)
    @scala.inline
    def setRenderScrollComponent(value: /* props */ ScrollViewProps => ReactElement): Self = this.set("renderScrollComponent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderScrollComponent: Self = this.set("renderScrollComponent", js.undefined)
    @scala.inline
    def setUpdateCellsBatchingPeriod(value: Double): Self = this.set("updateCellsBatchingPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateCellsBatchingPeriod: Self = this.set("updateCellsBatchingPeriod", js.undefined)
    @scala.inline
    def setViewabilityConfig(value: ViewabilityConfig): Self = this.set("viewabilityConfig", value.asInstanceOf[js.Any])
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
  }
  
}

