package typings.atPulumiAws.ec2VpcPeeringConnectionAccepterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2.VpcPeeringConnectionAccepterAccepter
import typings.atPulumiAws.typesOutputMod.ec2.VpcPeeringConnectionAccepterRequester
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpcPeeringConnectionAccepter", "VpcPeeringConnectionAccepter")
@js.native
class VpcPeeringConnectionAccepter protected () extends CustomResource {
  /**
    * Create a VpcPeeringConnectionAccepter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcPeeringConnectionAccepterArgs) = this()
  def this(name: String, args: VpcPeeringConnectionAccepterArgs, opts: CustomResourceOptions) = this()
  /**
    * The status of the VPC Peering Connection request.
    */
  val acceptStatus: Output[String] = js.native
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options set for the accepter VPC.
    */
  val accepter: Output[VpcPeeringConnectionAccepterAccepter] = js.native
  /**
    * Whether or not to accept the peering request. Defaults to `false`.
    */
  val autoAccept: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The AWS account ID of the owner of the requester VPC.
    */
  val peerOwnerId: Output[String] = js.native
  /**
    * The region of the accepter VPC.
    */
  val peerRegion: Output[String] = js.native
  /**
    * The ID of the requester VPC.
    */
  val peerVpcId: Output[String] = js.native
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options set for the requester VPC.
    */
  val requester: Output[VpcPeeringConnectionAccepterRequester] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The ID of the accepter VPC.
    */
  val vpcId: Output[String] = js.native
  /**
    * The VPC Peering Connection ID to manage.
    */
  val vpcPeeringConnectionId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/vpcPeeringConnectionAccepter", "VpcPeeringConnectionAccepter")
@js.native
object VpcPeeringConnectionAccepter extends js.Object {
  /**
    * Get an existing VpcPeeringConnectionAccepter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): VpcPeeringConnectionAccepter = js.native
  def get(name: String, id: Input[ID], state: VpcPeeringConnectionAccepterState): VpcPeeringConnectionAccepter = js.native
  def get(name: String, id: Input[ID], state: VpcPeeringConnectionAccepterState, opts: CustomResourceOptions): VpcPeeringConnectionAccepter = js.native
  /**
    * Returns true if the given object is an instance of VpcPeeringConnectionAccepter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcPeeringConnectionAccepter.VpcPeeringConnectionAccepter */ Boolean = js.native
}

