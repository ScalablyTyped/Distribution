package typings.pulumiAws.inputMod.apigatewayv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StageRouteSetting extends js.Object {
  
  /**
    * Whether data trace logging is enabled for the route. Affects the log entries pushed to Amazon CloudWatch Logs.
    * Defaults to `false`. Supported only for WebSocket APIs.
    */
  var dataTraceEnabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Whether detailed metrics are enabled for the route. Defaults to `false`.
    */
  var detailedMetricsEnabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The logging level for the route. Affects the log entries pushed to Amazon CloudWatch Logs.
    * Valid values: `ERROR`, `INFO`, `OFF`. Defaults to `OFF`. Supported only for WebSocket APIs. This provider will only perform drift detection of its value when present in a configuration.
    */
  var loggingLevel: js.UndefOr[Input[String]] = js.native
  
  /**
    * Route key.
    */
  var routeKey: Input[String] = js.native
  
  /**
    * The throttling burst limit for the route.
    */
  var throttlingBurstLimit: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The throttling rate limit for the route.
    */
  var throttlingRateLimit: js.UndefOr[Input[Double]] = js.native
}
object StageRouteSetting {
  
  @scala.inline
  def apply(routeKey: Input[String]): StageRouteSetting = {
    val __obj = js.Dynamic.literal(routeKey = routeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageRouteSetting]
  }
  
  @scala.inline
  implicit class StageRouteSettingOps[Self <: StageRouteSetting] (val x: Self) extends AnyVal {
    
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
    def setRouteKey(value: Input[String]): Self = this.set("routeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTraceEnabled(value: Input[Boolean]): Self = this.set("dataTraceEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTraceEnabled: Self = this.set("dataTraceEnabled", js.undefined)
    
    @scala.inline
    def setDetailedMetricsEnabled(value: Input[Boolean]): Self = this.set("detailedMetricsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailedMetricsEnabled: Self = this.set("detailedMetricsEnabled", js.undefined)
    
    @scala.inline
    def setLoggingLevel(value: Input[String]): Self = this.set("loggingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingLevel: Self = this.set("loggingLevel", js.undefined)
    
    @scala.inline
    def setThrottlingBurstLimit(value: Input[Double]): Self = this.set("throttlingBurstLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottlingBurstLimit: Self = this.set("throttlingBurstLimit", js.undefined)
    
    @scala.inline
    def setThrottlingRateLimit(value: Input[Double]): Self = this.set("throttlingRateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottlingRateLimit: Self = this.set("throttlingRateLimit", js.undefined)
  }
}
