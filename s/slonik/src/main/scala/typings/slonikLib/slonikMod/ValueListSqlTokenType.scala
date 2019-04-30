package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueListSqlTokenType extends _SqlTokenType {
  var `type`: js.Symbol
  var values: js.Array[PrimitiveValueExpressionType]
}

object ValueListSqlTokenType {
  @scala.inline
  def apply(`type`: js.Symbol, values: js.Array[PrimitiveValueExpressionType]): ValueListSqlTokenType = {
    val __obj = js.Dynamic.literal(values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ValueListSqlTokenType]
  }
}

