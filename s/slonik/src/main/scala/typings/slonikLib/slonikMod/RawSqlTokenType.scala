package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawSqlTokenType extends _ValueExpressionType {
  var sql: java.lang.String
  var `type`: js.Symbol
  var values: js.Array[PrimitiveValueExpressionType]
}

object RawSqlTokenType {
  @scala.inline
  def apply(sql: java.lang.String, `type`: js.Symbol, values: js.Array[PrimitiveValueExpressionType]): RawSqlTokenType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("sql")(sql)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[RawSqlTokenType]
  }
}

