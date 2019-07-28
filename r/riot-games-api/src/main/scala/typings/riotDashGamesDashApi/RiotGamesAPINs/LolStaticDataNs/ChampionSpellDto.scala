package typings.riotDashGamesDashApi.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChampionSpellDto extends js.Object {
  var altimages: js.Array[ImageDto]
  var cooldown: js.Array[Double]
  var cooldownBurn: String
  var cost: js.Array[Double]
  var costBurn: String
  var costType: String
  var description: String
  var effect: js.Array[js.Array[Double]]
  var effectBurn: js.Array[String]
  var image: ImageDto
  var key: String
  var leveltip: LevelTipDto
  var maxrank: Double
  var name: String
  var range: js.Array[Double] | String
  var rangeBurn: String
  var resource: String
  var sanitizedDescription: String
  var sanitizedTooltip: String
  var tooltip: String
  var vars: js.Array[SpellVarsDto]
}

object ChampionSpellDto {
  @scala.inline
  def apply(
    altimages: js.Array[ImageDto],
    cooldown: js.Array[Double],
    cooldownBurn: String,
    cost: js.Array[Double],
    costBurn: String,
    costType: String,
    description: String,
    effect: js.Array[js.Array[Double]],
    effectBurn: js.Array[String],
    image: ImageDto,
    key: String,
    leveltip: LevelTipDto,
    maxrank: Double,
    name: String,
    range: js.Array[Double] | String,
    rangeBurn: String,
    resource: String,
    sanitizedDescription: String,
    sanitizedTooltip: String,
    tooltip: String,
    vars: js.Array[SpellVarsDto]
  ): ChampionSpellDto = {
    val __obj = js.Dynamic.literal(altimages = altimages, cooldown = cooldown, cooldownBurn = cooldownBurn, cost = cost, costBurn = costBurn, costType = costType, description = description, effect = effect, effectBurn = effectBurn, image = image, key = key, leveltip = leveltip, maxrank = maxrank, name = name, range = range.asInstanceOf[js.Any], rangeBurn = rangeBurn, resource = resource, sanitizedDescription = sanitizedDescription, sanitizedTooltip = sanitizedTooltip, tooltip = tooltip, vars = vars)
  
    __obj.asInstanceOf[ChampionSpellDto]
  }
}

