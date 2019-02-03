package typings
package atPulumiAwsLib.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/route53", "ZoneAssociation")
@js.native
class ZoneAssociation protected ()
  extends atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociation {
  /**
    * Create a ZoneAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociationArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/route53", "ZoneAssociation")
@js.native
object ZoneAssociation extends js.Object {
  /**
    * Get an existing ZoneAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociationState
  ): atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociation = js.native
}

