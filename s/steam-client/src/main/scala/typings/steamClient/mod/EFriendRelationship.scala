package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EFriendRelationship extends StObject
@JSImport("steam-client", "EFriendRelationship")
@js.native
object EFriendRelationship extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EFriendRelationship with Double] = js.native
  
  @js.native
  sealed trait Blocked extends EFriendRelationship
  /* 1 */ val Blocked: typings.steamClient.mod.EFriendRelationship.Blocked with Double = js.native
  
  @js.native
  sealed trait Friend extends EFriendRelationship
  /* 3 */ val Friend: typings.steamClient.mod.EFriendRelationship.Friend with Double = js.native
  
  @js.native
  sealed trait Ignored extends EFriendRelationship
  /* 5 */ val Ignored: typings.steamClient.mod.EFriendRelationship.Ignored with Double = js.native
  
  @js.native
  sealed trait IgnoredFriend extends EFriendRelationship
  /* 6 */ val IgnoredFriend: typings.steamClient.mod.EFriendRelationship.IgnoredFriend with Double = js.native
  
  @js.native
  sealed trait Max extends EFriendRelationship
  /* 8 */ val Max: typings.steamClient.mod.EFriendRelationship.Max with Double = js.native
  
  @js.native
  sealed trait None extends EFriendRelationship
  /* 0 */ val None: typings.steamClient.mod.EFriendRelationship.None with Double = js.native
  
  @js.native
  sealed trait RequestInitiator extends EFriendRelationship
  /* 4 */ val RequestInitiator: typings.steamClient.mod.EFriendRelationship.RequestInitiator with Double = js.native
  
  @js.native
  sealed trait RequestRecipient extends EFriendRelationship
  /* 2 */ val RequestRecipient: typings.steamClient.mod.EFriendRelationship.RequestRecipient with Double = js.native
  
  @js.native
  sealed trait SuggestedFriend extends EFriendRelationship
  /* 7 */ val SuggestedFriend: typings.steamClient.mod.EFriendRelationship.SuggestedFriend with Double = js.native
}
