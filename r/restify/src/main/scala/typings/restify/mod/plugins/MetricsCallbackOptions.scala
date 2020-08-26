package typings.restify.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsCallbackOptions extends js.Object {
  /**
    * If this value is set, err will be a corresponding `RequestCloseError` or `RequestAbortedError`.
    *
    * If connectionState is either 'close' or 'aborted', then the statusCode is not applicable since the connection was severed before a response was written.
    */
  var connectionState: TMetricsCallback = js.native
  /**
    * Number of inflight requests pending in restify
    */
  var inflightRequests: Double = js.native
  /**
    * Request latency
    */
  var latency: Double = js.native
  /**
    * HTTP request verb
    */
  var method: String = js.native
  /**
    * req.path() value
    */
  var path: String = js.native
  /**
    * pre handlers latency
    */
  var preLatency: Double | Null = js.native
  /**
    * Status code of the response. Can be undefined in the case of an `uncaughtException`.
    * Otherwise, in most normal scenarios, even calling `res.send()` or `res.end()` should result in a 200 by default.
    */
  var statusCode: Double = js.native
  /**
    * latency includes both request is flushed and all handlers finished
    */
  var totalLatency: Double = js.native
  /**
    * Same as `inflightRequests`
    */
  var unfinishedRequests: Double = js.native
  /**
    * use handlers latency
    */
  var useLatency: Double | Null = js.native
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
    val __obj = js.Dynamic.literal(inflightRequests = inflightRequests.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], totalLatency = totalLatency.asInstanceOf[js.Any], unfinishedRequests = unfinishedRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsCallbackOptions]
  }
  @scala.inline
  implicit class MetricsCallbackOptionsOps[Self <: MetricsCallbackOptions] (val x: Self) extends AnyVal {
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
    def setInflightRequests(value: Double): Self = this.set("inflightRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatency(value: Double): Self = this.set("latency", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalLatency(value: Double): Self = this.set("totalLatency", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnfinishedRequests(value: Double): Self = this.set("unfinishedRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionState(value: TMetricsCallback): Self = this.set("connectionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionState: Self = this.set("connectionState", js.undefined)
    @scala.inline
    def setPreLatency(value: Double): Self = this.set("preLatency", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreLatencyNull: Self = this.set("preLatency", null)
    @scala.inline
    def setUseLatency(value: Double): Self = this.set("useLatency", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseLatencyNull: Self = this.set("useLatency", null)
  }
  
}

