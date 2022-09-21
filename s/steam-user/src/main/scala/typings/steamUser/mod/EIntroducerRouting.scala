package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EIntroducerRouting extends StObject
@JSImport("steam-user", "EIntroducerRouting")
@js.native
object EIntroducerRouting extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EIntroducerRouting & Double] = js.native
  
  @js.native
  sealed trait FileShare
    extends StObject
       with EIntroducerRouting
  /* 0 */ val FileShare: typings.steamUser.mod.EIntroducerRouting.FileShare & Double = js.native
  
  @js.native
  sealed trait P2PNetworking
    extends StObject
       with EIntroducerRouting
  /* 2 */ val P2PNetworking: typings.steamUser.mod.EIntroducerRouting.P2PNetworking & Double = js.native
  
  @js.native
  sealed trait P2PVoiceChat
    extends StObject
       with EIntroducerRouting
  /* 1 */ val P2PVoiceChat: typings.steamUser.mod.EIntroducerRouting.P2PVoiceChat & Double = js.native
}
