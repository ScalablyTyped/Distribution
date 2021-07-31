package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChampionDto extends StObject {
  
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
    val __obj = js.Dynamic.literal(allytips = allytips.asInstanceOf[js.Any], blurb = blurb.asInstanceOf[js.Any], enemytips = enemytips.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], lore = lore.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partype = partype.asInstanceOf[js.Any], passive = passive.asInstanceOf[js.Any], recommended = recommended.asInstanceOf[js.Any], skins = skins.asInstanceOf[js.Any], spells = spells.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChampionDto]
  }
  
  @scala.inline
  implicit class ChampionDtoMutableBuilder[Self <: ChampionDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllytips(value: js.Array[String]): Self = StObject.set(x, "allytips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllytipsVarargs(value: String*): Self = StObject.set(x, "allytips", js.Array(value :_*))
    
    @scala.inline
    def setBlurb(value: String): Self = StObject.set(x, "blurb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnemytips(value: js.Array[String]): Self = StObject.set(x, "enemytips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnemytipsVarargs(value: String*): Self = StObject.set(x, "enemytips", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: ImageDto): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: InfoDto): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLore(value: String): Self = StObject.set(x, "lore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartype(value: String): Self = StObject.set(x, "partype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassive(value: PassiveDto): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommended(value: js.Array[RecommendedDto]): Self = StObject.set(x, "recommended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendedVarargs(value: RecommendedDto*): Self = StObject.set(x, "recommended", js.Array(value :_*))
    
    @scala.inline
    def setSkins(value: js.Array[SkinDto]): Self = StObject.set(x, "skins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkinsVarargs(value: SkinDto*): Self = StObject.set(x, "skins", js.Array(value :_*))
    
    @scala.inline
    def setSpells(value: js.Array[ChampionSpellDto]): Self = StObject.set(x, "spells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellsVarargs(value: ChampionSpellDto*): Self = StObject.set(x, "spells", js.Array(value :_*))
    
    @scala.inline
    def setStats(value: StatsDto): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
