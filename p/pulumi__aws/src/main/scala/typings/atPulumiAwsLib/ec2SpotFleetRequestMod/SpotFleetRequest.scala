package typings
package atPulumiAwsLib.ec2SpotFleetRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/spotFleetRequest", "SpotFleetRequest")
@js.native
class SpotFleetRequest protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a SpotFleetRequest resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: SpotFleetRequestArgs) = this()
  def this(name: java.lang.String, args: SpotFleetRequestArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Indicates how to allocate the target capacity across
    * the Spot pools specified by the Spot fleet request. The default is
    * `lowestPrice`.
    */
  val allocationStrategy: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val clientToken: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Indicates whether running Spot
    * instances should be terminated if the target capacity of the Spot fleet
    * request is decreased below the current size of the Spot fleet.
    */
  val excessCapacityTerminationPolicy: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The type of fleet request. Indicates whether the Spot Fleet only requests the target
    * capacity or also attempts to maintain it. Default is `maintain`.
    */
  val fleetType: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Grants the Spot fleet permission to terminate
    * Spot instances on your behalf when you cancel its Spot fleet request using
    * CancelSpotFleetRequests or when the Spot fleet request expires, if you set
    * terminateInstancesWithExpiration.
    */
  val iamFleetRole: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Indicates whether a Spot
    * instance stops or terminates when it is interrupted. Default is
    * `terminate`.
    */
  val instanceInterruptionBehaviour: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    *
    * The number of Spot pools across which to allocate your target Spot capacity.
    * Valid only when `allocation_strategy` is set to `lowestPrice`. Spot Fleet selects
    * the cheapest Spot pools and evenly allocates your target Spot capacity across
    * the number of Spot pools that you specify.
    */
  val instancePoolsToUseCount: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * Used to define the launch configuration of the
    * spot-fleet request. Can be specified multiple times to define different bids
    * across different markets and instance types.
    */
  val launchSpecifications: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiAwsLib.Anon_Ami]] = js.native
  /**
    * A list of elastic load balancer names to add to the Spot fleet.
    */
  val loadBalancers: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * Indicates whether Spot fleet should replace unhealthy instances. Default `false`.
    */
  val replaceUnhealthyInstances: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The maximum bid price per unit hour.
    */
  val spotPrice: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The state of the Spot fleet request.
    */
  val spotRequestState: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The number of units to request. You can choose to set the
    * target capacity in terms of instances or a performance characteristic that is
    * important to your application workload, such as vCPUs, memory, or I/O.
    */
  val targetCapacity: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
  /**
    * A list of `aws_alb_target_group` ARNs, for use with Application Load Balancing.
    */
  val targetGroupArns: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * Indicates whether running Spot
    * instances should be terminated when the Spot fleet request expires.
    */
  val terminateInstancesWithExpiration: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
    */
  val validFrom: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request. Defaults to 24 hours.
    */
  val validUntil: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * If set, Terraform will
    * wait for the Spot Request to be fulfilled, and will throw an error if the
    * timeout of 10m is reached.
    */
  val waitForFulfillment: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2SpotFleetRequestMod.SpotFleetRequest = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2SpotFleetRequestMod.SpotFleetRequestState
  ): atPulumiAwsLib.ec2SpotFleetRequestMod.SpotFleetRequest = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2SpotFleetRequestMod.SpotFleetRequestState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2SpotFleetRequestMod.SpotFleetRequest = js.native
}

