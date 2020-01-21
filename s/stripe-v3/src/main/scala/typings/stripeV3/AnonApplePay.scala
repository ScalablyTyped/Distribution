package typings.stripeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApplePay extends js.Object {
  var applePay: js.UndefOr[Boolean] = js.undefined
}

object AnonApplePay {
  @scala.inline
  def apply(applePay: js.UndefOr[Boolean] = js.undefined): AnonApplePay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applePay)) __obj.updateDynamic("applePay")(applePay.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApplePay]
  }
}

