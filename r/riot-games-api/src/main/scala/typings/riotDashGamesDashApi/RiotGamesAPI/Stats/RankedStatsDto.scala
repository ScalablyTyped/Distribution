package typings.riotDashGamesDashApi.RiotGamesAPI.Stats

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
    val __obj = js.Dynamic.literal(champions = champions.asInstanceOf[js.Any], modifyDate = modifyDate.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RankedStatsDto]
  }
}

