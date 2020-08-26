package typings.stripeV2.stripe

import typings.stripeV2.anon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeApplePay extends js.Object {
  def buildSession(
    data: StripeApplePayPaymentRequest,
    onSuccessHandler: js.Function2[
      /* result */ StripeApplePaySessionResult, 
      /* completion */ js.Function1[/* value */ js.Any, Unit], 
      Unit
    ],
    onErrorHanlder: js.Function1[/* error */ Message, Unit]
  ): js.Any = js.native
  def checkAvailability(resopnseHandler: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
}

object StripeApplePay {
  @scala.inline
  def apply(
    buildSession: (StripeApplePayPaymentRequest, js.Function2[
      /* result */ StripeApplePaySessionResult, 
      /* completion */ js.Function1[/* value */ js.Any, Unit], 
      Unit
    ], js.Function1[/* error */ Message, Unit]) => js.Any,
    checkAvailability: js.Function1[/* result */ Boolean, Unit] => Unit
  ): StripeApplePay = {
    val __obj = js.Dynamic.literal(buildSession = js.Any.fromFunction3(buildSession), checkAvailability = js.Any.fromFunction1(checkAvailability))
    __obj.asInstanceOf[StripeApplePay]
  }
  @scala.inline
  implicit class StripeApplePayOps[Self <: StripeApplePay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuildSession(
      value: (StripeApplePayPaymentRequest, js.Function2[
          /* result */ StripeApplePaySessionResult, 
          /* completion */ js.Function1[/* value */ js.Any, Unit], 
          Unit
        ], js.Function1[/* error */ Message, Unit]) => js.Any
    ): Self = this.set("buildSession", js.Any.fromFunction3(value))
    @scala.inline
    def setCheckAvailability(value: js.Function1[/* result */ Boolean, Unit] => Unit): Self = this.set("checkAvailability", js.Any.fromFunction1(value))
  }
  
}

