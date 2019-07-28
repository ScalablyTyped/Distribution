package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EClientStat extends js.Object

@JSImport("steam-client", "EClientStat")
@js.native
object EClientStat extends js.Object {
  @js.native
  sealed trait BytesDownloaded extends EClientStat
  
  @js.native
  sealed trait Max extends EClientStat
  
  @js.native
  sealed trait P2PConnectionsRelay extends EClientStat
  
  @js.native
  sealed trait P2PConnectionsUDP extends EClientStat
  
  @js.native
  sealed trait P2PGameConnections extends EClientStat
  
  @js.native
  sealed trait P2PVoiceConnections extends EClientStat
  
  /* 4 */ val BytesDownloaded: typings.steamDashClient.steamDashClientMod.EClientStat.BytesDownloaded with Double = js.native
  /* 5 */ val Max: typings.steamDashClient.steamDashClientMod.EClientStat.Max with Double = js.native
  /* 1 */ val P2PConnectionsRelay: typings.steamDashClient.steamDashClientMod.EClientStat.P2PConnectionsRelay with Double = js.native
  /* 0 */ val P2PConnectionsUDP: typings.steamDashClient.steamDashClientMod.EClientStat.P2PConnectionsUDP with Double = js.native
  /* 2 */ val P2PGameConnections: typings.steamDashClient.steamDashClientMod.EClientStat.P2PGameConnections with Double = js.native
  /* 3 */ val P2PVoiceConnections: typings.steamDashClient.steamDashClientMod.EClientStat.P2PVoiceConnections with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClientStat with Double] = js.native
}

