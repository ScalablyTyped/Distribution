package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatMemberStateChange extends js.Object

@JSImport("steam-client", "EChatMemberStateChange")
@js.native
object EChatMemberStateChange extends js.Object {
  @js.native
  sealed trait Banned
    extends steamDashClientLib.steamDashClientMod.EChatMemberStateChange
  
  @js.native
  sealed trait Disconnected
    extends steamDashClientLib.steamDashClientMod.EChatMemberStateChange
  
  @js.native
  sealed trait Entered
    extends steamDashClientLib.steamDashClientMod.EChatMemberStateChange
  
  @js.native
  sealed trait Kicked
    extends steamDashClientLib.steamDashClientMod.EChatMemberStateChange
  
  @js.native
  sealed trait Left
    extends steamDashClientLib.steamDashClientMod.EChatMemberStateChange
  
  @js.native
  sealed trait VoiceDoneSpeaking
    extends steamDashClientLib.steamDashClientMod.EChatMemberStateChange
  
  @js.native
  sealed trait VoiceSpeaking
    extends steamDashClientLib.steamDashClientMod.EChatMemberStateChange
  
  /* 0x10 */ val Banned: Banned with scala.Double = js.native
  /* 0x04 */ val Disconnected: Disconnected with scala.Double = js.native
  /* 0x01 */ val Entered: Entered with scala.Double = js.native
  /* 0x08 */ val Kicked: Kicked with scala.Double = js.native
  /* 0x02 */ val Left: Left with scala.Double = js.native
  /* 0x2000 */ val VoiceDoneSpeaking: VoiceDoneSpeaking with scala.Double = js.native
  /* 0x1000 */ val VoiceSpeaking: VoiceSpeaking with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EChatMemberStateChange with scala.Double] = js.native
}

