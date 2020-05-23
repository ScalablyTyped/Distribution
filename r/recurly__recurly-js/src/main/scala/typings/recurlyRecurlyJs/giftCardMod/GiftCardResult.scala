package typings.recurlyRecurlyJs.giftCardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GiftCardResult extends js.Object {
  var currency: String
  var unit_amount: Double
}

object GiftCardResult {
  @scala.inline
  def apply(currency: String, unit_amount: Double): GiftCardResult = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], unit_amount = unit_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GiftCardResult]
  }
}

