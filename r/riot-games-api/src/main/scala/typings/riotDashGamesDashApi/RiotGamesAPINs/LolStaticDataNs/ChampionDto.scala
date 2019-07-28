package typings.riotDashGamesDashApi.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChampionDto extends js.Object {
  var allytips: js.Array[String]
  var blurb: String
  var enemytips: js.Array[String]
  var id: Double
  var image: ImageDto
  var info: InfoDto
  var key: String
  var lore: String
  var name: String
  var partype: String
  var passive: PassiveDto
  var recommended: js.Array[RecommendedDto]
  var skins: js.Array[SkinDto]
  var spells: js.Array[ChampionSpellDto]
  var stats: StatsDto
  var tags: js.Array[String]
  var title: String
}

object ChampionDto {
  @scala.inline
  def apply(
    allytips: js.Array[String],
    blurb: String,
    enemytips: js.Array[String],
    id: Double,
    image: ImageDto,
    info: InfoDto,
    key: String,
    lore: String,
    name: String,
    partype: String,
    passive: PassiveDto,
    recommended: js.Array[RecommendedDto],
    skins: js.Array[SkinDto],
    spells: js.Array[ChampionSpellDto],
    stats: StatsDto,
    tags: js.Array[String],
    title: String
  ): ChampionDto = {
    val __obj = js.Dynamic.literal(allytips = allytips, blurb = blurb, enemytips = enemytips, id = id, image = image, info = info, key = key, lore = lore, name = name, partype = partype, passive = passive, recommended = recommended, skins = skins, spells = spells, stats = stats, tags = tags, title = title)
  
    __obj.asInstanceOf[ChampionDto]
  }
}

