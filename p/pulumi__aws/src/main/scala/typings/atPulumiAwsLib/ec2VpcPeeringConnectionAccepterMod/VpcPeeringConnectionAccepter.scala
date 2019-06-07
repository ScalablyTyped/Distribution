package typings
package atPulumiAwsLib.ec2VpcPeeringConnectionAccepterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpcPeeringConnectionAccepter", "VpcPeeringConnectionAccepter")
@js.native
class VpcPeeringConnectionAccepter protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a VpcPeeringConnectionAccepter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: VpcPeeringConnectionAccepterArgs) = this()
  def this(name: java.lang.String, args: VpcPeeringConnectionAccepterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The status of the VPC Peering Connection request.
    */
  val acceptStatus: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options set for the accepter VPC.
    */
  val accepter: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_AllowClassicLinkToRemoteVpc] = js.native
  /**
    * Whether or not to accept the peering request. Defaults to `false`.
    */
  val autoAccept: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The AWS account ID of the owner of the requester VPC.
    */
  val peerOwnerId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The region of the accepter VPC.
    */
  val peerRegion: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of the requester VPC.
    */
  val peerVpcId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options set for the requester VPC.
    */
  val requester: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_AllowClassicLinkToRemoteVpc] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * The ID of the accepter VPC.
    */
  val vpcId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The VPC Peering Connection ID to manage.
    */
  val vpcPeeringConnectionId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepter = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepterState
  ): atPulumiAwsLib.ec2VpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepter = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepterState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2VpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepter = js.native
  /**
    * Returns true if the given object is an instance of VpcPeeringConnectionAccepter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcPeeringConnectionAccepter.VpcPeeringConnectionAccepter */ scala.Boolean = js.native
}

