package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EFriendFlags extends js.Object
@JSImport("steam-client", "EFriendFlags")
@js.native
object EFriendFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EFriendFlags with Double] = js.native
  
  @js.native
  sealed trait Blocked extends EFriendFlags
  /* 1 */ @js.native
  object Blocked extends TopLevel[Blocked with Double]
  
  @js.native
  sealed trait ChatMember extends EFriendFlags
  /* 4096 */ @js.native
  object ChatMember extends TopLevel[ChatMember with Double]
  
  @js.native
  sealed trait ClanMember extends EFriendFlags
  /* 8 */ @js.native
  object ClanMember extends TopLevel[ClanMember with Double]
  
  @js.native
  sealed trait FlagAll extends EFriendFlags
  /* 65535 */ @js.native
  object FlagAll extends TopLevel[FlagAll with Double]
  
  @js.native
  sealed trait FriendshipRequested extends EFriendFlags
  /* 2 */ @js.native
  object FriendshipRequested extends TopLevel[FriendshipRequested with Double]
  
  @js.native
  sealed trait Ignored extends EFriendFlags
  /* 512 */ @js.native
  object Ignored extends TopLevel[Ignored with Double]
  
  @js.native
  sealed trait IgnoredFriend extends EFriendFlags
  /* 1024 */ @js.native
  object IgnoredFriend extends TopLevel[IgnoredFriend with Double]
  
  @js.native
  sealed trait Immediate extends EFriendFlags
  /* 4 */ @js.native
  object Immediate extends TopLevel[Immediate with Double]
  
  @js.native
  sealed trait None extends EFriendFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait OnGameServer extends EFriendFlags
  /* 16 */ @js.native
  object OnGameServer extends TopLevel[OnGameServer with Double]
  
  @js.native
  sealed trait RequestingFriendship extends EFriendFlags
  /* 128 */ @js.native
  object RequestingFriendship extends TopLevel[RequestingFriendship with Double]
  
  @js.native
  sealed trait RequestingInfo extends EFriendFlags
  /* 256 */ @js.native
  object RequestingInfo extends TopLevel[RequestingInfo with Double]
  
  @js.native
  sealed trait Suggested extends EFriendFlags
  /* 2048 */ @js.native
  object Suggested extends TopLevel[Suggested with Double]
}
