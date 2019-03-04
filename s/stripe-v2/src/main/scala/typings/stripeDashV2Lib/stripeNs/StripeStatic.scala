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
    cardType: js.Function1[java.lang.String, StripeCardDataBrand],
    createToken: js.Function2[
      StripeCardTokenData, 
      js.Function2[/* status */ scala.Double, /* response */ StripeCardTokenResponse, scala.Unit], 
      scala.Unit
    ],
    getToken: js.Function2[
      java.lang.String, 
      js.Function2[/* status */ scala.Double, /* response */ StripeCardTokenResponse, scala.Unit], 
      scala.Unit
    ],
    setPublishableKey: js.Function1[java.lang.String, scala.Unit],
    validateCVC: js.Function1[java.lang.String, scala.Boolean],
    validateCardNumber: js.Function1[java.lang.String, scala.Boolean],
    validateExpiry: js.Function2[java.lang.String, java.lang.String, scala.Boolean]
  ): StripeStatic = {
    val __obj = js.Dynamic.literal(applePay = applePay, bankAccount = bankAccount, card = card, cardType = cardType, createToken = createToken, getToken = getToken, setPublishableKey = setPublishableKey, validateCVC = validateCVC, validateCardNumber = validateCardNumber, validateExpiry = validateExpiry)
  
    __obj.asInstanceOf[StripeStatic]
  }
}

