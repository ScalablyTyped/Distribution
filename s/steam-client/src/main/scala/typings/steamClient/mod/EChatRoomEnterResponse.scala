package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatRoomEnterResponse extends js.Object
@JSImport("steam-client", "EChatRoomEnterResponse")
@js.native
object EChatRoomEnterResponse extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomEnterResponse with Double] = js.native
  
  @js.native
  sealed trait Banned extends EChatRoomEnterResponse
  /* 6 */ @js.native
  object Banned extends TopLevel[Banned with Double]
  
  @js.native
  sealed trait ClanDisabled extends EChatRoomEnterResponse
  /* 8 */ @js.native
  object ClanDisabled extends TopLevel[ClanDisabled with Double]
  
  @js.native
  sealed trait CommunityBan extends EChatRoomEnterResponse
  /* 9 */ @js.native
  object CommunityBan extends TopLevel[CommunityBan with Double]
  
  @js.native
  sealed trait DoesntExist extends EChatRoomEnterResponse
  /* 2 */ @js.native
  object DoesntExist extends TopLevel[DoesntExist with Double]
  
  @js.native
  sealed trait Error extends EChatRoomEnterResponse
  /* 5 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait Full extends EChatRoomEnterResponse
  /* 4 */ @js.native
  object Full extends TopLevel[Full with Double]
  
  @js.native
  sealed trait Limited extends EChatRoomEnterResponse
  /* 7 */ @js.native
  object Limited extends TopLevel[Limited with Double]
  
  @js.native
  sealed trait MemberBlockedYou extends EChatRoomEnterResponse
  /* 10 */ @js.native
  object MemberBlockedYou extends TopLevel[MemberBlockedYou with Double]
  
  // these appear to have been removed
   // removed
  @js.native
  sealed trait NoRankingDataLobby extends EChatRoomEnterResponse
  /* 12 */ @js.native
  object NoRankingDataLobby extends TopLevel[NoRankingDataLobby with Double]
  
   // removed
  @js.native
  sealed trait NoRankingDataUser extends EChatRoomEnterResponse
  /* 13 */ @js.native
  object NoRankingDataUser extends TopLevel[NoRankingDataUser with Double]
  
  @js.native
  sealed trait NotAllowed extends EChatRoomEnterResponse
  /* 3 */ @js.native
  object NotAllowed extends TopLevel[NotAllowed with Double]
  
   // removed
  @js.native
  sealed trait RankOutOfRange extends EChatRoomEnterResponse
  /* 14 */ @js.native
  object RankOutOfRange extends TopLevel[RankOutOfRange with Double]
  
  @js.native
  sealed trait Success extends EChatRoomEnterResponse
  /* 1 */ @js.native
  object Success extends TopLevel[Success with Double]
  
  @js.native
  sealed trait YouBlockedMember extends EChatRoomEnterResponse
  /* 11 */ @js.native
  object YouBlockedMember extends TopLevel[YouBlockedMember with Double]
}
