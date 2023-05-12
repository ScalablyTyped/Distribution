package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Config
  *
  * @see https://github.com/Shopify/js-buy-sdk/blob/master/src/config.js
  */
trait ConfigAttrs extends StObject {
  
  /**
    * @deprecated
    */
  var accessToken: js.UndefOr[String] = js.undefined
  
  /**
    * @deprecated
    */
  var apiKey: js.UndefOr[String] = js.undefined
  
  var apiVersion: js.UndefOr[String] = js.undefined
  
  var domain: String
  
  var language: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var storefrontAccessToken: String
}
object ConfigAttrs {
  
  inline def apply(domain: String, storefrontAccessToken: String): ConfigAttrs = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], storefrontAccessToken = storefrontAccessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigAttrs] (val x: Self) extends AnyVal {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStorefrontAccessToken(value: String): Self = StObject.set(x, "storefrontAccessToken", value.asInstanceOf[js.Any])
  }
}
