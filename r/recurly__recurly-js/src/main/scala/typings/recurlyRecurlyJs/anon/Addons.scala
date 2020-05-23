package typings.recurlyRecurlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Addons extends js.Object {
  var addons: String
  var discount: String
  var plan: String
  var setup_fee: String
  var subtotal: String
  var tax: String
  var total: String
}

object Addons {
  @scala.inline
  def apply(
    addons: String,
    discount: String,
    plan: String,
    setup_fee: String,
    subtotal: String,
    tax: String,
    total: String
  ): Addons = {
    val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any], discount = discount.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], setup_fee = setup_fee.asInstanceOf[js.Any], subtotal = subtotal.asInstanceOf[js.Any], tax = tax.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addons]
  }
}

