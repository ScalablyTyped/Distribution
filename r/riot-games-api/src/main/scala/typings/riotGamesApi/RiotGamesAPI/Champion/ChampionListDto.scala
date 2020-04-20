package typings.riotGamesApi.RiotGamesAPI.Champion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChampionListDto extends js.Object {
  var champions: js.Array[ChampionDto]
}

object ChampionListDto {
  @scala.inline
  def apply(champions: js.Array[ChampionDto]): ChampionListDto = {
    val __obj = js.Dynamic.literal(champions = champions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChampionListDto]
  }
}

