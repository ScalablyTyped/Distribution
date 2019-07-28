package typings.stripeDashV2.stripeNs

import typings.stripeDashV2.Anon_Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeApplePay extends js.Object {
  def buildSession(
    data: StripeApplePayPaymentRequest,
    onSuccessHandler: js.Function2[
      /* result */ StripeApplePaySessionResult, 
      /* completion */ js.Function1[/* value */ js.Any, Unit], 
      Unit
    ],
    onErrorHanlder: js.Function1[/* error */ Anon_Message, Unit]
  ): js.Any
  def checkAvailability(resopnseHandler: js.Function1[/* result */ Boolean, Unit]): Unit
}

object StripeApplePay {
  @scala.inline
  def apply(
    buildSession: (StripeApplePayPaymentRequest, js.Function2[
      /* result */ StripeApplePaySessionResult, 
      /* completion */ js.Function1[/* value */ js.Any, Unit], 
      Unit
    ], js.Function1[/* error */ Anon_Message, Unit]) => js.Any,
    checkAvailability: js.Function1[/* result */ Boolean, Unit] => Unit
  ): StripeApplePay = {
    val __obj = js.Dynamic.literal(buildSession = js.Any.fromFunction3(buildSession), checkAvailability = js.Any.fromFunction1(checkAvailability))
  
    __obj.asInstanceOf[StripeApplePay]
  }
}

