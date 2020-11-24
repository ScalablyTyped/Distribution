package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecommendedDto extends js.Object {
  
  var block: js.Array[BlockDto] = js.native
  
  var champion: String = js.native
  
  var map: String = js.native
  
  var mode: String = js.native
  
  var priority: Boolean = js.native
  
  var title: String = js.native
  
  var `type`: String = js.native
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
  implicit class RecommendedDtoOps[Self <: RecommendedDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlockVarargs(value: BlockDto*): Self = this.set("block", js.Array(value :_*))
    
    @scala.inline
    def setBlock(value: js.Array[BlockDto]): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChampion(value: String): Self = this.set("champion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: String): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Boolean): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
