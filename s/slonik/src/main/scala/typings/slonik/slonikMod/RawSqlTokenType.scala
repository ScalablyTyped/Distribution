package typings.slonik.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawSqlTokenType extends _SqlTokenType {
  var sql: String
  var `type`: js.Symbol
  var values: js.Array[PrimitiveValueExpressionType]
}

object RawSqlTokenType {
  @scala.inline
  def apply(sql: String, `type`: js.Symbol, values: js.Array[PrimitiveValueExpressionType]): RawSqlTokenType = {
    val __obj = js.Dynamic.literal(sql = sql, values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RawSqlTokenType]
  }
}

