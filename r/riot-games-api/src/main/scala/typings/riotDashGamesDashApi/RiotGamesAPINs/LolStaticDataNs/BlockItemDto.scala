package typings.riotDashGamesDashApi.RiotGamesAPINs.LolStaticDataNs

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
    val __obj = js.Dynamic.literal(count = count, id = id)
  
    __obj.asInstanceOf[BlockItemDto]
  }
}

