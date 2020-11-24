package typings.riotGamesApi.RiotGamesAPI.Stats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChampionStatsDto extends js.Object {
  
  var id: Double = js.native
  
  var stats: AggregatedStatsDto = js.native
}
object ChampionStatsDto {
  
  @scala.inline
  def apply(id: Double, stats: AggregatedStatsDto): ChampionStatsDto = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChampionStatsDto]
  }
  
  @scala.inline
  implicit class ChampionStatsDtoOps[Self <: ChampionStatsDto] (val x: Self) extends AnyVal {
    
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: AggregatedStatsDto): Self = this.set("stats", value.asInstanceOf[js.Any])
  }
}
