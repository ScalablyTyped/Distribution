package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClientStat extends StObject
@JSImport("steam-client", "EClientStat")
@js.native
object EClientStat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClientStat & Double] = js.native
  
  @js.native
  sealed trait BytesDownloaded
    extends StObject
       with EClientStat
  /* 4 */ val BytesDownloaded: typings.steamClient.mod.EClientStat.BytesDownloaded & Double = js.native
  
  @js.native
  sealed trait Max
    extends StObject
       with EClientStat
  /* 5 */ val Max: typings.steamClient.mod.EClientStat.Max & Double = js.native
  
  @js.native
  sealed trait P2PConnectionsRelay
    extends StObject
       with EClientStat
  /* 1 */ val P2PConnectionsRelay: typings.steamClient.mod.EClientStat.P2PConnectionsRelay & Double = js.native
  
  @js.native
  sealed trait P2PConnectionsUDP
    extends StObject
       with EClientStat
  /* 0 */ val P2PConnectionsUDP: typings.steamClient.mod.EClientStat.P2PConnectionsUDP & Double = js.native
  
  @js.native
  sealed trait P2PGameConnections
    extends StObject
       with EClientStat
  /* 2 */ val P2PGameConnections: typings.steamClient.mod.EClientStat.P2PGameConnections & Double = js.native
  
  @js.native
  sealed trait P2PVoiceConnections
    extends StObject
       with EClientStat
  /* 3 */ val P2PVoiceConnections: typings.steamClient.mod.EClientStat.P2PVoiceConnections & Double = js.native
}
