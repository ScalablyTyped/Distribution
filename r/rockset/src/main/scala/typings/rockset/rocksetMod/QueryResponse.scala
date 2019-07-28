package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResponse extends js.Object {
  // meta information about each column in the result set
  var column_fields: js.UndefOr[js.Array[QueryFieldType]] = js.undefined
  // list of fields returned by the query
  var fields: js.UndefOr[js.Array[QueryFieldType]] = js.undefined
  // list of objects returned by the query
  var results: js.UndefOr[js.Array[js.Object]] = js.undefined
  // meta information about the query
  var stats: js.UndefOr[QueryResponseStats] = js.undefined
}

object QueryResponse {
  @scala.inline
  def apply(
    column_fields: js.Array[QueryFieldType] = null,
    fields: js.Array[QueryFieldType] = null,
    results: js.Array[js.Object] = null,
    stats: QueryResponseStats = null
  ): QueryResponse = {
    val __obj = js.Dynamic.literal()
    if (column_fields != null) __obj.updateDynamic("column_fields")(column_fields)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (results != null) __obj.updateDynamic("results")(results)
    if (stats != null) __obj.updateDynamic("stats")(stats)
    __obj.asInstanceOf[QueryResponse]
  }
}

