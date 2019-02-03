package typings
package atPulumiAwsLib.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect", "GatewayAssociation")
@js.native
class GatewayAssociation protected ()
  extends atPulumiAwsLib.directconnectGatewayAssociationMod.GatewayAssociation {
  /**
    * Create a GatewayAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.directconnectGatewayAssociationMod.GatewayAssociationArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.directconnectGatewayAssociationMod.GatewayAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/directconnect", "GatewayAssociation")
@js.native
object GatewayAssociation extends js.Object {
  /**
    * Get an existing GatewayAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectGatewayAssociationMod.GatewayAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directconnectGatewayAssociationMod.GatewayAssociationState
  ): atPulumiAwsLib.directconnectGatewayAssociationMod.GatewayAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directconnectGatewayAssociationMod.GatewayAssociationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.directconnectGatewayAssociationMod.GatewayAssociation = js.native
}

