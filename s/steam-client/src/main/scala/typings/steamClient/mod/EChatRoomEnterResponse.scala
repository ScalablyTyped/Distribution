package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatRoomEnterResponse extends js.Object

@JSImport("steam-client", "EChatRoomEnterResponse")
@js.native
object EChatRoomEnterResponse extends js.Object {
  @js.native
  sealed trait Banned extends EChatRoomEnterResponse
  
  @js.native
  sealed trait ClanDisabled extends EChatRoomEnterResponse
  
  @js.native
  sealed trait CommunityBan extends EChatRoomEnterResponse
  
  @js.native
  sealed trait DoesntExist extends EChatRoomEnterResponse
  
  @js.native
  sealed trait Error extends EChatRoomEnterResponse
  
  @js.native
  sealed trait Full extends EChatRoomEnterResponse
  
  @js.native
  sealed trait Limited extends EChatRoomEnterResponse
  
  @js.native
  sealed trait MemberBlockedYou extends EChatRoomEnterResponse
  
  // these appear to have been removed
   // removed
  @js.native
  sealed trait NoRankingDataLobby extends EChatRoomEnterResponse
  
   // removed
  @js.native
  sealed trait NoRankingDataUser extends EChatRoomEnterResponse
  
  @js.native
  sealed trait NotAllowed extends EChatRoomEnterResponse
  
   // removed
  @js.native
  sealed trait RankOutOfRange extends EChatRoomEnterResponse
  
  @js.native
  sealed trait Success extends EChatRoomEnterResponse
  
  @js.native
  sealed trait YouBlockedMember extends EChatRoomEnterResponse
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomEnterResponse with Double] = js.native
  /* 6 */ @js.native
  object Banned extends TopLevel[Banned with Double]
  
  /* 8 */ @js.native
  object ClanDisabled extends TopLevel[ClanDisabled with Double]
  
  /* 9 */ @js.native
  object CommunityBan extends TopLevel[CommunityBan with Double]
  
  /* 2 */ @js.native
  object DoesntExist extends TopLevel[DoesntExist with Double]
  
  /* 5 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 4 */ @js.native
  object Full extends TopLevel[Full with Double]
  
  /* 7 */ @js.native
  object Limited extends TopLevel[Limited with Double]
  
  /* 10 */ @js.native
  object MemberBlockedYou extends TopLevel[MemberBlockedYou with Double]
  
  /* 12 */ @js.native
  object NoRankingDataLobby extends TopLevel[NoRankingDataLobby with Double]
  
  /* 13 */ @js.native
  object NoRankingDataUser extends TopLevel[NoRankingDataUser with Double]
  
  /* 3 */ @js.native
  object NotAllowed extends TopLevel[NotAllowed with Double]
  
  /* 14 */ @js.native
  object RankOutOfRange extends TopLevel[RankOutOfRange with Double]
  
  /* 1 */ @js.native
  object Success extends TopLevel[Success with Double]
  
  /* 11 */ @js.native
  object YouBlockedMember extends TopLevel[YouBlockedMember with Double]
  
}

