package typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasteryListDto extends js.Object {
  var data: js.Array[StringDictionary[MasteryDto]]
  var tree: MasteryTreeDto
  var `type`: String
  var version: String
}

object MasteryListDto {
  @scala.inline
  def apply(
    data: js.Array[StringDictionary[MasteryDto]],
    tree: MasteryTreeDto,
    `type`: String,
    version: String
  ): MasteryListDto = {
    val __obj = js.Dynamic.literal(data = data, tree = tree, version = version)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MasteryListDto]
  }
}

