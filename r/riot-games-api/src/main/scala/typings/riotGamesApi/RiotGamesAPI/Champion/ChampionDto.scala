package typings.riotGamesApi.RiotGamesAPI.Champion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChampionDto extends js.Object {
  
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
  implicit class ChampionDtoOps[Self <: ChampionDto] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotEnabled(value: Boolean): Self = this.set("botEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotMmEnabled(value: Boolean): Self = this.set("botMmEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeToPlay(value: Boolean): Self = this.set("freeToPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankedPlayEnabled(value: Boolean): Self = this.set("rankedPlayEnabled", value.asInstanceOf[js.Any])
  }
}
