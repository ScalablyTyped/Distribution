package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderFilter extends js.Object {
  var amount: js.UndefOr[scala.Double] = js.undefined
  var created: js.UndefOr[scala.Double] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var price: js.UndefOr[scala.Double] = js.undefined
  var remainingAmount: js.UndefOr[scala.Double] = js.undefined
  var resourceType: js.UndefOr[MarketResourceConstant] = js.undefined
  var roomName: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object OrderFilter {
  @scala.inline
  def apply(
    amount: scala.Int | scala.Double = null,
    created: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    price: scala.Int | scala.Double = null,
    remainingAmount: scala.Int | scala.Double = null,
    resourceType: MarketResourceConstant = null,
    roomName: java.lang.String = null,
    `type`: java.lang.String = null
  ): OrderFilter = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (remainingAmount != null) __obj.updateDynamic("remainingAmount")(remainingAmount.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (roomName != null) __obj.updateDynamic("roomName")(roomName)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OrderFilter]
  }
}

