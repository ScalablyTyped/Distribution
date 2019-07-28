package typings.stripeDashV3.stripeNs

import typings.stripeDashV3.stripeDashV3Strings.not_supported
import typings.stripeDashV3.stripeDashV3Strings.optional
import typings.stripeDashV3.stripeDashV3Strings.recommended
import typings.stripeDashV3.stripeDashV3Strings.required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Card extends js.Object {
  var address_city: js.UndefOr[String] = js.undefined
  var address_country: js.UndefOr[String] = js.undefined
  var address_line1: js.UndefOr[String] = js.undefined
  var address_line1_check: js.UndefOr[checkType] = js.undefined
  var address_line2: js.UndefOr[String] = js.undefined
  var address_state: js.UndefOr[String] = js.undefined
  var address_zip: js.UndefOr[String] = js.undefined
  var address_zip_check: js.UndefOr[checkType] = js.undefined
  var brand: brandType
  var country: String
  var currency: js.UndefOr[String] = js.undefined
  var cvc_check: js.UndefOr[checkType] = js.undefined
  var dynamic_last4: String
  var exp_month: Double
  var exp_year: Double
  var fingerprint: String
  var funding: fundingType
  var id: String
  var last4: String
  var metadata: js.Any
  var name: js.UndefOr[String] = js.undefined
  var `object`: String
  var three_d_secure: js.UndefOr[required | recommended | optional | not_supported] = js.undefined
  var tokenization_method: js.UndefOr[tokenizationType] = js.undefined
}

object Card {
  @scala.inline
  def apply(
    brand: brandType,
    country: String,
    dynamic_last4: String,
    exp_month: Double,
    exp_year: Double,
    fingerprint: String,
    funding: fundingType,
    id: String,
    last4: String,
    metadata: js.Any,
    `object`: String,
    address_city: String = null,
    address_country: String = null,
    address_line1: String = null,
    address_line1_check: checkType = null,
    address_line2: String = null,
    address_state: String = null,
    address_zip: String = null,
    address_zip_check: checkType = null,
    currency: String = null,
    cvc_check: checkType = null,
    name: String = null,
    three_d_secure: required | recommended | optional | not_supported = null,
    tokenization_method: tokenizationType = null
  ): Card = {
    val __obj = js.Dynamic.literal(brand = brand, country = country, dynamic_last4 = dynamic_last4, exp_month = exp_month, exp_year = exp_year, fingerprint = fingerprint, funding = funding, id = id, last4 = last4, metadata = metadata)
    __obj.updateDynamic("object")(`object`)
    if (address_city != null) __obj.updateDynamic("address_city")(address_city)
    if (address_country != null) __obj.updateDynamic("address_country")(address_country)
    if (address_line1 != null) __obj.updateDynamic("address_line1")(address_line1)
    if (address_line1_check != null) __obj.updateDynamic("address_line1_check")(address_line1_check)
    if (address_line2 != null) __obj.updateDynamic("address_line2")(address_line2)
    if (address_state != null) __obj.updateDynamic("address_state")(address_state)
    if (address_zip != null) __obj.updateDynamic("address_zip")(address_zip)
    if (address_zip_check != null) __obj.updateDynamic("address_zip_check")(address_zip_check)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (cvc_check != null) __obj.updateDynamic("cvc_check")(cvc_check)
    if (name != null) __obj.updateDynamic("name")(name)
    if (three_d_secure != null) __obj.updateDynamic("three_d_secure")(three_d_secure.asInstanceOf[js.Any])
    if (tokenization_method != null) __obj.updateDynamic("tokenization_method")(tokenization_method)
    __obj.asInstanceOf[Card]
  }
}

