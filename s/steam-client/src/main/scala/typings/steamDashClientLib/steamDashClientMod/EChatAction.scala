package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatAction extends js.Object

@JSImport("steam-client", "EChatAction")
@js.native
object EChatAction extends js.Object {
  @js.native
  sealed trait Ban
    extends steamDashClientLib.steamDashClientMod.EChatAction
  
  @js.native
  sealed trait CloseChat
    extends steamDashClientLib.steamDashClientMod.EChatAction
  
  @js.native
  sealed trait EndVoiceSpeak
    extends steamDashClientLib.steamDashClientMod.EChatAction
  
  @js.native
  sealed trait InviteChat
    extends steamDashClientLib.steamDashClientMod.EChatAction
  
  @js.native
  sealed trait Kick
    extends steamDashClientLib.steamDashClientMod.EChatAction
  
  @js.native
  sealed trait LockChat
    extends steamDashClientLib.steamDashClientMod.EChatAction
  
  @js.native
  sealed trait SetInvisibleToFriends
    extends steamDashClientLib.steamDashClientMod.EChatAction
  
  @js.native
  sealed trait SetJoinable
    extends steamDashClientLib.steamDashClientMod.EChatAction
  
  @js.native
  sealed trait SetModerated
    extends steamDashClientLib.steamDashClientMod.EChatAction
  
  @js.native
  sealed trait SetOwner
    extends steamDashClientLib.steamDashClientMod.EChatAction
  
  @js.native
  sealed trait SetUnjoinable
    extends steamDashClientLib.steamDashClientMod.EChatAction
  
  @js.native
  sealed trait SetUnmoderated
    extends steamDashClientLib.steamDashClientMod.EChatAction
  
  @js.native
  sealed trait SetVisibleToFriends
    extends steamDashClientLib.steamDashClientMod.EChatAction
  
  @js.native
  sealed trait StartVoiceSpeak
    extends steamDashClientLib.steamDashClientMod.EChatAction
  
  @js.native
  sealed trait UnBan
    extends steamDashClientLib.steamDashClientMod.EChatAction
  
  @js.native
  sealed trait UnlockChat
    extends steamDashClientLib.steamDashClientMod.EChatAction
  
  /* 3 */ val Ban: Ban with scala.Double = js.native
  /* 9 */ val CloseChat: CloseChat with scala.Double = js.native
  /* 6 */ val EndVoiceSpeak: EndVoiceSpeak with scala.Double = js.native
  /* 1 */ val InviteChat: InviteChat with scala.Double = js.native
  /* 2 */ val Kick: Kick with scala.Double = js.native
  /* 7 */ val LockChat: LockChat with scala.Double = js.native
  /* 13 */ val SetInvisibleToFriends: SetInvisibleToFriends with scala.Double = js.native
  /* 10 */ val SetJoinable: SetJoinable with scala.Double = js.native
  /* 15 */ val SetModerated: SetModerated with scala.Double = js.native
  /* 12 */ val SetOwner: SetOwner with scala.Double = js.native
  /* 11 */ val SetUnjoinable: SetUnjoinable with scala.Double = js.native
  /* 16 */ val SetUnmoderated: SetUnmoderated with scala.Double = js.native
  /* 14 */ val SetVisibleToFriends: SetVisibleToFriends with scala.Double = js.native
  /* 5 */ val StartVoiceSpeak: StartVoiceSpeak with scala.Double = js.native
  /* 4 */ val UnBan: UnBan with scala.Double = js.native
  /* 8 */ val UnlockChat: UnlockChat with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EChatAction with scala.Double] = js.native
}

