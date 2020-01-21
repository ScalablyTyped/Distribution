package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryType extends js.Object {
  var sql: String
  var values: js.UndefOr[js.Array[PrimitiveValueExpressionType]] = js.undefined
}

object QueryType {
  @scala.inline
  def apply(sql: String, values: js.Array[PrimitiveValueExpressionType] = null): QueryType = {
    val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryType]
  }
}

