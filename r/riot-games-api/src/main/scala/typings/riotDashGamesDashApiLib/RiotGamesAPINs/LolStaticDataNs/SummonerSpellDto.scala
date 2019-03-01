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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cooldown")(cooldown)
    __obj.updateDynamic("cooldownBurn")(cooldownBurn)
    __obj.updateDynamic("cost")(cost)
    __obj.updateDynamic("costBurn")(costBurn)
    __obj.updateDynamic("costType")(costType)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("effect")(effect)
    __obj.updateDynamic("effectBurn")(effectBurn)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("leveltip")(leveltip)
    __obj.updateDynamic("maxrank")(maxrank)
    __obj.updateDynamic("modes")(modes)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.updateDynamic("rangeBurn")(rangeBurn)
    __obj.updateDynamic("resource")(resource)
    __obj.updateDynamic("sanitizedDescription")(sanitizedDescription)
    __obj.updateDynamic("sanitizedTooltip")(sanitizedTooltip)
    __obj.updateDynamic("summonerLevel")(summonerLevel)
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.updateDynamic("vars")(vars)
    __obj.asInstanceOf[SummonerSpellDto]
  }
}

