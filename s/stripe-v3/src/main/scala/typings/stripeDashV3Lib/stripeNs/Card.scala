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

