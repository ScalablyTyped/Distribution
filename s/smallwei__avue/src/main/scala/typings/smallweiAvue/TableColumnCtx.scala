package typings.smallweiAvue

import typings.smallweiAvue.anon.TextValue
import typings.smallweiAvue.smallweiAvueStrings.ascending
import typings.smallweiAvue.smallweiAvueStrings.descending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableColumnCtx[T] extends StObject {
  
  var align: String
  
  var children: js.Array[TableColumnCtx[T]]
  
  var className: String
  
  var colSpan: Double
  
  var columnKey: String
  
  var columns: js.Array[TableColumnCtx[T]]
  
  def filterMethod(value: Any, row: T, column: TableColumnCtx[T]): Unit
  @JSName("filterMethod")
  var filterMethod_Original: FilterMethods[T]
  
  var filterMultiple: Boolean
  
  var filterOpened: js.UndefOr[Boolean] = js.undefined
  
  var filterPlacement: String
  
  var filterable: Boolean | FilterMethods[T] | Filters
  
  var filteredValue: js.Array[String]
  
  var filters: Filters
  
  var fixed: Boolean | String
  
  def formatter(row: T, column: TableColumnCtx[T], cellValue: Any, index: Double): VNode | String
  
  def getColumnIndex(): Double
  
  var headerAlign: String
  
  var id: String
  
  var index: Double | (js.Function1[/* index */ Double, Double])
  
  var isColumnGroup: Boolean
  
  var isSubColumn: Boolean
  
  var label: String
  
  var labelClassName: String
  
  var level: Double
  
  var minWidth: String | Double
  
  var no: Double
  
  var order: String
  
  var prop: String
  
  var property: String
  
  var rawColumnKey: String
  
  var realWidth: Double
  
  def renderCell(data: Any): Unit
  
  def renderHeader(data: CI[T]): VNode
  
  var reserveSelection: Boolean
  
  var resizable: Boolean
  
  var rowSpan: Double
  
  def selectable(row: T, index: Double): Boolean
  
  var showOverflowTooltip: Boolean
  
  var showTooltipWhenOverflow: Boolean
  
  var sortBy: String | (js.Function2[/* row */ T, /* index */ Double, String]) | js.Array[String]
  
  def sortMethod(a: T, b: T): Double
  
  var sortOrders: js.Array[ascending | descending | Null]
  
  var sortable: Boolean | String
  
  var `type`: String
  
  var width: String | Double
}
object TableColumnCtx {
  
  inline def apply[T](
    align: String,
    children: js.Array[TableColumnCtx[T]],
    className: String,
    colSpan: Double,
    columnKey: String,
    columns: js.Array[TableColumnCtx[T]],
    filterMethod: (/* value */ Any, T, /* column */ TableColumnCtx[T]) => Unit,
    filterMultiple: Boolean,
    filterPlacement: String,
    filterable: Boolean | FilterMethods[T] | Filters,
    filteredValue: js.Array[String],
    filters: Filters,
    fixed: Boolean | String,
    formatter: (T, TableColumnCtx[T], Any, Double) => VNode | String,
    getColumnIndex: () => Double,
    headerAlign: String,
    id: String,
    index: Double | (js.Function1[/* index */ Double, Double]),
    isColumnGroup: Boolean,
    isSubColumn: Boolean,
    label: String,
    labelClassName: String,
    level: Double,
    minWidth: String | Double,
    no: Double,
    order: String,
    prop: String,
    property: String,
    rawColumnKey: String,
    realWidth: Double,
    renderCell: Any => Unit,
    renderHeader: CI[T] => VNode,
    reserveSelection: Boolean,
    resizable: Boolean,
    rowSpan: Double,
    selectable: (T, Double) => Boolean,
    showOverflowTooltip: Boolean,
    showTooltipWhenOverflow: Boolean,
    sortBy: String | (js.Function2[/* row */ T, /* index */ Double, String]) | js.Array[String],
    sortMethod: (T, T) => Double,
    sortOrders: js.Array[ascending | descending | Null],
    sortable: Boolean | String,
    `type`: String,
    width: String | Double
  ): TableColumnCtx[T] = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], colSpan = colSpan.asInstanceOf[js.Any], columnKey = columnKey.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], filterMethod = js.Any.fromFunction3(filterMethod), filterMultiple = filterMultiple.asInstanceOf[js.Any], filterPlacement = filterPlacement.asInstanceOf[js.Any], filterable = filterable.asInstanceOf[js.Any], filteredValue = filteredValue.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], formatter = js.Any.fromFunction4(formatter), getColumnIndex = js.Any.fromFunction0(getColumnIndex), headerAlign = headerAlign.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isColumnGroup = isColumnGroup.asInstanceOf[js.Any], isSubColumn = isSubColumn.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelClassName = labelClassName.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], no = no.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], rawColumnKey = rawColumnKey.asInstanceOf[js.Any], realWidth = realWidth.asInstanceOf[js.Any], renderCell = js.Any.fromFunction1(renderCell), renderHeader = js.Any.fromFunction1(renderHeader), reserveSelection = reserveSelection.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any], rowSpan = rowSpan.asInstanceOf[js.Any], selectable = js.Any.fromFunction2(selectable), showOverflowTooltip = showOverflowTooltip.asInstanceOf[js.Any], showTooltipWhenOverflow = showTooltipWhenOverflow.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any], sortMethod = js.Any.fromFunction2(sortMethod), sortOrders = sortOrders.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumnCtx[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableColumnCtx[?], T] (val x: Self & TableColumnCtx[T]) extends AnyVal {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: js.Array[TableColumnCtx[T]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: TableColumnCtx[T]*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumns(value: js.Array[TableColumnCtx[T]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: TableColumnCtx[T]*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setFilterMethod(value: (/* value */ Any, T, /* column */ TableColumnCtx[T]) => Unit): Self = StObject.set(x, "filterMethod", js.Any.fromFunction3(value))
    
    inline def setFilterMultiple(value: Boolean): Self = StObject.set(x, "filterMultiple", value.asInstanceOf[js.Any])
    
    inline def setFilterOpened(value: Boolean): Self = StObject.set(x, "filterOpened", value.asInstanceOf[js.Any])
    
    inline def setFilterOpenedUndefined: Self = StObject.set(x, "filterOpened", js.undefined)
    
    inline def setFilterPlacement(value: String): Self = StObject.set(x, "filterPlacement", value.asInstanceOf[js.Any])
    
    inline def setFilterable(value: Boolean | FilterMethods[T] | Filters): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    inline def setFilterableFunction3(value: (/* value */ Any, T, /* column */ TableColumnCtx[T]) => Unit): Self = StObject.set(x, "filterable", js.Any.fromFunction3(value))
    
    inline def setFilterableVarargs(value: TextValue*): Self = StObject.set(x, "filterable", js.Array(value*))
    
    inline def setFilteredValue(value: js.Array[String]): Self = StObject.set(x, "filteredValue", value.asInstanceOf[js.Any])
    
    inline def setFilteredValueVarargs(value: String*): Self = StObject.set(x, "filteredValue", js.Array(value*))
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: TextValue*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setFixed(value: Boolean | String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFormatter(value: (T, TableColumnCtx[T], Any, Double) => VNode | String): Self = StObject.set(x, "formatter", js.Any.fromFunction4(value))
    
    inline def setGetColumnIndex(value: () => Double): Self = StObject.set(x, "getColumnIndex", js.Any.fromFunction0(value))
    
    inline def setHeaderAlign(value: String): Self = StObject.set(x, "headerAlign", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double | (js.Function1[/* index */ Double, Double])): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexFunction1(value: /* index */ Double => Double): Self = StObject.set(x, "index", js.Any.fromFunction1(value))
    
    inline def setIsColumnGroup(value: Boolean): Self = StObject.set(x, "isColumnGroup", value.asInstanceOf[js.Any])
    
    inline def setIsSubColumn(value: Boolean): Self = StObject.set(x, "isSubColumn", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelClassName(value: String): Self = StObject.set(x, "labelClassName", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setMinWidth(value: String | Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setNo(value: Double): Self = StObject.set(x, "no", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setRawColumnKey(value: String): Self = StObject.set(x, "rawColumnKey", value.asInstanceOf[js.Any])
    
    inline def setRealWidth(value: Double): Self = StObject.set(x, "realWidth", value.asInstanceOf[js.Any])
    
    inline def setRenderCell(value: Any => Unit): Self = StObject.set(x, "renderCell", js.Any.fromFunction1(value))
    
    inline def setRenderHeader(value: CI[T] => VNode): Self = StObject.set(x, "renderHeader", js.Any.fromFunction1(value))
    
    inline def setReserveSelection(value: Boolean): Self = StObject.set(x, "reserveSelection", value.asInstanceOf[js.Any])
    
    inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setSelectable(value: (T, Double) => Boolean): Self = StObject.set(x, "selectable", js.Any.fromFunction2(value))
    
    inline def setShowOverflowTooltip(value: Boolean): Self = StObject.set(x, "showOverflowTooltip", value.asInstanceOf[js.Any])
    
    inline def setShowTooltipWhenOverflow(value: Boolean): Self = StObject.set(x, "showTooltipWhenOverflow", value.asInstanceOf[js.Any])
    
    inline def setSortBy(value: String | (js.Function2[/* row */ T, /* index */ Double, String]) | js.Array[String]): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByFunction2(value: (/* row */ T, /* index */ Double) => String): Self = StObject.set(x, "sortBy", js.Any.fromFunction2(value))
    
    inline def setSortByVarargs(value: String*): Self = StObject.set(x, "sortBy", js.Array(value*))
    
    inline def setSortMethod(value: (T, T) => Double): Self = StObject.set(x, "sortMethod", js.Any.fromFunction2(value))
    
    inline def setSortOrders(value: js.Array[ascending | descending | Null]): Self = StObject.set(x, "sortOrders", value.asInstanceOf[js.Any])
    
    inline def setSortOrdersVarargs(value: (ascending | descending | Null)*): Self = StObject.set(x, "sortOrders", js.Array(value*))
    
    inline def setSortable(value: Boolean | String): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
