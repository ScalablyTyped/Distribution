package typings
package steamDashClientLib.steamDashClientMod

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
  sealed trait FileShare
    extends steamDashClientLib.steamDashClientMod.EIntroducerRouting
  
  @js.native
  sealed trait P2PNetworking
    extends steamDashClientLib.steamDashClientMod.EIntroducerRouting
  
  @js.native
  sealed trait P2PVoiceChat
    extends steamDashClientLib.steamDashClientMod.EIntroducerRouting
  
  /* 0 */ val FileShare: FileShare with scala.Double = js.native
  /* 2 */ val P2PNetworking: P2PNetworking with scala.Double = js.native
  /* 1 */ val P2PVoiceChat: P2PVoiceChat with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EIntroducerRouting with scala.Double] = js.native
}

