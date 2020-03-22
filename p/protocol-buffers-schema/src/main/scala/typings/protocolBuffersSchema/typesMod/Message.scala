package typings.protocolBuffersSchema.typesMod

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
  var options: Options
}

object Message {
  @scala.inline
  def apply(
    enums: js.Array[Enum],
    `extends`: js.Array[Extend],
    extensions: js.Array[Extension],
    fields: js.Array[Field],
    messages: js.Array[Message],
    name: String,
    options: Options
  ): Message = {
    val __obj = js.Dynamic.literal(enums = enums.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

