package typings.slickgrid.Slick

import typings.slickgrid.Slick.Data.Aggregators.Aggregator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Data {
  
  object Aggregators {
    
    @js.native
    trait Aggregator[T /* <: SlickData */] extends StObject {
      
      def accumulate(item: T): Unit = js.native
      
      var field: String = js.native
      
      def init(): Unit = js.native
      
      def storeResult(groupTotals: GroupTotals[T]): Unit = js.native
    }
    object Aggregator {
      
      @scala.inline
      def apply[T /* <: SlickData */](accumulate: T => Unit, field: String, init: () => Unit, storeResult: GroupTotals[T] => Unit): Aggregator[T] = {
        val __obj = js.Dynamic.literal(accumulate = js.Any.fromFunction1(accumulate), field = field.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), storeResult = js.Any.fromFunction1(storeResult))
        __obj.asInstanceOf[Aggregator[T]]
      }
      
      @scala.inline
      implicit class AggregatorMutableBuilder[Self <: Aggregator[_], T /* <: SlickData */] (val x: Self with Aggregator[T]) extends AnyVal {
        
        @scala.inline
        def setAccumulate(value: T => Unit): Self = StObject.set(x, "accumulate", js.Any.fromFunction1(value))
        
        @scala.inline
        def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
        
        @scala.inline
        def setStoreResult(value: GroupTotals[T] => Unit): Self = StObject.set(x, "storeResult", js.Any.fromFunction1(value))
      }
    }
    
    type Avg[T] = Aggregator[T]
    
    type Max[T] = Aggregator[T]
    
    type Min[T] = Aggregator[T]
    
    type Sum[T] = Aggregator[T]
  }
  
  @js.native
  trait DataView[T /* <: SlickData */] extends DataProvider[T] {
    
    def addItem(item: T): Unit = js.native
    
    def beginUpdate(): Unit = js.native
    
    /**
      * @param level Optional level to collapse.  If not specified, applies to all levels.
      **/
    def collapseAllGroups(): Unit = js.native
    def collapseAllGroups(level: Double): Unit = js.native
    
    /**
      * @param varArgs Either a Slick.Group's "groupingKey" property, or a
      *     variable argument list of grouping values denoting a unique path to the row.  For
      *     example, calling collapseGroup('high', '10%') will collapse the '10%' subgroup of
      *     the 'high' setGrouping.
      */
    def collapseGroup(varArgs: String*): Unit = js.native
    
    def deleteItem(id: String): Unit = js.native
    
    def endUpdate(): Unit = js.native
    
    /**
      * @param level Optional level to collapse.  If not specified, applies to all levels.
      **/
    def expandAllGroups(): Unit = js.native
    def expandAllGroups(level: Double): Unit = js.native
    
    /**
      * @param varArgs Either a Slick.Group's "groupingKey" property, or a
      *     variable argument list of grouping values denoting a unique path to the row.  For
      *     example, calling expandGroup('high', '10%') will expand the '10%' subgroup of
      *     the 'high' setGrouping.
      */
    def expandGroup(varArgs: String*): Unit = js.native
    
    // todo: typeof(comparer), should be the same callback as Array.sort
    def fastSort(field: String, ascending: Boolean): Unit = js.native
    def fastSort(field: js.Function, ascending: Boolean): Unit = js.native
    
    def getGrouping(): js.Array[GroupingOptions[T]] = js.native
    
    def getGroups(): js.Array[Group[T]] = js.native
    
    def getIdxById(id: String): Double = js.native
    
    def getItemById(id: js.Any): T = js.native
    
    def getItemByIdx(idx: Double): T = js.native
    
    @JSName("getItemMetadata")
    def getItemMetadata_MDataView(index: Double): RowMetadata[T] = js.native
    
    def getItems(): js.Array[T] = js.native
    
    def getPagingInfo(): PagingOptions = js.native
    
    def getRowById(id: String): Double = js.native
    
    /**
      * @deprecated
      **/
    def groupBy(valueGetter: js.Any, valueFormatter: js.Any, sortComparer: js.Any): Unit = js.native
    
    def insertItem(insertBefore: Double, item: T): Unit = js.native
    
    def mapRowsToIds(rowArray: js.Array[Double]): js.Array[String] = js.native
    
    var onPagingInfoChanged: Event[OnPagingInfoChangedEventData] = js.native
    
    var onRowCountChanged: Event[OnRowCountChangedEventData] = js.native
    
    var onRowsChanged: Event[OnRowsChangedEventData] = js.native
    
    // todo: typeof(field), should be the same callback as Array.sort
    def reSort(): Unit = js.native
    
    def refresh(): Unit = js.native
    
    /**
      * @deprecated
      **/
    def setAggregators(groupAggregators: js.Any, includeCollapsed: js.Any): Unit = js.native
    
    def setFilter(filterFn: js.Function2[/* item */ T, /* args */ js.Any, Boolean]): Unit = js.native
    
    def setFilterArgs(args: js.Any): Unit = js.native
    
    def setGrouping(groupingInfos: js.Array[GroupingOptions[T]]): Unit = js.native
    def setGrouping(groupingInfos: GroupingOptions[T]): Unit = js.native
    
    def setItems(data: js.Array[T]): Unit = js.native
    def setItems(data: js.Array[T], objectIdProperty: String): Unit = js.native
    
    def setPagingOptions(args: PagingOptions): Unit = js.native
    
    def setRefreshHints(hints: RefreshHints): Unit = js.native
    
    // todo: typeof(args)
    def sort(comparer: js.Function, ascending: Boolean): Unit = js.native
    
    def syncGridCellCssStyles(grid: Grid[T], key: String): Unit = js.native
    
    def syncGridSelection(grid: Grid[T], preserveHidden: Boolean): Unit = js.native
    
    def updateItem(id: String, item: T): Unit = js.native
  }
  
  @js.native
  trait DataViewOptions[T /* <: SlickData */] extends StObject {
    
    var groupItemMetadataProvider: js.UndefOr[GroupItemMetadataProvider[T]] = js.native
    
    var inlineFilters: js.UndefOr[Boolean] = js.native
  }
  object DataViewOptions {
    
    @scala.inline
    def apply[T /* <: SlickData */](): DataViewOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataViewOptions[T]]
    }
    
    @scala.inline
    implicit class DataViewOptionsMutableBuilder[Self <: DataViewOptions[_], T /* <: SlickData */] (val x: Self with DataViewOptions[T]) extends AnyVal {
      
      @scala.inline
      def setGroupItemMetadataProvider(value: GroupItemMetadataProvider[T]): Self = StObject.set(x, "groupItemMetadataProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupItemMetadataProviderUndefined: Self = StObject.set(x, "groupItemMetadataProvider", js.undefined)
      
      @scala.inline
      def setInlineFilters(value: Boolean): Self = StObject.set(x, "inlineFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineFiltersUndefined: Self = StObject.set(x, "inlineFilters", js.undefined)
    }
  }
  
  @js.native
  trait GroupItemMetadataProvider[T /* <: SlickData */] extends StObject {
    
    def destroy(): Unit = js.native
    
    def getGroupRowMetadata(): RowMetadata[T] = js.native
    def getGroupRowMetadata(item: Group[T]): RowMetadata[T] = js.native
    
    def getTotalsRowMetadata(): RowMetadata[T] = js.native
    def getTotalsRowMetadata(item: GroupTotals[T]): RowMetadata[T] = js.native
    
    def init(): Unit = js.native
  }
  
  @js.native
  trait GroupItemMetadataProviderOptions extends StObject {
    
    var enableExpandCollapse: js.UndefOr[Boolean] = js.native
    
    var groupCssClass: js.UndefOr[String] = js.native
    
    var groupFocusable: js.UndefOr[Boolean] = js.native
    
    var groupTitleCssClass: js.UndefOr[String] = js.native
    
    var toggleCollapsedCssClass: js.UndefOr[String] = js.native
    
    var toggleCssClass: js.UndefOr[String] = js.native
    
    var toggleExpandedCssCass: js.UndefOr[String] = js.native
    
    var totalsCssClass: js.UndefOr[String] = js.native
    
    var totalsFocusable: js.UndefOr[Boolean] = js.native
  }
  object GroupItemMetadataProviderOptions {
    
    @scala.inline
    def apply(): GroupItemMetadataProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupItemMetadataProviderOptions]
    }
    
    @scala.inline
    implicit class GroupItemMetadataProviderOptionsMutableBuilder[Self <: GroupItemMetadataProviderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableExpandCollapse(value: Boolean): Self = StObject.set(x, "enableExpandCollapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableExpandCollapseUndefined: Self = StObject.set(x, "enableExpandCollapse", js.undefined)
      
      @scala.inline
      def setGroupCssClass(value: String): Self = StObject.set(x, "groupCssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupCssClassUndefined: Self = StObject.set(x, "groupCssClass", js.undefined)
      
      @scala.inline
      def setGroupFocusable(value: Boolean): Self = StObject.set(x, "groupFocusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupFocusableUndefined: Self = StObject.set(x, "groupFocusable", js.undefined)
      
      @scala.inline
      def setGroupTitleCssClass(value: String): Self = StObject.set(x, "groupTitleCssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupTitleCssClassUndefined: Self = StObject.set(x, "groupTitleCssClass", js.undefined)
      
      @scala.inline
      def setToggleCollapsedCssClass(value: String): Self = StObject.set(x, "toggleCollapsedCssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleCollapsedCssClassUndefined: Self = StObject.set(x, "toggleCollapsedCssClass", js.undefined)
      
      @scala.inline
      def setToggleCssClass(value: String): Self = StObject.set(x, "toggleCssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleCssClassUndefined: Self = StObject.set(x, "toggleCssClass", js.undefined)
      
      @scala.inline
      def setToggleExpandedCssCass(value: String): Self = StObject.set(x, "toggleExpandedCssCass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleExpandedCssCassUndefined: Self = StObject.set(x, "toggleExpandedCssCass", js.undefined)
      
      @scala.inline
      def setTotalsCssClass(value: String): Self = StObject.set(x, "totalsCssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalsCssClassUndefined: Self = StObject.set(x, "totalsCssClass", js.undefined)
      
      @scala.inline
      def setTotalsFocusable(value: Boolean): Self = StObject.set(x, "totalsFocusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalsFocusableUndefined: Self = StObject.set(x, "totalsFocusable", js.undefined)
    }
  }
  
  @js.native
  trait GroupingOptions[T] extends StObject {
    
    var aggregateChildGroups: js.UndefOr[Boolean] = js.native
    
    var aggregateCollapsed: js.UndefOr[Boolean] = js.native
    
    var aggregateEmpty: js.UndefOr[Boolean] = js.native
    
    // todo
    var aggregators: js.UndefOr[js.Array[Aggregator[T]]] = js.native
    
    var collapsed: js.UndefOr[Boolean] = js.native
    
    var comparer: js.UndefOr[js.Function2[/* a */ Group[T], /* b */ Group[T], Double]] = js.native
    
    var displayTotalsRow: js.UndefOr[Boolean] = js.native
    
    var formatter: js.UndefOr[js.Function1[/* item */ js.UndefOr[T], String]] = js.native
    
    var getter: js.UndefOr[(js.Function1[/* item */ js.UndefOr[T], _]) | String] = js.native
    
    var predefinedValues: js.UndefOr[js.Array[_]] = js.native
  }
  object GroupingOptions {
    
    @scala.inline
    def apply[T](): GroupingOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupingOptions[T]]
    }
    
    @scala.inline
    implicit class GroupingOptionsMutableBuilder[Self <: GroupingOptions[_], T] (val x: Self with GroupingOptions[T]) extends AnyVal {
      
      @scala.inline
      def setAggregateChildGroups(value: Boolean): Self = StObject.set(x, "aggregateChildGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggregateChildGroupsUndefined: Self = StObject.set(x, "aggregateChildGroups", js.undefined)
      
      @scala.inline
      def setAggregateCollapsed(value: Boolean): Self = StObject.set(x, "aggregateCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggregateCollapsedUndefined: Self = StObject.set(x, "aggregateCollapsed", js.undefined)
      
      @scala.inline
      def setAggregateEmpty(value: Boolean): Self = StObject.set(x, "aggregateEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggregateEmptyUndefined: Self = StObject.set(x, "aggregateEmpty", js.undefined)
      
      @scala.inline
      def setAggregators(value: js.Array[Aggregator[T]]): Self = StObject.set(x, "aggregators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggregatorsUndefined: Self = StObject.set(x, "aggregators", js.undefined)
      
      @scala.inline
      def setAggregatorsVarargs(value: Aggregator[T]*): Self = StObject.set(x, "aggregators", js.Array(value :_*))
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setComparer(value: (/* a */ Group[T], /* b */ Group[T]) => Double): Self = StObject.set(x, "comparer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setComparerUndefined: Self = StObject.set(x, "comparer", js.undefined)
      
      @scala.inline
      def setDisplayTotalsRow(value: Boolean): Self = StObject.set(x, "displayTotalsRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayTotalsRowUndefined: Self = StObject.set(x, "displayTotalsRow", js.undefined)
      
      @scala.inline
      def setFormatter(value: /* item */ js.UndefOr[T] => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setGetter(value: (js.Function1[/* item */ js.UndefOr[T], _]) | String): Self = StObject.set(x, "getter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetterFunction1(value: /* item */ js.UndefOr[T] => _): Self = StObject.set(x, "getter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetterUndefined: Self = StObject.set(x, "getter", js.undefined)
      
      @scala.inline
      def setPredefinedValues(value: js.Array[_]): Self = StObject.set(x, "predefinedValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredefinedValuesUndefined: Self = StObject.set(x, "predefinedValues", js.undefined)
      
      @scala.inline
      def setPredefinedValuesVarargs(value: js.Any*): Self = StObject.set(x, "predefinedValues", js.Array(value :_*))
    }
  }
  
  type OnPagingInfoChangedEventData = PagingOptions
  
  @js.native
  trait OnRowCountChangedEventData extends StObject
  
  @js.native
  trait OnRowsChangedEventData extends StObject {
    
    var rows: js.Array[Double] = js.native
  }
  object OnRowsChangedEventData {
    
    @scala.inline
    def apply(rows: js.Array[Double]): OnRowsChangedEventData = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnRowsChangedEventData]
    }
    
    @scala.inline
    implicit class OnRowsChangedEventDataMutableBuilder[Self <: OnRowsChangedEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRows(value: js.Array[Double]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsVarargs(value: Double*): Self = StObject.set(x, "rows", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PagingOptions extends StObject {
    
    var pageNum: js.UndefOr[Double] = js.native
    
    var pageSize: js.UndefOr[Double] = js.native
    
    var totalPages: js.UndefOr[Double] = js.native
    
    var totalRows: js.UndefOr[Double] = js.native
  }
  object PagingOptions {
    
    @scala.inline
    def apply(): PagingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagingOptions]
    }
    
    @scala.inline
    implicit class PagingOptionsMutableBuilder[Self <: PagingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPageNum(value: Double): Self = StObject.set(x, "pageNum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageNumUndefined: Self = StObject.set(x, "pageNum", js.undefined)
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
      
      @scala.inline
      def setTotalRows(value: Double): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalRowsUndefined: Self = StObject.set(x, "totalRows", js.undefined)
    }
  }
  
  @js.native
  trait RefreshHints extends StObject {
    
    var ignoreDiffsAfter: js.UndefOr[Boolean] = js.native
    
    var ignoreDiffsBefore: js.UndefOr[Boolean] = js.native
    
    var isFilterExpanding: js.UndefOr[Boolean] = js.native
    
    var isFilterNarrowing: js.UndefOr[Boolean] = js.native
    
    var isFilterUnchanged: js.UndefOr[Boolean] = js.native
  }
  object RefreshHints {
    
    @scala.inline
    def apply(): RefreshHints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshHints]
    }
    
    @scala.inline
    implicit class RefreshHintsMutableBuilder[Self <: RefreshHints] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreDiffsAfter(value: Boolean): Self = StObject.set(x, "ignoreDiffsAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDiffsAfterUndefined: Self = StObject.set(x, "ignoreDiffsAfter", js.undefined)
      
      @scala.inline
      def setIgnoreDiffsBefore(value: Boolean): Self = StObject.set(x, "ignoreDiffsBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDiffsBeforeUndefined: Self = StObject.set(x, "ignoreDiffsBefore", js.undefined)
      
      @scala.inline
      def setIsFilterExpanding(value: Boolean): Self = StObject.set(x, "isFilterExpanding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFilterExpandingUndefined: Self = StObject.set(x, "isFilterExpanding", js.undefined)
      
      @scala.inline
      def setIsFilterNarrowing(value: Boolean): Self = StObject.set(x, "isFilterNarrowing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFilterNarrowingUndefined: Self = StObject.set(x, "isFilterNarrowing", js.undefined)
      
      @scala.inline
      def setIsFilterUnchanged(value: Boolean): Self = StObject.set(x, "isFilterUnchanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFilterUnchangedUndefined: Self = StObject.set(x, "isFilterUnchanged", js.undefined)
    }
  }
}
