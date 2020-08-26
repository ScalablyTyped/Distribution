package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteInfo extends js.Object {
  /** the IP address of the remote server */
  var ip: String = js.native
  /** the port used to connect to the remote server */
  var port: Double = js.native
}

object RemoteInfo {
  @scala.inline
  def apply(ip: String, port: Double): RemoteInfo = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteInfo]
  }
  @scala.inline
  implicit class RemoteInfoOps[Self <: RemoteInfo] (val x: Self) extends AnyVal {
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
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
  }
  
}

