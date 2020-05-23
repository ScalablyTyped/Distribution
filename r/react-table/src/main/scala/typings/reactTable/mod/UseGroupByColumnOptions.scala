package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  aggregate  :react-table.react-table.Aggregator<D>,   Aggregated  :react-table.react-table.Renderer<react-table.react-table.CellProps<D, any>>,   disableGroupBy  :boolean,   defaultCanGroupBy  :boolean,   groupByBoundary  :boolean}> */
trait UseGroupByColumnOptions[D /* <: js.Object */] extends js.Object {
  var Aggregated: js.UndefOr[Renderer[CellProps[D, _]]] = js.undefined
  var aggregate: js.UndefOr[Aggregator[D]] = js.undefined
  var defaultCanGroupBy: js.UndefOr[Boolean] = js.undefined
  var disableGroupBy: js.UndefOr[Boolean] = js.undefined
  var groupByBoundary: js.UndefOr[Boolean] = js.undefined
}

object UseGroupByColumnOptions {
  @scala.inline
  def apply[D](
    Aggregated: Renderer[CellProps[D, _]] = null,
    aggregate: Aggregator[D] = null,
    defaultCanGroupBy: js.UndefOr[Boolean] = js.undefined,
    disableGroupBy: js.UndefOr[Boolean] = js.undefined,
    groupByBoundary: js.UndefOr[Boolean] = js.undefined
  ): UseGroupByColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    if (Aggregated != null) __obj.updateDynamic("Aggregated")(Aggregated.asInstanceOf[js.Any])
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultCanGroupBy)) __obj.updateDynamic("defaultCanGroupBy")(defaultCanGroupBy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableGroupBy)) __obj.updateDynamic("disableGroupBy")(disableGroupBy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupByBoundary)) __obj.updateDynamic("groupByBoundary")(groupByBoundary.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGroupByColumnOptions[D]]
  }
}

