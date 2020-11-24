package typings.stripeV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripeStatic extends js.Object {
  
  var applePay: StripeApplePay = js.native
  
  var bankAccount: StripeBankAccount = js.native
  
  var card: StripeCard = js.native
  
  def cardType(cardNumber: String): StripeCardDataBrand = js.native
  
  def createToken(
    data: StripeCardTokenData,
    responseHandler: js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]
  ): Unit = js.native
  
  def getToken(
    token: String,
    responseHandler: js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]
  ): Unit = js.native
  
  def setPublishableKey(key: String): Unit = js.native
  
  def validateCVC(cardCVC: String): Boolean = js.native
  
  def validateCardNumber(cardNumber: String): Boolean = js.native
  
  def validateExpiry(month: String, year: String): Boolean = js.native
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
    val __obj = js.Dynamic.literal(applePay = applePay.asInstanceOf[js.Any], bankAccount = bankAccount.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], cardType = js.Any.fromFunction1(cardType), createToken = js.Any.fromFunction2(createToken), getToken = js.Any.fromFunction2(getToken), setPublishableKey = js.Any.fromFunction1(setPublishableKey), validateCVC = js.Any.fromFunction1(validateCVC), validateCardNumber = js.Any.fromFunction1(validateCardNumber), validateExpiry = js.Any.fromFunction2(validateExpiry))
    __obj.asInstanceOf[StripeStatic]
  }
  
  @scala.inline
  implicit class StripeStaticOps[Self <: StripeStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplePay(value: StripeApplePay): Self = this.set("applePay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBankAccount(value: StripeBankAccount): Self = this.set("bankAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCard(value: StripeCard): Self = this.set("card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardType(value: String => StripeCardDataBrand): Self = this.set("cardType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateToken(
      value: (StripeCardTokenData, js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => Unit
    ): Self = this.set("createToken", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetToken(
      value: (String, js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => Unit
    ): Self = this.set("getToken", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetPublishableKey(value: String => Unit): Self = this.set("setPublishableKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateCVC(value: String => Boolean): Self = this.set("validateCVC", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateCardNumber(value: String => Boolean): Self = this.set("validateCardNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateExpiry(value: (String, String) => Boolean): Self = this.set("validateExpiry", js.Any.fromFunction2(value))
  }
}
