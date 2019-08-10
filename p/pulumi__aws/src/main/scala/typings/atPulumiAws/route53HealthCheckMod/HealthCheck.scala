package typings.atPulumiAws.route53HealthCheckMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/route53/healthCheck", "HealthCheck")
@js.native
class HealthCheck protected () extends CustomResource {
  /**
    * Create a HealthCheck resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: HealthCheckArgs) = this()
  def this(name: String, args: HealthCheckArgs, opts: CustomResourceOptions) = this()
  /**
    * The minimum number of child health checks that must be healthy for Route 53 to consider the parent health check to be healthy. Valid values are integers between 0 and 256, inclusive
    */
  val childHealthThreshold: Output[js.UndefOr[Double]] = js.native
  /**
    * For a specified parent health check, a list of HealthCheckId values for the associated child health checks.
    */
  val childHealthchecks: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The name of the CloudWatch alarm.
    */
  val cloudwatchAlarmName: Output[js.UndefOr[String]] = js.native
  /**
    * The CloudWatchRegion that the CloudWatch alarm was created in.
    */
  val cloudwatchAlarmRegion: Output[js.UndefOr[String]] = js.native
  /**
    * A boolean value that indicates whether Route53 should send the `fqdn` to the endpoint when performing the health check. This defaults to AWS' defaults: when the `type` is "HTTPS" `enableSni` defaults to `true`, when `type` is anything else `enableSni` defaults to `false`.
    */
  val enableSni: Output[Boolean] = js.native
  /**
    * The number of consecutive health checks that an endpoint must pass or fail.
    */
  val failureThreshold: Output[js.UndefOr[Double]] = js.native
  /**
    * The fully qualified domain name of the endpoint to be checked.
    */
  val fqdn: Output[js.UndefOr[String]] = js.native
  /**
    * The status of the health check when CloudWatch has insufficient data about the state of associated alarm. Valid values are `Healthy` , `Unhealthy` and `LastKnownStatus`.
    */
  val insufficientDataHealthStatus: Output[js.UndefOr[String]] = js.native
  /**
    * A boolean value that indicates whether the status of health check should be inverted. For example, if a health check is healthy but Inverted is True , then Route 53 considers the health check to be unhealthy.
    */
  val invertHealthcheck: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The IP address of the endpoint to be checked.
    */
  val ipAddress: Output[js.UndefOr[String]] = js.native
  /**
    * A Boolean value that indicates whether you want Route 53 to measure the latency between health checkers in multiple AWS regions and your endpoint and to display CloudWatch latency graphs in the Route 53 console.
    */
  val measureLatency: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The port of the endpoint to be checked.
    */
  val port: Output[js.UndefOr[Double]] = js.native
  /**
    * This is a reference name used in Caller Reference
    * (helpful for identifying single healthCheck set amongst others)
    */
  val referenceName: Output[js.UndefOr[String]] = js.native
  /**
    * A list of AWS regions that you want Amazon Route 53 health checkers to check the specified endpoint from.
    */
  val regions: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the time that it sends the next health-check request.
    */
  val requestInterval: Output[js.UndefOr[Double]] = js.native
  /**
    * The path that you want Amazon Route 53 to request when performing health checks.
    */
  val resourcePath: Output[js.UndefOr[String]] = js.native
  /**
    * String searched in the first 5120 bytes of the response body for check to be considered healthy. Only valid with `HTTP_STR_MATCH` and `HTTPS_STR_MATCH`.
    */
  val searchString: Output[js.UndefOr[String]] = js.native
  /**
    * A mapping of tags to assign to the health check.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The protocol to use when performing health checks. Valid values are `HTTP`, `HTTPS`, `HTTP_STR_MATCH`, `HTTPS_STR_MATCH`, `TCP`, `CALCULATED` and `CLOUDWATCH_METRIC`.
    */
  val `type`: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/route53/healthCheck", "HealthCheck")
@js.native
object HealthCheck extends js.Object {
  /**
    * Get an existing HealthCheck resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): HealthCheck = js.native
  def get(name: String, id: Input[ID], state: HealthCheckState): HealthCheck = js.native
  def get(name: String, id: Input[ID], state: HealthCheckState, opts: CustomResourceOptions): HealthCheck = js.native
  /**
    * Returns true if the given object is an instance of HealthCheck.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/healthCheck.HealthCheck */ Boolean = js.native
}

