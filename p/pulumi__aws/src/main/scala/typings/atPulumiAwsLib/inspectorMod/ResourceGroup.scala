package typings
package atPulumiAwsLib.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/inspector", "ResourceGroup")
@js.native
class ResourceGroup protected ()
  extends atPulumiAwsLib.inspectorResourceGroupMod.ResourceGroup {
  /**
    * Create a ResourceGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.inspectorResourceGroupMod.ResourceGroupArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.inspectorResourceGroupMod.ResourceGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

@JSImport("@pulumi/aws/inspector", "ResourceGroup")
@js.native
object ResourceGroup extends js.Object {
  /**
    * Get an existing ResourceGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.inspectorResourceGroupMod.ResourceGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.inspectorResourceGroupMod.ResourceGroupState
  ): atPulumiAwsLib.inspectorResourceGroupMod.ResourceGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.inspectorResourceGroupMod.ResourceGroupState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.inspectorResourceGroupMod.ResourceGroup = js.native
}

