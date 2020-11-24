package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClientStat extends js.Object
@JSImport("steam-client", "EClientStat")
@js.native
object EClientStat extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClientStat with Double] = js.native
  
  @js.native
  sealed trait BytesDownloaded extends EClientStat
  /* 4 */ @js.native
  object BytesDownloaded extends TopLevel[BytesDownloaded with Double]
  
  @js.native
  sealed trait Max extends EClientStat
  /* 5 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  @js.native
  sealed trait P2PConnectionsRelay extends EClientStat
  /* 1 */ @js.native
  object P2PConnectionsRelay extends TopLevel[P2PConnectionsRelay with Double]
  
  @js.native
  sealed trait P2PConnectionsUDP extends EClientStat
  /* 0 */ @js.native
  object P2PConnectionsUDP extends TopLevel[P2PConnectionsUDP with Double]
  
  @js.native
  sealed trait P2PGameConnections extends EClientStat
  /* 2 */ @js.native
  object P2PGameConnections extends TopLevel[P2PGameConnections with Double]
  
  @js.native
  sealed trait P2PVoiceConnections extends EClientStat
  /* 3 */ @js.native
  object P2PVoiceConnections extends TopLevel[P2PVoiceConnections with Double]
}
