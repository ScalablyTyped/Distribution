package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnnestSqlTokenType extends _SqlTokenType {
  var columnTypes: js.Array[java.lang.String]
  var tuples: js.Array[js.Array[PrimitiveValueExpressionType]]
  var `type`: js.Symbol
}

object UnnestSqlTokenType {
  @scala.inline
  def apply(
    columnTypes: js.Array[java.lang.String],
    tuples: js.Array[js.Array[PrimitiveValueExpressionType]],
    `type`: js.Symbol
  ): UnnestSqlTokenType = {
    val __obj = js.Dynamic.literal(columnTypes = columnTypes, tuples = tuples)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UnnestSqlTokenType]
  }
}

