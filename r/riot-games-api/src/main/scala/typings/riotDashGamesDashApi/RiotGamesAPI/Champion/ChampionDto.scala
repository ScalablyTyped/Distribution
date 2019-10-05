package typings.riotDashGamesDashApi.RiotGamesAPI.Champion

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
    val __obj = js.Dynamic.literal(active = active, botEnabled = botEnabled, botMmEnabled = botMmEnabled, freeToPlay = freeToPlay, id = id, rankedPlayEnabled = rankedPlayEnabled)
  
    __obj.asInstanceOf[ChampionDto]
  }
}

