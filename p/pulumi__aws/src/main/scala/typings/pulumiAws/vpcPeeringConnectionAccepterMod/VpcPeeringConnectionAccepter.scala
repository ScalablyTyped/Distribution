package typings.pulumiAws.vpcPeeringConnectionAccepterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.VpcPeeringConnectionAccepterAccepter
import typings.pulumiAws.outputMod.ec2.VpcPeeringConnectionAccepterRequester
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  val acceptStatus: Output_[String] = js.native
  
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the accepter VPC.
    */
  val accepter: Output_[VpcPeeringConnectionAccepterAccepter] = js.native
  
  /**
    * Whether or not to accept the peering request. Defaults to `false`.
    */
  val autoAccept: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The AWS account ID of the owner of the requester VPC.
    */
  val peerOwnerId: Output_[String] = js.native
  
  /**
    * The region of the accepter VPC.
    */
  val peerRegion: Output_[String] = js.native
  
  /**
    * The ID of the requester VPC.
    */
  val peerVpcId: Output_[String] = js.native
  
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the requester VPC.
    */
  val requester: Output_[VpcPeeringConnectionAccepterRequester] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The ID of the accepter VPC.
    */
  val vpcId: Output_[String] = js.native
  
  /**
    * The VPC Peering Connection ID to manage.
    */
  val vpcPeeringConnectionId: Output_[String] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): VpcPeeringConnectionAccepter = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpcPeeringConnectionAccepter = js.native
  def get(name: String, id: Input[ID], state: VpcPeeringConnectionAccepterState): VpcPeeringConnectionAccepter = js.native
  def get(name: String, id: Input[ID], state: VpcPeeringConnectionAccepterState, opts: CustomResourceOptions): VpcPeeringConnectionAccepter = js.native
  
  /**
    * Returns true if the given object is an instance of VpcPeeringConnectionAccepter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcPeeringConnectionAccepter.VpcPeeringConnectionAccepter */ Boolean = js.native
}
