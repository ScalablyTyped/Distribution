package typings.restify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectOptions extends StObject {
  
  /**
    * redirect location's hostname
    */
  var hostname: js.UndefOr[String] = js.undefined
  
  /**
    * if true, `options.query`
    * stomps over any existing query
    * parameters on current URL.
    * by default, will merge the two.
    */
  var overrideQuery: js.UndefOr[Boolean] = js.undefined
  
  /**
    * redirect location's pathname
    */
  var pathname: js.UndefOr[String] = js.undefined
  
  /**
    * if true, sets 301. defaults to 302.
    */
  var permanent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * redirect location's port number
    */
  var port: js.UndefOr[String] = js.undefined
  
  /**
    * redirect location's query string parameters
    */
  var query: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * whether to redirect to http or https
    */
  var secure: js.UndefOr[Boolean] = js.undefined
}
object RedirectOptions {
  
  @scala.inline
  def apply(): RedirectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedirectOptions]
  }
  
  @scala.inline
  implicit class RedirectOptionsMutableBuilder[Self <: RedirectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    @scala.inline
    def setOverrideQuery(value: Boolean): Self = StObject.set(x, "overrideQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideQueryUndefined: Self = StObject.set(x, "overrideQuery", js.undefined)
    
    @scala.inline
    def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
    
    @scala.inline
    def setPermanent(value: Boolean): Self = StObject.set(x, "permanent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermanentUndefined: Self = StObject.set(x, "permanent", js.undefined)
    
    @scala.inline
    def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setQuery(value: String | js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
  }
}
