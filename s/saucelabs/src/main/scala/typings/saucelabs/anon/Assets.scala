package typings.saucelabs.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assets
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var assets: Boolean
  
  var browser: String
  
  var browserDisplay: String
  
  var browserVersionDisplay: String
  
  var device: js.UndefOr[String] = js.undefined
  
  var os: String
  
  var osDisplay: String
  
  var res: String
  
  var tunnel: js.UndefOr[String] = js.undefined
  
  var url: String
  
  var version: String
}
object Assets {
  
  inline def apply(
    assets: Boolean,
    browser: String,
    browserDisplay: String,
    browserVersionDisplay: String,
    os: String,
    osDisplay: String,
    res: String,
    url: String,
    version: String
  ): Assets = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], browserDisplay = browserDisplay.asInstanceOf[js.Any], browserVersionDisplay = browserVersionDisplay.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], osDisplay = osDisplay.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assets]
  }
  
  extension [Self <: Assets](x: Self) {
    
    inline def setAssets(value: Boolean): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserDisplay(value: String): Self = StObject.set(x, "browserDisplay", value.asInstanceOf[js.Any])
    
    inline def setBrowserVersionDisplay(value: String): Self = StObject.set(x, "browserVersionDisplay", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsDisplay(value: String): Self = StObject.set(x, "osDisplay", value.asInstanceOf[js.Any])
    
    inline def setRes(value: String): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setTunnel(value: String): Self = StObject.set(x, "tunnel", value.asInstanceOf[js.Any])
    
    inline def setTunnelUndefined: Self = StObject.set(x, "tunnel", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
