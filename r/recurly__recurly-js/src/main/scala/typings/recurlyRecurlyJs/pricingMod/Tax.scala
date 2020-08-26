package typings.recurlyRecurlyJs.pricingMod

import typings.recurlyRecurlyJs.anon.Next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tax extends js.Object {
  var amounts: js.UndefOr[Next] = js.native
  var tax_code: String = js.native
  var vat_number: js.UndefOr[String] = js.native
}

object Tax {
  @scala.inline
  def apply(tax_code: String): Tax = {
    val __obj = js.Dynamic.literal(tax_code = tax_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tax]
  }
  @scala.inline
  implicit class TaxOps[Self <: Tax] (val x: Self) extends AnyVal {
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
    def setTax_code(value: String): Self = this.set("tax_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmounts(value: Next): Self = this.set("amounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmounts: Self = this.set("amounts", js.undefined)
    @scala.inline
    def setVat_number(value: String): Self = this.set("vat_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVat_number: Self = this.set("vat_number", js.undefined)
  }
  
}

