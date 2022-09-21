package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserContextOptions extends StObject {
  
  /**
    * Bypass the proxy for the given list of hosts.
    */
  var proxyBypassList: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Proxy server with optional port to use for all requests.
    * Username and password can be set in `Page.authenticate`.
    */
  var proxyServer: js.UndefOr[String] = js.undefined
}
object BrowserContextOptions {
  
  inline def apply(): BrowserContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserContextOptions]
  }
  
  extension [Self <: BrowserContextOptions](x: Self) {
    
    inline def setProxyBypassList(value: js.Array[String]): Self = StObject.set(x, "proxyBypassList", value.asInstanceOf[js.Any])
    
    inline def setProxyBypassListUndefined: Self = StObject.set(x, "proxyBypassList", js.undefined)
    
    inline def setProxyBypassListVarargs(value: String*): Self = StObject.set(x, "proxyBypassList", js.Array(value*))
    
    inline def setProxyServer(value: String): Self = StObject.set(x, "proxyServer", value.asInstanceOf[js.Any])
    
    inline def setProxyServerUndefined: Self = StObject.set(x, "proxyServer", js.undefined)
  }
}
