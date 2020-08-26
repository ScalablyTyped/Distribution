package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketForwardingConfig extends js.Object {
  var socketPath: String = js.native
}

object SocketForwardingConfig {
  @scala.inline
  def apply(socketPath: String): SocketForwardingConfig = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketForwardingConfig]
  }
  @scala.inline
  implicit class SocketForwardingConfigOps[Self <: SocketForwardingConfig] (val x: Self) extends AnyVal {
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
    def setSocketPath(value: String): Self = this.set("socketPath", value.asInstanceOf[js.Any])
  }
  
}

