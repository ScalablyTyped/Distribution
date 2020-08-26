package typings.pulumiAws.linkAggregationGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect/linkAggregationGroup", "LinkAggregationGroup")
@js.native
class LinkAggregationGroup protected () extends CustomResource {
  /**
    * Create a LinkAggregationGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LinkAggregationGroupArgs) = this()
  def this(name: String, args: LinkAggregationGroupArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the LAG.
    * * `jumboFrameCapable` -Indicates whether jumbo frames (9001 MTU) are supported.
    */
  val arn: Output_[String] = js.native
  /**
    * The bandwidth of the individual physical connections bundled by the LAG. Valid values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
    */
  val connectionsBandwidth: Output_[String] = js.native
  /**
    * A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
    */
  val forceDestroy: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
    */
  val hasLogicalRedundancy: Output_[String] = js.native
  val jumboFrameCapable: Output_[Boolean] = js.native
  /**
    * The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
    */
  val location: Output_[String] = js.native
  /**
    * The name of the LAG.
    */
  val name: Output_[String] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/directconnect/linkAggregationGroup", "LinkAggregationGroup")
@js.native
object LinkAggregationGroup extends js.Object {
  /**
    * Get an existing LinkAggregationGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): LinkAggregationGroup = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LinkAggregationGroup = js.native
  def get(name: String, id: Input[ID], state: LinkAggregationGroupState): LinkAggregationGroup = js.native
  def get(name: String, id: Input[ID], state: LinkAggregationGroupState, opts: CustomResourceOptions): LinkAggregationGroup = js.native
  /**
    * Returns true if the given object is an instance of LinkAggregationGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/linkAggregationGroup.LinkAggregationGroup */ Boolean = js.native
}

