package typings.reactVirtualized.esTableMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnProps extends StObject {
  
  /** Optional aria-label value to set on the column header */
  var `aria-label`: js.UndefOr[String] = js.native
  
  /**
    * Callback responsible for returning a cell's data, given its :dataKey
    * ({ columnData: any, dataKey: string, rowData: any }): any
    */
  var cellDataGetter: js.UndefOr[TableCellDataGetter] = js.native
  
  /**
    * Callback responsible for rendering a cell's contents.
    * ({ cellData: any, columnData: any, dataKey: string, rowData: any, rowIndex: number }): node
    */
  var cellRenderer: js.UndefOr[TableCellRenderer] = js.native
  
  /** Optional CSS class to apply to cell */
  var className: js.UndefOr[String] = js.native
  
  /** Optional additional data passed to this column's :cellDataGetter */
  var columnData: js.UndefOr[js.Any] = js.native
  
  /** Uniquely identifies the row-data attribute correspnding to this cell */
  var dataKey: js.Any = js.native
  
  /** Default sort order when clicked for the first time. Valid options include "ASC" and "DESC". Defaults to "ASC" */
  var defaultSortDirection: js.UndefOr[SortDirectionType] = js.native
  
  /** If sort is enabled for the table at large, disable it for this column */
  var disableSort: js.UndefOr[Boolean] = js.native
  
  /** Flex grow style; defaults to 0 */
  var flexGrow: js.UndefOr[Double] = js.native
  
  /** Flex shrink style; defaults to 1 */
  var flexShrink: js.UndefOr[Double] = js.native
  
  /** Optional CSS class to apply to this column's header */
  var headerClassName: js.UndefOr[String] = js.native
  
  /**
    * Optional callback responsible for rendering a column header contents.
    * ({ columnData: object, dataKey: string, disableSort: boolean, label: string, sortBy: string, sortDirection: string }): PropTypes.node
    */
  var headerRenderer: js.UndefOr[TableHeaderRenderer] = js.native
  
  /** Optional inline style to apply to this column's header */
  var headerStyle: js.UndefOr[CSSProperties] = js.native
  
  /** Optional id to set on the column header; used for aria-describedby */
  var id: js.UndefOr[String] = js.native
  
  /** Header label for this column */
  var label: js.UndefOr[ReactNode] = js.native
  
  /** Maximum width of column; this property will only be used if :flexGrow is > 0. */
  var maxWidth: js.UndefOr[Double] = js.native
  
  /** Minimum width of column. */
  var minWidth: js.UndefOr[Double] = js.native
  
  /** Optional inline style to apply to cell */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /** Flex basis (width) for this column; This value can grow or shrink based on :flexGrow and :flexShrink properties. */
  var width: Double = js.native
}
object ColumnProps {
  
  @scala.inline
  def apply(dataKey: js.Any, width: Double): ColumnProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnProps]
  }
  
  @scala.inline
  implicit class ColumnPropsMutableBuilder[Self <: ColumnProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    @scala.inline
    def setCellDataGetter(value: /* params */ TableCellDataGetterParams => js.Any): Self = StObject.set(x, "cellDataGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCellDataGetterUndefined: Self = StObject.set(x, "cellDataGetter", js.undefined)
    
    @scala.inline
    def setCellRenderer(value: /* props */ TableCellProps => ReactNode): Self = StObject.set(x, "cellRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCellRendererUndefined: Self = StObject.set(x, "cellRenderer", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColumnData(value: js.Any): Self = StObject.set(x, "columnData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnDataUndefined: Self = StObject.set(x, "columnData", js.undefined)
    
    @scala.inline
    def setDataKey(value: js.Any): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSortDirection(value: SortDirectionType): Self = StObject.set(x, "defaultSortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSortDirectionUndefined: Self = StObject.set(x, "defaultSortDirection", js.undefined)
    
    @scala.inline
    def setDisableSort(value: Boolean): Self = StObject.set(x, "disableSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSortUndefined: Self = StObject.set(x, "disableSort", js.undefined)
    
    @scala.inline
    def setFlexGrow(value: Double): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
    
    @scala.inline
    def setFlexShrink(value: Double): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
    
    @scala.inline
    def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
    
    @scala.inline
    def setHeaderRenderer(value: /* props */ TableHeaderProps => ReactNode): Self = StObject.set(x, "headerRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderRendererUndefined: Self = StObject.set(x, "headerRenderer", js.undefined)
    
    @scala.inline
    def setHeaderStyle(value: CSSProperties): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
