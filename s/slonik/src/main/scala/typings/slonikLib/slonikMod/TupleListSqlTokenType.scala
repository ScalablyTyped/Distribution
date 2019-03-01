package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TupleListSqlTokenType extends _ValueExpressionType {
  var tuples: js.Array[PrimitiveValueExpressionType]
  var `type`: js.Symbol
}

object TupleListSqlTokenType {
  @scala.inline
  def apply(tuples: js.Array[PrimitiveValueExpressionType], `type`: js.Symbol): TupleListSqlTokenType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("tuples")(tuples)
    __obj.asInstanceOf[TupleListSqlTokenType]
  }
}

