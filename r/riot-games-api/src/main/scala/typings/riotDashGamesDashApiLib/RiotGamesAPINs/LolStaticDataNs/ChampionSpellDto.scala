package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChampionSpellDto extends js.Object {
  var altimages: js.Array[ImageDto]
  var cooldown: js.Array[scala.Double]
  var cooldownBurn: java.lang.String
  var cost: js.Array[scala.Double]
  var costBurn: java.lang.String
  var costType: java.lang.String
  var description: java.lang.String
  var effect: js.Array[js.Array[scala.Double]]
  var effectBurn: js.Array[java.lang.String]
  var image: ImageDto
  var key: java.lang.String
  var leveltip: LevelTipDto
  var maxrank: scala.Double
  var name: java.lang.String
  var range: js.Array[scala.Double] | java.lang.String
  var rangeBurn: java.lang.String
  var resource: java.lang.String
  var sanitizedDescription: java.lang.String
  var sanitizedTooltip: java.lang.String
  var tooltip: java.lang.String
  var vars: js.Array[SpellVarsDto]
}

object ChampionSpellDto {
  @scala.inline
  def apply(
    altimages: js.Array[ImageDto],
    cooldown: js.Array[scala.Double],
    cooldownBurn: java.lang.String,
    cost: js.Array[scala.Double],
    costBurn: java.lang.String,
    costType: java.lang.String,
    description: java.lang.String,
    effect: js.Array[js.Array[scala.Double]],
    effectBurn: js.Array[java.lang.String],
    image: ImageDto,
    key: java.lang.String,
    leveltip: LevelTipDto,
    maxrank: scala.Double,
    name: java.lang.String,
    range: js.Array[scala.Double] | java.lang.String,
    rangeBurn: java.lang.String,
    resource: java.lang.String,
    sanitizedDescription: java.lang.String,
    sanitizedTooltip: java.lang.String,
    tooltip: java.lang.String,
    vars: js.Array[SpellVarsDto]
  ): ChampionSpellDto = {
    val __obj = js.Dynamic.literal(altimages = altimages, cooldown = cooldown, cooldownBurn = cooldownBurn, cost = cost, costBurn = costBurn, costType = costType, description = description, effect = effect, effectBurn = effectBurn, image = image, key = key, leveltip = leveltip, maxrank = maxrank, name = name, range = range.asInstanceOf[js.Any], rangeBurn = rangeBurn, resource = resource, sanitizedDescription = sanitizedDescription, sanitizedTooltip = sanitizedTooltip, tooltip = tooltip, vars = vars)
  
    __obj.asInstanceOf[ChampionSpellDto]
  }
}

