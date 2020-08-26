package typings.socks.constantsMod

import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocksClientEstablishedEvent extends js.Object {
  var remoteHost: js.UndefOr[SocksRemoteHost] = js.native
  var socket: Socket = js.native
}

object SocksClientEstablishedEvent {
  @scala.inline
  def apply(socket: Socket): SocksClientEstablishedEvent = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksClientEstablishedEvent]
  }
  @scala.inline
  implicit class SocksClientEstablishedEventOps[Self <: SocksClientEstablishedEvent] (val x: Self) extends AnyVal {
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
    def setSocket(value: Socket): Self = this.set("socket", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteHost(value: SocksRemoteHost): Self = this.set("remoteHost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteHost: Self = this.set("remoteHost", js.undefined)
  }
  
}

