package typings.seleniumWebdriver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyConfig extends StObject {
  
  var ftpProxy: js.UndefOr[String] = js.native
  
  var httpProxy: js.UndefOr[String] = js.native
  
  var noProxy: js.UndefOr[String] = js.native
  
  var proxyAutoconfigUrl: js.UndefOr[String] = js.native
  
  var proxyType: String = js.native
  
  var socksPassword: js.UndefOr[String] = js.native
  
  var socksProxy: js.UndefOr[String] = js.native
  
  var socksUsername: js.UndefOr[String] = js.native
  
  var sslProxy: js.UndefOr[String] = js.native
}
object ProxyConfig {
  
  @scala.inline
  def apply(proxyType: String): ProxyConfig = {
    val __obj = js.Dynamic.literal(proxyType = proxyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyConfig]
  }
  
  @scala.inline
  implicit class ProxyConfigMutableBuilder[Self <: ProxyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFtpProxy(value: String): Self = StObject.set(x, "ftpProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFtpProxyUndefined: Self = StObject.set(x, "ftpProxy", js.undefined)
    
    @scala.inline
    def setHttpProxy(value: String): Self = StObject.set(x, "httpProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpProxyUndefined: Self = StObject.set(x, "httpProxy", js.undefined)
    
    @scala.inline
    def setNoProxy(value: String): Self = StObject.set(x, "noProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoProxyUndefined: Self = StObject.set(x, "noProxy", js.undefined)
    
    @scala.inline
    def setProxyAutoconfigUrl(value: String): Self = StObject.set(x, "proxyAutoconfigUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyAutoconfigUrlUndefined: Self = StObject.set(x, "proxyAutoconfigUrl", js.undefined)
    
    @scala.inline
    def setProxyType(value: String): Self = StObject.set(x, "proxyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocksPassword(value: String): Self = StObject.set(x, "socksPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocksPasswordUndefined: Self = StObject.set(x, "socksPassword", js.undefined)
    
    @scala.inline
    def setSocksProxy(value: String): Self = StObject.set(x, "socksProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocksProxyUndefined: Self = StObject.set(x, "socksProxy", js.undefined)
    
    @scala.inline
    def setSocksUsername(value: String): Self = StObject.set(x, "socksUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocksUsernameUndefined: Self = StObject.set(x, "socksUsername", js.undefined)
    
    @scala.inline
    def setSslProxy(value: String): Self = StObject.set(x, "sslProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslProxyUndefined: Self = StObject.set(x, "sslProxy", js.undefined)
  }
}
