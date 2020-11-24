package typings.saucelabs.anon

import org.scalablytyped.runtime.StringDictionary
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
  implicit class AssetsOps[Self <: Assets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssets(value: Boolean): Self = this.set("assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser(value: String): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserDisplay(value: String): Self = this.set("browserDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserVersionDisplay(value: String): Self = this.set("browserVersionDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsDisplay(value: String): Self = this.set("osDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: String): Self = this.set("res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: String): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    
    @scala.inline
    def setTunnel(value: String): Self = this.set("tunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnel: Self = this.set("tunnel", js.undefined)
  }
}
