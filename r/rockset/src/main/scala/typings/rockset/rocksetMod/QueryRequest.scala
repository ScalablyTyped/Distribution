package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRequest extends js.Object {
  // details about the query
  var sql: js.UndefOr[QueryRequestSql] = js.undefined
}

object QueryRequest {
  @scala.inline
  def apply(sql: QueryRequestSql = null): QueryRequest = {
    val __obj = js.Dynamic.literal()
    if (sql != null) __obj.updateDynamic("sql")(sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRequest]
  }
}

