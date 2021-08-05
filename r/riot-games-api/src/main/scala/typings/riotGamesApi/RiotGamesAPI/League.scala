package typings.riotGamesApi.RiotGamesAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * league-v2.5
  */
object League {
  
  trait LeagueDto extends StObject {
    
    var entries: js.Array[LeagueEntryDto]
    
    var name: String
    
    var participantId: String
    
    var queue: String
    
    var tier: String
  }
  object LeagueDto {
    
    inline def apply(
      entries: js.Array[LeagueEntryDto],
      name: String,
      participantId: String,
      queue: String,
      tier: String
    ): LeagueDto = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], participantId = participantId.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], tier = tier.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeagueDto]
    }
    
    extension [Self <: LeagueDto](x: Self) {
      
      inline def setEntries(value: js.Array[LeagueEntryDto]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesVarargs(value: LeagueEntryDto*): Self = StObject.set(x, "entries", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParticipantId(value: String): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    }
  }
  
  trait LeagueEntryDto extends StObject {
    
    var division: String
    
    var isFreshBlood: Boolean
    
    var isHotStreak: Boolean
    
    var isInactive: Boolean
    
    var isVeteran: Boolean
    
    var leaguePoints: Double
    
    var losses: Double
    
    var miniSeries: MiniSeriesDto
    
    var playerOrTeamId: String
    
    var playerOrTeamName: String
    
    var wins: Double
  }
  object LeagueEntryDto {
    
    inline def apply(
      division: String,
      isFreshBlood: Boolean,
      isHotStreak: Boolean,
      isInactive: Boolean,
      isVeteran: Boolean,
      leaguePoints: Double,
      losses: Double,
      miniSeries: MiniSeriesDto,
      playerOrTeamId: String,
      playerOrTeamName: String,
      wins: Double
    ): LeagueEntryDto = {
      val __obj = js.Dynamic.literal(division = division.asInstanceOf[js.Any], isFreshBlood = isFreshBlood.asInstanceOf[js.Any], isHotStreak = isHotStreak.asInstanceOf[js.Any], isInactive = isInactive.asInstanceOf[js.Any], isVeteran = isVeteran.asInstanceOf[js.Any], leaguePoints = leaguePoints.asInstanceOf[js.Any], losses = losses.asInstanceOf[js.Any], miniSeries = miniSeries.asInstanceOf[js.Any], playerOrTeamId = playerOrTeamId.asInstanceOf[js.Any], playerOrTeamName = playerOrTeamName.asInstanceOf[js.Any], wins = wins.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeagueEntryDto]
    }
    
    extension [Self <: LeagueEntryDto](x: Self) {
      
      inline def setDivision(value: String): Self = StObject.set(x, "division", value.asInstanceOf[js.Any])
      
      inline def setIsFreshBlood(value: Boolean): Self = StObject.set(x, "isFreshBlood", value.asInstanceOf[js.Any])
      
      inline def setIsHotStreak(value: Boolean): Self = StObject.set(x, "isHotStreak", value.asInstanceOf[js.Any])
      
      inline def setIsInactive(value: Boolean): Self = StObject.set(x, "isInactive", value.asInstanceOf[js.Any])
      
      inline def setIsVeteran(value: Boolean): Self = StObject.set(x, "isVeteran", value.asInstanceOf[js.Any])
      
      inline def setLeaguePoints(value: Double): Self = StObject.set(x, "leaguePoints", value.asInstanceOf[js.Any])
      
      inline def setLosses(value: Double): Self = StObject.set(x, "losses", value.asInstanceOf[js.Any])
      
      inline def setMiniSeries(value: MiniSeriesDto): Self = StObject.set(x, "miniSeries", value.asInstanceOf[js.Any])
      
      inline def setPlayerOrTeamId(value: String): Self = StObject.set(x, "playerOrTeamId", value.asInstanceOf[js.Any])
      
      inline def setPlayerOrTeamName(value: String): Self = StObject.set(x, "playerOrTeamName", value.asInstanceOf[js.Any])
      
      inline def setWins(value: Double): Self = StObject.set(x, "wins", value.asInstanceOf[js.Any])
    }
  }
  
  trait MiniSeriesDto extends StObject {
    
    var losses: Double
    
    var progress: String
    
    var target: Double
    
    var wins: Double
  }
  object MiniSeriesDto {
    
    inline def apply(losses: Double, progress: String, target: Double, wins: Double): MiniSeriesDto = {
      val __obj = js.Dynamic.literal(losses = losses.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], wins = wins.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiniSeriesDto]
    }
    
    extension [Self <: MiniSeriesDto](x: Self) {
      
      inline def setLosses(value: Double): Self = StObject.set(x, "losses", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setWins(value: Double): Self = StObject.set(x, "wins", value.asInstanceOf[js.Any])
    }
  }
}
