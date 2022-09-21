package typings.steamcommunity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EFriendRelationship extends StObject
@JSImport("steamcommunity", "EFriendRelationship")
@js.native
object EFriendRelationship extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EFriendRelationship & Double] = js.native
  
  @js.native
  sealed trait Blocked
    extends StObject
       with EFriendRelationship
  /* 1 */ val Blocked: typings.steamcommunity.mod.EFriendRelationship.Blocked & Double = js.native
  
  @js.native
  sealed trait Friend
    extends StObject
       with EFriendRelationship
  /* 3 */ val Friend: typings.steamcommunity.mod.EFriendRelationship.Friend & Double = js.native
  
  @js.native
  sealed trait Ignored
    extends StObject
       with EFriendRelationship
  /* 5 */ val Ignored: typings.steamcommunity.mod.EFriendRelationship.Ignored & Double = js.native
  
  @js.native
  sealed trait IgnoredFriend
    extends StObject
       with EFriendRelationship
  /* 6 */ val IgnoredFriend: typings.steamcommunity.mod.EFriendRelationship.IgnoredFriend & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EFriendRelationship
  /* 0 */ val None: typings.steamcommunity.mod.EFriendRelationship.None & Double = js.native
  
  @js.native
  sealed trait RequestInitiator
    extends StObject
       with EFriendRelationship
  /* 4 */ val RequestInitiator: typings.steamcommunity.mod.EFriendRelationship.RequestInitiator & Double = js.native
  
  @js.native
  sealed trait RequestRecipient
    extends StObject
       with EFriendRelationship
  /* 2 */ val RequestRecipient: typings.steamcommunity.mod.EFriendRelationship.RequestRecipient & Double = js.native
  
  @js.native
  sealed trait SuggestedFriend
    extends StObject
       with EFriendRelationship
  /* 7 */ val SuggestedFriend: typings.steamcommunity.mod.EFriendRelationship.SuggestedFriend & Double = js.native
}
