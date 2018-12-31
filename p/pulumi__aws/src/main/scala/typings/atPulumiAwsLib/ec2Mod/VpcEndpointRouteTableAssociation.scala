package typings
package atPulumiAwsLib.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "VpcEndpointRouteTableAssociation")
@js.native
class VpcEndpointRouteTableAssociation protected ()
  extends atPulumiAwsLib.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociation {
  /**
    * Create a VpcEndpointRouteTableAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociationArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

@JSImport("@pulumi/aws/ec2", "VpcEndpointRouteTableAssociation")
@js.native
object VpcEndpointRouteTableAssociation extends js.Object {
  /**
    * Get an existing VpcEndpointRouteTableAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociationState
  ): atPulumiAwsLib.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociation = js.native
}

