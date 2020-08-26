package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonSqlTokenType extends _SqlTokenType {
  var `type`: js.Symbol = js.native
  var value: SerializableValueType = js.native
}

object JsonSqlTokenType {
  @scala.inline
  def apply(`type`: js.Symbol): JsonSqlTokenType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonSqlTokenType]
  }
  @scala.inline
  implicit class JsonSqlTokenTypeOps[Self <: JsonSqlTokenType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: js.Symbol): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: SerializableValueType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

