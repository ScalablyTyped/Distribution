package typings.stripeCheckout

import typings.stripeCheckout.stripeCheckoutStrings.auto
import typings.stripeV3.stripe.Source
import typings.stripeV3.stripe.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StripeCheckoutOptions extends StObject {
  
  var alipay: js.UndefOr[Boolean | auto] = js.undefined
  
  var alipayReusable: js.UndefOr[Boolean] = js.undefined
  
  var allowRememberMe: js.UndefOr[Boolean] = js.undefined
  
  var amount: js.UndefOr[Double] = js.undefined
  
  var billingAddress: js.UndefOr[Boolean] = js.undefined
  
  var bitcoin: js.UndefOr[Boolean] = js.undefined
  
  var closed: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var opened: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var panelLabel: js.UndefOr[String] = js.undefined
  
  var shippingAddress: js.UndefOr[Boolean] = js.undefined
  
  var source: js.UndefOr[js.Function1[/* source */ Source, Unit]] = js.undefined
  
  var token: js.UndefOr[js.Function1[/* token */ Token, Unit]] = js.undefined
  
  var zipCode: js.UndefOr[Boolean] = js.undefined
}
object StripeCheckoutOptions {
  
  inline def apply(): StripeCheckoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StripeCheckoutOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StripeCheckoutOptions] (val x: Self) extends AnyVal {
    
    inline def setAlipay(value: Boolean | auto): Self = StObject.set(x, "alipay", value.asInstanceOf[js.Any])
    
    inline def setAlipayReusable(value: Boolean): Self = StObject.set(x, "alipayReusable", value.asInstanceOf[js.Any])
    
    inline def setAlipayReusableUndefined: Self = StObject.set(x, "alipayReusable", js.undefined)
    
    inline def setAlipayUndefined: Self = StObject.set(x, "alipay", js.undefined)
    
    inline def setAllowRememberMe(value: Boolean): Self = StObject.set(x, "allowRememberMe", value.asInstanceOf[js.Any])
    
    inline def setAllowRememberMeUndefined: Self = StObject.set(x, "allowRememberMe", js.undefined)
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setBillingAddress(value: Boolean): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
    
    inline def setBitcoin(value: Boolean): Self = StObject.set(x, "bitcoin", value.asInstanceOf[js.Any])
    
    inline def setBitcoinUndefined: Self = StObject.set(x, "bitcoin", js.undefined)
    
    inline def setClosed(value: () => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction0(value))
    
    inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpened(value: () => Unit): Self = StObject.set(x, "opened", js.Any.fromFunction0(value))
    
    inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
    
    inline def setPanelLabel(value: String): Self = StObject.set(x, "panelLabel", value.asInstanceOf[js.Any])
    
    inline def setPanelLabelUndefined: Self = StObject.set(x, "panelLabel", js.undefined)
    
    inline def setShippingAddress(value: Boolean): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
    
    inline def setSource(value: /* source */ Source => Unit): Self = StObject.set(x, "source", js.Any.fromFunction1(value))
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setToken(value: /* token */ Token => Unit): Self = StObject.set(x, "token", js.Any.fromFunction1(value))
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setZipCode(value: Boolean): Self = StObject.set(x, "zipCode", value.asInstanceOf[js.Any])
    
    inline def setZipCodeUndefined: Self = StObject.set(x, "zipCode", js.undefined)
  }
}
