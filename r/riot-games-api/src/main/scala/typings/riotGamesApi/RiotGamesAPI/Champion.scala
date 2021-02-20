package typings.riotGamesApi.RiotGamesAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * champion-v1.2
  */
object Champion {
  
  @js.native
  trait ChampionDto extends StObject {
    
    var active: Boolean = js.native
    
    var botEnabled: Boolean = js.native
    
    var botMmEnabled: Boolean = js.native
    
    var freeToPlay: Boolean = js.native
    
    var id: Double = js.native
    
    var rankedPlayEnabled: Boolean = js.native
  }
  object ChampionDto {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ChampionDtoMutableBuilder[Self <: ChampionDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBotEnabled(value: Boolean): Self = StObject.set(x, "botEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBotMmEnabled(value: Boolean): Self = StObject.set(x, "botMmEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreeToPlay(value: Boolean): Self = StObject.set(x, "freeToPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRankedPlayEnabled(value: Boolean): Self = StObject.set(x, "rankedPlayEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ChampionListDto extends StObject {
    
    var champions: js.Array[ChampionDto] = js.native
  }
  object ChampionListDto {
    
    @scala.inline
    def apply(champions: js.Array[ChampionDto]): ChampionListDto = {
      val __obj = js.Dynamic.literal(champions = champions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChampionListDto]
    }
    
    @scala.inline
    implicit class ChampionListDtoMutableBuilder[Self <: ChampionListDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChampions(value: js.Array[ChampionDto]): Self = StObject.set(x, "champions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChampionsVarargs(value: ChampionDto*): Self = StObject.set(x, "champions", js.Array(value :_*))
    }
  }
}
