package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatRoomGroupAction extends StObject
@JSImport("steam-user", "EChatRoomGroupAction")
@js.native
object EChatRoomGroupAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomGroupAction & Double] = js.native
  
  @js.native
  sealed trait Ban
    extends StObject
       with EChatRoomGroupAction
  /* 3 */ val Ban: typings.steamUser.mod.EChatRoomGroupAction.Ban & Double = js.native
  
  @js.native
  sealed trait ChangeGroupRoles
    extends StObject
       with EChatRoomGroupAction
  /* 8 */ val ChangeGroupRoles: typings.steamUser.mod.EChatRoomGroupAction.ChangeGroupRoles & Double = js.native
  
  @js.native
  sealed trait ChangeTaglineAvatarName
    extends StObject
       with EChatRoomGroupAction
  /* 5 */ val ChangeTaglineAvatarName: typings.steamUser.mod.EChatRoomGroupAction.ChangeTaglineAvatarName & Double = js.native
  
  @js.native
  sealed trait ChangeUserRoles
    extends StObject
       with EChatRoomGroupAction
  /* 9 */ val ChangeUserRoles: typings.steamUser.mod.EChatRoomGroupAction.ChangeUserRoles & Double = js.native
  
  @js.native
  sealed trait Chat
    extends StObject
       with EChatRoomGroupAction
  /* 6 */ val Chat: typings.steamUser.mod.EChatRoomGroupAction.Chat & Double = js.native
  
  @js.native
  sealed trait CreateRenameDeleteChannel
    extends StObject
       with EChatRoomGroupAction
  /* 1 */ val CreateRenameDeleteChannel: typings.steamUser.mod.EChatRoomGroupAction.CreateRenameDeleteChannel & Double = js.native
  
  @js.native
  sealed trait Default
    extends StObject
       with EChatRoomGroupAction
  /* 0 */ val Default: typings.steamUser.mod.EChatRoomGroupAction.Default & Double = js.native
  
  @js.native
  sealed trait Invite
    extends StObject
       with EChatRoomGroupAction
  /* 4 */ val Invite: typings.steamUser.mod.EChatRoomGroupAction.Invite & Double = js.native
  
  @js.native
  sealed trait Kick
    extends StObject
       with EChatRoomGroupAction
  /* 2 */ val Kick: typings.steamUser.mod.EChatRoomGroupAction.Kick & Double = js.native
  
  @js.native
  sealed trait MentionAll
    extends StObject
       with EChatRoomGroupAction
  /* 10 */ val MentionAll: typings.steamUser.mod.EChatRoomGroupAction.MentionAll & Double = js.native
  
  @js.native
  sealed trait SetWatchingBroadcast
    extends StObject
       with EChatRoomGroupAction
  /* 11 */ val SetWatchingBroadcast: typings.steamUser.mod.EChatRoomGroupAction.SetWatchingBroadcast & Double = js.native
  
  @js.native
  sealed trait ViewHistory
    extends StObject
       with EChatRoomGroupAction
  /* 7 */ val ViewHistory: typings.steamUser.mod.EChatRoomGroupAction.ViewHistory & Double = js.native
}
