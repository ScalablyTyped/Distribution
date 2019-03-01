package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuneDto extends js.Object {
  var colloq: java.lang.String
  var consumeOnFull: scala.Boolean
  var consumed: scala.Boolean
  var depth: scala.Double
  var description: java.lang.String
  var from: js.Array[java.lang.String]
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

object RuneDto {
  @scala.inline
  def apply(
    colloq: java.lang.String,
    consumeOnFull: scala.Boolean,
    consumed: scala.Boolean,
    depth: scala.Double,
    description: java.lang.String,
    from: js.Array[java.lang.String],
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
  ): RuneDto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("colloq")(colloq)
    __obj.updateDynamic("consumeOnFull")(consumeOnFull)
    __obj.updateDynamic("consumed")(consumed)
    __obj.updateDynamic("depth")(depth)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("hideFromAll")(hideFromAll)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("inStore")(inStore)
    __obj.updateDynamic("into")(into)
    __obj.updateDynamic("maps")(maps)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("plaintext")(plaintext)
    __obj.updateDynamic("requiredChampion")(requiredChampion)
    __obj.updateDynamic("rune")(rune)
    __obj.updateDynamic("sanitizedDescription")(sanitizedDescription)
    __obj.updateDynamic("specialRecipe")(specialRecipe)
    __obj.updateDynamic("stacks")(stacks)
    __obj.updateDynamic("stats")(stats)
    __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[RuneDto]
  }
}

