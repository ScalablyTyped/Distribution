package typings.seleniumWebdriver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyConfig extends StObject {
  
  var ftpProxy: js.UndefOr[String] = js.undefined
  
  var httpProxy: js.UndefOr[String] = js.undefined
  
  var noProxy: js.UndefOr[String] = js.undefined
  
  var proxyAutoconfigUrl: js.UndefOr[String] = js.undefined
  
  var proxyType: String
  
  var socksPassword: js.UndefOr[String] = js.undefined
  
  var socksProxy: js.UndefOr[String] = js.undefined
  
  var socksUsername: js.UndefOr[String] = js.undefined
  
  var sslProxy: js.UndefOr[String] = js.undefined
}
object ProxyConfig {
  
  inline def apply(proxyType: String): ProxyConfig = {
    val __obj = js.Dynamic.literal(proxyType = proxyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyConfig]
  }
  
  extension [Self <: ProxyConfig](x: Self) {
    
    inline def setFtpProxy(value: String): Self = StObject.set(x, "ftpProxy", value.asInstanceOf[js.Any])
    
    inline def setFtpProxyUndefined: Self = StObject.set(x, "ftpProxy", js.undefined)
    
    inline def setHttpProxy(value: String): Self = StObject.set(x, "httpProxy", value.asInstanceOf[js.Any])
    
    inline def setHttpProxyUndefined: Self = StObject.set(x, "httpProxy", js.undefined)
    
    inline def setNoProxy(value: String): Self = StObject.set(x, "noProxy", value.asInstanceOf[js.Any])
    
    inline def setNoProxyUndefined: Self = StObject.set(x, "noProxy", js.undefined)
    
    inline def setProxyAutoconfigUrl(value: String): Self = StObject.set(x, "proxyAutoconfigUrl", value.asInstanceOf[js.Any])
    
    inline def setProxyAutoconfigUrlUndefined: Self = StObject.set(x, "proxyAutoconfigUrl", js.undefined)
    
    inline def setProxyType(value: String): Self = StObject.set(x, "proxyType", value.asInstanceOf[js.Any])
    
    inline def setSocksPassword(value: String): Self = StObject.set(x, "socksPassword", value.asInstanceOf[js.Any])
    
    inline def setSocksPasswordUndefined: Self = StObject.set(x, "socksPassword", js.undefined)
    
    inline def setSocksProxy(value: String): Self = StObject.set(x, "socksProxy", value.asInstanceOf[js.Any])
    
    inline def setSocksProxyUndefined: Self = StObject.set(x, "socksProxy", js.undefined)
    
    inline def setSocksUsername(value: String): Self = StObject.set(x, "socksUsername", value.asInstanceOf[js.Any])
    
    inline def setSocksUsernameUndefined: Self = StObject.set(x, "socksUsername", js.undefined)
    
    inline def setSslProxy(value: String): Self = StObject.set(x, "sslProxy", value.asInstanceOf[js.Any])
    
    inline def setSslProxyUndefined: Self = StObject.set(x, "sslProxy", js.undefined)
  }
}
