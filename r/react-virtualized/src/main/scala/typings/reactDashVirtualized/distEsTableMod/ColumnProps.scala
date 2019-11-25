package typings.reactDashVirtualized.distEsTableMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnProps extends js.Object {
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
  var columnData: js.UndefOr[js.Any] = js.undefined
  /** Uniquely identifies the row-data attribute correspnding to this cell */
  var dataKey: js.Any
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
  @scala.inline
  def apply(
    dataKey: js.Any,
    width: Double,
    `aria-label`: String = null,
    cellDataGetter: /* params */ TableCellDataGetterParams => js.Any = null,
    cellRenderer: /* props */ TableCellProps => ReactNode = null,
    className: String = null,
    columnData: js.Any = null,
    defaultSortDirection: SortDirectionType = null,
    disableSort: js.UndefOr[Boolean] = js.undefined,
    flexGrow: Int | Double = null,
    flexShrink: Int | Double = null,
    headerClassName: String = null,
    headerRenderer: /* props */ TableHeaderProps => ReactNode = null,
    headerStyle: CSSProperties = null,
    id: String = null,
    label: ReactNode = null,
    maxWidth: Int | Double = null,
    minWidth: Int | Double = null,
    style: CSSProperties = null
  ): ColumnProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (cellDataGetter != null) __obj.updateDynamic("cellDataGetter")(js.Any.fromFunction1(cellDataGetter))
    if (cellRenderer != null) __obj.updateDynamic("cellRenderer")(js.Any.fromFunction1(cellRenderer))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnData != null) __obj.updateDynamic("columnData")(columnData.asInstanceOf[js.Any])
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSort)) __obj.updateDynamic("disableSort")(disableSort.asInstanceOf[js.Any])
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName.asInstanceOf[js.Any])
    if (headerRenderer != null) __obj.updateDynamic("headerRenderer")(js.Any.fromFunction1(headerRenderer))
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnProps]
  }
}

