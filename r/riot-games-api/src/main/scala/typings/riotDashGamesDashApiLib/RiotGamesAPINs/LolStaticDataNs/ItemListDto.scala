package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemListDto extends js.Object {
  var basic: BasicDataDto
  var data: js.Array[org.scalablytyped.runtime.StringDictionary[ItemDto]]
  var groups: js.Array[GroupDto]
  var tree: js.Array[ItemTreeDto]
  var `type`: java.lang.String
  var version: java.lang.String
}

object ItemListDto {
  @scala.inline
  def apply(
    basic: BasicDataDto,
    data: js.Array[org.scalablytyped.runtime.StringDictionary[ItemDto]],
    groups: js.Array[GroupDto],
    tree: js.Array[ItemTreeDto],
    `type`: java.lang.String,
    version: java.lang.String
  ): ItemListDto = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("basic")(basic)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("groups")(groups)
    __obj.updateDynamic("tree")(tree)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ItemListDto]
  }
}

