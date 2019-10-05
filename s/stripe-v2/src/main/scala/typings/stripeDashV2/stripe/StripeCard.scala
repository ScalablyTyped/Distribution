package typings.stripeDashV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeCard extends js.Object {
  var address_city: js.UndefOr[String] = js.undefined
  var address_country: js.UndefOr[String] = js.undefined
  var address_line1: js.UndefOr[String] = js.undefined
  var address_line2: js.UndefOr[String] = js.undefined
  var address_state: js.UndefOr[String] = js.undefined
  var address_zip: js.UndefOr[String] = js.undefined
  var brand: js.UndefOr[StripeCardDataBrand] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var exp_month: Double
  var exp_year: Double
  var funding: js.UndefOr[StripeCardDataFunding] = js.undefined
  var last4: String
  var name: js.UndefOr[String] = js.undefined
  var `object`: String
  def createToken(
    data: StripeCardTokenData,
    responseHandler: js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]
  ): Unit
  def validateCVC(cardCVC: String): Boolean
  def validateCardNumber(cardNumber: String): Boolean
  def validateExpiry(month: String, year: String): Boolean
}

object StripeCard {
  @scala.inline
  def apply(
    createToken: (StripeCardTokenData, js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => Unit,
    exp_month: Double,
    exp_year: Double,
    last4: String,
    `object`: String,
    validateCVC: String => Boolean,
    validateCardNumber: String => Boolean,
    validateExpiry: (String, String) => Boolean,
    address_city: String = null,
    address_country: String = null,
    address_line1: String = null,
    address_line2: String = null,
    address_state: String = null,
    address_zip: String = null,
    brand: StripeCardDataBrand = null,
    country: String = null,
    funding: StripeCardDataFunding = null,
    name: String = null
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

