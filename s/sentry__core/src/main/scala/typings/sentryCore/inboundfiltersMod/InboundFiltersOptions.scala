package typings.sentryCore.inboundfiltersMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** JSDoc */
@js.native
trait InboundFiltersOptions extends js.Object {
  
  var allowUrls: js.Array[String | RegExp] = js.native
  
  /** @deprecated use {@link InboundFiltersOptions.denyUrls} instead. */
  var blacklistUrls: js.Array[String | RegExp] = js.native
  
  var denyUrls: js.Array[String | RegExp] = js.native
  
  var ignoreErrors: js.Array[String | RegExp] = js.native
  
  var ignoreInternal: Boolean = js.native
  
  /** @deprecated use {@link InboundFiltersOptions.allowUrls} instead. */
  var whitelistUrls: js.Array[String | RegExp] = js.native
}
object InboundFiltersOptions {
  
  @scala.inline
  def apply(
    allowUrls: js.Array[String | RegExp],
    blacklistUrls: js.Array[String | RegExp],
    denyUrls: js.Array[String | RegExp],
    ignoreErrors: js.Array[String | RegExp],
    ignoreInternal: Boolean,
    whitelistUrls: js.Array[String | RegExp]
  ): InboundFiltersOptions = {
    val __obj = js.Dynamic.literal(allowUrls = allowUrls.asInstanceOf[js.Any], blacklistUrls = blacklistUrls.asInstanceOf[js.Any], denyUrls = denyUrls.asInstanceOf[js.Any], ignoreErrors = ignoreErrors.asInstanceOf[js.Any], ignoreInternal = ignoreInternal.asInstanceOf[js.Any], whitelistUrls = whitelistUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundFiltersOptions]
  }
  
  @scala.inline
  implicit class InboundFiltersOptionsOps[Self <: InboundFiltersOptions] (val x: Self) extends AnyVal {
    
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
    def setBlacklistUrlsVarargs(value: (String | RegExp)*): Self = this.set("blacklistUrls", js.Array(value :_*))
    
    @scala.inline
    def setBlacklistUrls(value: js.Array[String | RegExp]): Self = this.set("blacklistUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDenyUrlsVarargs(value: (String | RegExp)*): Self = this.set("denyUrls", js.Array(value :_*))
    
    @scala.inline
    def setDenyUrls(value: js.Array[String | RegExp]): Self = this.set("denyUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreErrorsVarargs(value: (String | RegExp)*): Self = this.set("ignoreErrors", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreErrors(value: js.Array[String | RegExp]): Self = this.set("ignoreErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreInternal(value: Boolean): Self = this.set("ignoreInternal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelistUrlsVarargs(value: (String | RegExp)*): Self = this.set("whitelistUrls", js.Array(value :_*))
    
    @scala.inline
    def setWhitelistUrls(value: js.Array[String | RegExp]): Self = this.set("whitelistUrls", value.asInstanceOf[js.Any])
  }
}
