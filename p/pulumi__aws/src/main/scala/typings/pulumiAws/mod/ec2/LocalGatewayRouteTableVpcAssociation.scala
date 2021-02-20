package typings.pulumiAws.mod.ec2

import typings.pulumiAws.localGatewayRouteTableVpcAssociationMod.LocalGatewayRouteTableVpcAssociationArgs
import typings.pulumiAws.localGatewayRouteTableVpcAssociationMod.LocalGatewayRouteTableVpcAssociationState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.LocalGatewayRouteTableVpcAssociation")
@js.native
class LocalGatewayRouteTableVpcAssociation protected ()
  extends typings.pulumiAws.ec2Mod.LocalGatewayRouteTableVpcAssociation {
  /**
    * Create a LocalGatewayRouteTableVpcAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LocalGatewayRouteTableVpcAssociationArgs) = this()
  def this(name: String, args: LocalGatewayRouteTableVpcAssociationArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object LocalGatewayRouteTableVpcAssociation {
  
  /**
    * Get an existing LocalGatewayRouteTableVpcAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws", "ec2.LocalGatewayRouteTableVpcAssociation.get")
  @js.native
  def get(name: String, id: Input[ID]): typings.pulumiAws.localGatewayRouteTableVpcAssociationMod.LocalGatewayRouteTableVpcAssociation = js.native
  @JSImport("@pulumi/aws", "ec2.LocalGatewayRouteTableVpcAssociation.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.localGatewayRouteTableVpcAssociationMod.LocalGatewayRouteTableVpcAssociation = js.native
  @JSImport("@pulumi/aws", "ec2.LocalGatewayRouteTableVpcAssociation.get")
  @js.native
  def get(name: String, id: Input[ID], state: LocalGatewayRouteTableVpcAssociationState): typings.pulumiAws.localGatewayRouteTableVpcAssociationMod.LocalGatewayRouteTableVpcAssociation = js.native
  @JSImport("@pulumi/aws", "ec2.LocalGatewayRouteTableVpcAssociation.get")
  @js.native
  def get(
    name: String,
    id: Input[ID],
    state: LocalGatewayRouteTableVpcAssociationState,
    opts: CustomResourceOptions
  ): typings.pulumiAws.localGatewayRouteTableVpcAssociationMod.LocalGatewayRouteTableVpcAssociation = js.native
  
  /**
    * Returns true if the given object is an instance of LocalGatewayRouteTableVpcAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws", "ec2.LocalGatewayRouteTableVpcAssociation.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/localGatewayRouteTableVpcAssociation.LocalGatewayRouteTableVpcAssociation */ Boolean = js.native
}
