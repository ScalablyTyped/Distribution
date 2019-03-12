package typings
package protocolDashBuffersDashSchemaLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Method extends js.Object {
  var client_streaming: scala.Boolean
  var input_type: java.lang.String
  var name: java.lang.String
  var options: Options
  var output_type: java.lang.String
  var server_streaming: scala.Boolean
}

object Method {
  @scala.inline
  def apply(
    client_streaming: scala.Boolean,
    input_type: java.lang.String,
    name: java.lang.String,
    options: Options,
    output_type: java.lang.String,
    server_streaming: scala.Boolean
  ): Method = {
    val __obj = js.Dynamic.literal(client_streaming = client_streaming, input_type = input_type, name = name, options = options, output_type = output_type, server_streaming = server_streaming)
  
    __obj.asInstanceOf[Method]
  }
}

