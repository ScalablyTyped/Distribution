package typings.atPulumiAws.applicationloadbalancingLoadBalancerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AllocationId
import typings.atPulumiAws.Anon_BucketEnabled
import typings.atPulumiAws.albIpAddressTypeMod.IpAddressType
import typings.atPulumiAws.albLoadBalancerTypeMod.LoadBalancerType
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/applicationloadbalancing/loadBalancer", "LoadBalancer")
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
  def this(name: String, args: LoadBalancerArgs, opts: CustomResourceOptions) = this()
  /**
    * An Access Logs block. Access Logs documented below.
    */
  val accessLogs: Output[js.UndefOr[Anon_BucketEnabled]] = js.native
  /**
    * The ARN of the load balancer (matches `id`).
    */
  val arn: Output[String] = js.native
  /**
    * The ARN suffix for use with CloudWatch Metrics.
    */
  val arnSuffix: Output[String] = js.native
  /**
    * The DNS name of the load balancer.
    */
  val dnsName: Output[String] = js.native
  /**
    * If true, cross-zone load balancing of the load balancer will be enabled.
    * This is a `network` load balancer feature. Defaults to `false`.
    */
  val enableCrossZoneLoadBalancing: Output[js.UndefOr[Boolean]] = js.native
  val enableDeletionProtection: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Indicates whether HTTP/2 is enabled in `application` load balancers. Defaults to `true`.
    */
  val enableHttp2: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The time in seconds that the connection is allowed to be idle. Only valid for Load Balancers of type `application`. Default: 60.
    */
  val idleTimeout: Output[js.UndefOr[Double]] = js.native
  /**
    * If true, the LB will be internal.
    */
  val internal: Output[Boolean] = js.native
  /**
    * The type of IP addresses used by the subnets for your load balancer. The possible values are `ipv4` and `dualstack`
    */
  val ipAddressType: Output[IpAddressType] = js.native
  /**
    * The type of load balancer to create. Possible values are `application` or `network`. The default value is `application`.
    */
  val loadBalancerType: Output[js.UndefOr[LoadBalancerType]] = js.native
  val name: Output[String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: Output[js.UndefOr[String]] = js.native
  /**
    * A list of security group IDs to assign to the LB. Only valid for Load Balancers of type `application`.
    */
  val securityGroups: Output[js.Array[String]] = js.native
  /**
    * A subnet mapping block as documented below.
    */
  val subnetMappings: Output[js.Array[Anon_AllocationId]] = js.native
  /**
    * A list of subnet IDs to attach to the LB. Subnets
    * cannot be updated for Load Balancers of type `network`. Changing this value
    * for load balancers of type `network` will force a recreation of the resource.
    */
  val subnets: Output[js.Array[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  val vpcId: Output[String] = js.native
  /**
    * The canonical hosted zone ID of the load balancer (to be used in a Route 53 Alias record).
    */
  val zoneId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/applicationloadbalancing/loadBalancer", "LoadBalancer")
@js.native
object LoadBalancer extends js.Object {
  /**
    * Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): LoadBalancer = js.native
  def get(name: String, id: Input[ID], state: LoadBalancerState): LoadBalancer = js.native
  def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): LoadBalancer = js.native
  /**
    * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/applicationloadbalancing/loadBalancer.LoadBalancer */ Boolean = js.native
}

