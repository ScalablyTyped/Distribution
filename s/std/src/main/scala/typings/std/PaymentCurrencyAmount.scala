package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentCurrencyAmount extends js.Object {
  var currency: java.lang.String = js.native
  var currencySystem: js.UndefOr[java.lang.String] = js.native
  var value: java.lang.String = js.native
}

object PaymentCurrencyAmount {
  @scala.inline
  def apply(currency: java.lang.String, value: java.lang.String): PaymentCurrencyAmount = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentCurrencyAmount]
  }
  @scala.inline
  implicit class PaymentCurrencyAmountOps[Self <: PaymentCurrencyAmount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrency(value: java.lang.String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: java.lang.String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrencySystem(value: java.lang.String): Self = this.set("currencySystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencySystem: Self = this.set("currencySystem", js.undefined)
  }
  
}

