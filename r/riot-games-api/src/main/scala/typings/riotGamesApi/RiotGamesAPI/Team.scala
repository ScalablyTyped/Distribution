package typings.riotGamesApi.RiotGamesAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * team-v2.4
  */
object Team {
  
  @js.native
  trait MatchHistorySummaryDto extends StObject {
    
    var assists: Double = js.native
    
    var date: Double = js.native
    
    var deaths: Double = js.native
    
    var gameId: Double = js.native
    
    var gameMode: String = js.native
    
    var invalid: Boolean = js.native
    
    var kills: Double = js.native
    
    var mapId: Double = js.native
    
    var opposingTeamKills: Double = js.native
    
    var opposingTeamName: String = js.native
    
    var win: Boolean = js.native
  }
  object MatchHistorySummaryDto {
    
    @scala.inline
    def apply(
      assists: Double,
      date: Double,
      deaths: Double,
      gameId: Double,
      gameMode: String,
      invalid: Boolean,
      kills: Double,
      mapId: Double,
      opposingTeamKills: Double,
      opposingTeamName: String,
      win: Boolean
    ): MatchHistorySummaryDto = {
      val __obj = js.Dynamic.literal(assists = assists.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], deaths = deaths.asInstanceOf[js.Any], gameId = gameId.asInstanceOf[js.Any], gameMode = gameMode.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], kills = kills.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], opposingTeamKills = opposingTeamKills.asInstanceOf[js.Any], opposingTeamName = opposingTeamName.asInstanceOf[js.Any], win = win.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchHistorySummaryDto]
    }
    
    @scala.inline
    implicit class MatchHistorySummaryDtoMutableBuilder[Self <: MatchHistorySummaryDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssists(value: Double): Self = StObject.set(x, "assists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeaths(value: Double): Self = StObject.set(x, "deaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameId(value: Double): Self = StObject.set(x, "gameId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameMode(value: String): Self = StObject.set(x, "gameMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKills(value: Double): Self = StObject.set(x, "kills", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapId(value: Double): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpposingTeamKills(value: Double): Self = StObject.set(x, "opposingTeamKills", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpposingTeamName(value: String): Self = StObject.set(x, "opposingTeamName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWin(value: Boolean): Self = StObject.set(x, "win", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RosterDto extends StObject {
    
    var memberList: js.Array[TeamMemberInfoDto] = js.native
    
    var ownerId: Double = js.native
  }
  object RosterDto {
    
    @scala.inline
    def apply(memberList: js.Array[TeamMemberInfoDto], ownerId: Double): RosterDto = {
      val __obj = js.Dynamic.literal(memberList = memberList.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RosterDto]
    }
    
    @scala.inline
    implicit class RosterDtoMutableBuilder[Self <: RosterDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMemberList(value: js.Array[TeamMemberInfoDto]): Self = StObject.set(x, "memberList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemberListVarargs(value: TeamMemberInfoDto*): Self = StObject.set(x, "memberList", js.Array(value :_*))
      
      @scala.inline
      def setOwnerId(value: Double): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TeamDto extends StObject {
    
    var createDate: Double = js.native
    
    var fullId: String = js.native
    
    var lastGameDate: Double = js.native
    
    var lastJoinDate: Double = js.native
    
    var lastJoinedRankedTeamQueueDate: Double = js.native
    
    var matchHistory: js.Array[MatchHistorySummaryDto] = js.native
    
    var modifyDate: Double = js.native
    
    var name: String = js.native
    
    var roster: RosterDto = js.native
    
    var secondLastJoinDate: Double = js.native
    
    var status: String = js.native
    
    var tag: String = js.native
    
    var teamStatDetails: js.Array[TeamStatDetailDto] = js.native
    
    var thirdLastJoinDate: Double = js.native
  }
  object TeamDto {
    
    @scala.inline
    def apply(
      createDate: Double,
      fullId: String,
      lastGameDate: Double,
      lastJoinDate: Double,
      lastJoinedRankedTeamQueueDate: Double,
      matchHistory: js.Array[MatchHistorySummaryDto],
      modifyDate: Double,
      name: String,
      roster: RosterDto,
      secondLastJoinDate: Double,
      status: String,
      tag: String,
      teamStatDetails: js.Array[TeamStatDetailDto],
      thirdLastJoinDate: Double
    ): TeamDto = {
      val __obj = js.Dynamic.literal(createDate = createDate.asInstanceOf[js.Any], fullId = fullId.asInstanceOf[js.Any], lastGameDate = lastGameDate.asInstanceOf[js.Any], lastJoinDate = lastJoinDate.asInstanceOf[js.Any], lastJoinedRankedTeamQueueDate = lastJoinedRankedTeamQueueDate.asInstanceOf[js.Any], matchHistory = matchHistory.asInstanceOf[js.Any], modifyDate = modifyDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roster = roster.asInstanceOf[js.Any], secondLastJoinDate = secondLastJoinDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], teamStatDetails = teamStatDetails.asInstanceOf[js.Any], thirdLastJoinDate = thirdLastJoinDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[TeamDto]
    }
    
    @scala.inline
    implicit class TeamDtoMutableBuilder[Self <: TeamDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateDate(value: Double): Self = StObject.set(x, "createDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullId(value: String): Self = StObject.set(x, "fullId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastGameDate(value: Double): Self = StObject.set(x, "lastGameDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastJoinDate(value: Double): Self = StObject.set(x, "lastJoinDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastJoinedRankedTeamQueueDate(value: Double): Self = StObject.set(x, "lastJoinedRankedTeamQueueDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchHistory(value: js.Array[MatchHistorySummaryDto]): Self = StObject.set(x, "matchHistory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchHistoryVarargs(value: MatchHistorySummaryDto*): Self = StObject.set(x, "matchHistory", js.Array(value :_*))
      
      @scala.inline
      def setModifyDate(value: Double): Self = StObject.set(x, "modifyDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoster(value: RosterDto): Self = StObject.set(x, "roster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondLastJoinDate(value: Double): Self = StObject.set(x, "secondLastJoinDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamStatDetails(value: js.Array[TeamStatDetailDto]): Self = StObject.set(x, "teamStatDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamStatDetailsVarargs(value: TeamStatDetailDto*): Self = StObject.set(x, "teamStatDetails", js.Array(value :_*))
      
      @scala.inline
      def setThirdLastJoinDate(value: Double): Self = StObject.set(x, "thirdLastJoinDate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TeamMemberInfoDto extends StObject {
    
    var inviteDate: Double = js.native
    
    var joinDate: Double = js.native
    
    var playerId: Double = js.native
    
    var status: String = js.native
  }
  object TeamMemberInfoDto {
    
    @scala.inline
    def apply(inviteDate: Double, joinDate: Double, playerId: Double, status: String): TeamMemberInfoDto = {
      val __obj = js.Dynamic.literal(inviteDate = inviteDate.asInstanceOf[js.Any], joinDate = joinDate.asInstanceOf[js.Any], playerId = playerId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[TeamMemberInfoDto]
    }
    
    @scala.inline
    implicit class TeamMemberInfoDtoMutableBuilder[Self <: TeamMemberInfoDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInviteDate(value: Double): Self = StObject.set(x, "inviteDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinDate(value: Double): Self = StObject.set(x, "joinDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayerId(value: Double): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TeamStatDetailDto extends StObject {
    
    var averageGamesPlayed: Double = js.native
    
    var losses: Double = js.native
    
    var teamStatType: String = js.native
    
    var wins: Double = js.native
  }
  object TeamStatDetailDto {
    
    @scala.inline
    def apply(averageGamesPlayed: Double, losses: Double, teamStatType: String, wins: Double): TeamStatDetailDto = {
      val __obj = js.Dynamic.literal(averageGamesPlayed = averageGamesPlayed.asInstanceOf[js.Any], losses = losses.asInstanceOf[js.Any], teamStatType = teamStatType.asInstanceOf[js.Any], wins = wins.asInstanceOf[js.Any])
      __obj.asInstanceOf[TeamStatDetailDto]
    }
    
    @scala.inline
    implicit class TeamStatDetailDtoMutableBuilder[Self <: TeamStatDetailDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAverageGamesPlayed(value: Double): Self = StObject.set(x, "averageGamesPlayed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLosses(value: Double): Self = StObject.set(x, "losses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamStatType(value: String): Self = StObject.set(x, "teamStatType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWins(value: Double): Self = StObject.set(x, "wins", value.asInstanceOf[js.Any])
    }
  }
}
