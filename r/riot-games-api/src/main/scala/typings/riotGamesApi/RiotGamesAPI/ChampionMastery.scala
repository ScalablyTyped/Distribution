package typings.riotGamesApi.RiotGamesAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * championmastery
  */
object ChampionMastery {
  
  trait ChampionMasteryDto extends StObject {
    
    var championId: Double
    
    var championLevel: Double
    
    var championPoints: Double
    
    var championPointsSinceLastLevel: Double
    
    var championPointsUntilNextLevel: Double
    
    var chestGranted: Boolean
    
    var highestGrade: String
    
    var lastPlayTime: Double
    
    var playerId: Double
  }
  object ChampionMasteryDto {
    
    inline def apply(
      championId: Double,
      championLevel: Double,
      championPoints: Double,
      championPointsSinceLastLevel: Double,
      championPointsUntilNextLevel: Double,
      chestGranted: Boolean,
      highestGrade: String,
      lastPlayTime: Double,
      playerId: Double
    ): ChampionMasteryDto = {
      val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], championLevel = championLevel.asInstanceOf[js.Any], championPoints = championPoints.asInstanceOf[js.Any], championPointsSinceLastLevel = championPointsSinceLastLevel.asInstanceOf[js.Any], championPointsUntilNextLevel = championPointsUntilNextLevel.asInstanceOf[js.Any], chestGranted = chestGranted.asInstanceOf[js.Any], highestGrade = highestGrade.asInstanceOf[js.Any], lastPlayTime = lastPlayTime.asInstanceOf[js.Any], playerId = playerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChampionMasteryDto]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChampionMasteryDto] (val x: Self) extends AnyVal {
      
      inline def setChampionId(value: Double): Self = StObject.set(x, "championId", value.asInstanceOf[js.Any])
      
      inline def setChampionLevel(value: Double): Self = StObject.set(x, "championLevel", value.asInstanceOf[js.Any])
      
      inline def setChampionPoints(value: Double): Self = StObject.set(x, "championPoints", value.asInstanceOf[js.Any])
      
      inline def setChampionPointsSinceLastLevel(value: Double): Self = StObject.set(x, "championPointsSinceLastLevel", value.asInstanceOf[js.Any])
      
      inline def setChampionPointsUntilNextLevel(value: Double): Self = StObject.set(x, "championPointsUntilNextLevel", value.asInstanceOf[js.Any])
      
      inline def setChestGranted(value: Boolean): Self = StObject.set(x, "chestGranted", value.asInstanceOf[js.Any])
      
      inline def setHighestGrade(value: String): Self = StObject.set(x, "highestGrade", value.asInstanceOf[js.Any])
      
      inline def setLastPlayTime(value: Double): Self = StObject.set(x, "lastPlayTime", value.asInstanceOf[js.Any])
      
      inline def setPlayerId(value: Double): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    }
  }
}
