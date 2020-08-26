package typings.reactCurrencyFormatter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrencyFormatterProps extends js.Object {
  var currency: js.UndefOr[String] = js.native
  var decimal: js.UndefOr[String] = js.native
  var group: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String] = js.native
  var pattern: js.UndefOr[String] = js.native
  var quantity: Double = js.native
  var symbol: js.UndefOr[String] = js.native
}

object CurrencyFormatterProps {
  @scala.inline
  def apply(quantity: Double): CurrencyFormatterProps = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyFormatterProps]
  }
  @scala.inline
  implicit class CurrencyFormatterPropsOps[Self <: CurrencyFormatterProps] (val x: Self) extends AnyVal {
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
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setDecimal(value: String): Self = this.set("decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimal: Self = this.set("decimal", js.undefined)
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
  }
  
}

