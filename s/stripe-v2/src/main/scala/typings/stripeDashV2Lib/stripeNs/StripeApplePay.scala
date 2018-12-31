package typings
package stripeDashV2Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeApplePay extends js.Object {
  def buildSession(
    data: StripeApplePayPaymentRequest,
    onSuccessHandler: js.Function2[
      /* result */ StripeApplePaySessionResult, 
      /* completion */ js.Function1[/* value */ js.Any, scala.Unit], 
      scala.Unit
    ],
    onErrorHanlder: js.Function1[/* error */ stripeDashV2Lib.Anon_Message, scala.Unit]
  ): js.Any
  def checkAvailability(resopnseHandler: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit
}

