package typings.scBroker.scbrokerMod

import typings.ncom.mod.ComSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeMiddlewareData extends js.Object {
  var channel: String = js.native
  var socket: ComSocket = js.native
}

object SubscribeMiddlewareData {
  @scala.inline
  def apply(channel: String, socket: ComSocket): SubscribeMiddlewareData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeMiddlewareData]
  }
  @scala.inline
  implicit class SubscribeMiddlewareDataOps[Self <: SubscribeMiddlewareData] (val x: Self) extends AnyVal {
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
    def setSocket(value: ComSocket): Self = this.set("socket", value.asInstanceOf[js.Any])
  }
  
}

