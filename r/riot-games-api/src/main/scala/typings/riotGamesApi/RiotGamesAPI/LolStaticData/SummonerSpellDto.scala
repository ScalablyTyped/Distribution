package typings.riotGamesApi.RiotGamesAPI.LolStaticData

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
    val __obj = js.Dynamic.literal(cooldown = cooldown.asInstanceOf[js.Any], cooldownBurn = cooldownBurn.asInstanceOf[js.Any], cost = cost.asInstanceOf[js.Any], costBurn = costBurn.asInstanceOf[js.Any], costType = costType.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], effectBurn = effectBurn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], leveltip = leveltip.asInstanceOf[js.Any], maxrank = maxrank.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rangeBurn = rangeBurn.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], sanitizedDescription = sanitizedDescription.asInstanceOf[js.Any], sanitizedTooltip = sanitizedTooltip.asInstanceOf[js.Any], summonerLevel = summonerLevel.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummonerSpellDto]
  }
}

