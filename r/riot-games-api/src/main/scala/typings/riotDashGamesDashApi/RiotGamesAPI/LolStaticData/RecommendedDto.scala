package typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecommendedDto extends js.Object {
  var block: js.Array[BlockDto]
  var champion: String
  var map: String
  var mode: String
  var priority: Boolean
  var title: String
  var `type`: String
}

object RecommendedDto {
  @scala.inline
  def apply(
    block: js.Array[BlockDto],
    champion: String,
    map: String,
    mode: String,
    priority: Boolean,
    title: String,
    `type`: String
  ): RecommendedDto = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], champion = champion.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendedDto]
  }
}

