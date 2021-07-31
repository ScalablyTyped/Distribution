package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendedDto extends StObject {
  
  var block: js.Array[BlockDto]
  
  var champion: String
  
  var map: String
  
  var mode: String
  
  var priority: Boolean
  
  var title: String
  
  var `type`: String
}
object RecommendedDto {
  
  @scala.inline
  def apply(
    block: js.Array[BlockDto],
    champion: String,
    map: String,
    mode: String,
    priority: Boolean,
    title: String,
    `type`: String
  ): RecommendedDto = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], champion = champion.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendedDto]
  }
  
  @scala.inline
  implicit class RecommendedDtoMutableBuilder[Self <: RecommendedDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: js.Array[BlockDto]): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockVarargs(value: BlockDto*): Self = StObject.set(x, "block", js.Array(value :_*))
    
    @scala.inline
    def setChampion(value: String): Self = StObject.set(x, "champion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Boolean): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
