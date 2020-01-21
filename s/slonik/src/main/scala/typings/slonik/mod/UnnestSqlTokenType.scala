package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnnestSqlTokenType extends _SqlTokenType {
  var columnTypes: js.Array[String]
  var tuples: js.Array[js.Array[ValueExpressionType]]
  var `type`: js.Symbol
}

object UnnestSqlTokenType {
  @scala.inline
  def apply(columnTypes: js.Array[String], tuples: js.Array[js.Array[ValueExpressionType]], `type`: js.Symbol): UnnestSqlTokenType = {
    val __obj = js.Dynamic.literal(columnTypes = columnTypes.asInstanceOf[js.Any], tuples = tuples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnnestSqlTokenType]
  }
}

