package typings.recurlyRecurlyJs.giftCardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GiftCardResult extends js.Object {
  var currency: String = js.native
  var unit_amount: Double = js.native
}

object GiftCardResult {
  @scala.inline
  def apply(currency: String, unit_amount: Double): GiftCardResult = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], unit_amount = unit_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GiftCardResult]
  }
  @scala.inline
  implicit class GiftCardResultOps[Self <: GiftCardResult] (val x: Self) extends AnyVal {
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnit_amount(value: Double): Self = this.set("unit_amount", value.asInstanceOf[js.Any])
  }
  
}

