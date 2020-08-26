package typings.protocolBuffersSchema.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema extends js.Object {
  @JSName("package")
  var _package: Null | String = js.native
  var enums: js.Array[Enum] = js.native
  var `extends`: js.Array[Extend] = js.native
  var imports: js.Array[String] = js.native
  var messages: js.Array[Message] = js.native
  var options: Options = js.native
  var services: js.UndefOr[js.Array[Service]] = js.native
  var syntax: Double = js.native
}

object Schema {
  @scala.inline
  def apply(
    enums: js.Array[Enum],
    `extends`: js.Array[Extend],
    imports: js.Array[String],
    messages: js.Array[Message],
    options: Options,
    syntax: Double
  ): Schema = {
    val __obj = js.Dynamic.literal(enums = enums.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  @scala.inline
  implicit class SchemaOps[Self <: Schema] (val x: Self) extends AnyVal {
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
    def setImportsVarargs(value: String*): Self = this.set("imports", js.Array(value :_*))
    @scala.inline
    def setImports(value: js.Array[String]): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[Message]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setSyntax(value: Double): Self = this.set("syntax", value.asInstanceOf[js.Any])
    @scala.inline
    def set_package(value: String): Self = this.set("package", value.asInstanceOf[js.Any])
    @scala.inline
    def set_packageNull: Self = this.set("package", null)
    @scala.inline
    def setServicesVarargs(value: Service*): Self = this.set("services", js.Array(value :_*))
    @scala.inline
    def setServices(value: js.Array[Service]): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
  }
  
}

