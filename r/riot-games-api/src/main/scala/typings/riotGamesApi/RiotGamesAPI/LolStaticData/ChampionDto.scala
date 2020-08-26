package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChampionDto extends js.Object {
  var allytips: js.Array[String] = js.native
  var blurb: String = js.native
  var enemytips: js.Array[String] = js.native
  var id: Double = js.native
  var image: ImageDto = js.native
  var info: InfoDto = js.native
  var key: String = js.native
  var lore: String = js.native
  var name: String = js.native
  var partype: String = js.native
  var passive: PassiveDto = js.native
  var recommended: js.Array[RecommendedDto] = js.native
  var skins: js.Array[SkinDto] = js.native
  var spells: js.Array[ChampionSpellDto] = js.native
  var stats: StatsDto = js.native
  var tags: js.Array[String] = js.native
  var title: String = js.native
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
    val __obj = js.Dynamic.literal(allytips = allytips.asInstanceOf[js.Any], blurb = blurb.asInstanceOf[js.Any], enemytips = enemytips.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], lore = lore.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partype = partype.asInstanceOf[js.Any], passive = passive.asInstanceOf[js.Any], recommended = recommended.asInstanceOf[js.Any], skins = skins.asInstanceOf[js.Any], spells = spells.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChampionDto]
  }
  @scala.inline
  implicit class ChampionDtoOps[Self <: ChampionDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllytipsVarargs(value: String*): Self = this.set("allytips", js.Array(value :_*))
    @scala.inline
    def setAllytips(value: js.Array[String]): Self = this.set("allytips", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlurb(value: String): Self = this.set("blurb", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnemytipsVarargs(value: String*): Self = this.set("enemytips", js.Array(value :_*))
    @scala.inline
    def setEnemytips(value: js.Array[String]): Self = this.set("enemytips", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: ImageDto): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: InfoDto): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setLore(value: String): Self = this.set("lore", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartype(value: String): Self = this.set("partype", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassive(value: PassiveDto): Self = this.set("passive", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecommendedVarargs(value: RecommendedDto*): Self = this.set("recommended", js.Array(value :_*))
    @scala.inline
    def setRecommended(value: js.Array[RecommendedDto]): Self = this.set("recommended", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkinsVarargs(value: SkinDto*): Self = this.set("skins", js.Array(value :_*))
    @scala.inline
    def setSkins(value: js.Array[SkinDto]): Self = this.set("skins", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpellsVarargs(value: ChampionSpellDto*): Self = this.set("spells", js.Array(value :_*))
    @scala.inline
    def setSpells(value: js.Array[ChampionSpellDto]): Self = this.set("spells", value.asInstanceOf[js.Any])
    @scala.inline
    def setStats(value: StatsDto): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

