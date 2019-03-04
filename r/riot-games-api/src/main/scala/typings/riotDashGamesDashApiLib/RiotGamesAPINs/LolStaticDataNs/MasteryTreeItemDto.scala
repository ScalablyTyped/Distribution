package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasteryTreeItemDto extends js.Object {
  var masteryId: scala.Double
  var prereq: java.lang.String
}

object MasteryTreeItemDto {
  @scala.inline
  def apply(masteryId: scala.Double, prereq: java.lang.String): MasteryTreeItemDto = {
    val __obj = js.Dynamic.literal(masteryId = masteryId, prereq = prereq)
  
    __obj.asInstanceOf[MasteryTreeItemDto]
  }
}

