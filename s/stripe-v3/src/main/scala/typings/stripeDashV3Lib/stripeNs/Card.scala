package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Card extends js.Object {
  var address_city: js.UndefOr[java.lang.String] = js.undefined
  var address_country: js.UndefOr[java.lang.String] = js.undefined
  var address_line1: js.UndefOr[java.lang.String] = js.undefined
  var address_line1_check: js.UndefOr[checkType] = js.undefined
  var address_line2: js.UndefOr[java.lang.String] = js.undefined
  var address_state: js.UndefOr[java.lang.String] = js.undefined
  var address_zip: js.UndefOr[java.lang.String] = js.undefined
  var address_zip_check: js.UndefOr[checkType] = js.undefined
  var brand: brandType
  var country: java.lang.String
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var cvc_check: js.UndefOr[checkType] = js.undefined
  var dynamic_last4: java.lang.String
  var exp_month: scala.Double
  var exp_year: scala.Double
  var fingerprint: java.lang.String
  var funding: fundingType
  var id: java.lang.String
  var last4: java.lang.String
  var metadata: js.Any
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `object`: java.lang.String
  var three_d_secure: js.UndefOr[
    stripeDashV3Lib.stripeDashV3LibStrings.required | stripeDashV3Lib.stripeDashV3LibStrings.recommended | stripeDashV3Lib.stripeDashV3LibStrings.optional | stripeDashV3Lib.stripeDashV3LibStrings.not_supported
  ] = js.undefined
  var tokenization_method: js.UndefOr[tokenizationType] = js.undefined
}

object Card {
  @scala.inline
  def apply(
    brand: brandType,
    country: java.lang.String,
    dynamic_last4: java.lang.String,
    exp_month: scala.Double,
    exp_year: scala.Double,
    fingerprint: java.lang.String,
    funding: fundingType,
    id: java.lang.String,
    last4: java.lang.String,
    metadata: js.Any,
    `object`: java.lang.String,
    address_city: java.lang.String = null,
    address_country: java.lang.String = null,
    address_line1: java.lang.String = null,
    address_line1_check: checkType = null,
    address_line2: java.lang.String = null,
    address_state: java.lang.String = null,
    address_zip: java.lang.String = null,
    address_zip_check: checkType = null,
    currency: java.lang.String = null,
    cvc_check: checkType = null,
    name: java.lang.String = null,
    three_d_secure: stripeDashV3Lib.stripeDashV3LibStrings.required | stripeDashV3Lib.stripeDashV3LibStrings.recommended | stripeDashV3Lib.stripeDashV3LibStrings.optional | stripeDashV3Lib.stripeDashV3LibStrings.not_supported = null,
    tokenization_method: tokenizationType = null
  ): Card = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("brand")(brand)
    __obj.updateDynamic("country")(country)
    __obj.updateDynamic("dynamic_last4")(dynamic_last4)
    __obj.updateDynamic("exp_month")(exp_month)
    __obj.updateDynamic("exp_year")(exp_year)
    __obj.updateDynamic("fingerprint")(fingerprint)
    __obj.updateDynamic("funding")(funding)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("last4")(last4)
    __obj.updateDynamic("metadata")(metadata)
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

