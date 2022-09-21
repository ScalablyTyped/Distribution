package typings.riotGamesApi.RiotGamesAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * team-v2.4
  */
object Team {
  
  trait MatchHistorySummaryDto extends StObject {
    
    var assists: Double
    
    var date: Double
    
    var deaths: Double
    
    var gameId: Double
    
    var gameMode: String
    
    var invalid: Boolean
    
    var kills: Double
    
    var mapId: Double
    
    var opposingTeamKills: Double
    
    var opposingTeamName: String
    
    var win: Boolean
  }
  object MatchHistorySummaryDto {
    
    inline def apply(
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
    
    extension [Self <: MatchHistorySummaryDto](x: Self) {
      
      inline def setAssists(value: Double): Self = StObject.set(x, "assists", value.asInstanceOf[js.Any])
      
      inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDeaths(value: Double): Self = StObject.set(x, "deaths", value.asInstanceOf[js.Any])
      
      inline def setGameId(value: Double): Self = StObject.set(x, "gameId", value.asInstanceOf[js.Any])
      
      inline def setGameMode(value: String): Self = StObject.set(x, "gameMode", value.asInstanceOf[js.Any])
      
      inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setKills(value: Double): Self = StObject.set(x, "kills", value.asInstanceOf[js.Any])
      
      inline def setMapId(value: Double): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
      
      inline def setOpposingTeamKills(value: Double): Self = StObject.set(x, "opposingTeamKills", value.asInstanceOf[js.Any])
      
      inline def setOpposingTeamName(value: String): Self = StObject.set(x, "opposingTeamName", value.asInstanceOf[js.Any])
      
      inline def setWin(value: Boolean): Self = StObject.set(x, "win", value.asInstanceOf[js.Any])
    }
  }
  
  trait RosterDto extends StObject {
    
    var memberList: js.Array[TeamMemberInfoDto]
    
    var ownerId: Double
  }
  object RosterDto {
    
    inline def apply(memberList: js.Array[TeamMemberInfoDto], ownerId: Double): RosterDto = {
      val __obj = js.Dynamic.literal(memberList = memberList.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RosterDto]
    }
    
    extension [Self <: RosterDto](x: Self) {
      
      inline def setMemberList(value: js.Array[TeamMemberInfoDto]): Self = StObject.set(x, "memberList", value.asInstanceOf[js.Any])
      
      inline def setMemberListVarargs(value: TeamMemberInfoDto*): Self = StObject.set(x, "memberList", js.Array(value*))
      
      inline def setOwnerId(value: Double): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    }
  }
  
  trait TeamDto extends StObject {
    
    var createDate: Double
    
    var fullId: String
    
    var lastGameDate: Double
    
    var lastJoinDate: Double
    
    var lastJoinedRankedTeamQueueDate: Double
    
    var matchHistory: js.Array[MatchHistorySummaryDto]
    
    var modifyDate: Double
    
    var name: String
    
    var roster: RosterDto
    
    var secondLastJoinDate: Double
    
    var status: String
    
    var tag: String
    
    var teamStatDetails: js.Array[TeamStatDetailDto]
    
    var thirdLastJoinDate: Double
  }
  object TeamDto {
    
    inline def apply(
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
    
    extension [Self <: TeamDto](x: Self) {
      
      inline def setCreateDate(value: Double): Self = StObject.set(x, "createDate", value.asInstanceOf[js.Any])
      
      inline def setFullId(value: String): Self = StObject.set(x, "fullId", value.asInstanceOf[js.Any])
      
      inline def setLastGameDate(value: Double): Self = StObject.set(x, "lastGameDate", value.asInstanceOf[js.Any])
      
      inline def setLastJoinDate(value: Double): Self = StObject.set(x, "lastJoinDate", value.asInstanceOf[js.Any])
      
      inline def setLastJoinedRankedTeamQueueDate(value: Double): Self = StObject.set(x, "lastJoinedRankedTeamQueueDate", value.asInstanceOf[js.Any])
      
      inline def setMatchHistory(value: js.Array[MatchHistorySummaryDto]): Self = StObject.set(x, "matchHistory", value.asInstanceOf[js.Any])
      
      inline def setMatchHistoryVarargs(value: MatchHistorySummaryDto*): Self = StObject.set(x, "matchHistory", js.Array(value*))
      
      inline def setModifyDate(value: Double): Self = StObject.set(x, "modifyDate", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRoster(value: RosterDto): Self = StObject.set(x, "roster", value.asInstanceOf[js.Any])
      
      inline def setSecondLastJoinDate(value: Double): Self = StObject.set(x, "secondLastJoinDate", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTeamStatDetails(value: js.Array[TeamStatDetailDto]): Self = StObject.set(x, "teamStatDetails", value.asInstanceOf[js.Any])
      
      inline def setTeamStatDetailsVarargs(value: TeamStatDetailDto*): Self = StObject.set(x, "teamStatDetails", js.Array(value*))
      
      inline def setThirdLastJoinDate(value: Double): Self = StObject.set(x, "thirdLastJoinDate", value.asInstanceOf[js.Any])
    }
  }
  
  trait TeamMemberInfoDto extends StObject {
    
    var inviteDate: Double
    
    var joinDate: Double
    
    var playerId: Double
    
    var status: String
  }
  object TeamMemberInfoDto {
    
    inline def apply(inviteDate: Double, joinDate: Double, playerId: Double, status: String): TeamMemberInfoDto = {
      val __obj = js.Dynamic.literal(inviteDate = inviteDate.asInstanceOf[js.Any], joinDate = joinDate.asInstanceOf[js.Any], playerId = playerId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[TeamMemberInfoDto]
    }
    
    extension [Self <: TeamMemberInfoDto](x: Self) {
      
      inline def setInviteDate(value: Double): Self = StObject.set(x, "inviteDate", value.asInstanceOf[js.Any])
      
      inline def setJoinDate(value: Double): Self = StObject.set(x, "joinDate", value.asInstanceOf[js.Any])
      
      inline def setPlayerId(value: Double): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait TeamStatDetailDto extends StObject {
    
    var averageGamesPlayed: Double
    
    var losses: Double
    
    var teamStatType: String
    
    var wins: Double
  }
  object TeamStatDetailDto {
    
    inline def apply(averageGamesPlayed: Double, losses: Double, teamStatType: String, wins: Double): TeamStatDetailDto = {
      val __obj = js.Dynamic.literal(averageGamesPlayed = averageGamesPlayed.asInstanceOf[js.Any], losses = losses.asInstanceOf[js.Any], teamStatType = teamStatType.asInstanceOf[js.Any], wins = wins.asInstanceOf[js.Any])
      __obj.asInstanceOf[TeamStatDetailDto]
    }
    
    extension [Self <: TeamStatDetailDto](x: Self) {
      
      inline def setAverageGamesPlayed(value: Double): Self = StObject.set(x, "averageGamesPlayed", value.asInstanceOf[js.Any])
      
      inline def setLosses(value: Double): Self = StObject.set(x, "losses", value.asInstanceOf[js.Any])
      
      inline def setTeamStatType(value: String): Self = StObject.set(x, "teamStatType", value.asInstanceOf[js.Any])
      
      inline def setWins(value: Double): Self = StObject.set(x, "wins", value.asInstanceOf[js.Any])
    }
  }
}
