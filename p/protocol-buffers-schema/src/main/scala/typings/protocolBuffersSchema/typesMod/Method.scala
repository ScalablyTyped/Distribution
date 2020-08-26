package typings.protocolBuffersSchema.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Method extends js.Object {
  var client_streaming: Boolean = js.native
  var input_type: String = js.native
  var name: String = js.native
  var options: Options = js.native
  var output_type: String = js.native
  var server_streaming: Boolean = js.native
}

object Method {
  @scala.inline
  def apply(
    client_streaming: Boolean,
    input_type: String,
    name: String,
    options: Options,
    output_type: String,
    server_streaming: Boolean
  ): Method = {
    val __obj = js.Dynamic.literal(client_streaming = client_streaming.asInstanceOf[js.Any], input_type = input_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any], server_streaming = server_streaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
  @scala.inline
  implicit class MethodOps[Self <: Method] (val x: Self) extends AnyVal {
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
    def setClient_streaming(value: Boolean): Self = this.set("client_streaming", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput_type(value: String): Self = this.set("input_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput_type(value: String): Self = this.set("output_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setServer_streaming(value: Boolean): Self = this.set("server_streaming", value.asInstanceOf[js.Any])
  }
  
}

