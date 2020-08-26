package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TcpipForwardingConfig extends js.Object {
  /**
    * Destination IP address of outgoing connection.
    */
  var destIP: String = js.native
  /**
    * Destination port of outgoing connection.
    */
  var destPort: Double = js.native
  /**
    * Source IP address of outgoing connection.
    */
  var srcIP: String = js.native
  /**
    * Source port of outgoing connection.
    */
  var srcPort: Double = js.native
}

object TcpipForwardingConfig {
  @scala.inline
  def apply(destIP: String, destPort: Double, srcIP: String, srcPort: Double): TcpipForwardingConfig = {
    val __obj = js.Dynamic.literal(destIP = destIP.asInstanceOf[js.Any], destPort = destPort.asInstanceOf[js.Any], srcIP = srcIP.asInstanceOf[js.Any], srcPort = srcPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpipForwardingConfig]
  }
  @scala.inline
  implicit class TcpipForwardingConfigOps[Self <: TcpipForwardingConfig] (val x: Self) extends AnyVal {
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
    def setDestIP(value: String): Self = this.set("destIP", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestPort(value: Double): Self = this.set("destPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcIP(value: String): Self = this.set("srcIP", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcPort(value: Double): Self = this.set("srcPort", value.asInstanceOf[js.Any])
  }
  
}

