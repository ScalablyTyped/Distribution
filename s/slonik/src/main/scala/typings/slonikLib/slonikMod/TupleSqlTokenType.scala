package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TupleSqlTokenType extends _ValueExpressionType {
  var `type`: js.Symbol
  var values: js.Array[PrimitiveValueExpressionType]
}

object TupleSqlTokenType {
  @scala.inline
  def apply(`type`: js.Symbol, values: js.Array[PrimitiveValueExpressionType]): TupleSqlTokenType = {
    val __obj = js.Dynamic.literal(values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TupleSqlTokenType]
  }
}

