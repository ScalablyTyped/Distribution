package typings.reactVirtualized.esTableMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnProps extends js.Object {
  
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
  implicit class ColumnPropsOps[Self <: ColumnProps] (val x: Self) extends AnyVal {
    
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
    def setDataKey(value: js.Any): Self = this.set("dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    
    @scala.inline
    def setCellDataGetter(value: /* params */ TableCellDataGetterParams => js.Any): Self = this.set("cellDataGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellDataGetter: Self = this.set("cellDataGetter", js.undefined)
    
    @scala.inline
    def setCellRenderer(value: /* props */ TableCellProps => ReactNode): Self = this.set("cellRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellRenderer: Self = this.set("cellRenderer", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColumnData(value: js.Any): Self = this.set("columnData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnData: Self = this.set("columnData", js.undefined)
    
    @scala.inline
    def setDefaultSortDirection(value: SortDirectionType): Self = this.set("defaultSortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSortDirection: Self = this.set("defaultSortDirection", js.undefined)
    
    @scala.inline
    def setDisableSort(value: Boolean): Self = this.set("disableSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSort: Self = this.set("disableSort", js.undefined)
    
    @scala.inline
    def setFlexGrow(value: Double): Self = this.set("flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexGrow: Self = this.set("flexGrow", js.undefined)
    
    @scala.inline
    def setFlexShrink(value: Double): Self = this.set("flexShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexShrink: Self = this.set("flexShrink", js.undefined)
    
    @scala.inline
    def setHeaderClassName(value: String): Self = this.set("headerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderClassName: Self = this.set("headerClassName", js.undefined)
    
    @scala.inline
    def setHeaderRenderer(value: /* props */ TableHeaderProps => ReactNode): Self = this.set("headerRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHeaderRenderer: Self = this.set("headerRenderer", js.undefined)
    
    @scala.inline
    def setHeaderStyle(value: CSSProperties): Self = this.set("headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderStyle: Self = this.set("headerStyle", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
