package typings.reactVirtualized.esTableMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnProps extends StObject {
  
  /** Optional aria-label value to set on the column header */
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  /**
    * Callback responsible for returning a cell's data, given its :dataKey
    * ({ columnData: any, dataKey: string, rowData: any }): any
    */
  var cellDataGetter: js.UndefOr[TableCellDataGetter] = js.undefined
  
  /**
    * Callback responsible for rendering a cell's contents.
    * ({ cellData: any, columnData: any, dataKey: string, rowData: any, rowIndex: number }): node
    */
  var cellRenderer: js.UndefOr[TableCellRenderer] = js.undefined
  
  /** Optional CSS class to apply to cell */
  var className: js.UndefOr[String] = js.undefined
  
  /** Optional additional data passed to this column's :cellDataGetter */
  var columnData: js.UndefOr[Any] = js.undefined
  
  /** Uniquely identifies the row-data attribute correspnding to this cell */
  var dataKey: Any
  
  /** Default sort order when clicked for the first time. Valid options include "ASC" and "DESC". Defaults to "ASC" */
  var defaultSortDirection: js.UndefOr[SortDirectionType] = js.undefined
  
  /** If sort is enabled for the table at large, disable it for this column */
  var disableSort: js.UndefOr[Boolean] = js.undefined
  
  /** Flex grow style; defaults to 0 */
  var flexGrow: js.UndefOr[Double] = js.undefined
  
  /** Flex shrink style; defaults to 1 */
  var flexShrink: js.UndefOr[Double] = js.undefined
  
  /** Optional CSS class to apply to this column's header */
  var headerClassName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional callback responsible for rendering a column header contents.
    * ({ columnData: object, dataKey: string, disableSort: boolean, label: string, sortBy: string, sortDirection: string }): PropTypes.node
    */
  var headerRenderer: js.UndefOr[TableHeaderRenderer] = js.undefined
  
  /** Optional inline style to apply to this column's header */
  var headerStyle: js.UndefOr[CSSProperties] = js.undefined
  
  /** Optional id to set on the column header; used for aria-describedby */
  var id: js.UndefOr[String] = js.undefined
  
  /** Header label for this column */
  var label: js.UndefOr[ReactNode] = js.undefined
  
  /** Maximum width of column; this property will only be used if :flexGrow is > 0. */
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  /** Minimum width of column. */
  var minWidth: js.UndefOr[Double] = js.undefined
  
  /** Optional inline style to apply to cell */
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  /** Flex basis (width) for this column; This value can grow or shrink based on :flexGrow and :flexShrink properties. */
  var width: Double
}
object ColumnProps {
  
  inline def apply(dataKey: Any, width: Double): ColumnProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnProps]
  }
  
  extension [Self <: ColumnProps](x: Self) {
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def setCellDataGetter(value: /* params */ TableCellDataGetterParams => Any): Self = StObject.set(x, "cellDataGetter", js.Any.fromFunction1(value))
    
    inline def setCellDataGetterUndefined: Self = StObject.set(x, "cellDataGetter", js.undefined)
    
    inline def setCellRenderer(value: /* props */ TableCellProps => ReactNode): Self = StObject.set(x, "cellRenderer", js.Any.fromFunction1(value))
    
    inline def setCellRendererUndefined: Self = StObject.set(x, "cellRenderer", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColumnData(value: Any): Self = StObject.set(x, "columnData", value.asInstanceOf[js.Any])
    
    inline def setColumnDataUndefined: Self = StObject.set(x, "columnData", js.undefined)
    
    inline def setDataKey(value: Any): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultSortDirection(value: SortDirectionType): Self = StObject.set(x, "defaultSortDirection", value.asInstanceOf[js.Any])
    
    inline def setDefaultSortDirectionUndefined: Self = StObject.set(x, "defaultSortDirection", js.undefined)
    
    inline def setDisableSort(value: Boolean): Self = StObject.set(x, "disableSort", value.asInstanceOf[js.Any])
    
    inline def setDisableSortUndefined: Self = StObject.set(x, "disableSort", js.undefined)
    
    inline def setFlexGrow(value: Double): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
    
    inline def setFlexShrink(value: Double): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
    
    inline def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
    
    inline def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
    
    inline def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
    
    inline def setHeaderRenderer(value: /* props */ TableHeaderProps => ReactNode): Self = StObject.set(x, "headerRenderer", js.Any.fromFunction1(value))
    
    inline def setHeaderRendererUndefined: Self = StObject.set(x, "headerRenderer", js.undefined)
    
    inline def setHeaderStyle(value: CSSProperties): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
