package typings.reactVirtualized.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.Requireable
import typings.react.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.reactVirtualized.esTableMod.Column
import typings.reactVirtualized.esTableMod.HeaderMouseEventHandlerParams
import typings.reactVirtualized.esTableMod.RowMouseEventHandlerParams
import typings.reactVirtualized.esTableMod.SortDirectionType
import typings.reactVirtualized.esTableMod.TableHeaderRowRenderer
import typings.reactVirtualized.esTableMod.TableRowProps
import typings.reactVirtualized.mod.IndexRange
import typings.reactVirtualized.mod.OverscanIndexRange
import typings.reactVirtualized.mod.ScrollEventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassName extends StObject {
  
  var `aria-label`: Requireable[String] = js.native
  
  var autoHeight: Requireable[Boolean] = js.native
  
  var children: Validator[Column] = js.native
  
  var className: Requireable[String] = js.native
  
  var disableHeader: Requireable[Boolean] = js.native
  
  var estimatedRowSize: Validator[Double] = js.native
  
  var gridClassName: Requireable[String] = js.native
  
  var gridStyle: Requireable[CSSProperties] = js.native
  
  var headerClassName: Requireable[String] = js.native
  
  var headerHeight: Validator[Double] = js.native
  
  var headerRowRenderer: Requireable[TableHeaderRowRenderer] = js.native
  
  var headerStyle: Requireable[CSSProperties] = js.native
  
  var height: Validator[Double] = js.native
  
  var id: Requireable[String] = js.native
  
  var noRowsRenderer: Requireable[js.Function0[Element]] = js.native
  
  var onHeaderClick: Requireable[js.Function1[/* params */ HeaderMouseEventHandlerParams, Unit]] = js.native
  
  var onRowClick: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  
  var onRowDoubleClick: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  
  var onRowMouseOut: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  
  var onRowMouseOver: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  
  var onRowsRendered: Requireable[js.Function1[/* params */ IndexRange with OverscanIndexRange, Unit]] = js.native
  
  var onScroll: Requireable[js.Function1[/* params */ ScrollEventData, Unit]] = js.native
  
  var overscanRowCount: Validator[Double] = js.native
  
  var rowClassName: Requireable[String | (js.Function1[/* params */ typings.reactVirtualized.mod.Index, String])] = js.native
  
  var rowCount: Validator[Double] = js.native
  
  var rowGetter: Validator[js.Function1[/* params */ typings.reactVirtualized.mod.Index, _]] = js.native
  
  var rowHeight: Validator[Double | (js.Function1[/* params */ typings.reactVirtualized.mod.Index, Double])] = js.native
  
  var rowRenderer: Requireable[js.Function1[/* props */ TableRowProps, ReactNode]] = js.native
  
  var rowStyle: Validator[
    CSSProperties | (js.Function1[/* params */ typings.reactVirtualized.mod.Index, CSSProperties])
  ] = js.native
  
  var scrollToAlignment: Validator[typings.reactVirtualized.mod.Alignment] = js.native
  
  var scrollToIndex: Validator[Double] = js.native
  
  var scrollTop: Requireable[Double] = js.native
  
  var sort: Requireable[js.Function1[/* params */ SortBy, Unit]] = js.native
  
  var sortBy: Requireable[String] = js.native
  
  var sortDirection: Validator[SortDirectionType] = js.native
  
  var style: Requireable[CSSProperties] = js.native
  
  var tabIndex: Requireable[Double] = js.native
  
  var width: Validator[Double] = js.native
}
object ClassName {
  
  @scala.inline
  def apply(
    `aria-label`: Requireable[String],
    autoHeight: Requireable[Boolean],
    children: Validator[Column],
    className: Requireable[String],
    disableHeader: Requireable[Boolean],
    estimatedRowSize: Validator[Double],
    gridClassName: Requireable[String],
    gridStyle: Requireable[CSSProperties],
    headerClassName: Requireable[String],
    headerHeight: Validator[Double],
    headerRowRenderer: Requireable[TableHeaderRowRenderer],
    headerStyle: Requireable[CSSProperties],
    height: Validator[Double],
    id: Requireable[String],
    noRowsRenderer: Requireable[js.Function0[Element]],
    onHeaderClick: Requireable[js.Function1[/* params */ HeaderMouseEventHandlerParams, Unit]],
    onRowClick: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]],
    onRowDoubleClick: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]],
    onRowMouseOut: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]],
    onRowMouseOver: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]],
    onRowsRendered: Requireable[js.Function1[/* params */ IndexRange with OverscanIndexRange, Unit]],
    onScroll: Requireable[js.Function1[/* params */ ScrollEventData, Unit]],
    overscanRowCount: Validator[Double],
    rowClassName: Requireable[String | (js.Function1[/* params */ typings.reactVirtualized.mod.Index, String])],
    rowCount: Validator[Double],
    rowGetter: Validator[js.Function1[/* params */ typings.reactVirtualized.mod.Index, _]],
    rowHeight: Validator[Double | (js.Function1[/* params */ typings.reactVirtualized.mod.Index, Double])],
    rowRenderer: Requireable[js.Function1[/* props */ TableRowProps, ReactNode]],
    rowStyle: Validator[
      CSSProperties | (js.Function1[/* params */ typings.reactVirtualized.mod.Index, CSSProperties])
    ],
    scrollToAlignment: Validator[typings.reactVirtualized.mod.Alignment],
    scrollToIndex: Validator[Double],
    scrollTop: Requireable[Double],
    sort: Requireable[js.Function1[/* params */ SortBy, Unit]],
    sortBy: Requireable[String],
    sortDirection: Validator[SortDirectionType],
    style: Requireable[CSSProperties],
    tabIndex: Requireable[Double],
    width: Validator[Double]
  ): ClassName = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disableHeader = disableHeader.asInstanceOf[js.Any], estimatedRowSize = estimatedRowSize.asInstanceOf[js.Any], gridClassName = gridClassName.asInstanceOf[js.Any], gridStyle = gridStyle.asInstanceOf[js.Any], headerClassName = headerClassName.asInstanceOf[js.Any], headerHeight = headerHeight.asInstanceOf[js.Any], headerRowRenderer = headerRowRenderer.asInstanceOf[js.Any], headerStyle = headerStyle.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], noRowsRenderer = noRowsRenderer.asInstanceOf[js.Any], onHeaderClick = onHeaderClick.asInstanceOf[js.Any], onRowClick = onRowClick.asInstanceOf[js.Any], onRowDoubleClick = onRowDoubleClick.asInstanceOf[js.Any], onRowMouseOut = onRowMouseOut.asInstanceOf[js.Any], onRowMouseOver = onRowMouseOver.asInstanceOf[js.Any], onRowsRendered = onRowsRendered.asInstanceOf[js.Any], onScroll = onScroll.asInstanceOf[js.Any], overscanRowCount = overscanRowCount.asInstanceOf[js.Any], rowClassName = rowClassName.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowGetter = rowGetter.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowRenderer = rowRenderer.asInstanceOf[js.Any], rowStyle = rowStyle.asInstanceOf[js.Any], scrollToAlignment = scrollToAlignment.asInstanceOf[js.Any], scrollToIndex = scrollToIndex.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any], sortDirection = sortDirection.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  
  @scala.inline
  implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAria-label`(value: Requireable[String]): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHeight(value: Requireable[Boolean]): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: Validator[Column]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: Requireable[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableHeader(value: Requireable[Boolean]): Self = StObject.set(x, "disableHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedRowSize(value: Validator[Double]): Self = StObject.set(x, "estimatedRowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridClassName(value: Requireable[String]): Self = StObject.set(x, "gridClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridStyle(value: Requireable[CSSProperties]): Self = StObject.set(x, "gridStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderClassName(value: Requireable[String]): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderHeight(value: Validator[Double]): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRowRenderer(value: Requireable[TableHeaderRowRenderer]): Self = StObject.set(x, "headerRowRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderStyle(value: Requireable[CSSProperties]): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Validator[Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Requireable[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoRowsRenderer(value: Requireable[js.Function0[Element]]): Self = StObject.set(x, "noRowsRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHeaderClick(value: Requireable[js.Function1[/* params */ HeaderMouseEventHandlerParams, Unit]]): Self = StObject.set(x, "onHeaderClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRowClick(value: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]]): Self = StObject.set(x, "onRowClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRowDoubleClick(value: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]]): Self = StObject.set(x, "onRowDoubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRowMouseOut(value: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]]): Self = StObject.set(x, "onRowMouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRowMouseOver(value: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]]): Self = StObject.set(x, "onRowMouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRowsRendered(value: Requireable[js.Function1[/* params */ IndexRange with OverscanIndexRange, Unit]]): Self = StObject.set(x, "onRowsRendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScroll(value: Requireable[js.Function1[/* params */ ScrollEventData, Unit]]): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscanRowCount(value: Validator[Double]): Self = StObject.set(x, "overscanRowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowClassName(
      value: Requireable[String | (js.Function1[/* params */ typings.reactVirtualized.mod.Index, String])]
    ): Self = StObject.set(x, "rowClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCount(value: Validator[Double]): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowGetter(value: Validator[js.Function1[/* params */ typings.reactVirtualized.mod.Index, _]]): Self = StObject.set(x, "rowGetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeight(value: Validator[Double | (js.Function1[/* params */ typings.reactVirtualized.mod.Index, Double])]): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowRenderer(value: Requireable[js.Function1[/* props */ TableRowProps, ReactNode]]): Self = StObject.set(x, "rowRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowStyle(
      value: Validator[
          CSSProperties | (js.Function1[/* params */ typings.reactVirtualized.mod.Index, CSSProperties])
        ]
    ): Self = StObject.set(x, "rowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToAlignment(value: Validator[typings.reactVirtualized.mod.Alignment]): Self = StObject.set(x, "scrollToAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToIndex(value: Validator[Double]): Self = StObject.set(x, "scrollToIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Requireable[Double]): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort(value: Requireable[js.Function1[/* params */ SortBy, Unit]]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortBy(value: Requireable[String]): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDirection(value: Validator[SortDirectionType]): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Requireable[CSSProperties]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndex(value: Requireable[Double]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Validator[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
