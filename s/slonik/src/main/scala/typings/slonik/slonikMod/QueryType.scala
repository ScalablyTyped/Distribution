package typings.slonik.slonikMod

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
    val __obj = js.Dynamic.literal(sql = sql)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[QueryType]
  }
}

