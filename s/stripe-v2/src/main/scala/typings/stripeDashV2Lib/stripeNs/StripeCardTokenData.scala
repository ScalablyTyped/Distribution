package typings
package stripeDashV2Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeCardTokenData extends js.Object {
  var address_city: js.UndefOr[java.lang.String] = js.undefined
  var address_country: js.UndefOr[java.lang.String] = js.undefined
  var address_line1: js.UndefOr[java.lang.String] = js.undefined
  var address_line2: js.UndefOr[java.lang.String] = js.undefined
  var address_state: js.UndefOr[java.lang.String] = js.undefined
  var address_zip: js.UndefOr[java.lang.String] = js.undefined
  var cvc: js.UndefOr[java.lang.String] = js.undefined
  var exp: js.UndefOr[java.lang.String] = js.undefined
  var exp_month: js.UndefOr[scala.Double] = js.undefined
  var exp_year: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var number: java.lang.String
}

object StripeCardTokenData {
  @scala.inline
  def apply(
    number: java.lang.String,
    address_city: java.lang.String = null,
    address_country: java.lang.String = null,
    address_line1: java.lang.String = null,
    address_line2: java.lang.String = null,
    address_state: java.lang.String = null,
    address_zip: java.lang.String = null,
    cvc: java.lang.String = null,
    exp: java.lang.String = null,
    exp_month: scala.Int | scala.Double = null,
    exp_year: scala.Int | scala.Double = null,
    name: java.lang.String = null
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

