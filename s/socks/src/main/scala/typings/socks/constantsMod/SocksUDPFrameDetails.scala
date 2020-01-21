package typings.socks.constantsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocksUDPFrameDetails extends js.Object {
  var data: Buffer
  var frameNumber: js.UndefOr[Double] = js.undefined
  var remoteHost: SocksRemoteHost
}

object SocksUDPFrameDetails {
  @scala.inline
  def apply(data: Buffer, remoteHost: SocksRemoteHost, frameNumber: Int | Double = null): SocksUDPFrameDetails = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], remoteHost = remoteHost.asInstanceOf[js.Any])
    if (frameNumber != null) __obj.updateDynamic("frameNumber")(frameNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksUDPFrameDetails]
  }
}

