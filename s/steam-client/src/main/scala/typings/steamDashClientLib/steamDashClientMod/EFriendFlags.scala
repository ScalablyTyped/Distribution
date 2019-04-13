package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EFriendFlags extends js.Object

@JSImport("steam-client", "EFriendFlags")
@js.native
object EFriendFlags extends js.Object {
  @js.native
  sealed trait Blocked
    extends steamDashClientLib.steamDashClientMod.EFriendFlags
  
  @js.native
  sealed trait ChatMember
    extends steamDashClientLib.steamDashClientMod.EFriendFlags
  
  @js.native
  sealed trait ClanMember
    extends steamDashClientLib.steamDashClientMod.EFriendFlags
  
  @js.native
  sealed trait FlagAll
    extends steamDashClientLib.steamDashClientMod.EFriendFlags
  
  @js.native
  sealed trait FriendshipRequested
    extends steamDashClientLib.steamDashClientMod.EFriendFlags
  
  @js.native
  sealed trait Ignored
    extends steamDashClientLib.steamDashClientMod.EFriendFlags
  
  @js.native
  sealed trait IgnoredFriend
    extends steamDashClientLib.steamDashClientMod.EFriendFlags
  
  @js.native
  sealed trait Immediate
    extends steamDashClientLib.steamDashClientMod.EFriendFlags
  
  @js.native
  sealed trait None
    extends steamDashClientLib.steamDashClientMod.EFriendFlags
  
  @js.native
  sealed trait OnGameServer
    extends steamDashClientLib.steamDashClientMod.EFriendFlags
  
  @js.native
  sealed trait RequestingFriendship
    extends steamDashClientLib.steamDashClientMod.EFriendFlags
  
  @js.native
  sealed trait RequestingInfo
    extends steamDashClientLib.steamDashClientMod.EFriendFlags
  
  @js.native
  sealed trait Suggested
    extends steamDashClientLib.steamDashClientMod.EFriendFlags
  
  /* 1 */ val Blocked: Blocked with scala.Double = js.native
  /* 4096 */ val ChatMember: ChatMember with scala.Double = js.native
  /* 8 */ val ClanMember: ClanMember with scala.Double = js.native
  /* 65535 */ val FlagAll: FlagAll with scala.Double = js.native
  /* 2 */ val FriendshipRequested: FriendshipRequested with scala.Double = js.native
  /* 512 */ val Ignored: Ignored with scala.Double = js.native
  /* 1024 */ val IgnoredFriend: IgnoredFriend with scala.Double = js.native
  /* 4 */ val Immediate: Immediate with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 16 */ val OnGameServer: OnGameServer with scala.Double = js.native
  /* 128 */ val RequestingFriendship: RequestingFriendship with scala.Double = js.native
  /* 256 */ val RequestingInfo: RequestingInfo with scala.Double = js.native
  /* 2048 */ val Suggested: Suggested with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EFriendFlags with scala.Double] = js.native
}

