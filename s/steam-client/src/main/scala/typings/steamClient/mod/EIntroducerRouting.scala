package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EIntroducerRouting extends js.Object
@JSImport("steam-client", "EIntroducerRouting")
@js.native
object EIntroducerRouting extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EIntroducerRouting with Double] = js.native
  
   // removed
  @js.native
  sealed trait FileShare extends EIntroducerRouting
  /* 0 */ @js.native
  object FileShare extends TopLevel[FileShare with Double]
  
  @js.native
  sealed trait P2PNetworking extends EIntroducerRouting
  /* 2 */ @js.native
  object P2PNetworking extends TopLevel[P2PNetworking with Double]
  
  @js.native
  sealed trait P2PVoiceChat extends EIntroducerRouting
  /* 1 */ @js.native
  object P2PVoiceChat extends TopLevel[P2PVoiceChat with Double]
}
