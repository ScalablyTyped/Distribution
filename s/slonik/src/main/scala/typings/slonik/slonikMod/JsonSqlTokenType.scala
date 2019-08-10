package typings.slonik.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonSqlTokenType extends _SqlTokenType {
  var `type`: js.Symbol
  var value: SerializableValueType
}

object JsonSqlTokenType {
  @scala.inline
  def apply(`type`: js.Symbol, value: SerializableValueType): JsonSqlTokenType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JsonSqlTokenType]
  }
}

