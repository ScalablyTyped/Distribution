package typings.riotGamesApi.RiotGamesAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * champion-v1.2
  */
object Champion {
  
  trait ChampionDto extends StObject {
    
    var active: Boolean
    
    var botEnabled: Boolean
    
    var botMmEnabled: Boolean
    
    var freeToPlay: Boolean
    
    var id: Double
    
    var rankedPlayEnabled: Boolean
  }
  object ChampionDto {
    
    inline def apply(
      active: Boolean,
      botEnabled: Boolean,
      botMmEnabled: Boolean,
      freeToPlay: Boolean,
      id: Double,
      rankedPlayEnabled: Boolean
    ): ChampionDto = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], botEnabled = botEnabled.asInstanceOf[js.Any], botMmEnabled = botMmEnabled.asInstanceOf[js.Any], freeToPlay = freeToPlay.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rankedPlayEnabled = rankedPlayEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChampionDto]
    }
    
    extension [Self <: ChampionDto](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setBotEnabled(value: Boolean): Self = StObject.set(x, "botEnabled", value.asInstanceOf[js.Any])
      
      inline def setBotMmEnabled(value: Boolean): Self = StObject.set(x, "botMmEnabled", value.asInstanceOf[js.Any])
      
      inline def setFreeToPlay(value: Boolean): Self = StObject.set(x, "freeToPlay", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRankedPlayEnabled(value: Boolean): Self = StObject.set(x, "rankedPlayEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChampionListDto extends StObject {
    
    var champions: js.Array[ChampionDto]
  }
  object ChampionListDto {
    
    inline def apply(champions: js.Array[ChampionDto]): ChampionListDto = {
      val __obj = js.Dynamic.literal(champions = champions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChampionListDto]
    }
    
    extension [Self <: ChampionListDto](x: Self) {
      
      inline def setChampions(value: js.Array[ChampionDto]): Self = StObject.set(x, "champions", value.asInstanceOf[js.Any])
      
      inline def setChampionsVarargs(value: ChampionDto*): Self = StObject.set(x, "champions", js.Array(value :_*))
    }
  }
}
