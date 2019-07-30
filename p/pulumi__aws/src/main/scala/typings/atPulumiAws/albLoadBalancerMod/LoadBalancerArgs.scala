package typings.atPulumiAws.albLoadBalancerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AllocationIdSubnetId
import typings.atPulumiAws.Anon_BucketEnabledPrefix
import typings.atPulumiAws.albIpAddressTypeMod.IpAddressType
import typings.atPulumiAws.albLoadBalancerTypeMod.LoadBalancerType
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerArgs extends js.Object {
  /**
    * An Access Logs block. Access Logs documented below.
    */
  val accessLogs: js.UndefOr[Input[Anon_BucketEnabledPrefix]] = js.undefined
  /**
    * If true, cross-zone load balancing of the load balancer will be enabled.
    * This is a `network` load balancer feature. Defaults to `false`.
    */
  val enableCrossZoneLoadBalancing: js.UndefOr[Input[Boolean]] = js.undefined
  val enableDeletionProtection: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Indicates whether HTTP/2 is enabled in `application` load balancers. Defaults to `true`.
    */
  val enableHttp2: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The time in seconds that the connection is allowed to be idle. Only valid for Load Balancers of type `application`. Default: 60.
    */
  val idleTimeout: js.UndefOr[Input[Double]] = js.undefined
  /**
    * If true, the LB will be internal.
    */
  val internal: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The type of IP addresses used by the subnets for your load balancer. The possible values are `ipv4` and `dualstack`
    */
  val ipAddressType: js.UndefOr[Input[IpAddressType]] = js.undefined
  /**
    * The type of load balancer to create. Possible values are `application` or `network`. The default value is `application`.
    */
  val loadBalancerType: js.UndefOr[Input[LoadBalancerType]] = js.undefined
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of security group IDs to assign to the LB. Only valid for Load Balancers of type `application`.
    */
  val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * A subnet mapping block as documented below.
    */
  val subnetMappings: js.UndefOr[Input[js.Array[Input[Anon_AllocationIdSubnetId]]]] = js.undefined
  /**
    * A list of subnet IDs to attach to the LB. Subnets
    * cannot be updated for Load Balancers of type `network`. Changing this value
    * for load balancers of type `network` will force a recreation of the resource.
    */
  val subnets: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object LoadBalancerArgs {
  @scala.inline
  def apply(
    accessLogs: Input[Anon_BucketEnabledPrefix] = null,
    enableCrossZoneLoadBalancing: Input[Boolean] = null,
    enableDeletionProtection: Input[Boolean] = null,
    enableHttp2: Input[Boolean] = null,
    idleTimeout: Input[Double] = null,
    internal: Input[Boolean] = null,
    ipAddressType: Input[IpAddressType] = null,
    loadBalancerType: Input[LoadBalancerType] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    securityGroups: Input[js.Array[Input[String]]] = null,
    subnetMappings: Input[js.Array[Input[Anon_AllocationIdSubnetId]]] = null,
    subnets: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): LoadBalancerArgs = {
    val __obj = js.Dynamic.literal()
    if (accessLogs != null) __obj.updateDynamic("accessLogs")(accessLogs.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[LoadBalancerArgs]
  }
}

