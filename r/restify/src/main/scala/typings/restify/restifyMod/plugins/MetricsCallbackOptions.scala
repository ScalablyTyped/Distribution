package typings.restify.restifyMod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsCallbackOptions extends js.Object {
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
    unfinishedRequests: Double,
    connectionState: TMetricsCallback = null,
    preLatency: Int | Double = null,
    useLatency: Int | Double = null
  ): MetricsCallbackOptions = {
    val __obj = js.Dynamic.literal(inflightRequests = inflightRequests, latency = latency, method = method, path = path, statusCode = statusCode, totalLatency = totalLatency, unfinishedRequests = unfinishedRequests)
    if (connectionState != null) __obj.updateDynamic("connectionState")(connectionState.asInstanceOf[js.Any])
    if (preLatency != null) __obj.updateDynamic("preLatency")(preLatency.asInstanceOf[js.Any])
    if (useLatency != null) __obj.updateDynamic("useLatency")(useLatency.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsCallbackOptions]
  }
}

