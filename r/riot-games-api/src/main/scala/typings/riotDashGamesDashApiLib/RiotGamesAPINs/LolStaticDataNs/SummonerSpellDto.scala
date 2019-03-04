package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummonerSpellDto extends js.Object {
  var cooldown: js.Array[scala.Double]
  var cooldownBurn: java.lang.String
  var cost: js.Array[scala.Double]
  var costBurn: java.lang.String
  var costType: java.lang.String
  var description: java.lang.String
  var effect: js.Array[js.Array[scala.Double]]
  var effectBurn: js.Array[java.lang.String]
  var id: scala.Double
  var image: ImageDto
  var key: java.lang.String
  var leveltip: LevelTipDto
  var maxrank: scala.Double
  var modes: js.Array[java.lang.String]
  var name: java.lang.String
  var range: js.Array[scala.Double] | java.lang.String
  var rangeBurn: java.lang.String
  var resource: java.lang.String
  var sanitizedDescription: java.lang.String
  var sanitizedTooltip: java.lang.String
  var summonerLevel: scala.Double
  var tooltip: java.lang.String
  var vars: js.Array[SpellVarsDto]
}

object SummonerSpellDto {
  @scala.inline
  def apply(
    cooldown: js.Array[scala.Double],
    cooldownBurn: java.lang.String,
    cost: js.Array[scala.Double],
    costBurn: java.lang.String,
    costType: java.lang.String,
    description: java.lang.String,
    effect: js.Array[js.Array[scala.Double]],
    effectBurn: js.Array[java.lang.String],
    id: scala.Double,
    image: ImageDto,
    key: java.lang.String,
    leveltip: LevelTipDto,
    maxrank: scala.Double,
    modes: js.Array[java.lang.String],
    name: java.lang.String,
    range: js.Array[scala.Double] | java.lang.String,
    rangeBurn: java.lang.String,
    resource: java.lang.String,
    sanitizedDescription: java.lang.String,
    sanitizedTooltip: java.lang.String,
    summonerLevel: scala.Double,
    tooltip: java.lang.String,
    vars: js.Array[SpellVarsDto]
  ): SummonerSpellDto = {
    val __obj = js.Dynamic.literal(cooldown = cooldown, cooldownBurn = cooldownBurn, cost = cost, costBurn = costBurn, costType = costType, description = description, effect = effect, effectBurn = effectBurn, id = id, image = image, key = key, leveltip = leveltip, maxrank = maxrank, modes = modes, name = name, range = range.asInstanceOf[js.Any], rangeBurn = rangeBurn, resource = resource, sanitizedDescription = sanitizedDescription, sanitizedTooltip = sanitizedTooltip, summonerLevel = summonerLevel, tooltip = tooltip, vars = vars)
  
    __obj.asInstanceOf[SummonerSpellDto]
  }
}

