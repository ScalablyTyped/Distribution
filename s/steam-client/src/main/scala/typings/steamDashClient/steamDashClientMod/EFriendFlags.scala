package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.EFriendFlags.Blocked
import typings.steamDashClient.steamDashClientMod.EFriendFlags.ChatMember
import typings.steamDashClient.steamDashClientMod.EFriendFlags.ClanMember
import typings.steamDashClient.steamDashClientMod.EFriendFlags.FlagAll
import typings.steamDashClient.steamDashClientMod.EFriendFlags.FriendshipRequested
import typings.steamDashClient.steamDashClientMod.EFriendFlags.Ignored
import typings.steamDashClient.steamDashClientMod.EFriendFlags.IgnoredFriend
import typings.steamDashClient.steamDashClientMod.EFriendFlags.Immediate
import typings.steamDashClient.steamDashClientMod.EFriendFlags.None
import typings.steamDashClient.steamDashClientMod.EFriendFlags.OnGameServer
import typings.steamDashClient.steamDashClientMod.EFriendFlags.RequestingFriendship
import typings.steamDashClient.steamDashClientMod.EFriendFlags.RequestingInfo
import typings.steamDashClient.steamDashClientMod.EFriendFlags.Suggested
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EFriendFlags with Double] = js.native
  /* 1 */ @js.native
  object Blocked extends TopLevel[Blocked with Double]
  
  /* 4096 */ @js.native
  object ChatMember extends TopLevel[ChatMember with Double]
  
  /* 8 */ @js.native
  object ClanMember extends TopLevel[ClanMember with Double]
  
  /* 65535 */ @js.native
  object FlagAll extends TopLevel[FlagAll with Double]
  
  /* 2 */ @js.native
  object FriendshipRequested extends TopLevel[FriendshipRequested with Double]
  
  /* 512 */ @js.native
  object Ignored extends TopLevel[Ignored with Double]
  
  /* 1024 */ @js.native
  object IgnoredFriend extends TopLevel[IgnoredFriend with Double]
  
  /* 4 */ @js.native
  object Immediate extends TopLevel[Immediate with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 16 */ @js.native
  object OnGameServer extends TopLevel[OnGameServer with Double]
  
  /* 128 */ @js.native
  object RequestingFriendship extends TopLevel[RequestingFriendship with Double]
  
  /* 256 */ @js.native
  object RequestingInfo extends TopLevel[RequestingInfo with Double]
  
  /* 2048 */ @js.native
  object Suggested extends TopLevel[Suggested with Double]
  
}

