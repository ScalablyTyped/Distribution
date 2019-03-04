package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockDto extends js.Object {
  var items: js.Array[BlockItemDto]
  var recMath: scala.Boolean
  var `type`: java.lang.String
}

object BlockDto {
  @scala.inline
  def apply(items: js.Array[BlockItemDto], recMath: scala.Boolean, `type`: java.lang.String): BlockDto = {
    val __obj = js.Dynamic.literal(items = items, recMath = recMath)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BlockDto]
  }
}

