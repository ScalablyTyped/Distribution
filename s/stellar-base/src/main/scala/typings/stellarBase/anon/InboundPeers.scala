package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.PeerStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InboundPeers extends js.Object {
  var inboundPeers: js.Array[PeerStats] = js.native
  var outboundPeers: js.Array[PeerStats] = js.native
  var totalInboundPeerCount: Double = js.native
  var totalOutboundPeerCount: Double = js.native
}

object InboundPeers {
  @scala.inline
  def apply(
    inboundPeers: js.Array[PeerStats],
    outboundPeers: js.Array[PeerStats],
    totalInboundPeerCount: Double,
    totalOutboundPeerCount: Double
  ): InboundPeers = {
    val __obj = js.Dynamic.literal(inboundPeers = inboundPeers.asInstanceOf[js.Any], outboundPeers = outboundPeers.asInstanceOf[js.Any], totalInboundPeerCount = totalInboundPeerCount.asInstanceOf[js.Any], totalOutboundPeerCount = totalOutboundPeerCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundPeers]
  }
  @scala.inline
  implicit class InboundPeersOps[Self <: InboundPeers] (val x: Self) extends AnyVal {
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
    def setInboundPeersVarargs(value: PeerStats*): Self = this.set("inboundPeers", js.Array(value :_*))
    @scala.inline
    def setInboundPeers(value: js.Array[PeerStats]): Self = this.set("inboundPeers", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutboundPeersVarargs(value: PeerStats*): Self = this.set("outboundPeers", js.Array(value :_*))
    @scala.inline
    def setOutboundPeers(value: js.Array[PeerStats]): Self = this.set("outboundPeers", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalInboundPeerCount(value: Double): Self = this.set("totalInboundPeerCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalOutboundPeerCount(value: Double): Self = this.set("totalOutboundPeerCount", value.asInstanceOf[js.Any])
  }
  
}

