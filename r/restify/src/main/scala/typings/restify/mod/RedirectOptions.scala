package typings.restify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedirectOptions extends js.Object {
  
  /**
    * redirect location's hostname
    */
  var hostname: js.UndefOr[String] = js.native
  
  /**
    * if true, `options.query`
    * stomps over any existing query
    * parameters on current URL.
    * by default, will merge the two.
    */
  var overrideQuery: js.UndefOr[Boolean] = js.native
  
  /**
    * redirect location's pathname
    */
  var pathname: js.UndefOr[String] = js.native
  
  /**
    * if true, sets 301. defaults to 302.
    */
  var permanent: js.UndefOr[Boolean] = js.native
  
  /**
    * redirect location's port number
    */
  var port: js.UndefOr[String] = js.native
  
  /**
    * redirect location's query string parameters
    */
  var query: js.UndefOr[String | js.Object] = js.native
  
  /**
    * whether to redirect to http or https
    */
  var secure: js.UndefOr[Boolean] = js.native
}
object RedirectOptions {
  
  @scala.inline
  def apply(): RedirectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedirectOptions]
  }
  
  @scala.inline
  implicit class RedirectOptionsOps[Self <: RedirectOptions] (val x: Self) extends AnyVal {
    
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
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setOverrideQuery(value: Boolean): Self = this.set("overrideQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideQuery: Self = this.set("overrideQuery", js.undefined)
    
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathname: Self = this.set("pathname", js.undefined)
    
    @scala.inline
    def setPermanent(value: Boolean): Self = this.set("permanent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermanent: Self = this.set("permanent", js.undefined)
    
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setQuery(value: String | js.Object): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
  }
}
