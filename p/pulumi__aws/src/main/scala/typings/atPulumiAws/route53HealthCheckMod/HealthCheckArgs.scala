package typings.atPulumiAws.route53HealthCheckMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthCheckArgs extends js.Object {
  /**
    * The minimum number of child health checks that must be healthy for Route 53 to consider the parent health check to be healthy. Valid values are integers between 0 and 256, inclusive
    */
  val childHealthThreshold: js.UndefOr[Input[Double]] = js.undefined
  /**
    * For a specified parent health check, a list of HealthCheckId values for the associated child health checks.
    */
  val childHealthchecks: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The name of the CloudWatch alarm.
    */
  val cloudwatchAlarmName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The CloudWatchRegion that the CloudWatch alarm was created in.
    */
  val cloudwatchAlarmRegion: js.UndefOr[Input[String]] = js.undefined
  /**
    * A boolean value that indicates whether Route53 should send the `fqdn` to the endpoint when performing the health check. This defaults to AWS' defaults: when the `type` is "HTTPS" `enable_sni` defaults to `true`, when `type` is anything else `enable_sni` defaults to `false`.
    */
  val enableSni: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The number of consecutive health checks that an endpoint must pass or fail.
    */
  val failureThreshold: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The fully qualified domain name of the endpoint to be checked.
    */
  val fqdn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The status of the health check when CloudWatch has insufficient data about the state of associated alarm. Valid values are `Healthy` , `Unhealthy` and `LastKnownStatus`.
    */
  val insufficientDataHealthStatus: js.UndefOr[Input[String]] = js.undefined
  /**
    * A boolean value that indicates whether the status of health check should be inverted. For example, if a health check is healthy but Inverted is True , then Route 53 considers the health check to be unhealthy.
    */
  val invertHealthcheck: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The IP address of the endpoint to be checked.
    */
  val ipAddress: js.UndefOr[Input[String]] = js.undefined
  /**
    * A Boolean value that indicates whether you want Route 53 to measure the latency between health checkers in multiple AWS regions and your endpoint and to display CloudWatch latency graphs in the Route 53 console.
    */
  val measureLatency: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The port of the endpoint to be checked.
    */
  val port: js.UndefOr[Input[Double]] = js.undefined
  /**
    * This is a reference name used in Caller Reference
    * (helpful for identifying single health_check set amongst others)
    */
  val referenceName: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of AWS regions that you want Amazon Route 53 health checkers to check the specified endpoint from.
    */
  val regions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the time that it sends the next health-check request.
    */
  val requestInterval: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The path that you want Amazon Route 53 to request when performing health checks.
    */
  val resourcePath: js.UndefOr[Input[String]] = js.undefined
  /**
    * String searched in the first 5120 bytes of the response body for check to be considered healthy. Only valid with `HTTP_STR_MATCH` and `HTTPS_STR_MATCH`.
    */
  val searchString: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the health check.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The protocol to use when performing health checks. Valid values are `HTTP`, `HTTPS`, `HTTP_STR_MATCH`, `HTTPS_STR_MATCH`, `TCP`, `CALCULATED` and `CLOUDWATCH_METRIC`.
    */
  val `type`: Input[String]
}

object HealthCheckArgs {
  @scala.inline
  def apply(
    `type`: Input[String],
    childHealthThreshold: Input[Double] = null,
    childHealthchecks: Input[js.Array[Input[String]]] = null,
    cloudwatchAlarmName: Input[String] = null,
    cloudwatchAlarmRegion: Input[String] = null,
    enableSni: Input[Boolean] = null,
    failureThreshold: Input[Double] = null,
    fqdn: Input[String] = null,
    insufficientDataHealthStatus: Input[String] = null,
    invertHealthcheck: Input[Boolean] = null,
    ipAddress: Input[String] = null,
    measureLatency: Input[Boolean] = null,
    port: Input[Double] = null,
    referenceName: Input[String] = null,
    regions: Input[js.Array[Input[String]]] = null,
    requestInterval: Input[Double] = null,
    resourcePath: Input[String] = null,
    searchString: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): HealthCheckArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (childHealthThreshold != null) __obj.updateDynamic("childHealthThreshold")(childHealthThreshold.asInstanceOf[js.Any])
    if (childHealthchecks != null) __obj.updateDynamic("childHealthchecks")(childHealthchecks.asInstanceOf[js.Any])
    if (cloudwatchAlarmName != null) __obj.updateDynamic("cloudwatchAlarmName")(cloudwatchAlarmName.asInstanceOf[js.Any])
    if (cloudwatchAlarmRegion != null) __obj.updateDynamic("cloudwatchAlarmRegion")(cloudwatchAlarmRegion.asInstanceOf[js.Any])
    if (enableSni != null) __obj.updateDynamic("enableSni")(enableSni.asInstanceOf[js.Any])
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    if (fqdn != null) __obj.updateDynamic("fqdn")(fqdn.asInstanceOf[js.Any])
    if (insufficientDataHealthStatus != null) __obj.updateDynamic("insufficientDataHealthStatus")(insufficientDataHealthStatus.asInstanceOf[js.Any])
    if (invertHealthcheck != null) __obj.updateDynamic("invertHealthcheck")(invertHealthcheck.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (measureLatency != null) __obj.updateDynamic("measureLatency")(measureLatency.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (referenceName != null) __obj.updateDynamic("referenceName")(referenceName.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    if (requestInterval != null) __obj.updateDynamic("requestInterval")(requestInterval.asInstanceOf[js.Any])
    if (resourcePath != null) __obj.updateDynamic("resourcePath")(resourcePath.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCheckArgs]
  }
}

