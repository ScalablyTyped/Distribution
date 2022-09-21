package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuneDto extends StObject {
  
  var colloq: String
  
  var consumeOnFull: Boolean
  
  var consumed: Boolean
  
  var depth: Double
  
  var description: String
  
  var from: js.Array[String]
  
  var group: String
  
  var hideFromAll: Boolean
  
  var id: Double
  
  var image: ImageDto
  
  var inStore: Boolean
  
  var into: js.Array[String]
  
  var maps: js.Array[StringDictionary[Boolean]]
  
  var name: String
  
  var plaintext: String
  
  var requiredChampion: String
  
  var rune: MetaDataDto
  
  var sanitizedDescription: String
  
  var specialRecipe: Double
  
  var stacks: Double
  
  var stats: BasicDataStatsDto
  
  var tags: js.Array[String]
}
object RuneDto {
  
  inline def apply(
    colloq: String,
    consumeOnFull: Boolean,
    consumed: Boolean,
    depth: Double,
    description: String,
    from: js.Array[String],
    group: String,
    hideFromAll: Boolean,
    id: Double,
    image: ImageDto,
    inStore: Boolean,
    into: js.Array[String],
    maps: js.Array[StringDictionary[Boolean]],
    name: String,
    plaintext: String,
    requiredChampion: String,
    rune: MetaDataDto,
    sanitizedDescription: String,
    specialRecipe: Double,
    stacks: Double,
    stats: BasicDataStatsDto,
    tags: js.Array[String]
  ): RuneDto = {
    val __obj = js.Dynamic.literal(colloq = colloq.asInstanceOf[js.Any], consumeOnFull = consumeOnFull.asInstanceOf[js.Any], consumed = consumed.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], hideFromAll = hideFromAll.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], inStore = inStore.asInstanceOf[js.Any], into = into.asInstanceOf[js.Any], maps = maps.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any], requiredChampion = requiredChampion.asInstanceOf[js.Any], rune = rune.asInstanceOf[js.Any], sanitizedDescription = sanitizedDescription.asInstanceOf[js.Any], specialRecipe = specialRecipe.asInstanceOf[js.Any], stacks = stacks.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuneDto]
  }
  
  extension [Self <: RuneDto](x: Self) {
    
    inline def setColloq(value: String): Self = StObject.set(x, "colloq", value.asInstanceOf[js.Any])
    
    inline def setConsumeOnFull(value: Boolean): Self = StObject.set(x, "consumeOnFull", value.asInstanceOf[js.Any])
    
    inline def setConsumed(value: Boolean): Self = StObject.set(x, "consumed", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: js.Array[String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromVarargs(value: String*): Self = StObject.set(x, "from", js.Array(value*))
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setHideFromAll(value: Boolean): Self = StObject.set(x, "hideFromAll", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage(value: ImageDto): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setInStore(value: Boolean): Self = StObject.set(x, "inStore", value.asInstanceOf[js.Any])
    
    inline def setInto(value: js.Array[String]): Self = StObject.set(x, "into", value.asInstanceOf[js.Any])
    
    inline def setIntoVarargs(value: String*): Self = StObject.set(x, "into", js.Array(value*))
    
    inline def setMaps(value: js.Array[StringDictionary[Boolean]]): Self = StObject.set(x, "maps", value.asInstanceOf[js.Any])
    
    inline def setMapsVarargs(value: StringDictionary[Boolean]*): Self = StObject.set(x, "maps", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlaintext(value: String): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    
    inline def setRequiredChampion(value: String): Self = StObject.set(x, "requiredChampion", value.asInstanceOf[js.Any])
    
    inline def setRune(value: MetaDataDto): Self = StObject.set(x, "rune", value.asInstanceOf[js.Any])
    
    inline def setSanitizedDescription(value: String): Self = StObject.set(x, "sanitizedDescription", value.asInstanceOf[js.Any])
    
    inline def setSpecialRecipe(value: Double): Self = StObject.set(x, "specialRecipe", value.asInstanceOf[js.Any])
    
    inline def setStacks(value: Double): Self = StObject.set(x, "stacks", value.asInstanceOf[js.Any])
    
    inline def setStats(value: BasicDataStatsDto): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
