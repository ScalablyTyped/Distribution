package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatRoomEnterResponse extends js.Object

@JSImport("steam-client", "EChatRoomEnterResponse")
@js.native
object EChatRoomEnterResponse extends js.Object {
  @js.native
  sealed trait Banned
    extends steamDashClientLib.steamDashClientMod.EChatRoomEnterResponse
  
  @js.native
  sealed trait ClanDisabled
    extends steamDashClientLib.steamDashClientMod.EChatRoomEnterResponse
  
  @js.native
  sealed trait CommunityBan
    extends steamDashClientLib.steamDashClientMod.EChatRoomEnterResponse
  
  @js.native
  sealed trait DoesntExist
    extends steamDashClientLib.steamDashClientMod.EChatRoomEnterResponse
  
  @js.native
  sealed trait Error
    extends steamDashClientLib.steamDashClientMod.EChatRoomEnterResponse
  
  @js.native
  sealed trait Full
    extends steamDashClientLib.steamDashClientMod.EChatRoomEnterResponse
  
  @js.native
  sealed trait Limited
    extends steamDashClientLib.steamDashClientMod.EChatRoomEnterResponse
  
  @js.native
  sealed trait MemberBlockedYou
    extends steamDashClientLib.steamDashClientMod.EChatRoomEnterResponse
  
  // these appear to have been removed
   // removed
  @js.native
  sealed trait NoRankingDataLobby
    extends steamDashClientLib.steamDashClientMod.EChatRoomEnterResponse
  
   // removed
  @js.native
  sealed trait NoRankingDataUser
    extends steamDashClientLib.steamDashClientMod.EChatRoomEnterResponse
  
  @js.native
  sealed trait NotAllowed
    extends steamDashClientLib.steamDashClientMod.EChatRoomEnterResponse
  
   // removed
  @js.native
  sealed trait RankOutOfRange
    extends steamDashClientLib.steamDashClientMod.EChatRoomEnterResponse
  
  @js.native
  sealed trait Success
    extends steamDashClientLib.steamDashClientMod.EChatRoomEnterResponse
  
  @js.native
  sealed trait YouBlockedMember
    extends steamDashClientLib.steamDashClientMod.EChatRoomEnterResponse
  
  /* 6 */ val Banned: Banned with scala.Double = js.native
  /* 8 */ val ClanDisabled: ClanDisabled with scala.Double = js.native
  /* 9 */ val CommunityBan: CommunityBan with scala.Double = js.native
  /* 2 */ val DoesntExist: DoesntExist with scala.Double = js.native
  /* 5 */ val Error: Error with scala.Double = js.native
  /* 4 */ val Full: Full with scala.Double = js.native
  /* 7 */ val Limited: Limited with scala.Double = js.native
  /* 10 */ val MemberBlockedYou: MemberBlockedYou with scala.Double = js.native
  /* 12 */ val NoRankingDataLobby: NoRankingDataLobby with scala.Double = js.native
  /* 13 */ val NoRankingDataUser: NoRankingDataUser with scala.Double = js.native
  /* 3 */ val NotAllowed: NotAllowed with scala.Double = js.native
  /* 14 */ val RankOutOfRange: RankOutOfRange with scala.Double = js.native
  /* 1 */ val Success: Success with scala.Double = js.native
  /* 11 */ val YouBlockedMember: YouBlockedMember with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EChatRoomEnterResponse with scala.Double] = js.native
}

