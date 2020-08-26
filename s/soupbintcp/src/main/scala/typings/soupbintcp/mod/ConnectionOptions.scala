package typings.soupbintcp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionOptions extends js.Object {
  var heartbeatPacketType: PacketType = js.native
  var keepAliveMillis: js.UndefOr[Double] = js.native
  var rxTimeoutMillis: js.UndefOr[Double] = js.native
  var txIntervalMillis: js.UndefOr[Double] = js.native
}

object ConnectionOptions {
  @scala.inline
  def apply(heartbeatPacketType: PacketType): ConnectionOptions = {
    val __obj = js.Dynamic.literal(heartbeatPacketType = heartbeatPacketType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
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
    def setHeartbeatPacketType(value: PacketType): Self = this.set("heartbeatPacketType", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeepAliveMillis(value: Double): Self = this.set("keepAliveMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAliveMillis: Self = this.set("keepAliveMillis", js.undefined)
    @scala.inline
    def setRxTimeoutMillis(value: Double): Self = this.set("rxTimeoutMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRxTimeoutMillis: Self = this.set("rxTimeoutMillis", js.undefined)
    @scala.inline
    def setTxIntervalMillis(value: Double): Self = this.set("txIntervalMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTxIntervalMillis: Self = this.set("txIntervalMillis", js.undefined)
  }
  
}

