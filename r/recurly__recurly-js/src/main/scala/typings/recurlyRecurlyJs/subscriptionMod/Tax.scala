package typings.recurlyRecurlyJs.subscriptionMod

import typings.recurlyRecurlyJs.AnonNext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tax extends js.Object {
  var amounts: js.UndefOr[AnonNext] = js.undefined
  var tax_code: String
  var vat_number: js.UndefOr[String] = js.undefined
}

object Tax {
  @scala.inline
  def apply(tax_code: String, amounts: AnonNext = null, vat_number: String = null): Tax = {
    val __obj = js.Dynamic.literal(tax_code = tax_code.asInstanceOf[js.Any])
    if (amounts != null) __obj.updateDynamic("amounts")(amounts.asInstanceOf[js.Any])
    if (vat_number != null) __obj.updateDynamic("vat_number")(vat_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tax]
  }
}

