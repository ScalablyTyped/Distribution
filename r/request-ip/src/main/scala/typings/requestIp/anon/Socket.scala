package typings.requestIp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket extends js.Object {
  var remoteAddress: js.UndefOr[String] = js.native
  var socket: js.UndefOr[RemoteAddress] = js.native
}

object Socket {
  @scala.inline
  def apply(): Socket = {
    val __obj = js.Dynamic.literal()
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
    def setRemoteAddress(value: String): Self = this.set("remoteAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteAddress: Self = this.set("remoteAddress", js.undefined)
    @scala.inline
    def setSocket(value: RemoteAddress): Self = this.set("socket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocket: Self = this.set("socket", js.undefined)
  }
  
}

