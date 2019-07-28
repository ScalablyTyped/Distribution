package typings.shopifyDashPrime.distOptionsOrdersMod

import typings.shopifyDashPrime.distEnumsOrderUnderscoreCancelUnderscoreReasonMod.OrderCancelReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderCancelOptions extends js.Object {
  /**
    * Amount to refund. If set, Shopify will attempt to void/refund the payment depending on the status.
    */
  var amount: js.UndefOr[Double] = js.undefined
  /**
    * Whether Shopify should send an email to the customer notifying them of the cancellation.
    */
  var email: js.UndefOr[Boolean] = js.undefined
  /**
    * The reason for the order cancellation.
    */
  var reason: js.UndefOr[OrderCancelReason] = js.undefined
  /**
    * Required for some more complex refund situations.
    */
  var refund: js.UndefOr[js.Any] = js.undefined
  /**
    * Restock the items for this order back to your store.
    */
  var restock: js.UndefOr[Boolean] = js.undefined
}

object OrderCancelOptions {
  @scala.inline
  def apply(
    amount: Int | Double = null,
    email: js.UndefOr[Boolean] = js.undefined,
    reason: OrderCancelReason = null,
    refund: js.Any = null,
    restock: js.UndefOr[Boolean] = js.undefined
  ): OrderCancelOptions = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (!js.isUndefined(email)) __obj.updateDynamic("email")(email)
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (refund != null) __obj.updateDynamic("refund")(refund)
    if (!js.isUndefined(restock)) __obj.updateDynamic("restock")(restock)
    __obj.asInstanceOf[OrderCancelOptions]
  }
}

