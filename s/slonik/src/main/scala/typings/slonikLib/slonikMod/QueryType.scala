package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryType extends js.Object {
  var sql: java.lang.String
  var values: js.UndefOr[js.Array[PrimitiveValueExpressionType]] = js.undefined
}

object QueryType {
  @scala.inline
  def apply(sql: java.lang.String, values: js.Array[PrimitiveValueExpressionType] = null): QueryType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sql")(sql)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[QueryType]
  }
}

