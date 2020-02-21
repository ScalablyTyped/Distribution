package typings.scBroker.scbrokerMod

import typings.ncom.mod.ComSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishMiddlewareData extends js.Object {
  var channel: String
  var command: js.Object
  var socket: ComSocket
}

object PublishMiddlewareData {
  @scala.inline
  def apply(channel: String, command: js.Object, socket: ComSocket): PublishMiddlewareData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PublishMiddlewareData]
  }
}

