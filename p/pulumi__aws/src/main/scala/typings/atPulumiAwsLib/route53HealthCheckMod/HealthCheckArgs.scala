package typings
package atPulumiAwsLib.route53HealthCheckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthCheckArgs extends js.Object {
  /**
    * The minimum number of child health checks that must be healthy for Route 53 to consider the parent health check to be healthy. Valid values are integers between 0 and 256, inclusive
    */
  val childHealthThreshold: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * For a specified parent health check, a list of HealthCheckId values for the associated child health checks.
    */
  val childHealthchecks: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The name of the CloudWatch alarm.
    */
  val cloudwatchAlarmName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The CloudWatchRegion that the CloudWatch alarm was created in.
    */
  val cloudwatchAlarmRegion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A boolean value that indicates whether Route53 should send the `fqdn` to the endpoint when performing the health check. This defaults to AWS' defaults: when the `type` is "HTTPS" `enable_sni` defaults to `true`, when `type` is anything else `enable_sni` defaults to `false`.
    */
  val enableSni: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The number of consecutive health checks that an endpoint must pass or fail.
    */
  val failureThreshold: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The fully qualified domain name of the endpoint to be checked.
    */
  val fqdn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The status of the health check when CloudWatch has insufficient data about the state of associated alarm. Valid values are `Healthy` , `Unhealthy` and `LastKnownStatus`.
    */
  val insufficientDataHealthStatus: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A boolean value that indicates whether the status of health check should be inverted. For example, if a health check is healthy but Inverted is True , then Route 53 considers the health check to be unhealthy.
    */
  val invertHealthcheck: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The IP address of the endpoint to be checked.
    */
  val ipAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A Boolean value that indicates whether you want Route 53 to measure the latency between health checkers in multiple AWS regions and your endpoint and to display CloudWatch latency graphs in the Route 53 console.
    */
  val measureLatency: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The port of the endpoint to be checked.
    */
  val port: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * This is a reference name used in Caller Reference
    * (helpful for identifying single health_check set amongst others)
    */
  val referenceName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of AWS regions that you want Amazon Route 53 health checkers to check the specified endpoint from.
    */
  val regions: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the time that it sends the next health-check request.
    */
  val requestInterval: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The path that you want Amazon Route 53 to request when performing health checks.
    */
  val resourcePath: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * String searched in the first 5120 bytes of the response body for check to be considered healthy. Only valid with `HTTP_STR_MATCH` and `HTTPS_STR_MATCH`.
    */
  val searchString: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the health check.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The protocol to use when performing health checks. Valid values are `HTTP`, `HTTPS`, `HTTP_STR_MATCH`, `HTTPS_STR_MATCH`, `TCP`, `CALCULATED` and `CLOUDWATCH_METRIC`.
    */
  val `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object HealthCheckArgs {
  @scala.inline
  def apply(
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    childHealthThreshold: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    childHealthchecks: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    cloudwatchAlarmName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    cloudwatchAlarmRegion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    enableSni: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    failureThreshold: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    fqdn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    insufficientDataHealthStatus: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    invertHealthcheck: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    ipAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    measureLatency: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    port: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    referenceName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    regions: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    requestInterval: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    resourcePath: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    searchString: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): HealthCheckArgs = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
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

