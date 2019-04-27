package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArraySqlTokenType extends SqlTokenType {
  var memberType: java.lang.String
  var `type`: js.Symbol
  var values: js.Array[PrimitiveValueExpressionType]
}

object ArraySqlTokenType {
  @scala.inline
  def apply(memberType: java.lang.String, `type`: js.Symbol, values: js.Array[PrimitiveValueExpressionType]): ArraySqlTokenType = {
    val __obj = js.Dynamic.literal(memberType = memberType, values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ArraySqlTokenType]
  }
}

