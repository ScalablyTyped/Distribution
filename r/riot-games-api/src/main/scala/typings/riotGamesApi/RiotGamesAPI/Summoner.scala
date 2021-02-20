package typings.riotGamesApi.RiotGamesAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * summoner-v1.4
  */
object Summoner {
  
  @js.native
  trait MasteryDto extends StObject {
    
    var id: Double = js.native
    
    var rank: Double = js.native
  }
  object MasteryDto {
    
    @scala.inline
    def apply(id: Double, rank: Double): MasteryDto = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
      __obj.asInstanceOf[MasteryDto]
    }
    
    @scala.inline
    implicit class MasteryDtoMutableBuilder[Self <: MasteryDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MasteryPageDto extends StObject {
    
    var current: Boolean = js.native
    
    var id: Double = js.native
    
    var masteries: js.Array[MasteryDto] = js.native
    
    var name: String = js.native
  }
  object MasteryPageDto {
    
    @scala.inline
    def apply(current: Boolean, id: Double, masteries: js.Array[MasteryDto], name: String): MasteryPageDto = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], masteries = masteries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MasteryPageDto]
    }
    
    @scala.inline
    implicit class MasteryPageDtoMutableBuilder[Self <: MasteryPageDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasteries(value: js.Array[MasteryDto]): Self = StObject.set(x, "masteries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasteriesVarargs(value: MasteryDto*): Self = StObject.set(x, "masteries", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MasteryPagesDto extends StObject {
    
    var pages: js.Array[MasteryPageDto] = js.native
    
    var summonerId: Double = js.native
  }
  object MasteryPagesDto {
    
    @scala.inline
    def apply(pages: js.Array[MasteryPageDto], summonerId: Double): MasteryPagesDto = {
      val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MasteryPagesDto]
    }
    
    @scala.inline
    implicit class MasteryPagesDtoMutableBuilder[Self <: MasteryPagesDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPages(value: js.Array[MasteryPageDto]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagesVarargs(value: MasteryPageDto*): Self = StObject.set(x, "pages", js.Array(value :_*))
      
      @scala.inline
      def setSummonerId(value: Double): Self = StObject.set(x, "summonerId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RunePageDto extends StObject {
    
    var current: Boolean = js.native
    
    var id: Double = js.native
    
    var name: String = js.native
    
    var slots: js.Array[RuneSlotDto] = js.native
  }
  object RunePageDto {
    
    @scala.inline
    def apply(current: Boolean, id: Double, name: String, slots: js.Array[RuneSlotDto]): RunePageDto = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunePageDto]
    }
    
    @scala.inline
    implicit class RunePageDtoMutableBuilder[Self <: RunePageDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlots(value: js.Array[RuneSlotDto]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotsVarargs(value: RuneSlotDto*): Self = StObject.set(x, "slots", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RunePagesDto extends StObject {
    
    var pages: js.Array[RunePageDto] = js.native
    
    var summonerId: Double = js.native
  }
  object RunePagesDto {
    
    @scala.inline
    def apply(pages: js.Array[RunePageDto], summonerId: Double): RunePagesDto = {
      val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunePagesDto]
    }
    
    @scala.inline
    implicit class RunePagesDtoMutableBuilder[Self <: RunePagesDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPages(value: js.Array[RunePageDto]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagesVarargs(value: RunePageDto*): Self = StObject.set(x, "pages", js.Array(value :_*))
      
      @scala.inline
      def setSummonerId(value: Double): Self = StObject.set(x, "summonerId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RuneSlotDto extends StObject {
    
    var runeId: Double = js.native
    
    var runeSlotId: Double = js.native
  }
  object RuneSlotDto {
    
    @scala.inline
    def apply(runeId: Double, runeSlotId: Double): RuneSlotDto = {
      val __obj = js.Dynamic.literal(runeId = runeId.asInstanceOf[js.Any], runeSlotId = runeSlotId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuneSlotDto]
    }
    
    @scala.inline
    implicit class RuneSlotDtoMutableBuilder[Self <: RuneSlotDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRuneId(value: Double): Self = StObject.set(x, "runeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuneSlotId(value: Double): Self = StObject.set(x, "runeSlotId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SummonerDto extends StObject {
    
    var id: Double = js.native
    
    var name: String = js.native
    
    var profileIconId: Double = js.native
    
    var revisionDate: Double = js.native
    
    var summonerLevel: Double = js.native
  }
  object SummonerDto {
    
    @scala.inline
    def apply(id: Double, name: String, profileIconId: Double, revisionDate: Double, summonerLevel: Double): SummonerDto = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profileIconId = profileIconId.asInstanceOf[js.Any], revisionDate = revisionDate.asInstanceOf[js.Any], summonerLevel = summonerLevel.asInstanceOf[js.Any])
      __obj.asInstanceOf[SummonerDto]
    }
    
    @scala.inline
    implicit class SummonerDtoMutableBuilder[Self <: SummonerDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileIconId(value: Double): Self = StObject.set(x, "profileIconId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevisionDate(value: Double): Self = StObject.set(x, "revisionDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummonerLevel(value: Double): Self = StObject.set(x, "summonerLevel", value.asInstanceOf[js.Any])
    }
  }
}
