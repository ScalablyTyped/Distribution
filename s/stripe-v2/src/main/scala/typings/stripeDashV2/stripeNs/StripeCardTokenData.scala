package typings.stripeDashV2.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeCardTokenData extends js.Object {
  var address_city: js.UndefOr[String] = js.undefined
  var address_country: js.UndefOr[String] = js.undefined
  var address_line1: js.UndefOr[String] = js.undefined
  var address_line2: js.UndefOr[String] = js.undefined
  var address_state: js.UndefOr[String] = js.undefined
  var address_zip: js.UndefOr[String] = js.undefined
  var cvc: js.UndefOr[String] = js.undefined
  var exp: js.UndefOr[String] = js.undefined
  var exp_month: js.UndefOr[Double] = js.undefined
  var exp_year: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var number: String
}

object StripeCardTokenData {
  @scala.inline
  def apply(
    number: String,
    address_city: String = null,
    address_country: String = null,
    address_line1: String = null,
    address_line2: String = null,
    address_state: String = null,
    address_zip: String = null,
    cvc: String = null,
    exp: String = null,
    exp_month: Int | Double = null,
    exp_year: Int | Double = null,
    name: String = null
  ): StripeCardTokenData = {
    val __obj = js.Dynamic.literal(number = number)
    if (address_city != null) __obj.updateDynamic("address_city")(address_city)
    if (address_country != null) __obj.updateDynamic("address_country")(address_country)
    if (address_line1 != null) __obj.updateDynamic("address_line1")(address_line1)
    if (address_line2 != null) __obj.updateDynamic("address_line2")(address_line2)
    if (address_state != null) __obj.updateDynamic("address_state")(address_state)
    if (address_zip != null) __obj.updateDynamic("address_zip")(address_zip)
    if (cvc != null) __obj.updateDynamic("cvc")(cvc)
    if (exp != null) __obj.updateDynamic("exp")(exp)
    if (exp_month != null) __obj.updateDynamic("exp_month")(exp_month.asInstanceOf[js.Any])
    if (exp_year != null) __obj.updateDynamic("exp_year")(exp_year.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[StripeCardTokenData]
  }
}

