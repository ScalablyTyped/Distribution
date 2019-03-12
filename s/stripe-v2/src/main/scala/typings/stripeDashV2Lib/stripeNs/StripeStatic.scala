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

object StripeStatic {
  @scala.inline
  def apply(
    applePay: StripeApplePay,
    bankAccount: StripeBankAccount,
    card: StripeCard,
    cardType: java.lang.String => StripeCardDataBrand,
    createToken: (StripeCardTokenData, js.Function2[/* status */ scala.Double, /* response */ StripeCardTokenResponse, scala.Unit]) => scala.Unit,
    getToken: (java.lang.String, js.Function2[/* status */ scala.Double, /* response */ StripeCardTokenResponse, scala.Unit]) => scala.Unit,
    setPublishableKey: java.lang.String => scala.Unit,
    validateCVC: java.lang.String => scala.Boolean,
    validateCardNumber: java.lang.String => scala.Boolean,
    validateExpiry: (java.lang.String, java.lang.String) => scala.Boolean
  ): StripeStatic = {
    val __obj = js.Dynamic.literal(applePay = applePay, bankAccount = bankAccount, card = card, cardType = js.Any.fromFunction1(cardType), createToken = js.Any.fromFunction2(createToken), getToken = js.Any.fromFunction2(getToken), setPublishableKey = js.Any.fromFunction1(setPublishableKey), validateCVC = js.Any.fromFunction1(validateCVC), validateCardNumber = js.Any.fromFunction1(validateCardNumber), validateExpiry = js.Any.fromFunction2(validateExpiry))
  
    __obj.asInstanceOf[StripeStatic]
  }
}

