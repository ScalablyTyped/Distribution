package typings.pulumiAws.outputMod.apigatewayv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StageDefaultRouteSettings extends js.Object {
  /**
    * Whether data trace logging is enabled for the default route. Affects the log entries pushed to Amazon CloudWatch Logs.
    * Defaults to `false`. Supported only for WebSocket APIs.
    */
  var dataTraceEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether detailed metrics are enabled for the default route. Defaults to `false`.
    */
  var detailedMetricsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The logging level for the default route. Affects the log entries pushed to Amazon CloudWatch Logs.
    * Valid values: `ERROR`, `INFO`, `OFF`. Defaults to `OFF`. Supported only for WebSocket APIs.
    */
  var loggingLevel: js.UndefOr[String] = js.native
  /**
    * The throttling burst limit for the default route.
    */
  var throttlingBurstLimit: js.UndefOr[Double] = js.native
  /**
    * The throttling rate limit for the default route.
    */
  var throttlingRateLimit: js.UndefOr[Double] = js.native
}

object StageDefaultRouteSettings {
  @scala.inline
  def apply(): StageDefaultRouteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StageDefaultRouteSettings]
  }
  @scala.inline
  implicit class StageDefaultRouteSettingsOps[Self <: StageDefaultRouteSettings] (val x: Self) extends AnyVal {
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
    def setDataTraceEnabled(value: Boolean): Self = this.set("dataTraceEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTraceEnabled: Self = this.set("dataTraceEnabled", js.undefined)
    @scala.inline
    def setDetailedMetricsEnabled(value: Boolean): Self = this.set("detailedMetricsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailedMetricsEnabled: Self = this.set("detailedMetricsEnabled", js.undefined)
    @scala.inline
    def setLoggingLevel(value: String): Self = this.set("loggingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingLevel: Self = this.set("loggingLevel", js.undefined)
    @scala.inline
    def setThrottlingBurstLimit(value: Double): Self = this.set("throttlingBurstLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottlingBurstLimit: Self = this.set("throttlingBurstLimit", js.undefined)
    @scala.inline
    def setThrottlingRateLimit(value: Double): Self = this.set("throttlingRateLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottlingRateLimit: Self = this.set("throttlingRateLimit", js.undefined)
  }
  
}

