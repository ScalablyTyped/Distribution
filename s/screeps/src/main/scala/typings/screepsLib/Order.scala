package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var amount: scala.Double
  var created: scala.Double
  var id: java.lang.String
  var price: scala.Double
  var remainingAmount: scala.Double
  var resourceType: MarketResourceConstant
  var roomName: js.UndefOr[java.lang.String] = js.undefined
  var totalAmount: js.UndefOr[scala.Double] = js.undefined
  var `type`: java.lang.String
}

object Order {
  @scala.inline
  def apply(
    amount: scala.Double,
    created: scala.Double,
    id: java.lang.String,
    price: scala.Double,
    remainingAmount: scala.Double,
    resourceType: MarketResourceConstant,
    `type`: java.lang.String,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    roomName: java.lang.String = null,
    totalAmount: scala.Int | scala.Double = null
  ): Order = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("price")(price)
    __obj.updateDynamic("remainingAmount")(remainingAmount)
    __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (roomName != null) __obj.updateDynamic("roomName")(roomName)
    if (totalAmount != null) __obj.updateDynamic("totalAmount")(totalAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
}

