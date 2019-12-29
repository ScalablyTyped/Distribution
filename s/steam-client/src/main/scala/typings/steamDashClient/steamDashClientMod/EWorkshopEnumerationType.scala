package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EWorkshopEnumerationType extends js.Object

@JSImport("steam-client", "EWorkshopEnumerationType")
@js.native
object EWorkshopEnumerationType extends js.Object {
  @js.native
  sealed trait ContentByFriends extends EWorkshopEnumerationType
  
  @js.native
  sealed trait FavoriteOfFriends extends EWorkshopEnumerationType
  
  @js.native
  sealed trait RankedByVote extends EWorkshopEnumerationType
  
  @js.native
  sealed trait Recent extends EWorkshopEnumerationType
  
  @js.native
  sealed trait RecentFromFollowedUsers extends EWorkshopEnumerationType
  
  @js.native
  sealed trait Trending extends EWorkshopEnumerationType
  
  @js.native
  sealed trait VotedByFriends extends EWorkshopEnumerationType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EWorkshopEnumerationType with Double] = js.native
  /* 5 */ @js.native
  object ContentByFriends extends TopLevel[ContentByFriends with Double]
  
  /* 3 */ @js.native
  object FavoriteOfFriends extends TopLevel[FavoriteOfFriends with Double]
  
  /* 0 */ @js.native
  object RankedByVote extends TopLevel[RankedByVote with Double]
  
  /* 1 */ @js.native
  object Recent extends TopLevel[Recent with Double]
  
  /* 6 */ @js.native
  object RecentFromFollowedUsers extends TopLevel[RecentFromFollowedUsers with Double]
  
  /* 2 */ @js.native
  object Trending extends TopLevel[Trending with Double]
  
  /* 4 */ @js.native
  object VotedByFriends extends TopLevel[VotedByFriends with Double]
  
}

