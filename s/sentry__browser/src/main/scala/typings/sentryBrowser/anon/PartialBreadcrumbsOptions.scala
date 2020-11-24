package typings.sentryBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@sentry/browser.@sentry/browser/dist/integrations/breadcrumbs.BreadcrumbsOptions> */
@js.native
trait PartialBreadcrumbsOptions extends js.Object {
  
  var console: js.UndefOr[Boolean] = js.native
  
  var dom: js.UndefOr[Boolean] = js.native
  
  var fetch: js.UndefOr[Boolean] = js.native
  
  var history: js.UndefOr[Boolean] = js.native
  
  var sentry: js.UndefOr[Boolean] = js.native
  
  var xhr: js.UndefOr[Boolean] = js.native
}
object PartialBreadcrumbsOptions {
  
  @scala.inline
  def apply(): PartialBreadcrumbsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBreadcrumbsOptions]
  }
  
  @scala.inline
  implicit class PartialBreadcrumbsOptionsOps[Self <: PartialBreadcrumbsOptions] (val x: Self) extends AnyVal {
    
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
    def setConsole(value: Boolean): Self = this.set("console", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsole: Self = this.set("console", js.undefined)
    
    @scala.inline
    def setDom(value: Boolean): Self = this.set("dom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDom: Self = this.set("dom", js.undefined)
    
    @scala.inline
    def setFetch(value: Boolean): Self = this.set("fetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetch: Self = this.set("fetch", js.undefined)
    
    @scala.inline
    def setHistory(value: Boolean): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    
    @scala.inline
    def setSentry(value: Boolean): Self = this.set("sentry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentry: Self = this.set("sentry", js.undefined)
    
    @scala.inline
    def setXhr(value: Boolean): Self = this.set("xhr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
  }
}
