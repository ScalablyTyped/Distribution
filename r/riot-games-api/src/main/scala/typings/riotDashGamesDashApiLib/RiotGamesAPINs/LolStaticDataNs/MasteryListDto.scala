package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasteryListDto extends js.Object {
  var data: js.Array[org.scalablytyped.runtime.StringDictionary[MasteryDto]]
  var tree: MasteryTreeDto
  var `type`: java.lang.String
  var version: java.lang.String
}

object MasteryListDto {
  @scala.inline
  def apply(
    data: js.Array[org.scalablytyped.runtime.StringDictionary[MasteryDto]],
    tree: MasteryTreeDto,
    `type`: java.lang.String,
    version: java.lang.String
  ): MasteryListDto = {
    val __obj = js.Dynamic.literal(data = data, tree = tree, version = version)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MasteryListDto]
  }
}

