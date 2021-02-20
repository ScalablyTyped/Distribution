package typings.stripeCheckout

import typings.stripeCheckout.stripeCheckoutStrings.auto
import typings.stripeV3.stripe.Source
import typings.stripeV3.stripe.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripeCheckoutOptions extends StObject {
  
  var alipay: js.UndefOr[Boolean | auto] = js.native
  
  var alipayReusable: js.UndefOr[Boolean] = js.native
  
  var allowRememberMe: js.UndefOr[Boolean] = js.native
  
  var amount: js.UndefOr[Double] = js.native
  
  var billingAddress: js.UndefOr[Boolean] = js.native
  
  var bitcoin: js.UndefOr[Boolean] = js.native
  
  var closed: js.UndefOr[js.Function0[Unit]] = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var image: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var opened: js.UndefOr[js.Function0[Unit]] = js.native
  
  var panelLabel: js.UndefOr[String] = js.native
  
  var shippingAddress: js.UndefOr[Boolean] = js.native
  
  var source: js.UndefOr[js.Function1[/* source */ Source, Unit]] = js.native
  
  var token: js.UndefOr[js.Function1[/* token */ Token, Unit]] = js.native
  
  var zipCode: js.UndefOr[Boolean] = js.native
}
object StripeCheckoutOptions {
  
  @scala.inline
  def apply(): StripeCheckoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StripeCheckoutOptions]
  }
  
  @scala.inline
  implicit class StripeCheckoutOptionsMutableBuilder[Self <: StripeCheckoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlipay(value: Boolean | auto): Self = StObject.set(x, "alipay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlipayReusable(value: Boolean): Self = StObject.set(x, "alipayReusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlipayReusableUndefined: Self = StObject.set(x, "alipayReusable", js.undefined)
    
    @scala.inline
    def setAlipayUndefined: Self = StObject.set(x, "alipay", js.undefined)
    
    @scala.inline
    def setAllowRememberMe(value: Boolean): Self = StObject.set(x, "allowRememberMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowRememberMeUndefined: Self = StObject.set(x, "allowRememberMe", js.undefined)
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setBillingAddress(value: Boolean): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
    
    @scala.inline
    def setBitcoin(value: Boolean): Self = StObject.set(x, "bitcoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitcoinUndefined: Self = StObject.set(x, "bitcoin", js.undefined)
    
    @scala.inline
    def setClosed(value: () => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpened(value: () => Unit): Self = StObject.set(x, "opened", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
    
    @scala.inline
    def setPanelLabel(value: String): Self = StObject.set(x, "panelLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelLabelUndefined: Self = StObject.set(x, "panelLabel", js.undefined)
    
    @scala.inline
    def setShippingAddress(value: Boolean): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
    
    @scala.inline
    def setSource(value: /* source */ Source => Unit): Self = StObject.set(x, "source", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setToken(value: /* token */ Token => Unit): Self = StObject.set(x, "token", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    @scala.inline
    def setZipCode(value: Boolean): Self = StObject.set(x, "zipCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipCodeUndefined: Self = StObject.set(x, "zipCode", js.undefined)
  }
}
