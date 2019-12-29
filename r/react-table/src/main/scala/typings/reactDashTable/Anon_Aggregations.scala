package typings.reactDashTable

import typings.reactDashTable.reactDashTableMod.AggregatorFn
import typings.reactDashTable.reactDashTableMod.IdType
import typings.reactDashTable.reactDashTableMod.Row
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aggregations[D /* <: js.Object */] extends js.Object {
  var aggregations: Record[String, AggregatorFn[D]]
  var autoResetGroupBy: js.UndefOr[Boolean] = js.undefined
  var defaultCanGroupBy: Boolean
  var disableGroupBy: Boolean
  var manualGroupBy: Boolean
  def groupByFn(rows: js.Array[Row[D]], columnId: IdType[D]): Record[String, Row[D]]
}

object Anon_Aggregations {
  @scala.inline
  def apply[D /* <: js.Object */](
    aggregations: Record[String, AggregatorFn[D]],
    defaultCanGroupBy: Boolean,
    disableGroupBy: Boolean,
    groupByFn: (js.Array[Row[D]], IdType[D]) => Record[String, Row[D]],
    manualGroupBy: Boolean,
    autoResetGroupBy: js.UndefOr[Boolean] = js.undefined
  ): Anon_Aggregations[D] = {
    val __obj = js.Dynamic.literal(aggregations = aggregations.asInstanceOf[js.Any], defaultCanGroupBy = defaultCanGroupBy.asInstanceOf[js.Any], disableGroupBy = disableGroupBy.asInstanceOf[js.Any], groupByFn = js.Any.fromFunction2(groupByFn), manualGroupBy = manualGroupBy.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResetGroupBy)) __obj.updateDynamic("autoResetGroupBy")(autoResetGroupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Aggregations[D]]
  }
}

