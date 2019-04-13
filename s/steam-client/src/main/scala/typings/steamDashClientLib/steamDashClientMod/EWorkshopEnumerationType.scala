package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EWorkshopEnumerationType extends js.Object

@JSImport("steam-client", "EWorkshopEnumerationType")
@js.native
object EWorkshopEnumerationType extends js.Object {
  @js.native
  sealed trait ContentByFriends
    extends steamDashClientLib.steamDashClientMod.EWorkshopEnumerationType
  
  @js.native
  sealed trait FavoriteOfFriends
    extends steamDashClientLib.steamDashClientMod.EWorkshopEnumerationType
  
  @js.native
  sealed trait RankedByVote
    extends steamDashClientLib.steamDashClientMod.EWorkshopEnumerationType
  
  @js.native
  sealed trait Recent
    extends steamDashClientLib.steamDashClientMod.EWorkshopEnumerationType
  
  @js.native
  sealed trait RecentFromFollowedUsers
    extends steamDashClientLib.steamDashClientMod.EWorkshopEnumerationType
  
  @js.native
  sealed trait Trending
    extends steamDashClientLib.steamDashClientMod.EWorkshopEnumerationType
  
  @js.native
  sealed trait VotedByFriends
    extends steamDashClientLib.steamDashClientMod.EWorkshopEnumerationType
  
  /* 5 */ val ContentByFriends: ContentByFriends with scala.Double = js.native
  /* 3 */ val FavoriteOfFriends: FavoriteOfFriends with scala.Double = js.native
  /* 0 */ val RankedByVote: RankedByVote with scala.Double = js.native
  /* 1 */ val Recent: Recent with scala.Double = js.native
  /* 6 */ val RecentFromFollowedUsers: RecentFromFollowedUsers with scala.Double = js.native
  /* 2 */ val Trending: Trending with scala.Double = js.native
  /* 4 */ val VotedByFriends: VotedByFriends with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EWorkshopEnumerationType with scala.Double] = js.native
}

