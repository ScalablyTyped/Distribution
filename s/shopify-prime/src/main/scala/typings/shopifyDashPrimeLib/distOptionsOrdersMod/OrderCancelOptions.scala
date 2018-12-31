package typings
package shopifyDashPrimeLib.distOptionsOrdersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderCancelOptions extends js.Object {
  /**
    * Amount to refund. If set, Shopify will attempt to void/refund the payment depending on the status.
    */
  var amount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether Shopify should send an email to the customer notifying them of the cancellation.
    */
  var email: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The reason for the order cancellation.
    */
  var reason: js.UndefOr[
    shopifyDashPrimeLib.distEnumsOrderUnderscoreCancelUnderscoreReasonMod.OrderCancelReason
  ] = js.undefined
  /**
    * Required for some more complex refund situations.
    */
  var refund: js.UndefOr[js.Any] = js.undefined
  /**
    * Restock the items for this order back to your store.
    */
  var restock: js.UndefOr[scala.Boolean] = js.undefined
}

