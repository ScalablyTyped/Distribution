package typings.pulumiAws.lbLoadBalancerMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.lb.LoadBalancerAccessLogs
import typings.pulumiAws.inputMod.lb.LoadBalancerSubnetMapping
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerState extends js.Object {
  /**
    * An Access Logs block. Access Logs documented below.
    */
  val accessLogs: js.UndefOr[Input[LoadBalancerAccessLogs]] = js.native
  /**
    * The ARN of the load balancer (matches `id`).
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN suffix for use with CloudWatch Metrics.
    */
  val arnSuffix: js.UndefOr[Input[String]] = js.native
  /**
    * The DNS name of the load balancer.
    */
  val dnsName: js.UndefOr[Input[String]] = js.native
  /**
    * If true, cross-zone load balancing of the load balancer will be enabled.
    * This is a `network` load balancer feature. Defaults to `false`.
    */
  val enableCrossZoneLoadBalancing: js.UndefOr[Input[Boolean]] = js.native
  /**
    * If true, deletion of the load balancer will be disabled via
    * the AWS API. This will prevent this provider from deleting the load balancer. Defaults to `false`.
    */
  val enableDeletionProtection: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Indicates whether HTTP/2 is enabled in `application` load balancers. Defaults to `true`.
    */
  val enableHttp2: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The time in seconds that the connection is allowed to be idle. Only valid for Load Balancers of type `application`. Default: 60.
    */
  val idleTimeout: js.UndefOr[Input[Double]] = js.native
  /**
    * If true, the LB will be internal.
    */
  val internal: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The type of IP addresses used by the subnets for your load balancer. The possible values are `ipv4` and `dualstack`
    */
  val ipAddressType: js.UndefOr[Input[String]] = js.native
  /**
    * The type of load balancer to create. Possible values are `application` or `network`. The default value is `application`.
    */
  val loadBalancerType: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the LB. This name must be unique within your AWS account, can have a maximum of 32 characters,
    * must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen. If not specified,
    * this provider will autogenerate a name beginning with `tf-lb`.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * A list of security group IDs to assign to the LB. Only valid for Load Balancers of type `application`.
    */
  val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A subnet mapping block as documented below.
    */
  val subnetMappings: js.UndefOr[Input[js.Array[Input[LoadBalancerSubnetMapping]]]] = js.native
  /**
    * A list of subnet IDs to attach to the LB. Subnets
    * cannot be updated for Load Balancers of type `network`. Changing this value
    * for load balancers of type `network` will force a recreation of the resource.
    */
  val subnets: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  val vpcId: js.UndefOr[Input[String]] = js.native
  /**
    * The canonical hosted zone ID of the load balancer (to be used in a Route 53 Alias record).
    */
  val zoneId: js.UndefOr[Input[String]] = js.native
}

object LoadBalancerState {
  @scala.inline
  def apply(
    accessLogs: Input[LoadBalancerAccessLogs] = null,
    arn: Input[String] = null,
    arnSuffix: Input[String] = null,
    dnsName: Input[String] = null,
    enableCrossZoneLoadBalancing: Input[Boolean] = null,
    enableDeletionProtection: Input[Boolean] = null,
    enableHttp2: Input[Boolean] = null,
    idleTimeout: Input[Double] = null,
    internal: Input[Boolean] = null,
    ipAddressType: Input[String] = null,
    loadBalancerType: Input[String] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    securityGroups: Input[js.Array[Input[String]]] = null,
    subnetMappings: Input[js.Array[Input[LoadBalancerSubnetMapping]]] = null,
    subnets: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcId: Input[String] = null,
    zoneId: Input[String] = null
  ): LoadBalancerState = {
    val __obj = js.Dynamic.literal()
    if (accessLogs != null) __obj.updateDynamic("accessLogs")(accessLogs.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (arnSuffix != null) __obj.updateDynamic("arnSuffix")(arnSuffix.asInstanceOf[js.Any])
    if (dnsName != null) __obj.updateDynamic("dnsName")(dnsName.asInstanceOf[js.Any])
    if (enableCrossZoneLoadBalancing != null) __obj.updateDynamic("enableCrossZoneLoadBalancing")(enableCrossZoneLoadBalancing.asInstanceOf[js.Any])
    if (enableDeletionProtection != null) __obj.updateDynamic("enableDeletionProtection")(enableDeletionProtection.asInstanceOf[js.Any])
    if (enableHttp2 != null) __obj.updateDynamic("enableHttp2")(enableHttp2.asInstanceOf[js.Any])
    if (idleTimeout != null) __obj.updateDynamic("idleTimeout")(idleTimeout.asInstanceOf[js.Any])
    if (internal != null) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    if (ipAddressType != null) __obj.updateDynamic("ipAddressType")(ipAddressType.asInstanceOf[js.Any])
    if (loadBalancerType != null) __obj.updateDynamic("loadBalancerType")(loadBalancerType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (subnetMappings != null) __obj.updateDynamic("subnetMappings")(subnetMappings.asInstanceOf[js.Any])
    if (subnets != null) __obj.updateDynamic("subnets")(subnets.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    if (zoneId != null) __obj.updateDynamic("zoneId")(zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerState]
  }
}

