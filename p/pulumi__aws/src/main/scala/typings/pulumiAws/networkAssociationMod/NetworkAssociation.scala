package typings.pulumiAws.networkAssociationMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2clientvpn/networkAssociation", "NetworkAssociation")
@js.native
class NetworkAssociation protected () extends CustomResource {
  /**
    * Create a NetworkAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NetworkAssociationArgs) = this()
  def this(name: String, args: NetworkAssociationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The unique ID of the target network association.
    */
  val associationId: Output_[String] = js.native
  
  /**
    * The ID of the Client VPN endpoint.
    */
  val clientVpnEndpointId: Output_[String] = js.native
  
  /**
    * A list of up to five custom security groups to apply to the target network. If not specified, the VPC's default security group is assigned.
    */
  val securityGroups: Output_[js.Array[String]] = js.native
  
  /**
    * The current state of the target network association.
    */
  val status: Output_[String] = js.native
  
  /**
    * The ID of the subnet to associate with the Client VPN endpoint.
    */
  val subnetId: Output_[String] = js.native
  
  /**
    * The ID of the VPC in which the target subnet is located.
    */
  val vpcId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2clientvpn/networkAssociation", "NetworkAssociation")
@js.native
object NetworkAssociation extends js.Object {
  
  /**
    * Get an existing NetworkAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): NetworkAssociation = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): NetworkAssociation = js.native
  def get(name: String, id: Input[ID], state: NetworkAssociationState): NetworkAssociation = js.native
  def get(name: String, id: Input[ID], state: NetworkAssociationState, opts: CustomResourceOptions): NetworkAssociation = js.native
  
  /**
    * Returns true if the given object is an instance of NetworkAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/networkAssociation.NetworkAssociation */ Boolean = js.native
}
