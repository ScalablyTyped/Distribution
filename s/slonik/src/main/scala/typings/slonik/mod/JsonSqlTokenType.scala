package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonSqlTokenType extends _SqlTokenType {
  var `type`: js.Symbol
  var value: SerializableValueType
}

object JsonSqlTokenType {
  @scala.inline
  def apply(`type`: js.Symbol, value: SerializableValueType = null): JsonSqlTokenType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonSqlTokenType]
  }
}

