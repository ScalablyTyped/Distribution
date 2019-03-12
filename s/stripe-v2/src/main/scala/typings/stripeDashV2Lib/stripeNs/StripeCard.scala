package typings
package stripeDashV2Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeCard extends js.Object {
  var address_city: js.UndefOr[java.lang.String] = js.undefined
  var address_country: js.UndefOr[java.lang.String] = js.undefined
  var address_line1: js.UndefOr[java.lang.String] = js.undefined
  var address_line2: js.UndefOr[java.lang.String] = js.undefined
  var address_state: js.UndefOr[java.lang.String] = js.undefined
  var address_zip: js.UndefOr[java.lang.String] = js.undefined
  var brand: js.UndefOr[StripeCardDataBrand] = js.undefined
  var country: js.UndefOr[java.lang.String] = js.undefined
  var exp_month: scala.Double
  var exp_year: scala.Double
  var funding: js.UndefOr[StripeCardDataFunding] = js.undefined
  var last4: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `object`: java.lang.String
  def createToken(
    data: StripeCardTokenData,
    responseHandler: js.Function2[/* status */ scala.Double, /* response */ StripeCardTokenResponse, scala.Unit]
  ): scala.Unit
  def validateCVC(cardCVC: java.lang.String): scala.Boolean
  def validateCardNumber(cardNumber: java.lang.String): scala.Boolean
  def validateExpiry(month: java.lang.String, year: java.lang.String): scala.Boolean
}

object StripeCard {
  @scala.inline
  def apply(
    createToken: (StripeCardTokenData, js.Function2[/* status */ scala.Double, /* response */ StripeCardTokenResponse, scala.Unit]) => scala.Unit,
    exp_month: scala.Double,
    exp_year: scala.Double,
    last4: java.lang.String,
    `object`: java.lang.String,
    validateCVC: java.lang.String => scala.Boolean,
    validateCardNumber: java.lang.String => scala.Boolean,
    validateExpiry: (java.lang.String, java.lang.String) => scala.Boolean,
    address_city: java.lang.String = null,
    address_country: java.lang.String = null,
    address_line1: java.lang.String = null,
    address_line2: java.lang.String = null,
    address_state: java.lang.String = null,
    address_zip: java.lang.String = null,
    brand: StripeCardDataBrand = null,
    country: java.lang.String = null,
    funding: StripeCardDataFunding = null,
    name: java.lang.String = null
  ): StripeCard = {
    val __obj = js.Dynamic.literal(createToken = js.Any.fromFunction2(createToken), exp_month = exp_month, exp_year = exp_year, last4 = last4, validateCVC = js.Any.fromFunction1(validateCVC), validateCardNumber = js.Any.fromFunction1(validateCardNumber), validateExpiry = js.Any.fromFunction2(validateExpiry))
    __obj.updateDynamic("object")(`object`)
    if (address_city != null) __obj.updateDynamic("address_city")(address_city)
    if (address_country != null) __obj.updateDynamic("address_country")(address_country)
    if (address_line1 != null) __obj.updateDynamic("address_line1")(address_line1)
    if (address_line2 != null) __obj.updateDynamic("address_line2")(address_line2)
    if (address_state != null) __obj.updateDynamic("address_state")(address_state)
    if (address_zip != null) __obj.updateDynamic("address_zip")(address_zip)
    if (brand != null) __obj.updateDynamic("brand")(brand)
    if (country != null) __obj.updateDynamic("country")(country)
    if (funding != null) __obj.updateDynamic("funding")(funding)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[StripeCard]
  }
}

