package typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummonerSpellDto extends js.Object {
  var cooldown: js.Array[Double]
  var cooldownBurn: String
  var cost: js.Array[Double]
  var costBurn: String
  var costType: String
  var description: String
  var effect: js.Array[js.Array[Double]]
  var effectBurn: js.Array[String]
  var id: Double
  var image: ImageDto
  var key: String
  var leveltip: LevelTipDto
  var maxrank: Double
  var modes: js.Array[String]
  var name: String
  var range: js.Array[Double] | String
  var rangeBurn: String
  var resource: String
  var sanitizedDescription: String
  var sanitizedTooltip: String
  var summonerLevel: Double
  var tooltip: String
  var vars: js.Array[SpellVarsDto]
}

object SummonerSpellDto {
  @scala.inline
  def apply(
    cooldown: js.Array[Double],
    cooldownBurn: String,
    cost: js.Array[Double],
    costBurn: String,
    costType: String,
    description: String,
    effect: js.Array[js.Array[Double]],
    effectBurn: js.Array[String],
    id: Double,
    image: ImageDto,
    key: String,
    leveltip: LevelTipDto,
    maxrank: Double,
    modes: js.Array[String],
    name: String,
    range: js.Array[Double] | String,
    rangeBurn: String,
    resource: String,
    sanitizedDescription: String,
    sanitizedTooltip: String,
    summonerLevel: Double,
    tooltip: String,
    vars: js.Array[SpellVarsDto]
  ): SummonerSpellDto = {
    val __obj = js.Dynamic.literal(cooldown = cooldown, cooldownBurn = cooldownBurn, cost = cost, costBurn = costBurn, costType = costType, description = description, effect = effect, effectBurn = effectBurn, id = id, image = image, key = key, leveltip = leveltip, maxrank = maxrank, modes = modes, name = name, range = range.asInstanceOf[js.Any], rangeBurn = rangeBurn, resource = resource, sanitizedDescription = sanitizedDescription, sanitizedTooltip = sanitizedTooltip, summonerLevel = summonerLevel, tooltip = tooltip, vars = vars)
  
    __obj.asInstanceOf[SummonerSpellDto]
  }
}

