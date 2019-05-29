package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalColumn[D]
  extends reactDashTableLib.reactDashTableMod.ColumnNs.Basics[D]
     with reactDashTableLib.reactDashTableMod.ColumnNs.CellProps[D]
     with reactDashTableLib.reactDashTableMod.ColumnNs.FilterProps[D]
     with reactDashTableLib.reactDashTableMod.ColumnNs.FooterProps[D]
     with reactDashTableLib.reactDashTableMod.ColumnNs.HeaderProps[D]

object GlobalColumn {
  @scala.inline
  def apply[D](
    Aggregated: TableCellRenderer[D],
    Cell: TableCellRenderer[D],
    Expander: TableCellRenderer[D],
    Filter: FilterRender[D],
    Footer: TableCellRenderer[D],
    Header: TableCellRenderer[D],
    Pivot: PivotRenderer[D],
    PivotValue: TableCellRenderer[D],
    className: java.lang.String,
    filterAll: scala.Boolean,
    filterMethod: FilterFunction | DefaultFilterFunction,
    footerClassName: java.lang.String,
    footerStyle: js.Object,
    getFooterProps: ReactTableFunction,
    getHeaderProps: ReactTableFunction,
    getProps: ReactTableFunction,
    headerClassName: java.lang.String,
    headerStyle: js.Object,
    hideFilter: scala.Boolean,
    minWidth: scala.Double,
    show: scala.Boolean,
    style: js.Object,
    defaultSortDesc: js.UndefOr[scala.Boolean] = js.undefined,
    filterable: js.UndefOr[scala.Boolean] = js.undefined,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    sortMethod: SortFunction = null,
    sortable: js.UndefOr[scala.Boolean] = js.undefined
  ): GlobalColumn[D] = {
    val __obj = js.Dynamic.literal(Aggregated = Aggregated.asInstanceOf[js.Any], Cell = Cell.asInstanceOf[js.Any], Expander = Expander.asInstanceOf[js.Any], Filter = Filter, Footer = Footer.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], Pivot = Pivot.asInstanceOf[js.Any], PivotValue = PivotValue.asInstanceOf[js.Any], className = className, filterAll = filterAll, filterMethod = filterMethod.asInstanceOf[js.Any], footerClassName = footerClassName, footerStyle = footerStyle, getFooterProps = getFooterProps, getHeaderProps = getHeaderProps, getProps = getProps, headerClassName = headerClassName, headerStyle = headerStyle, hideFilter = hideFilter, minWidth = minWidth, show = show, style = style)
    if (!js.isUndefined(defaultSortDesc)) __obj.updateDynamic("defaultSortDesc")(defaultSortDesc)
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (sortMethod != null) __obj.updateDynamic("sortMethod")(sortMethod)
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    __obj.asInstanceOf[GlobalColumn[D]]
  }
}

