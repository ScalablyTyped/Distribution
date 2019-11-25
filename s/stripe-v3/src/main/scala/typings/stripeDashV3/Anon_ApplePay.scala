package typings.stripeDashV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplePay extends js.Object {
  var applePay: js.UndefOr[Boolean] = js.undefined
}

object Anon_ApplePay {
  @scala.inline
  def apply(applePay: js.UndefOr[Boolean] = js.undefined): Anon_ApplePay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applePay)) __obj.updateDynamic("applePay")(applePay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ApplePay]
  }
}

