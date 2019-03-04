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
    val __obj = js.Dynamic.literal(allytips = allytips, blurb = blurb, enemytips = enemytips, id = id, image = image, info = info, key = key, lore = lore, name = name, partype = partype, passive = passive, recommended = recommended, skins = skins, spells = spells, stats = stats, tags = tags, title = title)
  
    __obj.asInstanceOf[ChampionDto]
  }
}

