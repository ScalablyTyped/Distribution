package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatRoomServerMsg extends StObject
@JSImport("steam-user", "EChatRoomServerMsg")
@js.native
object EChatRoomServerMsg extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomServerMsg & Double] = js.native
  
  @js.native
  sealed trait AppCustom
    extends StObject
       with EChatRoomServerMsg
  /* 11 */ val AppCustom: typings.steamUser.mod.EChatRoomServerMsg.AppCustom & Double = js.native
  
  @js.native
  sealed trait ChatRoomAvatarChanged
    extends StObject
       with EChatRoomServerMsg
  /* 10 */ val ChatRoomAvatarChanged: typings.steamUser.mod.EChatRoomServerMsg.ChatRoomAvatarChanged & Double = js.native
  
  @js.native
  sealed trait ChatRoomTaglineChanged
    extends StObject
       with EChatRoomServerMsg
  /* 9 */ val ChatRoomTaglineChanged: typings.steamUser.mod.EChatRoomServerMsg.ChatRoomTaglineChanged & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EChatRoomServerMsg
  /* 0 */ val Invalid: typings.steamUser.mod.EChatRoomServerMsg.Invalid & Double = js.native
  
  @js.native
  sealed trait InviteDismissed
    extends StObject
       with EChatRoomServerMsg
  /* 8 */ val InviteDismissed: typings.steamUser.mod.EChatRoomServerMsg.InviteDismissed & Double = js.native
  
  @js.native
  sealed trait Invited
    extends StObject
       with EChatRoomServerMsg
  /* 5 */ val Invited: typings.steamUser.mod.EChatRoomServerMsg.Invited & Double = js.native
  
  @js.native
  sealed trait Joined
    extends StObject
       with EChatRoomServerMsg
  /* 2 */ val Joined: typings.steamUser.mod.EChatRoomServerMsg.Joined & Double = js.native
  
  @js.native
  sealed trait Kicked
    extends StObject
       with EChatRoomServerMsg
  /* 4 */ val Kicked: typings.steamUser.mod.EChatRoomServerMsg.Kicked & Double = js.native
  
  @js.native
  sealed trait Parted
    extends StObject
       with EChatRoomServerMsg
  /* 3 */ val Parted: typings.steamUser.mod.EChatRoomServerMsg.Parted & Double = js.native
  
  @js.native
  sealed trait RenameChatRoom
    extends StObject
       with EChatRoomServerMsg
  /* 1 */ val RenameChatRoom: typings.steamUser.mod.EChatRoomServerMsg.RenameChatRoom & Double = js.native
}
