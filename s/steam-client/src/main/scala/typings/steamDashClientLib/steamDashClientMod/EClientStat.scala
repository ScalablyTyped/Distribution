package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EClientStat extends js.Object

@JSImport("steam-client", "EClientStat")
@js.native
object EClientStat extends js.Object {
  @js.native
  sealed trait BytesDownloaded
    extends steamDashClientLib.steamDashClientMod.EClientStat
  
  @js.native
  sealed trait Max
    extends steamDashClientLib.steamDashClientMod.EClientStat
  
  @js.native
  sealed trait P2PConnectionsRelay
    extends steamDashClientLib.steamDashClientMod.EClientStat
  
  @js.native
  sealed trait P2PConnectionsUDP
    extends steamDashClientLib.steamDashClientMod.EClientStat
  
  @js.native
  sealed trait P2PGameConnections
    extends steamDashClientLib.steamDashClientMod.EClientStat
  
  @js.native
  sealed trait P2PVoiceConnections
    extends steamDashClientLib.steamDashClientMod.EClientStat
  
  /* 4 */ val BytesDownloaded: BytesDownloaded with scala.Double = js.native
  /* 5 */ val Max: Max with scala.Double = js.native
  /* 1 */ val P2PConnectionsRelay: P2PConnectionsRelay with scala.Double = js.native
  /* 0 */ val P2PConnectionsUDP: P2PConnectionsUDP with scala.Double = js.native
  /* 2 */ val P2PGameConnections: P2PGameConnections with scala.Double = js.native
  /* 3 */ val P2PVoiceConnections: P2PVoiceConnections with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EClientStat with scala.Double] = js.native
}

