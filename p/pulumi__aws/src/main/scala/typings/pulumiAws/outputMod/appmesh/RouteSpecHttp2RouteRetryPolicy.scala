package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecHttp2RouteRetryPolicy extends StObject {
  
  /**
    * List of HTTP retry events.
    * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
    * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
    */
  var httpRetryEvents: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The maximum number of retries.
    */
  var maxRetries: Double
  
  /**
    * The per-retry timeout.
    */
  var perRetryTimeout: RouteSpecHttp2RouteRetryPolicyPerRetryTimeout
  
  /**
    * List of TCP retry events. The only valid value is `connection-error`.
    */
  var tcpRetryEvents: js.UndefOr[js.Array[String]] = js.undefined
}
object RouteSpecHttp2RouteRetryPolicy {
  
  inline def apply(maxRetries: Double, perRetryTimeout: RouteSpecHttp2RouteRetryPolicyPerRetryTimeout): RouteSpecHttp2RouteRetryPolicy = {
    val __obj = js.Dynamic.literal(maxRetries = maxRetries.asInstanceOf[js.Any], perRetryTimeout = perRetryTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttp2RouteRetryPolicy]
  }
  
  extension [Self <: RouteSpecHttp2RouteRetryPolicy](x: Self) {
    
    inline def setHttpRetryEvents(value: js.Array[String]): Self = StObject.set(x, "httpRetryEvents", value.asInstanceOf[js.Any])
    
    inline def setHttpRetryEventsUndefined: Self = StObject.set(x, "httpRetryEvents", js.undefined)
    
    inline def setHttpRetryEventsVarargs(value: String*): Self = StObject.set(x, "httpRetryEvents", js.Array(value :_*))
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setPerRetryTimeout(value: RouteSpecHttp2RouteRetryPolicyPerRetryTimeout): Self = StObject.set(x, "perRetryTimeout", value.asInstanceOf[js.Any])
    
    inline def setTcpRetryEvents(value: js.Array[String]): Self = StObject.set(x, "tcpRetryEvents", value.asInstanceOf[js.Any])
    
    inline def setTcpRetryEventsUndefined: Self = StObject.set(x, "tcpRetryEvents", js.undefined)
    
    inline def setTcpRetryEventsVarargs(value: String*): Self = StObject.set(x, "tcpRetryEvents", js.Array(value :_*))
  }
}
