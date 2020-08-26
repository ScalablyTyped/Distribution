package typings.pulumiAws.applicationloadbalancingLoadBalancerMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.applicationloadbalancing.LoadBalancerAccessLogs
import typings.pulumiAws.inputMod.applicationloadbalancing.LoadBalancerSubnetMapping
import typings.pulumiAws.ipAddressTypeMod.IpAddressType
import typings.pulumiAws.loadBalancerTypeMod.LoadBalancerType
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
    * Indicates whether HTTP headers with header fields that are not valid are removed by the load balancer (true) or routed to targets (false). The default is false. Elastic Load Balancing requires that message header names contain only alphanumeric characters and hyphens. Only valid for Load Balancers of type `application`.
    */
  val dropInvalidHeaderFields: js.UndefOr[Input[Boolean]] = js.native
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
  val ipAddressType: js.UndefOr[Input[IpAddressType]] = js.native
  /**
    * The type of load balancer to create. Possible values are `application` or `network`. The default value is `application`.
    */
  val loadBalancerType: js.UndefOr[Input[LoadBalancerType]] = js.native
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
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  val vpcId: js.UndefOr[Input[String]] = js.native
  /**
    * The canonical hosted zone ID of the load balancer (to be used in a Route 53 Alias record).
    */
  val zoneId: js.UndefOr[Input[String]] = js.native
}

object LoadBalancerState {
  @scala.inline
  def apply(): LoadBalancerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerState]
  }
  @scala.inline
  implicit class LoadBalancerStateOps[Self <: LoadBalancerState] (val x: Self) extends AnyVal {
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
    def setAccessLogs(value: Input[LoadBalancerAccessLogs]): Self = this.set("accessLogs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessLogs: Self = this.set("accessLogs", js.undefined)
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setArnSuffix(value: Input[String]): Self = this.set("arnSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArnSuffix: Self = this.set("arnSuffix", js.undefined)
    @scala.inline
    def setDnsName(value: Input[String]): Self = this.set("dnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsName: Self = this.set("dnsName", js.undefined)
    @scala.inline
    def setDropInvalidHeaderFields(value: Input[Boolean]): Self = this.set("dropInvalidHeaderFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropInvalidHeaderFields: Self = this.set("dropInvalidHeaderFields", js.undefined)
    @scala.inline
    def setEnableCrossZoneLoadBalancing(value: Input[Boolean]): Self = this.set("enableCrossZoneLoadBalancing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCrossZoneLoadBalancing: Self = this.set("enableCrossZoneLoadBalancing", js.undefined)
    @scala.inline
    def setEnableDeletionProtection(value: Input[Boolean]): Self = this.set("enableDeletionProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDeletionProtection: Self = this.set("enableDeletionProtection", js.undefined)
    @scala.inline
    def setEnableHttp2(value: Input[Boolean]): Self = this.set("enableHttp2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHttp2: Self = this.set("enableHttp2", js.undefined)
    @scala.inline
    def setIdleTimeout(value: Input[Double]): Self = this.set("idleTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdleTimeout: Self = this.set("idleTimeout", js.undefined)
    @scala.inline
    def setInternal(value: Input[Boolean]): Self = this.set("internal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternal: Self = this.set("internal", js.undefined)
    @scala.inline
    def setIpAddressType(value: Input[IpAddressType]): Self = this.set("ipAddressType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddressType: Self = this.set("ipAddressType", js.undefined)
    @scala.inline
    def setLoadBalancerType(value: Input[LoadBalancerType]): Self = this.set("loadBalancerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancerType: Self = this.set("loadBalancerType", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamePrefix(value: Input[String]): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: Input[String]*): Self = this.set("securityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("securityGroups", js.undefined)
    @scala.inline
    def setSubnetMappingsVarargs(value: Input[LoadBalancerSubnetMapping]*): Self = this.set("subnetMappings", js.Array(value :_*))
    @scala.inline
    def setSubnetMappings(value: Input[js.Array[Input[LoadBalancerSubnetMapping]]]): Self = this.set("subnetMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetMappings: Self = this.set("subnetMappings", js.undefined)
    @scala.inline
    def setSubnetsVarargs(value: Input[String]*): Self = this.set("subnets", js.Array(value :_*))
    @scala.inline
    def setSubnets(value: Input[js.Array[Input[String]]]): Self = this.set("subnets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnets: Self = this.set("subnets", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
    @scala.inline
    def setZoneId(value: Input[String]): Self = this.set("zoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoneId: Self = this.set("zoneId", js.undefined)
  }
  
}

