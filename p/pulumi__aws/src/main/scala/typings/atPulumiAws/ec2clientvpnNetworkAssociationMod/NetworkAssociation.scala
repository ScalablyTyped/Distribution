package typings.atPulumiAws.ec2clientvpnNetworkAssociationMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The ID of the Client VPN endpoint.
    */
  val clientVpnEndpointId: Output[String] = js.native
  /**
    * The IDs of the security groups applied to the target network association.
    */
  val securityGroups: Output[js.Array[String]] = js.native
  /**
    * The current state of the target network association.
    */
  val status: Output[String] = js.native
  /**
    * The ID of the subnet to associate with the Client VPN endpoint.
    */
  val subnetId: Output[String] = js.native
  /**
    * The ID of the VPC in which the target network (subnet) is located.
    */
  val vpcId: Output[String] = js.native
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
    */
  def get(name: String, id: Input[ID]): NetworkAssociation = js.native
  def get(name: String, id: Input[ID], state: NetworkAssociationState): NetworkAssociation = js.native
  def get(name: String, id: Input[ID], state: NetworkAssociationState, opts: CustomResourceOptions): NetworkAssociation = js.native
  /**
    * Returns true if the given object is an instance of NetworkAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/networkAssociation.NetworkAssociation */ Boolean = js.native
}

