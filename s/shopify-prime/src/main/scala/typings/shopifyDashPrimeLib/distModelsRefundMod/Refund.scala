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

