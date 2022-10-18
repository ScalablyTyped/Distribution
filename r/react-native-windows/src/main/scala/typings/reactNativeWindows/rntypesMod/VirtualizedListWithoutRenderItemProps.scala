package typings.reactNativeWindows.rntypesMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactNativeWindows.anon.AverageItemLength
import typings.reactNativeWindows.anon.Changed
import typings.reactNativeWindows.anon.DistanceFromEnd
import typings.reactNativeWindows.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualizedListWithoutRenderItemProps[ItemT]
  extends StObject
     with ScrollViewProps {
  
  var CellRendererComponent: js.UndefOr[ComponentType[Any]] = js.undefined
  
  /**
    * Rendered when the list is empty. Can be a React Component Class, a render function, or
    * a rendered element.
    */
  var ListEmptyComponent: js.UndefOr[ComponentType[Any] | ReactElement | Null] = js.undefined
  
  /**
    * Rendered at the bottom of all the items. Can be a React Component Class, a render function, or
    * a rendered element.
    */
  var ListFooterComponent: js.UndefOr[ComponentType[Any] | ReactElement | Null] = js.undefined
  
  /**
    * Rendered at the top of all the items. Can be a React Component Class, a render function, or
    * a rendered element.
    */
  var ListHeaderComponent: js.UndefOr[ComponentType[Any] | ReactElement | Null] = js.undefined
  
  /**
    * The default accessor functions assume this is an Array<{key: string}> but you can override
    * getItem, getItemCount, and keyExtractor to handle any type of index-based data.
    */
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * `debug` will turn on extra logging and visual overlays to aid with debugging both usage and
    * implementation, but with a significant perf hit.
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  
  /**
    * DEPRECATED: Virtualization provides significant performance and memory optimizations, but fully
    * unmounts react instances that are outside of the render window. You should only need to disable
    * this for debugging purposes.
    */
  var disableVirtualization: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A marker property for telling the list to re-render (since it implements `PureComponent`). If
    * any of your `renderItem`, Header, Footer, etc. functions depend on anything outside of the
    * `data` prop, stick it here and treat it immutably.
    */
  var extraData: js.UndefOr[Any] = js.undefined
  
  /**
    * A generic accessor for extracting an item from any sort of data blob.
    */
  var getItem: js.UndefOr[js.Function2[/* data */ Any, /* index */ Double, ItemT]] = js.undefined
  
  /**
    * Determines how many items are in the data blob.
    */
  var getItemCount: js.UndefOr[js.Function1[/* data */ Any, Double]] = js.undefined
  
  var getItemLayout: js.UndefOr[js.Function2[/* data */ Any, /* index */ Double, Length]] = js.undefined
  
  /**
    * How many items to render in the initial batch. This should be enough to fill the screen but not
    * much more. Note these items will never be unmounted as part of the windowed rendering in order
    * to improve perceived performance of scroll-to-top actions.
    */
  var initialNumToRender: js.UndefOr[Double] = js.undefined
  
  /**
    * Instead of starting at the top with the first item, start at `initialScrollIndex`. This
    * disables the "scroll to top" optimization that keeps the first `initialNumToRender` items
    * always rendered and immediately renders the items starting at this initial index. Requires
    * `getItemLayout` to be implemented.
    */
  var initialScrollIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Reverses the direction of scroll. Uses scale transforms of -1.
    */
  var inverted: js.UndefOr[Boolean | Null] = js.undefined
  
  var keyExtractor: js.UndefOr[js.Function2[/* item */ ItemT, /* index */ Double, String]] = js.undefined
  
  var listKey: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of items to render in each incremental render batch. The more rendered at
    * once, the better the fill rate, but responsiveness my suffer because rendering content may
    * interfere with responding to button taps or other interactions.
    */
  var maxToRenderPerBatch: js.UndefOr[Double] = js.undefined
  
  var onEndReached: js.UndefOr[(js.Function1[/* info */ DistanceFromEnd, Unit]) | Null] = js.undefined
  
  var onEndReachedThreshold: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * If provided, a standard RefreshControl will be added for "Pull to Refresh" functionality. Make
    * sure to also set the `refreshing` prop correctly.
    */
  var onRefresh: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  
  /**
    * Used to handle failures when scrolling to an index that has not been measured yet.
    * Recommended action is to either compute your own offset and `scrollTo` it, or scroll as far
    * as possible and then try again after more items have been rendered.
    */
  var onScrollToIndexFailed: js.UndefOr[js.Function1[/* info */ AverageItemLength, Unit]] = js.undefined
  
  /**
    * Called when the viewability of rows changes, as defined by the
    * `viewabilityConfig` prop.
    */
  var onViewableItemsChanged: js.UndefOr[(js.Function1[/* info */ Changed, Unit]) | Null] = js.undefined
  
  /**
    * Set this when offset is needed for the loading indicator to show correctly.
    * @platform android
    */
  var progressViewOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * Set this true while waiting for new data from a refresh.
    */
  var refreshing: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Render a custom scroll component, e.g. with a differently styled `RefreshControl`.
    */
  var renderScrollComponent: js.UndefOr[js.Function1[/* props */ ScrollViewProps, ReactElement]] = js.undefined
  
  /**
    * Amount of time between low-pri item render batches, e.g. for rendering items quite a ways off
    * screen. Similar fill rate/responsiveness tradeoff as `maxToRenderPerBatch`.
    */
  var updateCellsBatchingPeriod: js.UndefOr[Double] = js.undefined
  
  var viewabilityConfig: js.UndefOr[ViewabilityConfig] = js.undefined
  
  var viewabilityConfigCallbackPairs: js.UndefOr[ViewabilityConfigCallbackPairs] = js.undefined
  
  /**
    * Determines the maximum number of items rendered outside of the visible area, in units of
    * visible lengths. So if your list fills the screen, then `windowSize={21}` (the default) will
    * render the visible screen area plus up to 10 screens above and 10 below the viewport. Reducing
    * this number will reduce memory consumption and may improve performance, but will increase the
    * chance that fast scrolling may reveal momentary blank areas of unrendered content.
    */
  var windowSize: js.UndefOr[Double] = js.undefined
}
object VirtualizedListWithoutRenderItemProps {
  
  inline def apply[ItemT](): VirtualizedListWithoutRenderItemProps[ItemT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualizedListWithoutRenderItemProps[ItemT]]
  }
  
  extension [Self <: VirtualizedListWithoutRenderItemProps[?], ItemT](x: Self & VirtualizedListWithoutRenderItemProps[ItemT]) {
    
    inline def setCellRendererComponent(value: ComponentType[Any]): Self = StObject.set(x, "CellRendererComponent", value.asInstanceOf[js.Any])
    
    inline def setCellRendererComponentUndefined: Self = StObject.set(x, "CellRendererComponent", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDisableVirtualization(value: Boolean): Self = StObject.set(x, "disableVirtualization", value.asInstanceOf[js.Any])
    
    inline def setDisableVirtualizationUndefined: Self = StObject.set(x, "disableVirtualization", js.undefined)
    
    inline def setExtraData(value: Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    inline def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
    
    inline def setGetItem(value: (/* data */ Any, /* index */ Double) => ItemT): Self = StObject.set(x, "getItem", js.Any.fromFunction2(value))
    
    inline def setGetItemCount(value: /* data */ Any => Double): Self = StObject.set(x, "getItemCount", js.Any.fromFunction1(value))
    
    inline def setGetItemCountUndefined: Self = StObject.set(x, "getItemCount", js.undefined)
    
    inline def setGetItemLayout(value: (/* data */ Any, /* index */ Double) => Length): Self = StObject.set(x, "getItemLayout", js.Any.fromFunction2(value))
    
    inline def setGetItemLayoutUndefined: Self = StObject.set(x, "getItemLayout", js.undefined)
    
    inline def setGetItemUndefined: Self = StObject.set(x, "getItem", js.undefined)
    
    inline def setInitialNumToRender(value: Double): Self = StObject.set(x, "initialNumToRender", value.asInstanceOf[js.Any])
    
    inline def setInitialNumToRenderUndefined: Self = StObject.set(x, "initialNumToRender", js.undefined)
    
    inline def setInitialScrollIndex(value: Double): Self = StObject.set(x, "initialScrollIndex", value.asInstanceOf[js.Any])
    
    inline def setInitialScrollIndexNull: Self = StObject.set(x, "initialScrollIndex", null)
    
    inline def setInitialScrollIndexUndefined: Self = StObject.set(x, "initialScrollIndex", js.undefined)
    
    inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    inline def setInvertedNull: Self = StObject.set(x, "inverted", null)
    
    inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    
    inline def setKeyExtractor(value: (/* item */ ItemT, /* index */ Double) => String): Self = StObject.set(x, "keyExtractor", js.Any.fromFunction2(value))
    
    inline def setKeyExtractorUndefined: Self = StObject.set(x, "keyExtractor", js.undefined)
    
    inline def setListEmptyComponent(value: ComponentType[Any] | ReactElement): Self = StObject.set(x, "ListEmptyComponent", value.asInstanceOf[js.Any])
    
    inline def setListEmptyComponentNull: Self = StObject.set(x, "ListEmptyComponent", null)
    
    inline def setListEmptyComponentUndefined: Self = StObject.set(x, "ListEmptyComponent", js.undefined)
    
    inline def setListFooterComponent(value: ComponentType[Any] | ReactElement): Self = StObject.set(x, "ListFooterComponent", value.asInstanceOf[js.Any])
    
    inline def setListFooterComponentNull: Self = StObject.set(x, "ListFooterComponent", null)
    
    inline def setListFooterComponentUndefined: Self = StObject.set(x, "ListFooterComponent", js.undefined)
    
    inline def setListHeaderComponent(value: ComponentType[Any] | ReactElement): Self = StObject.set(x, "ListHeaderComponent", value.asInstanceOf[js.Any])
    
    inline def setListHeaderComponentNull: Self = StObject.set(x, "ListHeaderComponent", null)
    
    inline def setListHeaderComponentUndefined: Self = StObject.set(x, "ListHeaderComponent", js.undefined)
    
    inline def setListKey(value: String): Self = StObject.set(x, "listKey", value.asInstanceOf[js.Any])
    
    inline def setListKeyUndefined: Self = StObject.set(x, "listKey", js.undefined)
    
    inline def setMaxToRenderPerBatch(value: Double): Self = StObject.set(x, "maxToRenderPerBatch", value.asInstanceOf[js.Any])
    
    inline def setMaxToRenderPerBatchUndefined: Self = StObject.set(x, "maxToRenderPerBatch", js.undefined)
    
    inline def setOnEndReached(value: /* info */ DistanceFromEnd => Unit): Self = StObject.set(x, "onEndReached", js.Any.fromFunction1(value))
    
    inline def setOnEndReachedNull: Self = StObject.set(x, "onEndReached", null)
    
    inline def setOnEndReachedThreshold(value: Double): Self = StObject.set(x, "onEndReachedThreshold", value.asInstanceOf[js.Any])
    
    inline def setOnEndReachedThresholdNull: Self = StObject.set(x, "onEndReachedThreshold", null)
    
    inline def setOnEndReachedThresholdUndefined: Self = StObject.set(x, "onEndReachedThreshold", js.undefined)
    
    inline def setOnEndReachedUndefined: Self = StObject.set(x, "onEndReached", js.undefined)
    
    inline def setOnRefresh(value: () => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
    
    inline def setOnRefreshNull: Self = StObject.set(x, "onRefresh", null)
    
    inline def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
    
    inline def setOnScrollToIndexFailed(value: /* info */ AverageItemLength => Unit): Self = StObject.set(x, "onScrollToIndexFailed", js.Any.fromFunction1(value))
    
    inline def setOnScrollToIndexFailedUndefined: Self = StObject.set(x, "onScrollToIndexFailed", js.undefined)
    
    inline def setOnViewableItemsChanged(value: /* info */ Changed => Unit): Self = StObject.set(x, "onViewableItemsChanged", js.Any.fromFunction1(value))
    
    inline def setOnViewableItemsChangedNull: Self = StObject.set(x, "onViewableItemsChanged", null)
    
    inline def setOnViewableItemsChangedUndefined: Self = StObject.set(x, "onViewableItemsChanged", js.undefined)
    
    inline def setProgressViewOffset(value: Double): Self = StObject.set(x, "progressViewOffset", value.asInstanceOf[js.Any])
    
    inline def setProgressViewOffsetUndefined: Self = StObject.set(x, "progressViewOffset", js.undefined)
    
    inline def setRefreshing(value: Boolean): Self = StObject.set(x, "refreshing", value.asInstanceOf[js.Any])
    
    inline def setRefreshingNull: Self = StObject.set(x, "refreshing", null)
    
    inline def setRefreshingUndefined: Self = StObject.set(x, "refreshing", js.undefined)
    
    inline def setRenderScrollComponent(value: /* props */ ScrollViewProps => ReactElement): Self = StObject.set(x, "renderScrollComponent", js.Any.fromFunction1(value))
    
    inline def setRenderScrollComponentUndefined: Self = StObject.set(x, "renderScrollComponent", js.undefined)
    
    inline def setUpdateCellsBatchingPeriod(value: Double): Self = StObject.set(x, "updateCellsBatchingPeriod", value.asInstanceOf[js.Any])
    
    inline def setUpdateCellsBatchingPeriodUndefined: Self = StObject.set(x, "updateCellsBatchingPeriod", js.undefined)
    
    inline def setViewabilityConfig(value: ViewabilityConfig): Self = StObject.set(x, "viewabilityConfig", value.asInstanceOf[js.Any])
    
    inline def setViewabilityConfigCallbackPairs(value: ViewabilityConfigCallbackPairs): Self = StObject.set(x, "viewabilityConfigCallbackPairs", value.asInstanceOf[js.Any])
    
    inline def setViewabilityConfigCallbackPairsUndefined: Self = StObject.set(x, "viewabilityConfigCallbackPairs", js.undefined)
    
    inline def setViewabilityConfigCallbackPairsVarargs(value: ViewabilityConfigCallbackPair*): Self = StObject.set(x, "viewabilityConfigCallbackPairs", js.Array(value*))
    
    inline def setViewabilityConfigUndefined: Self = StObject.set(x, "viewabilityConfig", js.undefined)
    
    inline def setWindowSize(value: Double): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
    
    inline def setWindowSizeUndefined: Self = StObject.set(x, "windowSize", js.undefined)
  }
}
