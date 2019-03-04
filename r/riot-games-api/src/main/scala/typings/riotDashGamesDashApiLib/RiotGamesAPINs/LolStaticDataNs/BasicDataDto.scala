package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicDataDto extends js.Object {
  var colloq: java.lang.String
  var consumeOnFull: scala.Boolean
  var consumed: scala.Boolean
  var depth: scala.Double
  var description: java.lang.String
  var from: js.Array[java.lang.String]
  var gold: GoldDto
  var group: java.lang.String
  var hideFromAll: scala.Boolean
  var id: scala.Double
  var image: ImageDto
  var inStore: scala.Boolean
  var into: js.Array[java.lang.String]
  var maps: js.Array[org.scalablytyped.runtime.StringDictionary[scala.Boolean]]
  var name: java.lang.String
  var plaintext: java.lang.String
  var requiredChampion: java.lang.String
  var rune: MetaDataDto
  var sanitizedDescription: java.lang.String
  var specialRecipe: scala.Double
  var stacks: scala.Double
  var stats: BasicDataStatsDto
  var tags: js.Array[java.lang.String]
}

object BasicDataDto {
  @scala.inline
  def apply(
    colloq: java.lang.String,
    consumeOnFull: scala.Boolean,
    consumed: scala.Boolean,
    depth: scala.Double,
    description: java.lang.String,
    from: js.Array[java.lang.String],
    gold: GoldDto,
    group: java.lang.String,
    hideFromAll: scala.Boolean,
    id: scala.Double,
    image: ImageDto,
    inStore: scala.Boolean,
    into: js.Array[java.lang.String],
    maps: js.Array[org.scalablytyped.runtime.StringDictionary[scala.Boolean]],
    name: java.lang.String,
    plaintext: java.lang.String,
    requiredChampion: java.lang.String,
    rune: MetaDataDto,
    sanitizedDescription: java.lang.String,
    specialRecipe: scala.Double,
    stacks: scala.Double,
    stats: BasicDataStatsDto,
    tags: js.Array[java.lang.String]
  ): BasicDataDto = {
    val __obj = js.Dynamic.literal(colloq = colloq, consumeOnFull = consumeOnFull, consumed = consumed, depth = depth, description = description, from = from, gold = gold, group = group, hideFromAll = hideFromAll, id = id, image = image, inStore = inStore, into = into, maps = maps, name = name, plaintext = plaintext, requiredChampion = requiredChampion, rune = rune, sanitizedDescription = sanitizedDescription, specialRecipe = specialRecipe, stacks = stacks, stats = stats, tags = tags)
  
    __obj.asInstanceOf[BasicDataDto]
  }
}

