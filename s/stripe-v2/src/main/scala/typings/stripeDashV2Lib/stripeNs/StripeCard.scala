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

