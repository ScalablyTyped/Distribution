package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.EIntroducerRouting.FileShare
import typings.steamDashClient.steamDashClientMod.EIntroducerRouting.P2PNetworking
import typings.steamDashClient.steamDashClientMod.EIntroducerRouting.P2PVoiceChat
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EIntroducerRouting with Double] = js.native
  /* 0 */ @js.native
  object FileShare extends TopLevel[FileShare with Double]
  
  /* 2 */ @js.native
  object P2PNetworking extends TopLevel[P2PNetworking with Double]
  
  /* 1 */ @js.native
  object P2PVoiceChat extends TopLevel[P2PVoiceChat with Double]
  
}

