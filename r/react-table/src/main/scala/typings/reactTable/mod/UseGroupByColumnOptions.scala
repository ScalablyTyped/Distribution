package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  aggregate  :react-table.react-table.Aggregator<D>,   Aggregated  :react-table.react-table.Renderer<react-table.react-table.CellProps<D>>,   disableGroupBy  :boolean,   defaultCanGroupBy  :boolean,   groupByBoundary  :boolean}> */
trait UseGroupByColumnOptions[D /* <: js.Object */] extends js.Object {
  var Aggregated: js.UndefOr[Renderer[CellProps[D]]] = js.undefined
  var aggregate: js.UndefOr[Aggregator[D]] = js.undefined
  var defaultCanGroupBy: js.UndefOr[Boolean] = js.undefined
  var disableGroupBy: js.UndefOr[Boolean] = js.undefined
  var groupByBoundary: js.UndefOr[Boolean] = js.undefined
}

object UseGroupByColumnOptions {
  @scala.inline
  def apply[D /* <: js.Object */](
    Aggregated: Renderer[CellProps[D]] = null,
    aggregate: Aggregator[D] = null,
    defaultCanGroupBy: js.UndefOr[Boolean] = js.undefined,
    disableGroupBy: js.UndefOr[Boolean] = js.undefined,
    groupByBoundary: js.UndefOr[Boolean] = js.undefined
  ): UseGroupByColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    if (Aggregated != null) __obj.updateDynamic("Aggregated")(Aggregated.asInstanceOf[js.Any])
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultCanGroupBy)) __obj.updateDynamic("defaultCanGroupBy")(defaultCanGroupBy.asInstanceOf[js.Any])
    if (!js.isUndefined(disableGroupBy)) __obj.updateDynamic("disableGroupBy")(disableGroupBy.asInstanceOf[js.Any])
    if (!js.isUndefined(groupByBoundary)) __obj.updateDynamic("groupByBoundary")(groupByBoundary.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGroupByColumnOptions[D]]
  }
}

