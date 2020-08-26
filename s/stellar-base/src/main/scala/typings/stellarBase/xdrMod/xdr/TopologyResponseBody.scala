package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopologyResponseBody extends js.Object {
  def inboundPeers(): js.Array[PeerStats] = js.native
  def inboundPeers(value: js.Array[PeerStats]): js.Array[PeerStats] = js.native
  def outboundPeers(): js.Array[PeerStats] = js.native
  def outboundPeers(value: js.Array[PeerStats]): js.Array[PeerStats] = js.native
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  def totalInboundPeerCount(): Double = js.native
  def totalInboundPeerCount(value: Double): Double = js.native
  def totalOutboundPeerCount(): Double = js.native
  def totalOutboundPeerCount(value: Double): Double = js.native
}

