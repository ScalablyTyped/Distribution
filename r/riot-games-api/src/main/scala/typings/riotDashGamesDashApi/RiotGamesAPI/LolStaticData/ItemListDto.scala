package typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData

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
    val __obj = js.Dynamic.literal(basic = basic.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemListDto]
  }
}

