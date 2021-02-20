package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EFriendFlags extends StObject
@JSImport("steam-client", "EFriendFlags")
@js.native
object EFriendFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EFriendFlags with Double] = js.native
  
  @js.native
  sealed trait Blocked extends EFriendFlags
  /* 1 */ val Blocked: typings.steamClient.mod.EFriendFlags.Blocked with Double = js.native
  
  @js.native
  sealed trait ChatMember extends EFriendFlags
  /* 4096 */ val ChatMember: typings.steamClient.mod.EFriendFlags.ChatMember with Double = js.native
  
  @js.native
  sealed trait ClanMember extends EFriendFlags
  /* 8 */ val ClanMember: typings.steamClient.mod.EFriendFlags.ClanMember with Double = js.native
  
  @js.native
  sealed trait FlagAll extends EFriendFlags
  /* 65535 */ val FlagAll: typings.steamClient.mod.EFriendFlags.FlagAll with Double = js.native
  
  @js.native
  sealed trait FriendshipRequested extends EFriendFlags
  /* 2 */ val FriendshipRequested: typings.steamClient.mod.EFriendFlags.FriendshipRequested with Double = js.native
  
  @js.native
  sealed trait Ignored extends EFriendFlags
  /* 512 */ val Ignored: typings.steamClient.mod.EFriendFlags.Ignored with Double = js.native
  
  @js.native
  sealed trait IgnoredFriend extends EFriendFlags
  /* 1024 */ val IgnoredFriend: typings.steamClient.mod.EFriendFlags.IgnoredFriend with Double = js.native
  
  @js.native
  sealed trait Immediate extends EFriendFlags
  /* 4 */ val Immediate: typings.steamClient.mod.EFriendFlags.Immediate with Double = js.native
  
  @js.native
  sealed trait None extends EFriendFlags
  /* 0 */ val None: typings.steamClient.mod.EFriendFlags.None with Double = js.native
  
  @js.native
  sealed trait OnGameServer extends EFriendFlags
  /* 16 */ val OnGameServer: typings.steamClient.mod.EFriendFlags.OnGameServer with Double = js.native
  
  @js.native
  sealed trait RequestingFriendship extends EFriendFlags
  /* 128 */ val RequestingFriendship: typings.steamClient.mod.EFriendFlags.RequestingFriendship with Double = js.native
  
  @js.native
  sealed trait RequestingInfo extends EFriendFlags
  /* 256 */ val RequestingInfo: typings.steamClient.mod.EFriendFlags.RequestingInfo with Double = js.native
  
  @js.native
  sealed trait Suggested extends EFriendFlags
  /* 2048 */ val Suggested: typings.steamClient.mod.EFriendFlags.Suggested with Double = js.native
}
