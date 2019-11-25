package typings.shopifyDashPrime.distModelsRefundMod

import typings.shopifyDashPrime.distModelsBaseMod.ShopifyObject
import typings.shopifyDashPrime.distModelsTransactionMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Refund extends ShopifyObject {
  var created_at: js.UndefOr[String] = js.undefined
  @JSName("id")
  var id_Refund: Double
  var note: String
  var order_adjustments: js.Array[OrderAdjustment]
  var order_id: js.Any
  var processed_at: js.UndefOr[String] = js.undefined
  var refund_line_items: js.Array[_]
  var restock: js.UndefOr[js.Any] = js.undefined
  var transactions: js.Array[Transaction]
  var user_id: Double
}

object Refund {
  @scala.inline
  def apply(
    id: Double,
    note: String,
    order_adjustments: js.Array[OrderAdjustment],
    order_id: js.Any,
    refund_line_items: js.Array[_],
    transactions: js.Array[Transaction],
    user_id: Double,
    admin_graphql_api_id: String = null,
    created_at: String = null,
    processed_at: String = null,
    restock: js.Any = null
  ): Refund = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], order_adjustments = order_adjustments.asInstanceOf[js.Any], order_id = order_id.asInstanceOf[js.Any], refund_line_items = refund_line_items.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (processed_at != null) __obj.updateDynamic("processed_at")(processed_at.asInstanceOf[js.Any])
    if (restock != null) __obj.updateDynamic("restock")(restock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Refund]
  }
}

