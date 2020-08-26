package typings.pulumiAws.loadBalancerMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.ipAddressTypeMod.IpAddressType
import typings.pulumiAws.loadBalancerTypeMod.LoadBalancerType
import typings.pulumiAws.outputMod.alb.LoadBalancerAccessLogs
import typings.pulumiAws.outputMod.alb.LoadBalancerSubnetMapping
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/alb/loadBalancer", "LoadBalancer")
@js.native
class LoadBalancer protected () extends CustomResource {
  /**
    * Create a LoadBalancer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: LoadBalancerArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: LoadBalancerArgs, opts: CustomResourceOptions) = this()
  /**
    * An Access Logs block. Access Logs documented below.
    */
  val accessLogs: Output_[js.UndefOr[LoadBalancerAccessLogs]] = js.native
  /**
    * The ARN of the load balancer (matches `id`).
    */
  val arn: Output_[String] = js.native
  /**
    * The ARN suffix for use with CloudWatch Metrics.
    */
  val arnSuffix: Output_[String] = js.native
  /**
    * The DNS name of the load balancer.
    */
  val dnsName: Output_[String] = js.native
  /**
    * Indicates whether HTTP headers with header fields that are not valid are removed by the load balancer (true) or routed to targets (false). The default is false. Elastic Load Balancing requires that message header names contain only alphanumeric characters and hyphens. Only valid for Load Balancers of type `application`.
    */
  val dropInvalidHeaderFields: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * If true, cross-zone load balancing of the load balancer will be enabled.
    * This is a `network` load balancer feature. Defaults to `false`.
    */
  val enableCrossZoneLoadBalancing: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * If true, deletion of the load balancer will be disabled via
    * the AWS API. This will prevent this provider from deleting the load balancer. Defaults to `false`.
    */
  val enableDeletionProtection: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Indicates whether HTTP/2 is enabled in `application` load balancers. Defaults to `true`.
    */
  val enableHttp2: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The time in seconds that the connection is allowed to be idle. Only valid for Load Balancers of type `application`. Default: 60.
    */
  val idleTimeout: Output_[js.UndefOr[Double]] = js.native
  /**
    * If true, the LB will be internal.
    */
  val internal: Output_[Boolean] = js.native
  /**
    * The type of IP addresses used by the subnets for your load balancer. The possible values are `ipv4` and `dualstack`
    */
  val ipAddressType: Output_[IpAddressType] = js.native
  /**
    * The type of load balancer to create. Possible values are `application` or `network`. The default value is `application`.
    */
  val loadBalancerType: Output_[js.UndefOr[LoadBalancerType]] = js.native
  /**
    * The name of the LB. This name must be unique within your AWS account, can have a maximum of 32 characters,
    * must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen. If not specified,
    * this provider will autogenerate a name beginning with `tf-lb`.
    */
  val name: Output_[String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: Output_[js.UndefOr[String]] = js.native
  /**
    * A list of security group IDs to assign to the LB. Only valid for Load Balancers of type `application`.
    */
  val securityGroups: Output_[js.Array[String]] = js.native
  /**
    * A subnet mapping block as documented below.
    */
  val subnetMappings: Output_[js.Array[LoadBalancerSubnetMapping]] = js.native
  /**
    * A list of subnet IDs to attach to the LB. Subnets
    * cannot be updated for Load Balancers of type `network`. Changing this value
    * for load balancers of type `network` will force a recreation of the resource.
    */
  val subnets: Output_[js.Array[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  val vpcId: Output_[String] = js.native
  /**
    * The canonical hosted zone ID of the load balancer (to be used in a Route 53 Alias record).
    */
  val zoneId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/alb/loadBalancer", "LoadBalancer")
@js.native
object LoadBalancer extends js.Object {
  /**
    * Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): LoadBalancer = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LoadBalancer = js.native
  def get(name: String, id: Input[ID], state: LoadBalancerState): LoadBalancer = js.native
  def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): LoadBalancer = js.native
  /**
    * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/loadBalancer.LoadBalancer */ Boolean = js.native
}

