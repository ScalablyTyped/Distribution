package typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData

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
    val __obj = js.Dynamic.literal(altimages = altimages.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], cooldownBurn = cooldownBurn.asInstanceOf[js.Any], cost = cost.asInstanceOf[js.Any], costBurn = costBurn.asInstanceOf[js.Any], costType = costType.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], effectBurn = effectBurn.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], leveltip = leveltip.asInstanceOf[js.Any], maxrank = maxrank.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rangeBurn = rangeBurn.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], sanitizedDescription = sanitizedDescription.asInstanceOf[js.Any], sanitizedTooltip = sanitizedTooltip.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChampionSpellDto]
  }
}

