package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EWorkshopEnumerationType extends js.Object
@JSImport("steam-client", "EWorkshopEnumerationType")
@js.native
object EWorkshopEnumerationType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EWorkshopEnumerationType with Double] = js.native
  
  @js.native
  sealed trait ContentByFriends extends EWorkshopEnumerationType
  /* 5 */ @js.native
  object ContentByFriends extends TopLevel[ContentByFriends with Double]
  
  @js.native
  sealed trait FavoriteOfFriends extends EWorkshopEnumerationType
  /* 3 */ @js.native
  object FavoriteOfFriends extends TopLevel[FavoriteOfFriends with Double]
  
  @js.native
  sealed trait RankedByVote extends EWorkshopEnumerationType
  /* 0 */ @js.native
  object RankedByVote extends TopLevel[RankedByVote with Double]
  
  @js.native
  sealed trait Recent extends EWorkshopEnumerationType
  /* 1 */ @js.native
  object Recent extends TopLevel[Recent with Double]
  
  @js.native
  sealed trait RecentFromFollowedUsers extends EWorkshopEnumerationType
  /* 6 */ @js.native
  object RecentFromFollowedUsers extends TopLevel[RecentFromFollowedUsers with Double]
  
  @js.native
  sealed trait Trending extends EWorkshopEnumerationType
  /* 2 */ @js.native
  object Trending extends TopLevel[Trending with Double]
  
  @js.native
  sealed trait VotedByFriends extends EWorkshopEnumerationType
  /* 4 */ @js.native
  object VotedByFriends extends TopLevel[VotedByFriends with Double]
}
