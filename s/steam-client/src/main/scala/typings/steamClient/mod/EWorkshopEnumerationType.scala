package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EWorkshopEnumerationType extends StObject
@JSImport("steam-client", "EWorkshopEnumerationType")
@js.native
object EWorkshopEnumerationType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EWorkshopEnumerationType with Double] = js.native
  
  @js.native
  sealed trait ContentByFriends extends EWorkshopEnumerationType
  /* 5 */ val ContentByFriends: typings.steamClient.mod.EWorkshopEnumerationType.ContentByFriends with Double = js.native
  
  @js.native
  sealed trait FavoriteOfFriends extends EWorkshopEnumerationType
  /* 3 */ val FavoriteOfFriends: typings.steamClient.mod.EWorkshopEnumerationType.FavoriteOfFriends with Double = js.native
  
  @js.native
  sealed trait RankedByVote extends EWorkshopEnumerationType
  /* 0 */ val RankedByVote: typings.steamClient.mod.EWorkshopEnumerationType.RankedByVote with Double = js.native
  
  @js.native
  sealed trait Recent extends EWorkshopEnumerationType
  /* 1 */ val Recent: typings.steamClient.mod.EWorkshopEnumerationType.Recent with Double = js.native
  
  @js.native
  sealed trait RecentFromFollowedUsers extends EWorkshopEnumerationType
  /* 6 */ val RecentFromFollowedUsers: typings.steamClient.mod.EWorkshopEnumerationType.RecentFromFollowedUsers with Double = js.native
  
  @js.native
  sealed trait Trending extends EWorkshopEnumerationType
  /* 2 */ val Trending: typings.steamClient.mod.EWorkshopEnumerationType.Trending with Double = js.native
  
  @js.native
  sealed trait VotedByFriends extends EWorkshopEnumerationType
  /* 4 */ val VotedByFriends: typings.steamClient.mod.EWorkshopEnumerationType.VotedByFriends with Double = js.native
}
