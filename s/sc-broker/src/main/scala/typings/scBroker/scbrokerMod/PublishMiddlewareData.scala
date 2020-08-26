package typings.scBroker.scbrokerMod

import typings.ncom.mod.ComSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishMiddlewareData extends js.Object {
  var channel: String = js.native
  var command: js.Object = js.native
  var socket: ComSocket = js.native
}

object PublishMiddlewareData {
  @scala.inline
  def apply(channel: String, command: js.Object, socket: ComSocket): PublishMiddlewareData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishMiddlewareData]
  }
  @scala.inline
  implicit class PublishMiddlewareDataOps[Self <: PublishMiddlewareData] (val x: Self) extends AnyVal {
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: js.Object): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocket(value: ComSocket): Self = this.set("socket", value.asInstanceOf[js.Any])
  }
  
}

