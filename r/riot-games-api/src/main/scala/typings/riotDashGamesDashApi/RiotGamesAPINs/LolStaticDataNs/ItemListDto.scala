package typings.riotDashGamesDashApi.RiotGamesAPINs.LolStaticDataNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemListDto extends js.Object {
  var basic: BasicDataDto
  var data: js.Array[StringDictionary[ItemDto]]
  var groups: js.Array[GroupDto]
  var tree: js.Array[ItemTreeDto]
  var `type`: String
  var version: String
}

object ItemListDto {
  @scala.inline
  def apply(
    basic: BasicDataDto,
    data: js.Array[StringDictionary[ItemDto]],
    groups: js.Array[GroupDto],
    tree: js.Array[ItemTreeDto],
    `type`: String,
    version: String
  ): ItemListDto = {
    val __obj = js.Dynamic.literal(basic = basic, data = data, groups = groups, tree = tree, version = version)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ItemListDto]
  }
}

