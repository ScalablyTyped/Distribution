package typings.shopifyDashPrime.distModelsRefundMod

import typings.shopifyDashPrime.distModelsBaseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderAdjustment extends ShopifyObject {
  var amount: String
  var kind: String
  var order_id: js.Any
  var reason: String
  var refund_id: Double
  var tax_amount: String
}

object OrderAdjustment {
  @scala.inline
  def apply(
    amount: String,
    kind: String,
    order_id: js.Any,
    reason: String,
    refund_id: Double,
    tax_amount: String,
    admin_graphql_api_id: String = null,
    id: Int | Double = null
  ): OrderAdjustment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], order_id = order_id.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], refund_id = refund_id.asInstanceOf[js.Any], tax_amount = tax_amount.asInstanceOf[js.Any])
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderAdjustment]
  }
}

