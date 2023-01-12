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
  
  inline def apply(): RedirectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedirectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RedirectOptions] (val x: Self) extends AnyVal {
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setOverrideQuery(value: Boolean): Self = StObject.set(x, "overrideQuery", value.asInstanceOf[js.Any])
    
    inline def setOverrideQueryUndefined: Self = StObject.set(x, "overrideQuery", js.undefined)
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
    
    inline def setPermanent(value: Boolean): Self = StObject.set(x, "permanent", value.asInstanceOf[js.Any])
    
    inline def setPermanentUndefined: Self = StObject.set(x, "permanent", js.undefined)
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setQuery(value: String | js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
  }
}
