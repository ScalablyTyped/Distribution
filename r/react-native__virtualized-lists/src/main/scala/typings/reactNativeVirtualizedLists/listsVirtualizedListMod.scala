package typings.reactNativeVirtualizedLists

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ElementRef
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactNativeVirtualizedLists.anon.Animated
import typings.reactNativeVirtualizedLists.anon.AverageItemLength
import typings.reactNativeVirtualizedLists.anon.Changed
import typings.reactNativeVirtualizedLists.anon.DistanceFromEnd
import typings.reactNativeVirtualizedLists.anon.DistanceFromStart
import typings.reactNativeVirtualizedLists.anon.Highlight
import typings.reactNativeVirtualizedLists.anon.Index
import typings.reactNativeVirtualizedLists.anon.Item
import typings.reactNativeVirtualizedLists.anon.Length
import typings.reactNativeVirtualizedLists.anon.Offset
import typings.std.FocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listsVirtualizedListMod {
  
  @JSImport("@react-native/virtualized-lists/Lists/VirtualizedList", "VirtualizedList")
  @js.native
  open class VirtualizedList[ItemT] protected ()
    extends Component[VirtualizedListProps[ItemT], js.Object, Any] {
    def this(props: VirtualizedListProps[ItemT]) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: VirtualizedListProps[ItemT], context: Any) = this()
    
    def getScrollRef(): (ElementRef[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ScrollView */ Any
      ]) | Null = js.native
    
    def getScrollResponder(): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScrollResponderMixin */ Any) | Null = js.native
    
    def recordInteraction(): Unit = js.native
    
    def scrollToEnd(): Unit = js.native
    def scrollToEnd(params: Animated): Unit = js.native
    
    def scrollToIndex(params: Index): Unit = js.native
    
    def scrollToItem(params: Item[ItemT]): Unit = js.native
    
    /**
      * Scroll to a specific content pixel offset in the list.
      * Param `offset` expects the offset to scroll to. In case of horizontal is true, the
      * offset is the x-value, in any other case the offset is the y-value.
      * Param `animated` (true by default) defines whether the list should do an animation while scrolling.
      */
    def scrollToOffset(params: Offset): Unit = js.native
  }
  
  trait CellRendererProps[ItemT] extends StObject {
    
    var cellKey: String
    
    var children: ReactNode
    
    var index: Double
    
    var item: ItemT
    
    var onFocusCapture: js.UndefOr[js.Function1[/* event */ FocusEvent, Unit]] = js.undefined
    
    var onLayout: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LayoutChangeEvent */ /* event */ Any, 
          Unit
        ]
      ] = js.undefined
    
    var style: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StyleProp<ViewStyle> */ Any
      ] = js.undefined
  }
  object CellRendererProps {
    
    inline def apply[ItemT](cellKey: String, index: Double, item: ItemT): CellRendererProps[ItemT] = {
      val __obj = js.Dynamic.literal(cellKey = cellKey.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellRendererProps[ItemT]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellRendererProps[?], ItemT] (val x: Self & CellRendererProps[ItemT]) extends AnyVal {
      
      inline def setCellKey(value: String): Self = StObject.set(x, "cellKey", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setItem(value: ItemT): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setOnFocusCapture(value: /* event */ FocusEvent => Unit): Self = StObject.set(x, "onFocusCapture", js.Any.fromFunction1(value))
      
      inline def setOnFocusCaptureUndefined: Self = StObject.set(x, "onFocusCapture", js.undefined)
      
      inline def setOnLayout(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LayoutChangeEvent */ /* event */ Any => Unit
      ): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      inline def setStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StyleProp<ViewStyle> */ Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type ListRenderItem[ItemT] = js.Function1[/* info */ ListRenderItemInfo[ItemT], ReactElement | Null]
  
  trait ListRenderItemInfo[ItemT] extends StObject {
    
    var index: Double
    
    var item: ItemT
    
    var separators: Highlight
  }
  object ListRenderItemInfo {
    
    inline def apply[ItemT](index: Double, item: ItemT, separators: Highlight): ListRenderItemInfo[ItemT] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListRenderItemInfo[ItemT]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListRenderItemInfo[?], ItemT] (val x: Self & ListRenderItemInfo[ItemT]) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setItem(value: ItemT): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setSeparators(value: Highlight): Self = StObject.set(x, "separators", value.asInstanceOf[js.Any])
    }
  }
  
  trait ViewToken extends StObject {
    
    var index: Double | Null
    
    var isViewable: Boolean
    
    var item: Any
    
    var key: String
    
    var section: js.UndefOr[Any] = js.undefined
  }
  object ViewToken {
    
    inline def apply(isViewable: Boolean, item: Any, key: String): ViewToken = {
      val __obj = js.Dynamic.literal(isViewable = isViewable.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], index = null)
      __obj.asInstanceOf[ViewToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewToken] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexNull: Self = StObject.set(x, "index", null)
      
      inline def setIsViewable(value: Boolean): Self = StObject.set(x, "isViewable", value.asInstanceOf[js.Any])
      
      inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSection(value: Any): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    }
  }
  
  trait ViewabilityConfig extends StObject {
    
    /**
      * Similar to `viewAreaCoveragePercentThreshold`, but considers the percent of the item that is visible,
      * rather than the fraction of the viewable area it covers.
      */
    var itemVisiblePercentThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum amount of time (in milliseconds) that an item must be physically viewable before the
      * viewability callback will be fired. A high number means that scrolling through content without
      * stopping will not mark the content as viewable.
      */
    var minimumViewTime: js.UndefOr[Double] = js.undefined
    
    /**
      * Percent of viewport that must be covered for a partially occluded item to count as
      * "viewable", 0-100. Fully visible items are always considered viewable. A value of 0 means
      * that a single pixel in the viewport makes the item viewable, and a value of 100 means that
      * an item must be either entirely visible or cover the entire viewport to count as viewable.
      */
    var viewAreaCoveragePercentThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * Nothing is considered viewable until the user scrolls or `recordInteraction` is called after
      * render.
      */
    var waitForInteraction: js.UndefOr[Boolean] = js.undefined
  }
  object ViewabilityConfig {
    
    inline def apply(): ViewabilityConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewabilityConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewabilityConfig] (val x: Self) extends AnyVal {
      
      inline def setItemVisiblePercentThreshold(value: Double): Self = StObject.set(x, "itemVisiblePercentThreshold", value.asInstanceOf[js.Any])
      
      inline def setItemVisiblePercentThresholdUndefined: Self = StObject.set(x, "itemVisiblePercentThreshold", js.undefined)
      
      inline def setMinimumViewTime(value: Double): Self = StObject.set(x, "minimumViewTime", value.asInstanceOf[js.Any])
      
      inline def setMinimumViewTimeUndefined: Self = StObject.set(x, "minimumViewTime", js.undefined)
      
      inline def setViewAreaCoveragePercentThreshold(value: Double): Self = StObject.set(x, "viewAreaCoveragePercentThreshold", value.asInstanceOf[js.Any])
      
      inline def setViewAreaCoveragePercentThresholdUndefined: Self = StObject.set(x, "viewAreaCoveragePercentThreshold", js.undefined)
      
      inline def setWaitForInteraction(value: Boolean): Self = StObject.set(x, "waitForInteraction", value.asInstanceOf[js.Any])
      
      inline def setWaitForInteractionUndefined: Self = StObject.set(x, "waitForInteraction", js.undefined)
    }
  }
  
  trait ViewabilityConfigCallbackPair extends StObject {
    
    var onViewableItemsChanged: (js.Function1[/* info */ Changed, Unit]) | Null
    
    var viewabilityConfig: ViewabilityConfig
  }
  object ViewabilityConfigCallbackPair {
    
    inline def apply(viewabilityConfig: ViewabilityConfig): ViewabilityConfigCallbackPair = {
      val __obj = js.Dynamic.literal(viewabilityConfig = viewabilityConfig.asInstanceOf[js.Any], onViewableItemsChanged = null)
      __obj.asInstanceOf[ViewabilityConfigCallbackPair]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewabilityConfigCallbackPair] (val x: Self) extends AnyVal {
      
      inline def setOnViewableItemsChanged(value: /* info */ Changed => Unit): Self = StObject.set(x, "onViewableItemsChanged", js.Any.fromFunction1(value))
      
      inline def setOnViewableItemsChangedNull: Self = StObject.set(x, "onViewableItemsChanged", null)
      
      inline def setViewabilityConfig(value: ViewabilityConfig): Self = StObject.set(x, "viewabilityConfig", value.asInstanceOf[js.Any])
    }
  }
  
  type ViewabilityConfigCallbackPairs = js.Array[ViewabilityConfigCallbackPair]
  
  trait VirtualizedListProps[ItemT]
    extends StObject
       with VirtualizedListWithoutRenderItemProps[ItemT] {
    
    var renderItem: js.UndefOr[ListRenderItem[ItemT] | Null] = js.undefined
  }
  object VirtualizedListProps {
    
    inline def apply[ItemT](): VirtualizedListProps[ItemT] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VirtualizedListProps[ItemT]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VirtualizedListProps[?], ItemT] (val x: Self & VirtualizedListProps[ItemT]) extends AnyVal {
      
      inline def setRenderItem(value: /* info */ ListRenderItemInfo[ItemT] => ReactElement | Null): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      
      inline def setRenderItemNull: Self = StObject.set(x, "renderItem", null)
      
      inline def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScrollViewProps * / any */ trait VirtualizedListWithoutRenderItemProps[ItemT] extends StObject {
    
    /**
      * CellRendererComponent allows customizing how cells rendered by
      * `renderItem`/`ListItemComponent` are wrapped when placed into the
      * underlying ScrollView. This component must accept event handlers which
      * notify VirtualizedList of changes within the cell.
      */
    var CellRendererComponent: js.UndefOr[ComponentType[CellRendererProps[ItemT]] | Null] = js.undefined
    
    /**
      * Rendered in between each item, but not at the top or bottom
      */
    var ItemSeparatorComponent: js.UndefOr[ComponentType[Any] | Null] = js.undefined
    
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
      * Styling for internal View for ListFooterComponent
      */
    var ListFooterComponentStyle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StyleProp<ViewStyle> */ Any
      ] = js.undefined
    
    /**
      * Rendered at the top of all the items. Can be a React Component Class, a render function, or
      * a rendered element.
      */
    var ListHeaderComponent: js.UndefOr[ComponentType[Any] | ReactElement | Null] = js.undefined
    
    /**
      * Styling for internal View for ListHeaderComponent
      */
    var ListHeaderComponentStyle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StyleProp<ViewStyle> */ Any
      ] = js.undefined
    
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
    
    var horizontal: js.UndefOr[Boolean | Null] = js.undefined
    
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
    
    /**
      * The maximum number of items to render in each incremental render batch. The more rendered at
      * once, the better the fill rate, but responsiveness my suffer because rendering content may
      * interfere with responding to button taps or other interactions.
      */
    var maxToRenderPerBatch: js.UndefOr[Double] = js.undefined
    
    /**
      * Called once when the scroll position gets within within `onEndReachedThreshold`
      * from the logical end of the list.
      */
    var onEndReached: js.UndefOr[(js.Function1[/* info */ DistanceFromEnd, Unit]) | Null] = js.undefined
    
    /**
      * How far from the end (in units of visible length of the list) the trailing edge of the
      * list must be from the end of the content to trigger the `onEndReached` callback.
      * Thus, a value of 0.5 will trigger `onEndReached` when the end of the content is
      * within half the visible length of the list.
      */
    var onEndReachedThreshold: js.UndefOr[Double | Null] = js.undefined
    
    var onLayout: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LayoutChangeEvent */ /* event */ Any, 
          Unit
        ]
      ] = js.undefined
    
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
      * Called once when the scroll position gets within within `onStartReachedThreshold`
      * from the logical start of the list.
      */
    var onStartReached: js.UndefOr[(js.Function1[/* info */ DistanceFromStart, Unit]) | Null] = js.undefined
    
    /**
      * How far from the start (in units of visible length of the list) the leading edge of the
      * list must be from the start of the content to trigger the `onStartReached` callback.
      * Thus, a value of 0.5 will trigger `onStartReached` when the start of the content is
      * within half the visible length of the list.
      */
    var onStartReachedThreshold: js.UndefOr[Double | Null] = js.undefined
    
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
      * Note: may have bugs (missing content) in some circumstances - use at your own risk.
      *
      * This may improve scroll performance for large lists.
      */
    var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Render a custom scroll component, e.g. with a differently styled `RefreshControl`.
      */
    var renderScrollComponent: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScrollViewProps */ /* props */ Any, 
          ReactElement
        ]
      ] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VirtualizedListWithoutRenderItemProps[?], ItemT] (val x: Self & VirtualizedListWithoutRenderItemProps[ItemT]) extends AnyVal {
      
      inline def setCellRendererComponent(value: ComponentType[CellRendererProps[ItemT]]): Self = StObject.set(x, "CellRendererComponent", value.asInstanceOf[js.Any])
      
      inline def setCellRendererComponentNull: Self = StObject.set(x, "CellRendererComponent", null)
      
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
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalNull: Self = StObject.set(x, "horizontal", null)
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setInitialNumToRender(value: Double): Self = StObject.set(x, "initialNumToRender", value.asInstanceOf[js.Any])
      
      inline def setInitialNumToRenderUndefined: Self = StObject.set(x, "initialNumToRender", js.undefined)
      
      inline def setInitialScrollIndex(value: Double): Self = StObject.set(x, "initialScrollIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialScrollIndexNull: Self = StObject.set(x, "initialScrollIndex", null)
      
      inline def setInitialScrollIndexUndefined: Self = StObject.set(x, "initialScrollIndex", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedNull: Self = StObject.set(x, "inverted", null)
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setItemSeparatorComponent(value: ComponentType[Any]): Self = StObject.set(x, "ItemSeparatorComponent", value.asInstanceOf[js.Any])
      
      inline def setItemSeparatorComponentNull: Self = StObject.set(x, "ItemSeparatorComponent", null)
      
      inline def setItemSeparatorComponentUndefined: Self = StObject.set(x, "ItemSeparatorComponent", js.undefined)
      
      inline def setKeyExtractor(value: (/* item */ ItemT, /* index */ Double) => String): Self = StObject.set(x, "keyExtractor", js.Any.fromFunction2(value))
      
      inline def setKeyExtractorUndefined: Self = StObject.set(x, "keyExtractor", js.undefined)
      
      inline def setListEmptyComponent(value: ComponentType[Any] | ReactElement): Self = StObject.set(x, "ListEmptyComponent", value.asInstanceOf[js.Any])
      
      inline def setListEmptyComponentNull: Self = StObject.set(x, "ListEmptyComponent", null)
      
      inline def setListEmptyComponentUndefined: Self = StObject.set(x, "ListEmptyComponent", js.undefined)
      
      inline def setListFooterComponent(value: ComponentType[Any] | ReactElement): Self = StObject.set(x, "ListFooterComponent", value.asInstanceOf[js.Any])
      
      inline def setListFooterComponentNull: Self = StObject.set(x, "ListFooterComponent", null)
      
      inline def setListFooterComponentStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StyleProp<ViewStyle> */ Any
      ): Self = StObject.set(x, "ListFooterComponentStyle", value.asInstanceOf[js.Any])
      
      inline def setListFooterComponentStyleUndefined: Self = StObject.set(x, "ListFooterComponentStyle", js.undefined)
      
      inline def setListFooterComponentUndefined: Self = StObject.set(x, "ListFooterComponent", js.undefined)
      
      inline def setListHeaderComponent(value: ComponentType[Any] | ReactElement): Self = StObject.set(x, "ListHeaderComponent", value.asInstanceOf[js.Any])
      
      inline def setListHeaderComponentNull: Self = StObject.set(x, "ListHeaderComponent", null)
      
      inline def setListHeaderComponentStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StyleProp<ViewStyle> */ Any
      ): Self = StObject.set(x, "ListHeaderComponentStyle", value.asInstanceOf[js.Any])
      
      inline def setListHeaderComponentStyleUndefined: Self = StObject.set(x, "ListHeaderComponentStyle", js.undefined)
      
      inline def setListHeaderComponentUndefined: Self = StObject.set(x, "ListHeaderComponent", js.undefined)
      
      inline def setMaxToRenderPerBatch(value: Double): Self = StObject.set(x, "maxToRenderPerBatch", value.asInstanceOf[js.Any])
      
      inline def setMaxToRenderPerBatchUndefined: Self = StObject.set(x, "maxToRenderPerBatch", js.undefined)
      
      inline def setOnEndReached(value: /* info */ DistanceFromEnd => Unit): Self = StObject.set(x, "onEndReached", js.Any.fromFunction1(value))
      
      inline def setOnEndReachedNull: Self = StObject.set(x, "onEndReached", null)
      
      inline def setOnEndReachedThreshold(value: Double): Self = StObject.set(x, "onEndReachedThreshold", value.asInstanceOf[js.Any])
      
      inline def setOnEndReachedThresholdNull: Self = StObject.set(x, "onEndReachedThreshold", null)
      
      inline def setOnEndReachedThresholdUndefined: Self = StObject.set(x, "onEndReachedThreshold", js.undefined)
      
      inline def setOnEndReachedUndefined: Self = StObject.set(x, "onEndReached", js.undefined)
      
      inline def setOnLayout(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LayoutChangeEvent */ /* event */ Any => Unit
      ): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      inline def setOnRefresh(value: () => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
      
      inline def setOnRefreshNull: Self = StObject.set(x, "onRefresh", null)
      
      inline def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
      
      inline def setOnScrollToIndexFailed(value: /* info */ AverageItemLength => Unit): Self = StObject.set(x, "onScrollToIndexFailed", js.Any.fromFunction1(value))
      
      inline def setOnScrollToIndexFailedUndefined: Self = StObject.set(x, "onScrollToIndexFailed", js.undefined)
      
      inline def setOnStartReached(value: /* info */ DistanceFromStart => Unit): Self = StObject.set(x, "onStartReached", js.Any.fromFunction1(value))
      
      inline def setOnStartReachedNull: Self = StObject.set(x, "onStartReached", null)
      
      inline def setOnStartReachedThreshold(value: Double): Self = StObject.set(x, "onStartReachedThreshold", value.asInstanceOf[js.Any])
      
      inline def setOnStartReachedThresholdNull: Self = StObject.set(x, "onStartReachedThreshold", null)
      
      inline def setOnStartReachedThresholdUndefined: Self = StObject.set(x, "onStartReachedThreshold", js.undefined)
      
      inline def setOnStartReachedUndefined: Self = StObject.set(x, "onStartReached", js.undefined)
      
      inline def setOnViewableItemsChanged(value: /* info */ Changed => Unit): Self = StObject.set(x, "onViewableItemsChanged", js.Any.fromFunction1(value))
      
      inline def setOnViewableItemsChangedNull: Self = StObject.set(x, "onViewableItemsChanged", null)
      
      inline def setOnViewableItemsChangedUndefined: Self = StObject.set(x, "onViewableItemsChanged", js.undefined)
      
      inline def setProgressViewOffset(value: Double): Self = StObject.set(x, "progressViewOffset", value.asInstanceOf[js.Any])
      
      inline def setProgressViewOffsetUndefined: Self = StObject.set(x, "progressViewOffset", js.undefined)
      
      inline def setRefreshing(value: Boolean): Self = StObject.set(x, "refreshing", value.asInstanceOf[js.Any])
      
      inline def setRefreshingNull: Self = StObject.set(x, "refreshing", null)
      
      inline def setRefreshingUndefined: Self = StObject.set(x, "refreshing", js.undefined)
      
      inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
      
      inline def setRenderScrollComponent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScrollViewProps */ /* props */ Any => ReactElement
      ): Self = StObject.set(x, "renderScrollComponent", js.Any.fromFunction1(value))
      
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
}
