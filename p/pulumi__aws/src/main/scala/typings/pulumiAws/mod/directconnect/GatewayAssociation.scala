package typings.pulumiAws.mod.directconnect

import typings.pulumiAws.gatewayAssociationMod.GatewayAssociationArgs
import typings.pulumiAws.gatewayAssociationMod.GatewayAssociationState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "directconnect.GatewayAssociation")
@js.native
class GatewayAssociation protected ()
  extends typings.pulumiAws.directconnectMod.GatewayAssociation {
  /**
    * Create a GatewayAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GatewayAssociationArgs) = this()
  def this(name: String, args: GatewayAssociationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "directconnect.GatewayAssociation")
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
  def get(name: String, id: Input[ID]): typings.pulumiAws.gatewayAssociationMod.GatewayAssociation = js.native
  def get(name: String, id: Input[ID], state: GatewayAssociationState): typings.pulumiAws.gatewayAssociationMod.GatewayAssociation = js.native
  def get(name: String, id: Input[ID], state: GatewayAssociationState, opts: CustomResourceOptions): typings.pulumiAws.gatewayAssociationMod.GatewayAssociation = js.native
  /**
    * Returns true if the given object is an instance of GatewayAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gatewayAssociation.GatewayAssociation */ Boolean = js.native
}

