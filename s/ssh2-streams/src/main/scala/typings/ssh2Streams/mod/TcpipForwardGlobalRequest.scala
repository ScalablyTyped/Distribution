package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TcpipForwardGlobalRequest extends _GlobalRequest {
  /**
    * The IP address to start/stop binding to.
    */
  var bindAddr: String = js.native
  /**
    * The port to start/stop binding to.
    */
  var bindPort: Double = js.native
}

object TcpipForwardGlobalRequest {
  @scala.inline
  def apply(bindAddr: String, bindPort: Double): TcpipForwardGlobalRequest = {
    val __obj = js.Dynamic.literal(bindAddr = bindAddr.asInstanceOf[js.Any], bindPort = bindPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpipForwardGlobalRequest]
  }
  @scala.inline
  implicit class TcpipForwardGlobalRequestOps[Self <: TcpipForwardGlobalRequest] (val x: Self) extends AnyVal {
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
  }
  
}

