package typings
package shopifyDashPrimeLib.distModelsRefundMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderAdjustment
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  var amount: java.lang.String
  var kind: java.lang.String
  var order_id: js.Any
  var reason: java.lang.String
  var refund_id: scala.Double
  var tax_amount: java.lang.String
}

object OrderAdjustment {
  @scala.inline
  def apply(
    amount: java.lang.String,
    kind: java.lang.String,
    order_id: js.Any,
    reason: java.lang.String,
    refund_id: scala.Double,
    tax_amount: java.lang.String,
    admin_graphql_api_id: java.lang.String = null,
    id: scala.Int | scala.Double = null
  ): OrderAdjustment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("order_id")(order_id)
    __obj.updateDynamic("reason")(reason)
    __obj.updateDynamic("refund_id")(refund_id)
    __obj.updateDynamic("tax_amount")(tax_amount)
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderAdjustment]
  }
}

