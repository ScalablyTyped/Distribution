package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatRoomEnterResponse extends StObject
@JSImport("steam-user", "EChatRoomEnterResponse")
@js.native
object EChatRoomEnterResponse extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomEnterResponse & Double] = js.native
  
  @js.native
  sealed trait Banned
    extends StObject
       with EChatRoomEnterResponse
  /* 6 */ val Banned: typings.steamUser.mod.EChatRoomEnterResponse.Banned & Double = js.native
  
  @js.native
  sealed trait ClanDisabled
    extends StObject
       with EChatRoomEnterResponse
  /* 8 */ val ClanDisabled: typings.steamUser.mod.EChatRoomEnterResponse.ClanDisabled & Double = js.native
  
  @js.native
  sealed trait CommunityBan
    extends StObject
       with EChatRoomEnterResponse
  /* 9 */ val CommunityBan: typings.steamUser.mod.EChatRoomEnterResponse.CommunityBan & Double = js.native
  
  @js.native
  sealed trait DoesntExist
    extends StObject
       with EChatRoomEnterResponse
  /* 2 */ val DoesntExist: typings.steamUser.mod.EChatRoomEnterResponse.DoesntExist & Double = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with EChatRoomEnterResponse
  /* 5 */ val Error: typings.steamUser.mod.EChatRoomEnterResponse.Error & Double = js.native
  
  @js.native
  sealed trait Full
    extends StObject
       with EChatRoomEnterResponse
  /* 4 */ val Full: typings.steamUser.mod.EChatRoomEnterResponse.Full & Double = js.native
  
  @js.native
  sealed trait Limited
    extends StObject
       with EChatRoomEnterResponse
  /* 7 */ val Limited: typings.steamUser.mod.EChatRoomEnterResponse.Limited & Double = js.native
  
  @js.native
  sealed trait MemberBlockedYou
    extends StObject
       with EChatRoomEnterResponse
  /* 10 */ val MemberBlockedYou: typings.steamUser.mod.EChatRoomEnterResponse.MemberBlockedYou & Double = js.native
  
  @js.native
  sealed trait NoRankingDataLobby
    extends StObject
       with EChatRoomEnterResponse
  /* 12 */ val NoRankingDataLobby: typings.steamUser.mod.EChatRoomEnterResponse.NoRankingDataLobby & Double = js.native
  
  @js.native
  sealed trait NoRankingDataUser
    extends StObject
       with EChatRoomEnterResponse
  /* 13 */ val NoRankingDataUser: typings.steamUser.mod.EChatRoomEnterResponse.NoRankingDataUser & Double = js.native
  
  @js.native
  sealed trait NotAllowed
    extends StObject
       with EChatRoomEnterResponse
  /* 3 */ val NotAllowed: typings.steamUser.mod.EChatRoomEnterResponse.NotAllowed & Double = js.native
  
  @js.native
  sealed trait RankOutOfRange
    extends StObject
       with EChatRoomEnterResponse
  /* 14 */ val RankOutOfRange: typings.steamUser.mod.EChatRoomEnterResponse.RankOutOfRange & Double = js.native
  
  @js.native
  sealed trait Success
    extends StObject
       with EChatRoomEnterResponse
  /* 1 */ val Success: typings.steamUser.mod.EChatRoomEnterResponse.Success & Double = js.native
  
  @js.native
  sealed trait YouBlockedMember
    extends StObject
       with EChatRoomEnterResponse
  /* 11 */ val YouBlockedMember: typings.steamUser.mod.EChatRoomEnterResponse.YouBlockedMember & Double = js.native
}
