package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shop
  extends StObject
     with Node
     with HasMetafields
     with MetafieldParentResource {
  
  var brand: js.UndefOr[Brand] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var moneyFormat: String
  
  var name: String
  
  var paymentSettings: PaymentSettings
  
  var primaryDomain: Domain
  
  var privacyPolicy: js.UndefOr[ShopPolicy] = js.undefined
  
  var refundPolicy: js.UndefOr[ShopPolicy] = js.undefined
  
  var shippingPolicy: js.UndefOr[ShopPolicy] = js.undefined
  
  var shipsToCountries: CountryCode
  
  var subscriptionPolicy: js.UndefOr[ShopPolicyWithDefault] = js.undefined
  
  var termsOfService: js.UndefOr[ShopPolicy] = js.undefined
}
object Shop {
  
  inline def apply(
    id: ID,
    metafields: js.Array[Metafield],
    moneyFormat: String,
    name: String,
    paymentSettings: PaymentSettings,
    primaryDomain: Domain,
    shipsToCountries: CountryCode
  ): Shop = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], moneyFormat = moneyFormat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paymentSettings = paymentSettings.asInstanceOf[js.Any], primaryDomain = primaryDomain.asInstanceOf[js.Any], shipsToCountries = shipsToCountries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shop] (val x: Self) extends AnyVal {
    
    inline def setBrand(value: Brand): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMoneyFormat(value: String): Self = StObject.set(x, "moneyFormat", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPaymentSettings(value: PaymentSettings): Self = StObject.set(x, "paymentSettings", value.asInstanceOf[js.Any])
    
    inline def setPrimaryDomain(value: Domain): Self = StObject.set(x, "primaryDomain", value.asInstanceOf[js.Any])
    
    inline def setPrivacyPolicy(value: ShopPolicy): Self = StObject.set(x, "privacyPolicy", value.asInstanceOf[js.Any])
    
    inline def setPrivacyPolicyUndefined: Self = StObject.set(x, "privacyPolicy", js.undefined)
    
    inline def setRefundPolicy(value: ShopPolicy): Self = StObject.set(x, "refundPolicy", value.asInstanceOf[js.Any])
    
    inline def setRefundPolicyUndefined: Self = StObject.set(x, "refundPolicy", js.undefined)
    
    inline def setShippingPolicy(value: ShopPolicy): Self = StObject.set(x, "shippingPolicy", value.asInstanceOf[js.Any])
    
    inline def setShippingPolicyUndefined: Self = StObject.set(x, "shippingPolicy", js.undefined)
    
    inline def setShipsToCountries(value: CountryCode): Self = StObject.set(x, "shipsToCountries", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionPolicy(value: ShopPolicyWithDefault): Self = StObject.set(x, "subscriptionPolicy", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionPolicyUndefined: Self = StObject.set(x, "subscriptionPolicy", js.undefined)
    
    inline def setTermsOfService(value: ShopPolicy): Self = StObject.set(x, "termsOfService", value.asInstanceOf[js.Any])
    
    inline def setTermsOfServiceUndefined: Self = StObject.set(x, "termsOfService", js.undefined)
  }
}
