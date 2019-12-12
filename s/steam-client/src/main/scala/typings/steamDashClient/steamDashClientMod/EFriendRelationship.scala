package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.EFriendRelationship.Blocked
import typings.steamDashClient.steamDashClientMod.EFriendRelationship.Friend
import typings.steamDashClient.steamDashClientMod.EFriendRelationship.Ignored
import typings.steamDashClient.steamDashClientMod.EFriendRelationship.IgnoredFriend
import typings.steamDashClient.steamDashClientMod.EFriendRelationship.Max
import typings.steamDashClient.steamDashClientMod.EFriendRelationship.None
import typings.steamDashClient.steamDashClientMod.EFriendRelationship.RequestInitiator
import typings.steamDashClient.steamDashClientMod.EFriendRelationship.RequestRecipient
import typings.steamDashClient.steamDashClientMod.EFriendRelationship.SuggestedFriend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EFriendRelationship extends js.Object

@JSImport("steam-client", "EFriendRelationship")
@js.native
object EFriendRelationship extends js.Object {
  @js.native
  sealed trait Blocked extends EFriendRelationship
  
  @js.native
  sealed trait Friend extends EFriendRelationship
  
  @js.native
  sealed trait Ignored extends EFriendRelationship
  
  @js.native
  sealed trait IgnoredFriend extends EFriendRelationship
  
  @js.native
  sealed trait Max extends EFriendRelationship
  
  @js.native
  sealed trait None extends EFriendRelationship
  
  @js.native
  sealed trait RequestInitiator extends EFriendRelationship
  
  @js.native
  sealed trait RequestRecipient extends EFriendRelationship
  
  @js.native
  sealed trait SuggestedFriend extends EFriendRelationship
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EFriendRelationship with Double] = js.native
  /* 1 */ @js.native
  object Blocked extends TopLevel[Blocked with Double]
  
  /* 3 */ @js.native
  object Friend extends TopLevel[Friend with Double]
  
  /* 5 */ @js.native
  object Ignored extends TopLevel[Ignored with Double]
  
  /* 6 */ @js.native
  object IgnoredFriend extends TopLevel[IgnoredFriend with Double]
  
  /* 8 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 4 */ @js.native
  object RequestInitiator extends TopLevel[RequestInitiator with Double]
  
  /* 2 */ @js.native
  object RequestRecipient extends TopLevel[RequestRecipient with Double]
  
  /* 7 */ @js.native
  object SuggestedFriend extends TopLevel[SuggestedFriend with Double]
  
}

