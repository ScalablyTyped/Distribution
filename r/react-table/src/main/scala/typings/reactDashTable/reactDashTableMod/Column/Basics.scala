package typings.reactDashTable.reactDashTableMod.Column

import typings.reactDashTable.reactDashTableMod.PivotRenderer
import typings.reactDashTable.reactDashTableMod.SortFunction
import typings.reactDashTable.reactDashTableMod.TableCellRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Basic column props */
trait Basics extends js.Object {
  /** Used to render aggregated cells. Defaults to a comma separated list of values. */
  var Aggregated: TableCellRenderer
  /** Used to render the expander in both Pivot and Expander cells */
  var Expander: TableCellRenderer
  /** Used to render a pivoted cell  */
  var Pivot: PivotRenderer
  /**  Used to render the value inside of a Pivot cell */
  var PivotValue: TableCellRenderer
  /** Default: false */
  var defaultSortDesc: js.UndefOr[Boolean] = js.undefined
  /** Default: undefined, use table default */
  var filterable: js.UndefOr[Boolean] = js.undefined
  /** Default: 100 */
  var minWidth: Double
  /** Default: undefined, use table default */
  var resizable: js.UndefOr[Boolean] = js.undefined
  /** Default: true */
  var show: Boolean
  /** Default: ... */
  var sortMethod: js.UndefOr[SortFunction] = js.undefined
  /** Default: undefined, use table default */
  var sortable: js.UndefOr[Boolean] = js.undefined
}

object Basics {
  @scala.inline
  def apply(
    minWidth: Double,
    show: Boolean,
    Aggregated: TableCellRenderer = null,
    Expander: TableCellRenderer = null,
    Pivot: PivotRenderer = null,
    PivotValue: TableCellRenderer = null,
    defaultSortDesc: js.UndefOr[Boolean] = js.undefined,
    filterable: js.UndefOr[Boolean] = js.undefined,
    resizable: js.UndefOr[Boolean] = js.undefined,
    sortMethod: (/* a */ js.Any, /* b */ js.Any, /* desc */ js.Any) => Double = null,
    sortable: js.UndefOr[Boolean] = js.undefined
  ): Basics = {
    val __obj = js.Dynamic.literal(minWidth = minWidth, show = show)
    if (Aggregated != null) __obj.updateDynamic("Aggregated")(Aggregated.asInstanceOf[js.Any])
    if (Expander != null) __obj.updateDynamic("Expander")(Expander.asInstanceOf[js.Any])
    if (Pivot != null) __obj.updateDynamic("Pivot")(Pivot.asInstanceOf[js.Any])
    if (PivotValue != null) __obj.updateDynamic("PivotValue")(PivotValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultSortDesc)) __obj.updateDynamic("defaultSortDesc")(defaultSortDesc)
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (sortMethod != null) __obj.updateDynamic("sortMethod")(js.Any.fromFunction3(sortMethod))
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    __obj.asInstanceOf[Basics]
  }
}

