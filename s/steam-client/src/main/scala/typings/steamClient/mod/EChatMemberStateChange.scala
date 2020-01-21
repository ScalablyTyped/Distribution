package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatMemberStateChange extends js.Object

@JSImport("steam-client", "EChatMemberStateChange")
@js.native
object EChatMemberStateChange extends js.Object {
  @js.native
  sealed trait Banned extends EChatMemberStateChange
  
  @js.native
  sealed trait Disconnected extends EChatMemberStateChange
  
  @js.native
  sealed trait Entered extends EChatMemberStateChange
  
  @js.native
  sealed trait Kicked extends EChatMemberStateChange
  
  @js.native
  sealed trait Left extends EChatMemberStateChange
  
  @js.native
  sealed trait VoiceDoneSpeaking extends EChatMemberStateChange
  
  @js.native
  sealed trait VoiceSpeaking extends EChatMemberStateChange
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatMemberStateChange with Double] = js.native
  /* 0x10 */ @js.native
  object Banned extends TopLevel[Banned with Double]
  
  /* 0x04 */ @js.native
  object Disconnected extends TopLevel[Disconnected with Double]
  
  /* 0x01 */ @js.native
  object Entered extends TopLevel[Entered with Double]
  
  /* 0x08 */ @js.native
  object Kicked extends TopLevel[Kicked with Double]
  
  /* 0x02 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 0x2000 */ @js.native
  object VoiceDoneSpeaking extends TopLevel[VoiceDoneSpeaking with Double]
  
  /* 0x1000 */ @js.native
  object VoiceSpeaking extends TopLevel[VoiceSpeaking with Double]
  
}

