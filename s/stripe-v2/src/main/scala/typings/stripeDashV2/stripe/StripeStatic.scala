package typings.stripeDashV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeStatic extends js.Object {
  var applePay: StripeApplePay
  var bankAccount: StripeBankAccount
  var card: StripeCard
  def cardType(cardNumber: String): StripeCardDataBrand
  def createToken(
    data: StripeCardTokenData,
    responseHandler: js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]
  ): Unit
  def getToken(
    token: String,
    responseHandler: js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]
  ): Unit
  def setPublishableKey(key: String): Unit
  def validateCVC(cardCVC: String): Boolean
  def validateCardNumber(cardNumber: String): Boolean
  def validateExpiry(month: String, year: String): Boolean
}

object StripeStatic {
  @scala.inline
  def apply(
    applePay: StripeApplePay,
    bankAccount: StripeBankAccount,
    card: StripeCard,
    cardType: String => StripeCardDataBrand,
    createToken: (StripeCardTokenData, js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => Unit,
    getToken: (String, js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => Unit,
    setPublishableKey: String => Unit,
    validateCVC: String => Boolean,
    validateCardNumber: String => Boolean,
    validateExpiry: (String, String) => Boolean
  ): StripeStatic = {
    val __obj = js.Dynamic.literal(applePay = applePay, bankAccount = bankAccount, card = card, cardType = js.Any.fromFunction1(cardType), createToken = js.Any.fromFunction2(createToken), getToken = js.Any.fromFunction2(getToken), setPublishableKey = js.Any.fromFunction1(setPublishableKey), validateCVC = js.Any.fromFunction1(validateCVC), validateCardNumber = js.Any.fromFunction1(validateCardNumber), validateExpiry = js.Any.fromFunction2(validateExpiry))
  
    __obj.asInstanceOf[StripeStatic]
  }
}

