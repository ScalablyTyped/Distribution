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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("altimages")(altimages)
    __obj.updateDynamic("cooldown")(cooldown)
    __obj.updateDynamic("cooldownBurn")(cooldownBurn)
    __obj.updateDynamic("cost")(cost)
    __obj.updateDynamic("costBurn")(costBurn)
    __obj.updateDynamic("costType")(costType)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("effect")(effect)
    __obj.updateDynamic("effectBurn")(effectBurn)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("leveltip")(leveltip)
    __obj.updateDynamic("maxrank")(maxrank)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.updateDynamic("rangeBurn")(rangeBurn)
    __obj.updateDynamic("resource")(resource)
    __obj.updateDynamic("sanitizedDescription")(sanitizedDescription)
    __obj.updateDynamic("sanitizedTooltip")(sanitizedTooltip)
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.updateDynamic("vars")(vars)
    __obj.asInstanceOf[ChampionSpellDto]
  }
}

