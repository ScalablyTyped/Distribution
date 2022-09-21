package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EFriendFlags extends StObject
@JSImport("steam-user", "EFriendFlags")
@js.native
object EFriendFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EFriendFlags & Double] = js.native
  
  @js.native
  sealed trait Blocked
    extends StObject
       with EFriendFlags
  /* 1 */ val Blocked: typings.steamUser.mod.EFriendFlags.Blocked & Double = js.native
  
  @js.native
  sealed trait ChatMember
    extends StObject
       with EFriendFlags
  /* 4096 */ val ChatMember: typings.steamUser.mod.EFriendFlags.ChatMember & Double = js.native
  
  @js.native
  sealed trait ClanMember
    extends StObject
       with EFriendFlags
  /* 8 */ val ClanMember: typings.steamUser.mod.EFriendFlags.ClanMember & Double = js.native
  
  @js.native
  sealed trait FlagAll
    extends StObject
       with EFriendFlags
  /* 65535 */ val FlagAll: typings.steamUser.mod.EFriendFlags.FlagAll & Double = js.native
  
  @js.native
  sealed trait FriendshipRequested
    extends StObject
       with EFriendFlags
  /* 2 */ val FriendshipRequested: typings.steamUser.mod.EFriendFlags.FriendshipRequested & Double = js.native
  
  @js.native
  sealed trait Ignored
    extends StObject
       with EFriendFlags
  /* 512 */ val Ignored: typings.steamUser.mod.EFriendFlags.Ignored & Double = js.native
  
  @js.native
  sealed trait IgnoredFriend
    extends StObject
       with EFriendFlags
  /* 1024 */ val IgnoredFriend: typings.steamUser.mod.EFriendFlags.IgnoredFriend & Double = js.native
  
  @js.native
  sealed trait Immediate
    extends StObject
       with EFriendFlags
  /* 4 */ val Immediate: typings.steamUser.mod.EFriendFlags.Immediate & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EFriendFlags
  /* 0 */ val None: typings.steamUser.mod.EFriendFlags.None & Double = js.native
  
  @js.native
  sealed trait OnGameServer
    extends StObject
       with EFriendFlags
  /* 16 */ val OnGameServer: typings.steamUser.mod.EFriendFlags.OnGameServer & Double = js.native
  
  @js.native
  sealed trait RequestingFriendship
    extends StObject
       with EFriendFlags
  /* 128 */ val RequestingFriendship: typings.steamUser.mod.EFriendFlags.RequestingFriendship & Double = js.native
  
  @js.native
  sealed trait RequestingInfo
    extends StObject
       with EFriendFlags
  /* 256 */ val RequestingInfo: typings.steamUser.mod.EFriendFlags.RequestingInfo & Double = js.native
  
  @js.native
  sealed trait Suggested
    extends StObject
       with EFriendFlags
  /* 2048 */ val Suggested: typings.steamUser.mod.EFriendFlags.Suggested & Double = js.native
}
