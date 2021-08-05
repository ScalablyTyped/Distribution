package typings.saucelabs.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Browser
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var browser: String
  
  var os: String
  
  var resolution: String
  
  var tunnel: js.UndefOr[Unit] = js.undefined
  
  var url: String
  
  var version: String
}
object Browser {
  
  inline def apply(browser: String, os: String, resolution: String, url: String, version: String): Browser = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
  
  extension [Self <: Browser](x: Self) {
    
    inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setTunnel(value: Unit): Self = StObject.set(x, "tunnel", value.asInstanceOf[js.Any])
    
    inline def setTunnelUndefined: Self = StObject.set(x, "tunnel", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
