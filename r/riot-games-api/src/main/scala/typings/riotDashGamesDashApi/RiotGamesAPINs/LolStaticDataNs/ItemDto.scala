package typings.riotDashGamesDashApi.RiotGamesAPINs.LolStaticDataNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemDto extends js.Object {
  var colloq: String
  var consumeOnFull: Boolean
  var consumed: Boolean
  var depth: Double
  var description: String
  var effect: js.Array[StringDictionary[String]]
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

object ItemDto {
  @scala.inline
  def apply(
    colloq: String,
    consumeOnFull: Boolean,
    consumed: Boolean,
    depth: Double,
    description: String,
    effect: js.Array[StringDictionary[String]],
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
  ): ItemDto = {
    val __obj = js.Dynamic.literal(colloq = colloq, consumeOnFull = consumeOnFull, consumed = consumed, depth = depth, description = description, effect = effect, from = from, gold = gold, group = group, hideFromAll = hideFromAll, id = id, image = image, inStore = inStore, into = into, maps = maps, name = name, plaintext = plaintext, requiredChampion = requiredChampion, rune = rune, sanitizedDescription = sanitizedDescription, specialRecipe = specialRecipe, stacks = stacks, stats = stats, tags = tags)
  
    __obj.asInstanceOf[ItemDto]
  }
}

