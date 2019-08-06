package typings.atPulumiAws.ec2SpotFleetRequestMod

import typings.atPulumiAws.Anon_Ami
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/spotFleetRequest", "SpotFleetRequest")
@js.native
class SpotFleetRequest protected () extends CustomResource {
  /**
    * Create a SpotFleetRequest resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SpotFleetRequestArgs) = this()
  def this(name: String, args: SpotFleetRequestArgs, opts: CustomResourceOptions) = this()
  /**
    * Indicates how to allocate the target capacity across
    * the Spot pools specified by the Spot fleet request. The default is
    * `lowestPrice`.
    */
  val allocationStrategy: Output[js.UndefOr[String]] = js.native
  val clientToken: Output[String] = js.native
  /**
    * Indicates whether running Spot
    * instances should be terminated if the target capacity of the Spot fleet
    * request is decreased below the current size of the Spot fleet.
    */
  val excessCapacityTerminationPolicy: Output[js.UndefOr[String]] = js.native
  /**
    * The type of fleet request. Indicates whether the Spot Fleet only requests the target
    * capacity or also attempts to maintain it. Default is `maintain`.
    */
  val fleetType: Output[js.UndefOr[String]] = js.native
  /**
    * Grants the Spot fleet permission to terminate
    * Spot instances on your behalf when you cancel its Spot fleet request using
    * CancelSpotFleetRequests or when the Spot fleet request expires, if you set
    * terminateInstancesWithExpiration.
    */
  val iamFleetRole: Output[String] = js.native
  /**
    * Indicates whether a Spot
    * instance stops or terminates when it is interrupted. Default is
    * `terminate`.
    */
  val instanceInterruptionBehaviour: Output[js.UndefOr[String]] = js.native
  /**
    *
    * The number of Spot pools across which to allocate your target Spot capacity.
    * Valid only when `allocation_strategy` is set to `lowestPrice`. Spot Fleet selects
    * the cheapest Spot pools and evenly allocates your target Spot capacity across
    * the number of Spot pools that you specify.
    */
  val instancePoolsToUseCount: Output[js.UndefOr[Double]] = js.native
  /**
    * Used to define the launch configuration of the
    * spot-fleet request. Can be specified multiple times to define different bids
    * across different markets and instance types.
    */
  val launchSpecifications: Output[js.Array[Anon_Ami]] = js.native
  /**
    * A list of elastic load balancer names to add to the Spot fleet.
    */
  val loadBalancers: Output[js.Array[String]] = js.native
  /**
    * Indicates whether Spot fleet should replace unhealthy instances. Default `false`.
    */
  val replaceUnhealthyInstances: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The maximum bid price per unit hour.
    */
  val spotPrice: Output[js.UndefOr[String]] = js.native
  /**
    * The state of the Spot fleet request.
    */
  val spotRequestState: Output[String] = js.native
  /**
    * The number of units to request. You can choose to set the
    * target capacity in terms of instances or a performance characteristic that is
    * important to your application workload, such as vCPUs, memory, or I/O.
    */
  val targetCapacity: Output[Double] = js.native
  /**
    * A list of `aws_alb_target_group` ARNs, for use with Application Load Balancing.
    */
  val targetGroupArns: Output[js.Array[String]] = js.native
  /**
    * Indicates whether running Spot
    * instances should be terminated when the Spot fleet request expires.
    */
  val terminateInstancesWithExpiration: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
    */
  val validFrom: Output[js.UndefOr[String]] = js.native
  /**
    * The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request. Defaults to 24 hours.
    */
  val validUntil: Output[js.UndefOr[String]] = js.native
  /**
    * If set, this provider will
    * wait for the Spot Request to be fulfilled, and will throw an error if the
    * timeout of 10m is reached.
    */
  val waitForFulfillment: Output[js.UndefOr[Boolean]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/spotFleetRequest", "SpotFleetRequest")
@js.native
object SpotFleetRequest extends js.Object {
  /**
    * Get an existing SpotFleetRequest resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): SpotFleetRequest = js.native
  def get(name: String, id: Input[ID], state: SpotFleetRequestState): SpotFleetRequest = js.native
  def get(name: String, id: Input[ID], state: SpotFleetRequestState, opts: CustomResourceOptions): SpotFleetRequest = js.native
  /**
    * Returns true if the given object is an instance of SpotFleetRequest.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/spotFleetRequest.SpotFleetRequest */ Boolean = js.native
}

