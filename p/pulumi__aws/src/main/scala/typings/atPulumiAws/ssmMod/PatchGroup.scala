package typings.atPulumiAws.ssmMod

import typings.atPulumiAws.ssmPatchGroupMod.PatchGroupArgs
import typings.atPulumiAws.ssmPatchGroupMod.PatchGroupState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm", "PatchGroup")
@js.native
class PatchGroup protected ()
  extends typings.atPulumiAws.ssmPatchGroupMod.PatchGroup {
  /**
    * Create a PatchGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PatchGroupArgs) = this()
  def this(name: String, args: PatchGroupArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ssm", "PatchGroup")
@js.native
object PatchGroup extends js.Object {
  /**
    * Get an existing PatchGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.ssmPatchGroupMod.PatchGroup = js.native
  def get(name: String, id: Input[ID], state: PatchGroupState): typings.atPulumiAws.ssmPatchGroupMod.PatchGroup = js.native
  def get(name: String, id: Input[ID], state: PatchGroupState, opts: CustomResourceOptions): typings.atPulumiAws.ssmPatchGroupMod.PatchGroup = js.native
  /**
    * Returns true if the given object is an instance of PatchGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/patchGroup.PatchGroup */ Boolean = js.native
}

