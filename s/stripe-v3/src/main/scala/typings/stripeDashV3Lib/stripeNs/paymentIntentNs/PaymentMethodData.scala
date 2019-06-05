package typings
package stripeDashV3Lib.stripeNs.paymentIntentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodData extends js.Object {
  var billing_details: js.UndefOr[stripeDashV3Lib.stripeNs.OwnerInfo] = js.undefined
  var card: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object PaymentMethodData {
  @scala.inline
  def apply(
    billing_details: stripeDashV3Lib.stripeNs.OwnerInfo = null,
    card: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): PaymentMethodData = {
    val __obj = js.Dynamic.literal()
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details)
    if (card != null) __obj.updateDynamic("card")(card)
    __obj.asInstanceOf[PaymentMethodData]
  }
}

