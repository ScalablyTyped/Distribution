package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderFilter extends js.Object {
  var amount: js.UndefOr[Double] = js.undefined
  var created: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var price: js.UndefOr[Double] = js.undefined
  var remainingAmount: js.UndefOr[Double] = js.undefined
  var resourceType: js.UndefOr[MarketResourceConstant] = js.undefined
  var roomName: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object OrderFilter {
  @scala.inline
  def apply(
    amount: js.UndefOr[Double] = js.undefined,
    created: js.UndefOr[Double] = js.undefined,
    id: String = null,
    price: js.UndefOr[Double] = js.undefined,
    remainingAmount: js.UndefOr[Double] = js.undefined,
    resourceType: MarketResourceConstant = null,
    roomName: String = null,
    `type`: String = null
  ): OrderFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(amount)) __obj.updateDynamic("amount")(amount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(created)) __obj.updateDynamic("created")(created.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(price)) __obj.updateDynamic("price")(price.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remainingAmount)) __obj.updateDynamic("remainingAmount")(remainingAmount.get.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (roomName != null) __obj.updateDynamic("roomName")(roomName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderFilter]
  }
}

