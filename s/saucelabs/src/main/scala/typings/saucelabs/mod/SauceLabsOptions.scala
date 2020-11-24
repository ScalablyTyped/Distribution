package typings.saucelabs.mod

import typings.saucelabs.saucelabsStrings.`eu-central-1`
import typings.saucelabs.saucelabsStrings.`us-east-1`
import typings.saucelabs.saucelabsStrings.`us-west-1`
import typings.saucelabs.saucelabsStrings.eu
import typings.saucelabs.saucelabsStrings.staging
import typings.saucelabs.saucelabsStrings.us
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SauceLabsOptions extends js.Object {
  
  /**
    * If you want to set request headers, as example {'User-Agent': 'node-saucelabs'}
    */
  var headers: js.UndefOr[js.Object] = js.native
  
  /**
    * If set to true you are accessing the headless Sauce instances (this discards the region option).
    */
  var headless: js.UndefOr[Boolean] = js.native
  
  /**
    * Your Sauce Labs access key.
    */
  var key: String = js.native
  
  /**
    * If you want to tunnel your API request through a proxy please provide your proxy URL.
    */
  var proxy: js.UndefOr[String] = js.native
  
  /**
    * Your Sauce Labs datacenter region. The following regions are available:
    *
    * - us-west-1 (short 'us')
    * - eu-central-1 (short 'eu')
    * - us-east-1 (headless)
    */
  var region: js.UndefOr[us | eu | `us-west-1` | `us-east-1` | `eu-central-1` | staging] = js.native
  
  /**
    * Your Sauce Labs username.
    */
  var user: String = js.native
}
object SauceLabsOptions {
  
  @scala.inline
  def apply(key: String, user: String): SauceLabsOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SauceLabsOptions]
  }
  
  @scala.inline
  implicit class SauceLabsOptionsOps[Self <: SauceLabsOptions] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHeadless(value: Boolean): Self = this.set("headless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadless: Self = this.set("headless", js.undefined)
    
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setRegion(value: us | eu | `us-west-1` | `us-east-1` | `eu-central-1` | staging): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
}
