package typings.sentryBrowser.backendMod

import typings.sentryTypes.optionsMod.Options
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserOptions extends Options {
  
  /**
    * A pattern for error URLs which should exclusively be sent to Sentry.
    * This is the opposite of {@link Options.denyUrls}.
    * By default, all errors will be sent.
    */
  var allowUrls: js.UndefOr[js.Array[String | RegExp]] = js.native
  
  /**
    * A flag enabling Sessions Tracking feature.
    * By default Sessions Tracking is disabled.
    */
  var autoSessionTracking: js.UndefOr[Boolean] = js.native
  
  /** @deprecated use {@link Options.denyUrls} instead. */
  var blacklistUrls: js.UndefOr[js.Array[String | RegExp]] = js.native
  
  /**
    * A pattern for error URLs which should not be sent to Sentry.
    * To allow certain errors instead, use {@link Options.allowUrls}.
    * By default, all errors will be sent.
    */
  var denyUrls: js.UndefOr[js.Array[String | RegExp]] = js.native
  
  /** @deprecated use {@link Options.allowUrls} instead. */
  var whitelistUrls: js.UndefOr[js.Array[String | RegExp]] = js.native
}
object BrowserOptions {
  
  @scala.inline
  def apply(): BrowserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserOptions]
  }
  
  @scala.inline
  implicit class BrowserOptionsOps[Self <: BrowserOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowUrlsVarargs(value: (String | RegExp)*): Self = this.set("allowUrls", js.Array(value :_*))
    
    @scala.inline
    def setAllowUrls(value: js.Array[String | RegExp]): Self = this.set("allowUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUrls: Self = this.set("allowUrls", js.undefined)
    
    @scala.inline
    def setAutoSessionTracking(value: Boolean): Self = this.set("autoSessionTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSessionTracking: Self = this.set("autoSessionTracking", js.undefined)
    
    @scala.inline
    def setBlacklistUrlsVarargs(value: (String | RegExp)*): Self = this.set("blacklistUrls", js.Array(value :_*))
    
    @scala.inline
    def setBlacklistUrls(value: js.Array[String | RegExp]): Self = this.set("blacklistUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlacklistUrls: Self = this.set("blacklistUrls", js.undefined)
    
    @scala.inline
    def setDenyUrlsVarargs(value: (String | RegExp)*): Self = this.set("denyUrls", js.Array(value :_*))
    
    @scala.inline
    def setDenyUrls(value: js.Array[String | RegExp]): Self = this.set("denyUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDenyUrls: Self = this.set("denyUrls", js.undefined)
    
    @scala.inline
    def setWhitelistUrlsVarargs(value: (String | RegExp)*): Self = this.set("whitelistUrls", js.Array(value :_*))
    
    @scala.inline
    def setWhitelistUrls(value: js.Array[String | RegExp]): Self = this.set("whitelistUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelistUrls: Self = this.set("whitelistUrls", js.undefined)
  }
}
