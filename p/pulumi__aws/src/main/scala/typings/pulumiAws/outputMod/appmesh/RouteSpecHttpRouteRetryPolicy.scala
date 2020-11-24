package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecHttpRouteRetryPolicy extends js.Object {
  
  /**
    * List of HTTP retry events.
    * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
    * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
    */
  var httpRetryEvents: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The maximum number of retries.
    */
  var maxRetries: Double = js.native
  
  /**
    * The per-retry timeout.
    */
  var perRetryTimeout: RouteSpecHttpRouteRetryPolicyPerRetryTimeout = js.native
  
  /**
    * List of TCP retry events. The only valid value is `connection-error`.
    */
  var tcpRetryEvents: js.UndefOr[js.Array[String]] = js.native
}
object RouteSpecHttpRouteRetryPolicy {
  
  @scala.inline
  def apply(maxRetries: Double, perRetryTimeout: RouteSpecHttpRouteRetryPolicyPerRetryTimeout): RouteSpecHttpRouteRetryPolicy = {
    val __obj = js.Dynamic.literal(maxRetries = maxRetries.asInstanceOf[js.Any], perRetryTimeout = perRetryTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRouteRetryPolicy]
  }
  
  @scala.inline
  implicit class RouteSpecHttpRouteRetryPolicyOps[Self <: RouteSpecHttpRouteRetryPolicy] (val x: Self) extends AnyVal {
    
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
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerRetryTimeout(value: RouteSpecHttpRouteRetryPolicyPerRetryTimeout): Self = this.set("perRetryTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpRetryEventsVarargs(value: String*): Self = this.set("httpRetryEvents", js.Array(value :_*))
    
    @scala.inline
    def setHttpRetryEvents(value: js.Array[String]): Self = this.set("httpRetryEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpRetryEvents: Self = this.set("httpRetryEvents", js.undefined)
    
    @scala.inline
    def setTcpRetryEventsVarargs(value: String*): Self = this.set("tcpRetryEvents", js.Array(value :_*))
    
    @scala.inline
    def setTcpRetryEvents(value: js.Array[String]): Self = this.set("tcpRetryEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTcpRetryEvents: Self = this.set("tcpRetryEvents", js.undefined)
  }
}
