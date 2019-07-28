package typings.steamDashClient.steamDashClientMod

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
  
  /* 0x10 */ val Banned: typings.steamDashClient.steamDashClientMod.EChatMemberStateChange.Banned with Double = js.native
  /* 0x04 */ val Disconnected: typings.steamDashClient.steamDashClientMod.EChatMemberStateChange.Disconnected with Double = js.native
  /* 0x01 */ val Entered: typings.steamDashClient.steamDashClientMod.EChatMemberStateChange.Entered with Double = js.native
  /* 0x08 */ val Kicked: typings.steamDashClient.steamDashClientMod.EChatMemberStateChange.Kicked with Double = js.native
  /* 0x02 */ val Left: typings.steamDashClient.steamDashClientMod.EChatMemberStateChange.Left with Double = js.native
  /* 0x2000 */ val VoiceDoneSpeaking: typings.steamDashClient.steamDashClientMod.EChatMemberStateChange.VoiceDoneSpeaking with Double = js.native
  /* 0x1000 */ val VoiceSpeaking: typings.steamDashClient.steamDashClientMod.EChatMemberStateChange.VoiceSpeaking with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatMemberStateChange with Double] = js.native
}

