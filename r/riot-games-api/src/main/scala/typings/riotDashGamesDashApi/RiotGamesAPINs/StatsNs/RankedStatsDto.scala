package typings.riotDashGamesDashApi.RiotGamesAPINs.StatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RankedStatsDto extends js.Object {
  var champions: js.Array[ChampionStatsDto]
  var modifyDate: Double
  var summonerId: Double
}

object RankedStatsDto {
  @scala.inline
  def apply(champions: js.Array[ChampionStatsDto], modifyDate: Double, summonerId: Double): RankedStatsDto = {
    val __obj = js.Dynamic.literal(champions = champions, modifyDate = modifyDate, summonerId = summonerId)
  
    __obj.asInstanceOf[RankedStatsDto]
  }
}

