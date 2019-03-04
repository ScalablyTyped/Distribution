package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.ChampionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChampionDto extends js.Object {
  var active: scala.Boolean
  var botEnabled: scala.Boolean
  var botMmEnabled: scala.Boolean
  var freeToPlay: scala.Boolean
  var id: scala.Double
  var rankedPlayEnabled: scala.Boolean
}

object ChampionDto {
  @scala.inline
  def apply(
    active: scala.Boolean,
    botEnabled: scala.Boolean,
    botMmEnabled: scala.Boolean,
    freeToPlay: scala.Boolean,
    id: scala.Double,
    rankedPlayEnabled: scala.Boolean
  ): ChampionDto = {
    val __obj = js.Dynamic.literal(active = active, botEnabled = botEnabled, botMmEnabled = botMmEnabled, freeToPlay = freeToPlay, id = id, rankedPlayEnabled = rankedPlayEnabled)
  
    __obj.asInstanceOf[ChampionDto]
  }
}

