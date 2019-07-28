package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EFriendFlags extends js.Object

@JSImport("steam-client", "EFriendFlags")
@js.native
object EFriendFlags extends js.Object {
  @js.native
  sealed trait Blocked extends EFriendFlags
  
  @js.native
  sealed trait ChatMember extends EFriendFlags
  
  @js.native
  sealed trait ClanMember extends EFriendFlags
  
  @js.native
  sealed trait FlagAll extends EFriendFlags
  
  @js.native
  sealed trait FriendshipRequested extends EFriendFlags
  
  @js.native
  sealed trait Ignored extends EFriendFlags
  
  @js.native
  sealed trait IgnoredFriend extends EFriendFlags
  
  @js.native
  sealed trait Immediate extends EFriendFlags
  
  @js.native
  sealed trait None extends EFriendFlags
  
  @js.native
  sealed trait OnGameServer extends EFriendFlags
  
  @js.native
  sealed trait RequestingFriendship extends EFriendFlags
  
  @js.native
  sealed trait RequestingInfo extends EFriendFlags
  
  @js.native
  sealed trait Suggested extends EFriendFlags
  
  /* 1 */ val Blocked: typings.steamDashClient.steamDashClientMod.EFriendFlags.Blocked with Double = js.native
  /* 4096 */ val ChatMember: typings.steamDashClient.steamDashClientMod.EFriendFlags.ChatMember with Double = js.native
  /* 8 */ val ClanMember: typings.steamDashClient.steamDashClientMod.EFriendFlags.ClanMember with Double = js.native
  /* 65535 */ val FlagAll: typings.steamDashClient.steamDashClientMod.EFriendFlags.FlagAll with Double = js.native
  /* 2 */ val FriendshipRequested: typings.steamDashClient.steamDashClientMod.EFriendFlags.FriendshipRequested with Double = js.native
  /* 512 */ val Ignored: typings.steamDashClient.steamDashClientMod.EFriendFlags.Ignored with Double = js.native
  /* 1024 */ val IgnoredFriend: typings.steamDashClient.steamDashClientMod.EFriendFlags.IgnoredFriend with Double = js.native
  /* 4 */ val Immediate: typings.steamDashClient.steamDashClientMod.EFriendFlags.Immediate with Double = js.native
  /* 0 */ val None: typings.steamDashClient.steamDashClientMod.EFriendFlags.None with Double = js.native
  /* 16 */ val OnGameServer: typings.steamDashClient.steamDashClientMod.EFriendFlags.OnGameServer with Double = js.native
  /* 128 */ val RequestingFriendship: typings.steamDashClient.steamDashClientMod.EFriendFlags.RequestingFriendship with Double = js.native
  /* 256 */ val RequestingInfo: typings.steamDashClient.steamDashClientMod.EFriendFlags.RequestingInfo with Double = js.native
  /* 2048 */ val Suggested: typings.steamDashClient.steamDashClientMod.EFriendFlags.Suggested with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EFriendFlags with Double] = js.native
}

