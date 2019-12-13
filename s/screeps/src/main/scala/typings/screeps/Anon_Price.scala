package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Price extends js.Object {
  var price: Double
  var resourceType: MarketResourceConstant
  var roomName: js.UndefOr[String] = js.undefined
  var totalAmount: Double
  var `type`: ORDER_BUY | ORDER_SELL
}

object Anon_Price {
  @scala.inline
  def apply(
    price: Double,
    resourceType: MarketResourceConstant,
    totalAmount: Double,
    `type`: ORDER_BUY | ORDER_SELL,
    roomName: String = null
  ): Anon_Price = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], totalAmount = totalAmount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (roomName != null) __obj.updateDynamic("roomName")(roomName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Price]
  }
}

