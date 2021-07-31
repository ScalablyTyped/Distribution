package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecGrpcRouteRetryPolicy extends StObject {
  
  /**
    * List of gRPC retry events.
    * Valid values: `cancelled`, `deadline-exceeded`, `internal`, `resource-exhausted`, `unavailable`.
    */
  var grpcRetryEvents: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * List of HTTP retry events.
    * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
    * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
    */
  var httpRetryEvents: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * The maximum number of retries.
    */
  var maxRetries: Input[Double]
  
  /**
    * The per-retry timeout.
    */
  var perRetryTimeout: Input[RouteSpecGrpcRouteRetryPolicyPerRetryTimeout]
  
  /**
    * List of TCP retry events. The only valid value is `connection-error`.
    */
  var tcpRetryEvents: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object RouteSpecGrpcRouteRetryPolicy {
  
  @scala.inline
  def apply(maxRetries: Input[Double], perRetryTimeout: Input[RouteSpecGrpcRouteRetryPolicyPerRetryTimeout]): RouteSpecGrpcRouteRetryPolicy = {
    val __obj = js.Dynamic.literal(maxRetries = maxRetries.asInstanceOf[js.Any], perRetryTimeout = perRetryTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecGrpcRouteRetryPolicy]
  }
  
  @scala.inline
  implicit class RouteSpecGrpcRouteRetryPolicyMutableBuilder[Self <: RouteSpecGrpcRouteRetryPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrpcRetryEvents(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "grpcRetryEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrpcRetryEventsUndefined: Self = StObject.set(x, "grpcRetryEvents", js.undefined)
    
    @scala.inline
    def setGrpcRetryEventsVarargs(value: Input[String]*): Self = StObject.set(x, "grpcRetryEvents", js.Array(value :_*))
    
    @scala.inline
    def setHttpRetryEvents(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "httpRetryEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpRetryEventsUndefined: Self = StObject.set(x, "httpRetryEvents", js.undefined)
    
    @scala.inline
    def setHttpRetryEventsVarargs(value: Input[String]*): Self = StObject.set(x, "httpRetryEvents", js.Array(value :_*))
    
    @scala.inline
    def setMaxRetries(value: Input[Double]): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerRetryTimeout(value: Input[RouteSpecGrpcRouteRetryPolicyPerRetryTimeout]): Self = StObject.set(x, "perRetryTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpRetryEvents(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "tcpRetryEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpRetryEventsUndefined: Self = StObject.set(x, "tcpRetryEvents", js.undefined)
    
    @scala.inline
    def setTcpRetryEventsVarargs(value: Input[String]*): Self = StObject.set(x, "tcpRetryEvents", js.Array(value :_*))
  }
}
