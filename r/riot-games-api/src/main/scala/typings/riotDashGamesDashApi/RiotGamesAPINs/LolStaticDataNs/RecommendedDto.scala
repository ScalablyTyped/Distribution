package typings.riotDashGamesDashApi.RiotGamesAPINs.LolStaticDataNs

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
    val __obj = js.Dynamic.literal(block = block, champion = champion, map = map, mode = mode, priority = priority, title = title)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RecommendedDto]
  }
}

