package typings.restify.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricsCallbackOptions extends StObject {
  
  /**
    * If this value is set, err will be a corresponding `RequestCloseError` or `RequestAbortedError`.
    *
    * If connectionState is either 'close' or 'aborted', then the statusCode is not applicable since the connection was severed before a response was written.
    */
  var connectionState: TMetricsCallback
  
  /**
    * Number of inflight requests pending in restify
    */
  var inflightRequests: Double
  
  /**
    * Request latency
    */
  var latency: Double
  
  /**
    * HTTP request verb
    */
  var method: String
  
  /**
    * req.path() value
    */
  var path: String
  
  /**
    * pre handlers latency
    */
  var preLatency: Double | Null
  
  /**
    * Status code of the response. Can be undefined in the case of an `uncaughtException`.
    * Otherwise, in most normal scenarios, even calling `res.send()` or `res.end()` should result in a 200 by default.
    */
  var statusCode: Double
  
  /**
    * latency includes both request is flushed and all handlers finished
    */
  var totalLatency: Double
  
  /**
    * Same as `inflightRequests`
    */
  var unfinishedRequests: Double
  
  /**
    * use handlers latency
    */
  var useLatency: Double | Null
}
object MetricsCallbackOptions {
  
  @scala.inline
  def apply(
    inflightRequests: Double,
    latency: Double,
    method: String,
    path: String,
    statusCode: Double,
    totalLatency: Double,
    unfinishedRequests: Double
  ): MetricsCallbackOptions = {
    val __obj = js.Dynamic.literal(inflightRequests = inflightRequests.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], totalLatency = totalLatency.asInstanceOf[js.Any], unfinishedRequests = unfinishedRequests.asInstanceOf[js.Any], preLatency = null, useLatency = null)
    __obj.asInstanceOf[MetricsCallbackOptions]
  }
  
  @scala.inline
  implicit class MetricsCallbackOptionsMutableBuilder[Self <: MetricsCallbackOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionState(value: TMetricsCallback): Self = StObject.set(x, "connectionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionStateUndefined: Self = StObject.set(x, "connectionState", js.undefined)
    
    @scala.inline
    def setInflightRequests(value: Double): Self = StObject.set(x, "inflightRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreLatency(value: Double): Self = StObject.set(x, "preLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreLatencyNull: Self = StObject.set(x, "preLatency", null)
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalLatency(value: Double): Self = StObject.set(x, "totalLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnfinishedRequests(value: Double): Self = StObject.set(x, "unfinishedRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLatency(value: Double): Self = StObject.set(x, "useLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLatencyNull: Self = StObject.set(x, "useLatency", null)
  }
}
