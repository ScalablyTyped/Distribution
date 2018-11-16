package typings
package stripeDashV2Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StripeStatic extends js.Object {
  var applePay: StripeApplePay
  var bankAccount: StripeBankAccount
  var card: StripeCard
  def cardType(cardNumber: java.lang.String): StripeCardDataBrand
  def createToken(
    data: StripeCardTokenData,
    responseHandler: js.Function2[/* status */ scala.Double, /* response */ StripeCardTokenResponse, scala.Unit]
  ): scala.Unit
  def getToken(
    token: java.lang.String,
    responseHandler: js.Function2[/* status */ scala.Double, /* response */ StripeCardTokenResponse, scala.Unit]
  ): scala.Unit
  def setPublishableKey(key: java.lang.String): scala.Unit
  def validateCVC(cardCVC: java.lang.String): scala.Boolean
  def validateCardNumber(cardNumber: java.lang.String): scala.Boolean
  def validateExpiry(month: java.lang.String, year: java.lang.String): scala.Boolean
}

