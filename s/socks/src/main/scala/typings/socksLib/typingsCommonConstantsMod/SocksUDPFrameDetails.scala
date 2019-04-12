package typings
package socksLib.typingsCommonConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocksUDPFrameDetails extends js.Object {
  var data: nodeLib.Buffer
  var frameNumber: js.UndefOr[scala.Double] = js.undefined
  var remoteHost: SocksRemoteHost
}

object SocksUDPFrameDetails {
  @scala.inline
  def apply(data: nodeLib.Buffer, remoteHost: SocksRemoteHost, frameNumber: scala.Int | scala.Double = null): SocksUDPFrameDetails = {
    val __obj = js.Dynamic.literal(data = data, remoteHost = remoteHost)
    if (frameNumber != null) __obj.updateDynamic("frameNumber")(frameNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksUDPFrameDetails]
  }
}

