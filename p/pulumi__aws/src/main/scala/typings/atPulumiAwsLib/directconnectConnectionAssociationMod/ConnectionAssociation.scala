package typings
package atPulumiAwsLib.directconnectConnectionAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect/connectionAssociation", "ConnectionAssociation")
@js.native
class ConnectionAssociation protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a ConnectionAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ConnectionAssociationArgs) = this()
  def this(name: java.lang.String, args: ConnectionAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ID of the connection.
    */
  val connectionId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the LAG with which to associate the connection.
    */
  val lagId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
}

@JSImport("@pulumi/aws/directconnect/connectionAssociation", "ConnectionAssociation")
@js.native
object ConnectionAssociation extends js.Object {
  /**
    * Get an existing ConnectionAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectConnectionAssociationMod.ConnectionAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directconnectConnectionAssociationMod.ConnectionAssociationState
  ): atPulumiAwsLib.directconnectConnectionAssociationMod.ConnectionAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directconnectConnectionAssociationMod.ConnectionAssociationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.directconnectConnectionAssociationMod.ConnectionAssociation = js.native
}

