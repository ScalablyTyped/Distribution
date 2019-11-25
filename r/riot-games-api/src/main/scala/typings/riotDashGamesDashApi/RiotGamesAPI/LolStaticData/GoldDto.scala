package typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoldDto extends js.Object {
  var base: Double
  var purchasable: Boolean
  var sell: Double
  var total: Double
}

object GoldDto {
  @scala.inline
  def apply(base: Double, purchasable: Boolean, sell: Double, total: Double): GoldDto = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], purchasable = purchasable.asInstanceOf[js.Any], sell = sell.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GoldDto]
  }
}

