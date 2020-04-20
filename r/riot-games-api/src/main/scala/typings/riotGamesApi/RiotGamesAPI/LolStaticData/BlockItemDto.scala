package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockItemDto extends js.Object {
  var count: Double
  var id: Double
}

object BlockItemDto {
  @scala.inline
  def apply(count: Double, id: Double): BlockItemDto = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockItemDto]
  }
}

