package typings.protocolDashBuffersDashSchema.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Method extends js.Object {
  var client_streaming: Boolean
  var input_type: String
  var name: String
  var options: Options
  var output_type: String
  var server_streaming: Boolean
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
}

