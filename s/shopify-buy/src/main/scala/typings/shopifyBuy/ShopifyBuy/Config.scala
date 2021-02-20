package typings.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends StObject {
  
  var domain: String = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var storefrontAccessToken: String = js.native
}
object Config {
  
  @scala.inline
  def apply(domain: String, storefrontAccessToken: String): Config = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], storefrontAccessToken = storefrontAccessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setStorefrontAccessToken(value: String): Self = StObject.set(x, "storefrontAccessToken", value.asInstanceOf[js.Any])
  }
}
