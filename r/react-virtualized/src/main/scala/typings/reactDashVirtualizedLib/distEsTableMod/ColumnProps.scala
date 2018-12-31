package typings
package reactDashVirtualizedLib.distEsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnProps extends js.Object {
  /** Optional aria-label value to set on the column header */
  var `aria-label`: js.UndefOr[java.lang.String] = js.undefined
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
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Optional additional data passed to this column's :cellDataGetter */
  var columnData: js.UndefOr[js.Any] = js.undefined
  /** Uniquely identifies the row-data attribute correspnding to this cell */
  var dataKey: js.Any
  /** Default sort order when clicked for the first time. Valid options include "ASC" and "DESC". Defaults to "ASC" */
  var defaultSortDirection: js.UndefOr[SortDirectionType] = js.undefined
  /** If sort is enabled for the table at large, disable it for this column */
  var disableSort: js.UndefOr[scala.Boolean] = js.undefined
  /** Flex grow style; defaults to 0 */
  var flexGrow: js.UndefOr[scala.Double] = js.undefined
  /** Flex shrink style; defaults to 1 */
  var flexShrink: js.UndefOr[scala.Double] = js.undefined
  /** Optional CSS class to apply to this column's header */
  var headerClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional callback responsible for rendering a column header contents.
    * ({ columnData: object, dataKey: string, disableSort: boolean, label: string, sortBy: string, sortDirection: string }): PropTypes.node
    */
  var headerRenderer: js.UndefOr[TableHeaderRenderer] = js.undefined
  /** Optional inline style to apply to this column's header */
  var headerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /** Optional id to set on the column header; used for aria-describedby */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Header label for this column */
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Maximum width of column; this property will only be used if :flexGrow is > 0. */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /** Minimum width of column. */
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /** Optional inline style to apply to cell */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /** Flex basis (width) for this column; This value can grow or shrink based on :flexGrow and :flexShrink properties. */
  var width: scala.Double
}

