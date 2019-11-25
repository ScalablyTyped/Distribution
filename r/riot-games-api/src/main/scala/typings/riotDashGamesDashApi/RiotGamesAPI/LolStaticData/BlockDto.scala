package typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockDto extends js.Object {
  var items: js.Array[BlockItemDto]
  var recMath: Boolean
  var `type`: String
}

object BlockDto {
  @scala.inline
  def apply(items: js.Array[BlockItemDto], recMath: Boolean, `type`: String): BlockDto = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], recMath = recMath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockDto]
  }
}

