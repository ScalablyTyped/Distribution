package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlSqlTokenType extends _ValueExpressionType {
  var sql: java.lang.String
  var `type`: js.Symbol
  var values: js.Array[PrimitiveValueExpressionType]
}

object SqlSqlTokenType {
  @scala.inline
  def apply(sql: java.lang.String, `type`: js.Symbol, values: js.Array[PrimitiveValueExpressionType]): SqlSqlTokenType = {
    val __obj = js.Dynamic.literal(sql = sql, values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SqlSqlTokenType]
  }
}

