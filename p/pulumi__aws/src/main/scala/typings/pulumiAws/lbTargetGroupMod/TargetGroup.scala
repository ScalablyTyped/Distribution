package typings.pulumiAws.lbTargetGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.lb.TargetGroupHealthCheck
import typings.pulumiAws.outputMod.lb.TargetGroupStickiness
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/lb/targetGroup", "TargetGroup")
@js.native
class TargetGroup protected () extends CustomResource {
  /**
    * Create a TargetGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: TargetGroupArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: TargetGroupArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the Target Group (matches `id`)
    */
  val arn: Output_[String] = js.native
  
  /**
    * The ARN suffix for use with CloudWatch Metrics.
    */
  val arnSuffix: Output_[String] = js.native
  
  /**
    * The amount time for Elastic Load Balancing to wait before changing the state of a deregistering target from draining to unused. The range is 0-3600 seconds. The default value is 300 seconds.
    */
  val deregistrationDelay: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * A Health Check block. Health Check blocks are documented below.
    */
  val healthCheck: Output_[TargetGroupHealthCheck] = js.native
  
  /**
    * Boolean whether the request and response headers exchanged between the load balancer and the Lambda function include arrays of values or strings. Only applies when `targetType` is `lambda`.
    */
  val lambdaMultiValueHeadersEnabled: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * Determines how the load balancer selects targets when routing requests. Only applicable for Application Load Balancer Target Groups. The value is `roundRobin` or `leastOutstandingRequests`. The default is `roundRobin`.
    */
  val loadBalancingAlgorithmType: Output_[String] = js.native
  
  /**
    * The name of the target group. If omitted, this provider will assign a random, unique name.
    */
  val name: Output_[String] = js.native
  
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Cannot be longer than 6 characters.
    */
  val namePrefix: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The port on which targets receive traffic, unless overridden when registering a specific target. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
    */
  val port: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * The protocol to use for routing traffic to the targets. Should be one of `GENEVE`, `HTTP`, `HTTPS`, `TCP`, `TCP_UDP`, `TLS`, or `UDP`. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
    */
  val protocol: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Boolean to enable / disable support for proxy protocol v2 on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#proxy-protocol) for more information.
    */
  val proxyProtocolV2: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The amount time for targets to warm up before the load balancer sends them a full share of requests. The range is 30-900 seconds or 0 to disable. The default value is 0 seconds.
    */
  val slowStart: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * A Stickiness block. Stickiness blocks are documented below.
    */
  val stickiness: Output_[TargetGroupStickiness] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The type of target that you must specify when registering targets with this target group.
    * The possible values are `instance` (targets are specified by instance ID) or `ip` (targets are specified by IP address) or `lambda` (targets are specified by lambda arn).
    * The default is `instance`. Note that you can't specify targets for a target group using both instance IDs and IP addresses.
    * If the target type is `ip`, specify IP addresses from the subnets of the virtual private cloud (VPC) for the target group,
    * the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10).
    * You can't specify publicly routable IP addresses.
    */
  val targetType: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The identifier of the VPC in which to create the target group. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
    */
  val vpcId: Output_[js.UndefOr[String]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/lb/targetGroup", "TargetGroup")
@js.native
object TargetGroup extends js.Object {
  
  /**
    * Get an existing TargetGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): TargetGroup = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): TargetGroup = js.native
  def get(name: String, id: Input[ID], state: TargetGroupState): TargetGroup = js.native
  def get(name: String, id: Input[ID], state: TargetGroupState, opts: CustomResourceOptions): TargetGroup = js.native
  
  /**
    * Returns true if the given object is an instance of TargetGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/targetGroup.TargetGroup */ Boolean = js.native
}
