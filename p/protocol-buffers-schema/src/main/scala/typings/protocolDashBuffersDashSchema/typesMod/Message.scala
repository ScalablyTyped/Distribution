package typings.protocolDashBuffersDashSchema.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var enums: js.Array[Enum]
  var `extends`: js.Array[Extend]
  var extensions: js.Array[Extension]
  var fields: js.Array[Field]
  var messages: js.Array[Message]
  var name: String
}

object Message {
  @scala.inline
  def apply(
    enums: js.Array[Enum],
    `extends`: js.Array[Extend],
    extensions: js.Array[Extension],
    fields: js.Array[Field],
    messages: js.Array[Message],
    name: String
  ): Message = {
    val __obj = js.Dynamic.literal(enums = enums, extensions = extensions, fields = fields, messages = messages, name = name)
    __obj.updateDynamic("extends")(`extends`)
    __obj.asInstanceOf[Message]
  }
}

