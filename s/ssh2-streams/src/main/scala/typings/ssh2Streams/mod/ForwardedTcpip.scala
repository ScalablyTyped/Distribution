package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardedTcpip extends js.Object {
  var bindAddr: String = js.native
  var bindPort: Double = js.native
  var remoteAddr: String = js.native
  var remotePort: Double = js.native
}

object ForwardedTcpip {
  @scala.inline
  def apply(bindAddr: String, bindPort: Double, remoteAddr: String, remotePort: Double): ForwardedTcpip = {
    val __obj = js.Dynamic.literal(bindAddr = bindAddr.asInstanceOf[js.Any], bindPort = bindPort.asInstanceOf[js.Any], remoteAddr = remoteAddr.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardedTcpip]
  }
  @scala.inline
  implicit class ForwardedTcpipOps[Self <: ForwardedTcpip] (val x: Self) extends AnyVal {
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
    def setBindAddr(value: String): Self = this.set("bindAddr", value.asInstanceOf[js.Any])
    @scala.inline
    def setBindPort(value: Double): Self = this.set("bindPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteAddr(value: String): Self = this.set("remoteAddr", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemotePort(value: Double): Self = this.set("remotePort", value.asInstanceOf[js.Any])
  }
  
}

