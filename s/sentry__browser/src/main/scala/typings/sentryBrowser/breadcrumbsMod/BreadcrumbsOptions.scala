package typings.sentryBrowser.breadcrumbsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** JSDoc */
@js.native
trait BreadcrumbsOptions extends js.Object {
  
  var console: Boolean = js.native
  
  var dom: Boolean = js.native
  
  var fetch: Boolean = js.native
  
  var history: Boolean = js.native
  
  var sentry: Boolean = js.native
  
  var xhr: Boolean = js.native
}
object BreadcrumbsOptions {
  
  @scala.inline
  def apply(console: Boolean, dom: Boolean, fetch: Boolean, history: Boolean, sentry: Boolean, xhr: Boolean): BreadcrumbsOptions = {
    val __obj = js.Dynamic.literal(console = console.asInstanceOf[js.Any], dom = dom.asInstanceOf[js.Any], fetch = fetch.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], sentry = sentry.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbsOptions]
  }
  
  @scala.inline
  implicit class BreadcrumbsOptionsOps[Self <: BreadcrumbsOptions] (val x: Self) extends AnyVal {
    
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
    def setDom(value: Boolean): Self = this.set("dom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetch(value: Boolean): Self = this.set("fetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistory(value: Boolean): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentry(value: Boolean): Self = this.set("sentry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhr(value: Boolean): Self = this.set("xhr", value.asInstanceOf[js.Any])
  }
}
