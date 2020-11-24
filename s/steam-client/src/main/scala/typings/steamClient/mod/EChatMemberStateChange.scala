package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatMemberStateChange extends js.Object
@JSImport("steam-client", "EChatMemberStateChange")
@js.native
object EChatMemberStateChange extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatMemberStateChange with Double] = js.native
  
  @js.native
  sealed trait Banned extends EChatMemberStateChange
  /* 0x10 */ @js.native
  object Banned extends TopLevel[Banned with Double]
  
  @js.native
  sealed trait Disconnected extends EChatMemberStateChange
  /* 0x04 */ @js.native
  object Disconnected extends TopLevel[Disconnected with Double]
  
  @js.native
  sealed trait Entered extends EChatMemberStateChange
  /* 0x01 */ @js.native
  object Entered extends TopLevel[Entered with Double]
  
  @js.native
  sealed trait Kicked extends EChatMemberStateChange
  /* 0x08 */ @js.native
  object Kicked extends TopLevel[Kicked with Double]
  
  @js.native
  sealed trait Left extends EChatMemberStateChange
  /* 0x02 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  @js.native
  sealed trait VoiceDoneSpeaking extends EChatMemberStateChange
  /* 0x2000 */ @js.native
  object VoiceDoneSpeaking extends TopLevel[VoiceDoneSpeaking with Double]
  
  @js.native
  sealed trait VoiceSpeaking extends EChatMemberStateChange
  /* 0x1000 */ @js.native
  object VoiceSpeaking extends TopLevel[VoiceSpeaking with Double]
}
