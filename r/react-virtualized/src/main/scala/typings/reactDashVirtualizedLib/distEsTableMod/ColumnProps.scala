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

object ColumnProps {
  @scala.inline
  def apply(
    dataKey: js.Any,
    width: scala.Double,
    `aria-label`: java.lang.String = null,
    cellDataGetter: TableCellDataGetter = null,
    cellRenderer: TableCellRenderer = null,
    className: java.lang.String = null,
    columnData: js.Any = null,
    defaultSortDirection: SortDirectionType = null,
    disableSort: js.UndefOr[scala.Boolean] = js.undefined,
    flexGrow: scala.Int | scala.Double = null,
    flexShrink: scala.Int | scala.Double = null,
    headerClassName: java.lang.String = null,
    headerRenderer: TableHeaderRenderer = null,
    headerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    id: java.lang.String = null,
    label: reactLib.reactMod.ReactNs.ReactNode = null,
    maxWidth: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): ColumnProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey, width = width)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (cellDataGetter != null) __obj.updateDynamic("cellDataGetter")(cellDataGetter)
    if (cellRenderer != null) __obj.updateDynamic("cellRenderer")(cellRenderer)
    if (className != null) __obj.updateDynamic("className")(className)
    if (columnData != null) __obj.updateDynamic("columnData")(columnData)
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection)
    if (!js.isUndefined(disableSort)) __obj.updateDynamic("disableSort")(disableSort)
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName)
    if (headerRenderer != null) __obj.updateDynamic("headerRenderer")(headerRenderer)
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ColumnProps]
  }
}

