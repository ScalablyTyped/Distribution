package typings.reactDashTable

import typings.reactDashTable.reactDashTableMod.Aggregator
import typings.reactDashTable.reactDashTableMod.CellProps
import typings.reactDashTable.reactDashTableMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aggregate[D /* <: js.Object */] extends js.Object {
  var Aggregated: Renderer[CellProps[D]]
  var aggregate: Aggregator[D] | js.Array[Aggregator[D]]
  var defaultCanGroupBy: Boolean
  var disableGroupBy: Boolean
  var groupByBoundary: Boolean
}

object Anon_Aggregate {
  @scala.inline
  def apply[D /* <: js.Object */](
    aggregate: Aggregator[D] | js.Array[Aggregator[D]],
    defaultCanGroupBy: Boolean,
    disableGroupBy: Boolean,
    groupByBoundary: Boolean,
    Aggregated: Renderer[CellProps[D]] = null
  ): Anon_Aggregate[D] = {
    val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any], defaultCanGroupBy = defaultCanGroupBy.asInstanceOf[js.Any], disableGroupBy = disableGroupBy.asInstanceOf[js.Any], groupByBoundary = groupByBoundary.asInstanceOf[js.Any])
    if (Aggregated != null) __obj.updateDynamic("Aggregated")(Aggregated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Aggregate[D]]
  }
}

