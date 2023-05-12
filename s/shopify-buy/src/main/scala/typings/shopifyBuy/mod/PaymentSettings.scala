package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentSettings extends StObject {
  
  var acceptedCardBrands: js.Array[CardBrand]
  
  var cardVaultUrl: URL
  
  var countryCode: CountryCode
  
  var currencyCode: CurrencyCode
  
  var enabledPresentmentCurrencies: js.Array[CurrencyCode]
  
  var shopifyPaymentsAccountId: js.UndefOr[String] = js.undefined
  
  var supportedDigitalWallets: DigitalWallet
}
object PaymentSettings {
  
  inline def apply(
    acceptedCardBrands: js.Array[CardBrand],
    cardVaultUrl: URL,
    countryCode: CountryCode,
    currencyCode: CurrencyCode,
    enabledPresentmentCurrencies: js.Array[CurrencyCode],
    supportedDigitalWallets: DigitalWallet
  ): PaymentSettings = {
    val __obj = js.Dynamic.literal(acceptedCardBrands = acceptedCardBrands.asInstanceOf[js.Any], cardVaultUrl = cardVaultUrl.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any], enabledPresentmentCurrencies = enabledPresentmentCurrencies.asInstanceOf[js.Any], supportedDigitalWallets = supportedDigitalWallets.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentSettings] (val x: Self) extends AnyVal {
    
    inline def setAcceptedCardBrands(value: js.Array[CardBrand]): Self = StObject.set(x, "acceptedCardBrands", value.asInstanceOf[js.Any])
    
    inline def setAcceptedCardBrandsVarargs(value: CardBrand*): Self = StObject.set(x, "acceptedCardBrands", js.Array(value*))
    
    inline def setCardVaultUrl(value: URL): Self = StObject.set(x, "cardVaultUrl", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: CountryCode): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCode(value: CurrencyCode): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setEnabledPresentmentCurrencies(value: js.Array[CurrencyCode]): Self = StObject.set(x, "enabledPresentmentCurrencies", value.asInstanceOf[js.Any])
    
    inline def setEnabledPresentmentCurrenciesVarargs(value: CurrencyCode*): Self = StObject.set(x, "enabledPresentmentCurrencies", js.Array(value*))
    
    inline def setShopifyPaymentsAccountId(value: String): Self = StObject.set(x, "shopifyPaymentsAccountId", value.asInstanceOf[js.Any])
    
    inline def setShopifyPaymentsAccountIdUndefined: Self = StObject.set(x, "shopifyPaymentsAccountId", js.undefined)
    
    inline def setSupportedDigitalWallets(value: DigitalWallet): Self = StObject.set(x, "supportedDigitalWallets", value.asInstanceOf[js.Any])
  }
}
