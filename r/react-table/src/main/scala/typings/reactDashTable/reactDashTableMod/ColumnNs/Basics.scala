package typings.reactDashTable.reactDashTableMod.ColumnNs

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
    Aggregated: TableCellRenderer,
    Expander: TableCellRenderer,
    Pivot: PivotRenderer,
    PivotValue: TableCellRenderer,
    minWidth: Double,
    show: Boolean,
    defaultSortDesc: js.UndefOr[Boolean] = js.undefined,
    filterable: js.UndefOr[Boolean] = js.undefined,
    resizable: js.UndefOr[Boolean] = js.undefined,
    sortMethod: SortFunction = null,
    sortable: js.UndefOr[Boolean] = js.undefined
  ): Basics = {
    val __obj = js.Dynamic.literal(Aggregated = Aggregated.asInstanceOf[js.Any], Expander = Expander.asInstanceOf[js.Any], Pivot = Pivot.asInstanceOf[js.Any], PivotValue = PivotValue.asInstanceOf[js.Any], minWidth = minWidth, show = show)
    if (!js.isUndefined(defaultSortDesc)) __obj.updateDynamic("defaultSortDesc")(defaultSortDesc)
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (sortMethod != null) __obj.updateDynamic("sortMethod")(sortMethod)
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    __obj.asInstanceOf[Basics]
  }
}

