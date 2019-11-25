package typings.reactDashTable.reactDashTableMod

import typings.react.reactMod.ReactElement
import typings.reactDashTable.Anon_Column
import typings.reactDashTable.reactDashTableMod.Column.Basics
import typings.reactDashTable.reactDashTableMod.Column.CellProps
import typings.reactDashTable.reactDashTableMod.Column.FilterProps
import typings.reactDashTable.reactDashTableMod.Column.FooterProps
import typings.reactDashTable.reactDashTableMod.Column.HeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalColumn
  extends Basics
     with CellProps
     with FilterProps
     with FooterProps
     with HeaderProps

object GlobalColumn {
  @scala.inline
  def apply(
    Filter: /* params */ Anon_Column => ReactElement,
    className: String,
    filterAll: Boolean,
    filterMethod: (/* filter */ Filter, (/* row */ js.Any) | (/* rows */ js.Array[js.Any]), /* column */ js.Any) => js.Array[js.Any] | Boolean,
    footerClassName: String,
    footerStyle: js.Object,
    getFooterProps: /* value */ js.UndefOr[js.Any] => Unit,
    getHeaderProps: /* value */ js.UndefOr[js.Any] => Unit,
    getProps: /* value */ js.UndefOr[js.Any] => Unit,
    headerClassName: String,
    headerStyle: js.Object,
    hideFilter: Boolean,
    minWidth: Double,
    show: Boolean,
    style: js.Object,
    Aggregated: TableCellRenderer = null,
    Cell: TableCellRenderer = null,
    Expander: TableCellRenderer = null,
    Footer: TableCellRenderer = null,
    Header: TableCellRenderer = null,
    Pivot: PivotRenderer = null,
    PivotValue: TableCellRenderer = null,
    defaultSortDesc: js.UndefOr[Boolean] = js.undefined,
    filterable: js.UndefOr[Boolean] = js.undefined,
    resizable: js.UndefOr[Boolean] = js.undefined,
    sortMethod: (/* a */ js.Any, /* b */ js.Any, /* desc */ js.Any) => Double = null,
    sortable: js.UndefOr[Boolean] = js.undefined
  ): GlobalColumn = {
    val __obj = js.Dynamic.literal(Filter = js.Any.fromFunction1(Filter), className = className.asInstanceOf[js.Any], filterAll = filterAll.asInstanceOf[js.Any], filterMethod = js.Any.fromFunction3(filterMethod), footerClassName = footerClassName.asInstanceOf[js.Any], footerStyle = footerStyle.asInstanceOf[js.Any], getFooterProps = js.Any.fromFunction1(getFooterProps), getHeaderProps = js.Any.fromFunction1(getHeaderProps), getProps = js.Any.fromFunction1(getProps), headerClassName = headerClassName.asInstanceOf[js.Any], headerStyle = headerStyle.asInstanceOf[js.Any], hideFilter = hideFilter.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    if (Aggregated != null) __obj.updateDynamic("Aggregated")(Aggregated.asInstanceOf[js.Any])
    if (Cell != null) __obj.updateDynamic("Cell")(Cell.asInstanceOf[js.Any])
    if (Expander != null) __obj.updateDynamic("Expander")(Expander.asInstanceOf[js.Any])
    if (Footer != null) __obj.updateDynamic("Footer")(Footer.asInstanceOf[js.Any])
    if (Header != null) __obj.updateDynamic("Header")(Header.asInstanceOf[js.Any])
    if (Pivot != null) __obj.updateDynamic("Pivot")(Pivot.asInstanceOf[js.Any])
    if (PivotValue != null) __obj.updateDynamic("PivotValue")(PivotValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultSortDesc)) __obj.updateDynamic("defaultSortDesc")(defaultSortDesc.asInstanceOf[js.Any])
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (sortMethod != null) __obj.updateDynamic("sortMethod")(js.Any.fromFunction3(sortMethod))
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalColumn]
  }
}

