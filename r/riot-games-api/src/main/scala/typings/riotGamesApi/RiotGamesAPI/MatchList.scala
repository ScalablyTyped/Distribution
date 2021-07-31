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
    
    @scala.inline
    def apply(endIndex: Double, matches: js.Array[MatchReference], startIndex: Double, totalGames: Double): typings.riotGamesApi.RiotGamesAPI.MatchList.MatchList = {
      val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], totalGames = totalGames.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.riotGamesApi.RiotGamesAPI.MatchList.MatchList]
    }
    
    @scala.inline
    implicit class MatchListMutableBuilder[Self <: typings.riotGamesApi.RiotGamesAPI.MatchList.MatchList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatches(value: js.Array[MatchReference]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchesVarargs(value: MatchReference*): Self = StObject.set(x, "matches", js.Array(value :_*))
      
      @scala.inline
      def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalGames(value: Double): Self = StObject.set(x, "totalGames", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class MatchReferenceMutableBuilder[Self <: MatchReference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChampion(value: Double): Self = StObject.set(x, "champion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLane(value: String): Self = StObject.set(x, "lane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchId(value: Double): Self = StObject.set(x, "matchId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlateformId(value: String): Self = StObject.set(x, "plateformId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeason(value: String): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
