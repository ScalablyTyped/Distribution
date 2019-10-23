package typings.slonik.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArraySqlTokenType extends _SqlTokenType {
  var memberType: TypeNameIdentifierType | SqlTokenType
  var `type`: js.Symbol
  var values: PositionalParameterValuesType
}

object ArraySqlTokenType {
  @scala.inline
  def apply(
    memberType: TypeNameIdentifierType | SqlTokenType,
    `type`: js.Symbol,
    values: PositionalParameterValuesType
  ): ArraySqlTokenType = {
    val __obj = js.Dynamic.literal(memberType = memberType.asInstanceOf[js.Any], values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ArraySqlTokenType]
  }
}

