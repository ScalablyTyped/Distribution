package typings
package reactDashTableLib.reactDashTableMod.ColumnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Basic column props */
trait Basics extends js.Object {
  /** Used to render aggregated cells. Defaults to a comma separated list of values. */
  var Aggregated: reactDashTableLib.reactDashTableMod.TableCellRenderer
  /** Used to render the expander in both Pivot and Expander cells */
  var Expander: reactDashTableLib.reactDashTableMod.TableCellRenderer
  /** Used to render a pivoted cell  */
  var Pivot: reactDashTableLib.reactDashTableMod.PivotRenderer
  /**  Used to render the value inside of a Pivot cell */
  var PivotValue: reactDashTableLib.reactDashTableMod.TableCellRenderer
  /** Default: false */
  var defaultSortDesc: js.UndefOr[scala.Boolean]
  /** Default: undefined, use table default */
  var filterable: js.UndefOr[scala.Boolean]
  /** Default: 100 */
  var minWidth: scala.Double
  /** Default: undefined, use table default */
  var resizable: js.UndefOr[scala.Boolean]
  /** Default: true */
  var show: scala.Boolean
  /** Default: ... */
  var sortMethod: js.UndefOr[reactDashTableLib.reactDashTableMod.SortFunction]
  /** Default: undefined, use table default */
  var sortable: js.UndefOr[scala.Boolean]
}

object Basics {
  @scala.inline
  def apply(
    Aggregated: reactDashTableLib.reactDashTableMod.TableCellRenderer,
    Expander: reactDashTableLib.reactDashTableMod.TableCellRenderer,
    Pivot: reactDashTableLib.reactDashTableMod.PivotRenderer,
    PivotValue: reactDashTableLib.reactDashTableMod.TableCellRenderer,
    minWidth: scala.Double,
    show: scala.Boolean,
    defaultSortDesc: js.UndefOr[scala.Boolean] = js.undefined,
    filterable: js.UndefOr[scala.Boolean] = js.undefined,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    sortMethod: reactDashTableLib.reactDashTableMod.SortFunction = null,
    sortable: js.UndefOr[scala.Boolean] = js.undefined
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

