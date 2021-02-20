package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClientStat extends StObject
@JSImport("steam-client", "EClientStat")
@js.native
object EClientStat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClientStat with Double] = js.native
  
  @js.native
  sealed trait BytesDownloaded extends EClientStat
  /* 4 */ val BytesDownloaded: typings.steamClient.mod.EClientStat.BytesDownloaded with Double = js.native
  
  @js.native
  sealed trait Max extends EClientStat
  /* 5 */ val Max: typings.steamClient.mod.EClientStat.Max with Double = js.native
  
  @js.native
  sealed trait P2PConnectionsRelay extends EClientStat
  /* 1 */ val P2PConnectionsRelay: typings.steamClient.mod.EClientStat.P2PConnectionsRelay with Double = js.native
  
  @js.native
  sealed trait P2PConnectionsUDP extends EClientStat
  /* 0 */ val P2PConnectionsUDP: typings.steamClient.mod.EClientStat.P2PConnectionsUDP with Double = js.native
  
  @js.native
  sealed trait P2PGameConnections extends EClientStat
  /* 2 */ val P2PGameConnections: typings.steamClient.mod.EClientStat.P2PGameConnections with Double = js.native
  
  @js.native
  sealed trait P2PVoiceConnections extends EClientStat
  /* 3 */ val P2PVoiceConnections: typings.steamClient.mod.EClientStat.P2PVoiceConnections with Double = js.native
}
