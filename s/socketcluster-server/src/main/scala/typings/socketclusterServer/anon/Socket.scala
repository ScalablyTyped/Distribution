package typings.socketclusterServer.anon

import typings.socketclusterServer.serversocketMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket extends js.Object {
  var socket: ^ = js.native
}

object Socket {
  @scala.inline
  def apply(socket: ^): Socket = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Socket]
  }
  @scala.inline
  implicit class SocketOps[Self <: Socket] (val x: Self) extends AnyVal {
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
    def setSocket(value: ^): Self = this.set("socket", value.asInstanceOf[js.Any])
  }
  
}

