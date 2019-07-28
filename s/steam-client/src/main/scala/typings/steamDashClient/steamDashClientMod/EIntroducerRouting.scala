package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EIntroducerRouting extends js.Object

@JSImport("steam-client", "EIntroducerRouting")
@js.native
object EIntroducerRouting extends js.Object {
   // removed
  @js.native
  sealed trait FileShare extends EIntroducerRouting
  
  @js.native
  sealed trait P2PNetworking extends EIntroducerRouting
  
  @js.native
  sealed trait P2PVoiceChat extends EIntroducerRouting
  
  /* 0 */ val FileShare: typings.steamDashClient.steamDashClientMod.EIntroducerRouting.FileShare with Double = js.native
  /* 2 */ val P2PNetworking: typings.steamDashClient.steamDashClientMod.EIntroducerRouting.P2PNetworking with Double = js.native
  /* 1 */ val P2PVoiceChat: typings.steamDashClient.steamDashClientMod.EIntroducerRouting.P2PVoiceChat with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EIntroducerRouting with Double] = js.native
}

