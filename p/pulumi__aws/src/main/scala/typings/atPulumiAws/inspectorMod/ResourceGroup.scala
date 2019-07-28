package typings.atPulumiAws.inspectorMod

import typings.atPulumiAws.inspectorResourceGroupMod.ResourceGroupArgs
import typings.atPulumiAws.inspectorResourceGroupMod.ResourceGroupState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/inspector", "ResourceGroup")
@js.native
class ResourceGroup protected ()
  extends typings.atPulumiAws.inspectorResourceGroupMod.ResourceGroup {
  /**
    * Create a ResourceGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ResourceGroupArgs) = this()
  def this(name: String, args: ResourceGroupArgs, opts: CustomResourceOptions) = this()
}

/* static members */
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.inspectorResourceGroupMod.ResourceGroup = js.native
  def get(name: String, id: Input[ID], state: ResourceGroupState): typings.atPulumiAws.inspectorResourceGroupMod.ResourceGroup = js.native
  def get(name: String, id: Input[ID], state: ResourceGroupState, opts: CustomResourceOptions): typings.atPulumiAws.inspectorResourceGroupMod.ResourceGroup = js.native
  /**
    * Returns true if the given object is an instance of ResourceGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/resourceGroup.ResourceGroup */ Boolean = js.native
}

