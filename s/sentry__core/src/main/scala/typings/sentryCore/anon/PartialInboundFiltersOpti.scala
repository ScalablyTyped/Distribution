package typings.sentryCore.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@sentry/core.@sentry/core/dist/integrations/inboundfilters.InboundFiltersOptions> */
@js.native
trait PartialInboundFiltersOpti extends js.Object {
  
  var allowUrls: js.UndefOr[js.Array[String | RegExp]] = js.native
  
  var blacklistUrls: js.UndefOr[js.Array[String | RegExp]] = js.native
  
  var denyUrls: js.UndefOr[js.Array[String | RegExp]] = js.native
  
  var ignoreErrors: js.UndefOr[js.Array[String | RegExp]] = js.native
  
  var ignoreInternal: js.UndefOr[Boolean] = js.native
  
  var whitelistUrls: js.UndefOr[js.Array[String | RegExp]] = js.native
}
object PartialInboundFiltersOpti {
  
  @scala.inline
  def apply(): PartialInboundFiltersOpti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInboundFiltersOpti]
  }
  
  @scala.inline
  implicit class PartialInboundFiltersOptiOps[Self <: PartialInboundFiltersOpti] (val x: Self) extends AnyVal {
    
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
    def setIgnoreErrorsVarargs(value: (String | RegExp)*): Self = this.set("ignoreErrors", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreErrors(value: js.Array[String | RegExp]): Self = this.set("ignoreErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreErrors: Self = this.set("ignoreErrors", js.undefined)
    
    @scala.inline
    def setIgnoreInternal(value: Boolean): Self = this.set("ignoreInternal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreInternal: Self = this.set("ignoreInternal", js.undefined)
    
    @scala.inline
    def setWhitelistUrlsVarargs(value: (String | RegExp)*): Self = this.set("whitelistUrls", js.Array(value :_*))
    
    @scala.inline
    def setWhitelistUrls(value: js.Array[String | RegExp]): Self = this.set("whitelistUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelistUrls: Self = this.set("whitelistUrls", js.undefined)
  }
}
