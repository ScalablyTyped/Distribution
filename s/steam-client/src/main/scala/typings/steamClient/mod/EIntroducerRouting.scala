package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EIntroducerRouting extends StObject
@JSImport("steam-client", "EIntroducerRouting")
@js.native
object EIntroducerRouting extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EIntroducerRouting with Double] = js.native
  
  @js.native
  sealed trait FileShare extends EIntroducerRouting
  /* 0 */ val FileShare: typings.steamClient.mod.EIntroducerRouting.FileShare with Double = js.native
  
  @js.native
  sealed trait P2PNetworking extends EIntroducerRouting
  /* 2 */ val P2PNetworking: typings.steamClient.mod.EIntroducerRouting.P2PNetworking with Double = js.native
  
  // removed
  @js.native
  sealed trait P2PVoiceChat extends EIntroducerRouting
  /* 1 */ val P2PVoiceChat: typings.steamClient.mod.EIntroducerRouting.P2PVoiceChat with Double = js.native
}
