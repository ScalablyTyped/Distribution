package typings.atPulumiAws.elasticloadbalancingLoadBalancerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_BucketBucketPrefixEnabled
import typings.atPulumiAws.Anon_HealthyThresholdInterval
import typings.atPulumiAws.Anon_InstancePortInstanceProtocol
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticloadbalancing/loadBalancer", "LoadBalancer")
@js.native
class LoadBalancer protected () extends CustomResource {
  /**
    * Create a LoadBalancer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LoadBalancerArgs) = this()
  def this(name: String, args: LoadBalancerArgs, opts: CustomResourceOptions) = this()
  /**
    * An Access Logs block. Access Logs documented below.
    */
  val accessLogs: Output[js.UndefOr[Anon_BucketBucketPrefixEnabled]] = js.native
  /**
    * The ARN of the ELB
    */
  val arn: Output[String] = js.native
  /**
    * The AZ's to serve traffic in.
    */
  val availabilityZones: Output[js.Array[String]] = js.native
  /**
    * Boolean to enable connection draining. Default: `false`
    */
  val connectionDraining: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The time in seconds to allow for connections to drain. Default: `300`
    */
  val connectionDrainingTimeout: Output[js.UndefOr[Double]] = js.native
  /**
    * Enable cross-zone load balancing. Default: `true`
    */
  val crossZoneLoadBalancing: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The DNS name of the ELB
    */
  val dnsName: Output[String] = js.native
  /**
    * A health_check block. Health Check documented below.
    */
  val healthCheck: Output[Anon_HealthyThresholdInterval] = js.native
  /**
    * The time in seconds that the connection is allowed to be idle. Default: `60`
    */
  val idleTimeout: Output[js.UndefOr[Double]] = js.native
  /**
    * A list of instance ids to place in the ELB pool.
    */
  val instances: Output[js.Array[String]] = js.native
  /**
    * If true, ELB will be an internal ELB.
    */
  val internal: Output[Boolean] = js.native
  /**
    * A list of listener blocks. Listeners documented below.
    */
  val listeners: Output[js.Array[Anon_InstancePortInstanceProtocol]] = js.native
  val name: Output[String] = js.native
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: Output[js.UndefOr[String]] = js.native
  /**
    * A list of security group IDs to assign to the ELB.
    * Only valid if creating an ELB within a VPC
    */
  val securityGroups: Output[js.Array[String]] = js.native
  /**
    * The name of the security group that you can use as
    * part of your inbound rules for your load balancer's back-end application
    * instances. Use this for Classic or Default VPC only.
    */
  val sourceSecurityGroup: Output[String] = js.native
  /**
    * The ID of the security group that you can use as
    * part of your inbound rules for your load balancer's back-end application
    * instances. Only available on ELBs launched in a VPC.
    */
  val sourceSecurityGroupId: Output[String] = js.native
  /**
    * A list of subnet IDs to attach to the ELB.
    */
  val subnets: Output[js.Array[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The canonical hosted zone ID of the ELB (to be used in a Route 53 Alias record)
    */
  val zoneId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticloadbalancing/loadBalancer", "LoadBalancer")
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
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/loadBalancer.LoadBalancer */ Boolean = js.native
}

