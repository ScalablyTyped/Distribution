package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecommendedDto extends js.Object {
  var block: js.Array[BlockDto]
  var champion: java.lang.String
  var map: java.lang.String
  var mode: java.lang.String
  var priority: scala.Boolean
  var title: java.lang.String
  var `type`: java.lang.String
}

object RecommendedDto {
  @scala.inline
  def apply(
    block: js.Array[BlockDto],
    champion: java.lang.String,
    map: java.lang.String,
    mode: java.lang.String,
    priority: scala.Boolean,
    title: java.lang.String,
    `type`: java.lang.String
  ): RecommendedDto = {
    val __obj = js.Dynamic.literal(block = block, champion = champion, map = map, mode = mode, priority = priority, title = title)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RecommendedDto]
  }
}

