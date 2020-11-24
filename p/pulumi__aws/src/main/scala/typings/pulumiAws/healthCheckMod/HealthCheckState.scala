package typings.pulumiAws.healthCheckMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealthCheckState extends js.Object {
  
  /**
    * The minimum number of child health checks that must be healthy for Route 53 to consider the parent health check to be healthy. Valid values are integers between 0 and 256, inclusive
    */
  val childHealthThreshold: js.UndefOr[Input[Double]] = js.native
  
  /**
    * For a specified parent health check, a list of HealthCheckId values for the associated child health checks.
    */
  val childHealthchecks: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The name of the CloudWatch alarm.
    */
  val cloudwatchAlarmName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The CloudWatchRegion that the CloudWatch alarm was created in.
    */
  val cloudwatchAlarmRegion: js.UndefOr[Input[String]] = js.native
  
  /**
    * A boolean value that stops Route 53 from performing health checks. When set to true, Route 53 will do the following depending on the type of health check:
    * * For health checks that check the health of endpoints, Route5 53 stops submitting requests to your application, server, or other resource.
    * * For calculated health checks, Route 53 stops aggregating the status of the referenced health checks.
    * * For health checks that monitor CloudWatch alarms, Route 53 stops monitoring the corresponding CloudWatch metrics.
    */
  val disabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A boolean value that indicates whether Route53 should send the `fqdn` to the endpoint when performing the health check. This defaults to AWS' defaults: when the `type` is "HTTPS" `enableSni` defaults to `true`, when `type` is anything else `enableSni` defaults to `false`.
    */
  val enableSni: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The number of consecutive health checks that an endpoint must pass or fail.
    */
  val failureThreshold: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The fully qualified domain name of the endpoint to be checked.
    */
  val fqdn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The status of the health check when CloudWatch has insufficient data about the state of associated alarm. Valid values are `Healthy` , `Unhealthy` and `LastKnownStatus`.
    */
  val insufficientDataHealthStatus: js.UndefOr[Input[String]] = js.native
  
  /**
    * A boolean value that indicates whether the status of health check should be inverted. For example, if a health check is healthy but Inverted is True , then Route 53 considers the health check to be unhealthy.
    */
  val invertHealthcheck: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The IP address of the endpoint to be checked.
    */
  val ipAddress: js.UndefOr[Input[String]] = js.native
  
  /**
    * A Boolean value that indicates whether you want Route 53 to measure the latency between health checkers in multiple AWS regions and your endpoint and to display CloudWatch latency graphs in the Route 53 console.
    */
  val measureLatency: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The port of the endpoint to be checked.
    */
  val port: js.UndefOr[Input[Double]] = js.native
  
  /**
    * This is a reference name used in Caller Reference
    * (helpful for identifying single healthCheck set amongst others)
    */
  val referenceName: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of AWS regions that you want Amazon Route 53 health checkers to check the specified endpoint from.
    */
  val regions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the time that it sends the next health-check request.
    */
  val requestInterval: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The path that you want Amazon Route 53 to request when performing health checks.
    */
  val resourcePath: js.UndefOr[Input[String]] = js.native
  
  /**
    * String searched in the first 5120 bytes of the response body for check to be considered healthy. Only valid with `HTTP_STR_MATCH` and `HTTPS_STR_MATCH`.
    */
  val searchString: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the health check.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The protocol to use when performing health checks. Valid values are `HTTP`, `HTTPS`, `HTTP_STR_MATCH`, `HTTPS_STR_MATCH`, `TCP`, `CALCULATED` and `CLOUDWATCH_METRIC`.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}
object HealthCheckState {
  
  @scala.inline
  def apply(): HealthCheckState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthCheckState]
  }
  
  @scala.inline
  implicit class HealthCheckStateOps[Self <: HealthCheckState] (val x: Self) extends AnyVal {
    
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
    def setChildHealthThreshold(value: Input[Double]): Self = this.set("childHealthThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildHealthThreshold: Self = this.set("childHealthThreshold", js.undefined)
    
    @scala.inline
    def setChildHealthchecksVarargs(value: Input[String]*): Self = this.set("childHealthchecks", js.Array(value :_*))
    
    @scala.inline
    def setChildHealthchecks(value: Input[js.Array[Input[String]]]): Self = this.set("childHealthchecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildHealthchecks: Self = this.set("childHealthchecks", js.undefined)
    
    @scala.inline
    def setCloudwatchAlarmName(value: Input[String]): Self = this.set("cloudwatchAlarmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudwatchAlarmName: Self = this.set("cloudwatchAlarmName", js.undefined)
    
    @scala.inline
    def setCloudwatchAlarmRegion(value: Input[String]): Self = this.set("cloudwatchAlarmRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudwatchAlarmRegion: Self = this.set("cloudwatchAlarmRegion", js.undefined)
    
    @scala.inline
    def setDisabled(value: Input[Boolean]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEnableSni(value: Input[Boolean]): Self = this.set("enableSni", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSni: Self = this.set("enableSni", js.undefined)
    
    @scala.inline
    def setFailureThreshold(value: Input[Double]): Self = this.set("failureThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureThreshold: Self = this.set("failureThreshold", js.undefined)
    
    @scala.inline
    def setFqdn(value: Input[String]): Self = this.set("fqdn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFqdn: Self = this.set("fqdn", js.undefined)
    
    @scala.inline
    def setInsufficientDataHealthStatus(value: Input[String]): Self = this.set("insufficientDataHealthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsufficientDataHealthStatus: Self = this.set("insufficientDataHealthStatus", js.undefined)
    
    @scala.inline
    def setInvertHealthcheck(value: Input[Boolean]): Self = this.set("invertHealthcheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvertHealthcheck: Self = this.set("invertHealthcheck", js.undefined)
    
    @scala.inline
    def setIpAddress(value: Input[String]): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setMeasureLatency(value: Input[Boolean]): Self = this.set("measureLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureLatency: Self = this.set("measureLatency", js.undefined)
    
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setReferenceName(value: Input[String]): Self = this.set("referenceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceName: Self = this.set("referenceName", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: Input[String]*): Self = this.set("regions", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: Input[js.Array[Input[String]]]): Self = this.set("regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
    
    @scala.inline
    def setRequestInterval(value: Input[Double]): Self = this.set("requestInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestInterval: Self = this.set("requestInterval", js.undefined)
    
    @scala.inline
    def setResourcePath(value: Input[String]): Self = this.set("resourcePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcePath: Self = this.set("resourcePath", js.undefined)
    
    @scala.inline
    def setSearchString(value: Input[String]): Self = this.set("searchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchString: Self = this.set("searchString", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
