package typings.restifyDashPlugins.restifyDashPluginsMod

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
    * Status code of the response. Can be undefined in the case of an `uncaughtException`.
    * Otherwise, in most normal scenarios, even calling `res.send()` or `res.end()` should result in a 200 by default.
    */
  var statusCode: Double
}

object MetricsCallbackOptions {
  @scala.inline
  def apply(
    latency: Double,
    method: String,
    path: String,
    statusCode: Double,
    connectionState: TMetricsCallback = null
  ): MetricsCallbackOptions = {
    val __obj = js.Dynamic.literal(latency = latency, method = method, path = path, statusCode = statusCode)
    if (connectionState != null) __obj.updateDynamic("connectionState")(connectionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsCallbackOptions]
  }
}

