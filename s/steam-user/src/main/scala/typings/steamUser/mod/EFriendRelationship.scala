package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EFriendRelationship extends StObject
@JSImport("steam-user", "EFriendRelationship")
@js.native
object EFriendRelationship extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EFriendRelationship & Double] = js.native
  
  @js.native
  sealed trait Blocked
    extends StObject
       with EFriendRelationship
  /* 1 */ val Blocked: typings.steamUser.mod.EFriendRelationship.Blocked & Double = js.native
  
  @js.native
  sealed trait Friend
    extends StObject
       with EFriendRelationship
  /* 3 */ val Friend: typings.steamUser.mod.EFriendRelationship.Friend & Double = js.native
  
  @js.native
  sealed trait Ignored
    extends StObject
       with EFriendRelationship
  /* 5 */ val Ignored: typings.steamUser.mod.EFriendRelationship.Ignored & Double = js.native
  
  @js.native
  sealed trait IgnoredFriend
    extends StObject
       with EFriendRelationship
  /* 6 */ val IgnoredFriend: typings.steamUser.mod.EFriendRelationship.IgnoredFriend & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EFriendRelationship
  /* 0 */ val None: typings.steamUser.mod.EFriendRelationship.None & Double = js.native
  
  @js.native
  sealed trait RequestInitiator
    extends StObject
       with EFriendRelationship
  /* 4 */ val RequestInitiator: typings.steamUser.mod.EFriendRelationship.RequestInitiator & Double = js.native
  
  @js.native
  sealed trait RequestRecipient
    extends StObject
       with EFriendRelationship
  /* 2 */ val RequestRecipient: typings.steamUser.mod.EFriendRelationship.RequestRecipient & Double = js.native
  
  @js.native
  sealed trait SuggestedFriend
    extends StObject
       with EFriendRelationship
  /* 7 */ val SuggestedFriend: typings.steamUser.mod.EFriendRelationship.SuggestedFriend & Double = js.native
}
