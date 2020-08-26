package typings.pulumiAws.localGatewayRouteTableVpcAssociationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/localGatewayRouteTableVpcAssociation", "LocalGatewayRouteTableVpcAssociation")
@js.native
class LocalGatewayRouteTableVpcAssociation protected () extends CustomResource {
  /**
    * Create a LocalGatewayRouteTableVpcAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LocalGatewayRouteTableVpcAssociationArgs) = this()
  def this(name: String, args: LocalGatewayRouteTableVpcAssociationArgs, opts: CustomResourceOptions) = this()
  val localGatewayId: Output_[String] = js.native
  /**
    * Identifier of EC2 Local Gateway Route Table.
    */
  val localGatewayRouteTableId: Output_[String] = js.native
  /**
    * Key-value map of resource tags.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * Identifier of EC2 VPC.
    */
  val vpcId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/localGatewayRouteTableVpcAssociation", "LocalGatewayRouteTableVpcAssociation")
@js.native
object LocalGatewayRouteTableVpcAssociation extends js.Object {
  /**
    * Get an existing LocalGatewayRouteTableVpcAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): LocalGatewayRouteTableVpcAssociation = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LocalGatewayRouteTableVpcAssociation = js.native
  def get(name: String, id: Input[ID], state: LocalGatewayRouteTableVpcAssociationState): LocalGatewayRouteTableVpcAssociation = js.native
  def get(
    name: String,
    id: Input[ID],
    state: LocalGatewayRouteTableVpcAssociationState,
    opts: CustomResourceOptions
  ): LocalGatewayRouteTableVpcAssociation = js.native
  /**
    * Returns true if the given object is an instance of LocalGatewayRouteTableVpcAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/localGatewayRouteTableVpcAssociation.LocalGatewayRouteTableVpcAssociation */ Boolean = js.native
}

