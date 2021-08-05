package typings.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var domain: String
  
  var language: js.UndefOr[String] = js.undefined
  
  var storefrontAccessToken: String
}
object Config {
  
  inline def apply(domain: String, storefrontAccessToken: String): Config = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], storefrontAccessToken = storefrontAccessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setStorefrontAccessToken(value: String): Self = StObject.set(x, "storefrontAccessToken", value.asInstanceOf[js.Any])
  }
}
