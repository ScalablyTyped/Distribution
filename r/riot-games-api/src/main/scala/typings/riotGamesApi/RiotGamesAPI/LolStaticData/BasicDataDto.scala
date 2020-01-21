package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicDataDto extends js.Object {
  var colloq: String
  var consumeOnFull: Boolean
  var consumed: Boolean
  var depth: Double
  var description: String
  var from: js.Array[String]
  var gold: GoldDto
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

object BasicDataDto {
  @scala.inline
  def apply(
    colloq: String,
    consumeOnFull: Boolean,
    consumed: Boolean,
    depth: Double,
    description: String,
    from: js.Array[String],
    gold: GoldDto,
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
  ): BasicDataDto = {
    val __obj = js.Dynamic.literal(colloq = colloq.asInstanceOf[js.Any], consumeOnFull = consumeOnFull.asInstanceOf[js.Any], consumed = consumed.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gold = gold.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], hideFromAll = hideFromAll.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], inStore = inStore.asInstanceOf[js.Any], into = into.asInstanceOf[js.Any], maps = maps.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any], requiredChampion = requiredChampion.asInstanceOf[js.Any], rune = rune.asInstanceOf[js.Any], sanitizedDescription = sanitizedDescription.asInstanceOf[js.Any], specialRecipe = specialRecipe.asInstanceOf[js.Any], stacks = stacks.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BasicDataDto]
  }
}

