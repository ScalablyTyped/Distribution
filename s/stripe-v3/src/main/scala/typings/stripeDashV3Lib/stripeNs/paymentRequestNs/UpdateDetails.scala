package typings
package stripeDashV3Lib.stripeNs.paymentRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDetails extends js.Object {
  var displayItems: js.UndefOr[js.Array[DisplayItem]] = js.undefined
  var shippingOptions: js.UndefOr[js.Array[ShippingOption]] = js.undefined
  var status: stripeDashV3Lib.stripeDashV3LibStrings.success | stripeDashV3Lib.stripeDashV3LibStrings.fail | stripeDashV3Lib.stripeDashV3LibStrings.invalid_shipping_address
  var total: js.UndefOr[DisplayItem] = js.undefined
}

