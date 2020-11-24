package typings.protocolBuffersSchema.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends js.Object {
  
  var enums: js.Array[Enum] = js.native
  
  var `extends`: js.Array[Extend] = js.native
  
  var extensions: js.Array[Extension] = js.native
  
  var fields: js.Array[Field] = js.native
  
  var messages: js.Array[Message] = js.native
  
  var name: String = js.native
  
  var options: Options = js.native
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
  
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    
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
    def setEnumsVarargs(value: Enum*): Self = this.set("enums", js.Array(value :_*))
    
    @scala.inline
    def setEnums(value: js.Array[Enum]): Self = this.set("enums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsVarargs(value: Extend*): Self = this.set("extends", js.Array(value :_*))
    
    @scala.inline
    def setExtends(value: js.Array[Extend]): Self = this.set("extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[Extension]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[Field]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[Message]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
