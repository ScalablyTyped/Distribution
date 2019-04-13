package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EFriendRelationship extends js.Object

@JSImport("steam-client", "EFriendRelationship")
@js.native
object EFriendRelationship extends js.Object {
  @js.native
  sealed trait Blocked
    extends steamDashClientLib.steamDashClientMod.EFriendRelationship
  
  @js.native
  sealed trait Friend
    extends steamDashClientLib.steamDashClientMod.EFriendRelationship
  
  @js.native
  sealed trait Ignored
    extends steamDashClientLib.steamDashClientMod.EFriendRelationship
  
  @js.native
  sealed trait IgnoredFriend
    extends steamDashClientLib.steamDashClientMod.EFriendRelationship
  
  @js.native
  sealed trait Max
    extends steamDashClientLib.steamDashClientMod.EFriendRelationship
  
  @js.native
  sealed trait None
    extends steamDashClientLib.steamDashClientMod.EFriendRelationship
  
  @js.native
  sealed trait RequestInitiator
    extends steamDashClientLib.steamDashClientMod.EFriendRelationship
  
  @js.native
  sealed trait RequestRecipient
    extends steamDashClientLib.steamDashClientMod.EFriendRelationship
  
  @js.native
  sealed trait SuggestedFriend
    extends steamDashClientLib.steamDashClientMod.EFriendRelationship
  
  /* 1 */ val Blocked: Blocked with scala.Double = js.native
  /* 3 */ val Friend: Friend with scala.Double = js.native
  /* 5 */ val Ignored: Ignored with scala.Double = js.native
  /* 6 */ val IgnoredFriend: IgnoredFriend with scala.Double = js.native
  /* 8 */ val Max: Max with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 4 */ val RequestInitiator: RequestInitiator with scala.Double = js.native
  /* 2 */ val RequestRecipient: RequestRecipient with scala.Double = js.native
  /* 7 */ val SuggestedFriend: SuggestedFriend with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EFriendRelationship with scala.Double] = js.native
}

