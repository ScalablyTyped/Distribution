package typings.slickgrid.Slick

import typings.slickgrid.Slick.Data.Aggregators.Aggregator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Data {
  
  object Aggregators {
    
    trait Aggregator[T /* <: SlickData */] extends StObject {
      
      def accumulate(item: T): Unit
      
      var field: String
      
      def init(): Unit
      
      def storeResult(groupTotals: GroupTotals[T]): Unit
    }
    object Aggregator {
      
      inline def apply[T /* <: SlickData */](accumulate: T => Unit, field: String, init: () => Unit, storeResult: GroupTotals[T] => Unit): Aggregator[T] = {
        val __obj = js.Dynamic.literal(accumulate = js.Any.fromFunction1(accumulate), field = field.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), storeResult = js.Any.fromFunction1(storeResult))
        __obj.asInstanceOf[Aggregator[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Aggregator[?], T /* <: SlickData */] (val x: Self & Aggregator[T]) extends AnyVal {
        
        inline def setAccumulate(value: T => Unit): Self = StObject.set(x, "accumulate", js.Any.fromFunction1(value))
        
        inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
        
        inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
        
        inline def setStoreResult(value: GroupTotals[T] => Unit): Self = StObject.set(x, "storeResult", js.Any.fromFunction1(value))
      }
    }
    
    type Avg[T /* <: SlickData */] = Aggregator[T]
    
    type Max[T /* <: SlickData */] = Aggregator[T]
    
    type Min[T /* <: SlickData */] = Aggregator[T]
    
    type Sum[T /* <: SlickData */] = Aggregator[T]
  }
  
  @js.native
  trait DataView[T /* <: SlickData */]
    extends StObject
       with DataProvider[T] {
    
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
    
    def getItemById(id: Any): T = js.native
    
    def getItemByIdx(idx: Double): T = js.native
    
    @JSName("getItemMetadata")
    def getItemMetadata_MDataView(index: Double): RowMetadata[T] = js.native
    
    def getItems(): js.Array[T] = js.native
    
    def getPagingInfo(): PagingOptions = js.native
    
    def getRowById(id: String): Double = js.native
    
    /**
      * @deprecated
      **/
    def groupBy(valueGetter: Any, valueFormatter: Any, sortComparer: Any): Unit = js.native
    
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
    def setAggregators(groupAggregators: Any, includeCollapsed: Any): Unit = js.native
    
    def setFilter(filterFn: js.Function2[/* item */ T, /* args */ Any, Boolean]): Unit = js.native
    
    def setFilterArgs(args: Any): Unit = js.native
    
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
  
  trait DataViewOptions[T /* <: SlickData */] extends StObject {
    
    var groupItemMetadataProvider: js.UndefOr[GroupItemMetadataProvider[T]] = js.undefined
    
    var inlineFilters: js.UndefOr[Boolean] = js.undefined
  }
  object DataViewOptions {
    
    inline def apply[T /* <: SlickData */](): DataViewOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataViewOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataViewOptions[?], T /* <: SlickData */] (val x: Self & DataViewOptions[T]) extends AnyVal {
      
      inline def setGroupItemMetadataProvider(value: GroupItemMetadataProvider[T]): Self = StObject.set(x, "groupItemMetadataProvider", value.asInstanceOf[js.Any])
      
      inline def setGroupItemMetadataProviderUndefined: Self = StObject.set(x, "groupItemMetadataProvider", js.undefined)
      
      inline def setInlineFilters(value: Boolean): Self = StObject.set(x, "inlineFilters", value.asInstanceOf[js.Any])
      
      inline def setInlineFiltersUndefined: Self = StObject.set(x, "inlineFilters", js.undefined)
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
  
  trait GroupItemMetadataProviderOptions extends StObject {
    
    var enableExpandCollapse: js.UndefOr[Boolean] = js.undefined
    
    var groupCssClass: js.UndefOr[String] = js.undefined
    
    var groupFocusable: js.UndefOr[Boolean] = js.undefined
    
    var groupTitleCssClass: js.UndefOr[String] = js.undefined
    
    var toggleCollapsedCssClass: js.UndefOr[String] = js.undefined
    
    var toggleCssClass: js.UndefOr[String] = js.undefined
    
    var toggleExpandedCssCass: js.UndefOr[String] = js.undefined
    
    var totalsCssClass: js.UndefOr[String] = js.undefined
    
    var totalsFocusable: js.UndefOr[Boolean] = js.undefined
  }
  object GroupItemMetadataProviderOptions {
    
    inline def apply(): GroupItemMetadataProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupItemMetadataProviderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupItemMetadataProviderOptions] (val x: Self) extends AnyVal {
      
      inline def setEnableExpandCollapse(value: Boolean): Self = StObject.set(x, "enableExpandCollapse", value.asInstanceOf[js.Any])
      
      inline def setEnableExpandCollapseUndefined: Self = StObject.set(x, "enableExpandCollapse", js.undefined)
      
      inline def setGroupCssClass(value: String): Self = StObject.set(x, "groupCssClass", value.asInstanceOf[js.Any])
      
      inline def setGroupCssClassUndefined: Self = StObject.set(x, "groupCssClass", js.undefined)
      
      inline def setGroupFocusable(value: Boolean): Self = StObject.set(x, "groupFocusable", value.asInstanceOf[js.Any])
      
      inline def setGroupFocusableUndefined: Self = StObject.set(x, "groupFocusable", js.undefined)
      
      inline def setGroupTitleCssClass(value: String): Self = StObject.set(x, "groupTitleCssClass", value.asInstanceOf[js.Any])
      
      inline def setGroupTitleCssClassUndefined: Self = StObject.set(x, "groupTitleCssClass", js.undefined)
      
      inline def setToggleCollapsedCssClass(value: String): Self = StObject.set(x, "toggleCollapsedCssClass", value.asInstanceOf[js.Any])
      
      inline def setToggleCollapsedCssClassUndefined: Self = StObject.set(x, "toggleCollapsedCssClass", js.undefined)
      
      inline def setToggleCssClass(value: String): Self = StObject.set(x, "toggleCssClass", value.asInstanceOf[js.Any])
      
      inline def setToggleCssClassUndefined: Self = StObject.set(x, "toggleCssClass", js.undefined)
      
      inline def setToggleExpandedCssCass(value: String): Self = StObject.set(x, "toggleExpandedCssCass", value.asInstanceOf[js.Any])
      
      inline def setToggleExpandedCssCassUndefined: Self = StObject.set(x, "toggleExpandedCssCass", js.undefined)
      
      inline def setTotalsCssClass(value: String): Self = StObject.set(x, "totalsCssClass", value.asInstanceOf[js.Any])
      
      inline def setTotalsCssClassUndefined: Self = StObject.set(x, "totalsCssClass", js.undefined)
      
      inline def setTotalsFocusable(value: Boolean): Self = StObject.set(x, "totalsFocusable", value.asInstanceOf[js.Any])
      
      inline def setTotalsFocusableUndefined: Self = StObject.set(x, "totalsFocusable", js.undefined)
    }
  }
  
  trait GroupingOptions[T /* <: SlickData */] extends StObject {
    
    var aggregateChildGroups: js.UndefOr[Boolean] = js.undefined
    
    var aggregateCollapsed: js.UndefOr[Boolean] = js.undefined
    
    var aggregateEmpty: js.UndefOr[Boolean] = js.undefined
    
    // todo
    var aggregators: js.UndefOr[js.Array[Aggregator[T]]] = js.undefined
    
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    var comparer: js.UndefOr[js.Function2[/* a */ Group[T], /* b */ Group[T], Double]] = js.undefined
    
    var displayTotalsRow: js.UndefOr[Boolean] = js.undefined
    
    var formatter: js.UndefOr[js.Function1[/* item */ js.UndefOr[T], String]] = js.undefined
    
    var getter: js.UndefOr[(js.Function1[/* item */ js.UndefOr[T], Any]) | String] = js.undefined
    
    var predefinedValues: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object GroupingOptions {
    
    inline def apply[T /* <: SlickData */](): GroupingOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupingOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupingOptions[?], T /* <: SlickData */] (val x: Self & GroupingOptions[T]) extends AnyVal {
      
      inline def setAggregateChildGroups(value: Boolean): Self = StObject.set(x, "aggregateChildGroups", value.asInstanceOf[js.Any])
      
      inline def setAggregateChildGroupsUndefined: Self = StObject.set(x, "aggregateChildGroups", js.undefined)
      
      inline def setAggregateCollapsed(value: Boolean): Self = StObject.set(x, "aggregateCollapsed", value.asInstanceOf[js.Any])
      
      inline def setAggregateCollapsedUndefined: Self = StObject.set(x, "aggregateCollapsed", js.undefined)
      
      inline def setAggregateEmpty(value: Boolean): Self = StObject.set(x, "aggregateEmpty", value.asInstanceOf[js.Any])
      
      inline def setAggregateEmptyUndefined: Self = StObject.set(x, "aggregateEmpty", js.undefined)
      
      inline def setAggregators(value: js.Array[Aggregator[T]]): Self = StObject.set(x, "aggregators", value.asInstanceOf[js.Any])
      
      inline def setAggregatorsUndefined: Self = StObject.set(x, "aggregators", js.undefined)
      
      inline def setAggregatorsVarargs(value: Aggregator[T]*): Self = StObject.set(x, "aggregators", js.Array(value*))
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setComparer(value: (/* a */ Group[T], /* b */ Group[T]) => Double): Self = StObject.set(x, "comparer", js.Any.fromFunction2(value))
      
      inline def setComparerUndefined: Self = StObject.set(x, "comparer", js.undefined)
      
      inline def setDisplayTotalsRow(value: Boolean): Self = StObject.set(x, "displayTotalsRow", value.asInstanceOf[js.Any])
      
      inline def setDisplayTotalsRowUndefined: Self = StObject.set(x, "displayTotalsRow", js.undefined)
      
      inline def setFormatter(value: /* item */ js.UndefOr[T] => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setGetter(value: (js.Function1[/* item */ js.UndefOr[T], Any]) | String): Self = StObject.set(x, "getter", value.asInstanceOf[js.Any])
      
      inline def setGetterFunction1(value: /* item */ js.UndefOr[T] => Any): Self = StObject.set(x, "getter", js.Any.fromFunction1(value))
      
      inline def setGetterUndefined: Self = StObject.set(x, "getter", js.undefined)
      
      inline def setPredefinedValues(value: js.Array[Any]): Self = StObject.set(x, "predefinedValues", value.asInstanceOf[js.Any])
      
      inline def setPredefinedValuesUndefined: Self = StObject.set(x, "predefinedValues", js.undefined)
      
      inline def setPredefinedValuesVarargs(value: Any*): Self = StObject.set(x, "predefinedValues", js.Array(value*))
    }
  }
  
  type OnPagingInfoChangedEventData = PagingOptions
  
  trait OnRowCountChangedEventData extends StObject
  
  trait OnRowsChangedEventData extends StObject {
    
    var rows: js.Array[Double]
  }
  object OnRowsChangedEventData {
    
    inline def apply(rows: js.Array[Double]): OnRowsChangedEventData = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnRowsChangedEventData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnRowsChangedEventData] (val x: Self) extends AnyVal {
      
      inline def setRows(value: js.Array[Double]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: Double*): Self = StObject.set(x, "rows", js.Array(value*))
    }
  }
  
  trait PagingOptions extends StObject {
    
    var pageNum: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var totalPages: js.UndefOr[Double] = js.undefined
    
    var totalRows: js.UndefOr[Double] = js.undefined
  }
  object PagingOptions {
    
    inline def apply(): PagingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PagingOptions] (val x: Self) extends AnyVal {
      
      inline def setPageNum(value: Double): Self = StObject.set(x, "pageNum", value.asInstanceOf[js.Any])
      
      inline def setPageNumUndefined: Self = StObject.set(x, "pageNum", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      inline def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
      
      inline def setTotalRows(value: Double): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
      
      inline def setTotalRowsUndefined: Self = StObject.set(x, "totalRows", js.undefined)
    }
  }
  
  trait RefreshHints extends StObject {
    
    var ignoreDiffsAfter: js.UndefOr[Boolean] = js.undefined
    
    var ignoreDiffsBefore: js.UndefOr[Boolean] = js.undefined
    
    var isFilterExpanding: js.UndefOr[Boolean] = js.undefined
    
    var isFilterNarrowing: js.UndefOr[Boolean] = js.undefined
    
    var isFilterUnchanged: js.UndefOr[Boolean] = js.undefined
  }
  object RefreshHints {
    
    inline def apply(): RefreshHints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshHints]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RefreshHints] (val x: Self) extends AnyVal {
      
      inline def setIgnoreDiffsAfter(value: Boolean): Self = StObject.set(x, "ignoreDiffsAfter", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDiffsAfterUndefined: Self = StObject.set(x, "ignoreDiffsAfter", js.undefined)
      
      inline def setIgnoreDiffsBefore(value: Boolean): Self = StObject.set(x, "ignoreDiffsBefore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDiffsBeforeUndefined: Self = StObject.set(x, "ignoreDiffsBefore", js.undefined)
      
      inline def setIsFilterExpanding(value: Boolean): Self = StObject.set(x, "isFilterExpanding", value.asInstanceOf[js.Any])
      
      inline def setIsFilterExpandingUndefined: Self = StObject.set(x, "isFilterExpanding", js.undefined)
      
      inline def setIsFilterNarrowing(value: Boolean): Self = StObject.set(x, "isFilterNarrowing", value.asInstanceOf[js.Any])
      
      inline def setIsFilterNarrowingUndefined: Self = StObject.set(x, "isFilterNarrowing", js.undefined)
      
      inline def setIsFilterUnchanged(value: Boolean): Self = StObject.set(x, "isFilterUnchanged", value.asInstanceOf[js.Any])
      
      inline def setIsFilterUnchangedUndefined: Self = StObject.set(x, "isFilterUnchanged", js.undefined)
    }
  }
}
