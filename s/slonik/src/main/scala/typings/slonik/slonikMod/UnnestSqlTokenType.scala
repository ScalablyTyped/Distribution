package typings.slonik.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnnestSqlTokenType extends _SqlTokenType {
  var columnTypes: js.Array[String]
  var tuples: js.Array[PositionalParameterValuesType]
  var `type`: js.Symbol
}

object UnnestSqlTokenType {
  @scala.inline
  def apply(columnTypes: js.Array[String], tuples: js.Array[PositionalParameterValuesType], `type`: js.Symbol): UnnestSqlTokenType = {
    val __obj = js.Dynamic.literal(columnTypes = columnTypes, tuples = tuples)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UnnestSqlTokenType]
  }
}

