package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecHttpRouteMatch extends StObject {
  
  /**
    * The client request headers to match on.
    */
  var headers: js.UndefOr[js.Array[RouteSpecHttpRouteMatchHeader]] = js.undefined
  
  /**
    * The client request header method to match on. Valid values: `GET`, `HEAD`, `POST`, `PUT`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`, `PATCH`.
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
    * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
    */
  var prefix: String
  
  /**
    * The client request header scheme to match on. Valid values: `http`, `https`.
    */
  var scheme: js.UndefOr[String] = js.undefined
}
object RouteSpecHttpRouteMatch {
  
  @scala.inline
  def apply(prefix: String): RouteSpecHttpRouteMatch = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRouteMatch]
  }
  
  @scala.inline
  implicit class RouteSpecHttpRouteMatchMutableBuilder[Self <: RouteSpecHttpRouteMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Array[RouteSpecHttpRouteMatchHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: RouteSpecHttpRouteMatchHeader*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
