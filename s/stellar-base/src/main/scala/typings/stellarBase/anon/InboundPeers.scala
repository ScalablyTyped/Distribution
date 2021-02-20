package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.PeerStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InboundPeers extends StObject {
  
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
  implicit class InboundPeersMutableBuilder[Self <: InboundPeers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInboundPeers(value: js.Array[PeerStats]): Self = StObject.set(x, "inboundPeers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundPeersVarargs(value: PeerStats*): Self = StObject.set(x, "inboundPeers", js.Array(value :_*))
    
    @scala.inline
    def setOutboundPeers(value: js.Array[PeerStats]): Self = StObject.set(x, "outboundPeers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundPeersVarargs(value: PeerStats*): Self = StObject.set(x, "outboundPeers", js.Array(value :_*))
    
    @scala.inline
    def setTotalInboundPeerCount(value: Double): Self = StObject.set(x, "totalInboundPeerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalOutboundPeerCount(value: Double): Self = StObject.set(x, "totalOutboundPeerCount", value.asInstanceOf[js.Any])
  }
}
