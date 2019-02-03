package typings
package atPulumiAwsLib.directconnectLinkAggregationGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect/linkAggregationGroup", "LinkAggregationGroup")
@js.native
class LinkAggregationGroup protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a LinkAggregationGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: LinkAggregationGroupArgs) = this()
  def this(name: java.lang.String, args: LinkAggregationGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the LAG.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The bandwidth of the individual physical connections bundled by the LAG. Available values: 1Gbps, 10Gbps. Case sensitive.
    */
  val connectionsBandwidth: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
    */
  val forceDestroy: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
    */
  val location: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The name of the LAG.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The number of physical connections initially provisioned and bundled by the LAG. Use `aws_dx_connection` and `aws_dx_connection_association` resources instead. Default connections will be removed as part of LAG creation automatically in future versions.
    */
  val numberOfConnections: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectLinkAggregationGroupMod.LinkAggregationGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directconnectLinkAggregationGroupMod.LinkAggregationGroupState
  ): atPulumiAwsLib.directconnectLinkAggregationGroupMod.LinkAggregationGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directconnectLinkAggregationGroupMod.LinkAggregationGroupState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.directconnectLinkAggregationGroupMod.LinkAggregationGroup = js.native
}

