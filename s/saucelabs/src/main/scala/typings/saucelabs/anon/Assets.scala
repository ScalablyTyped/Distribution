package typings.saucelabs.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assets
  extends /* key */ StringDictionary[js.Any] {
  
  var assets: Boolean = js.native
  
  var browser: String = js.native
  
  var browserDisplay: String = js.native
  
  var browserVersionDisplay: String = js.native
  
  var device: js.UndefOr[String] = js.native
  
  var os: String = js.native
  
  var osDisplay: String = js.native
  
  var res: String = js.native
  
  var tunnel: js.UndefOr[String] = js.native
  
  var url: String = js.native
  
  var version: String = js.native
}
object Assets {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AssetsMutableBuilder[Self <: Assets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssets(value: Boolean): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserDisplay(value: String): Self = StObject.set(x, "browserDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserVersionDisplay(value: String): Self = StObject.set(x, "browserVersionDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsDisplay(value: String): Self = StObject.set(x, "osDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: String): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnel(value: String): Self = StObject.set(x, "tunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelUndefined: Self = StObject.set(x, "tunnel", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
