package typings.riotGamesApi.RiotGamesAPI.Champion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChampionDto extends js.Object {
  var active: Boolean
  var botEnabled: Boolean
  var botMmEnabled: Boolean
  var freeToPlay: Boolean
  var id: Double
  var rankedPlayEnabled: Boolean
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
}

