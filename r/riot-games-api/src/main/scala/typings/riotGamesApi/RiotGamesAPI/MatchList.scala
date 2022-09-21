package typings.riotGamesApi.RiotGamesAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * matchlist-v2.2
  */
object MatchList {
  
  trait MatchList extends StObject {
    
    var endIndex: Double
    
    var matches: js.Array[MatchReference]
    
    var startIndex: Double
    
    var totalGames: Double
  }
  object MatchList {
    
    inline def apply(endIndex: Double, matches: js.Array[MatchReference], startIndex: Double, totalGames: Double): typings.riotGamesApi.RiotGamesAPI.MatchList.MatchList = {
      val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], totalGames = totalGames.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.riotGamesApi.RiotGamesAPI.MatchList.MatchList]
    }
    
    extension [Self <: typings.riotGamesApi.RiotGamesAPI.MatchList.MatchList](x: Self) {
      
      inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
      
      inline def setMatches(value: js.Array[MatchReference]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesVarargs(value: MatchReference*): Self = StObject.set(x, "matches", js.Array(value*))
      
      inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setTotalGames(value: Double): Self = StObject.set(x, "totalGames", value.asInstanceOf[js.Any])
    }
  }
  
  trait MatchReference extends StObject {
    
    var champion: Double
    
    var lane: String
    
    var matchId: Double
    
    var plateformId: String
    
    var queue: String
    
    var region: String
    
    var role: String
    
    var season: String
    
    var timestamp: Double
  }
  object MatchReference {
    
    inline def apply(
      champion: Double,
      lane: String,
      matchId: Double,
      plateformId: String,
      queue: String,
      region: String,
      role: String,
      season: String,
      timestamp: Double
    ): MatchReference = {
      val __obj = js.Dynamic.literal(champion = champion.asInstanceOf[js.Any], lane = lane.asInstanceOf[js.Any], matchId = matchId.asInstanceOf[js.Any], plateformId = plateformId.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchReference]
    }
    
    extension [Self <: MatchReference](x: Self) {
      
      inline def setChampion(value: Double): Self = StObject.set(x, "champion", value.asInstanceOf[js.Any])
      
      inline def setLane(value: String): Self = StObject.set(x, "lane", value.asInstanceOf[js.Any])
      
      inline def setMatchId(value: Double): Self = StObject.set(x, "matchId", value.asInstanceOf[js.Any])
      
      inline def setPlateformId(value: String): Self = StObject.set(x, "plateformId", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setSeason(value: String): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
