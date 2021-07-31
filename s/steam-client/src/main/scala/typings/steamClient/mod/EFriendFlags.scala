package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EFriendFlags extends StObject
@JSImport("steam-client", "EFriendFlags")
@js.native
object EFriendFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EFriendFlags & Double] = js.native
  
  @js.native
  sealed trait Blocked
    extends StObject
       with EFriendFlags
  /* 1 */ val Blocked: typings.steamClient.mod.EFriendFlags.Blocked & Double = js.native
  
  @js.native
  sealed trait ChatMember
    extends StObject
       with EFriendFlags
  /* 4096 */ val ChatMember: typings.steamClient.mod.EFriendFlags.ChatMember & Double = js.native
  
  @js.native
  sealed trait ClanMember
    extends StObject
       with EFriendFlags
  /* 8 */ val ClanMember: typings.steamClient.mod.EFriendFlags.ClanMember & Double = js.native
  
  @js.native
  sealed trait FlagAll
    extends StObject
       with EFriendFlags
  /* 65535 */ val FlagAll: typings.steamClient.mod.EFriendFlags.FlagAll & Double = js.native
  
  @js.native
  sealed trait FriendshipRequested
    extends StObject
       with EFriendFlags
  /* 2 */ val FriendshipRequested: typings.steamClient.mod.EFriendFlags.FriendshipRequested & Double = js.native
  
  @js.native
  sealed trait Ignored
    extends StObject
       with EFriendFlags
  /* 512 */ val Ignored: typings.steamClient.mod.EFriendFlags.Ignored & Double = js.native
  
  @js.native
  sealed trait IgnoredFriend
    extends StObject
       with EFriendFlags
  /* 1024 */ val IgnoredFriend: typings.steamClient.mod.EFriendFlags.IgnoredFriend & Double = js.native
  
  @js.native
  sealed trait Immediate
    extends StObject
       with EFriendFlags
  /* 4 */ val Immediate: typings.steamClient.mod.EFriendFlags.Immediate & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EFriendFlags
  /* 0 */ val None: typings.steamClient.mod.EFriendFlags.None & Double = js.native
  
  @js.native
  sealed trait OnGameServer
    extends StObject
       with EFriendFlags
  /* 16 */ val OnGameServer: typings.steamClient.mod.EFriendFlags.OnGameServer & Double = js.native
  
  @js.native
  sealed trait RequestingFriendship
    extends StObject
       with EFriendFlags
  /* 128 */ val RequestingFriendship: typings.steamClient.mod.EFriendFlags.RequestingFriendship & Double = js.native
  
  @js.native
  sealed trait RequestingInfo
    extends StObject
       with EFriendFlags
  /* 256 */ val RequestingInfo: typings.steamClient.mod.EFriendFlags.RequestingInfo & Double = js.native
  
  @js.native
  sealed trait Suggested
    extends StObject
       with EFriendFlags
  /* 2048 */ val Suggested: typings.steamClient.mod.EFriendFlags.Suggested & Double = js.native
}
