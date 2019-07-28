package typings.steamDashClient.steamDashClientMod

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
  
  /* 5 */ val ContentByFriends: typings.steamDashClient.steamDashClientMod.EWorkshopEnumerationType.ContentByFriends with Double = js.native
  /* 3 */ val FavoriteOfFriends: typings.steamDashClient.steamDashClientMod.EWorkshopEnumerationType.FavoriteOfFriends with Double = js.native
  /* 0 */ val RankedByVote: typings.steamDashClient.steamDashClientMod.EWorkshopEnumerationType.RankedByVote with Double = js.native
  /* 1 */ val Recent: typings.steamDashClient.steamDashClientMod.EWorkshopEnumerationType.Recent with Double = js.native
  /* 6 */ val RecentFromFollowedUsers: typings.steamDashClient.steamDashClientMod.EWorkshopEnumerationType.RecentFromFollowedUsers with Double = js.native
  /* 2 */ val Trending: typings.steamDashClient.steamDashClientMod.EWorkshopEnumerationType.Trending with Double = js.native
  /* 4 */ val VotedByFriends: typings.steamDashClient.steamDashClientMod.EWorkshopEnumerationType.VotedByFriends with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EWorkshopEnumerationType with Double] = js.native
}

