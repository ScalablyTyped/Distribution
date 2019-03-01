package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChampionDto extends js.Object {
  var allytips: js.Array[java.lang.String]
  var blurb: java.lang.String
  var enemytips: js.Array[java.lang.String]
  var id: scala.Double
  var image: ImageDto
  var info: InfoDto
  var key: java.lang.String
  var lore: java.lang.String
  var name: java.lang.String
  var partype: java.lang.String
  var passive: PassiveDto
  var recommended: js.Array[RecommendedDto]
  var skins: js.Array[SkinDto]
  var spells: js.Array[ChampionSpellDto]
  var stats: StatsDto
  var tags: js.Array[java.lang.String]
  var title: java.lang.String
}

object ChampionDto {
  @scala.inline
  def apply(
    allytips: js.Array[java.lang.String],
    blurb: java.lang.String,
    enemytips: js.Array[java.lang.String],
    id: scala.Double,
    image: ImageDto,
    info: InfoDto,
    key: java.lang.String,
    lore: java.lang.String,
    name: java.lang.String,
    partype: java.lang.String,
    passive: PassiveDto,
    recommended: js.Array[RecommendedDto],
    skins: js.Array[SkinDto],
    spells: js.Array[ChampionSpellDto],
    stats: StatsDto,
    tags: js.Array[java.lang.String],
    title: java.lang.String
  ): ChampionDto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allytips")(allytips)
    __obj.updateDynamic("blurb")(blurb)
    __obj.updateDynamic("enemytips")(enemytips)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("lore")(lore)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("partype")(partype)
    __obj.updateDynamic("passive")(passive)
    __obj.updateDynamic("recommended")(recommended)
    __obj.updateDynamic("skins")(skins)
    __obj.updateDynamic("spells")(spells)
    __obj.updateDynamic("stats")(stats)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ChampionDto]
  }
}

