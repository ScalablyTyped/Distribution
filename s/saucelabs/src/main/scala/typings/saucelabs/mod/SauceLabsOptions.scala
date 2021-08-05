package typings.saucelabs.mod

import typings.saucelabs.saucelabsStrings.`eu-central-1`
import typings.saucelabs.saucelabsStrings.`us-east-1`
import typings.saucelabs.saucelabsStrings.`us-west-1`
import typings.saucelabs.saucelabsStrings.eu
import typings.saucelabs.saucelabsStrings.staging
import typings.saucelabs.saucelabsStrings.us
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SauceLabsOptions extends StObject {
  
  /**
    * If you want to set request headers, as example {'User-Agent': 'node-saucelabs'}
    */
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /**
    * If set to true you are accessing the headless Sauce instances (this discards the region option).
    */
  var headless: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Your Sauce Labs access key.
    */
  var key: String
  
  /**
    * If you want to tunnel your API request through a proxy please provide your proxy URL.
    */
  var proxy: js.UndefOr[String] = js.undefined
  
  /**
    * Your Sauce Labs datacenter region. The following regions are available:
    *
    * - us-west-1 (short 'us')
    * - eu-central-1 (short 'eu')
    * - us-east-1 (headless)
    */
  var region: js.UndefOr[us | eu | `us-west-1` | `us-east-1` | `eu-central-1` | staging] = js.undefined
  
  /**
    * Your Sauce Labs username.
    */
  var user: String
}
object SauceLabsOptions {
  
  inline def apply(key: String, user: String): SauceLabsOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SauceLabsOptions]
  }
  
  extension [Self <: SauceLabsOptions](x: Self) {
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
    
    inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setRegion(value: us | eu | `us-west-1` | `us-east-1` | `eu-central-1` | staging): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
