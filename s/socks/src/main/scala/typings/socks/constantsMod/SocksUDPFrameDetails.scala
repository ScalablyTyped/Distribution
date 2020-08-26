package typings.socks.constantsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocksUDPFrameDetails extends js.Object {
  var data: Buffer = js.native
  var frameNumber: js.UndefOr[Double] = js.native
  var remoteHost: SocksRemoteHost = js.native
}

object SocksUDPFrameDetails {
  @scala.inline
  def apply(data: Buffer, remoteHost: SocksRemoteHost): SocksUDPFrameDetails = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], remoteHost = remoteHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksUDPFrameDetails]
  }
  @scala.inline
  implicit class SocksUDPFrameDetailsOps[Self <: SocksUDPFrameDetails] (val x: Self) extends AnyVal {
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
    def setData(value: Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteHost(value: SocksRemoteHost): Self = this.set("remoteHost", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameNumber(value: Double): Self = this.set("frameNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameNumber: Self = this.set("frameNumber", js.undefined)
  }
  
}

