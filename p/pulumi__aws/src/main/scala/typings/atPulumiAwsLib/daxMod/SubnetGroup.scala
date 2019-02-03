package typings
package atPulumiAwsLib.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dax", "SubnetGroup")
@js.native
class SubnetGroup protected ()
  extends atPulumiAwsLib.daxSubnetGroupMod.SubnetGroup {
  /**
    * Create a SubnetGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.daxSubnetGroupMod.SubnetGroupArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.daxSubnetGroupMod.SubnetGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/dax", "SubnetGroup")
@js.native
object SubnetGroup extends js.Object {
  /**
    * Get an existing SubnetGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.daxSubnetGroupMod.SubnetGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.daxSubnetGroupMod.SubnetGroupState
  ): atPulumiAwsLib.daxSubnetGroupMod.SubnetGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.daxSubnetGroupMod.SubnetGroupState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.daxSubnetGroupMod.SubnetGroup = js.native
}

