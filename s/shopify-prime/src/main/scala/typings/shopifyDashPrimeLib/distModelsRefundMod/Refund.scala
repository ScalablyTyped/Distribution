package typings
package shopifyDashPrimeLib.distModelsRefundMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Refund
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  @JSName("id")
  var id_Refund: scala.Double
  var note: java.lang.String
  var order_adjustments: js.Array[OrderAdjustment]
  var order_id: js.Any
  var processed_at: js.UndefOr[java.lang.String] = js.undefined
  var refund_line_items: js.Array[_]
  var restock: js.UndefOr[js.Any] = js.undefined
  var transactions: js.Array[shopifyDashPrimeLib.distModelsTransactionMod.Transaction]
  var user_id: scala.Double
}

object Refund {
  @scala.inline
  def apply(
    id: scala.Double,
    note: java.lang.String,
    order_adjustments: js.Array[OrderAdjustment],
    order_id: js.Any,
    refund_line_items: js.Array[_],
    transactions: js.Array[shopifyDashPrimeLib.distModelsTransactionMod.Transaction],
    user_id: scala.Double,
    admin_graphql_api_id: java.lang.String = null,
    created_at: java.lang.String = null,
    processed_at: java.lang.String = null,
    restock: js.Any = null
  ): Refund = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("note")(note)
    __obj.updateDynamic("order_adjustments")(order_adjustments)
    __obj.updateDynamic("order_id")(order_id)
    __obj.updateDynamic("refund_line_items")(refund_line_items)
    __obj.updateDynamic("transactions")(transactions)
    __obj.updateDynamic("user_id")(user_id)
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (processed_at != null) __obj.updateDynamic("processed_at")(processed_at)
    if (restock != null) __obj.updateDynamic("restock")(restock)
    __obj.asInstanceOf[Refund]
  }
}

