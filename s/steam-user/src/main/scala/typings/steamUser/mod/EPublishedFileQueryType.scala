package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPublishedFileQueryType extends StObject
@JSImport("steam-user", "EPublishedFileQueryType")
@js.native
object EPublishedFileQueryType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPublishedFileQueryType & Double] = js.native
  
  @js.native
  sealed trait AcceptedForGameRankedByAcceptanceDate
    extends StObject
       with EPublishedFileQueryType
  /* 2 */ val AcceptedForGameRankedByAcceptanceDate: typings.steamUser.mod.EPublishedFileQueryType.AcceptedForGameRankedByAcceptanceDate & Double = js.native
  
  @js.native
  sealed trait CreatedByFollowedUsersRankedByPublicationDate
    extends StObject
       with EPublishedFileQueryType
  /* 7 */ val CreatedByFollowedUsersRankedByPublicationDate: typings.steamUser.mod.EPublishedFileQueryType.CreatedByFollowedUsersRankedByPublicationDate & Double = js.native
  
  @js.native
  sealed trait CreatedByFriendsRankedByPublicationDate
    extends StObject
       with EPublishedFileQueryType
  /* 5 */ val CreatedByFriendsRankedByPublicationDate: typings.steamUser.mod.EPublishedFileQueryType.CreatedByFriendsRankedByPublicationDate & Double = js.native
  
  @js.native
  sealed trait FavoritedByFriendsRankedByPublicationDate
    extends StObject
       with EPublishedFileQueryType
  /* 4 */ val FavoritedByFriendsRankedByPublicationDate: typings.steamUser.mod.EPublishedFileQueryType.FavoritedByFriendsRankedByPublicationDate & Double = js.native
  
  @js.native
  sealed trait NotYetRated
    extends StObject
       with EPublishedFileQueryType
  /* 8 */ val NotYetRated: typings.steamUser.mod.EPublishedFileQueryType.NotYetRated & Double = js.native
  
  @js.native
  sealed trait RankedByAveragePlaytimeTrend
    extends StObject
       with EPublishedFileQueryType
  /* 15 */ val RankedByAveragePlaytimeTrend: typings.steamUser.mod.EPublishedFileQueryType.RankedByAveragePlaytimeTrend & Double = js.native
  
  @js.native
  sealed trait RankedByInappropriateContentRating
    extends StObject
       with EPublishedFileQueryType
  /* 19 */ val RankedByInappropriateContentRating: typings.steamUser.mod.EPublishedFileQueryType.RankedByInappropriateContentRating & Double = js.native
  
  @js.native
  sealed trait RankedByLifetimeAveragePlaytime
    extends StObject
       with EPublishedFileQueryType
  /* 16 */ val RankedByLifetimeAveragePlaytime: typings.steamUser.mod.EPublishedFileQueryType.RankedByLifetimeAveragePlaytime & Double = js.native
  
  @js.native
  sealed trait RankedByLifetimePlaytimeSessions
    extends StObject
       with EPublishedFileQueryType
  /* 18 */ val RankedByLifetimePlaytimeSessions: typings.steamUser.mod.EPublishedFileQueryType.RankedByLifetimePlaytimeSessions & Double = js.native
  
  @js.native
  sealed trait RankedByNumTimesReported
    extends StObject
       with EPublishedFileQueryType
  /* 6 */ val RankedByNumTimesReported: typings.steamUser.mod.EPublishedFileQueryType.RankedByNumTimesReported & Double = js.native
  
  @js.native
  sealed trait RankedByPlaytimeSessionsTrend
    extends StObject
       with EPublishedFileQueryType
  /* 17 */ val RankedByPlaytimeSessionsTrend: typings.steamUser.mod.EPublishedFileQueryType.RankedByPlaytimeSessionsTrend & Double = js.native
  
  @js.native
  sealed trait RankedByPlaytimeTrend
    extends StObject
       with EPublishedFileQueryType
  /* 13 */ val RankedByPlaytimeTrend: typings.steamUser.mod.EPublishedFileQueryType.RankedByPlaytimeTrend & Double = js.native
  
  @js.native
  sealed trait RankedByPublicationDate
    extends StObject
       with EPublishedFileQueryType
  /* 1 */ val RankedByPublicationDate: typings.steamUser.mod.EPublishedFileQueryType.RankedByPublicationDate & Double = js.native
  
  @js.native
  sealed trait RankedByTextSearch
    extends StObject
       with EPublishedFileQueryType
  /* 12 */ val RankedByTextSearch: typings.steamUser.mod.EPublishedFileQueryType.RankedByTextSearch & Double = js.native
  
  @js.native
  sealed trait RankedByTotalPlaytime
    extends StObject
       with EPublishedFileQueryType
  /* 14 */ val RankedByTotalPlaytime: typings.steamUser.mod.EPublishedFileQueryType.RankedByTotalPlaytime & Double = js.native
  
  @js.native
  sealed trait RankedByTotalUniqueSubscriptions
    extends StObject
       with EPublishedFileQueryType
  /* 9 */ val RankedByTotalUniqueSubscriptions: typings.steamUser.mod.EPublishedFileQueryType.RankedByTotalUniqueSubscriptions & Double = js.native
  
  @js.native
  sealed trait RankedByTotalVotesAsc
    extends StObject
       with EPublishedFileQueryType
  /* 10 */ val RankedByTotalVotesAsc: typings.steamUser.mod.EPublishedFileQueryType.RankedByTotalVotesAsc & Double = js.native
  
  @js.native
  sealed trait RankedByTrend
    extends StObject
       with EPublishedFileQueryType
  /* 3 */ val RankedByTrend: typings.steamUser.mod.EPublishedFileQueryType.RankedByTrend & Double = js.native
  
  @js.native
  sealed trait RankedByVote
    extends StObject
       with EPublishedFileQueryType
  /* 0 */ val RankedByVote: typings.steamUser.mod.EPublishedFileQueryType.RankedByVote & Double = js.native
  
  @js.native
  sealed trait RankedByVotesUp
    extends StObject
       with EPublishedFileQueryType
  /* 11 */ val RankedByVotesUp: typings.steamUser.mod.EPublishedFileQueryType.RankedByVotesUp & Double = js.native
}
