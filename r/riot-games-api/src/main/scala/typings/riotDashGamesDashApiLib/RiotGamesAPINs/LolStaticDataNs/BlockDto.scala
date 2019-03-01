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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("recMath")(recMath)
    __obj.asInstanceOf[BlockDto]
  }
}

