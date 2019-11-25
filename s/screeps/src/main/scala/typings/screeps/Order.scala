package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var amount: Double
  var created: Double
  var id: String
  var price: Double
  var remainingAmount: Double
  var resourceType: MarketResourceConstant
  var roomName: js.UndefOr[String] = js.undefined
  var totalAmount: js.UndefOr[Double] = js.undefined
  var `type`: String
}

object Order {
  @scala.inline
  def apply(
    amount: Double,
    created: Double,
    id: String,
    price: Double,
    remainingAmount: Double,
    resourceType: MarketResourceConstant,
    `type`: String,
    active: js.UndefOr[Boolean] = js.undefined,
    roomName: String = null,
    totalAmount: Int | Double = null
  ): Order = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], remainingAmount = remainingAmount.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (roomName != null) __obj.updateDynamic("roomName")(roomName.asInstanceOf[js.Any])
    if (totalAmount != null) __obj.updateDynamic("totalAmount")(totalAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
}

