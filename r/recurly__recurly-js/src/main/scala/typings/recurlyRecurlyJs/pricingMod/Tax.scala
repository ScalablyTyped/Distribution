package typings.recurlyRecurlyJs.pricingMod

import typings.recurlyRecurlyJs.anon.Next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tax extends js.Object {
  var amounts: js.UndefOr[Next] = js.undefined
  var tax_code: String
  var vat_number: js.UndefOr[String] = js.undefined
}

object Tax {
  @scala.inline
  def apply(tax_code: String, amounts: Next = null, vat_number: String = null): Tax = {
    val __obj = js.Dynamic.literal(tax_code = tax_code.asInstanceOf[js.Any])
    if (amounts != null) __obj.updateDynamic("amounts")(amounts.asInstanceOf[js.Any])
    if (vat_number != null) __obj.updateDynamic("vat_number")(vat_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tax]
  }
}

